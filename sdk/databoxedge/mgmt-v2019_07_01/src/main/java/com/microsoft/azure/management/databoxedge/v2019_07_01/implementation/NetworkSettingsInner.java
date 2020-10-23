/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.databoxedge.v2019_07_01.NetworkAdapter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.v2019_07_01.ARMBaseModel;

/**
 * The network settings of a device.
 */
@JsonFlatten
public class NetworkSettingsInner extends ARMBaseModel {
    /**
     * The network adapter list on the device.
     */
    @JsonProperty(value = "properties.networkAdapters", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkAdapter> networkAdapters;

    /**
     * Get the network adapter list on the device.
     *
     * @return the networkAdapters value
     */
    public List<NetworkAdapter> networkAdapters() {
        return this.networkAdapters;
    }

}
