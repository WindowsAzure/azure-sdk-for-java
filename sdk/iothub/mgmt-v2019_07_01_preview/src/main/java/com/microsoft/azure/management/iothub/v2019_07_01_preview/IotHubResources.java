/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import rx.Observable;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.IotHubDescription;
import rx.Completable;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.IotHubSkuDescription;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.EventHubConsumerGroupInfo;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.JobResponse;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.IotHubQuotaMetricInfo;

/**
 * Type representing IotHubResources.
 */
public interface IotHubResources {
    /**
     * Begins definition for a new IotHub resource.
     * @param name resource name.
     * @return the first stage of the new IotHub definition.
     */
    IotHubDescription.DefinitionStages.Blank defineIotHub(String name);

    /**
     * Begins definition for a new ConsumerGroup resource.
     * @param name resource name.
     * @return the first stage of the new ConsumerGroup definition.
     */
    EventHubConsumerGroupInfo.DefinitionStages.Blank defineConsumerGroup(String name);

    /**
     * Get the non-security related metadata of an IoT hub.
     * Get the non-security related metadata of an IoT hub.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubDescription> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get all the IoT hubs in a resource group.
     * Get all the IoT hubs in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubDescription> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get all the IoT hubs in a subscription.
     * Get all the IoT hubs in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubDescription> listAsync();

    /**
     * Delete an IoT hub.
     * Delete an IoT hub.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Get the health for routing endpoints.
     * Get the health for routing endpoints.
     *
     * @param resourceGroupName the String value
     * @param iotHubName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EndpointHealthData> getEndpointHealthAsync(final String resourceGroupName, final String iotHubName);

    /**
     * Get the security metadata for an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     * Get the security metadata for an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SharedAccessSignatureAuthorizationRule> listKeysAsync(final String resourceGroupName, final String resourceName);

    /**
     * Exports all the device identities in the IoT hub identity registry to an Azure Storage blob container. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     * Exports all the device identities in the IoT hub identity registry to an Azure Storage blob container. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param exportDevicesParameters The parameters that specify the export devices operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobResponse> exportDevicesAsync(String resourceGroupName, String resourceName, ExportDevicesRequest exportDevicesParameters);

    /**
     * Import, update, or delete device identities in the IoT hub identity registry from a blob. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     * Import, update, or delete device identities in the IoT hub identity registry from a blob. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param importDevicesParameters The parameters that specify the import devices operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobResponse> importDevicesAsync(String resourceGroupName, String resourceName, ImportDevicesRequest importDevicesParameters);

    /**
     * Check if an IoT hub name is available.
     * Check if an IoT hub name is available.
     *
     * @param name The name of the IoT hub to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubNameAvailabilityInfo> checkNameAvailabilityAsync(String name);

    /**
     * Get the statistics from an IoT hub.
     * Get the statistics from an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryStatistics> getStatsAsync(String resourceGroupName, String resourceName);

    /**
     * Get the list of valid SKUs for an IoT hub.
     * Get the list of valid SKUs for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubSkuDescription> getValidSkusAsync(final String resourceGroupName, final String resourceName);

    /**
     * Get a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     * Get a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
     * @param name The name of the consumer group to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventHubConsumerGroupInfo> getEventHubConsumerGroupAsync(String resourceGroupName, String resourceName, String eventHubEndpointName, String name);

    /**
     * Get a list of the consumer groups in the Event Hub-compatible device-to-cloud endpoint in an IoT hub.
     * Get a list of the consumer groups in the Event Hub-compatible device-to-cloud endpoint in an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventHubConsumerGroupInfo> listEventHubConsumerGroupsAsync(final String resourceGroupName, final String resourceName, final String eventHubEndpointName);

    /**
     * Delete a consumer group from an Event Hub-compatible endpoint in an IoT hub.
     * Delete a consumer group from an Event Hub-compatible endpoint in an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
     * @param name The name of the consumer group to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteEventHubConsumerGroupAsync(String resourceGroupName, String resourceName, String eventHubEndpointName, String name);

    /**
     * Get the details of a job from an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     * Get the details of a job from an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param jobId The job identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobResponse> getJobAsync(String resourceGroupName, String resourceName, String jobId);

    /**
     * Get a list of all the jobs in an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     * Get a list of all the jobs in an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobResponse> listJobsAsync(final String resourceGroupName, final String resourceName);

    /**
     * Get the quota metrics for an IoT hub.
     * Get the quota metrics for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubQuotaMetricInfo> getQuotaMetricsAsync(final String resourceGroupName, final String resourceName);

    /**
     * Test all routes.
     * Test all routes configured in this Iot Hub.
     *
     * @param iotHubName IotHub to be tested
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param input Input for testing all routes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TestAllRoutesResult> testAllRoutesAsync(String iotHubName, String resourceGroupName, TestAllRoutesInput input);

    /**
     * Test the new route.
     * Test the new route for this Iot Hub.
     *
     * @param iotHubName IotHub to be tested
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param input Route that needs to be tested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TestRouteResult> testRouteAsync(String iotHubName, String resourceGroupName, TestRouteInput input);

    /**
     * Get a shared access policy by name from an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     * Get a shared access policy by name from an IoT hub. For more information, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param keyName The name of the shared access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SharedAccessSignatureAuthorizationRule> getKeysForKeyNameAsync(String resourceGroupName, String resourceName, String keyName);

}
