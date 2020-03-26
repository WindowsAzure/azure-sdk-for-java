// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PreAuthorizedApplicationPermission model.
 */
@Fluent
public final class PreAuthorizedApplicationPermission {
    /*
     * Indicates whether the permission set is DirectAccess or impersonation.
     */
    @JsonProperty(value = "directAccessGrant")
    private Boolean directAccessGrant;

    /*
     * The list of permissions.
     */
    @JsonProperty(value = "accessGrants")
    private List<String> accessGrants;

    /**
     * Get the directAccessGrant property: Indicates whether the permission set
     * is DirectAccess or impersonation.
     * 
     * @return the directAccessGrant value.
     */
    public Boolean isDirectAccessGrant() {
        return this.directAccessGrant;
    }

    /**
     * Set the directAccessGrant property: Indicates whether the permission set
     * is DirectAccess or impersonation.
     * 
     * @param directAccessGrant the directAccessGrant value to set.
     * @return the PreAuthorizedApplicationPermission object itself.
     */
    public PreAuthorizedApplicationPermission setDirectAccessGrant(Boolean directAccessGrant) {
        this.directAccessGrant = directAccessGrant;
        return this;
    }

    /**
     * Get the accessGrants property: The list of permissions.
     * 
     * @return the accessGrants value.
     */
    public List<String> getAccessGrants() {
        return this.accessGrants;
    }

    /**
     * Set the accessGrants property: The list of permissions.
     * 
     * @param accessGrants the accessGrants value to set.
     * @return the PreAuthorizedApplicationPermission object itself.
     */
    public PreAuthorizedApplicationPermission setAccessGrants(List<String> accessGrants) {
        this.accessGrants = accessGrants;
        return this;
    }
}
