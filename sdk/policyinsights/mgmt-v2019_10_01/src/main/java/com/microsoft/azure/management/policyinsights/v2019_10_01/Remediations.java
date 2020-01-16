/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.policyinsights.v2019_10_01.implementation.RemediationInner;
import com.microsoft.azure.management.policyinsights.v2019_10_01.implementation.RemediationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Remediations.
 */
public interface Remediations extends SupportsCreating<Remediation.DefinitionStages.Blank>, HasInner<RemediationsInner> {
    /**
     * Gets all deployments for a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RemediationDeployment> listDeploymentsAtManagementGroupAsync(final String managementGroupId, final String remediationName);

    /**
     * Cancels a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> cancelAtManagementGroupAsync(String managementGroupId, String remediationName);

    /**
     * Gets all remediations for the management group.
     *
     * @param managementGroupId Management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> listForManagementGroupAsync(final String managementGroupId);

    /**
     * Gets an existing remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> getAtManagementGroupAsync(String managementGroupId, String remediationName);

    /**
     * Deletes an existing remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> deleteAtManagementGroupAsync(String managementGroupId, String remediationName);

    /**
     * Gets all deployments for a remediation at subscription scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RemediationDeployment> listDeploymentsAtSubscriptionAsync(final String subscriptionId, final String remediationName);

    /**
     * Cancels a remediation at subscription scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> cancelAtSubscriptionAsync(String subscriptionId, String remediationName);

    /**
     * Creates or updates a remediation at subscription scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> createOrUpdateAtSubscriptionAsync(String subscriptionId, String remediationName, RemediationInner parameters);

    /**
     * Gets an existing remediation at subscription scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> getAtSubscriptionAsync(String subscriptionId, String remediationName);

    /**
     * Deletes an existing remediation at subscription scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> deleteAtSubscriptionAsync(String subscriptionId, String remediationName);

    /**
     * Gets all deployments for a remediation at resource group scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RemediationDeployment> listDeploymentsAtResourceGroupAsync(final String subscriptionId, final String resourceGroupName, final String remediationName);

    /**
     * Cancels a remediation at resource group scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> cancelAtResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName);

    /**
     * Creates or updates a remediation at resource group scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> createOrUpdateAtResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName, RemediationInner parameters);

    /**
     * Gets an existing remediation at resource group scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> getByResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName);

    /**
     * Deletes an existing remediation at resource group scope.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> deleteAtResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName);

    /**
     * Gets all deployments for a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RemediationDeployment> listDeploymentsAtResourceAsync(final String resourceId, final String remediationName);

    /**
     * Cancel a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> cancelAtResourceAsync(String resourceId, String remediationName);

    /**
     * Creates or updates a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> createOrUpdateAtResourceAsync(String resourceId, String remediationName, RemediationInner parameters);

    /**
     * Gets an existing remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> getAtResourceAsync(String resourceId, String remediationName);

    /**
     * Deletes an existing remediation at individual resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> deleteAtResourceAsync(String resourceId, String remediationName);

    /**
     * Gets all remediations for the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> listAsync(final String subscriptionId);

    /**
     * Gets all remediations for the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> listByResourceGroupAsync(final String subscriptionId, final String resourceGroupName);

    /**
     * Gets all remediations for a resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Remediation> listForResourceAsync(final String resourceId);

}
