// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Returns the requested OCI Manifest file. */
@Fluent
public final class OCIManifest extends Manifest {
    /*
     * V2 image config descriptor
     */
    @JsonProperty(value = "config")
    private Descriptor config;

    /*
     * List of V2 image layer information
     */
    @JsonProperty(value = "layers")
    private List<Descriptor> layers;

    /*
     * Additional information provided through arbitrary metadata.
     */
    @JsonProperty(value = "annotations")
    private Annotations annotations;

    /**
     * Get the config property: V2 image config descriptor.
     *
     * @return the config value.
     */
    public Descriptor getConfig() {
        return this.config;
    }

    /**
     * Set the config property: V2 image config descriptor.
     *
     * @param config the config value to set.
     * @return the OCIManifest object itself.
     */
    public OCIManifest setConfig(Descriptor config) {
        this.config = config;
        return this;
    }

    /**
     * Get the layers property: List of V2 image layer information.
     *
     * @return the layers value.
     */
    public List<Descriptor> getLayers() {
        return this.layers;
    }

    /**
     * Set the layers property: List of V2 image layer information.
     *
     * @param layers the layers value to set.
     * @return the OCIManifest object itself.
     */
    public OCIManifest setLayers(List<Descriptor> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * Get the annotations property: Additional information provided through arbitrary metadata.
     *
     * @return the annotations value.
     */
    public Annotations getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: Additional information provided through arbitrary metadata.
     *
     * @param annotations the annotations value to set.
     * @return the OCIManifest object itself.
     */
    public OCIManifest setAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }
}
