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
 * SKU of a public IP prefix.
 */
public class PublicIPPrefixSku {
    /**
     * Name of a public IP prefix SKU. Possible values include: 'Standard'.
     */
    @JsonProperty(value = "name")
    private PublicIPPrefixSkuName name;

    /**
     * Get name of a public IP prefix SKU. Possible values include: 'Standard'.
     *
     * @return the name value
     */
    public PublicIPPrefixSkuName name() {
        return this.name;
    }

    /**
     * Set name of a public IP prefix SKU. Possible values include: 'Standard'.
     *
     * @param name the name value to set
     * @return the PublicIPPrefixSku object itself.
     */
    public PublicIPPrefixSku withName(PublicIPPrefixSkuName name) {
        this.name = name;
        return this;
    }

}
