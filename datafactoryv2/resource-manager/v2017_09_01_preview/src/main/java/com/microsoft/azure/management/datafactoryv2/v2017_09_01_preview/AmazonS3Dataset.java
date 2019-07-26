/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DatasetInner;

/**
 * A single Amazon Simple Storage Service (S3) object or a set of S3 objects.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3Object")
@JsonFlatten
public class AmazonS3Dataset extends DatasetInner {
    /**
     * The name of the Amazon S3 bucket. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.bucketName", required = true)
    private Object bucketName;

    /**
     * The key of the Amazon S3 object. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.key")
    private Object key;

    /**
     * The prefix filter for the S3 object name. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.prefix")
    private Object prefix;

    /**
     * The version for the S3 object. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.version")
    private Object version;

    /**
     * The format of files.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /**
     * The data compression method used for the Amazon S3 object.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     *
     * @return the bucketName value
     */
    public Object bucketName() {
        return this.bucketName;
    }

    /**
     * Set the name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     *
     * @param bucketName the bucketName value to set
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset withBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get the key of the Amazon S3 object. Type: string (or Expression with resultType string).
     *
     * @return the key value
     */
    public Object key() {
        return this.key;
    }

    /**
     * Set the key of the Amazon S3 object. Type: string (or Expression with resultType string).
     *
     * @param key the key value to set
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset withKey(Object key) {
        this.key = key;
        return this;
    }

    /**
     * Get the prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     *
     * @return the prefix value
     */
    public Object prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     *
     * @param prefix the prefix value to set
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset withPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the version for the S3 object. Type: string (or Expression with resultType string).
     *
     * @return the version value
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set the version for the S3 object. Type: string (or Expression with resultType string).
     *
     * @param version the version value to set
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the format of files.
     *
     * @return the format value
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format of files.
     *
     * @param format the format value to set
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the data compression method used for the Amazon S3 object.
     *
     * @return the compression value
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the data compression method used for the Amazon S3 object.
     *
     * @param compression the compression value to set
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

}
