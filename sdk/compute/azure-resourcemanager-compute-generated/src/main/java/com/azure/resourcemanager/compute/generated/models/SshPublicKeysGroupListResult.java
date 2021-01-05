// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.SshPublicKeyResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list SSH public keys operation response. */
@Fluent
public final class SshPublicKeysGroupListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SshPublicKeysGroupListResult.class);

    /*
     * The list of SSH public keys
     */
    @JsonProperty(value = "value", required = true)
    private List<SshPublicKeyResourceInner> value;

    /*
     * The URI to fetch the next page of SSH public keys. Call ListNext() with
     * this URI to fetch the next page of SSH public keys.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of SSH public keys.
     *
     * @return the value value.
     */
    public List<SshPublicKeyResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of SSH public keys.
     *
     * @param value the value value to set.
     * @return the SshPublicKeysGroupListResult object itself.
     */
    public SshPublicKeysGroupListResult withValue(List<SshPublicKeyResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of SSH public keys. Call ListNext() with this URI to
     * fetch the next page of SSH public keys.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of SSH public keys. Call ListNext() with this URI to
     * fetch the next page of SSH public keys.
     *
     * @param nextLink the nextLink value to set.
     * @return the SshPublicKeysGroupListResult object itself.
     */
    public SshPublicKeysGroupListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model SshPublicKeysGroupListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
