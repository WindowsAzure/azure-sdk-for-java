/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Hyper V replica provider specific settings base class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaBaseReplicationDetails")
public class HyperVReplicaBaseReplicationDetails extends ReplicationProviderSpecificSettings {
    /**
     * The Last replication time.
     */
    @JsonProperty(value = "lastReplicatedTime")
    private DateTime lastReplicatedTime;

    /**
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

    /**
     * The virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /**
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /**
     * Initial replication details.
     */
    @JsonProperty(value = "initialReplicationDetails")
    private InitialReplicationDetails initialReplicationDetails;

    /**
     * VM disk details.
     */
    @JsonProperty(value = "vMDiskDetails")
    private List<DiskDetails> vMDiskDetails;

    /**
     * Get the Last replication time.
     *
     * @return the lastReplicatedTime value
     */
    public DateTime lastReplicatedTime() {
        return this.lastReplicatedTime;
    }

    /**
     * Set the Last replication time.
     *
     * @param lastReplicatedTime the lastReplicatedTime value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withLastReplicatedTime(DateTime lastReplicatedTime) {
        this.lastReplicatedTime = lastReplicatedTime;
        return this;
    }

    /**
     * Get the PE Network details.
     *
     * @return the vmNics value
     */
    public List<VMNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the PE Network details.
     *
     * @param vmNics the vmNics value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the virtual machine Id.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the virtual machine Id.
     *
     * @param vmId the vmId value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the protection state for the vm.
     *
     * @return the vmProtectionState value
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get initial replication details.
     *
     * @return the initialReplicationDetails value
     */
    public InitialReplicationDetails initialReplicationDetails() {
        return this.initialReplicationDetails;
    }

    /**
     * Set initial replication details.
     *
     * @param initialReplicationDetails the initialReplicationDetails value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withInitialReplicationDetails(InitialReplicationDetails initialReplicationDetails) {
        this.initialReplicationDetails = initialReplicationDetails;
        return this;
    }

    /**
     * Get vM disk details.
     *
     * @return the vMDiskDetails value
     */
    public List<DiskDetails> vMDiskDetails() {
        return this.vMDiskDetails;
    }

    /**
     * Set vM disk details.
     *
     * @param vMDiskDetails the vMDiskDetails value to set
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVMDiskDetails(List<DiskDetails> vMDiskDetails) {
        this.vMDiskDetails = vMDiskDetails;
        return this;
    }

}
