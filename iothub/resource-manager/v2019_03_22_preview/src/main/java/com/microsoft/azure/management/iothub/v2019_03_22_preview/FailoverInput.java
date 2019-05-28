/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Use to provide failover region when requesting manual Failover for a hub.
 */
public class FailoverInput {
    /**
     * Region the hub will be failed over to.
     */
    @JsonProperty(value = "failoverRegion", required = true)
    private String failoverRegion;

    /**
     * Get region the hub will be failed over to.
     *
     * @return the failoverRegion value
     */
    public String failoverRegion() {
        return this.failoverRegion;
    }

    /**
     * Set region the hub will be failed over to.
     *
     * @param failoverRegion the failoverRegion value to set
     * @return the FailoverInput object itself.
     */
    public FailoverInput withFailoverRegion(String failoverRegion) {
        this.failoverRegion = failoverRegion;
        return this;
    }

}
