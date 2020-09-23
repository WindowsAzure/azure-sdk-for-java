// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.fluent;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the PrivateDnsManagementClient type. */
@ServiceClient(builder = PrivateDnsManagementClientBuilder.class)
public final class PrivateDnsManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(PrivateDnsManagementClient.class);

    /**
     * Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID
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

    /** The PrivateZonesClient object to access its operations. */
    private final PrivateZonesClient privateZones;

    /**
     * Gets the PrivateZonesClient object to access its operations.
     *
     * @return the PrivateZonesClient object.
     */
    public PrivateZonesClient getPrivateZones() {
        return this.privateZones;
    }

    /** The VirtualNetworkLinksClient object to access its operations. */
    private final VirtualNetworkLinksClient virtualNetworkLinks;

    /**
     * Gets the VirtualNetworkLinksClient object to access its operations.
     *
     * @return the VirtualNetworkLinksClient object.
     */
    public VirtualNetworkLinksClient getVirtualNetworkLinks() {
        return this.virtualNetworkLinks;
    }

    /** The RecordSetsClient object to access its operations. */
    private final RecordSetsClient recordSets;

    /**
     * Gets the RecordSetsClient object to access its operations.
     *
     * @return the RecordSetsClient object.
     */
    public RecordSetsClient getRecordSets() {
        return this.recordSets;
    }

    /**
     * Initializes an instance of PrivateDnsManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     */
    PrivateDnsManagementClient(
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
        this.apiVersion = "2018-09-01";
        this.privateZones = new PrivateZonesClient(this);
        this.virtualNetworkLinks = new VirtualNetworkLinksClient(this);
        this.recordSets = new RecordSetsClient(this);
    }
}
