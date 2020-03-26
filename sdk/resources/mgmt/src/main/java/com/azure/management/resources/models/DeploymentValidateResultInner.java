// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.DeploymentPropertiesExtended;
import com.azure.management.resources.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DeploymentValidateResult model.
 */
@Fluent
public final class DeploymentValidateResultInner {
    /*
     * The deployment validation error.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /*
     * The template deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get the error property: The deployment validation error.
     * 
     * @return the error value.
     */
    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * Set the error property: The deployment validation error.
     * 
     * @param error the error value to set.
     * @return the DeploymentValidateResultInner object itself.
     */
    public DeploymentValidateResultInner setError(ErrorResponse error) {
        this.error = error;
        return this;
    }

    /**
     * Get the properties property: The template deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentPropertiesExtended getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The template deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentValidateResultInner object itself.
     */
    public DeploymentValidateResultInner setProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }
}
