// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.implementation;

import com.azure.core.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;

/**
 * Initializes a new instance of the AzureQueueStorage type.
 */
public final class AzureQueueStorageImpl extends ServiceClient {
    /**
     * The URL of the service account, queue or message that is the targe of the desired operation.
     */
    private String url;

    /**
     * Gets The URL of the service account, queue or message that is the targe of the desired operation.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Sets The URL of the service account, queue or message that is the targe of the desired operation.
     *
     * @param url the url value.
     * @return the service client itself.
     */
    AzureQueueStorageImpl url(String url) {
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
    AzureQueueStorageImpl version(String version) {
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
     * The QueuesImpl object to access its operations.
     */
    private QueuesImpl queues;

    /**
     * Gets the QueuesImpl object to access its operations.
     *
     * @return the QueuesImpl object.
     */
    public QueuesImpl queues() {
        return this.queues;
    }

    /**
     * The MessagesImpl object to access its operations.
     */
    private MessagesImpl messages;

    /**
     * Gets the MessagesImpl object to access its operations.
     *
     * @return the MessagesImpl object.
     */
    public MessagesImpl messages() {
        return this.messages;
    }

    /**
     * The MessageIdsImpl object to access its operations.
     */
    private MessageIdsImpl messageIds;

    /**
     * Gets the MessageIdsImpl object to access its operations.
     *
     * @return the MessageIdsImpl object.
     */
    public MessageIdsImpl messageIds() {
        return this.messageIds;
    }

    /**
     * Initializes an instance of AzureQueueStorage client.
     */
    public AzureQueueStorageImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AzureQueueStorage client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AzureQueueStorageImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.services = new ServicesImpl(this);
        this.queues = new QueuesImpl(this);
        this.messages = new MessagesImpl(this);
        this.messageIds = new MessageIdsImpl(this);
    }
}
