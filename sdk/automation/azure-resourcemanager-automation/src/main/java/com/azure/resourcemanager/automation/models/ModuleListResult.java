// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.models.ModuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the list module operation. */
@Fluent
public final class ModuleListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModuleListResult.class);

    /*
     * Gets or sets a list of modules.
     */
    @JsonProperty(value = "value")
    private List<ModuleInner> value;

    /*
     * Gets or sets the next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets or sets a list of modules.
     *
     * @return the value value.
     */
    public List<ModuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of modules.
     *
     * @param value the value value to set.
     * @return the ModuleListResult object itself.
     */
    public ModuleListResult withValue(List<ModuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the ModuleListResult object itself.
     */
    public ModuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
