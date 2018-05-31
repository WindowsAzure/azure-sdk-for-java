/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The policy sku.
 */
public class PolicySku {
    /**
     * The name of the policy sku. Possible values are A0 and A1.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The policy sku tier. Possible values are Free and Standard.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the PolicySku object itself.
     */
    public PolicySku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the PolicySku object itself.
     */
    public PolicySku withTier(String tier) {
        this.tier = tier;
        return this;
    }

}
