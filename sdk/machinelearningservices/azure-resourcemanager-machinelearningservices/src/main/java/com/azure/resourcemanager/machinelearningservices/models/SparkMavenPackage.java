// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SparkMavenPackage model. */
@Fluent
public final class SparkMavenPackage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SparkMavenPackage.class);

    /*
     * The group property.
     */
    @JsonProperty(value = "group")
    private String group;

    /*
     * The artifact property.
     */
    @JsonProperty(value = "artifact")
    private String artifact;

    /*
     * The version property.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the group property: The group property.
     *
     * @return the group value.
     */
    public String group() {
        return this.group;
    }

    /**
     * Set the group property: The group property.
     *
     * @param group the group value to set.
     * @return the SparkMavenPackage object itself.
     */
    public SparkMavenPackage withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get the artifact property: The artifact property.
     *
     * @return the artifact value.
     */
    public String artifact() {
        return this.artifact;
    }

    /**
     * Set the artifact property: The artifact property.
     *
     * @param artifact the artifact value to set.
     * @return the SparkMavenPackage object itself.
     */
    public SparkMavenPackage withArtifact(String artifact) {
        this.artifact = artifact;
        return this;
    }

    /**
     * Get the version property: The version property.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version property.
     *
     * @param version the version value to set.
     * @return the SparkMavenPackage object itself.
     */
    public SparkMavenPackage withVersion(String version) {
        this.version = version;
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