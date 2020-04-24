/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.costmanagement.v2019_11_01.implementation.CostManagementManager;
import com.microsoft.azure.management.costmanagement.v2019_11_01.implementation.DimensionInner;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing Dimension.
 */
public interface Dimension extends HasInner<DimensionInner>, HasManager<CostManagementManager> {
    /**
     * @return the category value.
     */
    String category();

    /**
     * @return the data value.
     */
    List<String> data();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the filterEnabled value.
     */
    Boolean filterEnabled();

    /**
     * @return the groupingEnabled value.
     */
    Boolean groupingEnabled();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the total value.
     */
    Integer total();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageEnd value.
     */
    DateTime usageEnd();

    /**
     * @return the usageStart value.
     */
    DateTime usageStart();

}
