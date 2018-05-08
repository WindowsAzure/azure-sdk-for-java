/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.IntegrationAccountAssembliesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Assemblies.
 */
public interface Assemblies extends SupportsCreating<AssemblyDefinition.DefinitionStages.Blank>, HasInner<IntegrationAccountAssembliesInner> {

    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AssemblyDefinition> listByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName);

    /**
     * Get an assembly for an integration account.
    *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AssemblyDefinition> getByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName);

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName);
    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName);

}
