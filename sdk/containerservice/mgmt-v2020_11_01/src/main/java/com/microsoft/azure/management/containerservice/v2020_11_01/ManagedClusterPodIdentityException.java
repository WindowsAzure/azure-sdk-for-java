/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ManagedClusterPodIdentityException model.
 */
public class ManagedClusterPodIdentityException {
    /**
     * Name of the pod identity exception.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Namespace of the pod identity exception.
     */
    @JsonProperty(value = "namespace", required = true)
    private String namespace;

    /**
     * Pod labels to match.
     */
    @JsonProperty(value = "podLabels", required = true)
    private Map<String, String> podLabels;

    /**
     * Get name of the pod identity exception.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the pod identity exception.
     *
     * @param name the name value to set
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get namespace of the pod identity exception.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set namespace of the pod identity exception.
     *
     * @param namespace the namespace value to set
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get pod labels to match.
     *
     * @return the podLabels value
     */
    public Map<String, String> podLabels() {
        return this.podLabels;
    }

    /**
     * Set pod labels to match.
     *
     * @param podLabels the podLabels value to set
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withPodLabels(Map<String, String> podLabels) {
        this.podLabels = podLabels;
        return this;
    }

}
