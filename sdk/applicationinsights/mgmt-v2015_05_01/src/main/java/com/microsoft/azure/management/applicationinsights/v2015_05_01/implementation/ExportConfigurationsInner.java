/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentExportRequest;
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
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ExportConfigurations.
 */
public class ExportConfigurationsInner {
    /** The Retrofit service to perform REST calls. */
    private ExportConfigurationsService service;
    /** The service client containing this operation class. */
    private ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of ExportConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExportConfigurationsInner(Retrofit retrofit, ApplicationInsightsManagementClientImpl client) {
        this.service = retrofit.create(ExportConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExportConfigurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExportConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ExportConfigurations list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/exportconfiguration")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ExportConfigurations create" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/exportconfiguration")
        Observable<Response<ResponseBody>> create(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Body ApplicationInsightsComponentExportRequest exportProperties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ExportConfigurations delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/exportconfiguration/{exportId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Path("exportId") String exportId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ExportConfigurations get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/exportconfiguration/{exportId}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Path("exportId") String exportId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ExportConfigurations update" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/exportconfiguration/{exportId}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Path("exportId") String exportId, @Query("api-version") String apiVersion, @Body ApplicationInsightsComponentExportRequest exportProperties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ApplicationInsightsComponentExportConfigurationInner&gt; object if successful.
     */
    public List<ApplicationInsightsComponentExportConfigurationInner> list(String resourceGroupName, String resourceName) {
        return listWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ApplicationInsightsComponentExportConfigurationInner>> listAsync(String resourceGroupName, String resourceName, final ServiceCallback<List<ApplicationInsightsComponentExportConfigurationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInsightsComponentExportConfigurationInner&gt; object
     */
    public Observable<List<ApplicationInsightsComponentExportConfigurationInner>> listAsync(String resourceGroupName, String resourceName) {
        return listWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>, List<ApplicationInsightsComponentExportConfigurationInner>>() {
            @Override
            public List<ApplicationInsightsComponentExportConfigurationInner> call(ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInsightsComponentExportConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>> listWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<ApplicationInsightsComponentExportConfigurationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ApplicationInsightsComponentExportConfigurationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ApplicationInsightsComponentExportConfigurationInner&gt; object if successful.
     */
    public List<ApplicationInsightsComponentExportConfigurationInner> create(String resourceGroupName, String resourceName, ApplicationInsightsComponentExportRequest exportProperties) {
        return createWithServiceResponseAsync(resourceGroupName, resourceName, exportProperties).toBlocking().single().body();
    }

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ApplicationInsightsComponentExportConfigurationInner>> createAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentExportRequest exportProperties, final ServiceCallback<List<ApplicationInsightsComponentExportConfigurationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, resourceName, exportProperties), serviceCallback);
    }

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInsightsComponentExportConfigurationInner&gt; object
     */
    public Observable<List<ApplicationInsightsComponentExportConfigurationInner>> createAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentExportRequest exportProperties) {
        return createWithServiceResponseAsync(resourceGroupName, resourceName, exportProperties).map(new Func1<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>, List<ApplicationInsightsComponentExportConfigurationInner>>() {
            @Override
            public List<ApplicationInsightsComponentExportConfigurationInner> call(ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInsightsComponentExportConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>> createWithServiceResponseAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentExportRequest exportProperties) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (exportProperties == null) {
            throw new IllegalArgumentException("Parameter exportProperties is required and cannot be null.");
        }
        Validator.validate(exportProperties);
        return service.create(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), exportProperties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ApplicationInsightsComponentExportConfigurationInner>> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<ApplicationInsightsComponentExportConfigurationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ApplicationInsightsComponentExportConfigurationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentExportConfigurationInner object if successful.
     */
    public ApplicationInsightsComponentExportConfigurationInner delete(String resourceGroupName, String resourceName, String exportId) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName, exportId).toBlocking().single().body();
    }

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentExportConfigurationInner> deleteAsync(String resourceGroupName, String resourceName, String exportId, final ServiceCallback<ApplicationInsightsComponentExportConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, resourceName, exportId), serviceCallback);
    }

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentExportConfigurationInner object
     */
    public Observable<ApplicationInsightsComponentExportConfigurationInner> deleteAsync(String resourceGroupName, String resourceName, String exportId) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName, exportId).map(new Func1<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>, ApplicationInsightsComponentExportConfigurationInner>() {
            @Override
            public ApplicationInsightsComponentExportConfigurationInner call(ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentExportConfigurationInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>> deleteWithServiceResponseAsync(String resourceGroupName, String resourceName, String exportId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (exportId == null) {
            throw new IllegalArgumentException("Parameter exportId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, this.client.subscriptionId(), resourceName, exportId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentExportConfigurationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentExportConfigurationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentExportConfigurationInner object if successful.
     */
    public ApplicationInsightsComponentExportConfigurationInner get(String resourceGroupName, String resourceName, String exportId) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName, exportId).toBlocking().single().body();
    }

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentExportConfigurationInner> getAsync(String resourceGroupName, String resourceName, String exportId, final ServiceCallback<ApplicationInsightsComponentExportConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, resourceName, exportId), serviceCallback);
    }

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentExportConfigurationInner object
     */
    public Observable<ApplicationInsightsComponentExportConfigurationInner> getAsync(String resourceGroupName, String resourceName, String exportId) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName, exportId).map(new Func1<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>, ApplicationInsightsComponentExportConfigurationInner>() {
            @Override
            public ApplicationInsightsComponentExportConfigurationInner call(ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentExportConfigurationInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>> getWithServiceResponseAsync(String resourceGroupName, String resourceName, String exportId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (exportId == null) {
            throw new IllegalArgumentException("Parameter exportId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, this.client.subscriptionId(), resourceName, exportId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentExportConfigurationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentExportConfigurationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentExportConfigurationInner object if successful.
     */
    public ApplicationInsightsComponentExportConfigurationInner update(String resourceGroupName, String resourceName, String exportId, ApplicationInsightsComponentExportRequest exportProperties) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceName, exportId, exportProperties).toBlocking().single().body();
    }

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentExportConfigurationInner> updateAsync(String resourceGroupName, String resourceName, String exportId, ApplicationInsightsComponentExportRequest exportProperties, final ServiceCallback<ApplicationInsightsComponentExportConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, resourceName, exportId, exportProperties), serviceCallback);
    }

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentExportConfigurationInner object
     */
    public Observable<ApplicationInsightsComponentExportConfigurationInner> updateAsync(String resourceGroupName, String resourceName, String exportId, ApplicationInsightsComponentExportRequest exportProperties) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceName, exportId, exportProperties).map(new Func1<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>, ApplicationInsightsComponentExportConfigurationInner>() {
            @Override
            public ApplicationInsightsComponentExportConfigurationInner call(ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentExportConfigurationInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>> updateWithServiceResponseAsync(String resourceGroupName, String resourceName, String exportId, ApplicationInsightsComponentExportRequest exportProperties) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (exportId == null) {
            throw new IllegalArgumentException("Parameter exportId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (exportProperties == null) {
            throw new IllegalArgumentException("Parameter exportProperties is required and cannot be null.");
        }
        Validator.validate(exportProperties);
        return service.update(resourceGroupName, this.client.subscriptionId(), resourceName, exportId, this.client.apiVersion(), exportProperties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentExportConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentExportConfigurationInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentExportConfigurationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentExportConfigurationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
