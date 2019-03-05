/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure Fabric Specific Details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("Azure")
public class AzureFabricSpecificDetails extends FabricSpecificDetails {
    /**
     * The Location for the Azure fabric.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The container Ids for the Azure fabric.
     */
    @JsonProperty(value = "containerIds")
    private List<String> containerIds;

    /**
     * Get the Location for the Azure fabric.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the Location for the Azure fabric.
     *
     * @param location the location value to set
     * @return the AzureFabricSpecificDetails object itself.
     */
    public AzureFabricSpecificDetails withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the container Ids for the Azure fabric.
     *
     * @return the containerIds value
     */
    public List<String> containerIds() {
        return this.containerIds;
    }

    /**
     * Set the container Ids for the Azure fabric.
     *
     * @param containerIds the containerIds value to set
     * @return the AzureFabricSpecificDetails object itself.
     */
    public AzureFabricSpecificDetails withContainerIds(List<String> containerIds) {
        this.containerIds = containerIds;
        return this;
    }

}
