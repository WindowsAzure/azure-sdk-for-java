/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation;

import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.SourceControlType;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.EnableStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Properties of an artifact source.
 */
@JsonFlatten
public class ArtifactSourceInner extends Resource {
    /**
     * The display name of the artifact source.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The URI of the artifact source.
     */
    @JsonProperty(value = "properties.uri")
    private String uri;

    /**
     * The type of the artifact source. Possible values include: 'VsoGit',
     * 'GitHub'.
     */
    @JsonProperty(value = "properties.sourceType")
    private SourceControlType sourceType;

    /**
     * The folder path of the artifact source.
     */
    @JsonProperty(value = "properties.folderPath")
    private String folderPath;

    /**
     * The branch reference of the artifact source.
     */
    @JsonProperty(value = "properties.branchRef")
    private String branchRef;

    /**
     * The security token of the artifact source.
     */
    @JsonProperty(value = "properties.securityToken")
    private String securityToken;

    /**
     * The status of the artifact source. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "properties.status")
    private EnableStatus status;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the display name of the artifact source.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the artifact source.
     *
     * @param displayName the displayName value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the URI of the artifact source.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI of the artifact source.
     *
     * @param uri the uri value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the type of the artifact source. Possible values include: 'VsoGit', 'GitHub'.
     *
     * @return the sourceType value
     */
    public SourceControlType sourceType() {
        return this.sourceType;
    }

    /**
     * Set the type of the artifact source. Possible values include: 'VsoGit', 'GitHub'.
     *
     * @param sourceType the sourceType value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withSourceType(SourceControlType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the folder path of the artifact source.
     *
     * @return the folderPath value
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folder path of the artifact source.
     *
     * @param folderPath the folderPath value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the branch reference of the artifact source.
     *
     * @return the branchRef value
     */
    public String branchRef() {
        return this.branchRef;
    }

    /**
     * Set the branch reference of the artifact source.
     *
     * @param branchRef the branchRef value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withBranchRef(String branchRef) {
        this.branchRef = branchRef;
        return this;
    }

    /**
     * Get the security token of the artifact source.
     *
     * @return the securityToken value
     */
    public String securityToken() {
        return this.securityToken;
    }

    /**
     * Set the security token of the artifact source.
     *
     * @param securityToken the securityToken value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the status of the artifact source. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set the status of the artifact source. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withStatus(EnableStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
