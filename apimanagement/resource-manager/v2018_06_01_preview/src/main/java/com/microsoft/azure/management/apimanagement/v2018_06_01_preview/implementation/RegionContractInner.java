/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Region profile.
 */
public class RegionContractInner {
    /**
     * Region name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * whether Region is the master region.
     */
    @JsonProperty(value = "isMasterRegion")
    private Boolean isMasterRegion;

    /**
     * whether Region is deleted.
     */
    @JsonProperty(value = "isDeleted")
    private Boolean isDeleted;

    /**
     * Get region name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get whether Region is the master region.
     *
     * @return the isMasterRegion value
     */
    public Boolean isMasterRegion() {
        return this.isMasterRegion;
    }

    /**
     * Set whether Region is the master region.
     *
     * @param isMasterRegion the isMasterRegion value to set
     * @return the RegionContractInner object itself.
     */
    public RegionContractInner withIsMasterRegion(Boolean isMasterRegion) {
        this.isMasterRegion = isMasterRegion;
        return this;
    }

    /**
     * Get whether Region is deleted.
     *
     * @return the isDeleted value
     */
    public Boolean isDeleted() {
        return this.isDeleted;
    }

    /**
     * Set whether Region is deleted.
     *
     * @param isDeleted the isDeleted value to set
     * @return the RegionContractInner object itself.
     */
    public RegionContractInner withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

}
