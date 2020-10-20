// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Build properties for the static site. */
@Fluent
public final class StaticSiteBuildProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSiteBuildProperties.class);

    /*
     * The path to the app code within the repository.
     */
    @JsonProperty(value = "appLocation")
    private String appLocation;

    /*
     * The path to the api code within the repository.
     */
    @JsonProperty(value = "apiLocation")
    private String apiLocation;

    /*
     * The path of the app artifacts after building.
     */
    @JsonProperty(value = "appArtifactLocation")
    private String appArtifactLocation;

    /**
     * Get the appLocation property: The path to the app code within the repository.
     *
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The path to the app code within the repository.
     *
     * @param appLocation the appLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the apiLocation property: The path to the api code within the repository.
     *
     * @return the apiLocation value.
     */
    public String apiLocation() {
        return this.apiLocation;
    }

    /**
     * Set the apiLocation property: The path to the api code within the repository.
     *
     * @param apiLocation the apiLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withApiLocation(String apiLocation) {
        this.apiLocation = apiLocation;
        return this;
    }

    /**
     * Get the appArtifactLocation property: The path of the app artifacts after building.
     *
     * @return the appArtifactLocation value.
     */
    public String appArtifactLocation() {
        return this.appArtifactLocation;
    }

    /**
     * Set the appArtifactLocation property: The path of the app artifacts after building.
     *
     * @param appArtifactLocation the appArtifactLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppArtifactLocation(String appArtifactLocation) {
        this.appArtifactLocation = appArtifactLocation;
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
