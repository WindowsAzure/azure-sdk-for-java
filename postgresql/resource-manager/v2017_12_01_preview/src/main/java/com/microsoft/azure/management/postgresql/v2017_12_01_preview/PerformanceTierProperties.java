/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation.PerformanceTierPropertiesInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation.PostgreSQLManager;
import java.util.List;

/**
 * Type representing PerformanceTierProperties.
 */
public interface PerformanceTierProperties extends HasInner<PerformanceTierPropertiesInner>, HasManager<PostgreSQLManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the serviceLevelObjectives value.
     */
    List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives();

}
