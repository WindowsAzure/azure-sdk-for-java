// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerServiceDiagnosticsProfile model. */
@Fluent
public final class ContainerServiceDiagnosticsProfile {
    /*
     * Profile for the container service VM diagnostic agent.
     */
    @JsonProperty(value = "vmDiagnostics", required = true)
    private ContainerServiceVMDiagnostics vmDiagnostics;

    /**
     * Get the vmDiagnostics property: Profile for the container service VM diagnostic agent.
     *
     * @return the vmDiagnostics value.
     */
    public ContainerServiceVMDiagnostics vmDiagnostics() {
        return this.vmDiagnostics;
    }

    /**
     * Set the vmDiagnostics property: Profile for the container service VM diagnostic agent.
     *
     * @param vmDiagnostics the vmDiagnostics value to set.
     * @return the ContainerServiceDiagnosticsProfile object itself.
     */
    public ContainerServiceDiagnosticsProfile withVmDiagnostics(ContainerServiceVMDiagnostics vmDiagnostics) {
        this.vmDiagnostics = vmDiagnostics;
        return this;
    }
}
