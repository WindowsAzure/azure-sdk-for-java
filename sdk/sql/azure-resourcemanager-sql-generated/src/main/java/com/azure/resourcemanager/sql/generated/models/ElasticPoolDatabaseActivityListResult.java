// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolDatabaseActivityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a list elastic pool database activity request. */
@Fluent
public final class ElasticPoolDatabaseActivityListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolDatabaseActivityListResult.class);

    /*
     * The list of elastic pool database activities.
     */
    @JsonProperty(value = "value", required = true)
    private List<ElasticPoolDatabaseActivityInner> value;

    /**
     * Get the value property: The list of elastic pool database activities.
     *
     * @return the value value.
     */
    public List<ElasticPoolDatabaseActivityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of elastic pool database activities.
     *
     * @param value the value value to set.
     * @return the ElasticPoolDatabaseActivityListResult object itself.
     */
    public ElasticPoolDatabaseActivityListResult withValue(List<ElasticPoolDatabaseActivityInner> value) {
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
                        "Missing required property value in model ElasticPoolDatabaseActivityListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
