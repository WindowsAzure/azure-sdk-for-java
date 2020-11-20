/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a VM from which a formula is to be created.
 */
public class FormulaPropertiesFromVm {
    /**
     * The identifier of the VM from which a formula is to be created.
     */
    @JsonProperty(value = "labVmId")
    private String labVmId;

    /**
     * Get the identifier of the VM from which a formula is to be created.
     *
     * @return the labVmId value
     */
    public String labVmId() {
        return this.labVmId;
    }

    /**
     * Set the identifier of the VM from which a formula is to be created.
     *
     * @param labVmId the labVmId value to set
     * @return the FormulaPropertiesFromVm object itself.
     */
    public FormulaPropertiesFromVm withLabVmId(String labVmId) {
        this.labVmId = labVmId;
        return this;
    }

}
