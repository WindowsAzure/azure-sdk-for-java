/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
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
 * in Subscriptions.
 */
public final class SubscriptionsInner {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionsService service;
    /** The service client containing this operation class. */
    private SubscriptionClientImpl client;

    /**
     * Initializes an instance of SubscriptionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionsInner(Retrofit retrofit, SubscriptionClientImpl client) {
        this.service = retrofit.create(SubscriptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Subscriptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/locations")
        Observable<Response<ResponseBody>> listLocations(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> listNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<LocationInner>> listLocations(String subscriptionId) throws CloudException, IOException, IllegalArgumentException {
        return listLocationsAsync(subscriptionId).toBlocking().single();
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<LocationInner>> listLocationsAsync(String subscriptionId, final ServiceCallback<List<LocationInner>> serviceCallback) {
        return ServiceCall.create(listLocationsAsync(subscriptionId), serviceCallback);
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @return the observable to the List&lt;LocationInner&gt; object
     */
    public Observable<ServiceResponse<List<LocationInner>>> listLocationsAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listLocations(subscriptionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<LocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<LocationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LocationInner>> result = listLocationsDelegate(response);
                        ServiceResponse<List<LocationInner>> clientResponse = new ServiceResponse<List<LocationInner>>(result.getBody().getItems(), result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LocationInner>> listLocationsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<LocationInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<LocationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SubscriptionInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SubscriptionInner> get(String subscriptionId) throws CloudException, IOException, IllegalArgumentException {
        return getAsync(subscriptionId).toBlocking().single();
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<SubscriptionInner> getAsync(String subscriptionId, final ServiceCallback<SubscriptionInner> serviceCallback) {
        return ServiceCall.create(getAsync(subscriptionId), serviceCallback);
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @return the observable to the SubscriptionInner object
     */
    public Observable<ServiceResponse<SubscriptionInner>> getAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(subscriptionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubscriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<SubscriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubscriptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubscriptionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SubscriptionInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<SubscriptionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;SubscriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<SubscriptionInner>> list() throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<SubscriptionInner>> response = listSinglePageAsync().toBlocking().single();
        PagedList<SubscriptionInner> pagedList = new PagedList<SubscriptionInner>(response.getBody()) {
            @Override
            public Page<SubscriptionInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<SubscriptionInner>>(pagedList, response.getResponse());
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<SubscriptionInner>> listAsync(final ListOperationCallback<SubscriptionInner> serviceCallback) {
        return AzureServiceCall.create(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @return the observable to the List&lt;SubscriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionInner>>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(ServiceResponse<Page<SubscriptionInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @return the List&lt;SubscriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<SubscriptionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<SubscriptionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<SubscriptionInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<SubscriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;SubscriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<SubscriptionInner>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<SubscriptionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        PagedList<SubscriptionInner> pagedList = new PagedList<SubscriptionInner>(response.getBody()) {
            @Override
            public Page<SubscriptionInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<SubscriptionInner>>(pagedList, response.getResponse());
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<SubscriptionInner>> listNextAsync(final String nextPageLink, final ServiceCall<List<SubscriptionInner>> serviceCall, final ListOperationCallback<SubscriptionInner> serviceCallback) {
        return AzureServiceCall.create(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the List&lt;SubscriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listNextAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionInner>>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(ServiceResponse<Page<SubscriptionInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * Gets a list of the subscriptionIds.
     *
    ServiceResponse<PageImpl1<SubscriptionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the List&lt;SubscriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.listNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<SubscriptionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<SubscriptionInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<SubscriptionInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<SubscriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
