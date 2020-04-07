// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.DhGroup;
import com.azure.management.network.IkeEncryption;
import com.azure.management.network.IkeIntegrity;
import com.azure.management.network.IpsecEncryption;
import com.azure.management.network.IpsecIntegrity;
import com.azure.management.network.PfsGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpnClientIPsecParameters model.
 */
@Fluent
public final class VpnClientIPsecParametersInner {
    /*
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for P2S client.
     */
    @JsonProperty(value = "saLifeTimeSeconds", required = true)
    private int saLifeTimeSeconds;

    /*
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for P2S client..
     */
    @JsonProperty(value = "saDataSizeKilobytes", required = true)
    private int saDataSizeKilobytes;

    /*
     * The IPSec encryption algorithm (IKE phase 1).
     */
    @JsonProperty(value = "ipsecEncryption", required = true)
    private IpsecEncryption ipsecEncryption;

    /*
     * The IPSec integrity algorithm (IKE phase 1).
     */
    @JsonProperty(value = "ipsecIntegrity", required = true)
    private IpsecIntegrity ipsecIntegrity;

    /*
     * The IKE encryption algorithm (IKE phase 2).
     */
    @JsonProperty(value = "ikeEncryption", required = true)
    private IkeEncryption ikeEncryption;

    /*
     * The IKE integrity algorithm (IKE phase 2).
     */
    @JsonProperty(value = "ikeIntegrity", required = true)
    private IkeIntegrity ikeIntegrity;

    /*
     * The DH Groups used in IKE Phase 1 for initial SA.
     */
    @JsonProperty(value = "dhGroup", required = true)
    private DhGroup dhGroup;

    /*
     * The Pfs Groups used in IKE Phase 2 for new child SA.
     */
    @JsonProperty(value = "pfsGroup", required = true)
    private PfsGroup pfsGroup;

    /**
     * Get the saLifeTimeSeconds property: The IPSec Security Association (also
     * called Quick Mode or Phase 2 SA) lifetime in seconds for P2S client.
     * 
     * @return the saLifeTimeSeconds value.
     */
    public int saLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    /**
     * Set the saLifeTimeSeconds property: The IPSec Security Association (also
     * called Quick Mode or Phase 2 SA) lifetime in seconds for P2S client.
     * 
     * @param saLifeTimeSeconds the saLifeTimeSeconds value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withSaLifeTimeSeconds(int saLifeTimeSeconds) {
        this.saLifeTimeSeconds = saLifeTimeSeconds;
        return this;
    }

    /**
     * Get the saDataSizeKilobytes property: The IPSec Security Association
     * (also called Quick Mode or Phase 2 SA) payload size in KB for P2S
     * client..
     * 
     * @return the saDataSizeKilobytes value.
     */
    public int saDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * Set the saDataSizeKilobytes property: The IPSec Security Association
     * (also called Quick Mode or Phase 2 SA) payload size in KB for P2S
     * client..
     * 
     * @param saDataSizeKilobytes the saDataSizeKilobytes value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withSaDataSizeKilobytes(int saDataSizeKilobytes) {
        this.saDataSizeKilobytes = saDataSizeKilobytes;
        return this;
    }

    /**
     * Get the ipsecEncryption property: The IPSec encryption algorithm (IKE
     * phase 1).
     * 
     * @return the ipsecEncryption value.
     */
    public IpsecEncryption ipsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * Set the ipsecEncryption property: The IPSec encryption algorithm (IKE
     * phase 1).
     * 
     * @param ipsecEncryption the ipsecEncryption value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withIpsecEncryption(IpsecEncryption ipsecEncryption) {
        this.ipsecEncryption = ipsecEncryption;
        return this;
    }

    /**
     * Get the ipsecIntegrity property: The IPSec integrity algorithm (IKE
     * phase 1).
     * 
     * @return the ipsecIntegrity value.
     */
    public IpsecIntegrity ipsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * Set the ipsecIntegrity property: The IPSec integrity algorithm (IKE
     * phase 1).
     * 
     * @param ipsecIntegrity the ipsecIntegrity value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withIpsecIntegrity(IpsecIntegrity ipsecIntegrity) {
        this.ipsecIntegrity = ipsecIntegrity;
        return this;
    }

    /**
     * Get the ikeEncryption property: The IKE encryption algorithm (IKE phase
     * 2).
     * 
     * @return the ikeEncryption value.
     */
    public IkeEncryption ikeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * Set the ikeEncryption property: The IKE encryption algorithm (IKE phase
     * 2).
     * 
     * @param ikeEncryption the ikeEncryption value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withIkeEncryption(IkeEncryption ikeEncryption) {
        this.ikeEncryption = ikeEncryption;
        return this;
    }

    /**
     * Get the ikeIntegrity property: The IKE integrity algorithm (IKE phase
     * 2).
     * 
     * @return the ikeIntegrity value.
     */
    public IkeIntegrity ikeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * Set the ikeIntegrity property: The IKE integrity algorithm (IKE phase
     * 2).
     * 
     * @param ikeIntegrity the ikeIntegrity value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withIkeIntegrity(IkeIntegrity ikeIntegrity) {
        this.ikeIntegrity = ikeIntegrity;
        return this;
    }

    /**
     * Get the dhGroup property: The DH Groups used in IKE Phase 1 for initial
     * SA.
     * 
     * @return the dhGroup value.
     */
    public DhGroup dhGroup() {
        return this.dhGroup;
    }

    /**
     * Set the dhGroup property: The DH Groups used in IKE Phase 1 for initial
     * SA.
     * 
     * @param dhGroup the dhGroup value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withDhGroup(DhGroup dhGroup) {
        this.dhGroup = dhGroup;
        return this;
    }

    /**
     * Get the pfsGroup property: The Pfs Groups used in IKE Phase 2 for new
     * child SA.
     * 
     * @return the pfsGroup value.
     */
    public PfsGroup pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * Set the pfsGroup property: The Pfs Groups used in IKE Phase 2 for new
     * child SA.
     * 
     * @param pfsGroup the pfsGroup value to set.
     * @return the VpnClientIPsecParametersInner object itself.
     */
    public VpnClientIPsecParametersInner withPfsGroup(PfsGroup pfsGroup) {
        this.pfsGroup = pfsGroup;
        return this;
    }
}
