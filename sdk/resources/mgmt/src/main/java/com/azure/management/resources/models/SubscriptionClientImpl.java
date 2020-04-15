// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.management.AzureServiceClient;

/** Initializes a new instance of the SubscriptionClientImpl type. */
public final class SubscriptionClientImpl extends AzureServiceClient {
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
    public SubscriptionClientImpl setHost(String host) {
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
    public SubscriptionClientImpl setApiVersion(String apiVersion) {
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

    /** The SubscriptionsInner object to access its operations. */
    private final SubscriptionsInner subscriptions;

    /**
     * Gets the SubscriptionsInner object to access its operations.
     *
     * @return the SubscriptionsInner object.
     */
    public SubscriptionsInner subscriptions() {
        return this.subscriptions;
    }

    /** The TenantsInner object to access its operations. */
    private final TenantsInner tenants;

    /**
     * Gets the TenantsInner object to access its operations.
     *
     * @return the TenantsInner object.
     */
    public TenantsInner tenants() {
        return this.tenants;
    }

    /** Initializes an instance of SubscriptionClient client. */
    public SubscriptionClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of SubscriptionClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public SubscriptionClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of SubscriptionClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public SubscriptionClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
//        this.operations = new OperationsInner(this);
        this.subscriptions = new SubscriptionsInner(this);
        this.tenants = new TenantsInner(this);
    }
}
