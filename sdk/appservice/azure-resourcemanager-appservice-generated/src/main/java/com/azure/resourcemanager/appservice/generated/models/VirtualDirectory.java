// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Directory for virtual application. */
@Fluent
public final class VirtualDirectory {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualDirectory.class);

    /*
     * Path to virtual application.
     */
    @JsonProperty(value = "virtualPath")
    private String virtualPath;

    /*
     * Physical path.
     */
    @JsonProperty(value = "physicalPath")
    private String physicalPath;

    /**
     * Get the virtualPath property: Path to virtual application.
     *
     * @return the virtualPath value.
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    /**
     * Set the virtualPath property: Path to virtual application.
     *
     * @param virtualPath the virtualPath value to set.
     * @return the VirtualDirectory object itself.
     */
    public VirtualDirectory withVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
        return this;
    }

    /**
     * Get the physicalPath property: Physical path.
     *
     * @return the physicalPath value.
     */
    public String physicalPath() {
        return this.physicalPath;
    }

    /**
     * Set the physicalPath property: Physical path.
     *
     * @param physicalPath the physicalPath value to set.
     * @return the VirtualDirectory object itself.
     */
    public VirtualDirectory withPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
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
