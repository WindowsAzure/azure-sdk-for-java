/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.ResourceMetricInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.WebManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing ServerfarmResourceMetric.
 */
public interface ServerfarmResourceMetric extends HasInner<ResourceMetricInner>, HasManager<WebManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metricValues value.
     */
    List<ResourceMetricValue> metricValues();

    /**
     * @return the name value.
     */
    ResourceMetricName name();

    /**
     * @return the properties value.
     */
    List<ResourceMetricProperty> properties();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the timeGrain value.
     */
    String timeGrain();

    /**
     * @return the unit value.
     */
    String unit();

}
