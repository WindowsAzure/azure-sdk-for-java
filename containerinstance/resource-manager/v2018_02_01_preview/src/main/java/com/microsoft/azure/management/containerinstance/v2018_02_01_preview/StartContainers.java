/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_02_01_preview;

import rx.Observable;
import com.microsoft.azure.management.containerinstance.v2018_02_01_preview.implementation.StartContainersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing StartContainers.
 */
public interface StartContainers extends HasInner<StartContainersInner> {
    /**
     * Starts the exec command for a specific container instance.
     * Starts the exec command for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContainerExecResponse> launchExecAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest);

}
