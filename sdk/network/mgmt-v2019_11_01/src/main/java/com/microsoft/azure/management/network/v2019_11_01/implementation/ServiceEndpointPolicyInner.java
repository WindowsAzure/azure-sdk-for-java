/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Service End point policy resource.
 */
@JsonFlatten
@SkipParentValidation
public class ServiceEndpointPolicyInner extends Resource {
    /**
     * A collection of service endpoint policy definitions of the service
     * endpoint policy.
     */
    @JsonProperty(value = "properties.serviceEndpointPolicyDefinitions")
    private List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions;

    /**
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /**
     * The resource GUID property of the service endpoint policy resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the service endpoint policy resource. Possible
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
     * Get a collection of service endpoint policy definitions of the service endpoint policy.
     *
     * @return the serviceEndpointPolicyDefinitions value
     */
    public List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions;
    }

    /**
     * Set a collection of service endpoint policy definitions of the service endpoint policy.
     *
     * @param serviceEndpointPolicyDefinitions the serviceEndpointPolicyDefinitions value to set
     * @return the ServiceEndpointPolicyInner object itself.
     */
    public ServiceEndpointPolicyInner withServiceEndpointPolicyDefinitions(List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions) {
        this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
        return this;
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
     * Get the resource GUID property of the service endpoint policy resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the service endpoint policy resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
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
     * @return the ServiceEndpointPolicyInner object itself.
     */
    public ServiceEndpointPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

}
