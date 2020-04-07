// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.management.AzureServiceClient;

/**
 * Initializes a new instance of the AuthorizationManagementClientImpl type.
 */
public final class AuthorizationManagementClientImpl extends AzureServiceClient {
    /**
     * The ID of the target subscription.
     */
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
    public AuthorizationManagementClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * server parameter.
     */
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
    public AuthorizationManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The ClassicAdministratorsInner object to access its operations.
     */
    private ClassicAdministratorsInner classicAdministrators;

    /**
     * Gets the ClassicAdministratorsInner object to access its operations.
     * 
     * @return the ClassicAdministratorsInner object.
     */
    public ClassicAdministratorsInner classicAdministrators() {
        return this.classicAdministrators;
    }

    /**
     * The GlobalAdministratorsInner object to access its operations.
     */
    private GlobalAdministratorsInner globalAdministrators;

    /**
     * Gets the GlobalAdministratorsInner object to access its operations.
     * 
     * @return the GlobalAdministratorsInner object.
     */
    public GlobalAdministratorsInner globalAdministrators() {
        return this.globalAdministrators;
    }

    /**
     * The ProviderOperationsMetadatasInner object to access its operations.
     */
    private ProviderOperationsMetadatasInner providerOperationsMetadatas;

    /**
     * Gets the ProviderOperationsMetadatasInner object to access its operations.
     * 
     * @return the ProviderOperationsMetadatasInner object.
     */
    public ProviderOperationsMetadatasInner providerOperationsMetadatas() {
        return this.providerOperationsMetadatas;
    }

    /**
     * The RoleAssignmentsInner object to access its operations.
     */
    private RoleAssignmentsInner roleAssignments;

    /**
     * Gets the RoleAssignmentsInner object to access its operations.
     * 
     * @return the RoleAssignmentsInner object.
     */
    public RoleAssignmentsInner roleAssignments() {
        return this.roleAssignments;
    }

    /**
     * The PermissionsInner object to access its operations.
     */
    private PermissionsInner permissions;

    /**
     * Gets the PermissionsInner object to access its operations.
     * 
     * @return the PermissionsInner object.
     */
    public PermissionsInner permissions() {
        return this.permissions;
    }

    /**
     * The RoleDefinitionsInner object to access its operations.
     */
    private RoleDefinitionsInner roleDefinitions;

    /**
     * Gets the RoleDefinitionsInner object to access its operations.
     * 
     * @return the RoleDefinitionsInner object.
     */
    public RoleDefinitionsInner roleDefinitions() {
        return this.roleDefinitions;
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     */
    public AuthorizationManagementClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(), AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AuthorizationManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public AuthorizationManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.classicAdministrators = new ClassicAdministratorsInner(this);
        this.globalAdministrators = new GlobalAdministratorsInner(this);
        this.providerOperationsMetadatas = new ProviderOperationsMetadatasInner(this);
        this.roleAssignments = new RoleAssignmentsInner(this);
        this.permissions = new PermissionsInner(this);
        this.roleDefinitions = new RoleDefinitionsInner(this);
    }
}
