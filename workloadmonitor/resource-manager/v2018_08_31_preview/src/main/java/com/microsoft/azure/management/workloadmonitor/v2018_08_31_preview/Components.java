/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview;

import rx.Observable;
import java.util.UUID;

/**
 * Type representing Components.
 */
public interface Components {
    /**
     * Get list of components for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Component> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName);

    /**
     * Get details of a component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param componentId Component Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Component> getAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName, UUID componentId);

}
