// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The parameters to the list SAS request. */
@Fluent
public final class ListContainerSasInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListContainerSasInput.class);

    /*
     * The permissions to set on the SAS URL.
     */
    @JsonProperty(value = "permissions")
    private AssetContainerPermission permissions;

    /*
     * The SAS URL expiration time.  This must be less than 24 hours from the
     * current time.
     */
    @JsonProperty(value = "expiryTime")
    private OffsetDateTime expiryTime;

    /**
     * Get the permissions property: The permissions to set on the SAS URL.
     *
     * @return the permissions value.
     */
    public AssetContainerPermission permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permissions to set on the SAS URL.
     *
     * @param permissions the permissions value to set.
     * @return the ListContainerSasInput object itself.
     */
    public ListContainerSasInput withPermissions(AssetContainerPermission permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the expiryTime property: The SAS URL expiration time. This must be less than 24 hours from the current time.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: The SAS URL expiration time. This must be less than 24 hours from the current time.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the ListContainerSasInput object itself.
     */
    public ListContainerSasInput withExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
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
