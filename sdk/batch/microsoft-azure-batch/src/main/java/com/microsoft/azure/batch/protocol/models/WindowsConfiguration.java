/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Windows operating system settings to apply to the virtual machine.
 */
public class WindowsConfiguration {
    /**
     * Whether automatic updates are enabled on the virtual machine. If
     * omitted, the default value is true.
     */
    @JsonProperty(value = "enableAutomaticUpdates")
    private Boolean enableAutomaticUpdates;

    /**
     * Get whether automatic updates are enabled on the virtual machine. If omitted, the default value is true.
     *
     * @return the enableAutomaticUpdates value
     */
    public Boolean enableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set whether automatic updates are enabled on the virtual machine. If omitted, the default value is true.
     *
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
        return this;
    }

}
