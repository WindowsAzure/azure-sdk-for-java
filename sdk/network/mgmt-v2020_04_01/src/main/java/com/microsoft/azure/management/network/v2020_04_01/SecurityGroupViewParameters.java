/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the VM to check security groups for.
 */
public class SecurityGroupViewParameters {
    /**
     * ID of the target VM.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Get iD of the target VM.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set iD of the target VM.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the SecurityGroupViewParameters object itself.
     */
    public SecurityGroupViewParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

}
