/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Details the service to which the subnet is delegated.
 */
@JsonFlatten
public class Delegation extends SubResource {
    /**
     * The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     */
    @JsonProperty(value = "properties.serviceName")
    private String serviceName;

    /**
     * The actions permitted to the service upon delegation.
     */
    @JsonProperty(value = "properties.actions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actions;

    /**
     * The provisioning state of the service delegation resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a subnet. This name can
     * be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the name of the service to whom the subnet should be delegated (e.g. Microsoft.Sql/servers).
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the service to whom the subnet should be delegated (e.g. Microsoft.Sql/servers).
     *
     * @param serviceName the serviceName value to set
     * @return the Delegation object itself.
     */
    public Delegation withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the actions permitted to the service upon delegation.
     *
     * @return the actions value
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Get the provisioning state of the service delegation resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a subnet. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a subnet. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the Delegation object itself.
     */
    public Delegation withName(String name) {
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
