/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2017_10_01;

import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of upgrade notification.
 */
public class UpgradeNotification {
    /**
     * Name of upgrade notification.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Timestamp when upgrade notification occured.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Details about this upgrade notification.
     */
    @JsonProperty(value = "upsellNotification", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> upsellNotification;

    /**
     * Get name of upgrade notification.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get timestamp when upgrade notification occured.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get details about this upgrade notification.
     *
     * @return the upsellNotification value
     */
    public Map<String, String> upsellNotification() {
        return this.upsellNotification;
    }

}
