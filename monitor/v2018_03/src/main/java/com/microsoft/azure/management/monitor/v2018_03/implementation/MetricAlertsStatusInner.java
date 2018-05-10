/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.monitor.v2018_03.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MetricAlertsStatus.
 */
public class MetricAlertsStatusInner {
    /** The Retrofit service to perform REST calls. */
    private MetricAlertsStatusService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of MetricAlertsStatusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricAlertsStatusInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(MetricAlertsStatusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MetricAlertsStatus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricAlertsStatusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2018_03.MetricAlertsStatus list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts/{ruleName}/status")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2018_03.MetricAlertsStatus listByName" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/metricAlerts/{ruleName}/status/{statusName}")
        Observable<Response<ResponseBody>> listByName(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Path("statusName") String statusName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricAlertStatusCollectionInner object if successful.
     */
    public MetricAlertStatusCollectionInner list(String resourceGroupName, String ruleName) {
        return listWithServiceResponseAsync(resourceGroupName, ruleName).toBlocking().single().body();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricAlertStatusCollectionInner> listAsync(String resourceGroupName, String ruleName, final ServiceCallback<MetricAlertStatusCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, ruleName), serviceCallback);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertStatusCollectionInner object
     */
    public Observable<MetricAlertStatusCollectionInner> listAsync(String resourceGroupName, String ruleName) {
        return listWithServiceResponseAsync(resourceGroupName, ruleName).map(new Func1<ServiceResponse<MetricAlertStatusCollectionInner>, MetricAlertStatusCollectionInner>() {
            @Override
            public MetricAlertStatusCollectionInner call(ServiceResponse<MetricAlertStatusCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertStatusCollectionInner object
     */
    public Observable<ServiceResponse<MetricAlertStatusCollectionInner>> listWithServiceResponseAsync(String resourceGroupName, String ruleName) {
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
        return service.list(this.client.subscriptionId(), resourceGroupName, ruleName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricAlertStatusCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<MetricAlertStatusCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricAlertStatusCollectionInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricAlertStatusCollectionInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricAlertStatusCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricAlertStatusCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricAlertStatusCollectionInner object if successful.
     */
    public MetricAlertStatusCollectionInner listByName(String resourceGroupName, String ruleName, String statusName) {
        return listByNameWithServiceResponseAsync(resourceGroupName, ruleName, statusName).toBlocking().single().body();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricAlertStatusCollectionInner> listByNameAsync(String resourceGroupName, String ruleName, String statusName, final ServiceCallback<MetricAlertStatusCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByNameWithServiceResponseAsync(resourceGroupName, ruleName, statusName), serviceCallback);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertStatusCollectionInner object
     */
    public Observable<MetricAlertStatusCollectionInner> listByNameAsync(String resourceGroupName, String ruleName, String statusName) {
        return listByNameWithServiceResponseAsync(resourceGroupName, ruleName, statusName).map(new Func1<ServiceResponse<MetricAlertStatusCollectionInner>, MetricAlertStatusCollectionInner>() {
            @Override
            public MetricAlertStatusCollectionInner call(ServiceResponse<MetricAlertStatusCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricAlertStatusCollectionInner object
     */
    public Observable<ServiceResponse<MetricAlertStatusCollectionInner>> listByNameWithServiceResponseAsync(String resourceGroupName, String ruleName, String statusName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (statusName == null) {
            throw new IllegalArgumentException("Parameter statusName is required and cannot be null.");
        }
        final String apiVersion = "2018-03-01";
        return service.listByName(this.client.subscriptionId(), resourceGroupName, ruleName, statusName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricAlertStatusCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<MetricAlertStatusCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricAlertStatusCollectionInner> clientResponse = listByNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricAlertStatusCollectionInner> listByNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricAlertStatusCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricAlertStatusCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
