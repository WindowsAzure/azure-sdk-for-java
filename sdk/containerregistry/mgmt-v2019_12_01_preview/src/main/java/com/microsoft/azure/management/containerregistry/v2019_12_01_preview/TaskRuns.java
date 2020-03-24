/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.TaskRunsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TaskRuns.
 */
public interface TaskRuns extends SupportsCreating<TaskRun.DefinitionStages.Blank>, HasInner<TaskRunsInner> {
    /**
     * Gets the detailed information for a given task run that includes all secrets.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The run request name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TaskRun> getDetailsAsync(String resourceGroupName, String registryName, String taskRunName);

    /**
     * Gets the detailed information for a given task run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The run request name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TaskRun> getAsync(String resourceGroupName, String registryName, String taskRunName);

    /**
     * Lists all the task runs for a specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TaskRun> listAsync(final String resourceGroupName, final String registryName);

    /**
     * Deletes a specified task run resource.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The task run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String registryName, String taskRunName);

}
