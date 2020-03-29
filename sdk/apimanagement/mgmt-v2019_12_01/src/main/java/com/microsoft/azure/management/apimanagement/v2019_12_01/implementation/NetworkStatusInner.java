/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ErrorResponseException;
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
 * in NetworkStatus.
 */
public class NetworkStatusInner {
    /** The Retrofit service to perform REST calls. */
    private NetworkStatusService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of NetworkStatusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NetworkStatusInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(NetworkStatusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkStatus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkStatusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.NetworkStatus listByService" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/networkstatus")
        Observable<Response<ResponseBody>> listByService(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.NetworkStatus listByLocation" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/locations/{locationName}/networkstatus")
        Observable<Response<ResponseBody>> listByLocation(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("locationName") String locationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;NetworkStatusContractByLocationInner&gt; object if successful.
     */
    public List<NetworkStatusContractByLocationInner> listByService(String resourceGroupName, String serviceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkStatusContractByLocationInner>> listByServiceAsync(String resourceGroupName, String serviceName, final ServiceCallback<List<NetworkStatusContractByLocationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServiceWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;NetworkStatusContractByLocationInner&gt; object
     */
    public Observable<List<NetworkStatusContractByLocationInner>> listByServiceAsync(String resourceGroupName, String serviceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<List<NetworkStatusContractByLocationInner>>, List<NetworkStatusContractByLocationInner>>() {
            @Override
            public List<NetworkStatusContractByLocationInner> call(ServiceResponse<List<NetworkStatusContractByLocationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;NetworkStatusContractByLocationInner&gt; object
     */
    public Observable<ServiceResponse<List<NetworkStatusContractByLocationInner>>> listByServiceWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByService(this.client.subscriptionId(), resourceGroupName, serviceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<NetworkStatusContractByLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<NetworkStatusContractByLocationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<NetworkStatusContractByLocationInner>> clientResponse = listByServiceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<NetworkStatusContractByLocationInner>> listByServiceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<NetworkStatusContractByLocationInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<NetworkStatusContractByLocationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkStatusContractInner object if successful.
     */
    public NetworkStatusContractInner listByLocation(String resourceGroupName, String serviceName, String locationName) {
        return listByLocationWithServiceResponseAsync(resourceGroupName, serviceName, locationName).toBlocking().single().body();
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions like West US, East US, South Central US.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkStatusContractInner> listByLocationAsync(String resourceGroupName, String serviceName, String locationName, final ServiceCallback<NetworkStatusContractInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByLocationWithServiceResponseAsync(resourceGroupName, serviceName, locationName), serviceCallback);
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkStatusContractInner object
     */
    public Observable<NetworkStatusContractInner> listByLocationAsync(String resourceGroupName, String serviceName, String locationName) {
        return listByLocationWithServiceResponseAsync(resourceGroupName, serviceName, locationName).map(new Func1<ServiceResponse<NetworkStatusContractInner>, NetworkStatusContractInner>() {
            @Override
            public NetworkStatusContractInner call(ServiceResponse<NetworkStatusContractInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkStatusContractInner object
     */
    public Observable<ServiceResponse<NetworkStatusContractInner>> listByLocationWithServiceResponseAsync(String resourceGroupName, String serviceName, String locationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByLocation(this.client.subscriptionId(), resourceGroupName, serviceName, locationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkStatusContractInner>>>() {
                @Override
                public Observable<ServiceResponse<NetworkStatusContractInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkStatusContractInner> clientResponse = listByLocationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkStatusContractInner> listByLocationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkStatusContractInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkStatusContractInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
