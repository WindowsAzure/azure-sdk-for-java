/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update recovery plan input class.
 */
public class UpdateRecoveryPlanInput {
    /**
     * Recovery plan update properties.
     */
    @JsonProperty(value = "properties")
    private UpdateRecoveryPlanInputProperties properties;

    /**
     * Get recovery plan update properties.
     *
     * @return the properties value
     */
    public UpdateRecoveryPlanInputProperties properties() {
        return this.properties;
    }

    /**
     * Set recovery plan update properties.
     *
     * @param properties the properties value to set
     * @return the UpdateRecoveryPlanInput object itself.
     */
    public UpdateRecoveryPlanInput withProperties(UpdateRecoveryPlanInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
