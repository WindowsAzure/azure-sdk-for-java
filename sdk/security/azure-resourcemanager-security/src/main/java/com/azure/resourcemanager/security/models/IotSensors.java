// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import java.io.InputStream;

/** Resource collection API of IotSensors. */
public interface IotSensors {
    /**
     * List IoT sensors.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT sensors.
     */
    IotSensorsList list(String scope);

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
    Response<IotSensorsList> listWithResponse(String scope, Context context);

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
    IotSensorsModel get(String scope, String iotSensorName);

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
    Response<IotSensorsModel> getWithResponse(String scope, String iotSensorName, Context context);

    /**
     * Delete IoT sensor.
     *
     * @param scope Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub).
     * @param iotSensorName Name of the IoT sensor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String scope, String iotSensorName);

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
    Response<Void> triggerTiPackageUpdateWithResponse(String scope, String iotSensorName, Context context);

    /**
     * Get IoT sensor.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT sensor.
     */
    IotSensorsModel getById(String id);

    /**
     * Get IoT sensor.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT sensor.
     */
    Response<IotSensorsModel> getByIdWithResponse(String id, Context context);

    /**
     * Delete IoT sensor.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete IoT sensor.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IotSensorsModel resource.
     *
     * @param name resource name.
     * @return the first stage of the new IotSensorsModel definition.
     */
    IotSensorsModel.DefinitionStages.Blank define(String name);
}
