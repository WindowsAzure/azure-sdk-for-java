/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.frontdoor.v2020_05_01.ErrorResponseException;
import com.microsoft.azure.management.frontdoor.v2020_05_01.LatencyScorecardAggregationInterval;
import com.microsoft.azure.management.frontdoor.v2020_05_01.TimeseriesAggregationInterval;
import com.microsoft.azure.management.frontdoor.v2020_05_01.TimeseriesType;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
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
 * in Reports.
 */
public class ReportsInner {
    /** The Retrofit service to perform REST calls. */
    private ReportsService service;
    /** The service client containing this operation class. */
    private FrontDoorManagementClientImpl client;

    /**
     * Initializes an instance of ReportsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ReportsInner(Retrofit retrofit, FrontDoorManagementClientImpl client) {
        this.service = retrofit.create(ReportsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Reports to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ReportsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.frontdoor.v2020_05_01.Reports getLatencyScorecards" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/NetworkExperimentProfiles/{profileName}/Experiments/{experimentName}/LatencyScorecard")
        Observable<Response<ResponseBody>> getLatencyScorecards(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("experimentName") String experimentName, @Query("api-version") String apiVersion, @Query("endDateTimeUTC") String endDateTimeUTC, @Query("country") String country, @Query("aggregationInterval") LatencyScorecardAggregationInterval aggregationInterval, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.frontdoor.v2020_05_01.Reports getTimeseries" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/NetworkExperimentProfiles/{profileName}/Experiments/{experimentName}/Timeseries")
        Observable<Response<ResponseBody>> getTimeseries(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("experimentName") String experimentName, @Query("api-version") String apiVersion, @Query("startDateTimeUTC") DateTime startDateTimeUTC, @Query("endDateTimeUTC") DateTime endDateTimeUTC, @Query("aggregationInterval") TimeseriesAggregationInterval aggregationInterval, @Query("timeseriesType") TimeseriesType timeseriesType, @Query("endpoint") String endpoint, @Query("country") String country, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LatencyScorecardInner object if successful.
     */
    public LatencyScorecardInner getLatencyScorecards(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval) {
        return getLatencyScorecardsWithServiceResponseAsync(resourceGroupName, profileName, experimentName, aggregationInterval).toBlocking().single().body();
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LatencyScorecardInner> getLatencyScorecardsAsync(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval, final ServiceCallback<LatencyScorecardInner> serviceCallback) {
        return ServiceFuture.fromResponse(getLatencyScorecardsWithServiceResponseAsync(resourceGroupName, profileName, experimentName, aggregationInterval), serviceCallback);
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LatencyScorecardInner object
     */
    public Observable<LatencyScorecardInner> getLatencyScorecardsAsync(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval) {
        return getLatencyScorecardsWithServiceResponseAsync(resourceGroupName, profileName, experimentName, aggregationInterval).map(new Func1<ServiceResponse<LatencyScorecardInner>, LatencyScorecardInner>() {
            @Override
            public LatencyScorecardInner call(ServiceResponse<LatencyScorecardInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LatencyScorecardInner object
     */
    public Observable<ServiceResponse<LatencyScorecardInner>> getLatencyScorecardsWithServiceResponseAsync(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (experimentName == null) {
            throw new IllegalArgumentException("Parameter experimentName is required and cannot be null.");
        }
        if (aggregationInterval == null) {
            throw new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null.");
        }
        final String apiVersion = "2019-11-01";
        final String endDateTimeUTC = null;
        final String country = null;
        return service.getLatencyScorecards(this.client.subscriptionId(), resourceGroupName, profileName, experimentName, apiVersion, endDateTimeUTC, country, aggregationInterval, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LatencyScorecardInner>>>() {
                @Override
                public Observable<ServiceResponse<LatencyScorecardInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LatencyScorecardInner> clientResponse = getLatencyScorecardsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @param endDateTimeUTC The end DateTime of the Latency Scorecard in UTC
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LatencyScorecardInner object if successful.
     */
    public LatencyScorecardInner getLatencyScorecards(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval, String endDateTimeUTC, String country) {
        return getLatencyScorecardsWithServiceResponseAsync(resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUTC, country).toBlocking().single().body();
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @param endDateTimeUTC The end DateTime of the Latency Scorecard in UTC
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LatencyScorecardInner> getLatencyScorecardsAsync(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval, String endDateTimeUTC, String country, final ServiceCallback<LatencyScorecardInner> serviceCallback) {
        return ServiceFuture.fromResponse(getLatencyScorecardsWithServiceResponseAsync(resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUTC, country), serviceCallback);
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @param endDateTimeUTC The end DateTime of the Latency Scorecard in UTC
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LatencyScorecardInner object
     */
    public Observable<LatencyScorecardInner> getLatencyScorecardsAsync(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval, String endDateTimeUTC, String country) {
        return getLatencyScorecardsWithServiceResponseAsync(resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUTC, country).map(new Func1<ServiceResponse<LatencyScorecardInner>, LatencyScorecardInner>() {
            @Override
            public LatencyScorecardInner call(ServiceResponse<LatencyScorecardInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param aggregationInterval The aggregation interval of the Latency Scorecard. Possible values include: 'Daily', 'Weekly', 'Monthly'
     * @param endDateTimeUTC The end DateTime of the Latency Scorecard in UTC
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LatencyScorecardInner object
     */
    public Observable<ServiceResponse<LatencyScorecardInner>> getLatencyScorecardsWithServiceResponseAsync(String resourceGroupName, String profileName, String experimentName, LatencyScorecardAggregationInterval aggregationInterval, String endDateTimeUTC, String country) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (experimentName == null) {
            throw new IllegalArgumentException("Parameter experimentName is required and cannot be null.");
        }
        if (aggregationInterval == null) {
            throw new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null.");
        }
        final String apiVersion = "2019-11-01";
        return service.getLatencyScorecards(this.client.subscriptionId(), resourceGroupName, profileName, experimentName, apiVersion, endDateTimeUTC, country, aggregationInterval, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LatencyScorecardInner>>>() {
                @Override
                public Observable<ServiceResponse<LatencyScorecardInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LatencyScorecardInner> clientResponse = getLatencyScorecardsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LatencyScorecardInner> getLatencyScorecardsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LatencyScorecardInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LatencyScorecardInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TimeseriesInner object if successful.
     */
    public TimeseriesInner getTimeseries(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType) {
        return getTimeseriesWithServiceResponseAsync(resourceGroupName, profileName, experimentName, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType).toBlocking().single().body();
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TimeseriesInner> getTimeseriesAsync(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType, final ServiceCallback<TimeseriesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getTimeseriesWithServiceResponseAsync(resourceGroupName, profileName, experimentName, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType), serviceCallback);
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TimeseriesInner object
     */
    public Observable<TimeseriesInner> getTimeseriesAsync(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType) {
        return getTimeseriesWithServiceResponseAsync(resourceGroupName, profileName, experimentName, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType).map(new Func1<ServiceResponse<TimeseriesInner>, TimeseriesInner>() {
            @Override
            public TimeseriesInner call(ServiceResponse<TimeseriesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TimeseriesInner object
     */
    public Observable<ServiceResponse<TimeseriesInner>> getTimeseriesWithServiceResponseAsync(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (experimentName == null) {
            throw new IllegalArgumentException("Parameter experimentName is required and cannot be null.");
        }
        if (startDateTimeUTC == null) {
            throw new IllegalArgumentException("Parameter startDateTimeUTC is required and cannot be null.");
        }
        if (endDateTimeUTC == null) {
            throw new IllegalArgumentException("Parameter endDateTimeUTC is required and cannot be null.");
        }
        if (aggregationInterval == null) {
            throw new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null.");
        }
        if (timeseriesType == null) {
            throw new IllegalArgumentException("Parameter timeseriesType is required and cannot be null.");
        }
        final String apiVersion = "2019-11-01";
        final String endpoint = null;
        final String country = null;
        return service.getTimeseries(this.client.subscriptionId(), resourceGroupName, profileName, experimentName, apiVersion, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType, endpoint, country, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TimeseriesInner>>>() {
                @Override
                public Observable<ServiceResponse<TimeseriesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TimeseriesInner> clientResponse = getTimeseriesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @param endpoint The specific endpoint
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TimeseriesInner object if successful.
     */
    public TimeseriesInner getTimeseries(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType, String endpoint, String country) {
        return getTimeseriesWithServiceResponseAsync(resourceGroupName, profileName, experimentName, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType, endpoint, country).toBlocking().single().body();
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @param endpoint The specific endpoint
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TimeseriesInner> getTimeseriesAsync(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType, String endpoint, String country, final ServiceCallback<TimeseriesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getTimeseriesWithServiceResponseAsync(resourceGroupName, profileName, experimentName, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType, endpoint, country), serviceCallback);
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @param endpoint The specific endpoint
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TimeseriesInner object
     */
    public Observable<TimeseriesInner> getTimeseriesAsync(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType, String endpoint, String country) {
        return getTimeseriesWithServiceResponseAsync(resourceGroupName, profileName, experimentName, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType, endpoint, country).map(new Func1<ServiceResponse<TimeseriesInner>, TimeseriesInner>() {
            @Override
            public TimeseriesInner call(ServiceResponse<TimeseriesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner
     * @param experimentName The Experiment identifier associated with the Experiment
     * @param startDateTimeUTC The start DateTime of the Timeseries in UTC
     * @param endDateTimeUTC The end DateTime of the Timeseries in UTC
     * @param aggregationInterval The aggregation interval of the Timeseries. Possible values include: 'Hourly', 'Daily'
     * @param timeseriesType The type of Timeseries. Possible values include: 'MeasurementCounts', 'LatencyP50', 'LatencyP75', 'LatencyP95'
     * @param endpoint The specific endpoint
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TimeseriesInner object
     */
    public Observable<ServiceResponse<TimeseriesInner>> getTimeseriesWithServiceResponseAsync(String resourceGroupName, String profileName, String experimentName, DateTime startDateTimeUTC, DateTime endDateTimeUTC, TimeseriesAggregationInterval aggregationInterval, TimeseriesType timeseriesType, String endpoint, String country) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (experimentName == null) {
            throw new IllegalArgumentException("Parameter experimentName is required and cannot be null.");
        }
        if (startDateTimeUTC == null) {
            throw new IllegalArgumentException("Parameter startDateTimeUTC is required and cannot be null.");
        }
        if (endDateTimeUTC == null) {
            throw new IllegalArgumentException("Parameter endDateTimeUTC is required and cannot be null.");
        }
        if (aggregationInterval == null) {
            throw new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null.");
        }
        if (timeseriesType == null) {
            throw new IllegalArgumentException("Parameter timeseriesType is required and cannot be null.");
        }
        final String apiVersion = "2019-11-01";
        return service.getTimeseries(this.client.subscriptionId(), resourceGroupName, profileName, experimentName, apiVersion, startDateTimeUTC, endDateTimeUTC, aggregationInterval, timeseriesType, endpoint, country, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TimeseriesInner>>>() {
                @Override
                public Observable<ServiceResponse<TimeseriesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TimeseriesInner> clientResponse = getTimeseriesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TimeseriesInner> getTimeseriesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TimeseriesInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TimeseriesInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
