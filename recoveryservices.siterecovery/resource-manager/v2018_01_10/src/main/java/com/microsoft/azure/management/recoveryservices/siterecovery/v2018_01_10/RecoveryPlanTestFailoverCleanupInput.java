/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan test failover cleanup input.
 */
public class RecoveryPlanTestFailoverCleanupInput {
    /**
     * The recovery plan test failover cleanup input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RecoveryPlanTestFailoverCleanupInputProperties properties;

    /**
     * Get the recovery plan test failover cleanup input properties.
     *
     * @return the properties value
     */
    public RecoveryPlanTestFailoverCleanupInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the recovery plan test failover cleanup input properties.
     *
     * @param properties the properties value to set
     * @return the RecoveryPlanTestFailoverCleanupInput object itself.
     */
    public RecoveryPlanTestFailoverCleanupInput withProperties(RecoveryPlanTestFailoverCleanupInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
