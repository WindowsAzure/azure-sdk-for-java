/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.consumption.v2018_06_30.ErrorResponseException;
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
 * in ReservationRecommendations.
 */
public class ReservationRecommendationsInner {
    /** The Retrofit service to perform REST calls. */
    private ReservationRecommendationsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ReservationRecommendationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ReservationRecommendationsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(ReservationRecommendationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ReservationRecommendations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ReservationRecommendationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_06_30.ReservationRecommendations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Consumption/reservationRecommendations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_06_30.ReservationRecommendations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationRecommendationInner&gt; object if successful.
     */
    public PagedList<ReservationRecommendationInner> list() {
        ServiceResponse<Page<ReservationRecommendationInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ReservationRecommendationInner>(response.body()) {
            @Override
            public Page<ReservationRecommendationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationRecommendationInner>> listAsync(final ListOperationCallback<ReservationRecommendationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationRecommendationInner&gt; object
     */
    public Observable<Page<ReservationRecommendationInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ReservationRecommendationInner>>, Page<ReservationRecommendationInner>>() {
                @Override
                public Page<ReservationRecommendationInner> call(ServiceResponse<Page<ReservationRecommendationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationRecommendationInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ReservationRecommendationInner>>, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(ServiceResponse<Page<ReservationRecommendationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationRecommendationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(this.client.subscriptionId(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationRecommendationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationRecommendationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param filter May be used to filter reservationRecommendations by properties/scope and properties/lookBackPeriod.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationRecommendationInner&gt; object if successful.
     */
    public PagedList<ReservationRecommendationInner> list(final String filter) {
        ServiceResponse<Page<ReservationRecommendationInner>> response = listSinglePageAsync(filter).toBlocking().single();
        return new PagedList<ReservationRecommendationInner>(response.body()) {
            @Override
            public Page<ReservationRecommendationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param filter May be used to filter reservationRecommendations by properties/scope and properties/lookBackPeriod.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationRecommendationInner>> listAsync(final String filter, final ListOperationCallback<ReservationRecommendationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(filter),
            new Func1<String, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param filter May be used to filter reservationRecommendations by properties/scope and properties/lookBackPeriod.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationRecommendationInner&gt; object
     */
    public Observable<Page<ReservationRecommendationInner>> listAsync(final String filter) {
        return listWithServiceResponseAsync(filter)
            .map(new Func1<ServiceResponse<Page<ReservationRecommendationInner>>, Page<ReservationRecommendationInner>>() {
                @Override
                public Page<ReservationRecommendationInner> call(ServiceResponse<Page<ReservationRecommendationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param filter May be used to filter reservationRecommendations by properties/scope and properties/lookBackPeriod.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationRecommendationInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> listWithServiceResponseAsync(final String filter) {
        return listSinglePageAsync(filter)
            .concatMap(new Func1<ServiceResponse<Page<ReservationRecommendationInner>>, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(ServiceResponse<Page<ReservationRecommendationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
    ServiceResponse<PageImpl<ReservationRecommendationInner>> * @param filter May be used to filter reservationRecommendations by properties/scope and properties/lookBackPeriod.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationRecommendationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> listSinglePageAsync(final String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationRecommendationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationRecommendationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ReservationRecommendationInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ReservationRecommendationInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ReservationRecommendationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationRecommendationInner&gt; object if successful.
     */
    public PagedList<ReservationRecommendationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ReservationRecommendationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ReservationRecommendationInner>(response.body()) {
            @Override
            public Page<ReservationRecommendationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationRecommendationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ReservationRecommendationInner>> serviceFuture, final ListOperationCallback<ReservationRecommendationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationRecommendationInner&gt; object
     */
    public Observable<Page<ReservationRecommendationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ReservationRecommendationInner>>, Page<ReservationRecommendationInner>>() {
                @Override
                public Page<ReservationRecommendationInner> call(ServiceResponse<Page<ReservationRecommendationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationRecommendationInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ReservationRecommendationInner>>, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(ServiceResponse<Page<ReservationRecommendationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List of recommendations for purchasing reserved instances.
     *
    ServiceResponse<PageImpl<ReservationRecommendationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationRecommendationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationRecommendationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationRecommendationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationRecommendationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationRecommendationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ReservationRecommendationInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ReservationRecommendationInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ReservationRecommendationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
