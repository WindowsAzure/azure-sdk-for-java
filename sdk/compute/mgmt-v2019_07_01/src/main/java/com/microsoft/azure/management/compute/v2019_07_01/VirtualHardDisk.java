/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the uri of a disk.
 */
public class VirtualHardDisk {
    /**
     * Specifies the virtual hard disk's uri.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get specifies the virtual hard disk's uri.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set specifies the virtual hard disk's uri.
     *
     * @param uri the uri value to set
     * @return the VirtualHardDisk object itself.
     */
    public VirtualHardDisk withUri(String uri) {
        this.uri = uri;
        return this;
    }

}
