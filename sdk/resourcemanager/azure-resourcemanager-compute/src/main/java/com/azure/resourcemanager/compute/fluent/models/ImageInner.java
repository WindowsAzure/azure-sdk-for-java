// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import com.azure.resourcemanager.compute.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.models.ImageStorageProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual
 * machine. If SourceImage is provided, the destination virtual hard drive must not exist.
 */
@JsonFlatten
@Fluent
public class ImageInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageInner.class);

    /*
     * The extended location of the Image.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The source virtual machine from which Image is created.
     */
    @JsonProperty(value = "properties.sourceVirtualMachine")
    private SubResource sourceVirtualMachine;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private ImageStorageProfile storageProfile;

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Specifies the HyperVGenerationType of the VirtualMachine created from
     * the image. From API Version 2019-03-01 if the image source is a blob,
     * then we need the user to specify the value, if the source is managed
     * resource like disk or snapshot, we may require the user to specify the
     * property if we cannot deduce it from the source managed resource.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGenerationTypes hyperVGeneration;

    /**
     * Get the extendedLocation property: The extended location of the Image.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the Image.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the ImageInner object itself.
     */
    public ImageInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @return the sourceVirtualMachine value.
     */
    public SubResource sourceVirtualMachine() {
        return this.sourceVirtualMachine;
    }

    /**
     * Set the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @param sourceVirtualMachine the sourceVirtualMachine value to set.
     * @return the ImageInner object itself.
     */
    public ImageInner withSourceVirtualMachine(SubResource sourceVirtualMachine) {
        this.sourceVirtualMachine = sourceVirtualMachine;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public ImageStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ImageInner object itself.
     */
    public ImageInner withStorageProfile(ImageStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created from the
     * image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if
     * the source is managed resource like disk or snapshot, we may require the user to specify the property if we
     * cannot deduce it from the source managed resource.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created from the
     * image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if
     * the source is managed resource like disk or snapshot, we may require the user to specify the property if we
     * cannot deduce it from the source managed resource.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the ImageInner object itself.
     */
    public ImageInner withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }
}
