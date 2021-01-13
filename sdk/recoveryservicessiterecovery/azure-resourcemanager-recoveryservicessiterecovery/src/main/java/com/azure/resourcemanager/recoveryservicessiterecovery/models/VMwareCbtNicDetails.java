// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VMwareCbt NIC details. */
@Fluent
public final class VMwareCbtNicDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMwareCbtNicDetails.class);

    /*
     * The NIC Id.
     */
    @JsonProperty(value = "nicId", access = JsonProperty.Access.WRITE_ONLY)
    private String nicId;

    /*
     * A value indicating whether this is the primary NIC.
     */
    @JsonProperty(value = "isPrimaryNic")
    private String isPrimaryNic;

    /*
     * The source IP address.
     */
    @JsonProperty(value = "sourceIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceIpAddress;

    /*
     * The source IP address type.
     */
    @JsonProperty(value = "sourceIPAddressType", access = JsonProperty.Access.WRITE_ONLY)
    private EthernetAddressType sourceIpAddressType;

    /*
     * Source network Id.
     */
    @JsonProperty(value = "sourceNetworkId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceNetworkId;

    /*
     * The target IP address.
     */
    @JsonProperty(value = "targetIPAddress")
    private String targetIpAddress;

    /*
     * The target IP address type.
     */
    @JsonProperty(value = "targetIPAddressType")
    private EthernetAddressType targetIpAddressType;

    /*
     * Target subnet name.
     */
    @JsonProperty(value = "targetSubnetName")
    private String targetSubnetName;

    /*
     * A value indicating whether this NIC is selected for migration.
     */
    @JsonProperty(value = "isSelectedForMigration")
    private String isSelectedForMigration;

    /**
     * Get the nicId property: The NIC Id.
     *
     * @return the nicId value.
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Get the isPrimaryNic property: A value indicating whether this is the primary NIC.
     *
     * @return the isPrimaryNic value.
     */
    public String isPrimaryNic() {
        return this.isPrimaryNic;
    }

    /**
     * Set the isPrimaryNic property: A value indicating whether this is the primary NIC.
     *
     * @param isPrimaryNic the isPrimaryNic value to set.
     * @return the VMwareCbtNicDetails object itself.
     */
    public VMwareCbtNicDetails withIsPrimaryNic(String isPrimaryNic) {
        this.isPrimaryNic = isPrimaryNic;
        return this;
    }

    /**
     * Get the sourceIpAddress property: The source IP address.
     *
     * @return the sourceIpAddress value.
     */
    public String sourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * Get the sourceIpAddressType property: The source IP address type.
     *
     * @return the sourceIpAddressType value.
     */
    public EthernetAddressType sourceIpAddressType() {
        return this.sourceIpAddressType;
    }

    /**
     * Get the sourceNetworkId property: Source network Id.
     *
     * @return the sourceNetworkId value.
     */
    public String sourceNetworkId() {
        return this.sourceNetworkId;
    }

    /**
     * Get the targetIpAddress property: The target IP address.
     *
     * @return the targetIpAddress value.
     */
    public String targetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * Set the targetIpAddress property: The target IP address.
     *
     * @param targetIpAddress the targetIpAddress value to set.
     * @return the VMwareCbtNicDetails object itself.
     */
    public VMwareCbtNicDetails withTargetIpAddress(String targetIpAddress) {
        this.targetIpAddress = targetIpAddress;
        return this;
    }

    /**
     * Get the targetIpAddressType property: The target IP address type.
     *
     * @return the targetIpAddressType value.
     */
    public EthernetAddressType targetIpAddressType() {
        return this.targetIpAddressType;
    }

    /**
     * Set the targetIpAddressType property: The target IP address type.
     *
     * @param targetIpAddressType the targetIpAddressType value to set.
     * @return the VMwareCbtNicDetails object itself.
     */
    public VMwareCbtNicDetails withTargetIpAddressType(EthernetAddressType targetIpAddressType) {
        this.targetIpAddressType = targetIpAddressType;
        return this;
    }

    /**
     * Get the targetSubnetName property: Target subnet name.
     *
     * @return the targetSubnetName value.
     */
    public String targetSubnetName() {
        return this.targetSubnetName;
    }

    /**
     * Set the targetSubnetName property: Target subnet name.
     *
     * @param targetSubnetName the targetSubnetName value to set.
     * @return the VMwareCbtNicDetails object itself.
     */
    public VMwareCbtNicDetails withTargetSubnetName(String targetSubnetName) {
        this.targetSubnetName = targetSubnetName;
        return this;
    }

    /**
     * Get the isSelectedForMigration property: A value indicating whether this NIC is selected for migration.
     *
     * @return the isSelectedForMigration value.
     */
    public String isSelectedForMigration() {
        return this.isSelectedForMigration;
    }

    /**
     * Set the isSelectedForMigration property: A value indicating whether this NIC is selected for migration.
     *
     * @param isSelectedForMigration the isSelectedForMigration value to set.
     * @return the VMwareCbtNicDetails object itself.
     */
    public VMwareCbtNicDetails withIsSelectedForMigration(String isSelectedForMigration) {
        this.isSelectedForMigration = isSelectedForMigration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
