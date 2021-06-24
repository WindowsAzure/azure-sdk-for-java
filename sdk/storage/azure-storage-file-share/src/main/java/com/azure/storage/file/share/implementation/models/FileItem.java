// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** A listed file item. */
@JacksonXmlRootElement(localName = "File")
@Fluent
public final class FileItem {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The FileId property.
     */
    @JsonProperty(value = "FileId")
    private String fileId;

    /*
     * File properties.
     */
    @JsonProperty(value = "Properties", required = true)
    private FileProperty properties;

    /*
     * The Attributes property.
     */
    @JsonProperty(value = "Attributes")
    private String attributes;

    /*
     * The PermissionKey property.
     */
    @JsonProperty(value = "PermissionKey")
    private String permissionKey;

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
     * @return the FileItem object itself.
     */
    public FileItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the fileId property: The FileId property.
     *
     * @return the fileId value.
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: The FileId property.
     *
     * @param fileId the fileId value to set.
     * @return the FileItem object itself.
     */
    public FileItem setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the properties property: File properties.
     *
     * @return the properties value.
     */
    public FileProperty getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: File properties.
     *
     * @param properties the properties value to set.
     * @return the FileItem object itself.
     */
    public FileItem setProperties(FileProperty properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the attributes property: The Attributes property.
     *
     * @return the attributes value.
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The Attributes property.
     *
     * @param attributes the attributes value to set.
     * @return the FileItem object itself.
     */
    public FileItem setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the permissionKey property: The PermissionKey property.
     *
     * @return the permissionKey value.
     */
    public String getPermissionKey() {
        return this.permissionKey;
    }

    /**
     * Set the permissionKey property: The PermissionKey property.
     *
     * @param permissionKey the permissionKey value to set.
     * @return the FileItem object itself.
     */
    public FileItem setPermissionKey(String permissionKey) {
        this.permissionKey = permissionKey;
        return this;
    }
}
