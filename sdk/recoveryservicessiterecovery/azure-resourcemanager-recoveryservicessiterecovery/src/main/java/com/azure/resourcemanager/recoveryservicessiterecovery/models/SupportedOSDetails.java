// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Supported Operating system details. */
@Fluent
public final class SupportedOSDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SupportedOSDetails.class);

    /*
     * The name.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /*
     * The type.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /*
     * List of version for OS.
     */
    @JsonProperty(value = "osVersions")
    private List<OSVersionWrapper> osVersions;

    /**
     * Get the osName property: The name.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName property: The name.
     *
     * @param osName the osName value to set.
     * @return the SupportedOSDetails object itself.
     */
    public SupportedOSDetails withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the osType property: The type.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The type.
     *
     * @param osType the osType value to set.
     * @return the SupportedOSDetails object itself.
     */
    public SupportedOSDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osVersions property: List of version for OS.
     *
     * @return the osVersions value.
     */
    public List<OSVersionWrapper> osVersions() {
        return this.osVersions;
    }

    /**
     * Set the osVersions property: List of version for OS.
     *
     * @param osVersions the osVersions value to set.
     * @return the SupportedOSDetails object itself.
     */
    public SupportedOSDetails withOsVersions(List<OSVersionWrapper> osVersions) {
        this.osVersions = osVersions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osVersions() != null) {
            osVersions().forEach(e -> e.validate());
        }
    }
}
