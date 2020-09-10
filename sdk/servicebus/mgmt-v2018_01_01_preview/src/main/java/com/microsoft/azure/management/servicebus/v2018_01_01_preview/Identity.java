/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to configure Identity for Bring your Own Keys.
 */
public class Identity {
    /**
     * ObjectId from the KeyVault.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * TenantId from the KeyVault.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Enumerates the possible value Identity type, which currently supports
     * only 'SystemAssigned'. Possible values include: 'SystemAssigned'.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /**
     * Get objectId from the KeyVault.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set objectId from the KeyVault.
     *
     * @param principalId the principalId value to set
     * @return the Identity object itself.
     */
    public Identity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get tenantId from the KeyVault.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set tenantId from the KeyVault.
     *
     * @param tenantId the tenantId value to set
     * @return the Identity object itself.
     */
    public Identity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get enumerates the possible value Identity type, which currently supports only 'SystemAssigned'. Possible values include: 'SystemAssigned'.
     *
     * @return the type value
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set enumerates the possible value Identity type, which currently supports only 'SystemAssigned'. Possible values include: 'SystemAssigned'.
     *
     * @param type the type value to set
     * @return the Identity object itself.
     */
    public Identity withType(IdentityType type) {
        this.type = type;
        return this;
    }

}
