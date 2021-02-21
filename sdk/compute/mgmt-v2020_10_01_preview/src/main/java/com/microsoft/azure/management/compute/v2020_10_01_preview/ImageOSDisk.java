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
 * Describes an Operating System disk.
 */
public class ImageOSDisk extends ImageDisk {
    /**
     * This property allows you to specify the type of the OS that is included
     * in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt;
     * Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows',
     * 'Linux'.
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /**
     * The OS State. Possible values include: 'Generalized', 'Specialized'.
     */
    @JsonProperty(value = "osState", required = true)
    private OperatingSystemStateTypes osState;

    /**
     * Get this property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set this property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the OS State. Possible values include: 'Generalized', 'Specialized'.
     *
     * @return the osState value
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the OS State. Possible values include: 'Generalized', 'Specialized'.
     *
     * @param osState the osState value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

}
