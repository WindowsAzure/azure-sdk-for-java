/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the source code repository.
 */
public class SourceProperties {
    /**
     * The type of source control service. Possible values include: 'Github',
     * 'VisualStudioTeamService'.
     */
    @JsonProperty(value = "sourceControlType", required = true)
    private SourceControlType sourceControlType;

    /**
     * The full URL to the source code respository.
     */
    @JsonProperty(value = "repositoryUrl", required = true)
    private String repositoryUrl;

    /**
     * The branch name of the source code.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /**
     * The authorization properties for accessing the source code repository
     * and to set up
     * webhooks for notifications.
     */
    @JsonProperty(value = "sourceControlAuthProperties")
    private AuthInfo sourceControlAuthProperties;

    /**
     * Get the type of source control service. Possible values include: 'Github', 'VisualStudioTeamService'.
     *
     * @return the sourceControlType value
     */
    public SourceControlType sourceControlType() {
        return this.sourceControlType;
    }

    /**
     * Set the type of source control service. Possible values include: 'Github', 'VisualStudioTeamService'.
     *
     * @param sourceControlType the sourceControlType value to set
     * @return the SourceProperties object itself.
     */
    public SourceProperties withSourceControlType(SourceControlType sourceControlType) {
        this.sourceControlType = sourceControlType;
        return this;
    }

    /**
     * Get the full URL to the source code respository.
     *
     * @return the repositoryUrl value
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the full URL to the source code respository.
     *
     * @param repositoryUrl the repositoryUrl value to set
     * @return the SourceProperties object itself.
     */
    public SourceProperties withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branch name of the source code.
     *
     * @return the branch value
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch name of the source code.
     *
     * @param branch the branch value to set
     * @return the SourceProperties object itself.
     */
    public SourceProperties withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the authorization properties for accessing the source code repository and to set up
     webhooks for notifications.
     *
     * @return the sourceControlAuthProperties value
     */
    public AuthInfo sourceControlAuthProperties() {
        return this.sourceControlAuthProperties;
    }

    /**
     * Set the authorization properties for accessing the source code repository and to set up
     webhooks for notifications.
     *
     * @param sourceControlAuthProperties the sourceControlAuthProperties value to set
     * @return the SourceProperties object itself.
     */
    public SourceProperties withSourceControlAuthProperties(AuthInfo sourceControlAuthProperties) {
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        return this;
    }

}
