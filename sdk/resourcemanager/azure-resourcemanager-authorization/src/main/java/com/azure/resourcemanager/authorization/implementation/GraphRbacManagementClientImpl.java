// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.authorization.fluent.ApplicationsClient;
import com.azure.resourcemanager.authorization.fluent.DeletedApplicationsClient;
import com.azure.resourcemanager.authorization.fluent.DomainsClient;
import com.azure.resourcemanager.authorization.fluent.GraphRbacManagementClient;
import com.azure.resourcemanager.authorization.fluent.GroupsClient;
import com.azure.resourcemanager.authorization.fluent.OAuth2PermissionGrantsClient;
import com.azure.resourcemanager.authorization.fluent.ObjectsClient;
import com.azure.resourcemanager.authorization.fluent.ServicePrincipalsClient;
import com.azure.resourcemanager.authorization.fluent.SignedInUsersClient;
import com.azure.resourcemanager.authorization.fluent.UsersClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the GraphRbacManagementClientImpl type. */
@ServiceClient(builder = GraphRbacManagementClientBuilder.class)
public final class GraphRbacManagementClientImpl extends AzureServiceClient implements GraphRbacManagementClient {
    private final ClientLogger logger = new ClientLogger(GraphRbacManagementClientImpl.class);

    /** The tenant ID. */
    private final String tenantId;

    /**
     * Gets The tenant ID.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
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

    /** The SignedInUsersClient object to access its operations. */
    private final SignedInUsersClient signedInUsers;

    /**
     * Gets the SignedInUsersClient object to access its operations.
     *
     * @return the SignedInUsersClient object.
     */
    public SignedInUsersClient getSignedInUsers() {
        return this.signedInUsers;
    }

    /** The ApplicationsClient object to access its operations. */
    private final ApplicationsClient applications;

    /**
     * Gets the ApplicationsClient object to access its operations.
     *
     * @return the ApplicationsClient object.
     */
    public ApplicationsClient getApplications() {
        return this.applications;
    }

    /** The DeletedApplicationsClient object to access its operations. */
    private final DeletedApplicationsClient deletedApplications;

    /**
     * Gets the DeletedApplicationsClient object to access its operations.
     *
     * @return the DeletedApplicationsClient object.
     */
    public DeletedApplicationsClient getDeletedApplications() {
        return this.deletedApplications;
    }

    /** The GroupsClient object to access its operations. */
    private final GroupsClient groups;

    /**
     * Gets the GroupsClient object to access its operations.
     *
     * @return the GroupsClient object.
     */
    public GroupsClient getGroups() {
        return this.groups;
    }

    /** The ServicePrincipalsClient object to access its operations. */
    private final ServicePrincipalsClient servicePrincipals;

    /**
     * Gets the ServicePrincipalsClient object to access its operations.
     *
     * @return the ServicePrincipalsClient object.
     */
    public ServicePrincipalsClient getServicePrincipals() {
        return this.servicePrincipals;
    }

    /** The UsersClient object to access its operations. */
    private final UsersClient users;

    /**
     * Gets the UsersClient object to access its operations.
     *
     * @return the UsersClient object.
     */
    public UsersClient getUsers() {
        return this.users;
    }

    /** The ObjectsClient object to access its operations. */
    private final ObjectsClient objects;

    /**
     * Gets the ObjectsClient object to access its operations.
     *
     * @return the ObjectsClient object.
     */
    public ObjectsClient getObjects() {
        return this.objects;
    }

    /** The DomainsClient object to access its operations. */
    private final DomainsClient domains;

    /**
     * Gets the DomainsClient object to access its operations.
     *
     * @return the DomainsClient object.
     */
    public DomainsClient getDomains() {
        return this.domains;
    }

    /** The OAuth2PermissionGrantsClient object to access its operations. */
    private final OAuth2PermissionGrantsClient oAuth2PermissionGrants;

    /**
     * Gets the OAuth2PermissionGrantsClient object to access its operations.
     *
     * @return the OAuth2PermissionGrantsClient object.
     */
    public OAuth2PermissionGrantsClient getOAuth2PermissionGrants() {
        return this.oAuth2PermissionGrants;
    }

    /**
     * Initializes an instance of GraphRbacManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param tenantId The tenant ID.
     * @param endpoint server parameter.
     */
    GraphRbacManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String tenantId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.tenantId = tenantId;
        this.endpoint = endpoint;
        this.apiVersion = "1.6";
        this.signedInUsers = new SignedInUsersClientImpl(this);
        this.applications = new ApplicationsClientImpl(this);
        this.deletedApplications = new DeletedApplicationsClientImpl(this);
        this.groups = new GroupsClientImpl(this);
        this.servicePrincipals = new ServicePrincipalsClientImpl(this);
        this.users = new UsersClientImpl(this);
        this.objects = new ObjectsClientImpl(this);
        this.domains = new DomainsClientImpl(this);
        this.oAuth2PermissionGrants = new OAuth2PermissionGrantsClientImpl(this);
    }
}
