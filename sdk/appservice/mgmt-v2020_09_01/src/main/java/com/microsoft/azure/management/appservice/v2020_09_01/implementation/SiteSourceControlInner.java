/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Source control configuration for an app.
 */
@JsonFlatten
public class SiteSourceControlInner extends ProxyOnlyResource {
    /**
     * Repository or source control URL.
     */
    @JsonProperty(value = "properties.repoUrl")
    private String repoUrl;

    /**
     * Name of branch to use for deployment.
     */
    @JsonProperty(value = "properties.branch")
    private String branch;

    /**
     * &lt;code&gt;true&lt;/code&gt; to limit to manual integration;
     * &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which
     * configures webhooks into online repos like GitHub).
     */
    @JsonProperty(value = "properties.isManualIntegration")
    private Boolean isManualIntegration;

    /**
     * &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     */
    @JsonProperty(value = "properties.isGitHubAction")
    private Boolean isGitHubAction;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable deployment rollback; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.deploymentRollbackEnabled")
    private Boolean deploymentRollbackEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; for a Mercurial repository;
     * &lt;code&gt;false&lt;/code&gt; for a Git repository.
     */
    @JsonProperty(value = "properties.isMercurial")
    private Boolean isMercurial;

    /**
     * Get repository or source control URL.
     *
     * @return the repoUrl value
     */
    public String repoUrl() {
        return this.repoUrl;
    }

    /**
     * Set repository or source control URL.
     *
     * @param repoUrl the repoUrl value to set
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * Get name of branch to use for deployment.
     *
     * @return the branch value
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set name of branch to use for deployment.
     *
     * @param branch the branch value to set
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to limit to manual integration; &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like GitHub).
     *
     * @return the isManualIntegration value
     */
    public Boolean isManualIntegration() {
        return this.isManualIntegration;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to limit to manual integration; &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like GitHub).
     *
     * @param isManualIntegration the isManualIntegration value to set
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withIsManualIntegration(Boolean isManualIntegration) {
        this.isManualIntegration = isManualIntegration;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     *
     * @return the isGitHubAction value
     */
    public Boolean isGitHubAction() {
        return this.isGitHubAction;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     *
     * @param isGitHubAction the isGitHubAction value to set
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withIsGitHubAction(Boolean isGitHubAction) {
        this.isGitHubAction = isGitHubAction;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to enable deployment rollback; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the deploymentRollbackEnabled value
     */
    public Boolean deploymentRollbackEnabled() {
        return this.deploymentRollbackEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to enable deployment rollback; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param deploymentRollbackEnabled the deploymentRollbackEnabled value to set
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withDeploymentRollbackEnabled(Boolean deploymentRollbackEnabled) {
        this.deploymentRollbackEnabled = deploymentRollbackEnabled;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; for a Mercurial repository; &lt;code&gt;false&lt;/code&gt; for a Git repository.
     *
     * @return the isMercurial value
     */
    public Boolean isMercurial() {
        return this.isMercurial;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; for a Mercurial repository; &lt;code&gt;false&lt;/code&gt; for a Git repository.
     *
     * @param isMercurial the isMercurial value to set
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withIsMercurial(Boolean isMercurial) {
        this.isMercurial = isMercurial;
        return this;
    }

}
