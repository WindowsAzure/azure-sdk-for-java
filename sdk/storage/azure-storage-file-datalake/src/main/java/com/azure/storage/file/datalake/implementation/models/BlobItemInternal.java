// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** An Azure Storage blob. */
@JacksonXmlRootElement(localName = "Blob")
@Fluent
public final class BlobItemInternal {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The Deleted property.
     */
    @JsonProperty(value = "Deleted", required = true)
    private boolean deleted;

    /*
     * The Snapshot property.
     */
    @JsonProperty(value = "Snapshot", required = true)
    private String snapshot;

    /*
     * The VersionId property.
     */
    @JsonProperty(value = "VersionId")
    private String versionId;

    /*
     * The IsCurrentVersion property.
     */
    @JsonProperty(value = "IsCurrentVersion")
    private Boolean isCurrentVersion;

    /*
     * Properties of a blob
     */
    @JsonProperty(value = "Properties", required = true)
    private BlobPropertiesInternal properties;

    /*
     * The DeletionId property.
     */
    @JsonProperty(value = "DeletionId")
    private String deletionId;

    /**
     * Get the name property: The Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     *
     * @param name the name value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the deleted property: The Deleted property.
     *
     * @return the deleted value.
     */
    public boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The Deleted property.
     *
     * @param deleted the deleted value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the snapshot property: The Snapshot property.
     *
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The Snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the versionId property: The VersionId property.
     *
     * @return the versionId value.
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * Set the versionId property: The VersionId property.
     *
     * @param versionId the versionId value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Get the isCurrentVersion property: The IsCurrentVersion property.
     *
     * @return the isCurrentVersion value.
     */
    public Boolean isCurrentVersion() {
        return this.isCurrentVersion;
    }

    /**
     * Set the isCurrentVersion property: The IsCurrentVersion property.
     *
     * @param isCurrentVersion the isCurrentVersion value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setIsCurrentVersion(Boolean isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
        return this;
    }

    /**
     * Get the properties property: Properties of a blob.
     *
     * @return the properties value.
     */
    public BlobPropertiesInternal getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a blob.
     *
     * @param properties the properties value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setProperties(BlobPropertiesInternal properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the deletionId property: The DeletionId property.
     *
     * @return the deletionId value.
     */
    public String getDeletionId() {
        return this.deletionId;
    }

    /**
     * Set the deletionId property: The DeletionId property.
     *
     * @param deletionId the deletionId value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItemInternal setDeletionId(String deletionId) {
        this.deletionId = deletionId;
        return this;
    }
}
