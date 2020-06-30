/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.CosmosDBManager;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.PartitionUsageInner;

/**
 * Type representing PartitionUsage.
 */
public interface PartitionUsage extends HasInner<PartitionUsageInner>, HasManager<CosmosDBManager> {
    /**
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    MetricName name();

    /**
     * @return the partitionId value.
     */
    String partitionId();

    /**
     * @return the partitionKeyRangeId value.
     */
    String partitionKeyRangeId();

    /**
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * @return the unit value.
     */
    UnitType unit();

}
