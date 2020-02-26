/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyCreateOrUpdateParameters;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyUpdateParameters;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AccessPolicies.
 */
public class AccessPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private AccessPoliciesService service;
    /** The service client containing this operation class. */
    private TimeSeriesInsightsClientImpl client;

    /**
     * Initializes an instance of AccessPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AccessPoliciesInner(Retrofit retrofit, TimeSeriesInsightsClientImpl client) {
        this.service = retrofit.create(AccessPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AccessPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AccessPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.TimeSeriesInsights/environments/{environmentName}/accessPolicies/{accessPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("environmentName") String environmentName, @Path("accessPolicyName") String accessPolicyName, @Query("api-version") String apiVersion, @Body AccessPolicyCreateOrUpdateParameters parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.TimeSeriesInsights/environments/{environmentName}/accessPolicies/{accessPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("environmentName") String environmentName, @Path("accessPolicyName") String accessPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicies update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.TimeSeriesInsights/environments/{environmentName}/accessPolicies/{accessPolicyName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("environmentName") String environmentName, @Path("accessPolicyName") String accessPolicyName, @Query("api-version") String apiVersion, @Body AccessPolicyUpdateParameters accessPolicyUpdateParameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicies delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.TimeSeriesInsights/environments/{environmentName}/accessPolicies/{accessPolicyName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("environmentName") String environmentName, @Path("accessPolicyName") String accessPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicies listByEnvironment" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.TimeSeriesInsights/environments/{environmentName}/accessPolicies")
        Observable<Response<ResponseBody>> listByEnvironment(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("environmentName") String environmentName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create or update an access policy in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName Name of the access policy.
     * @param parameters Parameters for creating an access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessPolicyResourceInner object if successful.
     */
    public AccessPolicyResourceInner createOrUpdate(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyCreateOrUpdateParameters parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update an access policy in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName Name of the access policy.
     * @param parameters Parameters for creating an access policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessPolicyResourceInner> createOrUpdateAsync(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyCreateOrUpdateParameters parameters, final ServiceCallback<AccessPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName, parameters), serviceCallback);
    }

    /**
     * Create or update an access policy in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName Name of the access policy.
     * @param parameters Parameters for creating an access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyResourceInner object
     */
    public Observable<AccessPolicyResourceInner> createOrUpdateAsync(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyCreateOrUpdateParameters parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName, parameters).map(new Func1<ServiceResponse<AccessPolicyResourceInner>, AccessPolicyResourceInner>() {
            @Override
            public AccessPolicyResourceInner call(ServiceResponse<AccessPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update an access policy in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName Name of the access policy.
     * @param parameters Parameters for creating an access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyResourceInner object
     */
    public Observable<ServiceResponse<AccessPolicyResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyCreateOrUpdateParameters parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (environmentName == null) {
            throw new IllegalArgumentException("Parameter environmentName is required and cannot be null.");
        }
        if (accessPolicyName == null) {
            throw new IllegalArgumentException("Parameter accessPolicyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, environmentName, accessPolicyName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<AccessPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessPolicyResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessPolicyResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessPolicyResourceInner>() { }.getType())
                .register(201, new TypeToken<AccessPolicyResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the access policy with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessPolicyResourceInner object if successful.
     */
    public AccessPolicyResourceInner get(String resourceGroupName, String environmentName, String accessPolicyName) {
        return getWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName).toBlocking().single().body();
    }

    /**
     * Gets the access policy with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessPolicyResourceInner> getAsync(String resourceGroupName, String environmentName, String accessPolicyName, final ServiceCallback<AccessPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName), serviceCallback);
    }

    /**
     * Gets the access policy with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyResourceInner object
     */
    public Observable<AccessPolicyResourceInner> getAsync(String resourceGroupName, String environmentName, String accessPolicyName) {
        return getWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName).map(new Func1<ServiceResponse<AccessPolicyResourceInner>, AccessPolicyResourceInner>() {
            @Override
            public AccessPolicyResourceInner call(ServiceResponse<AccessPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the access policy with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyResourceInner object
     */
    public Observable<ServiceResponse<AccessPolicyResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String environmentName, String accessPolicyName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (environmentName == null) {
            throw new IllegalArgumentException("Parameter environmentName is required and cannot be null.");
        }
        if (accessPolicyName == null) {
            throw new IllegalArgumentException("Parameter accessPolicyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, environmentName, accessPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<AccessPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessPolicyResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessPolicyResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessPolicyResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @param accessPolicyUpdateParameters Request object that contains the updated information for the access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessPolicyResourceInner object if successful.
     */
    public AccessPolicyResourceInner update(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyUpdateParameters accessPolicyUpdateParameters) {
        return updateWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName, accessPolicyUpdateParameters).toBlocking().single().body();
    }

    /**
     * Updates the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @param accessPolicyUpdateParameters Request object that contains the updated information for the access policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessPolicyResourceInner> updateAsync(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyUpdateParameters accessPolicyUpdateParameters, final ServiceCallback<AccessPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName, accessPolicyUpdateParameters), serviceCallback);
    }

    /**
     * Updates the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @param accessPolicyUpdateParameters Request object that contains the updated information for the access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyResourceInner object
     */
    public Observable<AccessPolicyResourceInner> updateAsync(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyUpdateParameters accessPolicyUpdateParameters) {
        return updateWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName, accessPolicyUpdateParameters).map(new Func1<ServiceResponse<AccessPolicyResourceInner>, AccessPolicyResourceInner>() {
            @Override
            public AccessPolicyResourceInner call(ServiceResponse<AccessPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @param accessPolicyUpdateParameters Request object that contains the updated information for the access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyResourceInner object
     */
    public Observable<ServiceResponse<AccessPolicyResourceInner>> updateWithServiceResponseAsync(String resourceGroupName, String environmentName, String accessPolicyName, AccessPolicyUpdateParameters accessPolicyUpdateParameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (environmentName == null) {
            throw new IllegalArgumentException("Parameter environmentName is required and cannot be null.");
        }
        if (accessPolicyName == null) {
            throw new IllegalArgumentException("Parameter accessPolicyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (accessPolicyUpdateParameters == null) {
            throw new IllegalArgumentException("Parameter accessPolicyUpdateParameters is required and cannot be null.");
        }
        Validator.validate(accessPolicyUpdateParameters);
        return service.update(this.client.subscriptionId(), resourceGroupName, environmentName, accessPolicyName, this.client.apiVersion(), accessPolicyUpdateParameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<AccessPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessPolicyResourceInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessPolicyResourceInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessPolicyResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String environmentName, String accessPolicyName) {
        deleteWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName).toBlocking().single().body();
    }

    /**
     * Deletes the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String environmentName, String accessPolicyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName), serviceCallback);
    }

    /**
     * Deletes the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String environmentName, String accessPolicyName) {
        return deleteWithServiceResponseAsync(resourceGroupName, environmentName, accessPolicyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String environmentName, String accessPolicyName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (environmentName == null) {
            throw new IllegalArgumentException("Parameter environmentName is required and cannot be null.");
        }
        if (accessPolicyName == null) {
            throw new IllegalArgumentException("Parameter accessPolicyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, environmentName, accessPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all the available access policies associated with the environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessPolicyListResponseInner object if successful.
     */
    public AccessPolicyListResponseInner listByEnvironment(String resourceGroupName, String environmentName) {
        return listByEnvironmentWithServiceResponseAsync(resourceGroupName, environmentName).toBlocking().single().body();
    }

    /**
     * Lists all the available access policies associated with the environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessPolicyListResponseInner> listByEnvironmentAsync(String resourceGroupName, String environmentName, final ServiceCallback<AccessPolicyListResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByEnvironmentWithServiceResponseAsync(resourceGroupName, environmentName), serviceCallback);
    }

    /**
     * Lists all the available access policies associated with the environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyListResponseInner object
     */
    public Observable<AccessPolicyListResponseInner> listByEnvironmentAsync(String resourceGroupName, String environmentName) {
        return listByEnvironmentWithServiceResponseAsync(resourceGroupName, environmentName).map(new Func1<ServiceResponse<AccessPolicyListResponseInner>, AccessPolicyListResponseInner>() {
            @Override
            public AccessPolicyListResponseInner call(ServiceResponse<AccessPolicyListResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the available access policies associated with the environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessPolicyListResponseInner object
     */
    public Observable<ServiceResponse<AccessPolicyListResponseInner>> listByEnvironmentWithServiceResponseAsync(String resourceGroupName, String environmentName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (environmentName == null) {
            throw new IllegalArgumentException("Parameter environmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByEnvironment(this.client.subscriptionId(), resourceGroupName, environmentName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessPolicyListResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<AccessPolicyListResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessPolicyListResponseInner> clientResponse = listByEnvironmentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessPolicyListResponseInner> listByEnvironmentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessPolicyListResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessPolicyListResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
