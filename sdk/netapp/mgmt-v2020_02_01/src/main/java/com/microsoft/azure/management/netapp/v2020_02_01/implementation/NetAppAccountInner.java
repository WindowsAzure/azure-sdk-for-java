/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.netapp.v2020_02_01.ActiveDirectory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * NetApp account resource.
 */
@JsonFlatten
public class NetAppAccountInner extends Resource {
    /**
     * Azure lifecycle management.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Active Directories.
     */
    @JsonProperty(value = "properties.activeDirectories")
    private List<ActiveDirectory> activeDirectories;

    /**
     * Get azure lifecycle management.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get active Directories.
     *
     * @return the activeDirectories value
     */
    public List<ActiveDirectory> activeDirectories() {
        return this.activeDirectories;
    }

    /**
     * Set active Directories.
     *
     * @param activeDirectories the activeDirectories value to set
     * @return the NetAppAccountInner object itself.
     */
    public NetAppAccountInner withActiveDirectories(List<ActiveDirectory> activeDirectories) {
        this.activeDirectories = activeDirectories;
        return this;
    }

}
