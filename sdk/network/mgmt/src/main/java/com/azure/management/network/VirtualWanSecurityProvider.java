// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualWanSecurityProvider model. */
@Fluent
public final class VirtualWanSecurityProvider {
    /*
     * Name of the security provider.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Url of the security provider.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Name of the security provider.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualWanSecurityProviderType type;

    /**
     * Get the name property: Name of the security provider.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the security provider.
     *
     * @param name the name value to set.
     * @return the VirtualWanSecurityProvider object itself.
     */
    public VirtualWanSecurityProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the url property: Url of the security provider.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Url of the security provider.
     *
     * @param url the url value to set.
     * @return the VirtualWanSecurityProvider object itself.
     */
    public VirtualWanSecurityProvider withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the type property: Name of the security provider.
     *
     * @return the type value.
     */
    public VirtualWanSecurityProviderType type() {
        return this.type;
    }
}
