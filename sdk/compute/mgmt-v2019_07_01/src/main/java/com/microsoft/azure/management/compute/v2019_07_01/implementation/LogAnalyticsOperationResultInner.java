/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import com.microsoft.azure.management.compute.v2019_07_01.LogAnalyticsOutput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LogAnalytics operation status response.
 */
public class LogAnalyticsOperationResultInner {
    /**
     * LogAnalyticsOutput.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private LogAnalyticsOutput properties;

    /**
     * Get logAnalyticsOutput.
     *
     * @return the properties value
     */
    public LogAnalyticsOutput properties() {
        return this.properties;
    }

}
