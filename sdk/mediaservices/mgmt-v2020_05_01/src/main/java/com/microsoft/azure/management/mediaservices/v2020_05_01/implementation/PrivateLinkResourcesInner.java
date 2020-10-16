/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.mediaservices.v2020_05_01.ApiErrorException;
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
 * in PrivateLinkResources.
 */
public class PrivateLinkResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateLinkResourcesService service;
    /** The service client containing this operation class. */
    private AzureMediaServicesImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesInner(Retrofit retrofit, AzureMediaServicesImpl client) {
        this.service = retrofit.create(PrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mediaservices.v2020_05_01.PrivateLinkResources list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Media/mediaservices/{accountName}/privateLinkResources")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mediaservices.v2020_05_01.PrivateLinkResources get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Media/mediaservices/{accountName}/privateLinkResources/{name}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get list of group IDs.
     * Get list of group IDs.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceListResultInner object if successful.
     */
    public PrivateLinkResourceListResultInner list(String resourceGroupName, String accountName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Get list of group IDs.
     * Get list of group IDs.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceListResultInner> listAsync(String resourceGroupName, String accountName, final ServiceCallback<PrivateLinkResourceListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Get list of group IDs.
     * Get list of group IDs.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResultInner object
     */
    public Observable<PrivateLinkResourceListResultInner> listAsync(String resourceGroupName, String accountName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<PrivateLinkResourceListResultInner>, PrivateLinkResourceListResultInner>() {
            @Override
            public PrivateLinkResourceListResultInner call(ServiceResponse<PrivateLinkResourceListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get list of group IDs.
     * Get list of group IDs.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResultInner object
     */
    public Observable<ServiceResponse<PrivateLinkResourceListResultInner>> listWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, accountName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceListResultInner> listDelegate(Response<ResponseBody> response) throws ApiErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceListResultInner, ApiErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceListResultInner>() { }.getType())
                .registerError(ApiErrorException.class)
                .build(response);
    }

    /**
     * Get group ID.
     * Get group ID.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceInner object if successful.
     */
    public PrivateLinkResourceInner get(String resourceGroupName, String accountName, String name) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, name).toBlocking().single().body();
    }

    /**
     * Get group ID.
     * Get group ID.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceInner> getAsync(String resourceGroupName, String accountName, String name, final ServiceCallback<PrivateLinkResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, accountName, name), serviceCallback);
    }

    /**
     * Get group ID.
     * Get group ID.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceInner object
     */
    public Observable<PrivateLinkResourceInner> getAsync(String resourceGroupName, String accountName, String name) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, name).map(new Func1<ServiceResponse<PrivateLinkResourceInner>, PrivateLinkResourceInner>() {
            @Override
            public PrivateLinkResourceInner call(ServiceResponse<PrivateLinkResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get group ID.
     * Get group ID.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceInner object
     */
    public Observable<ServiceResponse<PrivateLinkResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String name) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, accountName, name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceInner> getDelegate(Response<ResponseBody> response) throws ApiErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceInner, ApiErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceInner>() { }.getType())
                .registerError(ApiErrorException.class)
                .build(response);
    }

}
