/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_04_01.ProbeProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A load balancer probe.
 */
@JsonFlatten
public class ProbeInner extends SubResource {
    /**
     * The load balancer rules that use this probe.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /**
     * The protocol of the end point. Possible values are: 'Http', 'Tcp', or
     * 'Https'. If 'Tcp' is specified, a received ACK is required for the probe
     * to be successful. If 'Http' or 'Https' is specified, a 200 OK response
     * from the specifies URI is required for the probe to be successful.
     * Possible values include: 'Http', 'Tcp', 'Https'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private ProbeProtocol protocol;

    /**
     * The port for communicating the probe. Possible values range from 1 to
     * 65535, inclusive.
     */
    @JsonProperty(value = "properties.port", required = true)
    private int port;

    /**
     * The interval, in seconds, for how frequently to probe the endpoint for
     * health status. Typically, the interval is slightly less than half the
     * allocated timeout period (in seconds) which allows two full probes
     * before taking the instance out of rotation. The default value is 15, the
     * minimum value is 5.
     */
    @JsonProperty(value = "properties.intervalInSeconds")
    private Integer intervalInSeconds;

    /**
     * The number of probes where if no response, will result in stopping
     * further traffic from being delivered to the endpoint. This values allows
     * endpoints to be taken out of rotation faster or slower than the typical
     * times used in Azure.
     */
    @JsonProperty(value = "properties.numberOfProbes")
    private Integer numberOfProbes;

    /**
     * The URI used for requesting health status from the VM. Path is required
     * if a protocol is set to http. Otherwise, it is not allowed. There is no
     * default value.
     */
    @JsonProperty(value = "properties.requestPath")
    private String requestPath;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
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
     * Get the load balancer rules that use this probe.
     *
     * @return the loadBalancingRules value
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the protocol of the end point. Possible values are: 'Http', 'Tcp', or 'Https'. If 'Tcp' is specified, a received ACK is required for the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is required for the probe to be successful. Possible values include: 'Http', 'Tcp', 'Https'.
     *
     * @return the protocol value
     */
    public ProbeProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol of the end point. Possible values are: 'Http', 'Tcp', or 'Https'. If 'Tcp' is specified, a received ACK is required for the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is required for the probe to be successful. Possible values include: 'Http', 'Tcp', 'Https'.
     *
     * @param protocol the protocol value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withProtocol(ProbeProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     *
     * @return the port value
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     *
     * @param port the port value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the interval, in seconds, for how frequently to probe the endpoint for health status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     *
     * @return the intervalInSeconds value
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the interval, in seconds, for how frequently to probe the endpoint for health status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     *
     * @param intervalInSeconds the intervalInSeconds value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the number of probes where if no response, will result in stopping further traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or slower than the typical times used in Azure.
     *
     * @return the numberOfProbes value
     */
    public Integer numberOfProbes() {
        return this.numberOfProbes;
    }

    /**
     * Set the number of probes where if no response, will result in stopping further traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or slower than the typical times used in Azure.
     *
     * @param numberOfProbes the numberOfProbes value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withNumberOfProbes(Integer numberOfProbes) {
        this.numberOfProbes = numberOfProbes;
        return this;
    }

    /**
     * Get the URI used for requesting health status from the VM. Path is required if a protocol is set to http. Otherwise, it is not allowed. There is no default value.
     *
     * @return the requestPath value
     */
    public String requestPath() {
        return this.requestPath;
    }

    /**
     * Set the URI used for requesting health status from the VM. Path is required if a protocol is set to http. Otherwise, it is not allowed. There is no default value.
     *
     * @param requestPath the requestPath value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withRequestPath(String requestPath) {
        this.requestPath = requestPath;
        return this;
    }

    /**
     * Get gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ProbeInner object itself.
     */
    public ProbeInner withName(String name) {
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
     * @return the ProbeInner object itself.
     */
    public ProbeInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
