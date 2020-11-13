/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Windows Remote Management configuration of the VM.
 */
public class WinRMConfiguration {
    /**
     * The list of Windows Remote Management listeners.
     */
    @JsonProperty(value = "listeners")
    private List<WinRMListener> listeners;

    /**
     * Get the list of Windows Remote Management listeners.
     *
     * @return the listeners value
     */
    public List<WinRMListener> listeners() {
        return this.listeners;
    }

    /**
     * Set the list of Windows Remote Management listeners.
     *
     * @param listeners the listeners value to set
     * @return the WinRMConfiguration object itself.
     */
    public WinRMConfiguration withListeners(List<WinRMListener> listeners) {
        this.listeners = listeners;
        return this;
    }

}
