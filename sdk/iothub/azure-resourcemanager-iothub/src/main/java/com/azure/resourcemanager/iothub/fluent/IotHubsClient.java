// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.iothub.models.FailoverInput;

/** An instance of this class provides access to all the operations defined in IotHubsClient. */
public interface IotHubsClient {
    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Region to failover to. Must be the Azure paired region. Get the value from the secondary
     *     location in the locations property. To learn more, see https://aka.ms/manualfailover/region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginManualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput);

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Region to failover to. Must be the Azure paired region. Get the value from the secondary
     *     location in the locations property. To learn more, see https://aka.ms/manualfailover/region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginManualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context);

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Region to failover to. Must be the Azure paired region. Get the value from the secondary
     *     location in the locations property. To learn more, see https://aka.ms/manualfailover/region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput);

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Region to failover to. Must be the Azure paired region. Get the value from the secondary
     *     location in the locations property. To learn more, see https://aka.ms/manualfailover/region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context);
}
