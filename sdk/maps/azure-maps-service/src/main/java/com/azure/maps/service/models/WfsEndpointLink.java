// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Links to other WFS endpoints. */
@Fluent
public final class WfsEndpointLink {
    /*
     * The link target.
     */
    @JsonProperty(value = "href", required = true)
    private String href;

    /*
     * The relation type.
     */
    @JsonProperty(value = "rel")
    private String rel;

    /*
     * A hint indicating what the media type of the result of dereferencing the
     * link should be.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * A hint indicating what the language of the result of dereferencing the
     * link should be.
     */
    @JsonProperty(value = "hreflang")
    private String hreflang;

    /*
     * Used to label the destination of a link such that it can be used as a
     * human-readable identifier (e.g., a menu entry) in the language indicated
     * by the Content-Language header field (if present).
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Get the href property: The link target.
     *
     * @return the href value.
     */
    public String getHref() {
        return this.href;
    }

    /**
     * Set the href property: The link target.
     *
     * @param href the href value to set.
     * @return the WfsEndpointLink object itself.
     */
    public WfsEndpointLink setHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the rel property: The relation type.
     *
     * @return the rel value.
     */
    public String getRel() {
        return this.rel;
    }

    /**
     * Set the rel property: The relation type.
     *
     * @param rel the rel value to set.
     * @return the WfsEndpointLink object itself.
     */
    public WfsEndpointLink setRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * Get the type property: A hint indicating what the media type of the result of dereferencing the link should be.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: A hint indicating what the media type of the result of dereferencing the link should be.
     *
     * @param type the type value to set.
     * @return the WfsEndpointLink object itself.
     */
    public WfsEndpointLink setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the hreflang property: A hint indicating what the language of the result of dereferencing the link should be.
     *
     * @return the hreflang value.
     */
    public String getHreflang() {
        return this.hreflang;
    }

    /**
     * Set the hreflang property: A hint indicating what the language of the result of dereferencing the link should be.
     *
     * @param hreflang the hreflang value to set.
     * @return the WfsEndpointLink object itself.
     */
    public WfsEndpointLink setHreflang(String hreflang) {
        this.hreflang = hreflang;
        return this;
    }

    /**
     * Get the title property: Used to label the destination of a link such that it can be used as a human-readable
     * identifier (e.g., a menu entry) in the language indicated by the Content-Language header field (if present).
     *
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: Used to label the destination of a link such that it can be used as a human-readable
     * identifier (e.g., a menu entry) in the language indicated by the Content-Language header field (if present).
     *
     * @param title the title value to set.
     * @return the WfsEndpointLink object itself.
     */
    public WfsEndpointLink setTitle(String title) {
        this.title = title;
        return this;
    }
}
