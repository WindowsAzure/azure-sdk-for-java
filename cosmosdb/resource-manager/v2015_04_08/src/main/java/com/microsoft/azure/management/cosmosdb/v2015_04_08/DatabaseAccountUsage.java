/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.UsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.CosmosDBManager;

/**
 * Type representing DatabaseAccountUsage.
 */
public interface DatabaseAccountUsage extends HasInner<UsageInner>, HasManager<CosmosDBManager> {
    /**
     * @return the currentValue value.
     */
    Integer currentValue();

    /**
     * @return the limit value.
     */
    Integer limit();

    /**
     * @return the name value.
     */
    MetricName name();

    /**
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * @return the unit value.
     */
    UnitType unit();

}
