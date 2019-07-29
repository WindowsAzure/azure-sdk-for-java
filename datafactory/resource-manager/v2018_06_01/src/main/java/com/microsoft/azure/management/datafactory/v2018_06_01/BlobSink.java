/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Azure Blob sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobSink")
public class BlobSink extends CopySink {
    /**
     * Blob writer overwrite files. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "blobWriterOverwriteFiles")
    private Object blobWriterOverwriteFiles;

    /**
     * Blob writer date time format. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "blobWriterDateTimeFormat")
    private Object blobWriterDateTimeFormat;

    /**
     * Blob writer add header. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "blobWriterAddHeader")
    private Object blobWriterAddHeader;

    /**
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /**
     * Get blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     *
     * @return the blobWriterOverwriteFiles value
     */
    public Object blobWriterOverwriteFiles() {
        return this.blobWriterOverwriteFiles;
    }

    /**
     * Set blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     *
     * @param blobWriterOverwriteFiles the blobWriterOverwriteFiles value to set
     * @return the BlobSink object itself.
     */
    public BlobSink withBlobWriterOverwriteFiles(Object blobWriterOverwriteFiles) {
        this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
        return this;
    }

    /**
     * Get blob writer date time format. Type: string (or Expression with resultType string).
     *
     * @return the blobWriterDateTimeFormat value
     */
    public Object blobWriterDateTimeFormat() {
        return this.blobWriterDateTimeFormat;
    }

    /**
     * Set blob writer date time format. Type: string (or Expression with resultType string).
     *
     * @param blobWriterDateTimeFormat the blobWriterDateTimeFormat value to set
     * @return the BlobSink object itself.
     */
    public BlobSink withBlobWriterDateTimeFormat(Object blobWriterDateTimeFormat) {
        this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
        return this;
    }

    /**
     * Get blob writer add header. Type: boolean (or Expression with resultType boolean).
     *
     * @return the blobWriterAddHeader value
     */
    public Object blobWriterAddHeader() {
        return this.blobWriterAddHeader;
    }

    /**
     * Set blob writer add header. Type: boolean (or Expression with resultType boolean).
     *
     * @param blobWriterAddHeader the blobWriterAddHeader value to set
     * @return the BlobSink object itself.
     */
    public BlobSink withBlobWriterAddHeader(Object blobWriterAddHeader) {
        this.blobWriterAddHeader = blobWriterAddHeader;
        return this;
    }

    /**
     * Get the type of copy behavior for copy sink.
     *
     * @return the copyBehavior value
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set
     * @return the BlobSink object itself.
     */
    public BlobSink withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

}
