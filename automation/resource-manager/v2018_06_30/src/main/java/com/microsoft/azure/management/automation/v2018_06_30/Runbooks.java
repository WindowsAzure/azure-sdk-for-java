/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.automation.v2018_06_30.implementation.RunbooksInner;
import com.microsoft.azure.arm.model.HasInner;

import java.io.InputStream;

/**
 * Type representing Runbooks.
 */
public interface Runbooks extends SupportsCreating<Runbook.DefinitionStages.Blank>, HasInner<RunbooksInner> {
    /**
     * Publish runbook draft.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the publish runbook operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable publishAsync(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Retrieve the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Runbook> getAsync(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Retrieve a list of runbooks.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Runbook> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName);

    /**
     * Delete the runbook by name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Retrieve the content of runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InputStream> getContentAsync(String resourceGroupName, String automationAccountName, String runbookName);

}
