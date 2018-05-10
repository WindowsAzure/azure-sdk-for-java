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
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.monitor.v2018_03.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
 * in AlertRuleIncidents.
 */
public class AlertRuleIncidentsInner {
    /** The Retrofit service to perform REST calls. */
    private AlertRuleIncidentsService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of AlertRuleIncidentsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AlertRuleIncidentsInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(AlertRuleIncidentsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AlertRuleIncidents to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AlertRuleIncidentsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2018_03.AlertRuleIncidents get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/alertrules/{ruleName}/incidents/{incidentName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Path("incidentName") String incidentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2018_03.AlertRuleIncidents listByAlertRule" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/alertrules/{ruleName}/incidents")
        Observable<Response<ResponseBody>> listByAlertRule(@Path("resourceGroupName") String resourceGroupName, @Path("ruleName") String ruleName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IncidentInner object if successful.
     */
    public IncidentInner get(String resourceGroupName, String ruleName, String incidentName) {
        return getWithServiceResponseAsync(resourceGroupName, ruleName, incidentName).toBlocking().single().body();
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IncidentInner> getAsync(String resourceGroupName, String ruleName, String incidentName, final ServiceCallback<IncidentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, ruleName, incidentName), serviceCallback);
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IncidentInner object
     */
    public Observable<IncidentInner> getAsync(String resourceGroupName, String ruleName, String incidentName) {
        return getWithServiceResponseAsync(resourceGroupName, ruleName, incidentName).map(new Func1<ServiceResponse<IncidentInner>, IncidentInner>() {
            @Override
            public IncidentInner call(ServiceResponse<IncidentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IncidentInner object
     */
    public Observable<ServiceResponse<IncidentInner>> getWithServiceResponseAsync(String resourceGroupName, String ruleName, String incidentName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (incidentName == null) {
            throw new IllegalArgumentException("Parameter incidentName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-03-01";
        return service.get(resourceGroupName, ruleName, incidentName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IncidentInner>>>() {
                @Override
                public Observable<ServiceResponse<IncidentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IncidentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<IncidentInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<IncidentInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<IncidentInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;IncidentInner&gt; object if successful.
     */
    public List<IncidentInner> listByAlertRule(String resourceGroupName, String ruleName) {
        return listByAlertRuleWithServiceResponseAsync(resourceGroupName, ruleName).toBlocking().single().body();
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<IncidentInner>> listByAlertRuleAsync(String resourceGroupName, String ruleName, final ServiceCallback<List<IncidentInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByAlertRuleWithServiceResponseAsync(resourceGroupName, ruleName), serviceCallback);
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IncidentInner&gt; object
     */
    public Observable<List<IncidentInner>> listByAlertRuleAsync(String resourceGroupName, String ruleName) {
        return listByAlertRuleWithServiceResponseAsync(resourceGroupName, ruleName).map(new Func1<ServiceResponse<List<IncidentInner>>, List<IncidentInner>>() {
            @Override
            public List<IncidentInner> call(ServiceResponse<List<IncidentInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IncidentInner&gt; object
     */
    public Observable<ServiceResponse<List<IncidentInner>>> listByAlertRuleWithServiceResponseAsync(String resourceGroupName, String ruleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-03-01";
        return service.listByAlertRule(resourceGroupName, ruleName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<IncidentInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<IncidentInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<IncidentInner>> result = listByAlertRuleDelegate(response);
                        List<IncidentInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<IncidentInner>> clientResponse = new ServiceResponse<List<IncidentInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<IncidentInner>> listByAlertRuleDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<IncidentInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<IncidentInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
