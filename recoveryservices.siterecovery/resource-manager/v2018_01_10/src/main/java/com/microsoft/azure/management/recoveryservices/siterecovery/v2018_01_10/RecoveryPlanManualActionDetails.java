/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recovery plan manual action details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ManualActionDetails")
public class RecoveryPlanManualActionDetails extends RecoveryPlanActionDetails {
    /**
     * The manual action description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the manual action description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the manual action description.
     *
     * @param description the description value to set
     * @return the RecoveryPlanManualActionDetails object itself.
     */
    public RecoveryPlanManualActionDetails withDescription(String description) {
        this.description = description;
        return this;
    }

}
