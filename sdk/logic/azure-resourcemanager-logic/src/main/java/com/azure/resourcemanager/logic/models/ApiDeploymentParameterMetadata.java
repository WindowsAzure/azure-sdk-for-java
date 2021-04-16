// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The API deployment parameter metadata. */
@Fluent
public final class ApiDeploymentParameterMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiDeploymentParameterMetadata.class);

    /*
     * The type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Indicates whether its required.
     */
    @JsonProperty(value = "isRequired")
    private Boolean isRequired;

    /*
     * The display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The visibility.
     */
    @JsonProperty(value = "visibility")
    private ApiDeploymentParameterVisibility visibility;

    /**
     * Get the type property: The type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type.
     *
     * @param type the type value to set.
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the isRequired property: Indicates whether its required.
     *
     * @return the isRequired value.
     */
    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * Set the isRequired property: Indicates whether its required.
     *
     * @param isRequired the isRequired value to set.
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * Get the displayName property: The display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name.
     *
     * @param displayName the displayName value to set.
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description.
     *
     * @param description the description value to set.
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the visibility property: The visibility.
     *
     * @return the visibility value.
     */
    public ApiDeploymentParameterVisibility visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: The visibility.
     *
     * @param visibility the visibility value to set.
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withVisibility(ApiDeploymentParameterVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
