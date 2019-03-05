/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hyper V VM network details.
 */
public class VMNicDetails {
    /**
     * The nic Id.
     */
    @JsonProperty(value = "nicId")
    private String nicId;

    /**
     * The replica nic Id.
     */
    @JsonProperty(value = "replicaNicId")
    private String replicaNicId;

    /**
     * The source nic ARM Id.
     */
    @JsonProperty(value = "sourceNicArmId")
    private String sourceNicArmId;

    /**
     * VM subnet name.
     */
    @JsonProperty(value = "vMSubnetName")
    private String vMSubnetName;

    /**
     * VM network name.
     */
    @JsonProperty(value = "vMNetworkName")
    private String vMNetworkName;

    /**
     * Recovery VM network Id.
     */
    @JsonProperty(value = "recoveryVMNetworkId")
    private String recoveryVMNetworkId;

    /**
     * Recovery VM subnet name.
     */
    @JsonProperty(value = "recoveryVMSubnetName")
    private String recoveryVMSubnetName;

    /**
     * Ip address type.
     */
    @JsonProperty(value = "ipAddressType")
    private String ipAddressType;

    /**
     * Primary nic static IP address.
     */
    @JsonProperty(value = "primaryNicStaticIPAddress")
    private String primaryNicStaticIPAddress;

    /**
     * Replica nic static IP address.
     */
    @JsonProperty(value = "replicaNicStaticIPAddress")
    private String replicaNicStaticIPAddress;

    /**
     * Selection type for failover.
     */
    @JsonProperty(value = "selectionType")
    private String selectionType;

    /**
     * IP allocation type for recovery VM.
     */
    @JsonProperty(value = "recoveryNicIpAddressType")
    private String recoveryNicIpAddressType;

    /**
     * Get the nic Id.
     *
     * @return the nicId value
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Set the nic Id.
     *
     * @param nicId the nicId value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * Get the replica nic Id.
     *
     * @return the replicaNicId value
     */
    public String replicaNicId() {
        return this.replicaNicId;
    }

    /**
     * Set the replica nic Id.
     *
     * @param replicaNicId the replicaNicId value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withReplicaNicId(String replicaNicId) {
        this.replicaNicId = replicaNicId;
        return this;
    }

    /**
     * Get the source nic ARM Id.
     *
     * @return the sourceNicArmId value
     */
    public String sourceNicArmId() {
        return this.sourceNicArmId;
    }

    /**
     * Set the source nic ARM Id.
     *
     * @param sourceNicArmId the sourceNicArmId value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withSourceNicArmId(String sourceNicArmId) {
        this.sourceNicArmId = sourceNicArmId;
        return this;
    }

    /**
     * Get vM subnet name.
     *
     * @return the vMSubnetName value
     */
    public String vMSubnetName() {
        return this.vMSubnetName;
    }

    /**
     * Set vM subnet name.
     *
     * @param vMSubnetName the vMSubnetName value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withVMSubnetName(String vMSubnetName) {
        this.vMSubnetName = vMSubnetName;
        return this;
    }

    /**
     * Get vM network name.
     *
     * @return the vMNetworkName value
     */
    public String vMNetworkName() {
        return this.vMNetworkName;
    }

    /**
     * Set vM network name.
     *
     * @param vMNetworkName the vMNetworkName value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withVMNetworkName(String vMNetworkName) {
        this.vMNetworkName = vMNetworkName;
        return this;
    }

    /**
     * Get recovery VM network Id.
     *
     * @return the recoveryVMNetworkId value
     */
    public String recoveryVMNetworkId() {
        return this.recoveryVMNetworkId;
    }

    /**
     * Set recovery VM network Id.
     *
     * @param recoveryVMNetworkId the recoveryVMNetworkId value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withRecoveryVMNetworkId(String recoveryVMNetworkId) {
        this.recoveryVMNetworkId = recoveryVMNetworkId;
        return this;
    }

    /**
     * Get recovery VM subnet name.
     *
     * @return the recoveryVMSubnetName value
     */
    public String recoveryVMSubnetName() {
        return this.recoveryVMSubnetName;
    }

    /**
     * Set recovery VM subnet name.
     *
     * @param recoveryVMSubnetName the recoveryVMSubnetName value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withRecoveryVMSubnetName(String recoveryVMSubnetName) {
        this.recoveryVMSubnetName = recoveryVMSubnetName;
        return this;
    }

    /**
     * Get ip address type.
     *
     * @return the ipAddressType value
     */
    public String ipAddressType() {
        return this.ipAddressType;
    }

    /**
     * Set ip address type.
     *
     * @param ipAddressType the ipAddressType value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
        return this;
    }

    /**
     * Get primary nic static IP address.
     *
     * @return the primaryNicStaticIPAddress value
     */
    public String primaryNicStaticIPAddress() {
        return this.primaryNicStaticIPAddress;
    }

    /**
     * Set primary nic static IP address.
     *
     * @param primaryNicStaticIPAddress the primaryNicStaticIPAddress value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withPrimaryNicStaticIPAddress(String primaryNicStaticIPAddress) {
        this.primaryNicStaticIPAddress = primaryNicStaticIPAddress;
        return this;
    }

    /**
     * Get replica nic static IP address.
     *
     * @return the replicaNicStaticIPAddress value
     */
    public String replicaNicStaticIPAddress() {
        return this.replicaNicStaticIPAddress;
    }

    /**
     * Set replica nic static IP address.
     *
     * @param replicaNicStaticIPAddress the replicaNicStaticIPAddress value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withReplicaNicStaticIPAddress(String replicaNicStaticIPAddress) {
        this.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
        return this;
    }

    /**
     * Get selection type for failover.
     *
     * @return the selectionType value
     */
    public String selectionType() {
        return this.selectionType;
    }

    /**
     * Set selection type for failover.
     *
     * @param selectionType the selectionType value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withSelectionType(String selectionType) {
        this.selectionType = selectionType;
        return this;
    }

    /**
     * Get iP allocation type for recovery VM.
     *
     * @return the recoveryNicIpAddressType value
     */
    public String recoveryNicIpAddressType() {
        return this.recoveryNicIpAddressType;
    }

    /**
     * Set iP allocation type for recovery VM.
     *
     * @param recoveryNicIpAddressType the recoveryNicIpAddressType value to set
     * @return the VMNicDetails object itself.
     */
    public VMNicDetails withRecoveryNicIpAddressType(String recoveryNicIpAddressType) {
        this.recoveryNicIpAddressType = recoveryNicIpAddressType;
        return this;
    }

}
