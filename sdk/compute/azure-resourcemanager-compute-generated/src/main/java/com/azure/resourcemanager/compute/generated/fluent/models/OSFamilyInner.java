// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.OSFamilyProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a cloud service OS family. */
@Fluent
public final class OSFamilyInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSFamilyInner.class);

    /*
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * OS family properties.
     */
    @JsonProperty(value = "properties")
    private OSFamilyProperties properties;

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the properties property: OS family properties.
     *
     * @return the properties value.
     */
    public OSFamilyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: OS family properties.
     *
     * @param properties the properties value to set.
     * @return the OSFamilyInner object itself.
     */
    public OSFamilyInner withProperties(OSFamilyProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
