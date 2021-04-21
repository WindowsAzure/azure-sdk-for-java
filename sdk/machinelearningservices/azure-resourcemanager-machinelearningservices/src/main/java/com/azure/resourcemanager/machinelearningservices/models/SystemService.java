// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A system service running on a compute. */
@Immutable
public final class SystemService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SystemService.class);

    /*
     * The type of this system service.
     */
    @JsonProperty(value = "systemServiceType", access = JsonProperty.Access.WRITE_ONLY)
    private String systemServiceType;

    /*
     * Public IP address
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /*
     * The version for this type.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Get the systemServiceType property: The type of this system service.
     *
     * @return the systemServiceType value.
     */
    public String systemServiceType() {
        return this.systemServiceType;
    }

    /**
     * Get the publicIpAddress property: Public IP address.
     *
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get the version property: The version for this type.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
