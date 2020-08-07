/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.anomalydetector;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.cognitiveservices.anomalydetector.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.anomalydetector.models.ChangePointDetectRequest;
import com.microsoft.azure.cognitiveservices.anomalydetector.models.ChangePointDetectResponse;
import com.microsoft.azure.cognitiveservices.anomalydetector.models.EntireDetectResponse;
import com.microsoft.azure.cognitiveservices.anomalydetector.models.LastDetectResponse;
import com.microsoft.azure.cognitiveservices.anomalydetector.models.Request;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * The interface for AnomalyDetectorClient class.
 */
public interface AnomalyDetectorClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com)..
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com)..
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    AnomalyDetectorClient withEndpoint(String endpoint);

    /**
     * Gets The preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets The preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    AnomalyDetectorClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    AnomalyDetectorClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    AnomalyDetectorClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Detect anomalies for the entire series in batch.
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EntireDetectResponse object if successful.
     */
    EntireDetectResponse entireDetect(Request body);

    /**
     * Detect anomalies for the entire series in batch.
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<EntireDetectResponse> entireDetectAsync(Request body, final ServiceCallback<EntireDetectResponse> serviceCallback);

    /**
     * Detect anomalies for the entire series in batch.
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EntireDetectResponse object
     */
    Observable<EntireDetectResponse> entireDetectAsync(Request body);

    /**
     * Detect anomalies for the entire series in batch.
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EntireDetectResponse object
     */
    Observable<ServiceResponse<EntireDetectResponse>> entireDetectWithServiceResponseAsync(Request body);

    /**
     * Detect anomaly status of the latest point in time series.
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LastDetectResponse object if successful.
     */
    LastDetectResponse lastDetect(Request body);

    /**
     * Detect anomaly status of the latest point in time series.
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LastDetectResponse> lastDetectAsync(Request body, final ServiceCallback<LastDetectResponse> serviceCallback);

    /**
     * Detect anomaly status of the latest point in time series.
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LastDetectResponse object
     */
    Observable<LastDetectResponse> lastDetectAsync(Request body);

    /**
     * Detect anomaly status of the latest point in time series.
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LastDetectResponse object
     */
    Observable<ServiceResponse<LastDetectResponse>> lastDetectWithServiceResponseAsync(Request body);

    /**
     * Detect change point for the entire series.
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the request if needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ChangePointDetectResponse object if successful.
     */
    ChangePointDetectResponse changePointDetect(ChangePointDetectRequest body);

    /**
     * Detect change point for the entire series.
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the request if needed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ChangePointDetectResponse> changePointDetectAsync(ChangePointDetectRequest body, final ServiceCallback<ChangePointDetectResponse> serviceCallback);

    /**
     * Detect change point for the entire series.
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the request if needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ChangePointDetectResponse object
     */
    Observable<ChangePointDetectResponse> changePointDetectAsync(ChangePointDetectRequest body);

    /**
     * Detect change point for the entire series.
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the request if needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ChangePointDetectResponse object
     */
    Observable<ServiceResponse<ChangePointDetectResponse>> changePointDetectWithServiceResponseAsync(ChangePointDetectRequest body);

}
