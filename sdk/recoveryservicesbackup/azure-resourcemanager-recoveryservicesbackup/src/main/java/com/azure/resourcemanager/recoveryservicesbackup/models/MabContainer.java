// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Container with items backed up using MAB backup engine. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType")
@JsonTypeName("Windows")
@Fluent
public final class MabContainer extends ProtectionContainer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MabContainer.class);

    /*
     * Can the container be registered one more time.
     */
    @JsonProperty(value = "canReRegister")
    private Boolean canReRegister;

    /*
     * ContainerID represents the container.
     */
    @JsonProperty(value = "containerId")
    private Long containerId;

    /*
     * Number of items backed up in this container.
     */
    @JsonProperty(value = "protectedItemCount")
    private Long protectedItemCount;

    /*
     * Agent version of this container.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /*
     * Additional information for this container
     */
    @JsonProperty(value = "extendedInfo")
    private MabContainerExtendedInfo extendedInfo;

    /*
     * Health details on this mab container.
     */
    @JsonProperty(value = "mabContainerHealthDetails")
    private List<MabContainerHealthDetails> mabContainerHealthDetails;

    /*
     * Health state of mab container.
     */
    @JsonProperty(value = "containerHealthState")
    private String containerHealthState;

    /**
     * Get the canReRegister property: Can the container be registered one more time.
     *
     * @return the canReRegister value.
     */
    public Boolean canReRegister() {
        return this.canReRegister;
    }

    /**
     * Set the canReRegister property: Can the container be registered one more time.
     *
     * @param canReRegister the canReRegister value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withCanReRegister(Boolean canReRegister) {
        this.canReRegister = canReRegister;
        return this;
    }

    /**
     * Get the containerId property: ContainerID represents the container.
     *
     * @return the containerId value.
     */
    public Long containerId() {
        return this.containerId;
    }

    /**
     * Set the containerId property: ContainerID represents the container.
     *
     * @param containerId the containerId value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withContainerId(Long containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get the protectedItemCount property: Number of items backed up in this container.
     *
     * @return the protectedItemCount value.
     */
    public Long protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set the protectedItemCount property: Number of items backed up in this container.
     *
     * @param protectedItemCount the protectedItemCount value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withProtectedItemCount(Long protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /**
     * Get the agentVersion property: Agent version of this container.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: Agent version of this container.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information for this container.
     *
     * @return the extendedInfo value.
     */
    public MabContainerExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information for this container.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withExtendedInfo(MabContainerExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /**
     * Get the mabContainerHealthDetails property: Health details on this mab container.
     *
     * @return the mabContainerHealthDetails value.
     */
    public List<MabContainerHealthDetails> mabContainerHealthDetails() {
        return this.mabContainerHealthDetails;
    }

    /**
     * Set the mabContainerHealthDetails property: Health details on this mab container.
     *
     * @param mabContainerHealthDetails the mabContainerHealthDetails value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withMabContainerHealthDetails(List<MabContainerHealthDetails> mabContainerHealthDetails) {
        this.mabContainerHealthDetails = mabContainerHealthDetails;
        return this;
    }

    /**
     * Get the containerHealthState property: Health state of mab container.
     *
     * @return the containerHealthState value.
     */
    public String containerHealthState() {
        return this.containerHealthState;
    }

    /**
     * Set the containerHealthState property: Health state of mab container.
     *
     * @param containerHealthState the containerHealthState value to set.
     * @return the MabContainer object itself.
     */
    public MabContainer withContainerHealthState(String containerHealthState) {
        this.containerHealthState = containerHealthState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MabContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
        if (mabContainerHealthDetails() != null) {
            mabContainerHealthDetails().forEach(e -> e.validate());
        }
    }
}
