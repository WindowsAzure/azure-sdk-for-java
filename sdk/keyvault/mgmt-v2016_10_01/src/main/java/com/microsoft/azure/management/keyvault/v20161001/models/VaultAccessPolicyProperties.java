/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the vault access policy.
 */
public class VaultAccessPolicyProperties {
    /**
     * An array of 0 to 16 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's
     * tenant ID.
     */
    @JsonProperty(value = "accessPolicies", required = true)
    private List<AccessPolicyEntry> accessPolicies;

    /**
     * Get an array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     *
     * @return the accessPolicies value
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set an array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     *
     * @param accessPolicies the accessPolicies value to set
     * @return the VaultAccessPolicyProperties object itself.
     */
    public VaultAccessPolicyProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

}
