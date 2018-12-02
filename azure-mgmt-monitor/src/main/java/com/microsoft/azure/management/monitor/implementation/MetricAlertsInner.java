/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsGet;
import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import com.microsoft.azure.arm.collection.InnerSupportsListing;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.monitor.ErrorResponseException;
import com.microsoft.azure.management.monitor.MetricAlertResourcePatch;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
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
 * in MetricAlerts.
 */
public class MetricAlertsInner implements InnerSupportsGet<MetricAlertResourceInner>, InnerSupportsDelete<Void>, InnerSupportsListing<MetricAlertResourceInner> {
    /** The Retrofit service to perform REST calls. */
    private MetricAlertsService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of MetricAlertsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricAlertsInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(MetricAlertsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MetricAlerts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricAlertsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.MetricAlerts list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Insights/metricAlerts")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.MetricAlerts listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.MetricAlerts getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts/{ruleName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.MetricAlerts createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts/{ruleName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Query("api-version") String apiVersion, @Body MetricAlertResourceInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.MetricAlerts update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts/{ruleName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Query("api-version") String apiVersion, @Body MetricAlertResourcePatch parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.MetricAlerts delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts/{ruleName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieve alert rule definitions in a subscription.
     *
     * @return the PagedList<MetricAlertResourceInner> object if successful.
     */
    public PagedList<MetricAlertResourceInner> list() {
        PageImpl1<MetricAlertResourceInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<MetricAlertResourceInner>(page) {
            @Override
            public Page<MetricAlertResourceInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Retrieve alert rule definitions in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetricAlertResourceInner>> listAsync(final ServiceCallback<List<MetricAlertResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Retrieve alert rule definitions in a subscription.
     *
     * @return the observable to the List&lt;MetricAlertResourceInner&gt; object
     */
    public Observable<Page<MetricAlertResourceInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<MetricAlertResourceInner>>, Page<MetricAlertResourceInner>>() {
            @Override
            public Page<MetricAlertResourceInner> call(ServiceResponse<List<MetricAlertResourceInner>> response) {
                PageImpl1<MetricAlertResourceInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Retrieve alert rule definitions in a subscription.
     *
     * @return the observable to the List&lt;MetricAlertResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<MetricAlertResourceInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-03-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MetricAlertResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MetricAlertResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<MetricAlertResourceInner>> result = listDelegate(response);
                        List<MetricAlertResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MetricAlertResourceInner>> clientResponse = new ServiceResponse<List<MetricAlertResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<MetricAlertResourceInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<MetricAlertResourceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<MetricAlertResourceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieve alert rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the PagedList<MetricAlertResourceInner> object if successful.
     */
    public PagedList<MetricAlertResourceInner> listByResourceGroup(String resourceGroupName) {
        PageImpl1<MetricAlertResourceInner> page = new PageImpl1<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroupName).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<MetricAlertResourceInner>(page) {
            @Override
            public Page<MetricAlertResourceInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Retrieve alert rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetricAlertResourceInner>> listByResourceGroupAsync(String resourceGroupName, final ServiceCallback<List<MetricAlertResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Retrieve alert rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the observable to the List&lt;MetricAlertResourceInner&gt; object
     */
    public Observable<Page<MetricAlertResourceInner>> listByResourceGroupAsync(String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName).map(new Func1<ServiceResponse<List<MetricAlertResourceInner>>, Page<MetricAlertResourceInner>>() {
            @Override
            public Page<MetricAlertResourceInner> call(ServiceResponse<List<MetricAlertResourceInner>> response) {
                PageImpl1<MetricAlertResourceInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Retrieve alert rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the observable to the List&lt;MetricAlertResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<MetricAlertResourceInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        final String apiVersion = "2018-03-01";
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroupName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MetricAlertResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MetricAlertResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<MetricAlertResourceInner>> result = listByResourceGroupDelegate(response);
                        List<MetricAlertResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MetricAlertResourceInner>> clientResponse = new ServiceResponse<List<MetricAlertResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<MetricAlertResourceInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<MetricAlertResourceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<MetricAlertResourceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieve an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricAlertResourceInner object if successful.
     */
    public MetricAlertResourceInner getByResourceGroup(String resourceGroupName, String ruleName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, ruleName).toBlocking().single().body();
    }

    /**
     * Retrieve an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricAlertResourceInner> getByResourceGroupAsync(String resourceGroupName, String ruleName, final ServiceCallback<MetricAlertResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, ruleName), serviceCallback);
    }

    /**
     * Retrieve an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertResourceInner object
     */
    public Observable<MetricAlertResourceInner> getByResourceGroupAsync(String resourceGroupName, String ruleName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, ruleName).map(new Func1<ServiceResponse<MetricAlertResourceInner>, MetricAlertResourceInner>() {
            @Override
            public MetricAlertResourceInner call(ServiceResponse<MetricAlertResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertResourceInner object
     */
    public Observable<ServiceResponse<MetricAlertResourceInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String ruleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        final String apiVersion = "2018-03-01";
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, ruleName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricAlertResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<MetricAlertResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricAlertResourceInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricAlertResourceInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricAlertResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricAlertResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create or update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricAlertResourceInner object if successful.
     */
    public MetricAlertResourceInner createOrUpdate(String resourceGroupName, String ruleName, MetricAlertResourceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, ruleName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricAlertResourceInner> createOrUpdateAsync(String resourceGroupName, String ruleName, MetricAlertResourceInner parameters, final ServiceCallback<MetricAlertResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, ruleName, parameters), serviceCallback);
    }

    /**
     * Create or update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertResourceInner object
     */
    public Observable<MetricAlertResourceInner> createOrUpdateAsync(String resourceGroupName, String ruleName, MetricAlertResourceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, ruleName, parameters).map(new Func1<ServiceResponse<MetricAlertResourceInner>, MetricAlertResourceInner>() {
            @Override
            public MetricAlertResourceInner call(ServiceResponse<MetricAlertResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertResourceInner object
     */
    public Observable<ServiceResponse<MetricAlertResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String ruleName, MetricAlertResourceInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-03-01";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, ruleName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricAlertResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<MetricAlertResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricAlertResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricAlertResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricAlertResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricAlertResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricAlertResourceInner object if successful.
     */
    public MetricAlertResourceInner update(String resourceGroupName, String ruleName, MetricAlertResourcePatch parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, ruleName, parameters).toBlocking().single().body();
    }

    /**
     * Update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricAlertResourceInner> updateAsync(String resourceGroupName, String ruleName, MetricAlertResourcePatch parameters, final ServiceCallback<MetricAlertResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, ruleName, parameters), serviceCallback);
    }

    /**
     * Update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertResourceInner object
     */
    public Observable<MetricAlertResourceInner> updateAsync(String resourceGroupName, String ruleName, MetricAlertResourcePatch parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, ruleName, parameters).map(new Func1<ServiceResponse<MetricAlertResourceInner>, MetricAlertResourceInner>() {
            @Override
            public MetricAlertResourceInner call(ServiceResponse<MetricAlertResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertResourceInner object
     */
    public Observable<ServiceResponse<MetricAlertResourceInner>> updateWithServiceResponseAsync(String resourceGroupName, String ruleName, MetricAlertResourcePatch parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-03-01";
        return service.update(this.client.subscriptionId(), resourceGroupName, ruleName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricAlertResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<MetricAlertResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricAlertResourceInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricAlertResourceInner> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricAlertResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricAlertResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String ruleName) {
        deleteWithServiceResponseAsync(resourceGroupName, ruleName).toBlocking().single().body();
    }

    /**
     * Delete an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String ruleName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, ruleName), serviceCallback);
    }

    /**
     * Delete an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String ruleName) {
        return deleteWithServiceResponseAsync(resourceGroupName, ruleName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String ruleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        final String apiVersion = "2018-03-01";
        return service.delete(this.client.subscriptionId(), resourceGroupName, ruleName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
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

}
