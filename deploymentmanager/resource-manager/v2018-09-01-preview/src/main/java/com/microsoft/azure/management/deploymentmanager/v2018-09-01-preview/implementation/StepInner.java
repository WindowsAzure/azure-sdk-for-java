/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import java.util.List;
import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.PrePostStep;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define an Azure Deployment Manager step.
 */
public class StepInner {
    /**
     * The name of the step.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The list of step names on which this step depends.
     */
    @JsonProperty(value = "dependsOnStepGroup")
    private List<String> dependsOnStepGroup;

    /**
     * The list of step names to be run before deploying the target.
     */
    @JsonProperty(value = "preDeploymentSteps")
    private List<PrePostStep> preDeploymentSteps;

    /**
     * The reference to the ARM service unit resource to be deployed.
     */
    @JsonProperty(value = "deploymentTargetId", required = true)
    private String deploymentTargetId;

    /**
     * The list of step names to be run after deploying the target.
     */
    @JsonProperty(value = "postDeploymentSteps")
    private List<PrePostStep> postDeploymentSteps;

    /**
     * Get the name of the step.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the step.
     *
     * @param name the name value to set
     * @return the StepInner object itself.
     */
    public StepInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the list of step names on which this step depends.
     *
     * @return the dependsOnStepGroup value
     */
    public List<String> dependsOnStepGroup() {
        return this.dependsOnStepGroup;
    }

    /**
     * Set the list of step names on which this step depends.
     *
     * @param dependsOnStepGroup the dependsOnStepGroup value to set
     * @return the StepInner object itself.
     */
    public StepInner withDependsOnStepGroup(List<String> dependsOnStepGroup) {
        this.dependsOnStepGroup = dependsOnStepGroup;
        return this;
    }

    /**
     * Get the list of step names to be run before deploying the target.
     *
     * @return the preDeploymentSteps value
     */
    public List<PrePostStep> preDeploymentSteps() {
        return this.preDeploymentSteps;
    }

    /**
     * Set the list of step names to be run before deploying the target.
     *
     * @param preDeploymentSteps the preDeploymentSteps value to set
     * @return the StepInner object itself.
     */
    public StepInner withPreDeploymentSteps(List<PrePostStep> preDeploymentSteps) {
        this.preDeploymentSteps = preDeploymentSteps;
        return this;
    }

    /**
     * Get the reference to the ARM service unit resource to be deployed.
     *
     * @return the deploymentTargetId value
     */
    public String deploymentTargetId() {
        return this.deploymentTargetId;
    }

    /**
     * Set the reference to the ARM service unit resource to be deployed.
     *
     * @param deploymentTargetId the deploymentTargetId value to set
     * @return the StepInner object itself.
     */
    public StepInner withDeploymentTargetId(String deploymentTargetId) {
        this.deploymentTargetId = deploymentTargetId;
        return this;
    }

    /**
     * Get the list of step names to be run after deploying the target.
     *
     * @return the postDeploymentSteps value
     */
    public List<PrePostStep> postDeploymentSteps() {
        return this.postDeploymentSteps;
    }

    /**
     * Set the list of step names to be run after deploying the target.
     *
     * @param postDeploymentSteps the postDeploymentSteps value to set
     * @return the StepInner object itself.
     */
    public StepInner withPostDeploymentSteps(List<PrePostStep> postDeploymentSteps) {
        this.postDeploymentSteps = postDeploymentSteps;
        return this;
    }

}
