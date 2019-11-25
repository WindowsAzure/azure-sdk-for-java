/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.ModuleProvisioningState;
import com.microsoft.azure.management.automation.v2015_10_31.ContentLink;
import com.microsoft.azure.management.automation.v2015_10_31.ModuleErrorInfo;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Definition of the module type.
 */
@JsonFlatten
@SkipParentValidation
public class ModuleInner extends Resource {
    /**
     * Gets or sets the isGlobal flag of the module.
     */
    @JsonProperty(value = "properties.isGlobal")
    private Boolean isGlobal;

    /**
     * Gets or sets the version of the module.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /**
     * Gets or sets the size in bytes of the module.
     */
    @JsonProperty(value = "properties.sizeInBytes")
    private Long sizeInBytes;

    /**
     * Gets or sets the activity count of the module.
     */
    @JsonProperty(value = "properties.activityCount")
    private Integer activityCount;

    /**
     * Gets or sets the provisioning state of the module. Possible values
     * include: 'Created', 'Creating', 'StartingImportModuleRunbook',
     * 'RunningImportModuleRunbook', 'ContentRetrieved', 'ContentDownloaded',
     * 'ContentValidated', 'ConnectionTypeImported', 'ContentStored',
     * 'ModuleDataStored', 'ActivitiesStored', 'ModuleImportRunbookComplete',
     * 'Succeeded', 'Failed', 'Cancelled', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ModuleProvisioningState provisioningState;

    /**
     * Gets or sets the contentLink of the module.
     */
    @JsonProperty(value = "properties.contentLink")
    private ContentLink contentLink;

    /**
     * Gets or sets the error info of the module.
     */
    @JsonProperty(value = "properties.error")
    private ModuleErrorInfo error;

    /**
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Gets or sets the etag of the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get gets or sets the isGlobal flag of the module.
     *
     * @return the isGlobal value
     */
    public Boolean isGlobal() {
        return this.isGlobal;
    }

    /**
     * Set gets or sets the isGlobal flag of the module.
     *
     * @param isGlobal the isGlobal value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * Get gets or sets the version of the module.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set gets or sets the version of the module.
     *
     * @param version the version value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get gets or sets the size in bytes of the module.
     *
     * @return the sizeInBytes value
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set gets or sets the size in bytes of the module.
     *
     * @param sizeInBytes the sizeInBytes value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get gets or sets the activity count of the module.
     *
     * @return the activityCount value
     */
    public Integer activityCount() {
        return this.activityCount;
    }

    /**
     * Set gets or sets the activity count of the module.
     *
     * @param activityCount the activityCount value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withActivityCount(Integer activityCount) {
        this.activityCount = activityCount;
        return this;
    }

    /**
     * Get gets or sets the provisioning state of the module. Possible values include: 'Created', 'Creating', 'StartingImportModuleRunbook', 'RunningImportModuleRunbook', 'ContentRetrieved', 'ContentDownloaded', 'ContentValidated', 'ConnectionTypeImported', 'ContentStored', 'ModuleDataStored', 'ActivitiesStored', 'ModuleImportRunbookComplete', 'Succeeded', 'Failed', 'Cancelled', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ModuleProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets or sets the provisioning state of the module. Possible values include: 'Created', 'Creating', 'StartingImportModuleRunbook', 'RunningImportModuleRunbook', 'ContentRetrieved', 'ContentDownloaded', 'ContentValidated', 'ConnectionTypeImported', 'ContentStored', 'ModuleDataStored', 'ActivitiesStored', 'ModuleImportRunbookComplete', 'Succeeded', 'Failed', 'Cancelled', 'Updating'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withProvisioningState(ModuleProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets or sets the contentLink of the module.
     *
     * @return the contentLink value
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Set gets or sets the contentLink of the module.
     *
     * @param contentLink the contentLink value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withContentLink(ContentLink contentLink) {
        this.contentLink = contentLink;
        return this;
    }

    /**
     * Get gets or sets the error info of the module.
     *
     * @return the error value
     */
    public ModuleErrorInfo error() {
        return this.error;
    }

    /**
     * Set gets or sets the error info of the module.
     *
     * @param error the error value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withError(ModuleErrorInfo error) {
        this.error = error;
        return this;
    }

    /**
     * Get gets or sets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets the etag of the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets or sets the etag of the resource.
     *
     * @param etag the etag value to set
     * @return the ModuleInner object itself.
     */
    public ModuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
