// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Static Site User Provided Function App ARM resource. */
@JsonFlatten
@Fluent
public class StaticSiteUserProvidedFunctionAppArmResourceInner extends ProxyOnlyResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(StaticSiteUserProvidedFunctionAppArmResourceInner.class);

    /*
     * The resource id of the function app registered with the static site
     */
    @JsonProperty(value = "properties.functionAppResourceId")
    private String functionAppResourceId;

    /*
     * The region of the function app registered with the static site
     */
    @JsonProperty(value = "properties.functionAppRegion")
    private String functionAppRegion;

    /*
     * The date and time on which the function app was registered with the
     * static site.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /**
     * Get the functionAppResourceId property: The resource id of the function app registered with the static site.
     *
     * @return the functionAppResourceId value.
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }

    /**
     * Set the functionAppResourceId property: The resource id of the function app registered with the static site.
     *
     * @param functionAppResourceId the functionAppResourceId value to set.
     * @return the StaticSiteUserProvidedFunctionAppArmResourceInner object itself.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceInner withFunctionAppResourceId(String functionAppResourceId) {
        this.functionAppResourceId = functionAppResourceId;
        return this;
    }

    /**
     * Get the functionAppRegion property: The region of the function app registered with the static site.
     *
     * @return the functionAppRegion value.
     */
    public String functionAppRegion() {
        return this.functionAppRegion;
    }

    /**
     * Set the functionAppRegion property: The region of the function app registered with the static site.
     *
     * @param functionAppRegion the functionAppRegion value to set.
     * @return the StaticSiteUserProvidedFunctionAppArmResourceInner object itself.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceInner withFunctionAppRegion(String functionAppRegion) {
        this.functionAppRegion = functionAppRegion;
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the function app was registered with the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteUserProvidedFunctionAppArmResourceInner withKind(String kind) {
        super.withKind(kind);
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
    }
}
