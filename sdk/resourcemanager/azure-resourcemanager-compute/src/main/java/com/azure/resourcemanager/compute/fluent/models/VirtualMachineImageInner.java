// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.AutomaticOSUpgradeProperties;
import com.azure.resourcemanager.compute.models.DataDiskImage;
import com.azure.resourcemanager.compute.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.models.OSDiskImage;
import com.azure.resourcemanager.compute.models.PurchasePlan;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a Virtual Machine Image. */
@JsonFlatten
@Fluent
public class VirtualMachineImageInner extends VirtualMachineImageResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineImageInner.class);

    /*
     * Used for establishing the purchase context of any 3rd Party artifact
     * through MarketPlace.
     */
    @JsonProperty(value = "properties.plan")
    private PurchasePlan plan;

    /*
     * Contains the os disk image information.
     */
    @JsonProperty(value = "properties.osDiskImage")
    private OSDiskImage osDiskImage;

    /*
     * The dataDiskImages property.
     */
    @JsonProperty(value = "properties.dataDiskImages")
    private List<DataDiskImage> dataDiskImages;

    /*
     * Describes automatic OS upgrade properties on the image.
     */
    @JsonProperty(value = "properties.automaticOSUpgradeProperties")
    private AutomaticOSUpgradeProperties automaticOSUpgradeProperties;

    /*
     * Specifies the HyperVGeneration Type
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGenerationTypes hyperVGeneration;

    /**
     * Get the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     *
     * @return the plan value.
     */
    public PurchasePlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withPlan(PurchasePlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the osDiskImage property: Contains the os disk image information.
     *
     * @return the osDiskImage value.
     */
    public OSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: Contains the os disk image information.
     *
     * @param osDiskImage the osDiskImage value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withOsDiskImage(OSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get the dataDiskImages property: The dataDiskImages property.
     *
     * @return the dataDiskImages value.
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages property: The dataDiskImages property.
     *
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withDataDiskImages(List<DataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

    /**
     * Get the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     *
     * @return the automaticOSUpgradeProperties value.
     */
    public AutomaticOSUpgradeProperties automaticOSUpgradeProperties() {
        return this.automaticOSUpgradeProperties;
    }

    /**
     * Set the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     *
     * @param automaticOSUpgradeProperties the automaticOSUpgradeProperties value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withAutomaticOSUpgradeProperties(
        AutomaticOSUpgradeProperties automaticOSUpgradeProperties) {
        this.automaticOSUpgradeProperties = automaticOSUpgradeProperties;
        return this;
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGeneration Type.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGeneration Type.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (plan() != null) {
            plan().validate();
        }
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
        if (automaticOSUpgradeProperties() != null) {
            automaticOSUpgradeProperties().validate();
        }
    }
}
