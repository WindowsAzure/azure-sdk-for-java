/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TerminateNotificationProfile model.
 */
public class TerminateNotificationProfile {
    /**
     * Configurable length of time a Virtual Machine being deleted will have to
     * potentially approve the Terminate Scheduled Event before the event is
     * auto approved (timed out). The configuration must be specified in ISO
     * 8601 format, the default value is 5 minutes (PT5M).
     */
    @JsonProperty(value = "notBeforeTimeout")
    private String notBeforeTimeout;

    /**
     * Specifies whether the Terminate Scheduled event is enabled or disabled.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /**
     * Get configurable length of time a Virtual Machine being deleted will have to potentially approve the Terminate Scheduled Event before the event is auto approved (timed out). The configuration must be specified in ISO 8601 format, the default value is 5 minutes (PT5M).
     *
     * @return the notBeforeTimeout value
     */
    public String notBeforeTimeout() {
        return this.notBeforeTimeout;
    }

    /**
     * Set configurable length of time a Virtual Machine being deleted will have to potentially approve the Terminate Scheduled Event before the event is auto approved (timed out). The configuration must be specified in ISO 8601 format, the default value is 5 minutes (PT5M).
     *
     * @param notBeforeTimeout the notBeforeTimeout value to set
     * @return the TerminateNotificationProfile object itself.
     */
    public TerminateNotificationProfile withNotBeforeTimeout(String notBeforeTimeout) {
        this.notBeforeTimeout = notBeforeTimeout;
        return this;
    }

    /**
     * Get specifies whether the Terminate Scheduled event is enabled or disabled.
     *
     * @return the enable value
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set specifies whether the Terminate Scheduled event is enabled or disabled.
     *
     * @param enable the enable value to set
     * @return the TerminateNotificationProfile object itself.
     */
    public TerminateNotificationProfile withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

}
