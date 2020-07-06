/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.UsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Usages.
 */
public interface Usages extends HasInner<UsagesInner> {
    /**
     * Gets a list of usage metrics for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageMetric> listAsync(String resourceGroupName, String workspaceName);

}
