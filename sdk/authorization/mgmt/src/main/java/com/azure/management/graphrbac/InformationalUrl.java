// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InformationalUrl model. */
@Fluent
public final class InformationalUrl {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InformationalUrl.class);

    /*
     * The terms of service URI
     */
    @JsonProperty(value = "termsOfService")
    private String termsOfService;

    /*
     * The marketing URI
     */
    @JsonProperty(value = "marketing")
    private String marketing;

    /*
     * The privacy policy URI
     */
    @JsonProperty(value = "privacy")
    private String privacy;

    /*
     * The support URI
     */
    @JsonProperty(value = "support")
    private String support;

    /**
     * Get the termsOfService property: The terms of service URI.
     *
     * @return the termsOfService value.
     */
    public String termsOfService() {
        return this.termsOfService;
    }

    /**
     * Set the termsOfService property: The terms of service URI.
     *
     * @param termsOfService the termsOfService value to set.
     * @return the InformationalUrl object itself.
     */
    public InformationalUrl withTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

    /**
     * Get the marketing property: The marketing URI.
     *
     * @return the marketing value.
     */
    public String marketing() {
        return this.marketing;
    }

    /**
     * Set the marketing property: The marketing URI.
     *
     * @param marketing the marketing value to set.
     * @return the InformationalUrl object itself.
     */
    public InformationalUrl withMarketing(String marketing) {
        this.marketing = marketing;
        return this;
    }

    /**
     * Get the privacy property: The privacy policy URI.
     *
     * @return the privacy value.
     */
    public String privacy() {
        return this.privacy;
    }

    /**
     * Set the privacy property: The privacy policy URI.
     *
     * @param privacy the privacy value to set.
     * @return the InformationalUrl object itself.
     */
    public InformationalUrl withPrivacy(String privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get the support property: The support URI.
     *
     * @return the support value.
     */
    public String support() {
        return this.support;
    }

    /**
     * Set the support property: The support URI.
     *
     * @param support the support value to set.
     * @return the InformationalUrl object itself.
     */
    public InformationalUrl withSupport(String support) {
        this.support = support;
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
