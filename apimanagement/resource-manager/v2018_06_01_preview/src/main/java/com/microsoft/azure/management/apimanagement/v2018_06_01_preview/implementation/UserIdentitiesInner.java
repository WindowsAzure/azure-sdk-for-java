/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ErrorResponseException;
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
 * in UserIdentities.
 */
public class UserIdentitiesInner {
    /** The Retrofit service to perform REST calls. */
    private UserIdentitiesService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of UserIdentitiesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UserIdentitiesInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(UserIdentitiesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for UserIdentities to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UserIdentitiesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserIdentities list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/users/{userId}/identities")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("userId") String userId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserIdentities listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List of all user identities.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UserIdentityContractInner&gt; object if successful.
     */
    public PagedList<UserIdentityContractInner> list(final String resourceGroupName, final String serviceName, final String userId) {
        ServiceResponse<Page<UserIdentityContractInner>> response = listSinglePageAsync(resourceGroupName, serviceName, userId).toBlocking().single();
        return new PagedList<UserIdentityContractInner>(response.body()) {
            @Override
            public Page<UserIdentityContractInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List of all user identities.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UserIdentityContractInner>> listAsync(final String resourceGroupName, final String serviceName, final String userId, final ListOperationCallback<UserIdentityContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, serviceName, userId),
            new Func1<String, Observable<ServiceResponse<Page<UserIdentityContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UserIdentityContractInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List of all user identities.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UserIdentityContractInner&gt; object
     */
    public Observable<Page<UserIdentityContractInner>> listAsync(final String resourceGroupName, final String serviceName, final String userId) {
        return listWithServiceResponseAsync(resourceGroupName, serviceName, userId)
            .map(new Func1<ServiceResponse<Page<UserIdentityContractInner>>, Page<UserIdentityContractInner>>() {
                @Override
                public Page<UserIdentityContractInner> call(ServiceResponse<Page<UserIdentityContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List of all user identities.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UserIdentityContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<UserIdentityContractInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String userId) {
        return listSinglePageAsync(resourceGroupName, serviceName, userId)
            .concatMap(new Func1<ServiceResponse<Page<UserIdentityContractInner>>, Observable<ServiceResponse<Page<UserIdentityContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UserIdentityContractInner>>> call(ServiceResponse<Page<UserIdentityContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List of all user identities.
     *
    ServiceResponse<PageImpl<UserIdentityContractInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<UserIdentityContractInner>> * @param serviceName The name of the API Management service.
    ServiceResponse<PageImpl<UserIdentityContractInner>> * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UserIdentityContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UserIdentityContractInner>>> listSinglePageAsync(final String resourceGroupName, final String serviceName, final String userId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (userId == null) {
            throw new IllegalArgumentException("Parameter userId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        return service.list(resourceGroupName, serviceName, userId, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UserIdentityContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UserIdentityContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UserIdentityContractInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UserIdentityContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UserIdentityContractInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UserIdentityContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UserIdentityContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * List of all user identities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UserIdentityContractInner&gt; object if successful.
     */
    public PagedList<UserIdentityContractInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<UserIdentityContractInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<UserIdentityContractInner>(response.body()) {
            @Override
            public Page<UserIdentityContractInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List of all user identities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UserIdentityContractInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<UserIdentityContractInner>> serviceFuture, final ListOperationCallback<UserIdentityContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<UserIdentityContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UserIdentityContractInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List of all user identities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UserIdentityContractInner&gt; object
     */
    public Observable<Page<UserIdentityContractInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<UserIdentityContractInner>>, Page<UserIdentityContractInner>>() {
                @Override
                public Page<UserIdentityContractInner> call(ServiceResponse<Page<UserIdentityContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List of all user identities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UserIdentityContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<UserIdentityContractInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<UserIdentityContractInner>>, Observable<ServiceResponse<Page<UserIdentityContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UserIdentityContractInner>>> call(ServiceResponse<Page<UserIdentityContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List of all user identities.
     *
    ServiceResponse<PageImpl<UserIdentityContractInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UserIdentityContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UserIdentityContractInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UserIdentityContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UserIdentityContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UserIdentityContractInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UserIdentityContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UserIdentityContractInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UserIdentityContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UserIdentityContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
