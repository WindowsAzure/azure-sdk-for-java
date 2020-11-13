/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The source user image virtual hard disk. Only tags may be updated.
 */
@JsonFlatten
public class ImageUpdate extends UpdateResource {
    /**
     * The source virtual machine from which Image is created.
     */
    @JsonProperty(value = "properties.sourceVirtualMachine")
    private SubResource sourceVirtualMachine;

    /**
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private ImageStorageProfile storageProfile;

    /**
     * The provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets the HyperVGenerationType of the VirtualMachine created from the
     * image. Possible values include: 'V1', 'V2'.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGenerationTypes hyperVGeneration;

    /**
     * Get the source virtual machine from which Image is created.
     *
     * @return the sourceVirtualMachine value
     */
    public SubResource sourceVirtualMachine() {
        return this.sourceVirtualMachine;
    }

    /**
     * Set the source virtual machine from which Image is created.
     *
     * @param sourceVirtualMachine the sourceVirtualMachine value to set
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withSourceVirtualMachine(SubResource sourceVirtualMachine) {
        this.sourceVirtualMachine = sourceVirtualMachine;
        return this;
    }

    /**
     * Get specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value
     */
    public ImageStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withStorageProfile(ImageStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets the HyperVGenerationType of the VirtualMachine created from the image. Possible values include: 'V1', 'V2'.
     *
     * @return the hyperVGeneration value
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set gets the HyperVGenerationType of the VirtualMachine created from the image. Possible values include: 'V1', 'V2'.
     *
     * @param hyperVGeneration the hyperVGeneration value to set
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

}
