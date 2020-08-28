/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Frontend port of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayFrontendPort extends SubResource {
    /**
     * Frontend port.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * The provisioning state of the frontend port resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the frontend port that is unique within an Application Gateway.
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
     * Get frontend port.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set frontend port.
     *
     * @param port the port value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the provisioning state of the frontend port resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the frontend port that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the frontend port that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withName(String name) {
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
