/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * PrivateLinkServiceConnection resource.
 */
@JsonFlatten
public class PrivateLinkServiceConnection extends SubResource {
    /**
     * The resource id of private link service.
     */
    @JsonProperty(value = "properties.privateLinkServiceId")
    private String privateLinkServiceId;

    /**
     * The ID(s) of the group(s) obtained from the remote resource that this
     * private endpoint should connect to.
     */
    @JsonProperty(value = "properties.groupIds")
    private List<String> groupIds;

    /**
     * A message passed to the owner of the remote resource with this
     * connection request. Restricted to 140 chars.
     */
    @JsonProperty(value = "properties.requestMessage")
    private String requestMessage;

    /**
     * A collection of read-only information about the state of the connection
     * to the remote resource.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the resource id of private link service.
     *
     * @return the privateLinkServiceId value
     */
    public String privateLinkServiceId() {
        return this.privateLinkServiceId;
    }

    /**
     * Set the resource id of private link service.
     *
     * @param privateLinkServiceId the privateLinkServiceId value to set
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withPrivateLinkServiceId(String privateLinkServiceId) {
        this.privateLinkServiceId = privateLinkServiceId;
        return this;
    }

    /**
     * Get the ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to.
     *
     * @return the groupIds value
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to.
     *
     * @param groupIds the groupIds value to set
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Get a message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     *
     * @return the requestMessage value
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    /**
     * Set a message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     *
     * @param requestMessage the requestMessage value to set
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
        return this;
    }

    /**
     * Get a collection of read-only information about the state of the connection to the remote resource.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set a collection of read-only information about the state of the connection to the remote resource.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withName(String name) {
        this.name = name;
        return this;
    }

}
