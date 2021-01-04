// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The location of Google Cloud Storage dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GoogleCloudStorageLocation")
@Fluent
public final class GoogleCloudStorageLocation extends DatasetLocation {
    /*
     * Specify the bucketName of Google Cloud Storage. Type: string (or
     * Expression with resultType string)
     */
    @JsonProperty(value = "bucketName")
    private Object bucketName;

    /*
     * Specify the version of Google Cloud Storage. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "version")
    private Object version;

    /**
     * Get the bucketName property: Specify the bucketName of Google Cloud Storage. Type: string (or Expression with
     * resultType string).
     *
     * @return the bucketName value.
     */
    public Object getBucketName() {
        return this.bucketName;
    }

    /**
     * Set the bucketName property: Specify the bucketName of Google Cloud Storage. Type: string (or Expression with
     * resultType string).
     *
     * @param bucketName the bucketName value to set.
     * @return the GoogleCloudStorageLocation object itself.
     */
    public GoogleCloudStorageLocation setBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get the version property: Specify the version of Google Cloud Storage. Type: string (or Expression with
     * resultType string).
     *
     * @return the version value.
     */
    public Object getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Specify the version of Google Cloud Storage. Type: string (or Expression with
     * resultType string).
     *
     * @param version the version value to set.
     * @return the GoogleCloudStorageLocation object itself.
     */
    public GoogleCloudStorageLocation setVersion(Object version) {
        this.version = version;
        return this;
    }
}
