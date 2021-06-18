// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.batch;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.BulkProcessingOptions;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosBridgeInternal;
import com.azure.cosmos.CosmosBulkItemResponse;
import com.azure.cosmos.CosmosBulkOperationResponse;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.CosmosItemOperation;
import com.azure.cosmos.ThrottlingRetryOptions;
import com.azure.cosmos.TransactionalBatchOperationResult;
import com.azure.cosmos.TransactionalBatchResponse;
import com.azure.cosmos.implementation.AsyncDocumentClient;
import com.azure.cosmos.implementation.CosmosDaemonThreadFactory;
import com.azure.cosmos.implementation.apachecommons.lang.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.GroupedFlux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.UnicastProcessor;
import reactor.core.scheduler.Schedulers;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

/**
 * The Core logic of bulk execution is here.
 *
 * The actual execution of the flux of operations. It is done in following steps:

 * 1. Getting partition key range ID and grouping operations using that id.
 * 2. For the flux of operations in a group, adding buffering based on size and a duration.
 * 3. For the operation we get in after buffering, process it using a batch request and return
 *    a wrapper having request, response(if-any) and exception(if-any). Either response or exception will be there.
 *
 * 4. Any internal retry is done by adding in an intermediate sink for each grouped flux.
 * 5. Any operation which failed due to partition key range gone is retried by putting it in the main sink which leads
 *    to re-calculation of partition key range id.
 * 6. At the end and this is very essential, we close all the sinks as the sink continues to waits for more and the
 *    execution isn't finished even if all the operations have been executed(figured out by completion call of source)
 *
 * Note: Sink will move to a new interface from 3.5 and this is documentation for it:
 *    - https://github.com/reactor/reactor-core/blob/master/docs/asciidoc/processors.adoc
 *
 *    For our use case, Sinks.many().unicast() will work.
 */
public final class BulkExecutor<TContext> {

    private final static Logger logger = LoggerFactory.getLogger(BulkExecutor.class);
    private final static AtomicLong instanceCount = new AtomicLong(0);

    private final CosmosAsyncContainer container;
    private final AsyncDocumentClient docClientWrapper;
    private final ThrottlingRetryOptions throttlingRetryOptions;
    private final Flux<CosmosItemOperation> inputOperations;

    // Options for bulk execution.
    private final Long maxMicroBatchIntervalInMs;
    private final TContext batchContext;
    private final ConcurrentMap<String, PartitionScopeThresholds<TContext>> partitionScopeThresholds;
    private final BulkProcessingOptions<TContext> bulkOptions;

    // Handle gone error:
    private final AtomicBoolean mainSourceCompleted;
    private final AtomicInteger totalCount;
    private final FluxProcessor<CosmosItemOperation, CosmosItemOperation> mainFluxProcessor;
    private final FluxSink<CosmosItemOperation> mainSink;
    private final List<FluxSink<CosmosItemOperation>> groupSinks;
    private final ScheduledExecutorService executorService =
        Executors.newSingleThreadScheduledExecutor(
            new CosmosDaemonThreadFactory("BulkExecutor-" + instanceCount.incrementAndGet()));

    public BulkExecutor(CosmosAsyncContainer container,
                        Flux<CosmosItemOperation> inputOperations,
                        BulkProcessingOptions<TContext> bulkOptions) {

        checkNotNull(container, "expected non-null container");
        checkNotNull(inputOperations, "expected non-null inputOperations");
        checkNotNull(bulkOptions, "expected non-null bulkOptions");

        this.bulkOptions = bulkOptions;
        this.container = container;
        this.inputOperations = inputOperations;
        this.docClientWrapper = CosmosBridgeInternal.getAsyncDocumentClient(container.getDatabase());
        this.throttlingRetryOptions = docClientWrapper.getConnectionPolicy().getThrottlingRetryOptions();

        // Fill the option first, to make the BulkProcessingOptions immutable, as if accessed directly, we might get
        // different values when a new group is created.
        maxMicroBatchIntervalInMs = bulkOptions.getMaxMicroBatchInterval().toMillis();
        batchContext = bulkOptions.getBatchContext();
        this.partitionScopeThresholds = BridgeInternal.getPartitionScopeThresholds(bulkOptions.getThresholds());

        // Initialize sink for handling gone error.
        mainSourceCompleted = new AtomicBoolean(false);
        totalCount = new AtomicInteger(0);
        mainFluxProcessor = UnicastProcessor.<CosmosItemOperation>create().serialize();
        mainSink = mainFluxProcessor.sink(FluxSink.OverflowStrategy.BUFFER);
        groupSinks = new ArrayList<>();
    }

    public Flux<CosmosBulkOperationResponse<TContext>> execute() {

        return this.inputOperations
            .onErrorContinue((throwable, o) ->
                logger.error("Skipping an error operation while processing {}. Cause: {}", o, throwable.getMessage()))
            .doOnNext((CosmosItemOperation cosmosItemOperation) -> {

                // Set the retry policy before starting execution. Should only happens once.
                BulkExecutorUtil.setRetryPolicyForBulk(
                    docClientWrapper,
                    this.container,
                    cosmosItemOperation,
                    this.throttlingRetryOptions);

                totalCount.incrementAndGet();
            })
            .doOnComplete(() -> {
                mainSourceCompleted.set(true);

                long totalCountSnapshot = totalCount.get();
                logger.debug("Main source completed - # left items " + totalCountSnapshot);
                if (totalCountSnapshot == 0) {
                    // This is needed as there can be case that onComplete was called after last element was processed
                    // So complete the sink here also if count is 0, if source has completed and count isn't zero,
                    // then the last element in the doOnNext will close it. Sink doesn't mind in case of a double close.

                    completeAllSinks();
                } else {
                    // The evaluation whether a micro batch should be flushed to the backend happens whenever
                    // a new ItemOperation arrives. If the batch size is exceeded or the oldest buffered ItemOperation
                    // exceeds the MicroBatchInterval, the micro batch gets flushed to the backend.
                    // So when the input Flux of ItemOperations gets closed this evaluation wouldn't happen anymore
                    // and buffered ItemOperations would be stuck in the buffer.
                    // To avoid this we start a timer on closure of the input Flux that will trigger artificial
                    // ItemOperations that are only used to flush the buffers (and will be filtered out before sending
                    // requests to the backend)
                    executorService.scheduleWithFixedDelay(
                        () -> this.onFlush(),
                        0,
                        this.maxMicroBatchIntervalInMs,
                        TimeUnit.MILLISECONDS);
                }
            })
            .mergeWith(mainFluxProcessor)
            .flatMap(operation -> {

                // resolve partition key range id again for operations which comes in main sink due to gone retry.
                return BulkExecutorUtil.resolvePartitionKeyRangeId(this.docClientWrapper, this.container, operation)
                    .map((String pkRangeId) -> {
                        PartitionScopeThresholds<TContext> partitionScopeThresholds =
                            this.partitionScopeThresholds.computeIfAbsent(
                                pkRangeId,
                                (newPkRangeId) -> new PartitionScopeThresholds<>(newPkRangeId, this.bulkOptions));
                        return Pair.of(partitionScopeThresholds, operation);
                    });
            })
            .groupBy(Pair::getKey, Pair::getValue)
            .flatMap(this::executePartitionedGroup)
            .doOnNext(requestAndResponse -> {

                if (totalCount.decrementAndGet() == 0 && mainSourceCompleted.get()) {
                    // It is possible that count is zero but there are more elements in the source.
                    // Count 0 also signifies that there are no pending elements in any sink.

                    completeAllSinks();
                }
            });
    }

    private Flux<CosmosBulkOperationResponse<TContext>> executePartitionedGroup(
        GroupedFlux<PartitionScopeThresholds<TContext>, CosmosItemOperation> partitionedGroupFluxOfInputOperations) {

        final PartitionScopeThresholds<TContext> thresholds = partitionedGroupFluxOfInputOperations.key();

        final FluxProcessor<CosmosItemOperation, CosmosItemOperation> groupFluxProcessor =
            UnicastProcessor.<CosmosItemOperation>create().serialize();
        final FluxSink<CosmosItemOperation> groupSink = groupFluxProcessor.sink(FluxSink.OverflowStrategy.BUFFER);
        groupSinks.add(groupSink);

        AtomicLong firstRecordTimeStamp = new AtomicLong(-1);
        AtomicLong currentMicroBatchSize = new AtomicLong(0);

        return partitionedGroupFluxOfInputOperations
            .mergeWith(groupFluxProcessor)
            .onBackpressureBuffer()
            .timestamp()
            .bufferUntil(timeStampItemOperationTuple -> {
                long timestamp = timeStampItemOperationTuple.getT1();
                CosmosItemOperation itemOperation = timeStampItemOperationTuple.getT2();

                if (itemOperation instanceof FlushBuffersItemOperation) {
                    logger.debug("Flushing PKRange {} due to FlushItemOperation", thresholds.getPartitionKeyRangeId());

                    if (currentMicroBatchSize.get() > 0) {
                        firstRecordTimeStamp.set(-1);
                        currentMicroBatchSize.set(0);
                        return true;
                    } else {
                        // we don't want to include flush operations in the count to avoid
                        // ever trying to flush batch request without any operation to the backend
                        // which would result in a 400 - Bad Request (with SubStatusCode 0)
                        return false;
                    }
                }

                firstRecordTimeStamp.compareAndSet(-1, timestamp);
                long age = timestamp - firstRecordTimeStamp.get();
                long batchSize = currentMicroBatchSize.incrementAndGet();
                if (batchSize >= thresholds.getTargetMicroBatchSizeSnapshot() ||
                    age >=  this.maxMicroBatchIntervalInMs) {

                    firstRecordTimeStamp.set(-1);
                    currentMicroBatchSize.set(0);
                    return true;
                }
                return false;
            })
            .flatMap(
                (List<Tuple2<Long, CosmosItemOperation>> timeStampAndItemOperationTuples) -> {
                    List<CosmosItemOperation> operations = new ArrayList<>(timeStampAndItemOperationTuples.size());
                    for (Tuple2<Long, CosmosItemOperation> timeStampAndItemOperationTuple :
                        timeStampAndItemOperationTuples) {

                        CosmosItemOperation itemOperation = timeStampAndItemOperationTuple.getT2();
                        if (itemOperation instanceof FlushBuffersItemOperation) {
                            continue;
                        }
                        operations.add(itemOperation);
                    }

                    return executeOperations(operations, thresholds, groupSink);
                },
                this.bulkOptions.getMaxMicroBatchConcurrency());
    }

    private Flux<CosmosBulkOperationResponse<TContext>> executeOperations(
        List<CosmosItemOperation> operations,
        PartitionScopeThresholds<TContext> thresholds,
        FluxSink<CosmosItemOperation> groupSink) {

        String pkRange = thresholds.getPartitionKeyRangeId();
        ServerOperationBatchRequest serverOperationBatchRequest = BulkExecutorUtil.createBatchRequest(operations, pkRange);
        if (serverOperationBatchRequest.getBatchPendingOperations().size() > 0) {
            serverOperationBatchRequest.getBatchPendingOperations().forEach(groupSink::next);
        }

        return Flux.just(serverOperationBatchRequest.getBatchRequest())
            .publishOn(Schedulers.boundedElastic())
            .flatMap((PartitionKeyRangeServerBatchRequest serverRequest) -> this.executePartitionKeyRangeServerBatchRequest(serverRequest, groupSink, thresholds));
    }

    private Flux<CosmosBulkOperationResponse<TContext>> executePartitionKeyRangeServerBatchRequest(
        PartitionKeyRangeServerBatchRequest serverRequest,
        FluxSink<CosmosItemOperation> groupSink,
        PartitionScopeThresholds<TContext> thresholds) {

        return this.executeBatchRequest(serverRequest)
            .flatMapMany(response ->
                Flux.fromIterable(response.getResults()).flatMap((TransactionalBatchOperationResult result) ->
                    handleTransactionalBatchOperationResult(response, result, groupSink, thresholds)))
            .onErrorResume((Throwable throwable) -> {

                if (!(throwable instanceof Exception)) {
                    throw Exceptions.propagate(throwable);
                }

                Exception exception = (Exception) throwable;

                return Flux.fromIterable(serverRequest.getOperations()).flatMap((CosmosItemOperation itemOperation) ->
                    handleTransactionalBatchExecutionException(itemOperation, exception, groupSink, thresholds));
            });
    }

    // Helper functions
    private Mono<CosmosBulkOperationResponse<TContext>> handleTransactionalBatchOperationResult(
        TransactionalBatchResponse response,
        TransactionalBatchOperationResult operationResult,
        FluxSink<CosmosItemOperation> groupSink,
        PartitionScopeThresholds<TContext> thresholds) {

        CosmosBulkItemResponse cosmosBulkItemResponse = BridgeInternal.createCosmosBulkItemResponse(operationResult, response);
        CosmosItemOperation itemOperation = operationResult.getOperation();

        if (!operationResult.isSuccessStatusCode()) {

            if (itemOperation instanceof ItemBulkOperation<?>) {

                return ((ItemBulkOperation<?>) itemOperation).getRetryPolicy().shouldRetry(operationResult).flatMap(
                    result -> {
                        if (result.shouldRetry) {
                            return this.enqueueForRetry(result.backOffTime, groupSink, itemOperation, thresholds);
                        } else {
                            return Mono.just(BridgeInternal.createCosmosBulkOperationResponse(
                                itemOperation, cosmosBulkItemResponse, this.batchContext));
                        }
                    });

            } else {
                throw new UnsupportedOperationException("Unknown CosmosItemOperation.");
            }
        }

        thresholds.recordSuccessfulOperation();
        return Mono.just(BridgeInternal.createCosmosBulkOperationResponse(
            itemOperation,
            cosmosBulkItemResponse,
            this.batchContext));
    }

    private Mono<CosmosBulkOperationResponse<TContext>> handleTransactionalBatchExecutionException(
        CosmosItemOperation itemOperation,
        Exception exception,
        FluxSink<CosmosItemOperation> groupSink,
        PartitionScopeThresholds<TContext> thresholds) {

        if (exception instanceof CosmosException && itemOperation instanceof ItemBulkOperation<?>) {
            CosmosException cosmosException = (CosmosException) exception;
            ItemBulkOperation<?> itemBulkOperation = (ItemBulkOperation<?>) itemOperation;

            // First check if it failed due to split, so the operations need to go in a different pk range group. So
            // add it in the mainSink.

            return itemBulkOperation.getRetryPolicy()
                .shouldRetryForGone(cosmosException.getStatusCode(), cosmosException.getSubStatusCode())
                .flatMap(shouldRetryGone -> {
                    if (shouldRetryGone) {
                        // retry - but don't mark as enqueued for retry in thresholds
                        mainSink.next(itemOperation);
                        return Mono.empty();
                    } else {
                        return retryOtherExceptions(
                            itemOperation,
                            exception,
                            groupSink,
                            cosmosException,
                            itemBulkOperation,
                            thresholds);
                    }
                });
        }

        return Mono.just(BridgeInternal.createCosmosBulkOperationResponse(itemOperation, exception, this.batchContext));
    }

    private Mono<CosmosBulkOperationResponse<TContext>> enqueueForRetry(
        Duration backOffTime,
        FluxSink<CosmosItemOperation> groupSink,
        CosmosItemOperation itemOperation,
        PartitionScopeThresholds<TContext> thresholds) {

        thresholds.recordEnqueuedRetry();
        if (backOffTime == null || backOffTime.isZero()) {
            groupSink.next(itemOperation);
            return Mono.empty();
        } else {
            return Mono
                .delay(backOffTime)
                .flatMap((dumm) -> {
                    groupSink.next(itemOperation);
                    return Mono.empty();
                });
        }
    }

    private Mono<CosmosBulkOperationResponse<TContext>> retryOtherExceptions(
        CosmosItemOperation itemOperation,
        Exception exception,
        FluxSink<CosmosItemOperation> groupSink,
        CosmosException cosmosException,
        ItemBulkOperation<?> itemBulkOperation,
        PartitionScopeThresholds<TContext> thresholds) {

        return itemBulkOperation.getRetryPolicy().shouldRetry(cosmosException).flatMap(result -> {
            if (result.shouldRetry) {
                return this.enqueueForRetry(result.backOffTime, groupSink, itemBulkOperation, thresholds);
            } else {
                return Mono.just(BridgeInternal.createCosmosBulkOperationResponse(
                    itemOperation, exception, this.batchContext));
            }
        });
    }

    private Mono<TransactionalBatchResponse> executeBatchRequest(PartitionKeyRangeServerBatchRequest serverRequest) {
        return this.docClientWrapper.executeBatchRequest(
            BridgeInternal.getLink(this.container), serverRequest, null, false);
    }

    private void completeAllSinks() {
        logger.info("Closing all sinks");

        executorService.shutdown();
        mainSink.complete();
        groupSinks.forEach(FluxSink::complete);
    }

    private void onFlush() {
        this.groupSinks.forEach(sink -> sink.next(new FlushBuffersItemOperation()));
    }
}
