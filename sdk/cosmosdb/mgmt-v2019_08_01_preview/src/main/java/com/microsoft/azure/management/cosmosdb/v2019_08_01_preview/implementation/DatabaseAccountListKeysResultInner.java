/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The access keys for the given database account.
 */
public class DatabaseAccountListKeysResultInner extends DatabaseAccountListReadOnlyKeysResultInner {
    /**
     * Base 64 encoded value of the primary read-write key.
     */
    @JsonProperty(value = "primaryMasterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryMasterKey;

    /**
     * Base 64 encoded value of the secondary read-write key.
     */
    @JsonProperty(value = "secondaryMasterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryMasterKey;

    /**
     * Get base 64 encoded value of the primary read-write key.
     *
     * @return the primaryMasterKey value
     */
    public String primaryMasterKey() {
        return this.primaryMasterKey;
    }

    /**
     * Get base 64 encoded value of the secondary read-write key.
     *
     * @return the secondaryMasterKey value
     */
    public String secondaryMasterKey() {
        return this.secondaryMasterKey;
    }

}
