/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.graphrbac.GraphErrorException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SignedInUsers.
 */
public class SignedInUsersInner {
    /** The Retrofit service to perform REST calls. */
    private SignedInUsersService service;
    /** The service client containing this operation class. */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of SignedInUsersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SignedInUsersInner(Retrofit retrofit, GraphRbacManagementClientImpl client) {
        this.service = retrofit.create(SignedInUsersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SignedInUsers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SignedInUsersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.SignedInUsers get" })
        @GET("{tenantID}/me")
        Observable<Response<ResponseBody>> get(@Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.SignedInUsers listOwnedObjects" })
        @GET("{tenantID}/me/ownedObjects")
        Observable<Response<ResponseBody>> listOwnedObjects(@Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.SignedInUsers listOwnedObjectsNext" })
        @GET
        Observable<Response<ResponseBody>> listOwnedObjectsNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the details for the currently logged-in user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UserInner object if successful.
     */
    public UserInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the details for the currently logged-in user.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UserInner> getAsync(final ServiceCallback<UserInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the details for the currently logged-in user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserInner object
     */
    public Observable<UserInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<UserInner>, UserInner>() {
            @Override
            public UserInner call(ServiceResponse<UserInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details for the currently logged-in user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserInner object
     */
    public Observable<ServiceResponse<UserInner>> getWithServiceResponseAsync() {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UserInner>>>() {
                @Override
                public Observable<ServiceResponse<UserInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UserInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UserInner> getDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<UserInner, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<UserInner>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DirectoryObjectInner&gt; object if successful.
     */
    public PagedList<DirectoryObjectInner> listOwnedObjects() {
        ServiceResponse<Page<DirectoryObjectInner>> response = listOwnedObjectsSinglePageAsync().toBlocking().single();
        return new PagedList<DirectoryObjectInner>(response.body()) {
            @Override
            public Page<DirectoryObjectInner> nextPage(String nextPageLink) {
                return listOwnedObjectsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DirectoryObjectInner>> listOwnedObjectsAsync(final ListOperationCallback<DirectoryObjectInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listOwnedObjectsSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<DirectoryObjectInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DirectoryObjectInner>>> call(String nextPageLink) {
                    return listOwnedObjectsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DirectoryObjectInner&gt; object
     */
    public Observable<Page<DirectoryObjectInner>> listOwnedObjectsAsync() {
        return listOwnedObjectsWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<DirectoryObjectInner>>, Page<DirectoryObjectInner>>() {
                @Override
                public Page<DirectoryObjectInner> call(ServiceResponse<Page<DirectoryObjectInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DirectoryObjectInner&gt; object
     */
    public Observable<ServiceResponse<Page<DirectoryObjectInner>>> listOwnedObjectsWithServiceResponseAsync() {
        return listOwnedObjectsSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<DirectoryObjectInner>>, Observable<ServiceResponse<Page<DirectoryObjectInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DirectoryObjectInner>>> call(ServiceResponse<Page<DirectoryObjectInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listOwnedObjectsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DirectoryObjectInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DirectoryObjectInner>>> listOwnedObjectsSinglePageAsync() {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listOwnedObjects(this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DirectoryObjectInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DirectoryObjectInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DirectoryObjectInner>> result = listOwnedObjectsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DirectoryObjectInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DirectoryObjectInner>> listOwnedObjectsDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DirectoryObjectInner>, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DirectoryObjectInner>>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DirectoryObjectInner&gt; object if successful.
     */
    public PagedList<DirectoryObjectInner> listOwnedObjectsNext(final String nextPageLink) {
        ServiceResponse<Page<DirectoryObjectInner>> response = listOwnedObjectsNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DirectoryObjectInner>(response.body()) {
            @Override
            public Page<DirectoryObjectInner> nextPage(String nextPageLink) {
                return listOwnedObjectsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DirectoryObjectInner>> listOwnedObjectsNextAsync(final String nextPageLink, final ServiceFuture<List<DirectoryObjectInner>> serviceFuture, final ListOperationCallback<DirectoryObjectInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listOwnedObjectsNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DirectoryObjectInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DirectoryObjectInner>>> call(String nextPageLink) {
                    return listOwnedObjectsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DirectoryObjectInner&gt; object
     */
    public Observable<Page<DirectoryObjectInner>> listOwnedObjectsNextAsync(final String nextPageLink) {
        return listOwnedObjectsNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DirectoryObjectInner>>, Page<DirectoryObjectInner>>() {
                @Override
                public Page<DirectoryObjectInner> call(ServiceResponse<Page<DirectoryObjectInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DirectoryObjectInner&gt; object
     */
    public Observable<ServiceResponse<Page<DirectoryObjectInner>>> listOwnedObjectsNextWithServiceResponseAsync(final String nextPageLink) {
        return listOwnedObjectsNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DirectoryObjectInner>>, Observable<ServiceResponse<Page<DirectoryObjectInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DirectoryObjectInner>>> call(ServiceResponse<Page<DirectoryObjectInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listOwnedObjectsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the list of directory objects that are owned by the user.
     *
    ServiceResponse<PageImpl<DirectoryObjectInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DirectoryObjectInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DirectoryObjectInner>>> listOwnedObjectsNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listOwnedObjectsNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DirectoryObjectInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DirectoryObjectInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DirectoryObjectInner>> result = listOwnedObjectsNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DirectoryObjectInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DirectoryObjectInner>> listOwnedObjectsNextDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DirectoryObjectInner>, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DirectoryObjectInner>>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

}
