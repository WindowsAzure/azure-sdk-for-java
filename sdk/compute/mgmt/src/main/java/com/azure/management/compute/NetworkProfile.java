// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkProfile model. */
@Fluent
public final class NetworkProfile {
    /*
     * Specifies the list of resource Ids for the network interfaces associated
     * with the virtual machine.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<NetworkInterfaceReference> networkInterfaces;

    /**
     * Get the networkInterfaces property: Specifies the list of resource Ids for the network interfaces associated with
     * the virtual machine.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceReference> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: Specifies the list of resource Ids for the network interfaces associated with
     * the virtual machine.
     *
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withNetworkInterfaces(List<NetworkInterfaceReference> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
}
