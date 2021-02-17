// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceTypeExtensionOptions model. */
@Fluent
public class ResourceTypeExtensionOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceTypeExtensionOptions.class);

    /*
     * The resourceCreationBegin property.
     */
    @JsonProperty(value = "resourceCreationBegin")
    private ExtensionOptions resourceCreationBegin;

    /**
     * Get the resourceCreationBegin property: The resourceCreationBegin property.
     *
     * @return the resourceCreationBegin value.
     */
    public ExtensionOptions resourceCreationBegin() {
        return this.resourceCreationBegin;
    }

    /**
     * Set the resourceCreationBegin property: The resourceCreationBegin property.
     *
     * @param resourceCreationBegin the resourceCreationBegin value to set.
     * @return the ResourceTypeExtensionOptions object itself.
     */
    public ResourceTypeExtensionOptions withResourceCreationBegin(ExtensionOptions resourceCreationBegin) {
        this.resourceCreationBegin = resourceCreationBegin;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceCreationBegin() != null) {
            resourceCreationBegin().validate();
        }
    }
}
