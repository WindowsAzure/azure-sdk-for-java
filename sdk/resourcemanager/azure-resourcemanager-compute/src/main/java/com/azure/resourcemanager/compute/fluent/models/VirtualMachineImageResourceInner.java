// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Virtual machine image resource information. */
@Fluent
public class VirtualMachineImageResourceInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineImageResourceInner.class);

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The supported Azure location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Specifies the tags that are assigned to the virtual machine. For more
     * information about using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The extended location of the Virtual Machine.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: The supported Azure location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The supported Azure location of the resource.
     *
     * @param location the location value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Specifies the tags that are assigned to the virtual machine. For more information about
     * using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Specifies the tags that are assigned to the virtual machine. For more information about
     * using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     *
     * @param tags the tags value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location of the Virtual Machine.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the Virtual Machine.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineImageResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model VirtualMachineImageResourceInner"));
        }
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model VirtualMachineImageResourceInner"));
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
