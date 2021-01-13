// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InMageRcm NIC details. */
@Immutable
public final class InMageRcmNicDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageRcmNicDetails.class);

    /*
     * The NIC Id.
     */
    @JsonProperty(value = "nicId", access = JsonProperty.Access.WRITE_ONLY)
    private String nicId;

    /*
     * A value indicating whether this is the primary NIC.
     */
    @JsonProperty(value = "isPrimaryNic", access = JsonProperty.Access.WRITE_ONLY)
    private String isPrimaryNic;

    /*
     * A value indicating whether this NIC is selected for failover.
     */
    @JsonProperty(value = "isSelectedForFailover", access = JsonProperty.Access.WRITE_ONLY)
    private String isSelectedForFailover;

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
     * Source subnet name.
     */
    @JsonProperty(value = "sourceSubnetName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceSubnetName;

    /*
     * The target IP address.
     */
    @JsonProperty(value = "targetIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String targetIpAddress;

    /*
     * The target IP address type.
     */
    @JsonProperty(value = "targetIPAddressType", access = JsonProperty.Access.WRITE_ONLY)
    private EthernetAddressType targetIpAddressType;

    /*
     * Target subnet name.
     */
    @JsonProperty(value = "targetSubnetName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSubnetName;

    /*
     * Test subnet name.
     */
    @JsonProperty(value = "testSubnetName", access = JsonProperty.Access.WRITE_ONLY)
    private String testSubnetName;

    /*
     * The test IP address.
     */
    @JsonProperty(value = "testIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String testIpAddress;

    /*
     * The test IP address type.
     */
    @JsonProperty(value = "testIPAddressType", access = JsonProperty.Access.WRITE_ONLY)
    private EthernetAddressType testIpAddressType;

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
     * Get the isSelectedForFailover property: A value indicating whether this NIC is selected for failover.
     *
     * @return the isSelectedForFailover value.
     */
    public String isSelectedForFailover() {
        return this.isSelectedForFailover;
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
     * Get the sourceSubnetName property: Source subnet name.
     *
     * @return the sourceSubnetName value.
     */
    public String sourceSubnetName() {
        return this.sourceSubnetName;
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
     * Get the targetIpAddressType property: The target IP address type.
     *
     * @return the targetIpAddressType value.
     */
    public EthernetAddressType targetIpAddressType() {
        return this.targetIpAddressType;
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
     * Get the testSubnetName property: Test subnet name.
     *
     * @return the testSubnetName value.
     */
    public String testSubnetName() {
        return this.testSubnetName;
    }

    /**
     * Get the testIpAddress property: The test IP address.
     *
     * @return the testIpAddress value.
     */
    public String testIpAddress() {
        return this.testIpAddress;
    }

    /**
     * Get the testIpAddressType property: The test IP address type.
     *
     * @return the testIpAddressType value.
     */
    public EthernetAddressType testIpAddressType() {
        return this.testIpAddressType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
