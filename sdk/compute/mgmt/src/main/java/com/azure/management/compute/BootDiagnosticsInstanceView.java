// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BootDiagnosticsInstanceView model. */
@Immutable
public final class BootDiagnosticsInstanceView {
    /*
     * The console screenshot blob URI.
     */
    @JsonProperty(value = "consoleScreenshotBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String consoleScreenshotBlobUri;

    /*
     * The Linux serial console log blob Uri.
     */
    @JsonProperty(value = "serialConsoleLogBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String serialConsoleLogBlobUri;

    /*
     * The boot diagnostics status information for the VM. <br><br> NOTE: It
     * will be set only if there are errors encountered in enabling boot
     * diagnostics.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceViewStatus status;

    /**
     * Get the consoleScreenshotBlobUri property: The console screenshot blob URI.
     *
     * @return the consoleScreenshotBlobUri value.
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * Get the serialConsoleLogBlobUri property: The Linux serial console log blob Uri.
     *
     * @return the serialConsoleLogBlobUri value.
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    /**
     * Get the status property: The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will
     * be set only if there are errors encountered in enabling boot diagnostics.
     *
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }
}
