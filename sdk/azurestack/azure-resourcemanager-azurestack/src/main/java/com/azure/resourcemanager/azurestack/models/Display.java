// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the localized display information for this particular operation or action. */
@Fluent
public final class Display {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Display.class);

    /*
     * The localized, friendly version of the resource provider name.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The localized, friendly version of the resource type related to this
     * action or operation; the resource type should match the public
     * documentation for the resource provider.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The localized, friendly name for the operation. Use the name as it will
     * displayed to the user.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * The localized, friendly description for the operation. The description
     * will be displayed to the user. It should be thorough and concise for
     * used in both tooltips and detailed views.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: The localized, friendly version of the resource provider name.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The localized, friendly version of the resource provider name.
     *
     * @param provider the provider value to set.
     * @return the Display object itself.
     */
    public Display withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: The localized, friendly version of the resource type related to this action or
     * operation; the resource type should match the public documentation for the resource provider.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The localized, friendly version of the resource type related to this action or
     * operation; the resource type should match the public documentation for the resource provider.
     *
     * @param resource the resource value to set.
     * @return the Display object itself.
     */
    public Display withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The localized, friendly name for the operation. Use the name as it will displayed to
     * the user.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The localized, friendly name for the operation. Use the name as it will displayed to
     * the user.
     *
     * @param operation the operation value to set.
     * @return the Display object itself.
     */
    public Display withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: The localized, friendly description for the operation. The description will be
     * displayed to the user. It should be thorough and concise for used in both tooltips and detailed views.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The localized, friendly description for the operation. The description will be
     * displayed to the user. It should be thorough and concise for used in both tooltips and detailed views.
     *
     * @param description the description value to set.
     * @return the Display object itself.
     */
    public Display withDescription(String description) {
        this.description = description;
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
