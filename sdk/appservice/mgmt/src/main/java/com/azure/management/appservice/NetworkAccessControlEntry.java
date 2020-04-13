// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NetworkAccessControlEntry model. */
@Fluent
public final class NetworkAccessControlEntry {
    /*
     * Action object.
     */
    @JsonProperty(value = "action")
    private AccessControlEntryAction action;

    /*
     * Description of network access control entry.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Order of precedence.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * Remote subnet.
     */
    @JsonProperty(value = "remoteSubnet")
    private String remoteSubnet;

    /**
     * Get the action property: Action object.
     *
     * @return the action value.
     */
    public AccessControlEntryAction action() {
        return this.action;
    }

    /**
     * Set the action property: Action object.
     *
     * @param action the action value to set.
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withAction(AccessControlEntryAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the description property: Description of network access control entry.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of network access control entry.
     *
     * @param description the description value to set.
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the order property: Order of precedence.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: Order of precedence.
     *
     * @param order the order value to set.
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the remoteSubnet property: Remote subnet.
     *
     * @return the remoteSubnet value.
     */
    public String remoteSubnet() {
        return this.remoteSubnet;
    }

    /**
     * Set the remoteSubnet property: Remote subnet.
     *
     * @param remoteSubnet the remoteSubnet value to set.
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
}
