/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Output of virtual machine capture operation.
 */
public class VirtualMachineCaptureResultInner extends SubResource {
    /**
     * the schema of the captured virtual machine.
     */
    @JsonProperty(value = "$schema", access = JsonProperty.Access.WRITE_ONLY)
    private String schema;

    /**
     * the version of the content.
     */
    @JsonProperty(value = "contentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String contentVersion;

    /**
     * parameters of the captured virtual machine.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Object parameters;

    /**
     * a list of resource items of the captured virtual machine.
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<Object> resources;

    /**
     * Get the schema of the captured virtual machine.
     *
     * @return the schema value
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Get the version of the content.
     *
     * @return the contentVersion value
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Get parameters of the captured virtual machine.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Get a list of resource items of the captured virtual machine.
     *
     * @return the resources value
     */
    public List<Object> resources() {
        return this.resources;
    }

}
