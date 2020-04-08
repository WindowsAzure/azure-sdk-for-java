// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SourceTriggerDescriptor model. */
@Fluent
public final class SourceTriggerDescriptor {
    /*
     * The unique ID of the trigger.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The event type of the trigger.
     */
    @JsonProperty(value = "eventType")
    private String eventType;

    /*
     * The unique ID that identifies a commit.
     */
    @JsonProperty(value = "commitId")
    private String commitId;

    /*
     * The unique ID that identifies pull request.
     */
    @JsonProperty(value = "pullRequestId")
    private String pullRequestId;

    /*
     * The repository URL.
     */
    @JsonProperty(value = "repositoryUrl")
    private String repositoryUrl;

    /*
     * The branch name in the repository.
     */
    @JsonProperty(value = "branchName")
    private String branchName;

    /*
     * The source control provider type.
     */
    @JsonProperty(value = "providerType")
    private String providerType;

    /**
     * Get the id property: The unique ID of the trigger.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The unique ID of the trigger.
     *
     * @param id the id value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the eventType property: The event type of the trigger.
     *
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: The event type of the trigger.
     *
     * @param eventType the eventType value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the commitId property: The unique ID that identifies a commit.
     *
     * @return the commitId value.
     */
    public String commitId() {
        return this.commitId;
    }

    /**
     * Set the commitId property: The unique ID that identifies a commit.
     *
     * @param commitId the commitId value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get the pullRequestId property: The unique ID that identifies pull request.
     *
     * @return the pullRequestId value.
     */
    public String pullRequestId() {
        return this.pullRequestId;
    }

    /**
     * Set the pullRequestId property: The unique ID that identifies pull request.
     *
     * @param pullRequestId the pullRequestId value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * Get the repositoryUrl property: The repository URL.
     *
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl property: The repository URL.
     *
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branchName property: The branch name in the repository.
     *
     * @return the branchName value.
     */
    public String branchName() {
        return this.branchName;
    }

    /**
     * Set the branchName property: The branch name in the repository.
     *
     * @param branchName the branchName value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * Get the providerType property: The source control provider type.
     *
     * @return the providerType value.
     */
    public String providerType() {
        return this.providerType;
    }

    /**
     * Set the providerType property: The source control provider type.
     *
     * @param providerType the providerType value to set.
     * @return the SourceTriggerDescriptor object itself.
     */
    public SourceTriggerDescriptor withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
}
