/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.SourceControlType;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.SourceControlAuthInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the source code repository.
 */
public class SourceRepositoryPropertiesInner {
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
     * The value of this property indicates whether the source control commit
     * trigger is enabled or not.
     */
    @JsonProperty(value = "isCommitTriggerEnabled")
    private Boolean isCommitTriggerEnabled;

    /**
     * The authorization properties for accessing the source code repository.
     */
    @JsonProperty(value = "sourceControlAuthProperties")
    private SourceControlAuthInfo sourceControlAuthProperties;

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
     * @return the SourceRepositoryPropertiesInner object itself.
     */
    public SourceRepositoryPropertiesInner withSourceControlType(SourceControlType sourceControlType) {
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
     * @return the SourceRepositoryPropertiesInner object itself.
     */
    public SourceRepositoryPropertiesInner withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the value of this property indicates whether the source control commit trigger is enabled or not.
     *
     * @return the isCommitTriggerEnabled value
     */
    public Boolean isCommitTriggerEnabled() {
        return this.isCommitTriggerEnabled;
    }

    /**
     * Set the value of this property indicates whether the source control commit trigger is enabled or not.
     *
     * @param isCommitTriggerEnabled the isCommitTriggerEnabled value to set
     * @return the SourceRepositoryPropertiesInner object itself.
     */
    public SourceRepositoryPropertiesInner withIsCommitTriggerEnabled(Boolean isCommitTriggerEnabled) {
        this.isCommitTriggerEnabled = isCommitTriggerEnabled;
        return this;
    }

    /**
     * Get the authorization properties for accessing the source code repository.
     *
     * @return the sourceControlAuthProperties value
     */
    public SourceControlAuthInfo sourceControlAuthProperties() {
        return this.sourceControlAuthProperties;
    }

    /**
     * Set the authorization properties for accessing the source code repository.
     *
     * @param sourceControlAuthProperties the sourceControlAuthProperties value to set
     * @return the SourceRepositoryPropertiesInner object itself.
     */
    public SourceRepositoryPropertiesInner withSourceControlAuthProperties(SourceControlAuthInfo sourceControlAuthProperties) {
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        return this;
    }

}
