/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quota availability request content.
 */
public class QuotaAvailabilityRequest {
    /**
     * Name of the resource to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Resource type used for verification. Possible values include:
     * 'Microsoft.NetApp/netAppAccounts',
     * 'Microsoft.NetApp/netAppAccounts/capacityPools',
     * 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes',
     * 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'.
     */
    @JsonProperty(value = "type", required = true)
    private CheckQuotaNameResourceTypes type;

    /**
     * Resource group name.
     */
    @JsonProperty(value = "resourceGroup", required = true)
    private String resourceGroup;

    /**
     * Get name of the resource to verify.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource to verify.
     *
     * @param name the name value to set
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'.
     *
     * @return the type value
     */
    public CheckQuotaNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'.
     *
     * @param type the type value to set
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withType(CheckQuotaNameResourceTypes type) {
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
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

}
