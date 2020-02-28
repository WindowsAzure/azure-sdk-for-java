/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service tag information.
 */
public class ServiceTagInformation {
    /**
     * Properties of the service tag information.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceTagInformationPropertiesFormat properties;

    /**
     * The name of service tag.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The ID of service tag.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get properties of the service tag information.
     *
     * @return the properties value
     */
    public ServiceTagInformationPropertiesFormat properties() {
        return this.properties;
    }

    /**
     * Get the name of service tag.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the ID of service tag.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
