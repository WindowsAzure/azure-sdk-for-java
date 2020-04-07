// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.storage.AzureEntityResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The FileShareItem model.
 */
@JsonFlatten
@Fluent
public class FileShareItemInner extends AzureEntityResource {
    /*
     * Returns the date and time the share was last modified.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * A name-value pair to associate with the share as metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /*
     * The maximum size of the share, in gigabytes. Must be greater than 0, and
     * less than or equal to 5TB (5120). For Large File Shares, the maximum
     * size is 102400.
     */
    @JsonProperty(value = "properties.shareQuota")
    private Integer shareQuota;

    /**
     * Get the lastModifiedTime property: Returns the date and time the share
     * was last modified.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the metadata property: A name-value pair to associate with the share
     * as metadata.
     * 
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A name-value pair to associate with the share
     * as metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the shareQuota property: The maximum size of the share, in
     * gigabytes. Must be greater than 0, and less than or equal to 5TB (5120).
     * For Large File Shares, the maximum size is 102400.
     * 
     * @return the shareQuota value.
     */
    public Integer shareQuota() {
        return this.shareQuota;
    }

    /**
     * Set the shareQuota property: The maximum size of the share, in
     * gigabytes. Must be greater than 0, and less than or equal to 5TB (5120).
     * For Large File Shares, the maximum size is 102400.
     * 
     * @param shareQuota the shareQuota value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withShareQuota(Integer shareQuota) {
        this.shareQuota = shareQuota;
        return this;
    }
}
