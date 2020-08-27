// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector;

import com.azure.ai.anomalydetector.implementation.AnomalyDetectorClientImpl;
import com.azure.ai.anomalydetector.models.ApiErrorException;
import com.azure.ai.anomalydetector.models.ChangePointDetectRequest;
import com.azure.ai.anomalydetector.models.ChangePointDetectResponse;
import com.azure.ai.anomalydetector.models.EntireDetectResponse;
import com.azure.ai.anomalydetector.models.LastDetectResponse;
import com.azure.ai.anomalydetector.models.Request;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous AnomalyDetectorClient type. */
@ServiceClient(builder = AnomalyDetectorClientBuilder.class)
public final class AnomalyDetectorClient {
    private AnomalyDetectorClientImpl serviceClient;

    /** Initializes an instance of AnomalyDetectorClient client. */
    AnomalyDetectorClient(AnomalyDetectorClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * This operation generates a model using an entire series, each point is detected with the same model. With this
     * method, points before and after a certain point are used to determine whether it is an anomaly. The entire
     * detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EntireDetectResponse entireDetect(Request body) {
        return this.serviceClient.entireDetect(body);
    }

    /**
     * This operation generates a model using an entire series, each point is detected with the same model. With this
     * method, points before and after a certain point are used to determine whether it is an anomaly. The entire
     * detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EntireDetectResponse> entireDetectWithResponse(Request body, Context context) {
        return this.serviceClient.entireDetectWithResponse(body, context);
    }

    /**
     * This operation generates a model using points before the latest one. With this method, only historical points are
     * used to determine whether the target point is an anomaly. The latest point detecting operation matches the
     * scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LastDetectResponse lastDetect(Request body) {
        return this.serviceClient.lastDetect(body);
    }

    /**
     * This operation generates a model using points before the latest one. With this method, only historical points are
     * used to determine whether the target point is an anomaly. The latest point detecting operation matches the
     * scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LastDetectResponse> lastDetectWithResponse(Request body, Context context) {
        return this.serviceClient.lastDetectWithResponse(body, context);
    }

    /**
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the
     *     request if needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChangePointDetectResponse changePointDetect(ChangePointDetectRequest body) {
        return this.serviceClient.changePointDetect(body);
    }

    /**
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the
     *     request if needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ChangePointDetectResponse> changePointDetectWithResponse(
            ChangePointDetectRequest body, Context context) {
        return this.serviceClient.changePointDetectWithResponse(body, context);
    }
}
