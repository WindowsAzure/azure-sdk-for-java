/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Properties.
 */
public class NetworkProperties {
    /**
     * The Fabric Type.
     */
    @JsonProperty(value = "fabricType")
    private String fabricType;

    /**
     * The List of subnets.
     */
    @JsonProperty(value = "subnets")
    private List<Subnet> subnets;

    /**
     * The Friendly Name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The Network Type.
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /**
     * Get the Fabric Type.
     *
     * @return the fabricType value
     */
    public String fabricType() {
        return this.fabricType;
    }

    /**
     * Set the Fabric Type.
     *
     * @param fabricType the fabricType value to set
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withFabricType(String fabricType) {
        this.fabricType = fabricType;
        return this;
    }

    /**
     * Get the List of subnets.
     *
     * @return the subnets value
     */
    public List<Subnet> subnets() {
        return this.subnets;
    }

    /**
     * Set the List of subnets.
     *
     * @param subnets the subnets value to set
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Get the Friendly Name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the Friendly Name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the Network Type.
     *
     * @return the networkType value
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the Network Type.
     *
     * @param networkType the networkType value to set
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

}
