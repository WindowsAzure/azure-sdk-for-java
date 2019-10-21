// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;

/**
 * A builder for creating a new instance of the AzureQueueStorage type.
 */
@ServiceClientBuilder(serviceClients = AzureQueueStorageImpl.class)
public final class AzureQueueStorageBuilder {
    /*
     * The URL of the service account, queue or message that is the targe of the desired operation.
     */
    private String url;

    /**
     * Sets The URL of the service account, queue or message that is the targe of the desired operation.
     *
     * @param url the url value.
     * @return the AzureQueueStorageBuilder.
     */
    public AzureQueueStorageBuilder url(String url) {
        this.url = url;
        return this;
    }

    /*
     * Specifies the version of the operation to use for this request.
     */
    private String version;

    /**
     * Sets Specifies the version of the operation to use for this request.
     *
     * @param version the version value.
     * @return the AzureQueueStorageBuilder.
     */
    public AzureQueueStorageBuilder version(String version) {
        this.version = version;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AzureQueueStorageBuilder.
     */
    public AzureQueueStorageBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AzureQueueStorageImpl with the provided parameters.
     *
     * @return an instance of AzureQueueStorageImpl.
     */
    public AzureQueueStorageImpl build() {
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        AzureQueueStorageImpl client = new AzureQueueStorageImpl(pipeline);
        if (this.url != null) {
            client.setUrl(this.url);
        }
        client.setVersion(this.version);
        return client;
    }
}
