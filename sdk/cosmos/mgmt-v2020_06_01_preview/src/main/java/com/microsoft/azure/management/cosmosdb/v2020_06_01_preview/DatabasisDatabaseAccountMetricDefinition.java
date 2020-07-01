/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.MetricDefinitionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.CosmosDBManager;
import java.util.List;

/**
 * Type representing DatabasisDatabaseAccountMetricDefinition.
 */
public interface DatabasisDatabaseAccountMetricDefinition extends HasInner<MetricDefinitionInner>, HasManager<CosmosDBManager> {
    /**
     * @return the metricAvailabilities value.
     */
    List<MetricAvailability> metricAvailabilities();

    /**
     * @return the name value.
     */
    MetricName name();

    /**
     * @return the primaryAggregationType value.
     */
    PrimaryAggregationType primaryAggregationType();

    /**
     * @return the resourceUri value.
     */
    String resourceUri();

    /**
     * @return the unit value.
     */
    UnitType unit();

}
