/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Monitoring Setting properties payload.
 */
public class MonitoringSettingProperties {
    /**
     * State of the Monitoring Setting. Possible values include:
     * 'NotAvailable', 'Failed', 'Succeeded', 'Updating'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private MonitoringSettingState provisioningState;

    /**
     * Error when apply Monitoring Setting changes.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Indicates whether enable the trace functionality.
     */
    @JsonProperty(value = "traceEnabled")
    private Boolean traceEnabled;

    /**
     * Target application insight instrumentation key.
     */
    @JsonProperty(value = "appInsightsInstrumentationKey")
    private String appInsightsInstrumentationKey;

    /**
     * Get state of the Monitoring Setting. Possible values include: 'NotAvailable', 'Failed', 'Succeeded', 'Updating'.
     *
     * @return the provisioningState value
     */
    public MonitoringSettingState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get error when apply Monitoring Setting changes.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set error when apply Monitoring Setting changes.
     *
     * @param error the error value to set
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get indicates whether enable the trace functionality.
     *
     * @return the traceEnabled value
     */
    public Boolean traceEnabled() {
        return this.traceEnabled;
    }

    /**
     * Set indicates whether enable the trace functionality.
     *
     * @param traceEnabled the traceEnabled value to set
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withTraceEnabled(Boolean traceEnabled) {
        this.traceEnabled = traceEnabled;
        return this;
    }

    /**
     * Get target application insight instrumentation key.
     *
     * @return the appInsightsInstrumentationKey value
     */
    public String appInsightsInstrumentationKey() {
        return this.appInsightsInstrumentationKey;
    }

    /**
     * Set target application insight instrumentation key.
     *
     * @param appInsightsInstrumentationKey the appInsightsInstrumentationKey value to set
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withAppInsightsInstrumentationKey(String appInsightsInstrumentationKey) {
        this.appInsightsInstrumentationKey = appInsightsInstrumentationKey;
        return this;
    }

}
