// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** The Workspace model. */
@JsonFlatten
@Fluent
public class Workspace extends Resource {
    /*
     * Managed service identity of the workspace.
     */
    @JsonProperty(value = "identity")
    private WorkspaceIdentity identity;

    /*
     * Workspace provisioning state, example Succeeded.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Time the workspace was created in ISO8601 format.
     */
    @JsonProperty(value = "properties.createTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createTime;

    /*
     * Version of the workspace.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Linked service reference.
     */
    @JsonProperty(value = "properties.defaultStorage")
    private LinkedServiceReference defaultStorage;

    /*
     * Linked service reference.
     */
    @JsonProperty(value = "properties.defaultSqlServer")
    private LinkedServiceReference defaultSqlServer;

    /*
     * Workspace resource type.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the identity property: Managed service identity of the workspace.
     *
     * @return the identity value.
     */
    public WorkspaceIdentity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity of the workspace.
     *
     * @param identity the identity value to set.
     * @return the Workspace object itself.
     */
    public Workspace setIdentity(WorkspaceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: Workspace provisioning state, example Succeeded.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createTime property: Time the workspace was created in ISO8601 format.
     *
     * @return the createTime value.
     */
    public OffsetDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Get the version property: Version of the workspace.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Get the defaultStorage property: Linked service reference.
     *
     * @return the defaultStorage value.
     */
    public LinkedServiceReference getDefaultStorage() {
        return this.defaultStorage;
    }

    /**
     * Set the defaultStorage property: Linked service reference.
     *
     * @param defaultStorage the defaultStorage value to set.
     * @return the Workspace object itself.
     */
    public Workspace setDefaultStorage(LinkedServiceReference defaultStorage) {
        this.defaultStorage = defaultStorage;
        return this;
    }

    /**
     * Get the defaultSqlServer property: Linked service reference.
     *
     * @return the defaultSqlServer value.
     */
    public LinkedServiceReference getDefaultSqlServer() {
        return this.defaultSqlServer;
    }

    /**
     * Set the defaultSqlServer property: Linked service reference.
     *
     * @param defaultSqlServer the defaultSqlServer value to set.
     * @return the Workspace object itself.
     */
    public Workspace setDefaultSqlServer(LinkedServiceReference defaultSqlServer) {
        this.defaultSqlServer = defaultSqlServer;
        return this;
    }

    /**
     * Get the additionalProperties property: Workspace resource type.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Workspace resource type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Workspace object itself.
     */
    public Workspace setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key.replace("\\.", "."), value);
    }
}
