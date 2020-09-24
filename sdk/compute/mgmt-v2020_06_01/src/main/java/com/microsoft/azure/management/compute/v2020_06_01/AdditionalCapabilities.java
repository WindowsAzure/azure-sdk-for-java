/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enables or disables a capability on the virtual machine or virtual machine
 * scale set.
 */
public class AdditionalCapabilities {
    /**
     * The flag that enables or disables a capability to have one or more
     * managed data disks with UltraSSD_LRS storage account type on the VM or
     * VMSS. Managed disks with storage account type UltraSSD_LRS can be added
     * to a virtual machine or virtual machine scale set only if this property
     * is enabled.
     */
    @JsonProperty(value = "ultraSSDEnabled")
    private Boolean ultraSSDEnabled;

    /**
     * Get the flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     *
     * @return the ultraSSDEnabled value
     */
    public Boolean ultraSSDEnabled() {
        return this.ultraSSDEnabled;
    }

    /**
     * Set the flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     *
     * @param ultraSSDEnabled the ultraSSDEnabled value to set
     * @return the AdditionalCapabilities object itself.
     */
    public AdditionalCapabilities withUltraSSDEnabled(Boolean ultraSSDEnabled) {
        this.ultraSSDEnabled = ultraSSDEnabled;
        return this;
    }

}
