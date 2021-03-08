/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters of ephemeral disk settings that can be specified
 * for operating system disk. &lt;br&gt;&lt;br&gt; NOTE: The ephemeral disk
 * settings can only be specified for managed disk.
 */
public class DiffDiskSettings {
    /**
     * Specifies the ephemeral disk settings for operating system disk.
     * Possible values include: 'Local'.
     */
    @JsonProperty(value = "option")
    private DiffDiskOptions option;

    /**
     * Specifies the ephemeral disk placement for operating system
     * disk.&lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **CacheDisk** &lt;br&gt;&lt;br&gt; **ResourceDisk** &lt;br&gt;&lt;br&gt;
     * Default: **CacheDisk** if one is configured for the VM size otherwise
     * **ResourceDisk** is used.&lt;br&gt;&lt;br&gt; Refer to VM size
     * documentation for Windows VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes
     * and Linux VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/sizes to
     * check which VM sizes exposes a cache disk. Possible values include:
     * 'CacheDisk', 'ResourceDisk'.
     */
    @JsonProperty(value = "placement")
    private DiffDiskPlacement placement;

    /**
     * Get specifies the ephemeral disk settings for operating system disk. Possible values include: 'Local'.
     *
     * @return the option value
     */
    public DiffDiskOptions option() {
        return this.option;
    }

    /**
     * Set specifies the ephemeral disk settings for operating system disk. Possible values include: 'Local'.
     *
     * @param option the option value to set
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withOption(DiffDiskOptions option) {
        this.option = option;
        return this;
    }

    /**
     * Get specifies the ephemeral disk placement for operating system disk.&lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **CacheDisk** &lt;br&gt;&lt;br&gt; **ResourceDisk** &lt;br&gt;&lt;br&gt; Default: **CacheDisk** if one is configured for the VM size otherwise **ResourceDisk** is used.&lt;br&gt;&lt;br&gt; Refer to VM size documentation for Windows VM at https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes and Linux VM at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/sizes to check which VM sizes exposes a cache disk. Possible values include: 'CacheDisk', 'ResourceDisk'.
     *
     * @return the placement value
     */
    public DiffDiskPlacement placement() {
        return this.placement;
    }

    /**
     * Set specifies the ephemeral disk placement for operating system disk.&lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **CacheDisk** &lt;br&gt;&lt;br&gt; **ResourceDisk** &lt;br&gt;&lt;br&gt; Default: **CacheDisk** if one is configured for the VM size otherwise **ResourceDisk** is used.&lt;br&gt;&lt;br&gt; Refer to VM size documentation for Windows VM at https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes and Linux VM at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/sizes to check which VM sizes exposes a cache disk. Possible values include: 'CacheDisk', 'ResourceDisk'.
     *
     * @param placement the placement value to set
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withPlacement(DiffDiskPlacement placement) {
        this.placement = placement;
        return this;
    }

}
