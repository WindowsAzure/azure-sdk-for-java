/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.monitor.ErrorResponseException;
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
 * in ActivityLogs.
 */
public class ActivityLogsInner {
    /** The Retrofit service to perform REST calls. */
    private ActivityLogsService service;
    /** The service client containing this operation class. */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of ActivityLogsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ActivityLogsInner(Retrofit retrofit, MonitorClientImpl client) {
        this.service = retrofit.create(ActivityLogsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ActivityLogs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ActivityLogsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogs list" })
        @GET("subscriptions/{subscriptionId}/providers/microsoft.insights/eventtypes/management/values")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$select") String select, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogs listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EventDataInner&gt; object if successful.
     */
    public PagedList<EventDataInner> list() {
        ServiceResponse<Page<EventDataInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<EventDataInner>(response.body()) {
            @Override
            public Page<EventDataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventDataInner>> listAsync(final ListOperationCallback<EventDataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventDataInner&gt; object
     */
    public Observable<Page<EventDataInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<EventDataInner>>, Page<EventDataInner>>() {
                @Override
                public Page<EventDataInner> call(ServiceResponse<Page<EventDataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventDataInner&gt; object
     */
    public Observable<ServiceResponse<Page<EventDataInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<EventDataInner>>, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(ServiceResponse<Page<EventDataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EventDataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EventDataInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2015-04-01";
        final String filter = null;
        final String select = null;
        return service.list(this.client.subscriptionId(), apiVersion, filter, select, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<EventDataInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EventDataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;The **$filter** argument is very restricted and allows only the following patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq 'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq 'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma separated list of property names to be returned. Possible values are: *authorization*, *claims*, *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*, *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*, *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EventDataInner&gt; object if successful.
     */
    public PagedList<EventDataInner> list(final String filter, final String select) {
        ServiceResponse<Page<EventDataInner>> response = listSinglePageAsync(filter, select).toBlocking().single();
        return new PagedList<EventDataInner>(response.body()) {
            @Override
            public Page<EventDataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;The **$filter** argument is very restricted and allows only the following patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq 'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq 'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma separated list of property names to be returned. Possible values are: *authorization*, *claims*, *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*, *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*, *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventDataInner>> listAsync(final String filter, final String select, final ListOperationCallback<EventDataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(filter, select),
            new Func1<String, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;The **$filter** argument is very restricted and allows only the following patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq 'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq 'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma separated list of property names to be returned. Possible values are: *authorization*, *claims*, *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*, *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*, *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventDataInner&gt; object
     */
    public Observable<Page<EventDataInner>> listAsync(final String filter, final String select) {
        return listWithServiceResponseAsync(filter, select)
            .map(new Func1<ServiceResponse<Page<EventDataInner>>, Page<EventDataInner>>() {
                @Override
                public Page<EventDataInner> call(ServiceResponse<Page<EventDataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;The **$filter** argument is very restricted and allows only the following patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq 'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq 'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma separated list of property names to be returned. Possible values are: *authorization*, *claims*, *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*, *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*, *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventDataInner&gt; object
     */
    public Observable<ServiceResponse<Page<EventDataInner>>> listWithServiceResponseAsync(final String filter, final String select) {
        return listSinglePageAsync(filter, select)
            .concatMap(new Func1<ServiceResponse<Page<EventDataInner>>, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(ServiceResponse<Page<EventDataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
    ServiceResponse<PageImpl1<EventDataInner>> * @param filter Reduces the set of data collected.&lt;br&gt;The **$filter** argument is very restricted and allows only the following patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq 'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq 'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other syntax is allowed.
    ServiceResponse<PageImpl1<EventDataInner>> * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma separated list of property names to be returned. Possible values are: *authorization*, *claims*, *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*, *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*, *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EventDataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EventDataInner>>> listSinglePageAsync(final String filter, final String select) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2015-04-01";
        return service.list(this.client.subscriptionId(), apiVersion, filter, select, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<EventDataInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EventDataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<EventDataInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<EventDataInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<EventDataInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EventDataInner&gt; object if successful.
     */
    public PagedList<EventDataInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<EventDataInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<EventDataInner>(response.body()) {
            @Override
            public Page<EventDataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventDataInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<EventDataInner>> serviceFuture, final ListOperationCallback<EventDataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventDataInner&gt; object
     */
    public Observable<Page<EventDataInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<EventDataInner>>, Page<EventDataInner>>() {
                @Override
                public Page<EventDataInner> call(ServiceResponse<Page<EventDataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventDataInner&gt; object
     */
    public Observable<ServiceResponse<Page<EventDataInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<EventDataInner>>, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(ServiceResponse<Page<EventDataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides the list of records from the activity logs.
     *
    ServiceResponse<PageImpl1<EventDataInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EventDataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EventDataInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EventDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventDataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<EventDataInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EventDataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<EventDataInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<EventDataInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<EventDataInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
