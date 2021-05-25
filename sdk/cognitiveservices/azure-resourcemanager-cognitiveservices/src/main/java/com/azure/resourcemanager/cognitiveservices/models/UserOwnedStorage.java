// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The user owned storage for Cognitive Services account. */
@Fluent
public final class UserOwnedStorage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserOwnedStorage.class);

    /*
     * Full resource id of a Microsoft.Storage resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The identityClientId property.
     */
    @JsonProperty(value = "identityClientId")
    private String identityClientId;

    /**
     * Get the resourceId property: Full resource id of a Microsoft.Storage resource.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Full resource id of a Microsoft.Storage resource.
     *
     * @param resourceId the resourceId value to set.
     * @return the UserOwnedStorage object itself.
     */
    public UserOwnedStorage withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the identityClientId property: The identityClientId property.
     *
     * @return the identityClientId value.
     */
    public String identityClientId() {
        return this.identityClientId;
    }

    /**
     * Set the identityClientId property: The identityClientId property.
     *
     * @param identityClientId the identityClientId value to set.
     * @return the UserOwnedStorage object itself.
     */
    public UserOwnedStorage withIdentityClientId(String identityClientId) {
        this.identityClientId = identityClientId;
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
