/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2020_06_01.implementation.ResourcesManager;
import com.microsoft.azure.management.resources.v2020_06_01.implementation.DeploymentExportResultInner;

/**
 * Type representing DeploymentExportResult.
 */
public interface DeploymentExportResult extends HasInner<DeploymentExportResultInner>, HasManager<ResourcesManager> {
    /**
     * @return the template value.
     */
    Object template();

}
