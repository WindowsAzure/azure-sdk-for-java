// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The deployment export result. */
@Fluent
public final class DeploymentExportResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentExportResultInner.class);

    /*
     * The template content.
     */
    @JsonProperty(value = "template")
    private Object template;

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
     * @return the DeploymentExportResultInner object itself.
     */
    public DeploymentExportResultInner withTemplate(Object template) {
        this.template = template;
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
