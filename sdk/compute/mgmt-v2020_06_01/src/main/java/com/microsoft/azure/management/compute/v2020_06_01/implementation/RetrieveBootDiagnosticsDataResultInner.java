/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SAS URIs of the console screenshot and serial log blobs.
 */
public class RetrieveBootDiagnosticsDataResultInner {
    /**
     * The console screenshot blob URI.
     */
    @JsonProperty(value = "consoleScreenshotBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String consoleScreenshotBlobUri;

    /**
     * The serial console log blob URI.
     */
    @JsonProperty(value = "serialConsoleLogBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String serialConsoleLogBlobUri;

    /**
     * Get the console screenshot blob URI.
     *
     * @return the consoleScreenshotBlobUri value
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * Get the serial console log blob URI.
     *
     * @return the serialConsoleLogBlobUri value
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

}
