// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Instance of an app. */
@JsonFlatten
@Immutable
public class SiteInstanceInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SiteInstanceInner.class);

    /*
     * Name of instance.
     */
    @JsonProperty(value = "properties.siteInstanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String siteInstanceName;

    /**
     * Get the siteInstanceName property: Name of instance.
     *
     * @return the siteInstanceName value.
     */
    public String siteInstanceName() {
        return this.siteInstanceName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
