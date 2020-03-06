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
 * The properties for updating the source code repository.
 */
public class SourceUpdateParameters {
    /**
     * The type of source control service. Possible values include: 'Github',
     * 'VisualStudioTeamService'.
     */
    @JsonProperty(value = "sourceControlType")
    private SourceControlType sourceControlType;

    /**
     * The full URL to the source code repository.
     */
    @JsonProperty(value = "repositoryUrl")
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
    private AuthInfoUpdateParameters sourceControlAuthProperties;

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
     * @return the SourceUpdateParameters object itself.
     */
    public SourceUpdateParameters withSourceControlType(SourceControlType sourceControlType) {
        this.sourceControlType = sourceControlType;
        return this;
    }

    /**
     * Get the full URL to the source code repository.
     *
     * @return the repositoryUrl value
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the full URL to the source code repository.
     *
     * @param repositoryUrl the repositoryUrl value to set
     * @return the SourceUpdateParameters object itself.
     */
    public SourceUpdateParameters withRepositoryUrl(String repositoryUrl) {
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
     * @return the SourceUpdateParameters object itself.
     */
    public SourceUpdateParameters withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the authorization properties for accessing the source code repository and to set up
     webhooks for notifications.
     *
     * @return the sourceControlAuthProperties value
     */
    public AuthInfoUpdateParameters sourceControlAuthProperties() {
        return this.sourceControlAuthProperties;
    }

    /**
     * Set the authorization properties for accessing the source code repository and to set up
     webhooks for notifications.
     *
     * @param sourceControlAuthProperties the sourceControlAuthProperties value to set
     * @return the SourceUpdateParameters object itself.
     */
    public SourceUpdateParameters withSourceControlAuthProperties(AuthInfoUpdateParameters sourceControlAuthProperties) {
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        return this;
    }

}
