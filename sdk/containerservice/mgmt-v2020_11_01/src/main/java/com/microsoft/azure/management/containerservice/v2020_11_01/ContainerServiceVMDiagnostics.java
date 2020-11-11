/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for diagnostics on the container service VMs.
 */
public class ContainerServiceVMDiagnostics {
    /**
     * Whether the VM diagnostic agent is provisioned on the VM.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * The URI of the storage account where diagnostics are stored.
     */
    @JsonProperty(value = "storageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String storageUri;

    /**
     * Get whether the VM diagnostic agent is provisioned on the VM.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether the VM diagnostic agent is provisioned on the VM.
     *
     * @param enabled the enabled value to set
     * @return the ContainerServiceVMDiagnostics object itself.
     */
    public ContainerServiceVMDiagnostics withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the URI of the storage account where diagnostics are stored.
     *
     * @return the storageUri value
     */
    public String storageUri() {
        return this.storageUri;
    }

}
