// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Blob source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobSource")
@Fluent
public final class BlobSource extends CopySource {
    /*
     * Treat empty as null. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "treatEmptyAsNull")
    private Object treatEmptyAsNull;

    /*
     * Number of header lines to skip from each blob. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "skipHeaderLineCount")
    private Object skipHeaderLineCount;

    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /**
     * Get the treatEmptyAsNull property: Treat empty as null. Type: boolean (or Expression with resultType boolean).
     *
     * @return the treatEmptyAsNull value.
     */
    public Object getTreatEmptyAsNull() {
        return this.treatEmptyAsNull;
    }

    /**
     * Set the treatEmptyAsNull property: Treat empty as null. Type: boolean (or Expression with resultType boolean).
     *
     * @param treatEmptyAsNull the treatEmptyAsNull value to set.
     * @return the BlobSource object itself.
     */
    public BlobSource setTreatEmptyAsNull(Object treatEmptyAsNull) {
        this.treatEmptyAsNull = treatEmptyAsNull;
        return this;
    }

    /**
     * Get the skipHeaderLineCount property: Number of header lines to skip from each blob. Type: integer (or Expression
     * with resultType integer).
     *
     * @return the skipHeaderLineCount value.
     */
    public Object getSkipHeaderLineCount() {
        return this.skipHeaderLineCount;
    }

    /**
     * Set the skipHeaderLineCount property: Number of header lines to skip from each blob. Type: integer (or Expression
     * with resultType integer).
     *
     * @param skipHeaderLineCount the skipHeaderLineCount value to set.
     * @return the BlobSource object itself.
     */
    public BlobSource setSkipHeaderLineCount(Object skipHeaderLineCount) {
        this.skipHeaderLineCount = skipHeaderLineCount;
        return this;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the BlobSource object itself.
     */
    public BlobSource setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }
}
