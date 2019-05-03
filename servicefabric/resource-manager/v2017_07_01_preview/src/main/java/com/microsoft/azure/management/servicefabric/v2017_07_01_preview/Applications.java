/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.ApplicationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Applications.
 */
public interface Applications extends SupportsCreating<ApplicationResource.DefinitionStages.Blank>, HasInner<ApplicationsInner> {
    /**
     * Returns all application resources in the specified cluster.
     *
     * @param subscriptionId The customer subscription identifier
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationResourceList> listAsync(String subscriptionId, String resourceGroupName, String clusterName, String apiVersion);

    /**
     * Returns an application resource with the specified name.
     *
     * @param subscriptionId The customer subscription identifier
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param applicationName The name of the application resource.
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationResource> getAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationName, String apiVersion);

    /**
     * Deletes an application resource with the specified name.
     *
     * @param subscriptionId The customer subscription identifier
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param applicationName The name of the application resource.
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationName, String apiVersion);

}
