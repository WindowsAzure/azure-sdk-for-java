// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Upstream auth settings. */
@Fluent
public final class UpstreamAuthSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpstreamAuthSettings.class);

    /*
     * Gets or sets the type of auth. None or ManagedIdentity is supported now.
     */
    @JsonProperty(value = "type")
    private UpstreamAuthType type;

    /*
     * Gets or sets the managed identity settings. It's required if the auth
     * type is set to ManagedIdentity.
     */
    @JsonProperty(value = "managedIdentity")
    private ManagedIdentitySettings managedIdentity;

    /**
     * Get the type property: Gets or sets the type of auth. None or ManagedIdentity is supported now.
     *
     * @return the type value.
     */
    public UpstreamAuthType type() {
        return this.type;
    }

    /**
     * Set the type property: Gets or sets the type of auth. None or ManagedIdentity is supported now.
     *
     * @param type the type value to set.
     * @return the UpstreamAuthSettings object itself.
     */
    public UpstreamAuthSettings withType(UpstreamAuthType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the managedIdentity property: Gets or sets the managed identity settings. It's required if the auth type is
     * set to ManagedIdentity.
     *
     * @return the managedIdentity value.
     */
    public ManagedIdentitySettings managedIdentity() {
        return this.managedIdentity;
    }

    /**
     * Set the managedIdentity property: Gets or sets the managed identity settings. It's required if the auth type is
     * set to ManagedIdentity.
     *
     * @param managedIdentity the managedIdentity value to set.
     * @return the UpstreamAuthSettings object itself.
     */
    public UpstreamAuthSettings withManagedIdentity(ManagedIdentitySettings managedIdentity) {
        this.managedIdentity = managedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedIdentity() != null) {
            managedIdentity().validate();
        }
    }
}
