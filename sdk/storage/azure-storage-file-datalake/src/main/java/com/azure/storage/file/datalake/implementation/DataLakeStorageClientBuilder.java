// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/**
 * A builder for creating a new instance of the DataLakeStorageClient type.
 */
@ServiceClientBuilder(serviceClients = DataLakeStorageClientImpl.class)
public final class DataLakeStorageClientBuilder {
    /*
     * The URL of the service account, container, or blob that is the targe of the desired operation.
     */
    private String url;

    /**
     * Sets The URL of the service account, container, or blob that is the targe of the desired operation.
     *
     * @param url the url value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder url(String url) {
        this.url = url;
        return this;
    }

    /*
     * The value must be "filesystem" for all filesystem operations.
     */
    private String resource;

    /**
     * Sets The value must be "filesystem" for all filesystem operations.
     *
     * @param resource the resource value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder resource(String resource) {
        this.resource = resource;
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
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder version(String version) {
        this.version = version;
        return this;
    }

    /*
     * The filesystem identifier.
     */
    private String fileSystem;

    /**
     * Sets The filesystem identifier.
     *
     * @param fileSystem the fileSystem value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder fileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /*
     * The file or directory path.
     */
    private String path1;

    /**
     * Sets The file or directory path.
     *
     * @param path1 the path1 value.
     * @return the DataLakeStorageClientBuilder.
     */
    public DataLakeStorageClientBuilder path1(String path1) {
        this.path1 = path1;
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
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        DataLakeStorageClientImpl client = new DataLakeStorageClientImpl(pipeline);
        if (this.url != null) {
            client.setUrl(this.url);
        }
        if (this.resource != null) {
            client.setResource(this.resource);
        } else {
            client.setResource("filesystem");
        }
        if (this.version != null) {
            client.setVersion(this.version);
        } else {
            client.setVersion("2019-02-02");
        }
        if (this.fileSystem != null) {
            client.setFileSystem(this.fileSystem);
        }
        if (this.path1 != null) {
            client.setPath1(this.path1);
        }
        return client;
    }
}
