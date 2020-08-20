/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * NetworkSecurityGroup resource.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkSecurityGroupInner extends Resource {
    /**
     * A collection of security rules of the network security group.
     */
    @JsonProperty(value = "properties.securityRules")
    private List<SecurityRuleInner> securityRules;

    /**
     * The default security rules of network security group.
     */
    @JsonProperty(value = "properties.defaultSecurityRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SecurityRuleInner> defaultSecurityRules;

    /**
     * A collection of references to network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /**
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /**
     * A collection of references to flow log resources.
     */
    @JsonProperty(value = "properties.flowLogs", access = JsonProperty.Access.WRITE_ONLY)
    private List<FlowLogInner> flowLogs;

    /**
     * The resource GUID property of the network security group resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the network security group resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get a collection of security rules of the network security group.
     *
     * @return the securityRules value
     */
    public List<SecurityRuleInner> securityRules() {
        return this.securityRules;
    }

    /**
     * Set a collection of security rules of the network security group.
     *
     * @param securityRules the securityRules value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Get the default security rules of network security group.
     *
     * @return the defaultSecurityRules value
     */
    public List<SecurityRuleInner> defaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Get a collection of references to network interfaces.
     *
     * @return the networkInterfaces value
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get a collection of references to subnets.
     *
     * @return the subnets value
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get a collection of references to flow log resources.
     *
     * @return the flowLogs value
     */
    public List<FlowLogInner> flowLogs() {
        return this.flowLogs;
    }

    /**
     * Get the resource GUID property of the network security group resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the network security group resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withId(String id) {
        this.id = id;
        return this;
    }

}
