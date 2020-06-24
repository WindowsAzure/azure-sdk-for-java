// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HardwareProfile model. */
@Fluent
public final class HardwareProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HardwareProfile.class);

    /*
     * Specifies the size of the virtual machine. For more information about
     * virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-sizes?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * <br><br> The available VM sizes depend on region and availability set.
     * For a list of available sizes use these APIs:  <br><br> [List all
     * available virtual machine sizes in an availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes)
     * <br><br> [List all available virtual machine sizes in a
     * region](https://docs.microsoft.com/rest/api/compute/virtualmachinesizes/list)
     * <br><br> [List all available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes)
     */
    @JsonProperty(value = "vmSize")
    private VirtualMachineSizeTypes vmSize;

    /**
     * Get the vmSize property: Specifies the size of the virtual machine. For more information about virtual machine
     * sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-sizes?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set. For a list of available sizes
     * use these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List
     * all available virtual machine sizes in a
     * region](https://docs.microsoft.com/rest/api/compute/virtualmachinesizes/list) &lt;br&gt;&lt;br&gt; [List all
     * available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes).
     *
     * @return the vmSize value.
     */
    public VirtualMachineSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Specifies the size of the virtual machine. For more information about virtual machine
     * sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-sizes?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set. For a list of available sizes
     * use these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List
     * all available virtual machine sizes in a
     * region](https://docs.microsoft.com/rest/api/compute/virtualmachinesizes/list) &lt;br&gt;&lt;br&gt; [List all
     * available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes).
     *
     * @param vmSize the vmSize value to set.
     * @return the HardwareProfile object itself.
     */
    public HardwareProfile withVmSize(VirtualMachineSizeTypes vmSize) {
        this.vmSize = vmSize;
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
