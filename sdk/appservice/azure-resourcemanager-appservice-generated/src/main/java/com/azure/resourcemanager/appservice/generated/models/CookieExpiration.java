// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CookieExpiration model. */
@JsonFlatten
@Fluent
public class CookieExpiration extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CookieExpiration.class);

    /*
     * The convention property.
     */
    @JsonProperty(value = "properties.convention")
    private CookieExpirationConvention convention;

    /*
     * The timeToExpiration property.
     */
    @JsonProperty(value = "properties.timeToExpiration")
    private String timeToExpiration;

    /**
     * Get the convention property: The convention property.
     *
     * @return the convention value.
     */
    public CookieExpirationConvention convention() {
        return this.convention;
    }

    /**
     * Set the convention property: The convention property.
     *
     * @param convention the convention value to set.
     * @return the CookieExpiration object itself.
     */
    public CookieExpiration withConvention(CookieExpirationConvention convention) {
        this.convention = convention;
        return this;
    }

    /**
     * Get the timeToExpiration property: The timeToExpiration property.
     *
     * @return the timeToExpiration value.
     */
    public String timeToExpiration() {
        return this.timeToExpiration;
    }

    /**
     * Set the timeToExpiration property: The timeToExpiration property.
     *
     * @param timeToExpiration the timeToExpiration value to set.
     * @return the CookieExpiration object itself.
     */
    public CookieExpiration withTimeToExpiration(String timeToExpiration) {
        this.timeToExpiration = timeToExpiration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CookieExpiration withKind(String kind) {
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
