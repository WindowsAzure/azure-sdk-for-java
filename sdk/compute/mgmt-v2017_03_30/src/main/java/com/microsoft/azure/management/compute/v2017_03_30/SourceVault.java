/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The vault id is an Azure Resource Manager Resource id in the form
 * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}.
 */
public class SourceVault {
    /**
     * Resource Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource Id.
     *
     * @param id the id value to set
     * @return the SourceVault object itself.
     */
    public SourceVault withId(String id) {
        this.id = id;
        return this;
    }

}
