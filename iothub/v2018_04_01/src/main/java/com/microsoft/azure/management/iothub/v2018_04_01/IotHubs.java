/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IotHubResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IotHubs.
 */
public interface IotHubs extends SupportsCreating<IotHubDescription.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<IotHubDescription>, SupportsListingByResourceGroup<IotHubDescription>, SupportsListing<IotHubDescription>, HasInner<IotHubResourcesInner> {

    /**
     * @return Entry point to manage IotHub IotHubStat.
     */
    IotHubStats iotHubStats();

    /**
     * @return Entry point to manage IotHub Skus.
     */
    Skus skus();

    /**
     * @return Entry point to manage IotHub Job.
     */
    Jobs jobs();

    /**
     * @return Entry point to manage IotHub QuotaMetric.
     */
    QuotaMetrics quotaMetrics();

    /**
     * @return Entry point to manage IotHub IotHubKey.
     */
    IotHubKeys iotHubKeys();

    /**
     * @return Entry point to manage IotHub Certificate.
     */
    Certificates certificates();

    /**
     * @return Entry point to manage IotHub EventHubEndpoint.
     */
    EventHubEndpoints eventHubEndpoints();
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

}
