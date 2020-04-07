// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RegistryNameCheckRequest model.
 */
@Fluent
public final class RegistryNameCheckRequest {
    /*
     * The name of the container registry.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The resource type of the container registry. This field must be set to
     * 'Microsoft.ContainerRegistry/registries'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of RegistryNameCheckRequest class.
     */
    public RegistryNameCheckRequest() {
        type = "Microsoft.ContainerRegistry/registries";
    }

    /**
     * Get the name property: The name of the container registry.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the container registry.
     * 
     * @param name the name value to set.
     * @return the RegistryNameCheckRequest object itself.
     */
    public RegistryNameCheckRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type of the container registry. This
     * field must be set to 'Microsoft.ContainerRegistry/registries'.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type of the container registry. This
     * field must be set to 'Microsoft.ContainerRegistry/registries'.
     * 
     * @param type the type value to set.
     * @return the RegistryNameCheckRequest object itself.
     */
    public RegistryNameCheckRequest withType(String type) {
        this.type = type;
        return this;
    }
}
