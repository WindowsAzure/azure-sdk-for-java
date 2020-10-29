// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Service Endpoint policy definitions. */
@JsonFlatten
@Fluent
public class ServiceEndpointPolicyDefinitionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceEndpointPolicyDefinitionInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Service endpoint name.
     */
    @JsonProperty(value = "properties.service")
    private String service;

    /*
     * A list of service resources.
     */
    @JsonProperty(value = "properties.serviceResources")
    private List<String> serviceResources;

    /*
     * The provisioning state of the service endpoint policy definition
     * resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the service property: Service endpoint name.
     *
     * @return the service value.
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the service property: Service endpoint name.
     *
     * @param service the service value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the serviceResources property: A list of service resources.
     *
     * @return the serviceResources value.
     */
    public List<String> serviceResources() {
        return this.serviceResources;
    }

    /**
     * Set the serviceResources property: A list of service resources.
     *
     * @param serviceResources the serviceResources value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withServiceResources(List<String> serviceResources) {
        this.serviceResources = serviceResources;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service endpoint policy definition resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
