// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RestorableDroppedDatabaseListResult model. */
@Fluent
public final class RestorableDroppedDatabaseListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableDroppedDatabaseListResultInner.class);

    /*
     * A list of restorable dropped databases
     */
    @JsonProperty(value = "value", required = true)
    private List<RestorableDroppedDatabaseInner> value;

    /**
     * Get the value property: A list of restorable dropped databases.
     *
     * @return the value value.
     */
    public List<RestorableDroppedDatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of restorable dropped databases.
     *
     * @param value the value value to set.
     * @return the RestorableDroppedDatabaseListResultInner object itself.
     */
    public RestorableDroppedDatabaseListResultInner withValue(List<RestorableDroppedDatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model RestorableDroppedDatabaseListResultInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
