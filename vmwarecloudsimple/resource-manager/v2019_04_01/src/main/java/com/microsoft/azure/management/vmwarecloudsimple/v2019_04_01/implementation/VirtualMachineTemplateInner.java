/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualDiskController;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualDisk;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNic;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Virtual machine template model.
 */
@JsonFlatten
public class VirtualMachineTemplateInner {
    /**
     * virtual machine template id (privateCloudId:vsphereId).
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Azure region.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * {virtualMachineTemplateName}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The amount of memory.
     */
    @JsonProperty(value = "properties.amountOfRam")
    private Integer amountOfRam;

    /**
     * The list of Virtual Disk Controllers.
     */
    @JsonProperty(value = "properties.controllers")
    private List<VirtualDiskController> controllers;

    /**
     * The description of Virtual Machine Template.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The list of Virtual Disks.
     */
    @JsonProperty(value = "properties.disks")
    private List<VirtualDisk> disks;

    /**
     * Expose Guest OS or not.
     */
    @JsonProperty(value = "properties.exposeToGuestVM")
    private Boolean exposeToGuestVM;

    /**
     * The Guest OS.
     */
    @JsonProperty(value = "properties.guestOS", access = JsonProperty.Access.WRITE_ONLY)
    private String guestOS;

    /**
     * The Guest OS types.
     */
    @JsonProperty(value = "properties.guestOSType", access = JsonProperty.Access.WRITE_ONLY)
    private String guestOSType;

    /**
     * The list of Virtual NICs.
     */
    @JsonProperty(value = "properties.nics")
    private List<VirtualNic> nics;

    /**
     * The number of CPU cores.
     */
    @JsonProperty(value = "properties.numberOfCores")
    private Integer numberOfCores;

    /**
     * path to folder.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /**
     * The Private Cloud Id.
     */
    @JsonProperty(value = "properties.privateCloudId", required = true)
    private String privateCloudId;

    /**
     * The list of VSphere networks.
     */
    @JsonProperty(value = "properties.vSphereNetworks")
    private List<String> vSphereNetworks;

    /**
     * The tags from VSphere.
     */
    @JsonProperty(value = "properties.vSphereTags")
    private List<String> vSphereTags;

    /**
     * The VMware tools version.
     */
    @JsonProperty(value = "properties.vmwaretools", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwaretools;

    /**
     * {resourceProviderNamespace}/{resourceType}.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get virtual machine template id (privateCloudId:vsphereId).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get azure region.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set azure region.
     *
     * @param location the location value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get {virtualMachineTemplateName}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the amount of memory.
     *
     * @return the amountOfRam value
     */
    public Integer amountOfRam() {
        return this.amountOfRam;
    }

    /**
     * Set the amount of memory.
     *
     * @param amountOfRam the amountOfRam value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withAmountOfRam(Integer amountOfRam) {
        this.amountOfRam = amountOfRam;
        return this;
    }

    /**
     * Get the list of Virtual Disk Controllers.
     *
     * @return the controllers value
     */
    public List<VirtualDiskController> controllers() {
        return this.controllers;
    }

    /**
     * Set the list of Virtual Disk Controllers.
     *
     * @param controllers the controllers value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withControllers(List<VirtualDiskController> controllers) {
        this.controllers = controllers;
        return this;
    }

    /**
     * Get the description of Virtual Machine Template.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of Virtual Machine Template.
     *
     * @param description the description value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the list of Virtual Disks.
     *
     * @return the disks value
     */
    public List<VirtualDisk> disks() {
        return this.disks;
    }

    /**
     * Set the list of Virtual Disks.
     *
     * @param disks the disks value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withDisks(List<VirtualDisk> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * Get expose Guest OS or not.
     *
     * @return the exposeToGuestVM value
     */
    public Boolean exposeToGuestVM() {
        return this.exposeToGuestVM;
    }

    /**
     * Set expose Guest OS or not.
     *
     * @param exposeToGuestVM the exposeToGuestVM value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withExposeToGuestVM(Boolean exposeToGuestVM) {
        this.exposeToGuestVM = exposeToGuestVM;
        return this;
    }

    /**
     * Get the Guest OS.
     *
     * @return the guestOS value
     */
    public String guestOS() {
        return this.guestOS;
    }

    /**
     * Get the Guest OS types.
     *
     * @return the guestOSType value
     */
    public String guestOSType() {
        return this.guestOSType;
    }

    /**
     * Get the list of Virtual NICs.
     *
     * @return the nics value
     */
    public List<VirtualNic> nics() {
        return this.nics;
    }

    /**
     * Set the list of Virtual NICs.
     *
     * @param nics the nics value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withNics(List<VirtualNic> nics) {
        this.nics = nics;
        return this;
    }

    /**
     * Get the number of CPU cores.
     *
     * @return the numberOfCores value
     */
    public Integer numberOfCores() {
        return this.numberOfCores;
    }

    /**
     * Set the number of CPU cores.
     *
     * @param numberOfCores the numberOfCores value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    /**
     * Get path to folder.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set path to folder.
     *
     * @param path the path value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the Private Cloud Id.
     *
     * @return the privateCloudId value
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Set the Private Cloud Id.
     *
     * @param privateCloudId the privateCloudId value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withPrivateCloudId(String privateCloudId) {
        this.privateCloudId = privateCloudId;
        return this;
    }

    /**
     * Get the list of VSphere networks.
     *
     * @return the vSphereNetworks value
     */
    public List<String> vSphereNetworks() {
        return this.vSphereNetworks;
    }

    /**
     * Set the list of VSphere networks.
     *
     * @param vSphereNetworks the vSphereNetworks value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withVSphereNetworks(List<String> vSphereNetworks) {
        this.vSphereNetworks = vSphereNetworks;
        return this;
    }

    /**
     * Get the tags from VSphere.
     *
     * @return the vSphereTags value
     */
    public List<String> vSphereTags() {
        return this.vSphereTags;
    }

    /**
     * Set the tags from VSphere.
     *
     * @param vSphereTags the vSphereTags value to set
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withVSphereTags(List<String> vSphereTags) {
        this.vSphereTags = vSphereTags;
        return this;
    }

    /**
     * Get the VMware tools version.
     *
     * @return the vmwaretools value
     */
    public String vmwaretools() {
        return this.vmwaretools;
    }

    /**
     * Get {resourceProviderNamespace}/{resourceType}.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
