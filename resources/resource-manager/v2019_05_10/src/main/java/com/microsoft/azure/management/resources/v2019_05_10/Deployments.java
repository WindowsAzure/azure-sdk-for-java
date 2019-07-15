/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.resources.v2019_05_10.implementation.DeploymentInner;
import com.microsoft.azure.management.resources.v2019_05_10.implementation.DeploymentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Deployments.
 */
public interface Deployments extends SupportsCreating<DeploymentExtended.DefinitionStages.Blank>, HasInner<DeploymentsInner> {
    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Gets a deployment.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAtManagementGroupScopeAsync(String groupId, String deploymentName, DeploymentInner parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Get all the deployments for a management group.
     *
     * @param groupId The management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> listAtManagementGroupScopeAsync(final String groupId);

    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param deploymentName The name of the deployment.
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
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param deploymentName The name of the deployment.
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
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. Deleting a template deployment does not affect the state of the resource group. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param resourceGroupName The name of the resource group with the deployment to delete. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param resourceGroupName The name of the resource group with the deployment to check. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAsync(String resourceGroupName, String deploymentName);

    /**
     * Deploys resources to a resource group.
     * You can provide the template and parameters directly in the request or link to JSON files.
     *
     * @param resourceGroupName The name of the resource group to deploy the resources to. The name is case insensitive. The resource group must already exist.
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> createOrUpdateAsync(String resourceGroupName, String deploymentName, DeploymentInner parameters);

    /**
     * Gets a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getByResourceGroupAsync(String resourceGroupName, String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resource group partially deployed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
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
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAsync(String resourceGroupName, String deploymentName);

    /**
     * Get all the deployments for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> listAsync();

    /**
     * Get all the deployments for a resource group.
     *
     * @param resourceGroupName The name of the resource group with the deployments to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> listByResourceGroupAsync(final String resourceGroupName);

}
