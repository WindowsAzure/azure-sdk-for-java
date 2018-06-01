/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourceGroupExportResultInner;

/**
 * Type representing ResourceGroupExportResult.
 */
public interface ResourceGroupExportResult extends HasInner<ResourceGroupExportResultInner>, HasManager<ResourcesManager> {
    /**
     * @return the error value.
     */
    ResourceManagementErrorWithDetails error();

    /**
     * @return the template value.
     */
    Object template();

}
