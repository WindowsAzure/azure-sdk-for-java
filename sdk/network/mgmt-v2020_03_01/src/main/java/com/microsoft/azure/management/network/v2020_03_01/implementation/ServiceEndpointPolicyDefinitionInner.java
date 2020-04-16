/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Service Endpoint policy definitions.
 */
@JsonFlatten
public class ServiceEndpointPolicyDefinitionInner extends SubResource {
    /**
     * A description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Service endpoint name.
     */
    @JsonProperty(value = "properties.service")
    private String service;

    /**
     * A list of service resources.
     */
    @JsonProperty(value = "properties.serviceResources")
    private List<String> serviceResources;

    /**
     * The provisioning state of the service endpoint policy definition
     * resource. Possible values include: 'Succeeded', 'Updating', 'Deleting',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get a description for this rule. Restricted to 140 chars.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set a description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get service endpoint name.
     *
     * @return the service value
     */
    public String service() {
        return this.service;
    }

    /**
     * Set service endpoint name.
     *
     * @param service the service value to set
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get a list of service resources.
     *
     * @return the serviceResources value
     */
    public List<String> serviceResources() {
        return this.serviceResources;
    }

    /**
     * Set a list of service resources.
     *
     * @param serviceResources the serviceResources value to set
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withServiceResources(List<String> serviceResources) {
        this.serviceResources = serviceResources;
        return this;
    }

    /**
     * Get the provisioning state of the service endpoint policy definition resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withName(String name) {
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

}
