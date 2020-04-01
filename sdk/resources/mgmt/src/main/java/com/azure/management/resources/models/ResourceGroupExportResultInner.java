// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceGroupExportResult model.
 */
@Fluent
public final class ResourceGroupExportResultInner {
    /*
     * The template content.
     */
    @JsonProperty(value = "template")
    private Object template;

    /*
     * The template export error.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the template property: The template content.
     * 
     * @return the template value.
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template property: The template content.
     * 
     * @param template the template value to set.
     * @return the ResourceGroupExportResultInner object itself.
     */
    public ResourceGroupExportResultInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the error property: The template export error.
     * 
     * @return the error value.
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error property: The template export error.
     * 
     * @param error the error value to set.
     * @return the ResourceGroupExportResultInner object itself.
     */
    public ResourceGroupExportResultInner withError(ErrorResponse error) {
        this.error = error;
        return this;
    }
}
