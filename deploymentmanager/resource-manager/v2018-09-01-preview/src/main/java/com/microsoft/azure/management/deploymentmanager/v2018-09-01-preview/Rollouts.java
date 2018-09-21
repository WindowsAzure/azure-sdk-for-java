/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation.RolloutsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Rollouts.
 */
public interface Rollouts extends SupportsCreating<Rollout.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Rollout>, HasInner<RolloutsInner> {
    /**
     * Stops a running rollout.
     * A rollout can be canceled only if it is in running state.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Rollout> cancelAsync(String resourceGroupName, String rolloutName);

    /**
     * Restarts a failed rollout and optionally skips all succeeded steps.
     * A rollout can be restarted only if is in a terminal state and failed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Rollout> restartAsync(String resourceGroupName, String rolloutName);

}
