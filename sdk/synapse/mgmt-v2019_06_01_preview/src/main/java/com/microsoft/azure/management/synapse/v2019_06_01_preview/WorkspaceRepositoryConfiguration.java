/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Git integration settings.
 */
public class WorkspaceRepositoryConfiguration {
    /**
     * Type of workspace repositoryID configuration. Example
     * WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com.
     */
    @JsonProperty(value = "hostName")
    private String hostName;

    /**
     * Account name.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /**
     * VSTS project name.
     */
    @JsonProperty(value = "projectName")
    private String projectName;

    /**
     * Repository name.
     */
    @JsonProperty(value = "repositoryName")
    private String repositoryName;

    /**
     * Collaboration branch.
     */
    @JsonProperty(value = "collaborationBranch")
    private String collaborationBranch;

    /**
     * Root folder to use in the repository.
     */
    @JsonProperty(value = "rootFolder")
    private String rootFolder;

    /**
     * Get type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration.
     *
     * @param type the type value to set
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get gitHub Enterprise host name. For example: https://github.mydomain.com.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set gitHub Enterprise host name. For example: https://github.mydomain.com.
     *
     * @param hostName the hostName value to set
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set account name.
     *
     * @param accountName the accountName value to set
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withAccountName(String accountName) {
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
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get repository name.
     *
     * @return the repositoryName value
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Set repository name.
     *
     * @param repositoryName the repositoryName value to set
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get collaboration branch.
     *
     * @return the collaborationBranch value
     */
    public String collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Set collaboration branch.
     *
     * @param collaborationBranch the collaborationBranch value to set
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withCollaborationBranch(String collaborationBranch) {
        this.collaborationBranch = collaborationBranch;
        return this;
    }

    /**
     * Get root folder to use in the repository.
     *
     * @return the rootFolder value
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    /**
     * Set root folder to use in the repository.
     *
     * @param rootFolder the rootFolder value to set
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration withRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
        return this;
    }

}
