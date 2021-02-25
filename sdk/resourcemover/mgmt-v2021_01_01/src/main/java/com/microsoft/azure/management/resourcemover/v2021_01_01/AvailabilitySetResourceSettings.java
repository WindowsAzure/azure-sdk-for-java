/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Gets or sets the availability set resource settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType", defaultImpl = AvailabilitySetResourceSettings.class)
@JsonTypeName("Microsoft.Compute/availabilitySets")
public class AvailabilitySetResourceSettings extends ResourceSettings {
    /**
     * Gets or sets the target fault domain.
     */
    @JsonProperty(value = "faultDomain")
    private Integer faultDomain;

    /**
     * Gets or sets the target update domain.
     */
    @JsonProperty(value = "updateDomain")
    private Integer updateDomain;

    /**
     * Get gets or sets the target fault domain.
     *
     * @return the faultDomain value
     */
    public Integer faultDomain() {
        return this.faultDomain;
    }

    /**
     * Set gets or sets the target fault domain.
     *
     * @param faultDomain the faultDomain value to set
     * @return the AvailabilitySetResourceSettings object itself.
     */
    public AvailabilitySetResourceSettings withFaultDomain(Integer faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }

    /**
     * Get gets or sets the target update domain.
     *
     * @return the updateDomain value
     */
    public Integer updateDomain() {
        return this.updateDomain;
    }

    /**
     * Set gets or sets the target update domain.
     *
     * @param updateDomain the updateDomain value to set
     * @return the AvailabilitySetResourceSettings object itself.
     */
    public AvailabilitySetResourceSettings withUpdateDomain(Integer updateDomain) {
        this.updateDomain = updateDomain;
        return this;
    }

}
