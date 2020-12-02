/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed Virtual Network Settings.
 */
public class ManagedVirtualNetworkSettings {
    /**
     * Prevent Data Exfiltration.
     */
    @JsonProperty(value = "preventDataExfiltration")
    private Boolean preventDataExfiltration;

    /**
     * Linked Access Check On Target Resource.
     */
    @JsonProperty(value = "linkedAccessCheckOnTargetResource")
    private Boolean linkedAccessCheckOnTargetResource;

    /**
     * Allowed Aad Tenant Ids For Linking.
     */
    @JsonProperty(value = "allowedAadTenantIdsForLinking")
    private List<String> allowedAadTenantIdsForLinking;

    /**
     * Get prevent Data Exfiltration.
     *
     * @return the preventDataExfiltration value
     */
    public Boolean preventDataExfiltration() {
        return this.preventDataExfiltration;
    }

    /**
     * Set prevent Data Exfiltration.
     *
     * @param preventDataExfiltration the preventDataExfiltration value to set
     * @return the ManagedVirtualNetworkSettings object itself.
     */
    public ManagedVirtualNetworkSettings withPreventDataExfiltration(Boolean preventDataExfiltration) {
        this.preventDataExfiltration = preventDataExfiltration;
        return this;
    }

    /**
     * Get linked Access Check On Target Resource.
     *
     * @return the linkedAccessCheckOnTargetResource value
     */
    public Boolean linkedAccessCheckOnTargetResource() {
        return this.linkedAccessCheckOnTargetResource;
    }

    /**
     * Set linked Access Check On Target Resource.
     *
     * @param linkedAccessCheckOnTargetResource the linkedAccessCheckOnTargetResource value to set
     * @return the ManagedVirtualNetworkSettings object itself.
     */
    public ManagedVirtualNetworkSettings withLinkedAccessCheckOnTargetResource(Boolean linkedAccessCheckOnTargetResource) {
        this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
        return this;
    }

    /**
     * Get allowed Aad Tenant Ids For Linking.
     *
     * @return the allowedAadTenantIdsForLinking value
     */
    public List<String> allowedAadTenantIdsForLinking() {
        return this.allowedAadTenantIdsForLinking;
    }

    /**
     * Set allowed Aad Tenant Ids For Linking.
     *
     * @param allowedAadTenantIdsForLinking the allowedAadTenantIdsForLinking value to set
     * @return the ManagedVirtualNetworkSettings object itself.
     */
    public ManagedVirtualNetworkSettings withAllowedAadTenantIdsForLinking(List<String> allowedAadTenantIdsForLinking) {
        this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
        return this;
    }

}
