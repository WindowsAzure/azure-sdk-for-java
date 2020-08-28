/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the BillingManagementClientImpl class.
 */
public class BillingManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The ID that uniquely identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The ID that uniquely identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID that uniquely identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public BillingManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Azure Subscription ID. */
    private String subscriptionId1;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId1 value.
     */
    public String subscriptionId1() {
        return this.subscriptionId1;
    }

    /**
     * Sets Azure Subscription ID.
     *
     * @param subscriptionId1 the subscriptionId1 value.
     * @return the service client itself
     */
    public BillingManagementClientImpl withSubscriptionId1(String subscriptionId1) {
        this.subscriptionId1 = subscriptionId1;
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
    public BillingManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public BillingManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public BillingManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The BillingAccountsInner object to access its operations.
     */
    private BillingAccountsInner billingAccounts;

    /**
     * Gets the BillingAccountsInner object to access its operations.
     * @return the BillingAccountsInner object.
     */
    public BillingAccountsInner billingAccounts() {
        return this.billingAccounts;
    }

    /**
     * The AddressInner object to access its operations.
     */
    private AddressInner address;

    /**
     * Gets the AddressInner object to access its operations.
     * @return the AddressInner object.
     */
    public AddressInner address() {
        return this.address;
    }

    /**
     * The AvailableBalancesInner object to access its operations.
     */
    private AvailableBalancesInner availableBalances;

    /**
     * Gets the AvailableBalancesInner object to access its operations.
     * @return the AvailableBalancesInner object.
     */
    public AvailableBalancesInner availableBalances() {
        return this.availableBalances;
    }

    /**
     * The InstructionsInner object to access its operations.
     */
    private InstructionsInner instructions;

    /**
     * Gets the InstructionsInner object to access its operations.
     * @return the InstructionsInner object.
     */
    public InstructionsInner instructions() {
        return this.instructions;
    }

    /**
     * The BillingProfilesInner object to access its operations.
     */
    private BillingProfilesInner billingProfiles;

    /**
     * Gets the BillingProfilesInner object to access its operations.
     * @return the BillingProfilesInner object.
     */
    public BillingProfilesInner billingProfiles() {
        return this.billingProfiles;
    }

    /**
     * The CustomersInner object to access its operations.
     */
    private CustomersInner customers;

    /**
     * Gets the CustomersInner object to access its operations.
     * @return the CustomersInner object.
     */
    public CustomersInner customers() {
        return this.customers;
    }

    /**
     * The InvoiceSectionsInner object to access its operations.
     */
    private InvoiceSectionsInner invoiceSections;

    /**
     * Gets the InvoiceSectionsInner object to access its operations.
     * @return the InvoiceSectionsInner object.
     */
    public InvoiceSectionsInner invoiceSections() {
        return this.invoiceSections;
    }

    /**
     * The BillingPermissionsInner object to access its operations.
     */
    private BillingPermissionsInner billingPermissions;

    /**
     * Gets the BillingPermissionsInner object to access its operations.
     * @return the BillingPermissionsInner object.
     */
    public BillingPermissionsInner billingPermissions() {
        return this.billingPermissions;
    }

    /**
     * The BillingSubscriptionsInner object to access its operations.
     */
    private BillingSubscriptionsInner billingSubscriptions;

    /**
     * Gets the BillingSubscriptionsInner object to access its operations.
     * @return the BillingSubscriptionsInner object.
     */
    public BillingSubscriptionsInner billingSubscriptions() {
        return this.billingSubscriptions;
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
     * The InvoicesInner object to access its operations.
     */
    private InvoicesInner invoices;

    /**
     * Gets the InvoicesInner object to access its operations.
     * @return the InvoicesInner object.
     */
    public InvoicesInner invoices() {
        return this.invoices;
    }

    /**
     * The TransactionsInner object to access its operations.
     */
    private TransactionsInner transactions;

    /**
     * Gets the TransactionsInner object to access its operations.
     * @return the TransactionsInner object.
     */
    public TransactionsInner transactions() {
        return this.transactions;
    }

    /**
     * The PoliciesInner object to access its operations.
     */
    private PoliciesInner policies;

    /**
     * Gets the PoliciesInner object to access its operations.
     * @return the PoliciesInner object.
     */
    public PoliciesInner policies() {
        return this.policies;
    }

    /**
     * The BillingPropertysInner object to access its operations.
     */
    private BillingPropertysInner billingPropertys;

    /**
     * Gets the BillingPropertysInner object to access its operations.
     * @return the BillingPropertysInner object.
     */
    public BillingPropertysInner billingPropertys() {
        return this.billingPropertys;
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
     * The BillingRoleDefinitionsInner object to access its operations.
     */
    private BillingRoleDefinitionsInner billingRoleDefinitions;

    /**
     * Gets the BillingRoleDefinitionsInner object to access its operations.
     * @return the BillingRoleDefinitionsInner object.
     */
    public BillingRoleDefinitionsInner billingRoleDefinitions() {
        return this.billingRoleDefinitions;
    }

    /**
     * The BillingRoleAssignmentsInner object to access its operations.
     */
    private BillingRoleAssignmentsInner billingRoleAssignments;

    /**
     * Gets the BillingRoleAssignmentsInner object to access its operations.
     * @return the BillingRoleAssignmentsInner object.
     */
    public BillingRoleAssignmentsInner billingRoleAssignments() {
        return this.billingRoleAssignments;
    }

    /**
     * The AgreementsInner object to access its operations.
     */
    private AgreementsInner agreements;

    /**
     * Gets the AgreementsInner object to access its operations.
     * @return the AgreementsInner object.
     */
    public AgreementsInner agreements() {
        return this.agreements;
    }

    /**
     * The EnrollmentAccountsInner object to access its operations.
     */
    private EnrollmentAccountsInner enrollmentAccounts;

    /**
     * Gets the EnrollmentAccountsInner object to access its operations.
     * @return the EnrollmentAccountsInner object.
     */
    public EnrollmentAccountsInner enrollmentAccounts() {
        return this.enrollmentAccounts;
    }

    /**
     * The BillingPeriodsInner object to access its operations.
     */
    private BillingPeriodsInner billingPeriods;

    /**
     * Gets the BillingPeriodsInner object to access its operations.
     * @return the BillingPeriodsInner object.
     */
    public BillingPeriodsInner billingPeriods() {
        return this.billingPeriods;
    }

    /**
     * Initializes an instance of BillingManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public BillingManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of BillingManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public BillingManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of BillingManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public BillingManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.billingAccounts = new BillingAccountsInner(restClient().retrofit(), this);
        this.address = new AddressInner(restClient().retrofit(), this);
        this.availableBalances = new AvailableBalancesInner(restClient().retrofit(), this);
        this.instructions = new InstructionsInner(restClient().retrofit(), this);
        this.billingProfiles = new BillingProfilesInner(restClient().retrofit(), this);
        this.customers = new CustomersInner(restClient().retrofit(), this);
        this.invoiceSections = new InvoiceSectionsInner(restClient().retrofit(), this);
        this.billingPermissions = new BillingPermissionsInner(restClient().retrofit(), this);
        this.billingSubscriptions = new BillingSubscriptionsInner(restClient().retrofit(), this);
        this.products = new ProductsInner(restClient().retrofit(), this);
        this.invoices = new InvoicesInner(restClient().retrofit(), this);
        this.transactions = new TransactionsInner(restClient().retrofit(), this);
        this.policies = new PoliciesInner(restClient().retrofit(), this);
        this.billingPropertys = new BillingPropertysInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.billingRoleDefinitions = new BillingRoleDefinitionsInner(restClient().retrofit(), this);
        this.billingRoleAssignments = new BillingRoleAssignmentsInner(restClient().retrofit(), this);
        this.agreements = new AgreementsInner(restClient().retrofit(), this);
        this.enrollmentAccounts = new EnrollmentAccountsInner(restClient().retrofit(), this);
        this.billingPeriods = new BillingPeriodsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "BillingManagementClient", "2020-05-01");
    }
}
