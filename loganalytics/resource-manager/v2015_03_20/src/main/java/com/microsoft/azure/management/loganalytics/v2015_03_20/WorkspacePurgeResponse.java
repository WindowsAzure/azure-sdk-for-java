/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2015_03_20.implementation.LogAnalyticsManager;
import com.microsoft.azure.management.loganalytics.v2015_03_20.implementation.WorkspacePurgeResponseInner;

/**
 * Type representing WorkspacePurgeResponse.
 */
public interface WorkspacePurgeResponse extends HasInner<WorkspacePurgeResponseInner>, HasManager<LogAnalyticsManager> {
    /**
     * @return the operationId value.
     */
    String operationId();

}
