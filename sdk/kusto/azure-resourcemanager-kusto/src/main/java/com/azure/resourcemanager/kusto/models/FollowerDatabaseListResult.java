// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.fluent.models.FollowerDatabaseDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto database principals operation response. */
@Fluent
public final class FollowerDatabaseListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FollowerDatabaseListResult.class);

    /*
     * The list of follower database result.
     */
    @JsonProperty(value = "value")
    private List<FollowerDatabaseDefinitionInner> value;

    /**
     * Get the value property: The list of follower database result.
     *
     * @return the value value.
     */
    public List<FollowerDatabaseDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of follower database result.
     *
     * @param value the value value to set.
     * @return the FollowerDatabaseListResult object itself.
     */
    public FollowerDatabaseListResult withValue(List<FollowerDatabaseDefinitionInner> value) {
        this.value = value;
        return this;
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
