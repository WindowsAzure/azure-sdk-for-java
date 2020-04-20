// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.dns.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.management.AzureServiceClient;

/** Initializes a new instance of the DnsManagementClientImpl type. */
public final class DnsManagementClientImpl extends AzureServiceClient {
    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public DnsManagementClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** server parameter. */
    private String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the service client itself.
     */
    public DnsManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /** Api Version. */
    private String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself.
     */
    public DnsManagementClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
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

    /** The RecordSetsInner object to access its operations. */
    private final RecordSetsInner recordSets;

    /**
     * Gets the RecordSetsInner object to access its operations.
     *
     * @return the RecordSetsInner object.
     */
    public RecordSetsInner recordSets() {
        return this.recordSets;
    }

    /** The ZonesInner object to access its operations. */
    private final ZonesInner zones;

    /**
     * Gets the ZonesInner object to access its operations.
     *
     * @return the ZonesInner object.
     */
    public ZonesInner zones() {
        return this.zones;
    }

    /** Initializes an instance of DnsManagementClient client. */
    public DnsManagementClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of DnsManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public DnsManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of DnsManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public DnsManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.recordSets = new RecordSetsInner(this);
        this.zones = new ZonesInner(this);
    }
}
