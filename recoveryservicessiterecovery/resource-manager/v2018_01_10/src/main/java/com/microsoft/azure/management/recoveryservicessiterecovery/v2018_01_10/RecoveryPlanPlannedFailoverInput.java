/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan planned failover input.
 */
public class RecoveryPlanPlannedFailoverInput {
    /**
     * The recovery plan planned failover input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RecoveryPlanPlannedFailoverInputProperties properties;

    /**
     * Get the recovery plan planned failover input properties.
     *
     * @return the properties value
     */
    public RecoveryPlanPlannedFailoverInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the recovery plan planned failover input properties.
     *
     * @param properties the properties value to set
     * @return the RecoveryPlanPlannedFailoverInput object itself.
     */
    public RecoveryPlanPlannedFailoverInput withProperties(RecoveryPlanPlannedFailoverInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
