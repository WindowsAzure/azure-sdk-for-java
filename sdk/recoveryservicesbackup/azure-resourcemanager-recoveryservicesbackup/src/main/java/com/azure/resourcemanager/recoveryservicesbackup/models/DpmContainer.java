// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** DPM workload-specific protection container. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "containerType",
    defaultImpl = DpmContainer.class)
@JsonTypeName("DPMContainer")
@JsonSubTypes({@JsonSubTypes.Type(name = "AzureBackupServerContainer", value = AzureBackupServerContainer.class)})
@Fluent
public class DpmContainer extends ProtectionContainer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DpmContainer.class);

    /*
     * Specifies whether the container is re-registrable.
     */
    @JsonProperty(value = "canReRegister")
    private Boolean canReRegister;

    /*
     * ID of container.
     */
    @JsonProperty(value = "containerId")
    private String containerId;

    /*
     * Number of protected items in the BackupEngine
     */
    @JsonProperty(value = "protectedItemCount")
    private Long protectedItemCount;

    /*
     * Backup engine Agent version
     */
    @JsonProperty(value = "dpmAgentVersion")
    private String dpmAgentVersion;

    /*
     * List of BackupEngines protecting the container
     */
    @JsonProperty(value = "dpmServers")
    private List<String> dpmServers;

    /*
     * To check if upgrade available
     */
    @JsonProperty(value = "upgradeAvailable")
    private Boolean upgradeAvailable;

    /*
     * Protection status of the container.
     */
    @JsonProperty(value = "protectionStatus")
    private String protectionStatus;

    /*
     * Extended Info of the container.
     */
    @JsonProperty(value = "extendedInfo")
    private DpmContainerExtendedInfo extendedInfo;

    /**
     * Get the canReRegister property: Specifies whether the container is re-registrable.
     *
     * @return the canReRegister value.
     */
    public Boolean canReRegister() {
        return this.canReRegister;
    }

    /**
     * Set the canReRegister property: Specifies whether the container is re-registrable.
     *
     * @param canReRegister the canReRegister value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withCanReRegister(Boolean canReRegister) {
        this.canReRegister = canReRegister;
        return this;
    }

    /**
     * Get the containerId property: ID of container.
     *
     * @return the containerId value.
     */
    public String containerId() {
        return this.containerId;
    }

    /**
     * Set the containerId property: ID of container.
     *
     * @param containerId the containerId value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get the protectedItemCount property: Number of protected items in the BackupEngine.
     *
     * @return the protectedItemCount value.
     */
    public Long protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set the protectedItemCount property: Number of protected items in the BackupEngine.
     *
     * @param protectedItemCount the protectedItemCount value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withProtectedItemCount(Long protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /**
     * Get the dpmAgentVersion property: Backup engine Agent version.
     *
     * @return the dpmAgentVersion value.
     */
    public String dpmAgentVersion() {
        return this.dpmAgentVersion;
    }

    /**
     * Set the dpmAgentVersion property: Backup engine Agent version.
     *
     * @param dpmAgentVersion the dpmAgentVersion value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withDpmAgentVersion(String dpmAgentVersion) {
        this.dpmAgentVersion = dpmAgentVersion;
        return this;
    }

    /**
     * Get the dpmServers property: List of BackupEngines protecting the container.
     *
     * @return the dpmServers value.
     */
    public List<String> dpmServers() {
        return this.dpmServers;
    }

    /**
     * Set the dpmServers property: List of BackupEngines protecting the container.
     *
     * @param dpmServers the dpmServers value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withDpmServers(List<String> dpmServers) {
        this.dpmServers = dpmServers;
        return this;
    }

    /**
     * Get the upgradeAvailable property: To check if upgrade available.
     *
     * @return the upgradeAvailable value.
     */
    public Boolean upgradeAvailable() {
        return this.upgradeAvailable;
    }

    /**
     * Set the upgradeAvailable property: To check if upgrade available.
     *
     * @param upgradeAvailable the upgradeAvailable value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withUpgradeAvailable(Boolean upgradeAvailable) {
        this.upgradeAvailable = upgradeAvailable;
        return this;
    }

    /**
     * Get the protectionStatus property: Protection status of the container.
     *
     * @return the protectionStatus value.
     */
    public String protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Set the protectionStatus property: Protection status of the container.
     *
     * @param protectionStatus the protectionStatus value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withProtectionStatus(String protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * Get the extendedInfo property: Extended Info of the container.
     *
     * @return the extendedInfo value.
     */
    public DpmContainerExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Extended Info of the container.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the DpmContainer object itself.
     */
    public DpmContainer withExtendedInfo(DpmContainerExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmContainer withHealthStatus(String healthStatus) {
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
    }
}
