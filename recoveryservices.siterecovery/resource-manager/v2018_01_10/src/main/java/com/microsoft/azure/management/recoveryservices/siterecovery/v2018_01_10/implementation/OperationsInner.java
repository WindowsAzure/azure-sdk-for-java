/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, SiteRecoveryManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.Operations listByResourceGroup" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/operations")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.Operations listByResourceGroupNext" })
        @GET
        Observable<Response<ResponseBody>> listByResourceGroupNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationsDiscoveryInner&gt; object if successful.
     */
    public PagedList<OperationsDiscoveryInner> listByResourceGroup() {
        ServiceResponse<Page<OperationsDiscoveryInner>> response = listByResourceGroupSinglePageAsync().toBlocking().single();
        return new PagedList<OperationsDiscoveryInner>(response.body()) {
            @Override
            public Page<OperationsDiscoveryInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationsDiscoveryInner>> listByResourceGroupAsync(final ListOperationCallback<OperationsDiscoveryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationsDiscoveryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationsDiscoveryInner&gt; object
     */
    public Observable<Page<OperationsDiscoveryInner>> listByResourceGroupAsync() {
        return listByResourceGroupWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationsDiscoveryInner>>, Page<OperationsDiscoveryInner>>() {
                @Override
                public Page<OperationsDiscoveryInner> call(ServiceResponse<Page<OperationsDiscoveryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationsDiscoveryInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> listByResourceGroupWithServiceResponseAsync() {
        return listByResourceGroupSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationsDiscoveryInner>>, Observable<ServiceResponse<Page<OperationsDiscoveryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> call(ServiceResponse<Page<OperationsDiscoveryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationsDiscoveryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> listByResourceGroupSinglePageAsync() {
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByResourceGroup(this.client.resourceGroupName(), this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationsDiscoveryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationsDiscoveryInner>> result = listByResourceGroupDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationsDiscoveryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationsDiscoveryInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationsDiscoveryInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationsDiscoveryInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationsDiscoveryInner&gt; object if successful.
     */
    public PagedList<OperationsDiscoveryInner> listByResourceGroupNext(final String nextPageLink) {
        ServiceResponse<Page<OperationsDiscoveryInner>> response = listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationsDiscoveryInner>(response.body()) {
            @Override
            public Page<OperationsDiscoveryInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationsDiscoveryInner>> listByResourceGroupNextAsync(final String nextPageLink, final ServiceFuture<List<OperationsDiscoveryInner>> serviceFuture, final ListOperationCallback<OperationsDiscoveryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationsDiscoveryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationsDiscoveryInner&gt; object
     */
    public Observable<Page<OperationsDiscoveryInner>> listByResourceGroupNextAsync(final String nextPageLink) {
        return listByResourceGroupNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationsDiscoveryInner>>, Page<OperationsDiscoveryInner>>() {
                @Override
                public Page<OperationsDiscoveryInner> call(ServiceResponse<Page<OperationsDiscoveryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationsDiscoveryInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> listByResourceGroupNextWithServiceResponseAsync(final String nextPageLink) {
        return listByResourceGroupNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationsDiscoveryInner>>, Observable<ServiceResponse<Page<OperationsDiscoveryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> call(ServiceResponse<Page<OperationsDiscoveryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns the list of available operations.
     * Operation to return the list of available operations.
     *
    ServiceResponse<PageImpl<OperationsDiscoveryInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationsDiscoveryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> listByResourceGroupNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceGroupNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationsDiscoveryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationsDiscoveryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationsDiscoveryInner>> result = listByResourceGroupNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationsDiscoveryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationsDiscoveryInner>> listByResourceGroupNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationsDiscoveryInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationsDiscoveryInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
