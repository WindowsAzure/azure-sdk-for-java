/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Inbound NAT pool of the load balancer.
 */
@JsonFlatten
public class InboundNatPool extends SubResource {
    /**
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Possible values include: 'Udp', 'Tcp', 'All'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private TransportProtocol protocol;

    /**
     * The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer.
     * Acceptable values range between 1 and 65534.
     */
    @JsonProperty(value = "properties.frontendPortRangeStart", required = true)
    private int frontendPortRangeStart;

    /**
     * The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable
     * values range between 1 and 65535.
     */
    @JsonProperty(value = "properties.frontendPortRangeEnd", required = true)
    private int frontendPortRangeEnd;

    /**
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 1 and 65535.
     */
    @JsonProperty(value = "properties.backendPort", required = true)
    private int backendPort;

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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @return the frontendPortRangeStart value
     */
    public int frontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Set the first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendPortRangeStart(int frontendPortRangeStart) {
        this.frontendPortRangeStart = frontendPortRangeStart;
        return this;
    }

    /**
     * Get the last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @return the frontendPortRangeEnd value
     */
    public int frontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Set the last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendPortRangeEnd(int frontendPortRangeEnd) {
        this.frontendPortRangeEnd = frontendPortRangeEnd;
        return this;
    }

    /**
     * Get the port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     *
     * @return the backendPort value
     */
    public int backendPort() {
        return this.backendPort;
    }

    /**
     * Set the port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     *
     * @param backendPort the backendPort value to set
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withBackendPort(int backendPort) {
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEnableFloatingIP(Boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withProvisioningState(String provisioningState) {
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withName(String name) {
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
