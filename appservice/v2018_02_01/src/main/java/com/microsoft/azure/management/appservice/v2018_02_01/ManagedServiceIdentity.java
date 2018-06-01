/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed service identity.
 */
public class ManagedServiceIdentity {
    /**
     * Type of managed service identity. Possible values include:
     * 'SystemAssigned', 'UserAssigned'.
     */
    @JsonProperty(value = "type")
    private ManagedServiceIdentityType type;

    /**
     * Tenant of managed service identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Principal Id of managed service identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * Array of UserAssigned managed service identities.
     */
    @JsonProperty(value = "identityIds")
    private List<String> identityIds;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId value.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the identityIds value.
     *
     * @return the identityIds value
     */
    public List<String> identityIds() {
        return this.identityIds;
    }

    /**
     * Set the identityIds value.
     *
     * @param identityIds the identityIds value to set
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withIdentityIds(List<String> identityIds) {
        this.identityIds = identityIds;
        return this;
    }

}
