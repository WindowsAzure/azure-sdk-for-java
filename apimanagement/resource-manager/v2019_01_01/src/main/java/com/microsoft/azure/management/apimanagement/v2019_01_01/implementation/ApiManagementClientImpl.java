/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ApiManagementClientImpl class.
 */
public class ApiManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Version of the API to be used with the client request. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ApiManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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
    public ApiManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public ApiManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public ApiManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ApisInner object to access its operations.
     */
    private ApisInner apis;

    /**
     * Gets the ApisInner object to access its operations.
     * @return the ApisInner object.
     */
    public ApisInner apis() {
        return this.apis;
    }

    /**
     * The ApiRevisionsInner object to access its operations.
     */
    private ApiRevisionsInner apiRevisions;

    /**
     * Gets the ApiRevisionsInner object to access its operations.
     * @return the ApiRevisionsInner object.
     */
    public ApiRevisionsInner apiRevisions() {
        return this.apiRevisions;
    }

    /**
     * The ApiReleasesInner object to access its operations.
     */
    private ApiReleasesInner apiReleases;

    /**
     * Gets the ApiReleasesInner object to access its operations.
     * @return the ApiReleasesInner object.
     */
    public ApiReleasesInner apiReleases() {
        return this.apiReleases;
    }

    /**
     * The ApiOperationsInner object to access its operations.
     */
    private ApiOperationsInner apiOperations;

    /**
     * Gets the ApiOperationsInner object to access its operations.
     * @return the ApiOperationsInner object.
     */
    public ApiOperationsInner apiOperations() {
        return this.apiOperations;
    }

    /**
     * The ApiOperationPolicysInner object to access its operations.
     */
    private ApiOperationPolicysInner apiOperationPolicys;

    /**
     * Gets the ApiOperationPolicysInner object to access its operations.
     * @return the ApiOperationPolicysInner object.
     */
    public ApiOperationPolicysInner apiOperationPolicys() {
        return this.apiOperationPolicys;
    }

    /**
     * The TagsInner object to access its operations.
     */
    private TagsInner tags;

    /**
     * Gets the TagsInner object to access its operations.
     * @return the TagsInner object.
     */
    public TagsInner tags() {
        return this.tags;
    }

    /**
     * The ApiProductsInner object to access its operations.
     */
    private ApiProductsInner apiProducts;

    /**
     * Gets the ApiProductsInner object to access its operations.
     * @return the ApiProductsInner object.
     */
    public ApiProductsInner apiProducts() {
        return this.apiProducts;
    }

    /**
     * The ApiPolicysInner object to access its operations.
     */
    private ApiPolicysInner apiPolicys;

    /**
     * Gets the ApiPolicysInner object to access its operations.
     * @return the ApiPolicysInner object.
     */
    public ApiPolicysInner apiPolicys() {
        return this.apiPolicys;
    }

    /**
     * The ApiSchemasInner object to access its operations.
     */
    private ApiSchemasInner apiSchemas;

    /**
     * Gets the ApiSchemasInner object to access its operations.
     * @return the ApiSchemasInner object.
     */
    public ApiSchemasInner apiSchemas() {
        return this.apiSchemas;
    }

    /**
     * The ApiDiagnosticsInner object to access its operations.
     */
    private ApiDiagnosticsInner apiDiagnostics;

    /**
     * Gets the ApiDiagnosticsInner object to access its operations.
     * @return the ApiDiagnosticsInner object.
     */
    public ApiDiagnosticsInner apiDiagnostics() {
        return this.apiDiagnostics;
    }

    /**
     * The ApiIssuesInner object to access its operations.
     */
    private ApiIssuesInner apiIssues;

    /**
     * Gets the ApiIssuesInner object to access its operations.
     * @return the ApiIssuesInner object.
     */
    public ApiIssuesInner apiIssues() {
        return this.apiIssues;
    }

    /**
     * The ApiIssueCommentsInner object to access its operations.
     */
    private ApiIssueCommentsInner apiIssueComments;

    /**
     * Gets the ApiIssueCommentsInner object to access its operations.
     * @return the ApiIssueCommentsInner object.
     */
    public ApiIssueCommentsInner apiIssueComments() {
        return this.apiIssueComments;
    }

    /**
     * The ApiIssueAttachmentsInner object to access its operations.
     */
    private ApiIssueAttachmentsInner apiIssueAttachments;

    /**
     * Gets the ApiIssueAttachmentsInner object to access its operations.
     * @return the ApiIssueAttachmentsInner object.
     */
    public ApiIssueAttachmentsInner apiIssueAttachments() {
        return this.apiIssueAttachments;
    }

    /**
     * The ApiTagDescriptionsInner object to access its operations.
     */
    private ApiTagDescriptionsInner apiTagDescriptions;

    /**
     * Gets the ApiTagDescriptionsInner object to access its operations.
     * @return the ApiTagDescriptionsInner object.
     */
    public ApiTagDescriptionsInner apiTagDescriptions() {
        return this.apiTagDescriptions;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The ApiVersionSetsInner object to access its operations.
     */
    private ApiVersionSetsInner apiVersionSets;

    /**
     * Gets the ApiVersionSetsInner object to access its operations.
     * @return the ApiVersionSetsInner object.
     */
    public ApiVersionSetsInner apiVersionSets() {
        return this.apiVersionSets;
    }

    /**
     * The AuthorizationServersInner object to access its operations.
     */
    private AuthorizationServersInner authorizationServers;

    /**
     * Gets the AuthorizationServersInner object to access its operations.
     * @return the AuthorizationServersInner object.
     */
    public AuthorizationServersInner authorizationServers() {
        return this.authorizationServers;
    }

    /**
     * The BackendsInner object to access its operations.
     */
    private BackendsInner backends;

    /**
     * Gets the BackendsInner object to access its operations.
     * @return the BackendsInner object.
     */
    public BackendsInner backends() {
        return this.backends;
    }

    /**
     * The CachesInner object to access its operations.
     */
    private CachesInner caches;

    /**
     * Gets the CachesInner object to access its operations.
     * @return the CachesInner object.
     */
    public CachesInner caches() {
        return this.caches;
    }

    /**
     * The CertificatesInner object to access its operations.
     */
    private CertificatesInner certificates;

    /**
     * Gets the CertificatesInner object to access its operations.
     * @return the CertificatesInner object.
     */
    public CertificatesInner certificates() {
        return this.certificates;
    }

    /**
     * The ApiManagementOperationsInner object to access its operations.
     */
    private ApiManagementOperationsInner apiManagementOperations;

    /**
     * Gets the ApiManagementOperationsInner object to access its operations.
     * @return the ApiManagementOperationsInner object.
     */
    public ApiManagementOperationsInner apiManagementOperations() {
        return this.apiManagementOperations;
    }

    /**
     * The ApiManagementServiceSkusInner object to access its operations.
     */
    private ApiManagementServiceSkusInner apiManagementServiceSkus;

    /**
     * Gets the ApiManagementServiceSkusInner object to access its operations.
     * @return the ApiManagementServiceSkusInner object.
     */
    public ApiManagementServiceSkusInner apiManagementServiceSkus() {
        return this.apiManagementServiceSkus;
    }

    /**
     * The ApiManagementServicesInner object to access its operations.
     */
    private ApiManagementServicesInner apiManagementServices;

    /**
     * Gets the ApiManagementServicesInner object to access its operations.
     * @return the ApiManagementServicesInner object.
     */
    public ApiManagementServicesInner apiManagementServices() {
        return this.apiManagementServices;
    }

    /**
     * The DiagnosticsInner object to access its operations.
     */
    private DiagnosticsInner diagnostics;

    /**
     * Gets the DiagnosticsInner object to access its operations.
     * @return the DiagnosticsInner object.
     */
    public DiagnosticsInner diagnostics() {
        return this.diagnostics;
    }

    /**
     * The EmailTemplatesInner object to access its operations.
     */
    private EmailTemplatesInner emailTemplates;

    /**
     * Gets the EmailTemplatesInner object to access its operations.
     * @return the EmailTemplatesInner object.
     */
    public EmailTemplatesInner emailTemplates() {
        return this.emailTemplates;
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
     * The GroupUsersInner object to access its operations.
     */
    private GroupUsersInner groupUsers;

    /**
     * Gets the GroupUsersInner object to access its operations.
     * @return the GroupUsersInner object.
     */
    public GroupUsersInner groupUsers() {
        return this.groupUsers;
    }

    /**
     * The IdentityProvidersInner object to access its operations.
     */
    private IdentityProvidersInner identityProviders;

    /**
     * Gets the IdentityProvidersInner object to access its operations.
     * @return the IdentityProvidersInner object.
     */
    public IdentityProvidersInner identityProviders() {
        return this.identityProviders;
    }

    /**
     * The IssuesInner object to access its operations.
     */
    private IssuesInner issues;

    /**
     * Gets the IssuesInner object to access its operations.
     * @return the IssuesInner object.
     */
    public IssuesInner issues() {
        return this.issues;
    }

    /**
     * The LoggersInner object to access its operations.
     */
    private LoggersInner loggers;

    /**
     * Gets the LoggersInner object to access its operations.
     * @return the LoggersInner object.
     */
    public LoggersInner loggers() {
        return this.loggers;
    }

    /**
     * The NetworkStatusInner object to access its operations.
     */
    private NetworkStatusInner networkStatus;

    /**
     * Gets the NetworkStatusInner object to access its operations.
     * @return the NetworkStatusInner object.
     */
    public NetworkStatusInner networkStatus() {
        return this.networkStatus;
    }

    /**
     * The NotificationsInner object to access its operations.
     */
    private NotificationsInner notifications;

    /**
     * Gets the NotificationsInner object to access its operations.
     * @return the NotificationsInner object.
     */
    public NotificationsInner notifications() {
        return this.notifications;
    }

    /**
     * The NotificationRecipientUsersInner object to access its operations.
     */
    private NotificationRecipientUsersInner notificationRecipientUsers;

    /**
     * Gets the NotificationRecipientUsersInner object to access its operations.
     * @return the NotificationRecipientUsersInner object.
     */
    public NotificationRecipientUsersInner notificationRecipientUsers() {
        return this.notificationRecipientUsers;
    }

    /**
     * The NotificationRecipientEmailsInner object to access its operations.
     */
    private NotificationRecipientEmailsInner notificationRecipientEmails;

    /**
     * Gets the NotificationRecipientEmailsInner object to access its operations.
     * @return the NotificationRecipientEmailsInner object.
     */
    public NotificationRecipientEmailsInner notificationRecipientEmails() {
        return this.notificationRecipientEmails;
    }

    /**
     * The OpenIdConnectProvidersInner object to access its operations.
     */
    private OpenIdConnectProvidersInner openIdConnectProviders;

    /**
     * Gets the OpenIdConnectProvidersInner object to access its operations.
     * @return the OpenIdConnectProvidersInner object.
     */
    public OpenIdConnectProvidersInner openIdConnectProviders() {
        return this.openIdConnectProviders;
    }

    /**
     * The PolicysInner object to access its operations.
     */
    private PolicysInner policys;

    /**
     * Gets the PolicysInner object to access its operations.
     * @return the PolicysInner object.
     */
    public PolicysInner policys() {
        return this.policys;
    }

    /**
     * The PolicySnippetsInner object to access its operations.
     */
    private PolicySnippetsInner policySnippets;

    /**
     * Gets the PolicySnippetsInner object to access its operations.
     * @return the PolicySnippetsInner object.
     */
    public PolicySnippetsInner policySnippets() {
        return this.policySnippets;
    }

    /**
     * The SignInSettingsInner object to access its operations.
     */
    private SignInSettingsInner signInSettings;

    /**
     * Gets the SignInSettingsInner object to access its operations.
     * @return the SignInSettingsInner object.
     */
    public SignInSettingsInner signInSettings() {
        return this.signInSettings;
    }

    /**
     * The SignUpSettingsInner object to access its operations.
     */
    private SignUpSettingsInner signUpSettings;

    /**
     * Gets the SignUpSettingsInner object to access its operations.
     * @return the SignUpSettingsInner object.
     */
    public SignUpSettingsInner signUpSettings() {
        return this.signUpSettings;
    }

    /**
     * The DelegationSettingsInner object to access its operations.
     */
    private DelegationSettingsInner delegationSettings;

    /**
     * Gets the DelegationSettingsInner object to access its operations.
     * @return the DelegationSettingsInner object.
     */
    public DelegationSettingsInner delegationSettings() {
        return this.delegationSettings;
    }

    /**
     * The ProductsInner object to access its operations.
     */
    private ProductsInner products;

    /**
     * Gets the ProductsInner object to access its operations.
     * @return the ProductsInner object.
     */
    public ProductsInner products() {
        return this.products;
    }

    /**
     * The ProductApisInner object to access its operations.
     */
    private ProductApisInner productApis;

    /**
     * Gets the ProductApisInner object to access its operations.
     * @return the ProductApisInner object.
     */
    public ProductApisInner productApis() {
        return this.productApis;
    }

    /**
     * The ProductGroupsInner object to access its operations.
     */
    private ProductGroupsInner productGroups;

    /**
     * Gets the ProductGroupsInner object to access its operations.
     * @return the ProductGroupsInner object.
     */
    public ProductGroupsInner productGroups() {
        return this.productGroups;
    }

    /**
     * The ProductSubscriptionsInner object to access its operations.
     */
    private ProductSubscriptionsInner productSubscriptions;

    /**
     * Gets the ProductSubscriptionsInner object to access its operations.
     * @return the ProductSubscriptionsInner object.
     */
    public ProductSubscriptionsInner productSubscriptions() {
        return this.productSubscriptions;
    }

    /**
     * The ProductPolicysInner object to access its operations.
     */
    private ProductPolicysInner productPolicys;

    /**
     * Gets the ProductPolicysInner object to access its operations.
     * @return the ProductPolicysInner object.
     */
    public ProductPolicysInner productPolicys() {
        return this.productPolicys;
    }

    /**
     * The PropertysInner object to access its operations.
     */
    private PropertysInner propertys;

    /**
     * Gets the PropertysInner object to access its operations.
     * @return the PropertysInner object.
     */
    public PropertysInner propertys() {
        return this.propertys;
    }

    /**
     * The QuotaByCounterKeysInner object to access its operations.
     */
    private QuotaByCounterKeysInner quotaByCounterKeys;

    /**
     * Gets the QuotaByCounterKeysInner object to access its operations.
     * @return the QuotaByCounterKeysInner object.
     */
    public QuotaByCounterKeysInner quotaByCounterKeys() {
        return this.quotaByCounterKeys;
    }

    /**
     * The QuotaByPeriodKeysInner object to access its operations.
     */
    private QuotaByPeriodKeysInner quotaByPeriodKeys;

    /**
     * Gets the QuotaByPeriodKeysInner object to access its operations.
     * @return the QuotaByPeriodKeysInner object.
     */
    public QuotaByPeriodKeysInner quotaByPeriodKeys() {
        return this.quotaByPeriodKeys;
    }

    /**
     * The RegionsInner object to access its operations.
     */
    private RegionsInner regions;

    /**
     * Gets the RegionsInner object to access its operations.
     * @return the RegionsInner object.
     */
    public RegionsInner regions() {
        return this.regions;
    }

    /**
     * The ReportsInner object to access its operations.
     */
    private ReportsInner reports;

    /**
     * Gets the ReportsInner object to access its operations.
     * @return the ReportsInner object.
     */
    public ReportsInner reports() {
        return this.reports;
    }

    /**
     * The SubscriptionsInner object to access its operations.
     */
    private SubscriptionsInner subscriptions;

    /**
     * Gets the SubscriptionsInner object to access its operations.
     * @return the SubscriptionsInner object.
     */
    public SubscriptionsInner subscriptions() {
        return this.subscriptions;
    }

    /**
     * The TagResourcesInner object to access its operations.
     */
    private TagResourcesInner tagResources;

    /**
     * Gets the TagResourcesInner object to access its operations.
     * @return the TagResourcesInner object.
     */
    public TagResourcesInner tagResources() {
        return this.tagResources;
    }

    /**
     * The TenantAccessInner object to access its operations.
     */
    private TenantAccessInner tenantAccess;

    /**
     * Gets the TenantAccessInner object to access its operations.
     * @return the TenantAccessInner object.
     */
    public TenantAccessInner tenantAccess() {
        return this.tenantAccess;
    }

    /**
     * The TenantAccessGitsInner object to access its operations.
     */
    private TenantAccessGitsInner tenantAccessGits;

    /**
     * Gets the TenantAccessGitsInner object to access its operations.
     * @return the TenantAccessGitsInner object.
     */
    public TenantAccessGitsInner tenantAccessGits() {
        return this.tenantAccessGits;
    }

    /**
     * The TenantConfigurationsInner object to access its operations.
     */
    private TenantConfigurationsInner tenantConfigurations;

    /**
     * Gets the TenantConfigurationsInner object to access its operations.
     * @return the TenantConfigurationsInner object.
     */
    public TenantConfigurationsInner tenantConfigurations() {
        return this.tenantConfigurations;
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
     * The UserGroupsInner object to access its operations.
     */
    private UserGroupsInner userGroups;

    /**
     * Gets the UserGroupsInner object to access its operations.
     * @return the UserGroupsInner object.
     */
    public UserGroupsInner userGroups() {
        return this.userGroups;
    }

    /**
     * The UserSubscriptionsInner object to access its operations.
     */
    private UserSubscriptionsInner userSubscriptions;

    /**
     * Gets the UserSubscriptionsInner object to access its operations.
     * @return the UserSubscriptionsInner object.
     */
    public UserSubscriptionsInner userSubscriptions() {
        return this.userSubscriptions;
    }

    /**
     * The UserIdentitiesInner object to access its operations.
     */
    private UserIdentitiesInner userIdentities;

    /**
     * Gets the UserIdentitiesInner object to access its operations.
     * @return the UserIdentitiesInner object.
     */
    public UserIdentitiesInner userIdentities() {
        return this.userIdentities;
    }

    /**
     * The UserConfirmationPasswordsInner object to access its operations.
     */
    private UserConfirmationPasswordsInner userConfirmationPasswords;

    /**
     * Gets the UserConfirmationPasswordsInner object to access its operations.
     * @return the UserConfirmationPasswordsInner object.
     */
    public UserConfirmationPasswordsInner userConfirmationPasswords() {
        return this.userConfirmationPasswords;
    }

    /**
     * The ApiExportsInner object to access its operations.
     */
    private ApiExportsInner apiExports;

    /**
     * Gets the ApiExportsInner object to access its operations.
     * @return the ApiExportsInner object.
     */
    public ApiExportsInner apiExports() {
        return this.apiExports;
    }

    /**
     * Initializes an instance of ApiManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ApiManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ApiManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ApiManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ApiManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ApiManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-01-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.apis = new ApisInner(restClient().retrofit(), this);
        this.apiRevisions = new ApiRevisionsInner(restClient().retrofit(), this);
        this.apiReleases = new ApiReleasesInner(restClient().retrofit(), this);
        this.apiOperations = new ApiOperationsInner(restClient().retrofit(), this);
        this.apiOperationPolicys = new ApiOperationPolicysInner(restClient().retrofit(), this);
        this.tags = new TagsInner(restClient().retrofit(), this);
        this.apiProducts = new ApiProductsInner(restClient().retrofit(), this);
        this.apiPolicys = new ApiPolicysInner(restClient().retrofit(), this);
        this.apiSchemas = new ApiSchemasInner(restClient().retrofit(), this);
        this.apiDiagnostics = new ApiDiagnosticsInner(restClient().retrofit(), this);
        this.apiIssues = new ApiIssuesInner(restClient().retrofit(), this);
        this.apiIssueComments = new ApiIssueCommentsInner(restClient().retrofit(), this);
        this.apiIssueAttachments = new ApiIssueAttachmentsInner(restClient().retrofit(), this);
        this.apiTagDescriptions = new ApiTagDescriptionsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.apiVersionSets = new ApiVersionSetsInner(restClient().retrofit(), this);
        this.authorizationServers = new AuthorizationServersInner(restClient().retrofit(), this);
        this.backends = new BackendsInner(restClient().retrofit(), this);
        this.caches = new CachesInner(restClient().retrofit(), this);
        this.certificates = new CertificatesInner(restClient().retrofit(), this);
        this.apiManagementOperations = new ApiManagementOperationsInner(restClient().retrofit(), this);
        this.apiManagementServiceSkus = new ApiManagementServiceSkusInner(restClient().retrofit(), this);
        this.apiManagementServices = new ApiManagementServicesInner(restClient().retrofit(), this);
        this.diagnostics = new DiagnosticsInner(restClient().retrofit(), this);
        this.emailTemplates = new EmailTemplatesInner(restClient().retrofit(), this);
        this.groups = new GroupsInner(restClient().retrofit(), this);
        this.groupUsers = new GroupUsersInner(restClient().retrofit(), this);
        this.identityProviders = new IdentityProvidersInner(restClient().retrofit(), this);
        this.issues = new IssuesInner(restClient().retrofit(), this);
        this.loggers = new LoggersInner(restClient().retrofit(), this);
        this.networkStatus = new NetworkStatusInner(restClient().retrofit(), this);
        this.notifications = new NotificationsInner(restClient().retrofit(), this);
        this.notificationRecipientUsers = new NotificationRecipientUsersInner(restClient().retrofit(), this);
        this.notificationRecipientEmails = new NotificationRecipientEmailsInner(restClient().retrofit(), this);
        this.openIdConnectProviders = new OpenIdConnectProvidersInner(restClient().retrofit(), this);
        this.policys = new PolicysInner(restClient().retrofit(), this);
        this.policySnippets = new PolicySnippetsInner(restClient().retrofit(), this);
        this.signInSettings = new SignInSettingsInner(restClient().retrofit(), this);
        this.signUpSettings = new SignUpSettingsInner(restClient().retrofit(), this);
        this.delegationSettings = new DelegationSettingsInner(restClient().retrofit(), this);
        this.products = new ProductsInner(restClient().retrofit(), this);
        this.productApis = new ProductApisInner(restClient().retrofit(), this);
        this.productGroups = new ProductGroupsInner(restClient().retrofit(), this);
        this.productSubscriptions = new ProductSubscriptionsInner(restClient().retrofit(), this);
        this.productPolicys = new ProductPolicysInner(restClient().retrofit(), this);
        this.propertys = new PropertysInner(restClient().retrofit(), this);
        this.quotaByCounterKeys = new QuotaByCounterKeysInner(restClient().retrofit(), this);
        this.quotaByPeriodKeys = new QuotaByPeriodKeysInner(restClient().retrofit(), this);
        this.regions = new RegionsInner(restClient().retrofit(), this);
        this.reports = new ReportsInner(restClient().retrofit(), this);
        this.subscriptions = new SubscriptionsInner(restClient().retrofit(), this);
        this.tagResources = new TagResourcesInner(restClient().retrofit(), this);
        this.tenantAccess = new TenantAccessInner(restClient().retrofit(), this);
        this.tenantAccessGits = new TenantAccessGitsInner(restClient().retrofit(), this);
        this.tenantConfigurations = new TenantConfigurationsInner(restClient().retrofit(), this);
        this.users = new UsersInner(restClient().retrofit(), this);
        this.userGroups = new UserGroupsInner(restClient().retrofit(), this);
        this.userSubscriptions = new UserSubscriptionsInner(restClient().retrofit(), this);
        this.userIdentities = new UserIdentitiesInner(restClient().retrofit(), this);
        this.userConfirmationPasswords = new UserConfirmationPasswordsInner(restClient().retrofit(), this);
        this.apiExports = new ApiExportsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ApiManagementClient", "2019-01-01");
    }
}
