/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SynapseManager;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.IntegrationRuntimeMonitoringDataInner;
import java.util.List;

/**
 * Type representing IntegrationRuntimeMonitoringData.
 */
public interface IntegrationRuntimeMonitoringData extends HasInner<IntegrationRuntimeMonitoringDataInner>, HasManager<SynapseManager> {
    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nodes value.
     */
    List<IntegrationRuntimeNodeMonitoringData> nodes();

}
