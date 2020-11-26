/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.consumption.v2018_08_31.ErrorResponseException;
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
 * in ReservationsDetails.
 */
public class ReservationsDetailsInner {
    /** The Retrofit service to perform REST calls. */
    private ReservationsDetailsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ReservationsDetailsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ReservationsDetailsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(ReservationsDetailsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ReservationsDetails to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ReservationsDetailsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_08_31.ReservationsDetails listByReservationOrder" })
        @GET("providers/Microsoft.Capacity/reservationorders/{reservationOrderId}/providers/Microsoft.Consumption/reservationDetails")
        Observable<Response<ResponseBody>> listByReservationOrder(@Path("reservationOrderId") String reservationOrderId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_08_31.ReservationsDetails listByReservationOrderAndReservation" })
        @GET("providers/Microsoft.Capacity/reservationorders/{reservationOrderId}/reservations/{reservationId}/providers/Microsoft.Consumption/reservationDetails")
        Observable<Response<ResponseBody>> listByReservationOrderAndReservation(@Path("reservationOrderId") String reservationOrderId, @Path("reservationId") String reservationId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_08_31.ReservationsDetails listByReservationOrderNext" })
        @GET
        Observable<Response<ResponseBody>> listByReservationOrderNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_08_31.ReservationsDetails listByReservationOrderAndReservationNext" })
        @GET
        Observable<Response<ResponseBody>> listByReservationOrderAndReservationNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetailInner&gt; object if successful.
     */
    public PagedList<ReservationDetailInner> listByReservationOrder(final String reservationOrderId, final String filter) {
        ServiceResponse<Page<ReservationDetailInner>> response = listByReservationOrderSinglePageAsync(reservationOrderId, filter).toBlocking().single();
        return new PagedList<ReservationDetailInner>(response.body()) {
            @Override
            public Page<ReservationDetailInner> nextPage(String nextPageLink) {
                return listByReservationOrderNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationDetailInner>> listByReservationOrderAsync(final String reservationOrderId, final String filter, final ListOperationCallback<ReservationDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByReservationOrderSinglePageAsync(reservationOrderId, filter),
            new Func1<String, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(String nextPageLink) {
                    return listByReservationOrderNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<Page<ReservationDetailInner>> listByReservationOrderAsync(final String reservationOrderId, final String filter) {
        return listByReservationOrderWithServiceResponseAsync(reservationOrderId, filter)
            .map(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Page<ReservationDetailInner>>() {
                @Override
                public Page<ReservationDetailInner> call(ServiceResponse<Page<ReservationDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderWithServiceResponseAsync(final String reservationOrderId, final String filter) {
        return listByReservationOrderSinglePageAsync(reservationOrderId, filter)
            .concatMap(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(ServiceResponse<Page<ReservationDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByReservationOrderNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param reservationOrderId Order Id of the reservation
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderSinglePageAsync(final String reservationOrderId, final String filter) {
        if (reservationOrderId == null) {
            throw new IllegalArgumentException("Parameter reservationOrderId is required and cannot be null.");
        }
        if (filter == null) {
            throw new IllegalArgumentException("Parameter filter is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByReservationOrder(reservationOrderId, filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationDetailInner>> result = listByReservationOrderDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ReservationDetailInner>> listByReservationOrderDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ReservationDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ReservationDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetailInner&gt; object if successful.
     */
    public PagedList<ReservationDetailInner> listByReservationOrderAndReservation(final String reservationOrderId, final String reservationId, final String filter) {
        ServiceResponse<Page<ReservationDetailInner>> response = listByReservationOrderAndReservationSinglePageAsync(reservationOrderId, reservationId, filter).toBlocking().single();
        return new PagedList<ReservationDetailInner>(response.body()) {
            @Override
            public Page<ReservationDetailInner> nextPage(String nextPageLink) {
                return listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationDetailInner>> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final String filter, final ListOperationCallback<ReservationDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByReservationOrderAndReservationSinglePageAsync(reservationOrderId, reservationId, filter),
            new Func1<String, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(String nextPageLink) {
                    return listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<Page<ReservationDetailInner>> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final String filter) {
        return listByReservationOrderAndReservationWithServiceResponseAsync(reservationOrderId, reservationId, filter)
            .map(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Page<ReservationDetailInner>>() {
                @Override
                public Page<ReservationDetailInner> call(ServiceResponse<Page<ReservationDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderAndReservationWithServiceResponseAsync(final String reservationOrderId, final String reservationId, final String filter) {
        return listByReservationOrderAndReservationSinglePageAsync(reservationOrderId, reservationId, filter)
            .concatMap(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(ServiceResponse<Page<ReservationDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByReservationOrderAndReservationNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param reservationOrderId Order Id of the reservation
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param reservationId Id of the reservation
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderAndReservationSinglePageAsync(final String reservationOrderId, final String reservationId, final String filter) {
        if (reservationOrderId == null) {
            throw new IllegalArgumentException("Parameter reservationOrderId is required and cannot be null.");
        }
        if (reservationId == null) {
            throw new IllegalArgumentException("Parameter reservationId is required and cannot be null.");
        }
        if (filter == null) {
            throw new IllegalArgumentException("Parameter filter is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByReservationOrderAndReservation(reservationOrderId, reservationId, filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationDetailInner>> result = listByReservationOrderAndReservationDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ReservationDetailInner>> listByReservationOrderAndReservationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ReservationDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ReservationDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetailInner&gt; object if successful.
     */
    public PagedList<ReservationDetailInner> listByReservationOrderNext(final String nextPageLink) {
        ServiceResponse<Page<ReservationDetailInner>> response = listByReservationOrderNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ReservationDetailInner>(response.body()) {
            @Override
            public Page<ReservationDetailInner> nextPage(String nextPageLink) {
                return listByReservationOrderNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationDetailInner>> listByReservationOrderNextAsync(final String nextPageLink, final ServiceFuture<List<ReservationDetailInner>> serviceFuture, final ListOperationCallback<ReservationDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByReservationOrderNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(String nextPageLink) {
                    return listByReservationOrderNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<Page<ReservationDetailInner>> listByReservationOrderNextAsync(final String nextPageLink) {
        return listByReservationOrderNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Page<ReservationDetailInner>>() {
                @Override
                public Page<ReservationDetailInner> call(ServiceResponse<Page<ReservationDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderNextWithServiceResponseAsync(final String nextPageLink) {
        return listByReservationOrderNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(ServiceResponse<Page<ReservationDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByReservationOrderNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByReservationOrderNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationDetailInner>> result = listByReservationOrderNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ReservationDetailInner>> listByReservationOrderNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ReservationDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ReservationDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetailInner&gt; object if successful.
     */
    public PagedList<ReservationDetailInner> listByReservationOrderAndReservationNext(final String nextPageLink) {
        ServiceResponse<Page<ReservationDetailInner>> response = listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ReservationDetailInner>(response.body()) {
            @Override
            public Page<ReservationDetailInner> nextPage(String nextPageLink) {
                return listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ReservationDetailInner>> listByReservationOrderAndReservationNextAsync(final String nextPageLink, final ServiceFuture<List<ReservationDetailInner>> serviceFuture, final ListOperationCallback<ReservationDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(String nextPageLink) {
                    return listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<Page<ReservationDetailInner>> listByReservationOrderAndReservationNextAsync(final String nextPageLink) {
        return listByReservationOrderAndReservationNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Page<ReservationDetailInner>>() {
                @Override
                public Page<ReservationDetailInner> call(ServiceResponse<Page<ReservationDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderAndReservationNextWithServiceResponseAsync(final String nextPageLink) {
        return listByReservationOrderAndReservationNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ReservationDetailInner>>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(ServiceResponse<Page<ReservationDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByReservationOrderAndReservationNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the reservations details for provided date range.
     *
    ServiceResponse<PageImpl<ReservationDetailInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ReservationDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ReservationDetailInner>>> listByReservationOrderAndReservationNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByReservationOrderAndReservationNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ReservationDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ReservationDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ReservationDetailInner>> result = listByReservationOrderAndReservationNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ReservationDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ReservationDetailInner>> listByReservationOrderAndReservationNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ReservationDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ReservationDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
