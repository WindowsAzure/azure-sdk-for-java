// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SyncAgentKeyProperties model. */
@Immutable
public final class SyncAgentKeyPropertiesInner {
    /*
     * Key of sync agent.
     */
    @JsonProperty(value = "syncAgentKey", access = JsonProperty.Access.WRITE_ONLY)
    private String syncAgentKey;

    /**
     * Get the syncAgentKey property: Key of sync agent.
     *
     * @return the syncAgentKey value.
     */
    public String syncAgentKey() {
        return this.syncAgentKey;
    }
}
