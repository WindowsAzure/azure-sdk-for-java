/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage object properties.
 */
public class StorageClassificationProperties {
    /**
     * Friendly name of the Storage classification.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Get friendly name of the Storage classification.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the Storage classification.
     *
     * @param friendlyName the friendlyName value to set
     * @return the StorageClassificationProperties object itself.
     */
    public StorageClassificationProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}
