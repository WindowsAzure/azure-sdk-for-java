// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.storage.blob.BlobServiceAsyncClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceVersion;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of
 * {@link BlobChangefeedClient BlobChangefeedClients} and {@link BlobChangefeedAsyncClient BlobChangefeedAsyncClients}
 * when {@link #buildClient() buildClient} and {@link #buildAsyncClient() buildAsyncClient} are called respectively.
 */
@ServiceClientBuilder(serviceClients = {BlobChangefeedClient.class, BlobChangefeedAsyncClient.class})
public final class BlobChangefeedClientBuilder {
    private final String accountUrl;
    private final HttpPipeline pipeline;
    private final BlobServiceVersion version;

    /**
     * Constructs the {@link BlobChangefeedClientBuilder} from the URL and pipeline of the {@link BlobServiceClient}.
     *
     * @param client {@link BlobServiceClient} whose properties are used to configure the builder.
     */
    public BlobChangefeedClientBuilder(BlobServiceClient client) {
        this.accountUrl = client.getAccountUrl();
        this.pipeline = client.getHttpPipeline();
        this.version = client.getServiceVersion();
    }

    /**
     * Constructs the {@link BlobChangefeedClientBuilder} from from the URL and pipeline of the
     * {@link BlobServiceAsyncClient}.
     *
     * @param client {@link BlobServiceClient} whose properties are used to configure the builder.
     */
    public BlobChangefeedClientBuilder(BlobServiceAsyncClient client) {
        this.accountUrl = client.getAccountUrl();
        this.pipeline = client.getHttpPipeline();
        this.version = client.getServiceVersion();
    }

    /**
     * Creates a {@link BlobChangefeedClient}.
     *
     * <p><strong>Code sample</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.changefeed.BlobChangefeedClientBuilder#buildClient}
     *
     * @return a {@link BlobChangefeedClient} created from the configurations in this builder.
     */
    public BlobChangefeedClient buildClient() {
        return new BlobChangefeedClient(buildAsyncClient());
    }

    /**
     * Creates a {@link BlobChangefeedAsyncClient}.
     *
     * <p><strong>Code sample</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.changefeed.BlobChangefeedClientBuilder#buildAsyncClient}
     *
     * @return a {@link BlobChangefeedAsyncClient} created from the configurations in this builder.
     */
    public BlobChangefeedAsyncClient buildAsyncClient() {
        BlobServiceVersion serviceVersion = version != null ? version : BlobServiceVersion.getLatest();
        return new BlobChangefeedAsyncClient(accountUrl, pipeline, serviceVersion);
    }
}
