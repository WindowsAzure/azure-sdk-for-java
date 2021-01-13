// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** InMageRcm provider specific details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Immutable
public final class InMageRcmReplicationDetails extends ReplicationProviderSpecificSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageRcmReplicationDetails.class);

    /*
     * The virtual machine internal identifier.
     */
    @JsonProperty(value = "internalIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String internalIdentifier;

    /*
     * The ARM Id of the discovered VM.
     */
    @JsonProperty(value = "fabricDiscoveryMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String fabricDiscoveryMachineId;

    /*
     * The multi VM group name.
     */
    @JsonProperty(value = "multiVmGroupName", access = JsonProperty.Access.WRITE_ONLY)
    private String multiVmGroupName;

    /*
     * The type of the discovered VM.
     */
    @JsonProperty(value = "discoveryType", access = JsonProperty.Access.WRITE_ONLY)
    private String discoveryType;

    /*
     * The process server Id.
     */
    @JsonProperty(value = "processServerId", access = JsonProperty.Access.WRITE_ONLY)
    private String processServerId;

    /*
     * The processor core count.
     */
    @JsonProperty(value = "processorCoreCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer processorCoreCount;

    /*
     * The allocated memory in MB.
     */
    @JsonProperty(value = "allocatedMemoryInMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double allocatedMemoryInMB;

    /*
     * The process server name.
     */
    @JsonProperty(value = "processServerName", access = JsonProperty.Access.WRITE_ONLY)
    private String processServerName;

    /*
     * The run-as account Id.
     */
    @JsonProperty(value = "runAsAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String runAsAccountId;

    /*
     * The type of the OS on the VM.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /*
     * The firmware type.
     */
    @JsonProperty(value = "firmwareType", access = JsonProperty.Access.WRITE_ONLY)
    private String firmwareType;

    /*
     * The target generation.
     */
    @JsonProperty(value = "targetGeneration", access = JsonProperty.Access.WRITE_ONLY)
    private String targetGeneration;

    /*
     * License Type of the VM to be used.
     */
    @JsonProperty(value = "licenseType", access = JsonProperty.Access.WRITE_ONLY)
    private String licenseType;

    /*
     * Target VM name.
     */
    @JsonProperty(value = "targetVmName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetVmName;

    /*
     * The target VM size.
     */
    @JsonProperty(value = "targetVmSize", access = JsonProperty.Access.WRITE_ONLY)
    private String targetVmSize;

    /*
     * The target resource group Id.
     */
    @JsonProperty(value = "targetResourceGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceGroupId;

    /*
     * The target availability set Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetAvailabilitySetId;

    /*
     * The target availability zone.
     */
    @JsonProperty(value = "targetAvailabilityZone", access = JsonProperty.Access.WRITE_ONLY)
    private String targetAvailabilityZone;

    /*
     * The target proximity placement group Id.
     */
    @JsonProperty(value = "targetProximityPlacementGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetProximityPlacementGroupId;

    /*
     * The target boot diagnostics storage account ARM Id.
     */
    @JsonProperty(value = "targetBootDiagnosticsStorageAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetBootDiagnosticsStorageAccountId;

    /*
     * The target network Id.
     */
    @JsonProperty(value = "targetNetworkId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetNetworkId;

    /*
     * The test network Id.
     */
    @JsonProperty(value = "testNetworkId", access = JsonProperty.Access.WRITE_ONLY)
    private String testNetworkId;

    /*
     * The recovery point Id to which the VM was failed over.
     */
    @JsonProperty(value = "failoverRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String failoverRecoveryPointId;

    /*
     * The last recovery point received time.
     */
    @JsonProperty(value = "lastRecoveryPointReceived", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRecoveryPointReceived;

    /*
     * The last recovery point objective value.
     */
    @JsonProperty(value = "lastRpoInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Long lastRpoInSeconds;

    /*
     * The last recovery point objective calculated time.
     */
    @JsonProperty(value = "lastRpoCalculatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRpoCalculatedTime;

    /*
     * The last recovery point Id.
     */
    @JsonProperty(value = "lastRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String lastRecoveryPointId;

    /*
     * The initial replication progress percentage. This is calculated based on
     * total bytes processed for all disks in the source VM.
     */
    @JsonProperty(value = "initialReplicationProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer initialReplicationProgressPercentage;

    /*
     * The initial replication processed bytes. This includes sum of total
     * bytes transferred and matched bytes on all selected disks in source VM.
     */
    @JsonProperty(value = "initialReplicationProcessedBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long initialReplicationProcessedBytes;

    /*
     * The initial replication transferred bytes from source VM to azure for
     * all selected disks on source VM.
     */
    @JsonProperty(value = "initialReplicationTransferredBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long initialReplicationTransferredBytes;

    /*
     * The resync progress percentage. This is calculated based on total bytes
     * processed for all disks in the source VM.
     */
    @JsonProperty(value = "resyncProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer resyncProgressPercentage;

    /*
     * The resync processed bytes. This includes sum of total bytes transferred
     * and matched bytes on all selected disks in source VM.
     */
    @JsonProperty(value = "resyncProcessedBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long resyncProcessedBytes;

    /*
     * The resync transferred bytes from source VM to azure for all selected
     * disks on source VM.
     */
    @JsonProperty(value = "resyncTransferredBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long resyncTransferredBytes;

    /*
     * A value indicating whether resync is required.
     */
    @JsonProperty(value = "resyncRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String resyncRequired;

    /*
     * The resync state.
     */
    @JsonProperty(value = "resyncState", access = JsonProperty.Access.WRITE_ONLY)
    private ResyncState resyncState;

    /*
     * The agent auto upgrade state.
     */
    @JsonProperty(value = "agentUpgradeState", access = JsonProperty.Access.WRITE_ONLY)
    private MobilityAgentUpgradeState agentUpgradeState;

    /*
     * The last agent upgrade type.
     */
    @JsonProperty(value = "lastAgentUpgradeType", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAgentUpgradeType;

    /*
     * The last agent upgrade failed or cancelled job Id.
     */
    @JsonProperty(value = "lastAgentUpgradeFailedJobId", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAgentUpgradeFailedJobId;

    /*
     * The list of protected disks.
     */
    @JsonProperty(value = "protectedDisks", access = JsonProperty.Access.WRITE_ONLY)
    private List<InMageRcmProtectedDiskDetails> protectedDisks;

    /*
     * A value indicating whether last agent upgrade was successful or not.
     */
    @JsonProperty(value = "isLastUpgradeSuccessful", access = JsonProperty.Access.WRITE_ONLY)
    private String isLastUpgradeSuccessful;

    /*
     * The mobility agent information.
     */
    @JsonProperty(value = "mobilityAgentDetails", access = JsonProperty.Access.WRITE_ONLY)
    private InMageRcmMobilityAgentDetails mobilityAgentDetails;

    /*
     * The last agent upgrade error information.
     */
    @JsonProperty(value = "lastAgentUpgradeErrorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<InMageRcmLastAgentUpgradeErrorDetails> lastAgentUpgradeErrorDetails;

    /*
     * The agent upgrade blocking error information.
     */
    @JsonProperty(value = "agentUpgradeBlockingErrorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<InMageRcmAgentUpgradeBlockingErrorDetails> agentUpgradeBlockingErrorDetails;

    /*
     * The network details.
     */
    @JsonProperty(value = "vmNics", access = JsonProperty.Access.WRITE_ONLY)
    private List<InMageRcmNicDetails> vmNics;

    /**
     * Get the internalIdentifier property: The virtual machine internal identifier.
     *
     * @return the internalIdentifier value.
     */
    public String internalIdentifier() {
        return this.internalIdentifier;
    }

    /**
     * Get the fabricDiscoveryMachineId property: The ARM Id of the discovered VM.
     *
     * @return the fabricDiscoveryMachineId value.
     */
    public String fabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId;
    }

    /**
     * Get the multiVmGroupName property: The multi VM group name.
     *
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Get the discoveryType property: The type of the discovered VM.
     *
     * @return the discoveryType value.
     */
    public String discoveryType() {
        return this.discoveryType;
    }

    /**
     * Get the processServerId property: The process server Id.
     *
     * @return the processServerId value.
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Get the processorCoreCount property: The processor core count.
     *
     * @return the processorCoreCount value.
     */
    public Integer processorCoreCount() {
        return this.processorCoreCount;
    }

    /**
     * Get the allocatedMemoryInMB property: The allocated memory in MB.
     *
     * @return the allocatedMemoryInMB value.
     */
    public Double allocatedMemoryInMB() {
        return this.allocatedMemoryInMB;
    }

    /**
     * Get the processServerName property: The process server name.
     *
     * @return the processServerName value.
     */
    public String processServerName() {
        return this.processServerName;
    }

    /**
     * Get the runAsAccountId property: The run-as account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Get the osType property: The type of the OS on the VM.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get the firmwareType property: The firmware type.
     *
     * @return the firmwareType value.
     */
    public String firmwareType() {
        return this.firmwareType;
    }

    /**
     * Get the targetGeneration property: The target generation.
     *
     * @return the targetGeneration value.
     */
    public String targetGeneration() {
        return this.targetGeneration;
    }

    /**
     * Get the licenseType property: License Type of the VM to be used.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Get the targetVmName property: Target VM name.
     *
     * @return the targetVmName value.
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Get the targetVmSize property: The target VM size.
     *
     * @return the targetVmSize value.
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Get the targetResourceGroupId property: The target resource group Id.
     *
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Get the targetAvailabilitySetId property: The target availability set Id.
     *
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Get the targetAvailabilityZone property: The target availability zone.
     *
     * @return the targetAvailabilityZone value.
     */
    public String targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Get the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @return the targetProximityPlacementGroupId value.
     */
    public String targetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * Get the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @return the targetBootDiagnosticsStorageAccountId value.
     */
    public String targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * Get the targetNetworkId property: The target network Id.
     *
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Get the testNetworkId property: The test network Id.
     *
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Get the failoverRecoveryPointId property: The recovery point Id to which the VM was failed over.
     *
     * @return the failoverRecoveryPointId value.
     */
    public String failoverRecoveryPointId() {
        return this.failoverRecoveryPointId;
    }

    /**
     * Get the lastRecoveryPointReceived property: The last recovery point received time.
     *
     * @return the lastRecoveryPointReceived value.
     */
    public OffsetDateTime lastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }

    /**
     * Get the lastRpoInSeconds property: The last recovery point objective value.
     *
     * @return the lastRpoInSeconds value.
     */
    public Long lastRpoInSeconds() {
        return this.lastRpoInSeconds;
    }

    /**
     * Get the lastRpoCalculatedTime property: The last recovery point objective calculated time.
     *
     * @return the lastRpoCalculatedTime value.
     */
    public OffsetDateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Get the lastRecoveryPointId property: The last recovery point Id.
     *
     * @return the lastRecoveryPointId value.
     */
    public String lastRecoveryPointId() {
        return this.lastRecoveryPointId;
    }

    /**
     * Get the initialReplicationProgressPercentage property: The initial replication progress percentage. This is
     * calculated based on total bytes processed for all disks in the source VM.
     *
     * @return the initialReplicationProgressPercentage value.
     */
    public Integer initialReplicationProgressPercentage() {
        return this.initialReplicationProgressPercentage;
    }

    /**
     * Get the initialReplicationProcessedBytes property: The initial replication processed bytes. This includes sum of
     * total bytes transferred and matched bytes on all selected disks in source VM.
     *
     * @return the initialReplicationProcessedBytes value.
     */
    public Long initialReplicationProcessedBytes() {
        return this.initialReplicationProcessedBytes;
    }

    /**
     * Get the initialReplicationTransferredBytes property: The initial replication transferred bytes from source VM to
     * azure for all selected disks on source VM.
     *
     * @return the initialReplicationTransferredBytes value.
     */
    public Long initialReplicationTransferredBytes() {
        return this.initialReplicationTransferredBytes;
    }

    /**
     * Get the resyncProgressPercentage property: The resync progress percentage. This is calculated based on total
     * bytes processed for all disks in the source VM.
     *
     * @return the resyncProgressPercentage value.
     */
    public Integer resyncProgressPercentage() {
        return this.resyncProgressPercentage;
    }

    /**
     * Get the resyncProcessedBytes property: The resync processed bytes. This includes sum of total bytes transferred
     * and matched bytes on all selected disks in source VM.
     *
     * @return the resyncProcessedBytes value.
     */
    public Long resyncProcessedBytes() {
        return this.resyncProcessedBytes;
    }

    /**
     * Get the resyncTransferredBytes property: The resync transferred bytes from source VM to azure for all selected
     * disks on source VM.
     *
     * @return the resyncTransferredBytes value.
     */
    public Long resyncTransferredBytes() {
        return this.resyncTransferredBytes;
    }

    /**
     * Get the resyncRequired property: A value indicating whether resync is required.
     *
     * @return the resyncRequired value.
     */
    public String resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Get the resyncState property: The resync state.
     *
     * @return the resyncState value.
     */
    public ResyncState resyncState() {
        return this.resyncState;
    }

    /**
     * Get the agentUpgradeState property: The agent auto upgrade state.
     *
     * @return the agentUpgradeState value.
     */
    public MobilityAgentUpgradeState agentUpgradeState() {
        return this.agentUpgradeState;
    }

    /**
     * Get the lastAgentUpgradeType property: The last agent upgrade type.
     *
     * @return the lastAgentUpgradeType value.
     */
    public String lastAgentUpgradeType() {
        return this.lastAgentUpgradeType;
    }

    /**
     * Get the lastAgentUpgradeFailedJobId property: The last agent upgrade failed or cancelled job Id.
     *
     * @return the lastAgentUpgradeFailedJobId value.
     */
    public String lastAgentUpgradeFailedJobId() {
        return this.lastAgentUpgradeFailedJobId;
    }

    /**
     * Get the protectedDisks property: The list of protected disks.
     *
     * @return the protectedDisks value.
     */
    public List<InMageRcmProtectedDiskDetails> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Get the isLastUpgradeSuccessful property: A value indicating whether last agent upgrade was successful or not.
     *
     * @return the isLastUpgradeSuccessful value.
     */
    public String isLastUpgradeSuccessful() {
        return this.isLastUpgradeSuccessful;
    }

    /**
     * Get the mobilityAgentDetails property: The mobility agent information.
     *
     * @return the mobilityAgentDetails value.
     */
    public InMageRcmMobilityAgentDetails mobilityAgentDetails() {
        return this.mobilityAgentDetails;
    }

    /**
     * Get the lastAgentUpgradeErrorDetails property: The last agent upgrade error information.
     *
     * @return the lastAgentUpgradeErrorDetails value.
     */
    public List<InMageRcmLastAgentUpgradeErrorDetails> lastAgentUpgradeErrorDetails() {
        return this.lastAgentUpgradeErrorDetails;
    }

    /**
     * Get the agentUpgradeBlockingErrorDetails property: The agent upgrade blocking error information.
     *
     * @return the agentUpgradeBlockingErrorDetails value.
     */
    public List<InMageRcmAgentUpgradeBlockingErrorDetails> agentUpgradeBlockingErrorDetails() {
        return this.agentUpgradeBlockingErrorDetails;
    }

    /**
     * Get the vmNics property: The network details.
     *
     * @return the vmNics value.
     */
    public List<InMageRcmNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (protectedDisks() != null) {
            protectedDisks().forEach(e -> e.validate());
        }
        if (mobilityAgentDetails() != null) {
            mobilityAgentDetails().validate();
        }
        if (lastAgentUpgradeErrorDetails() != null) {
            lastAgentUpgradeErrorDetails().forEach(e -> e.validate());
        }
        if (agentUpgradeBlockingErrorDetails() != null) {
            agentUpgradeBlockingErrorDetails().forEach(e -> e.validate());
        }
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
    }
}
