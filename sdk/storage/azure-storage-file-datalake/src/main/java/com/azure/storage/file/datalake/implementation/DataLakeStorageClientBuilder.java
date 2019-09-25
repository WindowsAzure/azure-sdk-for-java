// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.ServiceClientBuilder;

/**
 * A builder for creating a new instance of the DataLakeStorageClient type.
 */
@ServiceClientBuilder(serviceClients = DataLakeStorageClientImpl.class)
public final class DataLakeStorageClientBuilder {
    /*
     * Specifies the version of the REST protocol used for processing the request. This is required when using shared key authorization.
     */
    private String xMsVersion;

    /**
     * Sets Specifies the version of the REST protocol used for processing the request. This is required when using shared key authorization.
     *
     * @param xMsVersion the xMsVersion value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder xMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /*
     * The Azure Storage account name.
     */
    private String accountName;

    /**
     * Sets The Azure Storage account name.
     *
     * @param accountName the accountName value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /*
     * The DNS suffix for the Azure Data Lake Storage endpoint.
     */
    private String dnsSuffix;

    /**
     * Sets The DNS suffix for the Azure Data Lake Storage endpoint.
     *
     * @param dnsSuffix the dnsSuffix value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder dnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
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
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of DataLakeStorageClientImpl with the provided parameters.
     *
     * @return an instance of DataLakeStorageClientImpl.
     */
    public DataLakeStorageClientImpl build() {
        if (dnsSuffix == null) {
            this.dnsSuffix = "dfs.core.windows.net";
        }
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        DataLakeStorageClientImpl client = new DataLakeStorageClientImpl(pipeline);
        if (this.xMsVersion != null) {
            client.setXMsVersion(this.xMsVersion);
        }
        if (this.accountName != null) {
            client.setAccountName(this.accountName);
        }
        if (this.dnsSuffix != null) {
            client.setDnsSuffix(this.dnsSuffix);
        }
        return client;
    }
}
