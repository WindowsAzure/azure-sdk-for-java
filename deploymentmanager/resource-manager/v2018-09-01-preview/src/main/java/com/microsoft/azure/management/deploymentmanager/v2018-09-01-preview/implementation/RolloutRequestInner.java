/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.Identity;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Defines the PUT rollout request body.
 */
@JsonFlatten
public class RolloutRequestInner extends Resource {
    /**
     * Identity for the resource.
     */
    @JsonProperty(value = "identity", required = true)
    private Identity identity;

    /**
     * The version of the build being deployed.
     */
    @JsonProperty(value = "properties.buildVersion", required = true)
    private String buildVersion;

    /**
     * The reference to the artifact source resource Id where the payload is
     * located.
     */
    @JsonProperty(value = "properties.artifactSourceId")
    private String artifactSourceId;

    /**
     * The resource Id of the service topology from which service units are
     * being referenced in step groups to be deployed.
     */
    @JsonProperty(value = "properties.targetServiceTopologyId", required = true)
    private String targetServiceTopologyId;

    /**
     * The list of step groups that define the orchestration.
     */
    @JsonProperty(value = "properties.stepGroups", required = true)
    private List<StepInner> stepGroups;

    /**
     * Get identity for the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set identity for the resource.
     *
     * @param identity the identity value to set
     * @return the RolloutRequestInner object itself.
     */
    public RolloutRequestInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the version of the build being deployed.
     *
     * @return the buildVersion value
     */
    public String buildVersion() {
        return this.buildVersion;
    }

    /**
     * Set the version of the build being deployed.
     *
     * @param buildVersion the buildVersion value to set
     * @return the RolloutRequestInner object itself.
     */
    public RolloutRequestInner withBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }

    /**
     * Get the reference to the artifact source resource Id where the payload is located.
     *
     * @return the artifactSourceId value
     */
    public String artifactSourceId() {
        return this.artifactSourceId;
    }

    /**
     * Set the reference to the artifact source resource Id where the payload is located.
     *
     * @param artifactSourceId the artifactSourceId value to set
     * @return the RolloutRequestInner object itself.
     */
    public RolloutRequestInner withArtifactSourceId(String artifactSourceId) {
        this.artifactSourceId = artifactSourceId;
        return this;
    }

    /**
     * Get the resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     *
     * @return the targetServiceTopologyId value
     */
    public String targetServiceTopologyId() {
        return this.targetServiceTopologyId;
    }

    /**
     * Set the resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     *
     * @param targetServiceTopologyId the targetServiceTopologyId value to set
     * @return the RolloutRequestInner object itself.
     */
    public RolloutRequestInner withTargetServiceTopologyId(String targetServiceTopologyId) {
        this.targetServiceTopologyId = targetServiceTopologyId;
        return this;
    }

    /**
     * Get the list of step groups that define the orchestration.
     *
     * @return the stepGroups value
     */
    public List<StepInner> stepGroups() {
        return this.stepGroups;
    }

    /**
     * Set the list of step groups that define the orchestration.
     *
     * @param stepGroups the stepGroups value to set
     * @return the RolloutRequestInner object itself.
     */
    public RolloutRequestInner withStepGroups(List<StepInner> stepGroups) {
        this.stepGroups = stepGroups;
        return this;
    }

}
