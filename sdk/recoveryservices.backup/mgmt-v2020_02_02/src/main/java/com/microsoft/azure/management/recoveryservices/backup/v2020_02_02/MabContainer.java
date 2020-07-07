/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionContainerInner;

/**
 * Container with items backed up using MAB backup engine.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType", defaultImpl = MabContainer.class)
@JsonTypeName("Windows")
public class MabContainer extends ProtectionContainerInner {
    /**
     * Can the container be registered one more time.
     */
    @JsonProperty(value = "canReRegister")
    private Boolean canReRegister;

    /**
     * ContainerID represents the container.
     */
    @JsonProperty(value = "containerId")
    private Long containerId;

    /**
     * Number of items backed up in this container.
     */
    @JsonProperty(value = "protectedItemCount")
    private Long protectedItemCount;

    /**
     * Agent version of this container.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * Additional information for this container.
     */
    @JsonProperty(value = "extendedInfo")
    private MabContainerExtendedInfo extendedInfo;

    /**
     * Health details on this mab container.
     */
    @JsonProperty(value = "mabContainerHealthDetails")
    private List<MABContainerHealthDetails> mabContainerHealthDetails;

    /**
     * Health state of mab container.
     */
    @JsonProperty(value = "containerHealthState")
    private String containerHealthState;

    /**
     * Get can the container be registered one more time.
     *
     * @return the canReRegister value
     */
    public Boolean canReRegister() {
        return this.canReRegister;
    }

    /**
     * Set can the container be registered one more time.
     *
     * @param canReRegister the canReRegister value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withCanReRegister(Boolean canReRegister) {
        this.canReRegister = canReRegister;
        return this;
    }

    /**
     * Get containerID represents the container.
     *
     * @return the containerId value
     */
    public Long containerId() {
        return this.containerId;
    }

    /**
     * Set containerID represents the container.
     *
     * @param containerId the containerId value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withContainerId(Long containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get number of items backed up in this container.
     *
     * @return the protectedItemCount value
     */
    public Long protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set number of items backed up in this container.
     *
     * @param protectedItemCount the protectedItemCount value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withProtectedItemCount(Long protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /**
     * Get agent version of this container.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set agent version of this container.
     *
     * @param agentVersion the agentVersion value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get additional information for this container.
     *
     * @return the extendedInfo value
     */
    public MabContainerExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for this container.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withExtendedInfo(MabContainerExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /**
     * Get health details on this mab container.
     *
     * @return the mabContainerHealthDetails value
     */
    public List<MABContainerHealthDetails> mabContainerHealthDetails() {
        return this.mabContainerHealthDetails;
    }

    /**
     * Set health details on this mab container.
     *
     * @param mabContainerHealthDetails the mabContainerHealthDetails value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withMabContainerHealthDetails(List<MABContainerHealthDetails> mabContainerHealthDetails) {
        this.mabContainerHealthDetails = mabContainerHealthDetails;
        return this;
    }

    /**
     * Get health state of mab container.
     *
     * @return the containerHealthState value
     */
    public String containerHealthState() {
        return this.containerHealthState;
    }

    /**
     * Set health state of mab container.
     *
     * @param containerHealthState the containerHealthState value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withContainerHealthState(String containerHealthState) {
        this.containerHealthState = containerHealthState;
        return this;
    }

}
