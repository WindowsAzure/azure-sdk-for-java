/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * File source details.
 */
public class FileSourceInfo {
    /**
     * File share ID.
     */
    @JsonProperty(value = "shareId", required = true)
    private String shareId;

    /**
     * Get file share ID.
     *
     * @return the shareId value
     */
    public String shareId() {
        return this.shareId;
    }

    /**
     * Set file share ID.
     *
     * @param shareId the shareId value to set
     * @return the FileSourceInfo object itself.
     */
    public FileSourceInfo withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

}
