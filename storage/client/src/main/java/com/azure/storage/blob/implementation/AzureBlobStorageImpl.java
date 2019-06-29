// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.implementation;

import com.azure.core.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;

/**
 * Initializes a new instance of the AzureBlobStorage type.
 */
public final class AzureBlobStorageImpl extends ServiceClient {
    /**
     * The URL of the service account, container, or blob that is the targe of the desired operation.
     */
    private String url;

    /**
     * Gets The URL of the service account, container, or blob that is the targe of the desired operation.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Sets The URL of the service account, container, or blob that is the targe of the desired operation.
     *
     * @param url the url value.
     * @return the service client itself.
     */
    AzureBlobStorageImpl url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Specifies the version of the operation to use for this request.
     */
    private String version;

    /**
     * Gets Specifies the version of the operation to use for this request.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Sets Specifies the version of the operation to use for this request.
     *
     * @param version the version value.
     * @return the service client itself.
     */
    AzureBlobStorageImpl version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The ServicesImpl object to access its operations.
     */
    private ServicesImpl services;

    /**
     * Gets the ServicesImpl object to access its operations.
     *
     * @return the ServicesImpl object.
     */
    public ServicesImpl services() {
        return this.services;
    }

    /**
     * The ContainersImpl object to access its operations.
     */
    private ContainersImpl containers;

    /**
     * Gets the ContainersImpl object to access its operations.
     *
     * @return the ContainersImpl object.
     */
    public ContainersImpl containers() {
        return this.containers;
    }

    /**
     * The BlobsImpl object to access its operations.
     */
    private BlobsImpl blobs;

    /**
     * Gets the BlobsImpl object to access its operations.
     *
     * @return the BlobsImpl object.
     */
    public BlobsImpl blobs() {
        return this.blobs;
    }

    /**
     * The PageBlobsImpl object to access its operations.
     */
    private PageBlobsImpl pageBlobs;

    /**
     * Gets the PageBlobsImpl object to access its operations.
     *
     * @return the PageBlobsImpl object.
     */
    public PageBlobsImpl pageBlobs() {
        return this.pageBlobs;
    }

    /**
     * The AppendBlobsImpl object to access its operations.
     */
    private AppendBlobsImpl appendBlobs;

    /**
     * Gets the AppendBlobsImpl object to access its operations.
     *
     * @return the AppendBlobsImpl object.
     */
    public AppendBlobsImpl appendBlobs() {
        return this.appendBlobs;
    }

    /**
     * The BlockBlobsImpl object to access its operations.
     */
    private BlockBlobsImpl blockBlobs;

    /**
     * Gets the BlockBlobsImpl object to access its operations.
     *
     * @return the BlockBlobsImpl object.
     */
    public BlockBlobsImpl blockBlobs() {
        return this.blockBlobs;
    }

    /**
     * Initializes an instance of AzureBlobStorage client.
     */
    public AzureBlobStorageImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AzureBlobStorage client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AzureBlobStorageImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.services = new ServicesImpl(this);
        this.containers = new ContainersImpl(this);
        this.blobs = new BlobsImpl(this);
        this.pageBlobs = new PageBlobsImpl(this);
        this.appendBlobs = new AppendBlobsImpl(this);
        this.blockBlobs = new BlockBlobsImpl(this);
    }
}
