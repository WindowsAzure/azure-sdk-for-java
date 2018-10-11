/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.datalake.analytics.Recurrences;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.datalake.analytics.models.JobRecurrenceInformation;
import com.microsoft.azure.datalake.analytics.models.PageImpl;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
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
 * in Recurrences.
 */
public class RecurrencesImpl implements Recurrences {
    /** The Retrofit service to perform REST calls. */
    private RecurrencesService service;
    /** The service client containing this operation class. */
    private DataLakeAnalyticsJobManagementClientImpl client;

    /**
     * Initializes an instance of RecurrencesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RecurrencesImpl(Retrofit retrofit, DataLakeAnalyticsJobManagementClientImpl client) {
        this.service = retrofit.create(RecurrencesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Recurrences to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RecurrencesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.datalake.analytics.Recurrences list" })
        @GET("recurrences")
        Observable<Response<ResponseBody>> list(@Query("startDateTime") DateTime startDateTime, @Query("endDateTime") DateTime endDateTime, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.datalake.analytics.Recurrences get" })
        @GET("recurrences/{recurrenceIdentity}")
        Observable<Response<ResponseBody>> get(@Path("recurrenceIdentity") UUID recurrenceIdentity, @Query("startDateTime") DateTime startDateTime, @Query("endDateTime") DateTime endDateTime, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.datalake.analytics.Recurrences listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object if successful.
     */
    public PagedList<JobRecurrenceInformation> list(final String accountName) {
        ServiceResponse<Page<JobRecurrenceInformation>> response = listSinglePageAsync(accountName).toBlocking().single();
        return new PagedList<JobRecurrenceInformation>(response.body()) {
            @Override
            public Page<JobRecurrenceInformation> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobRecurrenceInformation>> listAsync(final String accountName, final ListOperationCallback<JobRecurrenceInformation> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(accountName),
            new Func1<String, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    public Observable<Page<JobRecurrenceInformation>> listAsync(final String accountName) {
        return listWithServiceResponseAsync(accountName)
            .map(new Func1<ServiceResponse<Page<JobRecurrenceInformation>>, Page<JobRecurrenceInformation>>() {
                @Override
                public Page<JobRecurrenceInformation> call(ServiceResponse<Page<JobRecurrenceInformation>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listWithServiceResponseAsync(final String accountName) {
        return listSinglePageAsync(accountName)
            .concatMap(new Func1<ServiceResponse<Page<JobRecurrenceInformation>>, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(ServiceResponse<Page<JobRecurrenceInformation>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listSinglePageAsync(final String accountName) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.adlaJobDnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.adlaJobDnsSuffix() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final DateTime startDateTime = null;
        final DateTime endDateTime = null;
        String parameterizedHost = Joiner.on(", ").join("{accountName}", accountName, "{adlaJobDnsSuffix}", this.client.adlaJobDnsSuffix());
        return service.list(startDateTime, endDateTime, this.client.apiVersion(), this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobRecurrenceInformation>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobRecurrenceInformation>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object if successful.
     */
    public PagedList<JobRecurrenceInformation> list(final String accountName, final DateTime startDateTime, final DateTime endDateTime) {
        ServiceResponse<Page<JobRecurrenceInformation>> response = listSinglePageAsync(accountName, startDateTime, endDateTime).toBlocking().single();
        return new PagedList<JobRecurrenceInformation>(response.body()) {
            @Override
            public Page<JobRecurrenceInformation> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobRecurrenceInformation>> listAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime, final ListOperationCallback<JobRecurrenceInformation> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(accountName, startDateTime, endDateTime),
            new Func1<String, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    public Observable<Page<JobRecurrenceInformation>> listAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime) {
        return listWithServiceResponseAsync(accountName, startDateTime, endDateTime)
            .map(new Func1<ServiceResponse<Page<JobRecurrenceInformation>>, Page<JobRecurrenceInformation>>() {
                @Override
                public Page<JobRecurrenceInformation> call(ServiceResponse<Page<JobRecurrenceInformation>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listWithServiceResponseAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime) {
        return listSinglePageAsync(accountName, startDateTime, endDateTime)
            .concatMap(new Func1<ServiceResponse<Page<JobRecurrenceInformation>>, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(ServiceResponse<Page<JobRecurrenceInformation>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all recurrences.
     *
    ServiceResponse<PageImpl<JobRecurrenceInformation>> * @param accountName The Azure Data Lake Analytics account to execute job operations on.
    ServiceResponse<PageImpl<JobRecurrenceInformation>> * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
    ServiceResponse<PageImpl<JobRecurrenceInformation>> * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listSinglePageAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.adlaJobDnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.adlaJobDnsSuffix() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{accountName}", accountName, "{adlaJobDnsSuffix}", this.client.adlaJobDnsSuffix());
        return service.list(startDateTime, endDateTime, this.client.apiVersion(), this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobRecurrenceInformation>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobRecurrenceInformation>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<JobRecurrenceInformation>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<JobRecurrenceInformation>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<JobRecurrenceInformation>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobRecurrenceInformation object if successful.
     */
    public JobRecurrenceInformation get(String accountName, UUID recurrenceIdentity) {
        return getWithServiceResponseAsync(accountName, recurrenceIdentity).toBlocking().single().body();
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity, final ServiceCallback<JobRecurrenceInformation> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(accountName, recurrenceIdentity), serviceCallback);
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    public Observable<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity) {
        return getWithServiceResponseAsync(accountName, recurrenceIdentity).map(new Func1<ServiceResponse<JobRecurrenceInformation>, JobRecurrenceInformation>() {
            @Override
            public JobRecurrenceInformation call(ServiceResponse<JobRecurrenceInformation> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    public Observable<ServiceResponse<JobRecurrenceInformation>> getWithServiceResponseAsync(String accountName, UUID recurrenceIdentity) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.adlaJobDnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.adlaJobDnsSuffix() is required and cannot be null.");
        }
        if (recurrenceIdentity == null) {
            throw new IllegalArgumentException("Parameter recurrenceIdentity is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final DateTime startDateTime = null;
        final DateTime endDateTime = null;
        String parameterizedHost = Joiner.on(", ").join("{accountName}", accountName, "{adlaJobDnsSuffix}", this.client.adlaJobDnsSuffix());
        return service.get(recurrenceIdentity, startDateTime, endDateTime, this.client.apiVersion(), this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<JobRecurrenceInformation>>>() {
                @Override
                public Observable<ServiceResponse<JobRecurrenceInformation>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<JobRecurrenceInformation> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobRecurrenceInformation object if successful.
     */
    public JobRecurrenceInformation get(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime) {
        return getWithServiceResponseAsync(accountName, recurrenceIdentity, startDateTime, endDateTime).toBlocking().single().body();
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime, final ServiceCallback<JobRecurrenceInformation> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(accountName, recurrenceIdentity, startDateTime, endDateTime), serviceCallback);
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    public Observable<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime) {
        return getWithServiceResponseAsync(accountName, recurrenceIdentity, startDateTime, endDateTime).map(new Func1<ServiceResponse<JobRecurrenceInformation>, JobRecurrenceInformation>() {
            @Override
            public JobRecurrenceInformation call(ServiceResponse<JobRecurrenceInformation> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    public Observable<ServiceResponse<JobRecurrenceInformation>> getWithServiceResponseAsync(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.adlaJobDnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.adlaJobDnsSuffix() is required and cannot be null.");
        }
        if (recurrenceIdentity == null) {
            throw new IllegalArgumentException("Parameter recurrenceIdentity is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{accountName}", accountName, "{adlaJobDnsSuffix}", this.client.adlaJobDnsSuffix());
        return service.get(recurrenceIdentity, startDateTime, endDateTime, this.client.apiVersion(), this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<JobRecurrenceInformation>>>() {
                @Override
                public Observable<ServiceResponse<JobRecurrenceInformation>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<JobRecurrenceInformation> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<JobRecurrenceInformation> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<JobRecurrenceInformation, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<JobRecurrenceInformation>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object if successful.
     */
    public PagedList<JobRecurrenceInformation> listNext(final String nextPageLink) {
        ServiceResponse<Page<JobRecurrenceInformation>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<JobRecurrenceInformation>(response.body()) {
            @Override
            public Page<JobRecurrenceInformation> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobRecurrenceInformation>> listNextAsync(final String nextPageLink, final ServiceFuture<List<JobRecurrenceInformation>> serviceFuture, final ListOperationCallback<JobRecurrenceInformation> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    public Observable<Page<JobRecurrenceInformation>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<JobRecurrenceInformation>>, Page<JobRecurrenceInformation>>() {
                @Override
                public Page<JobRecurrenceInformation> call(ServiceResponse<Page<JobRecurrenceInformation>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<JobRecurrenceInformation>>, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(ServiceResponse<Page<JobRecurrenceInformation>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all recurrences.
     *
    ServiceResponse<PageImpl<JobRecurrenceInformation>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobRecurrenceInformation>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobRecurrenceInformation>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobRecurrenceInformation>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobRecurrenceInformation>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<JobRecurrenceInformation>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<JobRecurrenceInformation>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<JobRecurrenceInformation>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
