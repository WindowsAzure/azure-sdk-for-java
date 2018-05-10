/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.management.keyvault.v2016_10_01.VaultAccessPolicyProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for updating the access policy in a vault.
 */
public class VaultAccessPolicyParametersInner {
    /**
     * The resource id of the access policy.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The resource name of the access policy.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The resource name of the access policy.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The resource type of the the access policy.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Properties of the access policy.
     */
    @JsonProperty(value = "properties", required = true)
    private VaultAccessPolicyProperties properties;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public VaultAccessPolicyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the VaultAccessPolicyParametersInner object itself.
     */
    public VaultAccessPolicyParametersInner withProperties(VaultAccessPolicyProperties properties) {
        this.properties = properties;
        return this;
    }

}
