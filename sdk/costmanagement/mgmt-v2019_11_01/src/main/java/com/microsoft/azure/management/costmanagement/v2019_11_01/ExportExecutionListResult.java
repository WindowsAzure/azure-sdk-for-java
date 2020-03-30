/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.costmanagement.v2019_11_01.implementation.CostManagementManager;
import com.microsoft.azure.management.costmanagement.v2019_11_01.implementation.ExportExecutionListResultInner;
import java.util.List;

/**
 * Type representing ExportExecutionListResult.
 */
public interface ExportExecutionListResult extends HasInner<ExportExecutionListResultInner>, HasManager<CostManagementManager> {
    /**
     * @return the value value.
     */
    List<ExportExecution> value();

}
