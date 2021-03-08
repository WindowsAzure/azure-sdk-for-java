/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.ServerUsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SynapseManager;
import org.joda.time.DateTime;

/**
 * Type representing ServerUsage.
 */
public interface ServerUsage extends HasInner<ServerUsageInner>, HasManager<SynapseManager> {
    /**
     * @return the currentValue value.
     */
    Double currentValue();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the limit value.
     */
    Double limit();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextResetTime value.
     */
    DateTime nextResetTime();

    /**
     * @return the resourceName value.
     */
    String resourceName();

    /**
     * @return the unit value.
     */
    String unit();

}
