/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the GraphRbacManagementClientImpl class.
 */
public class GraphRbacManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Client API version. */
    private String apiVersion;

    /**
     * Gets Client API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The tenant ID. */
    private String tenantID;

    /**
     * Gets The tenant ID.
     *
     * @return the tenantID value.
     */
    public String tenantID() {
        return this.tenantID;
    }

    /**
     * Sets The tenant ID.
     *
     * @param tenantID the tenantID value.
     * @return the service client itself
     */
    public GraphRbacManagementClientImpl withTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    /** The application ID. */
    private String applicationID;

    /**
     * Gets The application ID.
     *
     * @return the applicationID value.
     */
    public String applicationID() {
        return this.applicationID;
    }

    /**
     * Sets The application ID.
     *
     * @param applicationID the applicationID value.
     * @return the service client itself
     */
    public GraphRbacManagementClientImpl withApplicationID(String applicationID) {
        this.applicationID = applicationID;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public GraphRbacManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public GraphRbacManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public GraphRbacManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The SignedInUsersInner object to access its operations.
     */
    private SignedInUsersInner signedInUsers;

    /**
     * Gets the SignedInUsersInner object to access its operations.
     * @return the SignedInUsersInner object.
     */
    public SignedInUsersInner signedInUsers() {
        return this.signedInUsers;
    }

    /**
     * The ApplicationsInner object to access its operations.
     */
    private ApplicationsInner applications;

    /**
     * Gets the ApplicationsInner object to access its operations.
     * @return the ApplicationsInner object.
     */
    public ApplicationsInner applications() {
        return this.applications;
    }

    /**
     * The DeletedApplicationsInner object to access its operations.
     */
    private DeletedApplicationsInner deletedApplications;

    /**
     * Gets the DeletedApplicationsInner object to access its operations.
     * @return the DeletedApplicationsInner object.
     */
    public DeletedApplicationsInner deletedApplications() {
        return this.deletedApplications;
    }

    /**
     * The GroupsInner object to access its operations.
     */
    private GroupsInner groups;

    /**
     * Gets the GroupsInner object to access its operations.
     * @return the GroupsInner object.
     */
    public GroupsInner groups() {
        return this.groups;
    }

    /**
     * The ServicePrincipalsInner object to access its operations.
     */
    private ServicePrincipalsInner servicePrincipals;

    /**
     * Gets the ServicePrincipalsInner object to access its operations.
     * @return the ServicePrincipalsInner object.
     */
    public ServicePrincipalsInner servicePrincipals() {
        return this.servicePrincipals;
    }

    /**
     * The UsersInner object to access its operations.
     */
    private UsersInner users;

    /**
     * Gets the UsersInner object to access its operations.
     * @return the UsersInner object.
     */
    public UsersInner users() {
        return this.users;
    }

    /**
     * The ObjectsInner object to access its operations.
     */
    private ObjectsInner objects;

    /**
     * Gets the ObjectsInner object to access its operations.
     * @return the ObjectsInner object.
     */
    public ObjectsInner objects() {
        return this.objects;
    }

    /**
     * The DomainsInner object to access its operations.
     */
    private DomainsInner domains;

    /**
     * Gets the DomainsInner object to access its operations.
     * @return the DomainsInner object.
     */
    public DomainsInner domains() {
        return this.domains;
    }

    /**
     * The OAuth2PermissionGrantsInner object to access its operations.
     */
    private OAuth2PermissionGrantsInner oAuth2PermissionGrants;

    /**
     * Gets the OAuth2PermissionGrantsInner object to access its operations.
     * @return the OAuth2PermissionGrantsInner object.
     */
    public OAuth2PermissionGrantsInner oAuth2PermissionGrants() {
        return this.oAuth2PermissionGrants;
    }

    /**
     * Initializes an instance of GraphRbacManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public GraphRbacManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://graph.windows.net", credentials);
    }

    /**
     * Initializes an instance of GraphRbacManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public GraphRbacManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of GraphRbacManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public GraphRbacManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "1.6";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.signedInUsers = new SignedInUsersInner(restClient().retrofit(), this);
        this.applications = new ApplicationsInner(restClient().retrofit(), this);
        this.deletedApplications = new DeletedApplicationsInner(restClient().retrofit(), this);
        this.groups = new GroupsInner(restClient().retrofit(), this);
        this.servicePrincipals = new ServicePrincipalsInner(restClient().retrofit(), this);
        this.users = new UsersInner(restClient().retrofit(), this);
        this.objects = new ObjectsInner(restClient().retrofit(), this);
        this.domains = new DomainsInner(restClient().retrofit(), this);
        this.oAuth2PermissionGrants = new OAuth2PermissionGrantsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "GraphRbacManagementClient", "1.6");
    }
}
