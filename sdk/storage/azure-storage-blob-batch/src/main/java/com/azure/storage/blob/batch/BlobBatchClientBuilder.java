// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.batch;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.CoreUtils;
import com.azure.storage.blob.BlobServiceAsyncClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceVersion;
import com.azure.storage.blob.implementation.util.BlobUserAgentModificationPolicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of {@link BlobBatchClient
 * BlobBatchClients} and {@link BlobBatchAsyncClient BlobBatchAsyncClients} when {@link #buildClient() buildClient} and
 * {@link #buildAsyncClient() buildAsyncClient} as called respectively.
 */
@ServiceClientBuilder(serviceClients = {BlobBatchClient.class, BlobBatchAsyncClient.class})
public final class BlobBatchClientBuilder {

    private static final Map<String, String> PROPERTIES =
        CoreUtils.getProperties("azure-storage-blob-batch.properties");
    private static final String SDK_NAME = "name";
    private static final String SDK_VERSION = "version";

    private final String accountUrl;
    private final HttpPipeline pipeline;
    private final BlobServiceVersion version;

    /**
     * Constructs the {@link BlobBatchClientBuilder} using the {@link BlobServiceClient#getAccountUrl() account URL} and
     * {@link BlobServiceClient#getHttpPipeline() HttpPipeline} properties of the passed {@link BlobServiceClient}.
     *
     * @param client {@link BlobServiceClient} whose properties are used to configure the builder.
     */
    public BlobBatchClientBuilder(BlobServiceClient client) {
        this.accountUrl = client.getAccountUrl();
        this.pipeline = addBlobUserAgentModificationPolicy(client.getHttpPipeline());
        this.version = client.getServiceVersion();
    }

    /**
     * Constructs the {@link BlobBatchClientBuilder} using the {@link BlobServiceAsyncClient#getAccountUrl() account
     * URL} and {@link BlobServiceAsyncClient#getHttpPipeline() HttpPipeline} properties of the passed {@link
     * BlobServiceAsyncClient}.
     *
     * @param client {@link BlobServiceClient} whose properties are used to configure the builder.
     */
    public BlobBatchClientBuilder(BlobServiceAsyncClient client) {
        this.accountUrl = client.getAccountUrl();
        this.pipeline = addBlobUserAgentModificationPolicy(client.getHttpPipeline());
        this.version = client.getServiceVersion();
    }

    private HttpPipeline addBlobUserAgentModificationPolicy(HttpPipeline pipeline) {
        List<HttpPipelinePolicy> policies = new ArrayList<>();

        for (int i = 0; i < pipeline.getPolicyCount(); i++) {
            HttpPipelinePolicy currPolicy = pipeline.getPolicy(i);
            policies.add(currPolicy);
            if (currPolicy instanceof UserAgentPolicy) {
                String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
                String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");

                policies.add(new BlobUserAgentModificationPolicy(clientName, clientVersion));
            }
        }

        return new HttpPipelineBuilder()
            .httpClient(pipeline.getHttpClient())
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .build();
    }

    /**
     * Creates a {@link BlobBatchClient} based on options set in the builder.
     *
     * <p><strong>Code sample</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.batch.BlobBatchClientBuilder#buildClient}
     *
     * @return a {@link BlobBatchClient} created from the configurations in this builder.
     */
    public BlobBatchClient buildClient() {
        return new BlobBatchClient(buildAsyncClient());
    }

    /**
     * Creates a {@link BlobBatchAsyncClient} based on options set in the builder.
     *
     * <p><strong>Code sample</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.batch.BlobBatchClientBuilder#buildAsyncClient}
     *
     * @return a {@link BlobBatchAsyncClient} created from the configurations in this builder.
     */
    public BlobBatchAsyncClient buildAsyncClient() {
        BlobServiceVersion serviceVersion = version != null ? version : BlobServiceVersion.getLatest();
        return new BlobBatchAsyncClient(accountUrl, pipeline, serviceVersion);
    }
}
