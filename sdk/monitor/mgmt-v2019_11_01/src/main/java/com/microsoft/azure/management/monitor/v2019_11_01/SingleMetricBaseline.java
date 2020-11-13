/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MonitorManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.SingleMetricBaselineInner;
import java.util.List;
import org.joda.time.Period;

/**
 * Type representing SingleMetricBaseline.
 */
public interface SingleMetricBaseline extends HasInner<SingleMetricBaselineInner>, HasManager<MonitorManager> {
    /**
     * @return the baselines value.
     */
    List<TimeSeriesBaseline> baselines();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the interval value.
     */
    Period interval();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the namespace value.
     */
    String namespace();

    /**
     * @return the timespan value.
     */
    String timespan();

    /**
     * @return the type value.
     */
    String type();

}
