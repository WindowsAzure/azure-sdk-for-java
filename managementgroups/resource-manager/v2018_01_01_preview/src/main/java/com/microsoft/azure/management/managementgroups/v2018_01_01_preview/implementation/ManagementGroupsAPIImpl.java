/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.CheckNameAvailabilityRequest;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ErrorResponseException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the ManagementGroupsAPIImpl class.
 */
public class ManagementGroupsAPIImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private ManagementGroupsAPIService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Version of the API to be used with the client request. The current version is 2018-01-01-preview. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. The current version is 2018-01-01-preview.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The id of the operation result. Possible values include: 'create', 'delete'. */
    private String operationResultId;

    /**
     * Gets The id of the operation result. Possible values include: 'create', 'delete'.
     *
     * @return the operationResultId value.
     */
    public String operationResultId() {
        return this.operationResultId;
    }

    /**
     * Sets The id of the operation result. Possible values include: 'create', 'delete'.
     *
     * @param operationResultId the operationResultId value.
     * @return the service client itself
     */
    public ManagementGroupsAPIImpl withOperationResultId(String operationResultId) {
        this.operationResultId = operationResultId;
        return this;
    }

    /** Page continuation token is only used if a previous operation returned a partial result.
    If a previous response contains a nextLink element, the value of the nextLink element will include a token parameter that specifies a starting point to use for subsequent calls. */
    private String skiptoken;

    /**
     * Gets Page continuation token is only used if a previous operation returned a partial result.
     If a previous response contains a nextLink element, the value of the nextLink element will include a token parameter that specifies a starting point to use for subsequent calls.
     *
     * @return the skiptoken value.
     */
    public String skiptoken() {
        return this.skiptoken;
    }

    /**
     * Sets Page continuation token is only used if a previous operation returned a partial result.
     If a previous response contains a nextLink element, the value of the nextLink element will include a token parameter that specifies a starting point to use for subsequent calls.
     *
     * @param skiptoken the skiptoken value.
     * @return the service client itself
     */
    public ManagementGroupsAPIImpl withSkiptoken(String skiptoken) {
        this.skiptoken = skiptoken;
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
    public ManagementGroupsAPIImpl withAcceptLanguage(String acceptLanguage) {
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
    public ManagementGroupsAPIImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public ManagementGroupsAPIImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ManagementGroupsInner object to access its operations.
     */
    private ManagementGroupsInner managementGroups;

    /**
     * Gets the ManagementGroupsInner object to access its operations.
     * @return the ManagementGroupsInner object.
     */
    public ManagementGroupsInner managementGroups() {
        return this.managementGroups;
    }

    /**
     * The ManagementGroupSubscriptionsInner object to access its operations.
     */
    private ManagementGroupSubscriptionsInner managementGroupSubscriptions;

    /**
     * Gets the ManagementGroupSubscriptionsInner object to access its operations.
     * @return the ManagementGroupSubscriptionsInner object.
     */
    public ManagementGroupSubscriptionsInner managementGroupSubscriptions() {
        return this.managementGroupSubscriptions;
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
     * The EntitiesInner object to access its operations.
     */
    private EntitiesInner entities;

    /**
     * Gets the EntitiesInner object to access its operations.
     * @return the EntitiesInner object.
     */
    public EntitiesInner entities() {
        return this.entities;
    }

    /**
     * Initializes an instance of ManagementGroupsAPI client.
     *
     * @param credentials the management credentials for Azure
     */
    public ManagementGroupsAPIImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ManagementGroupsAPI client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ManagementGroupsAPIImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ManagementGroupsAPI client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ManagementGroupsAPIImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-01-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.managementGroups = new ManagementGroupsInner(restClient().retrofit(), this);
        this.managementGroupSubscriptions = new ManagementGroupSubscriptionsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.entities = new EntitiesInner(restClient().retrofit(), this);
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
        return String.format("%s (%s, %s)", super.userAgent(), "ManagementGroupsAPI", "2018-01-01-preview");
    }

    private void initializeService() {
        service = restClient().retrofit().create(ManagementGroupsAPIService.class);
    }

    /**
     * The interface defining all the services for ManagementGroupsAPI to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagementGroupsAPIService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ManagementGroupsAPI checkNameAvailability" })
        @POST("providers/Microsoft.Management/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Query("api-version") String apiVersion, @Body CheckNameAvailabilityRequest checkNameAvailabilityRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckNameAvailabilityResultInner object if successful.
     */
    public CheckNameAvailabilityResultInner checkNameAvailability(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithServiceResponseAsync(checkNameAvailabilityRequest).toBlocking().single().body();
    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest, final ServiceCallback<CheckNameAvailabilityResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(checkNameAvailabilityRequest), serviceCallback);
    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityResultInner object
     */
    public Observable<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithServiceResponseAsync(checkNameAvailabilityRequest).map(new Func1<ServiceResponse<CheckNameAvailabilityResultInner>, CheckNameAvailabilityResultInner>() {
            @Override
            public CheckNameAvailabilityResultInner call(ServiceResponse<CheckNameAvailabilityResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityResultInner object
     */
    public Observable<ServiceResponse<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithServiceResponseAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (checkNameAvailabilityRequest == null) {
            throw new IllegalArgumentException("Parameter checkNameAvailabilityRequest is required and cannot be null.");
        }
        Validator.validate(checkNameAvailabilityRequest);
        return service.checkNameAvailability(this.apiVersion(), checkNameAvailabilityRequest, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckNameAvailabilityResultInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckNameAvailabilityResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckNameAvailabilityResultInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckNameAvailabilityResultInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckNameAvailabilityResultInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckNameAvailabilityResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
