// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the dsc node configuration. */
@JsonFlatten
@Fluent
public class DscNodeConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DscNodeConfigurationInner.class);

    /*
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private OffsetDateTime creationTime;

    /*
     * Gets or sets the configuration of the node.
     */
    @JsonProperty(value = "properties.configuration")
    private DscConfigurationAssociationProperty configuration;

    /*
     * Source of node configuration.
     */
    @JsonProperty(value = "properties.source")
    private String source;

    /*
     * Number of nodes with this node configuration assigned
     */
    @JsonProperty(value = "properties.nodeCount")
    private Long nodeCount;

    /*
     * If a new build version of NodeConfiguration is required.
     */
    @JsonProperty(value = "properties.incrementNodeConfigurationBuild")
    private Boolean incrementNodeConfigurationBuild;

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the DscNodeConfigurationInner object itself.
     */
    public DscNodeConfigurationInner withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the creationTime property: Gets or sets creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Gets or sets creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the DscNodeConfigurationInner object itself.
     */
    public DscNodeConfigurationInner withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the configuration property: Gets or sets the configuration of the node.
     *
     * @return the configuration value.
     */
    public DscConfigurationAssociationProperty configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Gets or sets the configuration of the node.
     *
     * @param configuration the configuration value to set.
     * @return the DscNodeConfigurationInner object itself.
     */
    public DscNodeConfigurationInner withConfiguration(DscConfigurationAssociationProperty configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the source property: Source of node configuration.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source of node configuration.
     *
     * @param source the source value to set.
     * @return the DscNodeConfigurationInner object itself.
     */
    public DscNodeConfigurationInner withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the nodeCount property: Number of nodes with this node configuration assigned.
     *
     * @return the nodeCount value.
     */
    public Long nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: Number of nodes with this node configuration assigned.
     *
     * @param nodeCount the nodeCount value to set.
     * @return the DscNodeConfigurationInner object itself.
     */
    public DscNodeConfigurationInner withNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is required.
     *
     * @return the incrementNodeConfigurationBuild value.
     */
    public Boolean incrementNodeConfigurationBuild() {
        return this.incrementNodeConfigurationBuild;
    }

    /**
     * Set the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is required.
     *
     * @param incrementNodeConfigurationBuild the incrementNodeConfigurationBuild value to set.
     * @return the DscNodeConfigurationInner object itself.
     */
    public DscNodeConfigurationInner withIncrementNodeConfigurationBuild(Boolean incrementNodeConfigurationBuild) {
        this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
    }
}
