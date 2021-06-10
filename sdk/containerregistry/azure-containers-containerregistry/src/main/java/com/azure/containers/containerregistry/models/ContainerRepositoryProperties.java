// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Repository attributes. */
@JsonFlatten
@Fluent
public final class ContainerRepositoryProperties {
    /*
     * Registry login server name.  This is likely to be similar to
     * {registry-name}.azurecr.io
     */
    @JsonProperty(value = "registry", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String registryLoginServer;

    /*
     * Image name
     */
    @JsonProperty(value = "imageName", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Image created time
     */
    @JsonProperty(value = "createdTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Image last update time
     */
    @JsonProperty(value = "lastUpdateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * Number of the manifests
     */
    @JsonProperty(value = "manifestCount", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int manifestCount;

    /*
     * Number of the tags
     */
    @JsonProperty(value = "tagCount", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int tagCount;

    /*
     * Delete enabled
     */
    @JsonProperty(value = "changeableAttributes.deleteEnabled")
    private Boolean deleteEnabled;

    /*
     * Write enabled
     */
    @JsonProperty(value = "changeableAttributes.writeEnabled")
    private Boolean writeEnabled;

    /*
     * List enabled
     */
    @JsonProperty(value = "changeableAttributes.listEnabled")
    private Boolean listEnabled;

    /*
     * Read enabled
     */
    @JsonProperty(value = "changeableAttributes.readEnabled")
    private Boolean readEnabled;

    /*
     * Enables Teleport functionality on new images in the repository improving
     * Container startup performance
     */
    @JsonProperty(value = "changeableAttributes.teleportEnabled")
    private Boolean teleportEnabled;

    /**
     * Get the registryLoginServer property: Registry login server name. This is likely to be similar to
     * {registry-name}.azurecr.io.
     *
     * @return the registryLoginServer value.
     */
    public String getRegistryLoginServer() {
        return this.registryLoginServer;
    }

    /**
     * Get the name property: Image name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the createdOn property: Image created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Image last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the manifestCount property: Number of the manifests.
     *
     * @return the manifestCount value.
     */
    public int getManifestCount() {
        return this.manifestCount;
    }

    /**
     * Get the tagCount property: Number of the tags.
     *
     * @return the tagCount value.
     */
    public int getTagCount() {
        return this.tagCount;
    }

    /**
     * Get the deleteEnabled property: Delete enabled.
     *
     * @return the deleteEnabled value.
     */
    public Boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    /**
     * Set the deleteEnabled property: Delete enabled.
     *
     * @param deleteEnabled the deleteEnabled value to set.
     * @return the RepositoryProperties object itself.
     */
    public ContainerRepositoryProperties setDeleteEnabled(Boolean deleteEnabled) {
        this.deleteEnabled = deleteEnabled;
        return this;
    }

    /**
     * Get the writeEnabled property: Write enabled.
     *
     * @return the writeEnabled value.
     */
    public Boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    /**
     * Set the writeEnabled property: Write enabled.
     *
     * @param writeEnabled the writeEnabled value to set.
     * @return the RepositoryProperties object itself.
     */
    public ContainerRepositoryProperties setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
        return this;
    }

    /**
     * Get the listEnabled property: List enabled.
     *
     * @return the listEnabled value.
     */
    public Boolean isListEnabled() {
        return this.listEnabled;
    }

    /**
     * Set the listEnabled property: List enabled.
     *
     * @param listEnabled the listEnabled value to set.
     * @return the RepositoryProperties object itself.
     */
    public ContainerRepositoryProperties setListEnabled(Boolean listEnabled) {
        this.listEnabled = listEnabled;
        return this;
    }

    /**
     * Get the readEnabled property: Read enabled.
     *
     * @return the readEnabled value.
     */
    public Boolean isReadEnabled() {
        return this.readEnabled;
    }

    /**
     * Set the readEnabled property: Read enabled.
     *
     * @param readEnabled the readEnabled value to set.
     * @return the RepositoryProperties object itself.
     */
    public ContainerRepositoryProperties setReadEnabled(Boolean readEnabled) {
        this.readEnabled = readEnabled;
        return this;
    }

    /**
     * Get the teleportEnabled property: Enables Teleport functionality on new images in the repository improving
     * Container startup performance.
     *
     * @return the teleportEnabled value.
     */
    public Boolean isTeleportEnabled() {
        return this.teleportEnabled;
    }

    /**
     * Set the teleportEnabled property: Enables Teleport functionality on new images in the repository improving
     * Container startup performance.
     *
     * @param teleportEnabled the teleportEnabled value to set.
     * @return the RepositoryProperties object itself.
     */
    public ContainerRepositoryProperties setTeleportEnabled(Boolean teleportEnabled) {
        this.teleportEnabled = teleportEnabled;
        return this;
    }
}
