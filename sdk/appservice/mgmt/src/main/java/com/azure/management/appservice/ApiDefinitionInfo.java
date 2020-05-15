// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApiDefinitionInfo model. */
@Fluent
public final class ApiDefinitionInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiDefinitionInfo.class);

    /*
     * The URL of the API definition.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the url property: The URL of the API definition.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the API definition.
     *
     * @param url the url value to set.
     * @return the ApiDefinitionInfo object itself.
     */
    public ApiDefinitionInfo withUrl(String url) {
        this.url = url;
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
