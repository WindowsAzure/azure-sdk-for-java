/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription quotas.
 */
public class Quota {
    /**
     * Remaining hosts quota by sku type.
     */
    @JsonProperty(value = "hostsRemaining", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, Integer> hostsRemaining;

    /**
     * Host quota is active for current subscription. Possible values include:
     * 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "quotaEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private QuotaEnabled quotaEnabled;

    /**
     * Get remaining hosts quota by sku type.
     *
     * @return the hostsRemaining value
     */
    public Map<String, Integer> hostsRemaining() {
        return this.hostsRemaining;
    }

    /**
     * Get host quota is active for current subscription. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the quotaEnabled value
     */
    public QuotaEnabled quotaEnabled() {
        return this.quotaEnabled;
    }

}
