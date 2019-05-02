/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource name availability request content.
 */
public class ResourceNameAvailabilityRequest {
    /**
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Resource type used for verification. Possible values include:
     * 'Microsoft.NetApp/netAppAccount',
     * 'Microsoft.NetApp/netAppAccount/capacityPools',
     * 'Microsoft.NetApp/netAppAccount/capacityPools/volumes',
     * 'Microsoft.NetApp/netAppAccount/capacityPools/volumes/snapshots'.
     */
    @JsonProperty(value = "type", required = true)
    private CheckNameResourceTypes type;

    /**
     * Resource group name.
     */
    @JsonProperty(value = "resourceGroup", required = true)
    private String resourceGroup;

    /**
     * Get resource name to verify.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name to verify.
     *
     * @param name the name value to set
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccount', 'Microsoft.NetApp/netAppAccount/capacityPools', 'Microsoft.NetApp/netAppAccount/capacityPools/volumes', 'Microsoft.NetApp/netAppAccount/capacityPools/volumes/snapshots'.
     *
     * @return the type value
     */
    public CheckNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccount', 'Microsoft.NetApp/netAppAccount/capacityPools', 'Microsoft.NetApp/netAppAccount/capacityPools/volumes', 'Microsoft.NetApp/netAppAccount/capacityPools/volumes/snapshots'.
     *
     * @param type the type value to set
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withType(CheckNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get resource group name.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set resource group name.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

}
