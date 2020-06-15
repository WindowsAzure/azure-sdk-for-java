/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2020_05_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Developer Keys of account.
 */
public class AccountKeysInner {
    /**
     * value of primary key.
     */
    @JsonProperty(value = "primaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryKey;

    /**
     * value of secondary key.
     */
    @JsonProperty(value = "secondaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryKey;

    /**
     * Get value of primary key.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Get value of secondary key.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

}
