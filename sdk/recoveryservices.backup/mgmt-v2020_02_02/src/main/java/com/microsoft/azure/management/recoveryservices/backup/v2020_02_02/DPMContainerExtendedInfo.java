/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information of the DPMContainer.
 */
public class DPMContainerExtendedInfo {
    /**
     * Last refresh time of the DPMContainer.
     */
    @JsonProperty(value = "lastRefreshedAt")
    private DateTime lastRefreshedAt;

    /**
     * Get last refresh time of the DPMContainer.
     *
     * @return the lastRefreshedAt value
     */
    public DateTime lastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Set last refresh time of the DPMContainer.
     *
     * @param lastRefreshedAt the lastRefreshedAt value to set
     * @return the DPMContainerExtendedInfo object itself.
     */
    public DPMContainerExtendedInfo withLastRefreshedAt(DateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

}
