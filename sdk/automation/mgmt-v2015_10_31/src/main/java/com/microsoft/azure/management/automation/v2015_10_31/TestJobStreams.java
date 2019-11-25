/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.TestJobStreamsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TestJobStreams.
 */
public interface TestJobStreams extends HasInner<TestJobStreamsInner> {
    /**
     * Retrieve a test job stream of the test job identified by runbook name and stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param jobStreamId The job stream id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CompilationjobAutomationAccountJobStream> getAsync(String resourceGroupName, String automationAccountName, String runbookName, String jobStreamId);

    /**
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CompilationjobAutomationAccountJobStream> listByTestJobAsync(final String resourceGroupName, final String automationAccountName, final String runbookName);

}
