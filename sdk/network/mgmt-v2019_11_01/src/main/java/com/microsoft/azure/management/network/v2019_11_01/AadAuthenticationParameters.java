/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AAD Vpn authentication type related parameters.
 */
public class AadAuthenticationParameters {
    /**
     * AAD Vpn authentication parameter AAD tenant.
     */
    @JsonProperty(value = "aadTenant")
    private String aadTenant;

    /**
     * AAD Vpn authentication parameter AAD audience.
     */
    @JsonProperty(value = "aadAudience")
    private String aadAudience;

    /**
     * AAD Vpn authentication parameter AAD issuer.
     */
    @JsonProperty(value = "aadIssuer")
    private String aadIssuer;

    /**
     * Get aAD Vpn authentication parameter AAD tenant.
     *
     * @return the aadTenant value
     */
    public String aadTenant() {
        return this.aadTenant;
    }

    /**
     * Set aAD Vpn authentication parameter AAD tenant.
     *
     * @param aadTenant the aadTenant value to set
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadTenant(String aadTenant) {
        this.aadTenant = aadTenant;
        return this;
    }

    /**
     * Get aAD Vpn authentication parameter AAD audience.
     *
     * @return the aadAudience value
     */
    public String aadAudience() {
        return this.aadAudience;
    }

    /**
     * Set aAD Vpn authentication parameter AAD audience.
     *
     * @param aadAudience the aadAudience value to set
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadAudience(String aadAudience) {
        this.aadAudience = aadAudience;
        return this;
    }

    /**
     * Get aAD Vpn authentication parameter AAD issuer.
     *
     * @return the aadIssuer value
     */
    public String aadIssuer() {
        return this.aadIssuer;
    }

    /**
     * Set aAD Vpn authentication parameter AAD issuer.
     *
     * @param aadIssuer the aadIssuer value to set
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadIssuer(String aadIssuer) {
        this.aadIssuer = aadIssuer;
        return this;
    }

}
