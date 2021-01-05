// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enables or disables a capability on the virtual machine or virtual machine scale set. */
@Fluent
public final class AdditionalCapabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdditionalCapabilities.class);

    /*
     * The flag that enables or disables a capability to have one or more
     * managed data disks with UltraSSD_LRS storage account type on the VM or
     * VMSS. Managed disks with storage account type UltraSSD_LRS can be added
     * to a virtual machine or virtual machine scale set only if this property
     * is enabled.
     */
    @JsonProperty(value = "ultraSSDEnabled")
    private Boolean ultraSsdEnabled;

    /**
     * Get the ultraSsdEnabled property: The flag that enables or disables a capability to have one or more managed data
     * disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type
     * UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     *
     * @return the ultraSsdEnabled value.
     */
    public Boolean ultraSsdEnabled() {
        return this.ultraSsdEnabled;
    }

    /**
     * Set the ultraSsdEnabled property: The flag that enables or disables a capability to have one or more managed data
     * disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type
     * UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     *
     * @param ultraSsdEnabled the ultraSsdEnabled value to set.
     * @return the AdditionalCapabilities object itself.
     */
    public AdditionalCapabilities withUltraSsdEnabled(Boolean ultraSsdEnabled) {
        this.ultraSsdEnabled = ultraSsdEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
