// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.OnPremiseIotSensorInner;
import com.azure.resourcemanager.security.fluent.models.OnPremiseIotSensorsListInner;
import com.azure.resourcemanager.security.models.ResetPasswordInput;
import java.io.InputStream;

/** An instance of this class provides access to all the operations defined in OnPremiseIotSensorsClient. */
public interface OnPremiseIotSensorsClient {
    /**
     * List on-premise IoT sensors.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of on-premise IoT sensors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnPremiseIotSensorsListInner list();

    /**
     * List on-premise IoT sensors.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of on-premise IoT sensors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnPremiseIotSensorsListInner> listWithResponse(Context context);

    /**
     * Get on-premise IoT sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return on-premise IoT sensor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnPremiseIotSensorInner get(String onPremiseIotSensorName);

    /**
     * Get on-premise IoT sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return on-premise IoT sensor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnPremiseIotSensorInner> getWithResponse(String onPremiseIotSensorName, Context context);

    /**
     * Create or update on-premise IoT sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return on-premise IoT sensor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnPremiseIotSensorInner createOrUpdate(String onPremiseIotSensorName);

    /**
     * Create or update on-premise IoT sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return on-premise IoT sensor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnPremiseIotSensorInner> createOrUpdateWithResponse(String onPremiseIotSensorName, Context context);

    /**
     * Delete on-premise IoT sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String onPremiseIotSensorName);

    /**
     * Delete on-premise IoT sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String onPremiseIotSensorName, Context context);

    /**
     * Download sensor activation file.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputStream downloadActivation(String onPremiseIotSensorName);

    /**
     * Download sensor activation file.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamResponse downloadActivationWithResponse(String onPremiseIotSensorName, Context context);

    /**
     * Download file for reset password of the sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @param body Input for reset password.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputStream downloadResetPassword(String onPremiseIotSensorName, ResetPasswordInput body);

    /**
     * Download file for reset password of the sensor.
     *
     * @param onPremiseIotSensorName Name of the on-premise IoT sensor.
     * @param body Input for reset password.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamResponse downloadResetPasswordWithResponse(
        String onPremiseIotSensorName, ResetPasswordInput body, Context context);
}
