// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Stats for the share.
 */
@JacksonXmlRootElement(localName = "ShareStats")
public final class ShareStats {
    /*
     * The approximate size of the data stored in bytes, rounded up to the
     * nearest gigabyte. Note that this value may not include all recently
     * created or recently resized files.
     */
    @JsonProperty(value = "ShareUsageBytes", required = true)
    private int shareUsageBytes;

    /**
     * Get the shareUsageBytes property: The approximate size of the data
     * stored in bytes, rounded up to the nearest gigabyte. Note that this
     * value may not include all recently created or recently resized files.
     *
     * @return the shareUsageBytes value.
     */
    public int shareUsageBytes() {
        return this.shareUsageBytes;
    }

    /**
     * Set the shareUsageBytes property: The approximate size of the data
     * stored in bytes, rounded up to the nearest gigabyte. Note that this
     * value may not include all recently created or recently resized files.
     *
     * @param shareUsageBytes the shareUsageBytes value to set.
     * @return the ShareStats object itself.
     */
    public ShareStats shareUsageBytes(int shareUsageBytes) {
        this.shareUsageBytes = shareUsageBytes;
        return this;
    }
}
