/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_06_14;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.kusto.v2020_06_14.implementation.ClusterPrincipalAssignmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ClusterPrincipalAssignments.
 */
public interface ClusterPrincipalAssignments extends SupportsCreating<ClusterPrincipalAssignment.DefinitionStages.Blank>, HasInner<ClusterPrincipalAssignmentsInner> {
    /**
     * Gets a Kusto cluster principalAssignment.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ClusterPrincipalAssignment> getAsync(String resourceGroupName, String clusterName, String principalAssignmentName);

    /**
     * Lists all Kusto cluster principalAssignments.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ClusterPrincipalAssignment> listAsync(String resourceGroupName, String clusterName);

    /**
     * Deletes a Kusto cluster principalAssignment.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String clusterName, String principalAssignmentName);

    /**
     * Checks that the principal assignment name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param name Principal Assignment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameResult> checkNameAvailabilityAsync(String resourceGroupName, String clusterName, String name);

}
