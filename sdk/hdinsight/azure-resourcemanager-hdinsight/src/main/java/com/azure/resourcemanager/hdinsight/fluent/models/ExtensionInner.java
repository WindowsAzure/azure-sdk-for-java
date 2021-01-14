// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cluster monitoring extensions. */
@Fluent
public final class ExtensionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtensionInner.class);

    /*
     * The workspace ID for the cluster monitoring extension.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /*
     * The certificate for the cluster monitoring extensions.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * Get the workspaceId property: The workspace ID for the cluster monitoring extension.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The workspace ID for the cluster monitoring extension.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the primaryKey property: The certificate for the cluster monitoring extensions.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: The certificate for the cluster monitoring extensions.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
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
