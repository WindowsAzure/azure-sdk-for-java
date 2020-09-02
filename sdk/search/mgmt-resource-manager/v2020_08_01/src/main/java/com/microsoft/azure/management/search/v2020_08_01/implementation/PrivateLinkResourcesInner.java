/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.search.v2020_08_01.SearchManagementRequestOptions;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
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
    private SearchManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesInner(Retrofit retrofit, SearchManagementClientImpl client) {
        this.service = retrofit.create(PrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.search.v2020_08_01.PrivateLinkResources listSupported" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{searchServiceName}/privateLinkResources")
        Observable<Response<ResponseBody>> listSupported(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("searchServiceName") String searchServiceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("x-ms-client-request-id") UUID clientRequestId, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PrivateLinkResourceInner&gt; object if successful.
     */
    public List<PrivateLinkResourceInner> listSupported(String resourceGroupName, String searchServiceName) {
        return listSupportedWithServiceResponseAsync(resourceGroupName, searchServiceName).toBlocking().single().body();
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateLinkResourceInner>> listSupportedAsync(String resourceGroupName, String searchServiceName, final ServiceCallback<List<PrivateLinkResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listSupportedWithServiceResponseAsync(resourceGroupName, searchServiceName), serviceCallback);
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<List<PrivateLinkResourceInner>> listSupportedAsync(String resourceGroupName, String searchServiceName) {
        return listSupportedWithServiceResponseAsync(resourceGroupName, searchServiceName).map(new Func1<ServiceResponse<List<PrivateLinkResourceInner>>, List<PrivateLinkResourceInner>>() {
            @Override
            public List<PrivateLinkResourceInner> call(ServiceResponse<List<PrivateLinkResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<PrivateLinkResourceInner>>> listSupportedWithServiceResponseAsync(String resourceGroupName, String searchServiceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (searchServiceName == null) {
            throw new IllegalArgumentException("Parameter searchServiceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final SearchManagementRequestOptions searchManagementRequestOptions = null;
        UUID clientRequestId = null;
        return service.listSupported(this.client.subscriptionId(), resourceGroupName, searchServiceName, this.client.apiVersion(), this.client.acceptLanguage(), clientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PrivateLinkResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PrivateLinkResourceInner>> result = listSupportedDelegate(response);
                        List<PrivateLinkResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PrivateLinkResourceInner>> clientResponse = new ServiceResponse<List<PrivateLinkResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PrivateLinkResourceInner&gt; object if successful.
     */
    public List<PrivateLinkResourceInner> listSupported(String resourceGroupName, String searchServiceName, SearchManagementRequestOptions searchManagementRequestOptions) {
        return listSupportedWithServiceResponseAsync(resourceGroupName, searchServiceName, searchManagementRequestOptions).toBlocking().single().body();
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateLinkResourceInner>> listSupportedAsync(String resourceGroupName, String searchServiceName, SearchManagementRequestOptions searchManagementRequestOptions, final ServiceCallback<List<PrivateLinkResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listSupportedWithServiceResponseAsync(resourceGroupName, searchServiceName, searchManagementRequestOptions), serviceCallback);
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<List<PrivateLinkResourceInner>> listSupportedAsync(String resourceGroupName, String searchServiceName, SearchManagementRequestOptions searchManagementRequestOptions) {
        return listSupportedWithServiceResponseAsync(resourceGroupName, searchServiceName, searchManagementRequestOptions).map(new Func1<ServiceResponse<List<PrivateLinkResourceInner>>, List<PrivateLinkResourceInner>>() {
            @Override
            public List<PrivateLinkResourceInner> call(ServiceResponse<List<PrivateLinkResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<PrivateLinkResourceInner>>> listSupportedWithServiceResponseAsync(String resourceGroupName, String searchServiceName, SearchManagementRequestOptions searchManagementRequestOptions) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (searchServiceName == null) {
            throw new IllegalArgumentException("Parameter searchServiceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(searchManagementRequestOptions);
        UUID clientRequestId = null;
        if (searchManagementRequestOptions != null) {
            clientRequestId = searchManagementRequestOptions.clientRequestId();
        }
        return service.listSupported(this.client.subscriptionId(), resourceGroupName, searchServiceName, this.client.apiVersion(), this.client.acceptLanguage(), clientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PrivateLinkResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PrivateLinkResourceInner>> result = listSupportedDelegate(response);
                        List<PrivateLinkResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PrivateLinkResourceInner>> clientResponse = new ServiceResponse<List<PrivateLinkResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PrivateLinkResourceInner>> listSupportedDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PrivateLinkResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PrivateLinkResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
