// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents resource specific settings. */
@Fluent
public final class ResourceSettingsFragment {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSettingsFragment.class);

    /*
     * The resource id of the gallery image used for creating the virtual
     * machine
     */
    @JsonProperty(value = "galleryImageResourceId")
    private String galleryImageResourceId;

    /*
     * The size of the virtual machine
     */
    @JsonProperty(value = "size")
    private ManagedLabVmSize size;

    /*
     * Details specific to Reference Vm
     */
    @JsonProperty(value = "referenceVm")
    private ReferenceVmFragment referenceVm;

    /**
     * Get the galleryImageResourceId property: The resource id of the gallery image used for creating the virtual
     * machine.
     *
     * @return the galleryImageResourceId value.
     */
    public String galleryImageResourceId() {
        return this.galleryImageResourceId;
    }

    /**
     * Set the galleryImageResourceId property: The resource id of the gallery image used for creating the virtual
     * machine.
     *
     * @param galleryImageResourceId the galleryImageResourceId value to set.
     * @return the ResourceSettingsFragment object itself.
     */
    public ResourceSettingsFragment withGalleryImageResourceId(String galleryImageResourceId) {
        this.galleryImageResourceId = galleryImageResourceId;
        return this;
    }

    /**
     * Get the size property: The size of the virtual machine.
     *
     * @return the size value.
     */
    public ManagedLabVmSize size() {
        return this.size;
    }

    /**
     * Set the size property: The size of the virtual machine.
     *
     * @param size the size value to set.
     * @return the ResourceSettingsFragment object itself.
     */
    public ResourceSettingsFragment withSize(ManagedLabVmSize size) {
        this.size = size;
        return this;
    }

    /**
     * Get the referenceVm property: Details specific to Reference Vm.
     *
     * @return the referenceVm value.
     */
    public ReferenceVmFragment referenceVm() {
        return this.referenceVm;
    }

    /**
     * Set the referenceVm property: Details specific to Reference Vm.
     *
     * @param referenceVm the referenceVm value to set.
     * @return the ResourceSettingsFragment object itself.
     */
    public ResourceSettingsFragment withReferenceVm(ReferenceVmFragment referenceVm) {
        this.referenceVm = referenceVm;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (referenceVm() != null) {
            referenceVm().validate();
        }
    }
}
