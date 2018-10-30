/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SubscriptionNotificationProperties model.
 */
public class SubscriptionNotificationProperties {
    /**
     * The tenantId property.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the SubscriptionNotificationProperties object itself.
     */
    public SubscriptionNotificationProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
