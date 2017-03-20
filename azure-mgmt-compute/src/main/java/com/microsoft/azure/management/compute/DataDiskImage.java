/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the data disk images information.
 */
public class DataDiskImage {
    /**
     * The LUN number for a data disk. This value is used to identify data disk
     * image inside the VMImage and therefore it must be unique for each data
     * disk.
     */
    @JsonProperty(value = "lun", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lun;

    /**
     * Get the lun value.
     *
     * @return the lun value
     */
    public Integer lun() {
        return this.lun;
    }

}
