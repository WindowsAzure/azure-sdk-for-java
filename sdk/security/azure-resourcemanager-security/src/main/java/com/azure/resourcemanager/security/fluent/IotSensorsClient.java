// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IotSensorsListInner;
import com.azure.resourcemanager.security.fluent.models.IotSensorsModelInner;
import com.azure.resourcemanager.security.models.ResetPasswordInput;
import java.io.InputStream;

/** An instance of this class provides access to all the operations defined in IotSensorsClient. */
public interface IotSensorsClient {
    /**
     * List IoT sensors.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT sensors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotSensorsListInner list(String scope);

    /**
     * List IoT sensors.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT sensors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotSensorsListInner> listWithResponse(String scope, Context context);

    /**
     * Get IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT sensor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotSensorsModelInner get(String scope, String iotSensorName);

    /**
     * Get IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT sensor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotSensorsModelInner> getWithResponse(String scope, String iotSensorName, Context context);

    /**
     * Create or update IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param iotSensorsModel The IoT sensor model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT sensor model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotSensorsModelInner createOrUpdate(String scope, String iotSensorName, IotSensorsModelInner iotSensorsModel);

    /**
     * Create or update IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param iotSensorsModel The IoT sensor model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT sensor model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotSensorsModelInner> createOrUpdateWithResponse(
        String scope, String iotSensorName, IotSensorsModelInner iotSensorsModel, Context context);

    /**
     * Delete IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String iotSensorName);

    /**
     * Delete IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String scope, String iotSensorName, Context context);

    /**
     * Download sensor activation file.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputStream downloadActivation(String scope, String iotSensorName);

    /**
     * Download sensor activation file.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamResponse downloadActivationWithResponse(String scope, String iotSensorName, Context context);

    /**
     * Download file for reset password of the sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param body The reset password input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputStream downloadResetPassword(String scope, String iotSensorName, ResetPasswordInput body);

    /**
     * Download file for reset password of the sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param body The reset password input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamResponse downloadResetPasswordWithResponse(
        String scope, String iotSensorName, ResetPasswordInput body, Context context);

    /**
     * Trigger threat intelligence package update.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerTiPackageUpdate(String scope, String iotSensorName);

    /**
     * Trigger threat intelligence package update.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> triggerTiPackageUpdateWithResponse(String scope, String iotSensorName, Context context);
}
