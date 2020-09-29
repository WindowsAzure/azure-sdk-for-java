// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters to create and update Cosmos DB Gremlin graph. */
@JsonFlatten
@Fluent
public class GremlinGraphCreateUpdateParameters extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GremlinGraphCreateUpdateParameters.class);

    /*
     * The standard JSON format of a Gremlin graph
     */
    @JsonProperty(value = "properties.resource", required = true)
    private GremlinGraphResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private Map<String, String> options;

    /**
     * Get the resource property: The standard JSON format of a Gremlin graph.
     *
     * @return the resource value.
     */
    public GremlinGraphResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a Gremlin graph.
     *
     * @param resource the resource value to set.
     * @return the GremlinGraphCreateUpdateParameters object itself.
     */
    public GremlinGraphCreateUpdateParameters withResource(GremlinGraphResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public Map<String, String> options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the GremlinGraphCreateUpdateParameters object itself.
     */
    public GremlinGraphCreateUpdateParameters withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (resource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model GremlinGraphCreateUpdateParameters"));
        } else {
            resource().validate();
        }
        if (options() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property options in model GremlinGraphCreateUpdateParameters"));
        }
    }
}
