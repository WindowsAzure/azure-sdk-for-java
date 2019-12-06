/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Factory's VSTS repo information.
 */
public class FactoryVSTSConfiguration {
    /**
     * VSTS account name.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /**
     * VSTS project name.
     */
    @JsonProperty(value = "projectName")
    private String projectName;

    /**
     * VSTS repository name.
     */
    @JsonProperty(value = "repositoryName")
    private String repositoryName;

    /**
     * VSTS collaboration branch.
     */
    @JsonProperty(value = "collaborationBranch")
    private String collaborationBranch;

    /**
     * VSTS root folder.
     */
    @JsonProperty(value = "rootFolder")
    private String rootFolder;

    /**
     * VSTS last commit id.
     */
    @JsonProperty(value = "lastCommitId")
    private String lastCommitId;

    /**
     * VSTS tenant id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get vSTS account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set vSTS account name.
     *
     * @param accountName the accountName value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get vSTS project name.
     *
     * @return the projectName value
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Set vSTS project name.
     *
     * @param projectName the projectName value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get vSTS repository name.
     *
     * @return the repositoryName value
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Set vSTS repository name.
     *
     * @param repositoryName the repositoryName value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get vSTS collaboration branch.
     *
     * @return the collaborationBranch value
     */
    public String collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Set vSTS collaboration branch.
     *
     * @param collaborationBranch the collaborationBranch value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withCollaborationBranch(String collaborationBranch) {
        this.collaborationBranch = collaborationBranch;
        return this;
    }

    /**
     * Get vSTS root folder.
     *
     * @return the rootFolder value
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    /**
     * Set vSTS root folder.
     *
     * @param rootFolder the rootFolder value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
        return this;
    }

    /**
     * Get vSTS last commit id.
     *
     * @return the lastCommitId value
     */
    public String lastCommitId() {
        return this.lastCommitId;
    }

    /**
     * Set vSTS last commit id.
     *
     * @param lastCommitId the lastCommitId value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * Get vSTS tenant id.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set vSTS tenant id.
     *
     * @param tenantId the tenantId value to set
     * @return the FactoryVSTSConfiguration object itself.
     */
    public FactoryVSTSConfiguration withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
