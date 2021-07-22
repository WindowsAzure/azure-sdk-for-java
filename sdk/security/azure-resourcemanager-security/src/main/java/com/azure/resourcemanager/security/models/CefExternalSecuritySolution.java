// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents a security solution which sends CEF logs to an OMS workspace. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("CEF")
@Fluent
public final class CefExternalSecuritySolution extends ExternalSecuritySolutionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CefExternalSecuritySolution.class);

    /*
     * The external security solution properties for CEF solutions
     */
    @JsonProperty(value = "properties")
    private CefSolutionProperties properties;

    /**
     * Get the properties property: The external security solution properties for CEF solutions.
     *
     * @return the properties value.
     */
    public CefSolutionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The external security solution properties for CEF solutions.
     *
     * @param properties the properties value to set.
     * @return the CefExternalSecuritySolution object itself.
     */
    public CefExternalSecuritySolution withProperties(CefSolutionProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
