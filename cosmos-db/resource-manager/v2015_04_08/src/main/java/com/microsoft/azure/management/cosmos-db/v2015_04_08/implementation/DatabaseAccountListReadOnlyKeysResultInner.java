/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmos-db.v2015_04_08.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The read-only access keys for the given database account.
 */
public class DatabaseAccountListReadOnlyKeysResultInner {
    /**
     * Base 64 encoded value of the primary read-only key.
     */
    @JsonProperty(value = "primaryReadonlyMasterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryReadonlyMasterKey;

    /**
     * Base 64 encoded value of the secondary read-only key.
     */
    @JsonProperty(value = "secondaryReadonlyMasterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryReadonlyMasterKey;

    /**
     * Get base 64 encoded value of the primary read-only key.
     *
     * @return the primaryReadonlyMasterKey value
     */
    public String primaryReadonlyMasterKey() {
        return this.primaryReadonlyMasterKey;
    }

    /**
     * Get base 64 encoded value of the secondary read-only key.
     *
     * @return the secondaryReadonlyMasterKey value
     */
    public String secondaryReadonlyMasterKey() {
        return this.secondaryReadonlyMasterKey;
    }

}
