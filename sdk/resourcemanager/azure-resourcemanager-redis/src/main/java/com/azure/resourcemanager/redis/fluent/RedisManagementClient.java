// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the RedisManagementClient type. */
@ServiceClient(builder = RedisManagementClientBuilder.class)
public final class RedisManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(RedisManagementClient.class);

    /**
     * Gets subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
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
    SerializerAdapter getSerializerAdapter() {
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

    /** The RedisClient object to access its operations. */
    private final RedisClient redis;

    /**
     * Gets the RedisClient object to access its operations.
     *
     * @return the RedisClient object.
     */
    public RedisClient getRedis() {
        return this.redis;
    }

    /** The FirewallRulesClient object to access its operations. */
    private final FirewallRulesClient firewallRules;

    /**
     * Gets the FirewallRulesClient object to access its operations.
     *
     * @return the FirewallRulesClient object.
     */
    public FirewallRulesClient getFirewallRules() {
        return this.firewallRules;
    }

    /** The PatchSchedulesClient object to access its operations. */
    private final PatchSchedulesClient patchSchedules;

    /**
     * Gets the PatchSchedulesClient object to access its operations.
     *
     * @return the PatchSchedulesClient object.
     */
    public PatchSchedulesClient getPatchSchedules() {
        return this.patchSchedules;
    }

    /** The LinkedServersClient object to access its operations. */
    private final LinkedServersClient linkedServers;

    /**
     * Gets the LinkedServersClient object to access its operations.
     *
     * @return the LinkedServersClient object.
     */
    public LinkedServersClient getLinkedServers() {
        return this.linkedServers;
    }

    /**
     * Initializes an instance of RedisManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     */
    RedisManagementClient(
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
        this.apiVersion = "2018-03-01";
        this.operations = new OperationsClient(this);
        this.redis = new RedisClient(this);
        this.firewallRules = new FirewallRulesClient(this);
        this.patchSchedules = new PatchSchedulesClient(this);
        this.linkedServers = new LinkedServersClient(this);
    }
}
