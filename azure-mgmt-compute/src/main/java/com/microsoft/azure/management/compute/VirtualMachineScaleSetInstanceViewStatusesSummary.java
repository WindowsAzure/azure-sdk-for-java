/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Instance view statuses summary for virtual machines of a virtual machine
 * scale set.
 */
public class VirtualMachineScaleSetInstanceViewStatusesSummary {
    /**
     * the extensions information.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineStatusCodeCount> statusesSummary;

    /**
     * Get the statusesSummary value.
     *
     * @return the statusesSummary value
     */
    public List<VirtualMachineStatusCodeCount> statusesSummary() {
        return this.statusesSummary;
    }

}
