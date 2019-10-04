// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.implementation.util.ImplUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlobAccessConditions;
import com.azure.storage.blob.models.DeleteSnapshotsOptionType;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.specialized.BlobAsyncClientBase;
import com.azure.storage.common.Constants;
import com.azure.storage.common.policy.RequestRetryPolicy;
import com.azure.storage.common.policy.SharedKeyCredentialPolicy;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.context.Context;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * This class provides
 */
public final class BlobBatch {
    private static final String BATCH_REQUEST_CONTENT_ID = "Batch-Request-Content-Id";
    private static final String CONTENT_ID = "Content-Id";
    private static final String BATCH_BOUNDARY_TEMPLATE = "batch_%s";
    private static final String CONTENT_TYPE = "Content-Type: application/http";
    private static final String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding: binary";
    private static final String CONTENT_ID_TEMPLATE = "Content-ID: %d";
    private static final String HTTP_VERSION = "HTTP/1.1";
    private static final String OPERATION_TEMPLATE = "%s %s %s";
    private static final String HEADER_TEMPLATE = "%s: %s";

    private static final int[] EXPECTED_DELETE_STATUS_CODES = { 202 };
    private static final int[] EXPECTED_SET_TIER_STATUS_CODES = { 200, 202 };

    private final ClientLogger logger = new ClientLogger(BlobBatch.class);

    private final String accountUrl;
    private final HttpPipeline batchPipeline;

    private final Deque<Mono<? extends Response>> batchOperationQueue;
    private final List<ByteBuffer> batchRequest;
    private final Map<Integer, BlobBatchOperationResponse> batchMapping;

    private final AtomicInteger contentId;
    private final String batchBoundary;

    private BlobBatchType batchType;

    public BlobBatch(BlobServiceClient client) {
        this(client.getAccountUrl(), client.getHttpPipeline());
    }

    public BlobBatch(BlobServiceAsyncClient client) {
        this(client.getAccountUrl(), client.getHttpPipeline());
    }

    BlobBatch(String accountUrl, HttpPipeline pipeline) {
        this.contentId = new AtomicInteger(0);
        this.batchBoundary = String.format(BATCH_BOUNDARY_TEMPLATE, UUID.randomUUID());

        this.accountUrl = accountUrl;

        boolean batchHeadersPolicySet = false;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        for (int i = 0; i < pipeline.getPolicyCount(); i++) {
            HttpPipelinePolicy policy = pipeline.getPolicy(i);

            // Don't want these policies in the dummy pipeline.
            if (policy instanceof HttpLoggingPolicy
                || policy instanceof RetryPolicy
                || policy instanceof RequestRetryPolicy
                || policy instanceof UserAgentPolicy) {
                continue;
            }

            if (policy instanceof SharedKeyCredentialPolicy) {
                batchHeadersPolicySet = true;
                // The batch policy needs to be added before the SharedKey policy to run preparation cleanup.
                policies.add(new BatchHeadersPolicy());
            }

            policies.add(pipeline.getPolicy(i));
        }

        if (!batchHeadersPolicySet) {
            policies.add(new BatchHeadersPolicy());
        }

        this.batchPipeline = new HttpPipelineBuilder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(new BatchClient(this::sendCallback))
            .build();

        this.batchOperationQueue = new ConcurrentLinkedDeque<>();
        this.batchRequest = new ArrayList<>();
        this.batchMapping = new ConcurrentHashMap<>();
    }

    /**
     * Adds a delete blob operation to the batch.
     *
     * @param containerName The container of the blob.
     * @param blobName The name of the blob.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> delete(String containerName, String blobName) {
        return deleteHelper(buildClient(containerName, blobName), null, null);
    }

    /**
     * Adds a delete blob operation to the batch.
     *
     * @param containerName The container of the blob.
     * @param blobName The name of the blob.
     * @param deleteOptions Delete options for the blob and its snapshots.
     * @param blobAccessConditions Additional access conditions that must be met to allow this operation.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> delete(String containerName, String blobName,
        DeleteSnapshotsOptionType deleteOptions, BlobAccessConditions blobAccessConditions) {
        return deleteHelper(buildClient(containerName, blobName), deleteOptions, blobAccessConditions);
    }

    /**
     * Adds a delete blob operation to the batch.
     *
     * @param blobUrl URI of the blob.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> delete(String blobUrl) {
        return deleteHelper(buildClient(blobUrl), null, null);
    }

    /**
     * Adds a delete blob operation to the batch.
     *
     * @param blobUrl URI of the blob.
     * @param deleteOptions Delete options for the blob and its snapshots.
     * @param blobAccessConditions Additional access conditions that must be met to allow this operation.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> delete(String blobUrl, DeleteSnapshotsOptionType deleteOptions,
        BlobAccessConditions blobAccessConditions) {
        return deleteHelper(buildClient(blobUrl), deleteOptions, blobAccessConditions);
    }

    private Response<Void> deleteHelper(BlobAsyncClientBase client, DeleteSnapshotsOptionType deleteOptions,
        BlobAccessConditions blobAccessConditions) {
        if (this.batchType == null) {
            this.batchType = BlobBatchType.DELETE;
        } else if (this.batchType != BlobBatchType.DELETE) {
            throw logger.logExceptionAsError(new UnsupportedOperationException(String.format(Locale.ROOT,
                "'BlobBatch' only supports homogeneous operations and is a %s batch.", this.batchType)));
        }

        return createAndReturnBatchOperation(client.deleteWithResponse(deleteOptions, blobAccessConditions),
            EXPECTED_DELETE_STATUS_CODES);
    }

    /**
     * Adds a set tier operation to the batch.
     *
     * @param containerName The container of the blob.
     * @param blobName The name of the blob.
     * @param accessTier The tier to set on the blob.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> setTier(String containerName, String blobName, AccessTier accessTier) {
        return setTierHelper(buildClient(containerName, blobName), accessTier, null);
    }

    /**
     * Adds a set tier operation to the batch.
     *
     * @param containerName The container of the blob.
     * @param blobName The name of the blob.
     * @param accessTier The tier to set on the blob.
     * @param leaseAccessConditions Lease access conditions that must be met to allow this operation.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> setTier(String containerName, String blobName, AccessTier accessTier,
        LeaseAccessConditions leaseAccessConditions) {
        return setTierHelper(buildClient(containerName, blobName), accessTier, leaseAccessConditions);
    }

    /**
     * Adds a set tier operation to the batch.
     *
     * @param blobUrl URI of the blob.
     * @param accessTier The tier to set on the blob.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> setTier(String blobUrl, AccessTier accessTier) {
        return setTierHelper(buildClient(blobUrl), accessTier, null);
    }

    /**
     * Adds a set tier operation to the batch.
     *
     * @param blobUrl URI of the blob.
     * @param accessTier The tier to set on the blob.
     * @param leaseAccessConditions Lease access conditions that must be met to allow this operation.
     * @return a {@link Response} that will be used to associate this operation to the response when the batch is
     * submitted.
     * @throws UnsupportedOperationException If this batch has already added an operation of another type.
     */
    public Response<Void> setTier(String blobUrl, AccessTier accessTier, LeaseAccessConditions leaseAccessConditions) {
        return setTierHelper(buildClient(blobUrl), accessTier, leaseAccessConditions);
    }

    private Response<Void> setTierHelper(BlobAsyncClientBase client, AccessTier accessTier,
        LeaseAccessConditions leaseAccessConditions) {
        if (this.batchType == null) {
            this.batchType = BlobBatchType.SET_TIER;
        } else if (this.batchType != BlobBatchType.SET_TIER) {
            throw logger.logExceptionAsError(new UnsupportedOperationException(String.format(Locale.ROOT,
                "'BlobBatch' only supports homogeneous operations and is a %s batch.", this.batchType)));
        }

        return createAndReturnBatchOperation(client.setAccessTierWithResponse(accessTier, null, leaseAccessConditions),
            EXPECTED_SET_TIER_STATUS_CODES);
    }

    private <T> Response<T> createAndReturnBatchOperation(Mono<Response<T>> response, int... expectedStatusCodes) {
        int contentId = this.contentId.getAndIncrement();
        this.batchOperationQueue.add(response.subscriberContext(Context.of(BATCH_REQUEST_CONTENT_ID, contentId)));

        BlobBatchOperationResponse<T> batchOperationResponse = new BlobBatchOperationResponse<>(expectedStatusCodes);
        this.batchMapping.put(contentId, batchOperationResponse);
        return batchOperationResponse;
    }

    private BlobAsyncClientBase buildClient(String containerName, String blobName) {
        return new BlobClientBuilder()
            .endpoint(accountUrl)
            .containerName(containerName)
            .blobName(blobName)
            .pipeline(batchPipeline)
            .buildAsyncClient();
    }

    private BlobAsyncClientBase buildClient(String blobUrl) {
        return new BlobClientBuilder()
            .endpoint(blobUrl)
            .pipeline(batchPipeline)
            .buildAsyncClient();
    }

    private void sendCallback(HttpRequest request) {
        HttpHeaders headers = request.getHeaders();
        int contentId = Integer.parseInt(headers.getValue(CONTENT_ID));

        StringBuilder batchRequestBuilder = new StringBuilder();
        appendWithNewline(batchRequestBuilder, "--" + batchBoundary);
        appendWithNewline(batchRequestBuilder, CONTENT_TYPE);
        appendWithNewline(batchRequestBuilder, CONTENT_TRANSFER_ENCODING);
        appendWithNewline(batchRequestBuilder, String.format(CONTENT_ID_TEMPLATE, contentId));
        batchRequestBuilder.append("\r\n");

        String method = request.getHttpMethod().toString();
        String urlPath = request.getUrl().getPath();
        String urlQuery = request.getUrl().getQuery();
        if (!ImplUtils.isNullOrEmpty(urlQuery)) {
            urlPath = urlPath + "?" + urlQuery;
        }
        appendWithNewline(batchRequestBuilder, String.format(OPERATION_TEMPLATE, method, urlPath, HTTP_VERSION));

        headers.stream().filter(header -> Constants.HeaderConstants.VERSION.equalsIgnoreCase(header.getName()))
            .forEach(header -> appendWithNewline(batchRequestBuilder,
                String.format(HEADER_TEMPLATE, header.getName(), header.getValue())));

        batchRequestBuilder.append("\r\n");

        batchRequest.add(ByteBuffer.wrap(batchRequestBuilder.toString().getBytes(StandardCharsets.UTF_8)));

        this.batchMapping.get(contentId).setRequest(request);
    }

    private void appendWithNewline(StringBuilder stringBuilder, String value) {
        stringBuilder.append(value).append("\r\n");
    }

    Flux<ByteBuffer> getBody() {
        while (!batchOperationQueue.isEmpty()) {
            Mono<? extends Response> batchOperation = batchOperationQueue.pop();
            Disposable disposable = batchOperation.subscribe();
            while (!disposable.isDisposed()) {
                // Wait until the batch operation has processed in the pipeline.
                // This is used as opposed to block as it won't trigger an exception if ran in a Reactor thread.
            }
        }

        this.batchRequest.add(ByteBuffer
            .wrap(String.format("--%s--\r\n", batchBoundary).getBytes(StandardCharsets.UTF_8)));

        return Flux.fromIterable(this.batchRequest);
    }

    long getContentLength() {
        long contentLength = 0;

        for (ByteBuffer request : batchRequest) {
            contentLength += request.remaining();
        }

        return contentLength;
    }

    String getContentType() {
        return String.format("multipart/mixed; boundary=%s", batchBoundary);
    }

    BlobBatchOperationResponse getBatchRequest(int contentId) {
        return this.batchMapping.get(contentId);
    }

    private enum BlobBatchType {
        DELETE,
        SET_TIER
    }

    private static class BatchClient implements HttpClient {
        private final Consumer<HttpRequest> sendCallback;

        BatchClient(Consumer<HttpRequest> sendCallback) {
            this.sendCallback = sendCallback;
        }

        @Override
        public Mono<HttpResponse> send(HttpRequest request) {
            sendCallback.accept(request);
            return Mono.empty();
        }
    }

    private static class BatchHeadersPolicy implements HttpPipelinePolicy {
        @Override
        public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
            Map<String, String> headers = context.getHttpRequest().getHeaders().toMap();
            headers.remove(Constants.HeaderConstants.VERSION);
            headers.entrySet().removeIf(header -> header.getValue() == null);

            context.getHttpRequest().setHeaders(new HttpHeaders(headers));
            context.getHttpRequest().setHeader(CONTENT_ID, context.getData(BATCH_REQUEST_CONTENT_ID).get().toString());
            return next.process();
        }
    }
}
