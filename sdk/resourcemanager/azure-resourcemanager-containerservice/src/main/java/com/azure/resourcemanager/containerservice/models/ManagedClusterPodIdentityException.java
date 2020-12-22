// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ManagedClusterPodIdentityException model. */
@Fluent
public final class ManagedClusterPodIdentityException {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterPodIdentityException.class);

    /*
     * Name of the pod identity exception.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Namespace of the pod identity exception.
     */
    @JsonProperty(value = "namespace", required = true)
    private String namespace;

    /*
     * Pod labels to match.
     */
    @JsonProperty(value = "podLabels", required = true)
    private Map<String, String> podLabels;

    /**
     * Get the name property: Name of the pod identity exception.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the pod identity exception.
     *
     * @param name the name value to set.
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: Namespace of the pod identity exception.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Namespace of the pod identity exception.
     *
     * @param namespace the namespace value to set.
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the podLabels property: Pod labels to match.
     *
     * @return the podLabels value.
     */
    public Map<String, String> podLabels() {
        return this.podLabels;
    }

    /**
     * Set the podLabels property: Pod labels to match.
     *
     * @param podLabels the podLabels value to set.
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withPodLabels(Map<String, String> podLabels) {
        this.podLabels = podLabels;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ManagedClusterPodIdentityException"));
        }
        if (namespace() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property namespace in model ManagedClusterPodIdentityException"));
        }
        if (podLabels() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property podLabels in model ManagedClusterPodIdentityException"));
        }
    }
}
