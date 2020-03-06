/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The profile of an orchestrator and its available versions.
 */
public class OrchestratorVersionProfile {
    /**
     * Orchestrator type.
     */
    @JsonProperty(value = "orchestratorType", required = true)
    private String orchestratorType;

    /**
     * Orchestrator version (major, minor, patch).
     */
    @JsonProperty(value = "orchestratorVersion", required = true)
    private String orchestratorVersion;

    /**
     * Installed by default if version is not specified.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /**
     * Whether Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /**
     * The list of available upgrade versions.
     */
    @JsonProperty(value = "upgrades")
    private List<OrchestratorProfile> upgrades;

    /**
     * Get orchestrator type.
     *
     * @return the orchestratorType value
     */
    public String orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Set orchestrator type.
     *
     * @param orchestratorType the orchestratorType value to set
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withOrchestratorType(String orchestratorType) {
        this.orchestratorType = orchestratorType;
        return this;
    }

    /**
     * Get orchestrator version (major, minor, patch).
     *
     * @return the orchestratorVersion value
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set orchestrator version (major, minor, patch).
     *
     * @param orchestratorVersion the orchestratorVersion value to set
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get installed by default if version is not specified.
     *
     * @return the defaultProperty value
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set installed by default if version is not specified.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get whether Kubernetes version is currently in preview.
     *
     * @return the isPreview value
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set whether Kubernetes version is currently in preview.
     *
     * @param isPreview the isPreview value to set
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Get the list of available upgrade versions.
     *
     * @return the upgrades value
     */
    public List<OrchestratorProfile> upgrades() {
        return this.upgrades;
    }

    /**
     * Set the list of available upgrade versions.
     *
     * @param upgrades the upgrades value to set
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withUpgrades(List<OrchestratorProfile> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

}
