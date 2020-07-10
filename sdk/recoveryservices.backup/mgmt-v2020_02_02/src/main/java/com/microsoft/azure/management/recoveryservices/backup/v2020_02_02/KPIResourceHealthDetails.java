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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KPI Resource Health Details.
 */
public class KPIResourceHealthDetails {
    /**
     * Resource Health Status. Possible values include: 'Healthy',
     * 'TransientDegraded', 'PersistentDegraded', 'TransientUnhealthy',
     * 'PersistentUnhealthy', 'Invalid'.
     */
    @JsonProperty(value = "resourceHealthStatus")
    private ResourceHealthStatus resourceHealthStatus;

    /**
     * Resource Health Status.
     */
    @JsonProperty(value = "resourceHealthDetails")
    private List<ResourceHealthDetails> resourceHealthDetails;

    /**
     * Get resource Health Status. Possible values include: 'Healthy', 'TransientDegraded', 'PersistentDegraded', 'TransientUnhealthy', 'PersistentUnhealthy', 'Invalid'.
     *
     * @return the resourceHealthStatus value
     */
    public ResourceHealthStatus resourceHealthStatus() {
        return this.resourceHealthStatus;
    }

    /**
     * Set resource Health Status. Possible values include: 'Healthy', 'TransientDegraded', 'PersistentDegraded', 'TransientUnhealthy', 'PersistentUnhealthy', 'Invalid'.
     *
     * @param resourceHealthStatus the resourceHealthStatus value to set
     * @return the KPIResourceHealthDetails object itself.
     */
    public KPIResourceHealthDetails withResourceHealthStatus(ResourceHealthStatus resourceHealthStatus) {
        this.resourceHealthStatus = resourceHealthStatus;
        return this;
    }

    /**
     * Get resource Health Status.
     *
     * @return the resourceHealthDetails value
     */
    public List<ResourceHealthDetails> resourceHealthDetails() {
        return this.resourceHealthDetails;
    }

    /**
     * Set resource Health Status.
     *
     * @param resourceHealthDetails the resourceHealthDetails value to set
     * @return the KPIResourceHealthDetails object itself.
     */
    public KPIResourceHealthDetails withResourceHealthDetails(List<ResourceHealthDetails> resourceHealthDetails) {
        this.resourceHealthDetails = resourceHealthDetails;
        return this;
    }

}
