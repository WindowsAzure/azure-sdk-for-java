// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableMongodbCollectionGetResultInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List operation response, that contains the MongoDB collection events and their properties. */
@Immutable
public final class RestorableMongodbCollectionsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableMongodbCollectionsListResult.class);

    /*
     * List of MongoDB collection events and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RestorableMongodbCollectionGetResultInner> value;

    /**
     * Get the value property: List of MongoDB collection events and their properties.
     *
     * @return the value value.
     */
    public List<RestorableMongodbCollectionGetResultInner> value() {
        return this.value;
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
