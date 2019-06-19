/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the service task to check for OCI drivers.
 */
public class CheckOCIDriverTaskInput {
    /**
     * Version of the source server to check against.  Optional.
     */
    @JsonProperty(value = "serverVersion")
    private String serverVersion;

    /**
     * Get version of the source server to check against.  Optional.
     *
     * @return the serverVersion value
     */
    public String serverVersion() {
        return this.serverVersion;
    }

    /**
     * Set version of the source server to check against.  Optional.
     *
     * @param serverVersion the serverVersion value to set
     * @return the CheckOCIDriverTaskInput object itself.
     */
    public CheckOCIDriverTaskInput withServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

}
