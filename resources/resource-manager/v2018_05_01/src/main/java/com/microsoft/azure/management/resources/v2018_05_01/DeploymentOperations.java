/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_05_01;

import rx.Observable;
import com.microsoft.azure.management.resources.v2018_05_01.implementation.DeploymentOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DeploymentOperations.
 */
public interface DeploymentOperations extends HasInner<DeploymentOperationsInner> {
    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentOperation> getAsync(String resourceGroupName, String deploymentName, String operationId);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentOperation> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName);

    /**
     * Gets a deployments operation.
     *
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentOperation> getAtSubscriptionScopeAsync(String deploymentName, String operationId);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param deploymentName The name of the deployment with the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentOperation> listAtSubscriptionScopeAsync(final String deploymentName);

}
