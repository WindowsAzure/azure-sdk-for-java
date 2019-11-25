/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.ModulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Modules.
 */
public interface Modules extends SupportsCreating<Module.DefinitionStages.Blank>, HasInner<ModulesInner> {
    /**
     * Retrieve the module identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The module name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Module> getAsync(String resourceGroupName, String automationAccountName, String moduleName);

    /**
     * Retrieve a list of modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Module> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName);

    /**
     * Delete the module by name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The module name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String automationAccountName, String moduleName);

}
