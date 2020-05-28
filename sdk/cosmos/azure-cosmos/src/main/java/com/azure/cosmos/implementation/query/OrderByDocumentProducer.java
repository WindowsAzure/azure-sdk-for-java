// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.query;

import com.azure.core.http.HttpHeaders;
import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.implementation.*;
import com.azure.cosmos.models.FeedOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.implementation.query.orderbyquery.OrderByRowResult;
import com.azure.cosmos.implementation.query.orderbyquery.OrderbyRowComparer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Function;

class OrderByDocumentProducer<T extends Resource> extends DocumentProducer<T> {
    private final OrderbyRowComparer<T> consumeComparer;
    private final Map<String, OrderByContinuationToken> targetRangeToOrderByContinuationTokenMap;

    OrderByDocumentProducer(
            OrderbyRowComparer<T> consumeComparer,
            IDocumentQueryClient client,
            String collectionResourceId,
            FeedOptions feedOptions,
            TriFunction<PartitionKeyRange, String, Integer, RxDocumentServiceRequest> createRequestFunc,
            Function<RxDocumentServiceRequest, Mono<FeedResponse<T>>> executeRequestFunc,
            PartitionKeyRange targetRange,
            String collectionLink,
            Callable<DocumentClientRetryPolicy> createRetryPolicyFunc,
            Class<T> resourceType,
            UUID correlatedActivityId,
            int initialPageSize,
            String initialContinuationToken,
            int top,
            Map<String, OrderByContinuationToken> targetRangeToOrderByContinuationTokenMap) {
        super(client, collectionResourceId, feedOptions, createRequestFunc, executeRequestFunc, targetRange, collectionLink,
                createRetryPolicyFunc, resourceType, correlatedActivityId, initialPageSize, initialContinuationToken, top);
        this.consumeComparer = consumeComparer;
        this.targetRangeToOrderByContinuationTokenMap = targetRangeToOrderByContinuationTokenMap;
    }

    protected Flux<DocumentProducerFeedResponse> produceOnSplit(Flux<DocumentProducer<T>> replacementProducers) {
        return replacementProducers.collectList().flux().flatMap(documentProducers -> {
            RequestChargeTracker tracker = new RequestChargeTracker();
            Map<String, QueryMetrics> queryMetricsMap = new HashMap<>();
            return OrderByUtils.orderedMerge(resourceType, consumeComparer, tracker, documentProducers, queryMetricsMap,
                    targetRangeToOrderByContinuationTokenMap)
                    .map(orderByQueryResult -> resultPageFrom(tracker, orderByQueryResult));
        });
    }

    @SuppressWarnings("unchecked")
    private DocumentProducerFeedResponse resultPageFrom(RequestChargeTracker tracker, OrderByRowResult<T> row) {
        double requestCharge = tracker.getAndResetCharge();

        HttpHeaders httpHeaders = Utils.newHeadersWithRequestCharge(requestCharge);
        FeedResponse<T> fr = BridgeInternal.createFeedResponse(Collections.singletonList((T) row), httpHeaders);
        return new DocumentProducerFeedResponse(fr, row.getSourcePartitionKeyRange());
    }

    protected DocumentProducer<T> createChildDocumentProducerOnSplit(
            PartitionKeyRange targetRange,
            String initialContinuationToken) {

        return new OrderByDocumentProducer<>(
                consumeComparer,
                client,
                collectionRid,
                feedOptions,
                createRequestFunc,
                executeRequestFuncWithRetries,
                targetRange,
                collectionLink,
                createRetryPolicyFunc,
                resourceType ,
                correlatedActivityId,
                pageSize,
                initialContinuationToken,
                top,
                this.targetRangeToOrderByContinuationTokenMap);
    }

}
