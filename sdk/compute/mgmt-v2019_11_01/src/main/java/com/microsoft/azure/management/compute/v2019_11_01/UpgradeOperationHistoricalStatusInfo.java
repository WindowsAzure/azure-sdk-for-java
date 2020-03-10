/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.UpgradeOperationHistoricalStatusInfoInner;

/**
 * Type representing UpgradeOperationHistoricalStatusInfo.
 */
public interface UpgradeOperationHistoricalStatusInfo extends HasInner<UpgradeOperationHistoricalStatusInfoInner>, HasManager<ComputeManager> {
    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the properties value.
     */
    UpgradeOperationHistoricalStatusInfoProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
