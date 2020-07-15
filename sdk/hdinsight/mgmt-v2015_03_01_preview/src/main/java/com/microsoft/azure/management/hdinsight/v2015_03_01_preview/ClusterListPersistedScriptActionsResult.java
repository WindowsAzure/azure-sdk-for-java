/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ListPersistedScriptActions operation response.
 */
public class ClusterListPersistedScriptActionsResult {
    /**
     * The list of Persisted Script Actions.
     */
    @JsonProperty(value = "value")
    private List<RuntimeScriptAction> value;

    /**
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the list of Persisted Script Actions.
     *
     * @return the value value
     */
    public List<RuntimeScriptAction> value() {
        return this.value;
    }

    /**
     * Set the list of Persisted Script Actions.
     *
     * @param value the value value to set
     * @return the ClusterListPersistedScriptActionsResult object itself.
     */
    public ClusterListPersistedScriptActionsResult withValue(List<RuntimeScriptAction> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the link (url) to the next page of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
