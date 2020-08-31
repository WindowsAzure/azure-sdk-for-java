/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_06_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.management.resources.v2019_06_01.ErrorResponseException;
import com.microsoft.azure.management.resources.v2019_06_01.ResourceName;
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
 * Initializes a new instance of the SubscriptionClientImpl class.
 */
public class SubscriptionClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The API version to use for the operation. */
    private String apiVersion;

    /**
     * Gets The API version to use for the operation.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
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
    public SubscriptionClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public SubscriptionClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public SubscriptionClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
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
     * The TenantsInner object to access its operations.
     */
    private TenantsInner tenants;

    /**
     * Gets the TenantsInner object to access its operations.
     * @return the TenantsInner object.
     */
    public TenantsInner tenants() {
        return this.tenants;
    }

    /**
     * Initializes an instance of SubscriptionClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SubscriptionClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SubscriptionClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SubscriptionClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SubscriptionClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SubscriptionClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-06-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.subscriptions = new SubscriptionsInner(restClient().retrofit(), this);
        this.tenants = new TenantsInner(restClient().retrofit(), this);
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
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "SubscriptionClient", "2019-06-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(SubscriptionClientService.class);
    }

    /**
     * The interface defining all the services for SubscriptionClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_06_01.SubscriptionClient checkResourceName" })
        @POST("providers/Microsoft.Resources/checkResourceName")
        Observable<Response<ResponseBody>> checkResourceName(@Body ResourceName resourceNameDefinition, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckResourceNameResultInner object if successful.
     */
    public CheckResourceNameResultInner checkResourceName() {
        return checkResourceNameWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckResourceNameResultInner> checkResourceNameAsync(final ServiceCallback<CheckResourceNameResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkResourceNameWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckResourceNameResultInner object
     */
    public Observable<CheckResourceNameResultInner> checkResourceNameAsync() {
        return checkResourceNameWithServiceResponseAsync().map(new Func1<ServiceResponse<CheckResourceNameResultInner>, CheckResourceNameResultInner>() {
            @Override
            public CheckResourceNameResultInner call(ServiceResponse<CheckResourceNameResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckResourceNameResultInner object
     */
    public Observable<ServiceResponse<CheckResourceNameResultInner>> checkResourceNameWithServiceResponseAsync() {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        final ResourceName resourceNameDefinition = null;
        return service.checkResourceName(resourceNameDefinition, this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckResourceNameResultInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckResourceNameResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckResourceNameResultInner> clientResponse = checkResourceNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckResourceNameResultInner object if successful.
     */
    public CheckResourceNameResultInner checkResourceName(ResourceName resourceNameDefinition) {
        return checkResourceNameWithServiceResponseAsync(resourceNameDefinition).toBlocking().single().body();
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckResourceNameResultInner> checkResourceNameAsync(ResourceName resourceNameDefinition, final ServiceCallback<CheckResourceNameResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkResourceNameWithServiceResponseAsync(resourceNameDefinition), serviceCallback);
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckResourceNameResultInner object
     */
    public Observable<CheckResourceNameResultInner> checkResourceNameAsync(ResourceName resourceNameDefinition) {
        return checkResourceNameWithServiceResponseAsync(resourceNameDefinition).map(new Func1<ServiceResponse<CheckResourceNameResultInner>, CheckResourceNameResultInner>() {
            @Override
            public CheckResourceNameResultInner call(ServiceResponse<CheckResourceNameResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks resource name validity.
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckResourceNameResultInner object
     */
    public Observable<ServiceResponse<CheckResourceNameResultInner>> checkResourceNameWithServiceResponseAsync(ResourceName resourceNameDefinition) {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        Validator.validate(resourceNameDefinition);
        return service.checkResourceName(resourceNameDefinition, this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckResourceNameResultInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckResourceNameResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckResourceNameResultInner> clientResponse = checkResourceNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckResourceNameResultInner> checkResourceNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckResourceNameResultInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckResourceNameResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
