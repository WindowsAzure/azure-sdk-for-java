/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * SQL pool patch info.
 * A SQL Analytics pool patch info.
 */
@JsonFlatten
public class SqlPoolPatchInfo {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The geo-location where the resource lives.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * SQL pool SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Maximum size in bytes.
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /**
     * Collation mode.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /**
     * Source database to create from.
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /**
     * Backup database to restore from.
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /**
     * Resource state.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Resource status.
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /**
     * Snapshot time to restore.
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private DateTime restorePointInTime;

    /**
     * What is this?.
     */
    @JsonProperty(value = "properties.createMode")
    private String createMode;

    /**
     * Date the SQL pool was created.
     */
    @JsonProperty(value = "properties.creationDate")
    private DateTime creationDate;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the geo-location where the resource lives.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the geo-location where the resource lives.
     *
     * @param location the location value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get sQL pool SKU.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set sQL pool SKU.
     *
     * @param sku the sku value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get maximum size in bytes.
     *
     * @return the maxSizeBytes value
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set maximum size in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get collation mode.
     *
     * @return the collation value
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set collation mode.
     *
     * @param collation the collation value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get source database to create from.
     *
     * @return the sourceDatabaseId value
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set source database to create from.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get backup database to restore from.
     *
     * @return the recoverableDatabaseId value
     */
    public String recoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set backup database to restore from.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

    /**
     * Get resource state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set resource state.
     *
     * @param provisioningState the provisioningState value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get resource status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set resource status.
     *
     * @param status the status value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get snapshot time to restore.
     *
     * @return the restorePointInTime value
     */
    public DateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set snapshot time to restore.
     *
     * @param restorePointInTime the restorePointInTime value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withRestorePointInTime(DateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get what is this?.
     *
     * @return the createMode value
     */
    public String createMode() {
        return this.createMode;
    }

    /**
     * Set what is this?.
     *
     * @param createMode the createMode value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get date the SQL pool was created.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Set date the SQL pool was created.
     *
     * @param creationDate the creationDate value to set
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

}
