/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.resources.v2018_05_01.implementation.DeploymentInner;
import com.microsoft.azure.management.resources.v2018_05_01.implementation.DeploymentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Deployments.
 */
public interface Deployments extends SupportsCreating<DeploymentExtended.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DeploymentExtended>, SupportsListingByResourceGroup<DeploymentExtended>, SupportsListing<DeploymentExtended>, HasInner<DeploymentsInner> {
    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param deploymentName The name of the deployment to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param deploymentName The name of the deployment to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Deploys resources at subscription scope.
     * You can provide the template and parameters directly in the request or link to JSON files.
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> createOrUpdateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters);

    /**
     * Gets a deployment.
     *
     * @param deploymentName The name of the deployment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param deploymentName The name of the deployment to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param deploymentName The name of the deployment from which to get the template.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param resourceGroupName The name of the resource group with the deployment to check. The name is case insensitive.
     * @param deploymentName The name of the deployment to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAsync(String resourceGroupName, String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resource group partially deployed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param resourceGroupName The name of the resource group the template will be deployed to. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAsync(String resourceGroupName, String deploymentName, DeploymentInner parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment from which to get the template.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAsync(String resourceGroupName, String deploymentName);

}
