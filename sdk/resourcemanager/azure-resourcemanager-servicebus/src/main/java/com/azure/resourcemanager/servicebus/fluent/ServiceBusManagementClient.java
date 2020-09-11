// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;

import java.time.Duration;

/** Initializes a new instance of the ServiceBusManagementClient type. */
@ServiceClient(builder = ServiceBusManagementClientBuilder.class)
public final class ServiceBusManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(ServiceBusManagementClient.class);

    /**
     * Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The NamespacesClient object to access its operations. */
    private final NamespacesClient namespaces;

    /**
     * Gets the NamespacesClient object to access its operations.
     *
     * @return the NamespacesClient object.
     */
    public NamespacesClient getNamespaces() {
        return this.namespaces;
    }

    /** The QueuesClient object to access its operations. */
    private final QueuesClient queues;

    /**
     * Gets the QueuesClient object to access its operations.
     *
     * @return the QueuesClient object.
     */
    public QueuesClient getQueues() {
        return this.queues;
    }

    /** The TopicsClient object to access its operations. */
    private final TopicsClient topics;

    /**
     * Gets the TopicsClient object to access its operations.
     *
     * @return the TopicsClient object.
     */
    public TopicsClient getTopics() {
        return this.topics;
    }

    /** The SubscriptionsClient object to access its operations. */
    private final SubscriptionsClient subscriptions;

    /**
     * Gets the SubscriptionsClient object to access its operations.
     *
     * @return the SubscriptionsClient object.
     */
    public SubscriptionsClient getSubscriptions() {
        return this.subscriptions;
    }

    /**
     * Initializes an instance of ServiceBusManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     */
    ServiceBusManagementClient(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2015-08-01";
        this.operations = new OperationsClient(this);
        this.namespaces = new NamespacesClient(this);
        this.queues = new QueuesClient(this);
        this.topics = new TopicsClient(this);
        this.subscriptions = new SubscriptionsClient(this);
    }
}
