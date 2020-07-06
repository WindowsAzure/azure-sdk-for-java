/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_05_01.LoadBalancerOutboundRuleProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Outbound rule of the load balancer.
 */
@JsonFlatten
public class OutboundRuleInner extends SubResource {
    /**
     * The number of outbound ports to be used for NAT.
     */
    @JsonProperty(value = "properties.allocatedOutboundPorts")
    private Integer allocatedOutboundPorts;

    /**
     * The Frontend IP addresses of the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations", required = true)
    private List<SubResource> frontendIPConfigurations;

    /**
     * A reference to a pool of DIPs. Outbound traffic is randomly load
     * balanced across IPs in the backend IPs.
     */
    @JsonProperty(value = "properties.backendAddressPool", required = true)
    private SubResource backendAddressPool;

    /**
     * The provisioning state of the outbound rule resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The protocol for the outbound rule in load balancer. Possible values
     * include: 'Tcp', 'Udp', 'All'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private LoadBalancerOutboundRuleProtocol protocol;

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /**
     * The timeout for the TCP idle connection.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * The name of the resource that is unique within the set of outbound rules
     * used by the load balancer. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the number of outbound ports to be used for NAT.
     *
     * @return the allocatedOutboundPorts value
     */
    public Integer allocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set the number of outbound ports to be used for NAT.
     *
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        return this;
    }

    /**
     * Get the Frontend IP addresses of the load balancer.
     *
     * @return the frontendIPConfigurations value
     */
    public List<SubResource> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set the Frontend IP addresses of the load balancer.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withFrontendIPConfigurations(List<SubResource> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
        return this;
    }

    /**
     * Get a reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set a reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the provisioning state of the outbound rule resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the protocol for the outbound rule in load balancer. Possible values include: 'Tcp', 'Udp', 'All'.
     *
     * @return the protocol value
     */
    public LoadBalancerOutboundRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol for the outbound rule in load balancer. Possible values include: 'Tcp', 'Udp', 'All'.
     *
     * @param protocol the protocol value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withProtocol(LoadBalancerOutboundRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value
     */
    public Boolean enableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the timeout for the TCP idle connection.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the timeout for the TCP idle connection.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
