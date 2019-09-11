// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for SetHTTPHeaders operation.
 */
@JacksonXmlRootElement(localName = "File-SetHTTPHeaders-Headers")
@Fluent
public final class FileSetHTTPHeadersHeaders {
    /*
     * The ETag contains a value which represents the version of the file, in
     * quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * Returns the date and time the directory was last modified. Any operation
     * that modifies the directory or its properties updates the last modified
     * time. Operations on files do not affect the last modified time of the
     * directory.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The value of this header is set to true if the contents of the request
     * are successfully encrypted using the specified algorithm, and false
     * otherwise.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean isServerEncrypted;

    /*
     * Key of the permission set for the file.
     */
    @JsonProperty(value = "x-ms-file-permission-key")
    private String filePermissionKey;

    /*
     * Attributes set for the file.
     */
    @JsonProperty(value = "x-ms-file-attributes")
    private String fileAttributes;

    /*
     * Creation time for the file.
     */
    @JsonProperty(value = "x-ms-file-creation-time")
    private OffsetDateTime fileCreationTime;

    /*
     * Last write time for the file.
     */
    @JsonProperty(value = "x-ms-file-last-write-time")
    private OffsetDateTime fileLastWriteTime;

    /*
     * Change time for the file.
     */
    @JsonProperty(value = "x-ms-file-change-time")
    private OffsetDateTime fileChangeTime;

    /*
     * The fileId of the directory.
     */
    @JsonProperty(value = "x-ms-file-id")
    private String fileId;

    /*
     * The parent fileId of the directory.
     */
    @JsonProperty(value = "x-ms-file-parent-id")
    private String fileParentId;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the eTag property: The ETag contains a value which represents the
     * version of the file, in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value which represents the
     * version of the file, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: Returns the date and time the directory
     * was last modified. Any operation that modifies the directory or its
     * properties updates the last modified time. Operations on files do not
     * affect the last modified time of the directory.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the directory
     * was last modified. Any operation that modifies the directory or its
     * properties updates the last modified time. Operations on files do not
     * affect the last modified time of the directory.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the contents of the request are successfully encrypted using the
     * specified algorithm, and false otherwise.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the contents of the request are successfully encrypted using the
     * specified algorithm, and false otherwise.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the filePermissionKey property: Key of the permission set for the
     * file.
     *
     * @return the filePermissionKey value.
     */
    public String getFilePermissionKey() {
        return this.filePermissionKey;
    }

    /**
     * Set the filePermissionKey property: Key of the permission set for the
     * file.
     *
     * @param filePermissionKey the filePermissionKey value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFilePermissionKey(String filePermissionKey) {
        this.filePermissionKey = filePermissionKey;
        return this;
    }

    /**
     * Get the fileAttributes property: Attributes set for the file.
     *
     * @return the fileAttributes value.
     */
    public String getFileAttributes() {
        return this.fileAttributes;
    }

    /**
     * Set the fileAttributes property: Attributes set for the file.
     *
     * @param fileAttributes the fileAttributes value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFileAttributes(String fileAttributes) {
        this.fileAttributes = fileAttributes;
        return this;
    }

    /**
     * Get the fileCreationTime property: Creation time for the file.
     *
     * @return the fileCreationTime value.
     */
    public OffsetDateTime getFileCreationTime() {
        return this.fileCreationTime;
    }

    /**
     * Set the fileCreationTime property: Creation time for the file.
     *
     * @param fileCreationTime the fileCreationTime value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFileCreationTime(OffsetDateTime fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
        return this;
    }

    /**
     * Get the fileLastWriteTime property: Last write time for the file.
     *
     * @return the fileLastWriteTime value.
     */
    public OffsetDateTime getFileLastWriteTime() {
        return this.fileLastWriteTime;
    }

    /**
     * Set the fileLastWriteTime property: Last write time for the file.
     *
     * @param fileLastWriteTime the fileLastWriteTime value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFileLastWriteTime(OffsetDateTime fileLastWriteTime) {
        this.fileLastWriteTime = fileLastWriteTime;
        return this;
    }

    /**
     * Get the fileChangeTime property: Change time for the file.
     *
     * @return the fileChangeTime value.
     */
    public OffsetDateTime getFileChangeTime() {
        return this.fileChangeTime;
    }

    /**
     * Set the fileChangeTime property: Change time for the file.
     *
     * @param fileChangeTime the fileChangeTime value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFileChangeTime(OffsetDateTime fileChangeTime) {
        this.fileChangeTime = fileChangeTime;
        return this;
    }

    /**
     * Get the fileId property: The fileId of the directory.
     *
     * @return the fileId value.
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: The fileId of the directory.
     *
     * @param fileId the fileId value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the fileParentId property: The parent fileId of the directory.
     *
     * @return the fileParentId value.
     */
    public String getFileParentId() {
        return this.fileParentId;
    }

    /**
     * Set the fileParentId property: The parent fileId of the directory.
     *
     * @param fileParentId the fileParentId value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setFileParentId(String fileParentId) {
        this.fileParentId = fileParentId;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the FileSetHTTPHeadersHeaders object itself.
     */
    public FileSetHTTPHeadersHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
