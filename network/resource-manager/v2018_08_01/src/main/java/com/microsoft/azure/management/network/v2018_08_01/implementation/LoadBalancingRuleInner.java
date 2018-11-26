/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_08_01.TransportProtocol;
import com.microsoft.azure.management.network.v2018_08_01.LoadDistribution;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A load balancing rule for a load balancer.
 */
@JsonFlatten
public class LoadBalancingRuleInner extends SubResource {
    /**
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * The reference of the load balancer probe used by the load balancing
     * rule.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /**
     * Possible values include: 'Udp', 'Tcp', 'All'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private TransportProtocol protocol;

    /**
     * The load distribution policy for this rule. Possible values are
     * 'Default', 'SourceIP', and 'SourceIPProtocol'. Possible values include:
     * 'Default', 'SourceIP', 'SourceIPProtocol'.
     */
    @JsonProperty(value = "properties.loadDistribution")
    private LoadDistribution loadDistribution;

    /**
     * The port for the external endpoint. Port numbers for each rule must be
     * unique within the Load Balancer. Acceptable values are between 0 and
     * 65534. Note that value 0 enables "Any Port".
     */
    @JsonProperty(value = "properties.frontendPort", required = true)
    private int frontendPort;

    /**
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 0 and 65535. Note that value 0 enables "Any Port".
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /**
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIP;

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /**
     * Configures SNAT for the VMs in the backend pool to use the publicIP
     * address specified in the frontend of the load balancing rule.
     */
    @JsonProperty(value = "properties.disableOutboundSnat")
    private Boolean disableOutboundSnat;

    /**
     * Gets the provisioning state of the PublicIP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get a reference to frontend IP addresses.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set a reference to frontend IP addresses.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get a reference to a pool of DIPs. Inbound traffic is randomly load balanced across IPs in the backend IPs.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set a reference to a pool of DIPs. Inbound traffic is randomly load balanced across IPs in the backend IPs.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the reference of the load balancer probe used by the load balancing rule.
     *
     * @return the probe value
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the reference of the load balancer probe used by the load balancing rule.
     *
     * @param probe the probe value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get possible values include: 'Udp', 'Tcp', 'All'.
     *
     * @return the protocol value
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set possible values include: 'Udp', 'Tcp', 'All'.
     *
     * @param protocol the protocol value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the load distribution policy for this rule. Possible values are 'Default', 'SourceIP', and 'SourceIPProtocol'. Possible values include: 'Default', 'SourceIP', 'SourceIPProtocol'.
     *
     * @return the loadDistribution value
     */
    public LoadDistribution loadDistribution() {
        return this.loadDistribution;
    }

    /**
     * Set the load distribution policy for this rule. Possible values are 'Default', 'SourceIP', and 'SourceIPProtocol'. Possible values include: 'Default', 'SourceIP', 'SourceIPProtocol'.
     *
     * @param loadDistribution the loadDistribution value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withLoadDistribution(LoadDistribution loadDistribution) {
        this.loadDistribution = loadDistribution;
        return this;
    }

    /**
     * Get the port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     *
     * @return the frontendPort value
     */
    public int frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     *
     * @param frontendPort the frontendPort value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withFrontendPort(int frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the port used for internal connections on the endpoint. Acceptable values are between 0 and 65535. Note that value 0 enables "Any Port".
     *
     * @return the backendPort value
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the port used for internal connections on the endpoint. Acceptable values are between 0 and 65535. Note that value 0 enables "Any Port".
     *
     * @param backendPort the backendPort value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIP value
     */
    public Boolean enableFloatingIP() {
        return this.enableFloatingIP;
    }

    /**
     * Set configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIP the enableFloatingIP value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEnableFloatingIP(Boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
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
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get configures SNAT for the VMs in the backend pool to use the publicIP address specified in the frontend of the load balancing rule.
     *
     * @return the disableOutboundSnat value
     */
    public Boolean disableOutboundSnat() {
        return this.disableOutboundSnat;
    }

    /**
     * Set configures SNAT for the VMs in the backend pool to use the publicIP address specified in the frontend of the load balancing rule.
     *
     * @param disableOutboundSnat the disableOutboundSnat value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withDisableOutboundSnat(Boolean disableOutboundSnat) {
        this.disableOutboundSnat = disableOutboundSnat;
        return this;
    }

    /**
     * Get gets the provisioning state of the PublicIP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets the provisioning state of the PublicIP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withName(String name) {
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
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
