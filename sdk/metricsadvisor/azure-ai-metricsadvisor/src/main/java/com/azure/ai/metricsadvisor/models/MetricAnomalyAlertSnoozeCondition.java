// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetricAnomalyAlertSnoozeCondition model. */
@Fluent
public final class MetricAnomalyAlertSnoozeCondition {
    /*
     * snooze point count, value range : [0, +∞)
     */
    @JsonProperty(value = "autoSnooze", required = true)
    private int autoSnooze;

    /*
     * snooze scope
     */
    @JsonProperty(value = "snoozeScope", required = true)
    private SnoozeScope snoozeScope;

    /*
     * only snooze for successive anomalies
     */
    @JsonProperty(value = "onlyForSuccessive", required = true)
    private boolean onlyForSuccessive;

    /**
     * Get the autoSnooze property: snooze point count, value range : [0, +∞).
     *
     * @return the autoSnooze value.
     */
    public int getAutoSnooze() {
        return this.autoSnooze;
    }

    /**
     * Set the autoSnooze property: snooze point count, value range : [0, +∞).
     *
     * @param autoSnooze the autoSnooze value to set.
     * @return the MetricAnomalyAlertSnoozeCondition object itself.
     */
    public MetricAnomalyAlertSnoozeCondition setAutoSnooze(int autoSnooze) {
        this.autoSnooze = autoSnooze;
        return this;
    }

    /**
     * Get the snoozeScope property: snooze scope.
     *
     * @return the snoozeScope value.
     */
    public SnoozeScope getSnoozeScope() {
        return this.snoozeScope;
    }

    /**
     * Set the snoozeScope property: snooze scope.
     *
     * @param snoozeScope the snoozeScope value to set.
     * @return the MetricAnomalyAlertSnoozeCondition object itself.
     */
    public MetricAnomalyAlertSnoozeCondition setSnoozeScope(SnoozeScope snoozeScope) {
        this.snoozeScope = snoozeScope;
        return this;
    }

    /**
     * Get the onlyForSuccessive property: only snooze for successive anomalies.
     *
     * @return the onlyForSuccessive value.
     */
    public boolean isOnlyForSuccessive() {
        return this.onlyForSuccessive;
    }

    /**
     * Set the onlyForSuccessive property: only snooze for successive anomalies.
     *
     * @param onlyForSuccessive the onlyForSuccessive value to set.
     * @return the MetricAnomalyAlertSnoozeCondition object itself.
     */
    public MetricAnomalyAlertSnoozeCondition setOnlyForSuccessive(boolean onlyForSuccessive) {
        this.onlyForSuccessive = onlyForSuccessive;
        return this;
    }
}
