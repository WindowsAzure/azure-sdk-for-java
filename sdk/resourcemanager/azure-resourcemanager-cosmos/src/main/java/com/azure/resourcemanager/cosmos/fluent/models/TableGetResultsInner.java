// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.TableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.models.TableGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB Table. */
@JsonFlatten
@Fluent
public class TableGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TableGetResultsInner.class);

    /*
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private TableGetPropertiesResource resource;

    /*
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private TableGetPropertiesOptions options;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public TableGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the TableGetResultsInner object itself.
     */
    public TableGetResultsInner withResource(TableGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public TableGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the TableGetResultsInner object itself.
     */
    public TableGetResultsInner withOptions(TableGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TableGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TableGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (resource() != null) {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
