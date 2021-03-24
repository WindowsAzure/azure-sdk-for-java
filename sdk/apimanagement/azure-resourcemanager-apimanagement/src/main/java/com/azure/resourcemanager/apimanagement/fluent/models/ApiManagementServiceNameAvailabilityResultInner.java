// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.NameAvailabilityReason;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response of the CheckNameAvailability operation. */
@Fluent
public final class ApiManagementServiceNameAvailabilityResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApiManagementServiceNameAvailabilityResultInner.class);

    /*
     * True if the name is available and can be used to create a new API
     * Management service; otherwise false.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * If reason == invalid, provide the user with the reason why the given
     * name is invalid, and provide the resource naming requirements so that
     * the user can select a valid name. If reason == AlreadyExists, explain
     * that <resourceName> is already in use, and direct them to select a
     * different name.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Invalid indicates the name provided does not match the resource
     * provider’s naming requirements (incorrect length, unsupported
     * characters, etc.)  AlreadyExists indicates that the name is already in
     * use and is therefore unavailable.
     */
    @JsonProperty(value = "reason")
    private NameAvailabilityReason reason;

    /**
     * Get the nameAvailable property: True if the name is available and can be used to create a new API Management
     * service; otherwise false.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the message property: If reason == invalid, provide the user with the reason why the given name is invalid,
     * and provide the resource naming requirements so that the user can select a valid name. If reason ==
     * AlreadyExists, explain that &lt;resourceName&gt; is already in use, and direct them to select a different name.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the reason property: Invalid indicates the name provided does not match the resource provider’s naming
     * requirements (incorrect length, unsupported characters, etc.) AlreadyExists indicates that the name is already in
     * use and is therefore unavailable.
     *
     * @return the reason value.
     */
    public NameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Invalid indicates the name provided does not match the resource provider’s naming
     * requirements (incorrect length, unsupported characters, etc.) AlreadyExists indicates that the name is already in
     * use and is therefore unavailable.
     *
     * @param reason the reason value to set.
     * @return the ApiManagementServiceNameAvailabilityResultInner object itself.
     */
    public ApiManagementServiceNameAvailabilityResultInner withReason(NameAvailabilityReason reason) {
        this.reason = reason;
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
