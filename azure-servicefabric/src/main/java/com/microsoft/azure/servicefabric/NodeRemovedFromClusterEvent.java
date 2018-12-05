/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Node Removed event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeRemovedFromCluster")
public class NodeRemovedFromClusterEvent extends NodeEventInner {
    /**
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /**
     * Type of Node.
     */
    @JsonProperty(value = "NodeType", required = true)
    private String nodeType;

    /**
     * Fabric version.
     */
    @JsonProperty(value = "FabricVersion", required = true)
    private String fabricVersion;

    /**
     * IP address or FQDN.
     */
    @JsonProperty(value = "IpAddressOrFQDN", required = true)
    private String ipAddressOrFQDN;

    /**
     * Capacities.
     */
    @JsonProperty(value = "NodeCapacities", required = true)
    private String nodeCapacities;

    /**
     * Get id of Node.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set id of Node.
     *
     * @param nodeId the nodeId value to set
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get id of Node instance.
     *
     * @return the nodeInstance value
     */
    public long nodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set id of Node instance.
     *
     * @param nodeInstance the nodeInstance value to set
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent withNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get type of Node.
     *
     * @return the nodeType value
     */
    public String nodeType() {
        return this.nodeType;
    }

    /**
     * Set type of Node.
     *
     * @param nodeType the nodeType value to set
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * Get fabric version.
     *
     * @return the fabricVersion value
     */
    public String fabricVersion() {
        return this.fabricVersion;
    }

    /**
     * Set fabric version.
     *
     * @param fabricVersion the fabricVersion value to set
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent withFabricVersion(String fabricVersion) {
        this.fabricVersion = fabricVersion;
        return this;
    }

    /**
     * Get iP address or FQDN.
     *
     * @return the ipAddressOrFQDN value
     */
    public String ipAddressOrFQDN() {
        return this.ipAddressOrFQDN;
    }

    /**
     * Set iP address or FQDN.
     *
     * @param ipAddressOrFQDN the ipAddressOrFQDN value to set
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent withIpAddressOrFQDN(String ipAddressOrFQDN) {
        this.ipAddressOrFQDN = ipAddressOrFQDN;
        return this;
    }

    /**
     * Get capacities.
     *
     * @return the nodeCapacities value
     */
    public String nodeCapacities() {
        return this.nodeCapacities;
    }

    /**
     * Set capacities.
     *
     * @param nodeCapacities the nodeCapacities value to set
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent withNodeCapacities(String nodeCapacities) {
        this.nodeCapacities = nodeCapacities;
        return this;
    }

}
