/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.monitor.v2018_01_01.ErrorResponseException;
import com.microsoft.azure.management.monitor.v2018_01_01.ResultType;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.Period;
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
 * in Metrics.
 */
public class MetricsInner {
    /** The Retrofit service to perform REST calls. */
    private MetricsService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of MetricsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricsInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(MetricsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Metrics to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2018_01_01.Metrics list" })
        @GET("{resourceUri}/providers/microsoft.insights/metrics")
        Observable<Response<ResponseBody>> list(@Path(value = "resourceUri", encoded = true) String resourceUri, @Query("timespan") String timespan, @Query("interval") Period interval, @Query("metricnames") String metricnames, @Query("aggregation") String aggregation, @Query("top") Integer top, @Query("orderby") String orderby, @Query("$filter") String filter, @Query("resultType") ResultType resultType1, @Query("api-version") String apiVersion, @Query("metricnamespace") String metricnamespace, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResponseInner object if successful.
     */
    public ResponseInner list(String resourceUri) {
        return listWithServiceResponseAsync(resourceUri).toBlocking().single().body();
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResponseInner> listAsync(String resourceUri, final ServiceCallback<ResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceUri), serviceCallback);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResponseInner object
     */
    public Observable<ResponseInner> listAsync(String resourceUri) {
        return listWithServiceResponseAsync(resourceUri).map(new Func1<ServiceResponse<ResponseInner>, ResponseInner>() {
            @Override
            public ResponseInner call(ServiceResponse<ResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResponseInner object
     */
    public Observable<ServiceResponse<ResponseInner>> listWithServiceResponseAsync(String resourceUri) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String timespan = null;
        final Period interval = null;
        final String metricnames = null;
        final String aggregation = null;
        final Integer top = null;
        final String orderby = null;
        final String filter = null;
        final ResultType resultType = null;
        final String metricnamespace = null;
        return service.list(resourceUri, timespan, interval, metricnames, aggregation, top, orderby, filter, resultType, this.client.apiVersion(), metricnamespace, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<ResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResponseInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve.
     Valid only if $filter is specified.
     Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort.
     Only one order can be specified.
     Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B = ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the operation's description for details. Possible values include: 'Data', 'Metadata'
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResponseInner object if successful.
     */
    public ResponseInner list(String resourceUri, String timespan, Period interval, String metricnames, String aggregation, Integer top, String orderby, String filter, ResultType resultType, String metricnamespace) {
        return listWithServiceResponseAsync(resourceUri, timespan, interval, metricnames, aggregation, top, orderby, filter, resultType, metricnamespace).toBlocking().single().body();
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve.
     Valid only if $filter is specified.
     Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort.
     Only one order can be specified.
     Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B = ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the operation's description for details. Possible values include: 'Data', 'Metadata'
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResponseInner> listAsync(String resourceUri, String timespan, Period interval, String metricnames, String aggregation, Integer top, String orderby, String filter, ResultType resultType, String metricnamespace, final ServiceCallback<ResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceUri, timespan, interval, metricnames, aggregation, top, orderby, filter, resultType, metricnamespace), serviceCallback);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve.
     Valid only if $filter is specified.
     Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort.
     Only one order can be specified.
     Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B = ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the operation's description for details. Possible values include: 'Data', 'Metadata'
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResponseInner object
     */
    public Observable<ResponseInner> listAsync(String resourceUri, String timespan, Period interval, String metricnames, String aggregation, Integer top, String orderby, String filter, ResultType resultType, String metricnamespace) {
        return listWithServiceResponseAsync(resourceUri, timespan, interval, metricnames, aggregation, top, orderby, filter, resultType, metricnamespace).map(new Func1<ServiceResponse<ResponseInner>, ResponseInner>() {
            @Override
            public ResponseInner call(ServiceResponse<ResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve.
     Valid only if $filter is specified.
     Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort.
     Only one order can be specified.
     Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B = ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the operation's description for details. Possible values include: 'Data', 'Metadata'
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResponseInner object
     */
    public Observable<ServiceResponse<ResponseInner>> listWithServiceResponseAsync(String resourceUri, String timespan, Period interval, String metricnames, String aggregation, Integer top, String orderby, String filter, ResultType resultType, String metricnamespace) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceUri, timespan, interval, metricnames, aggregation, top, orderby, filter, resultType, this.client.apiVersion(), metricnamespace, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<ResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResponseInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResponseInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ResponseInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ResponseInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
