/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Use to provide parameters when requesting an export of all devices in the
 * IoT hub.
 */
public class ExportDevicesRequest {
    /**
     * The export blob container URI.
     */
    @JsonProperty(value = "exportBlobContainerUri", required = true)
    private String exportBlobContainerUri;

    /**
     * The value indicating whether keys should be excluded during export.
     */
    @JsonProperty(value = "excludeKeys", required = true)
    private boolean excludeKeys;

    /**
     * Get the export blob container URI.
     *
     * @return the exportBlobContainerUri value
     */
    public String exportBlobContainerUri() {
        return this.exportBlobContainerUri;
    }

    /**
     * Set the export blob container URI.
     *
     * @param exportBlobContainerUri the exportBlobContainerUri value to set
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExportBlobContainerUri(String exportBlobContainerUri) {
        this.exportBlobContainerUri = exportBlobContainerUri;
        return this;
    }

    /**
     * Get the value indicating whether keys should be excluded during export.
     *
     * @return the excludeKeys value
     */
    public boolean excludeKeys() {
        return this.excludeKeys;
    }

    /**
     * Set the value indicating whether keys should be excluded during export.
     *
     * @param excludeKeys the excludeKeys value to set
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExcludeKeys(boolean excludeKeys) {
        this.excludeKeys = excludeKeys;
        return this;
    }

}
