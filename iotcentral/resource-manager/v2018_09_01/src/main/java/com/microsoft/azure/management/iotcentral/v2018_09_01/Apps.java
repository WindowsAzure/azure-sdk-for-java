/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import rx.Observable;
import com.microsoft.azure.management.iotcentral.v2018_09_01.App;
import rx.Completable;
import com.microsoft.azure.management.iotcentral.v2018_09_01.AppTemplate;

/**
 * Type representing Apps.
 */
public interface Apps {
    /**
     * Begins definition for a new IoTApp resource.
     * @param name resource name.
     * @return the first stage of the new IoTApp definition.
     */
    App.DefinitionStages.Blank defineIoTApp(String name);

    /**
     * Get the metadata of an IoT Central application.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<App> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get all the IoT Central Applications in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<App> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get all IoT Central Applications in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<App> listBySubscriptionAsync();

    /**
     * Delete an IoT Central application.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Get all available application templates.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppTemplate> listTemplatesAsync();

    /**
     * Get a single application template.
     *
     * @param applicationTemplateId The combination id of manifestId and manifestVersion of the IoT Central application template.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppTemplate> templateAsync(String applicationTemplateId);

    /**
     * Check if an IoT Central application name is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the name of the IoT Central application to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppAvailabilityInfo> checkNameAvailabilityAsync(OperationInputs operationInputs);

    /**
     * Check if an IoT Central application subdomain is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the subdomain of the IoT Central application to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppAvailabilityInfo> checkSubdomainAvailabilityAsync(OperationInputs operationInputs);

}
