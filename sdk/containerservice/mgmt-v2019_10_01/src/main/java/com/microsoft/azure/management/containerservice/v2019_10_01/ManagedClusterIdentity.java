/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity for the managed cluster.
 */
public class ManagedClusterIdentity {
    /**
     * The principal id of the system assigned identity which is used by master
     * components.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id of the system assigned identity which is used by master
     * components.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The type of identity used for the managed cluster. Type 'SystemAssigned'
     * will use an implicitly created identity in master components and an
     * auto-created user assigned identity in MC_ resource group in agent
     * nodes. Type 'None' will not use MSI for the managed cluster, service
     * principal will be used instead. Possible values include:
     * 'SystemAssigned', 'None'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Get the principal id of the system assigned identity which is used by master components.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id of the system assigned identity which is used by master components.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of identity used for the managed cluster. Type 'SystemAssigned' will use an implicitly created identity in master components and an auto-created user assigned identity in MC_ resource group in agent nodes. Type 'None' will not use MSI for the managed cluster, service principal will be used instead. Possible values include: 'SystemAssigned', 'None'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the managed cluster. Type 'SystemAssigned' will use an implicitly created identity in master components and an auto-created user assigned identity in MC_ resource group in agent nodes. Type 'None' will not use MSI for the managed cluster, service principal will be used instead. Possible values include: 'SystemAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the ManagedClusterIdentity object itself.
     */
    public ManagedClusterIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

}
