/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response after calling a manual recovery walk.
 */
public class RecoveryWalkResponseInner {
    /**
     * Whether the recovery walk was performed.
     */
    @JsonProperty(value = "walkPerformed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean walkPerformed;

    /**
     * The next update domain that needs to be walked. Null means walk spanning
     * all update domains has been completed.
     */
    @JsonProperty(value = "nextPlatformUpdateDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer nextPlatformUpdateDomain;

    /**
     * Get whether the recovery walk was performed.
     *
     * @return the walkPerformed value
     */
    public Boolean walkPerformed() {
        return this.walkPerformed;
    }

    /**
     * Get the next update domain that needs to be walked. Null means walk spanning all update domains has been completed.
     *
     * @return the nextPlatformUpdateDomain value
     */
    public Integer nextPlatformUpdateDomain() {
        return this.nextPlatformUpdateDomain;
    }

}
