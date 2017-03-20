/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the SqlManagementClientImpl class.
 */
public class SqlManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private SqlManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID that identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID that identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The CapabilitiesInner object to access its operations.
     */
    private CapabilitiesInner capabilities;

    /**
     * Gets the CapabilitiesInner object to access its operations.
     * @return the CapabilitiesInner object.
     */
    public CapabilitiesInner capabilities() {
        return this.capabilities;
    }

    /**
     * The FirewallRulesInner object to access its operations.
     */
    private FirewallRulesInner firewallRules;

    /**
     * Gets the FirewallRulesInner object to access its operations.
     * @return the FirewallRulesInner object.
     */
    public FirewallRulesInner firewallRules() {
        return this.firewallRules;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The ServersInner object to access its operations.
     */
    private ServersInner servers;

    /**
     * Gets the ServersInner object to access its operations.
     * @return the ServersInner object.
     */
    public ServersInner servers() {
        return this.servers;
    }

    /**
     * The ElasticPoolsInner object to access its operations.
     */
    private ElasticPoolsInner elasticPools;

    /**
     * Gets the ElasticPoolsInner object to access its operations.
     * @return the ElasticPoolsInner object.
     */
    public ElasticPoolsInner elasticPools() {
        return this.elasticPools;
    }

    /**
     * The RecommendedElasticPoolsInner object to access its operations.
     */
    private RecommendedElasticPoolsInner recommendedElasticPools;

    /**
     * Gets the RecommendedElasticPoolsInner object to access its operations.
     * @return the RecommendedElasticPoolsInner object.
     */
    public RecommendedElasticPoolsInner recommendedElasticPools() {
        return this.recommendedElasticPools;
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SqlManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.capabilities = new CapabilitiesInner(restClient().retrofit(), this);
        this.firewallRules = new FirewallRulesInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.servers = new ServersInner(restClient().retrofit(), this);
        this.elasticPools = new ElasticPoolsInner(restClient().retrofit(), this);
        this.recommendedElasticPools = new RecommendedElasticPoolsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s (%s)",
                getClass().getPackage().getImplementationVersion(),
                "SqlManagementClient, ");
    }

    private void initializeService() {
        service = restClient().retrofit().create(SqlManagementClientService.class);
    }

    /**
     * The interface defining all the services for SqlManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.SqlManagementClient listOperations" })
        @GET("providers/Microsoft.Sql/operations")
        Observable<Response<ResponseBody>> listOperations(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all of the available SQL Rest API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationListResultInner object if successful.
     */
    public OperationListResultInner listOperations() {
        return listOperationsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists all of the available SQL Rest API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationListResultInner> listOperationsAsync(final ServiceCallback<OperationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listOperationsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists all of the available SQL Rest API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResultInner object
     */
    public Observable<OperationListResultInner> listOperationsAsync() {
        return listOperationsWithServiceResponseAsync().map(new Func1<ServiceResponse<OperationListResultInner>, OperationListResultInner>() {
            @Override
            public OperationListResultInner call(ServiceResponse<OperationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all of the available SQL Rest API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResultInner object
     */
    public Observable<ServiceResponse<OperationListResultInner>> listOperationsWithServiceResponseAsync() {
        final String apiVersion = "2014-04-01";
        return service.listOperations(apiVersion, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationListResultInner> clientResponse = listOperationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationListResultInner> listOperationsDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return this.restClient().responseBuilderFactory().<OperationListResultInner, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<OperationListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
