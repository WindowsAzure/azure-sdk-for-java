// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure File Storage read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileStorageReadSettings")
@Fluent
public final class AzureFileStorageReadSettings extends StoreReadSettings {
    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Azure File Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * Azure File Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * Indicates whether to enable partition discovery.
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Boolean enablePartitionDiscovery;

    /*
     * The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

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
     * @return the AzureFileStorageReadSettings object itself.
     */
    public AzureFileStorageReadSettings setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Azure File Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     *
     * @return the wildcardFolderPath value.
     */
    public Object getWildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Azure File Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     *
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    public AzureFileStorageReadSettings setWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Azure File Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     *
     * @return the wildcardFileName value.
     */
    public Object getWildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Azure File Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     *
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    public AzureFileStorageReadSettings setWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @return the enablePartitionDiscovery value.
     */
    public Boolean isEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    public AzureFileStorageReadSettings setEnablePartitionDiscovery(Boolean enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    public AzureFileStorageReadSettings setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    public AzureFileStorageReadSettings setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }
}
