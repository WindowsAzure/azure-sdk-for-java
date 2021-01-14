/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Configurations.
 */
public class ConfigurationsInner {
    /** The Retrofit service to perform REST calls. */
    private ConfigurationsService service;
    /** The service client containing this operation class. */
    private MySQLManagementClientImpl client;

    /**
     * Initializes an instance of ConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ConfigurationsInner(Retrofit retrofit, MySQLManagementClientImpl client) {
        this.service = retrofit.create(ConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Configurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.Configurations createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForMySQL/servers/{serverName}/configurations/{configurationName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("configurationName") String configurationName, @Query("api-version") String apiVersion, @Body ConfigurationInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.Configurations beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForMySQL/servers/{serverName}/configurations/{configurationName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("configurationName") String configurationName, @Query("api-version") String apiVersion, @Body ConfigurationInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.Configurations get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForMySQL/servers/{serverName}/configurations/{configurationName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("configurationName") String configurationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.Configurations listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForMySQL/servers/{serverName}/configurations")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationInner object if successful.
     */
    public ConfigurationInner createOrUpdate(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, configurationName, parameters).toBlocking().last().body();
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationInner> createOrUpdateAsync(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters, final ServiceCallback<ConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, configurationName, parameters), serviceCallback);
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ConfigurationInner> createOrUpdateAsync(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, configurationName, parameters).map(new Func1<ServiceResponse<ConfigurationInner>, ConfigurationInner>() {
            @Override
            public ConfigurationInner call(ServiceResponse<ConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ConfigurationInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (configurationName == null) {
            throw new IllegalArgumentException("Parameter configurationName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2017-12-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, configurationName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ConfigurationInner>() { }.getType());
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationInner object if successful.
     */
    public ConfigurationInner beginCreateOrUpdate(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, configurationName, parameters).toBlocking().single().body();
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters, final ServiceCallback<ConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, configurationName, parameters), serviceCallback);
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationInner object
     */
    public Observable<ConfigurationInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, configurationName, parameters).map(new Func1<ServiceResponse<ConfigurationInner>, ConfigurationInner>() {
            @Override
            public ConfigurationInner call(ServiceResponse<ConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationInner object
     */
    public Observable<ServiceResponse<ConfigurationInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (configurationName == null) {
            throw new IllegalArgumentException("Parameter configurationName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2017-12-01";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, configurationName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConfigurationInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConfigurationInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConfigurationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConfigurationInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationInner object if successful.
     */
    public ConfigurationInner get(String resourceGroupName, String serverName, String configurationName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, configurationName).toBlocking().single().body();
    }

    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationInner> getAsync(String resourceGroupName, String serverName, String configurationName, final ServiceCallback<ConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, configurationName), serviceCallback);
    }

    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationInner object
     */
    public Observable<ConfigurationInner> getAsync(String resourceGroupName, String serverName, String configurationName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, configurationName).map(new Func1<ServiceResponse<ConfigurationInner>, ConfigurationInner>() {
            @Override
            public ConfigurationInner call(ServiceResponse<ConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationInner object
     */
    public Observable<ServiceResponse<ConfigurationInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String configurationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (configurationName == null) {
            throw new IllegalArgumentException("Parameter configurationName is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, configurationName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConfigurationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConfigurationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConfigurationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConfigurationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ConfigurationInner&gt; object if successful.
     */
    public List<ConfigurationInner> listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ConfigurationInner>> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<List<ConfigurationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ConfigurationInner&gt; object
     */
    public Observable<List<ConfigurationInner>> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<ConfigurationInner>>, List<ConfigurationInner>>() {
            @Override
            public List<ConfigurationInner> call(ServiceResponse<List<ConfigurationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<List<ConfigurationInner>>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01";
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ConfigurationInner>> result = listByServerDelegate(response);
                        List<ConfigurationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ConfigurationInner>> clientResponse = new ServiceResponse<List<ConfigurationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ConfigurationInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ConfigurationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ConfigurationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
