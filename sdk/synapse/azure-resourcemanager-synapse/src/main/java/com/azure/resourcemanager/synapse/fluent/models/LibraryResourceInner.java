// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.EntityResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Library response details. */
@JsonFlatten
@Fluent
public class LibraryResourceInner extends EntityResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LibraryResourceInner.class);

    /*
     * Name of the library.
     */
    @JsonProperty(value = "properties.name")
    private String namePropertiesName;

    /*
     * Storage blob path of library.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /*
     * Storage blob container name.
     */
    @JsonProperty(value = "properties.containerName")
    private String containerName;

    /*
     * The last update time of the library.
     */
    @JsonProperty(value = "properties.uploadedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime uploadedTimestamp;

    /*
     * Type of the library.
     */
    @JsonProperty(value = "properties.type")
    private String typePropertiesType;

    /*
     * Provisioning status of the library/package.
     */
    @JsonProperty(value = "properties.provisioningStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningStatus;

    /*
     * Creator Id of the library/package.
     */
    @JsonProperty(value = "properties.creatorId", access = JsonProperty.Access.WRITE_ONLY)
    private String creatorId;

    /**
     * Get the namePropertiesName property: Name of the library.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Set the namePropertiesName property: Name of the library.
     *
     * @param namePropertiesName the namePropertiesName value to set.
     * @return the LibraryResourceInner object itself.
     */
    public LibraryResourceInner withNamePropertiesName(String namePropertiesName) {
        this.namePropertiesName = namePropertiesName;
        return this;
    }

    /**
     * Get the path property: Storage blob path of library.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Storage blob path of library.
     *
     * @param path the path value to set.
     * @return the LibraryResourceInner object itself.
     */
    public LibraryResourceInner withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the containerName property: Storage blob container name.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Storage blob container name.
     *
     * @param containerName the containerName value to set.
     * @return the LibraryResourceInner object itself.
     */
    public LibraryResourceInner withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the uploadedTimestamp property: The last update time of the library.
     *
     * @return the uploadedTimestamp value.
     */
    public OffsetDateTime uploadedTimestamp() {
        return this.uploadedTimestamp;
    }

    /**
     * Get the typePropertiesType property: Type of the library.
     *
     * @return the typePropertiesType value.
     */
    public String typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: Type of the library.
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the LibraryResourceInner object itself.
     */
    public LibraryResourceInner withTypePropertiesType(String typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the provisioningStatus property: Provisioning status of the library/package.
     *
     * @return the provisioningStatus value.
     */
    public String provisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Get the creatorId property: Creator Id of the library/package.
     *
     * @return the creatorId value.
     */
    public String creatorId() {
        return this.creatorId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
