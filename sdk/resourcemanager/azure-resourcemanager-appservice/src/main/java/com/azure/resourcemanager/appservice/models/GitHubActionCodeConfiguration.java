// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GitHub action code configuration. */
@Fluent
public final class GitHubActionCodeConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GitHubActionCodeConfiguration.class);

    /*
     * Runtime stack is used to determine the workflow file content for code
     * base apps.
     */
    @JsonProperty(value = "runtimeStack")
    private String runtimeStack;

    /*
     * Runtime version is used to determine what build version to set in the
     * workflow file.
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /**
     * Get the runtimeStack property: Runtime stack is used to determine the workflow file content for code base apps.
     *
     * @return the runtimeStack value.
     */
    public String runtimeStack() {
        return this.runtimeStack;
    }

    /**
     * Set the runtimeStack property: Runtime stack is used to determine the workflow file content for code base apps.
     *
     * @param runtimeStack the runtimeStack value to set.
     * @return the GitHubActionCodeConfiguration object itself.
     */
    public GitHubActionCodeConfiguration withRuntimeStack(String runtimeStack) {
        this.runtimeStack = runtimeStack;
        return this;
    }

    /**
     * Get the runtimeVersion property: Runtime version is used to determine what build version to set in the workflow
     * file.
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Runtime version is used to determine what build version to set in the workflow
     * file.
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the GitHubActionCodeConfiguration object itself.
     */
    public GitHubActionCodeConfiguration withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
