// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.fluent.models.RuntimeScriptActionDetailInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The persisted script action for the cluster. */
@Fluent
public final class ScriptActionsList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptActionsList.class);

    /*
     * The list of persisted script action details for the cluster.
     */
    @JsonProperty(value = "value")
    private List<RuntimeScriptActionDetailInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of persisted script action details for the cluster.
     *
     * @return the value value.
     */
    public List<RuntimeScriptActionDetailInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of persisted script action details for the cluster.
     *
     * @param value the value value to set.
     * @return the ScriptActionsList object itself.
     */
    public ScriptActionsList withValue(List<RuntimeScriptActionDetailInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
