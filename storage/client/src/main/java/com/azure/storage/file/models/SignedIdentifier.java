// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Signed identifier.
 */
@JacksonXmlRootElement(localName = "SignedIdentifier")
public final class SignedIdentifier {
    /*
     * A unique id.
     */
    @JsonProperty(value = "Id", required = true)
    private String id;

    /*
     * The access policy.
     */
    @JsonProperty(value = "AccessPolicy")
    private AccessPolicy accessPolicy;

    /**
     * Get the id property: A unique id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: A unique id.
     *
     * @param id the id value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the accessPolicy property: The access policy.
     *
     * @return the accessPolicy value.
     */
    public AccessPolicy accessPolicy() {
        return this.accessPolicy;
    }

    /**
     * Set the accessPolicy property: The access policy.
     *
     * @param accessPolicy the accessPolicy value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier accessPolicy(AccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
}
