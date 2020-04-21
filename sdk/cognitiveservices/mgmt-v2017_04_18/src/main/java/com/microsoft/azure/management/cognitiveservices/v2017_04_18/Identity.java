/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed service identity.
 */
public class Identity {
    /**
     * Type of managed service identity. Possible values include: 'None',
     * 'SystemAssigned', 'UserAssigned'.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

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
     * The list of user assigned identities associated with the resource. The
     * user identity dictionary key references will be ARM resource ids in the
     * form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Get type of managed service identity. Possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     *
     * @return the type value
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set type of managed service identity. Possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     *
     * @param type the type value to set
     * @return the Identity object itself.
     */
    public Identity withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get tenant of managed service identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get principal Id of managed service identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     *
     * @return the userAssignedIdentities value
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the Identity object itself.
     */
    public Identity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

}
