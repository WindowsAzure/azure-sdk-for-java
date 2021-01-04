// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.resourcemanager.loganalytics.fluent.models.UsageMetricInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of UsageMetric. */
public interface UsageMetric {
    /**
     * Gets the name property: The name of the metric.
     *
     * @return the name value.
     */
    MetricName name();

    /**
     * Gets the unit property: The units used for the metric.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the currentValue property: The current value of the metric.
     *
     * @return the currentValue value.
     */
    Double currentValue();

    /**
     * Gets the limit property: The quota limit for the metric.
     *
     * @return the limit value.
     */
    Double limit();

    /**
     * Gets the nextResetTime property: The time that the metric's value will reset.
     *
     * @return the nextResetTime value.
     */
    OffsetDateTime nextResetTime();

    /**
     * Gets the quotaPeriod property: The quota period that determines the length of time between value resets.
     *
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.UsageMetricInner object.
     *
     * @return the inner object.
     */
    UsageMetricInner innerModel();
}
