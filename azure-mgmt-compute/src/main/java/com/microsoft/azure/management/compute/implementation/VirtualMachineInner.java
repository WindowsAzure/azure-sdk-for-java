/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.management.compute.Plan;
import com.microsoft.azure.management.compute.HardwareProfile;
import com.microsoft.azure.management.compute.StorageProfile;
import com.microsoft.azure.management.compute.OSProfile;
import com.microsoft.azure.management.compute.NetworkProfile;
import com.microsoft.azure.management.compute.DiagnosticsProfile;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.compute.VirtualMachineIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.compute.VirtualMachineInstanceView;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a Virtual Machine.
 */
@JsonFlatten
public class VirtualMachineInner extends Resource {
    /**
     * The purchase plan when deploying virtual machine from VM Marketplace
     * images.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /**
     * The hardware profile.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /**
     * The storage profile.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /**
     * The OS profile.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /**
     * The network profile.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /**
     * The diagnostics profile.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /**
     * The reference Id of the availability set to which the virtual machine
     * belongs.
     */
    @JsonProperty(value = "properties.availabilitySet")
    private SubResource availabilitySet;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The virtual machine instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineInstanceView instanceView;

    /**
     * Specifies that the image or disk that is being used was licensed
     * on-premises. This element is only used for images that contain the
     * Windows Server operating system.
     */
    @JsonProperty(value = "properties.licenseType")
    private String licenseType;

    /**
     * Specifies the VM unique ID which is a 128-bits identifier that is
     * encoded and stored in all Azure IaaS VMs SMBIOS and can be read using
     * platform BIOS commands.
     */
    @JsonProperty(value = "properties.vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /**
     * The virtual machine child extension resources.
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineExtensionInner> resources;

    /**
     * The identity of the virtual machine, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineIdentity identity;

    /**
     * The virtual machine zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the hardwareProfile value.
     *
     * @return the hardwareProfile value
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile value.
     *
     * @param hardwareProfile the hardwareProfile value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile value.
     *
     * @return the osProfile value
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile value.
     *
     * @param osProfile the osProfile value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile value.
     *
     * @return the networkProfile value
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile value.
     *
     * @param networkProfile the networkProfile value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile value.
     *
     * @return the diagnosticsProfile value
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile value.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the availabilitySet value.
     *
     * @return the availabilitySet value
     */
    public SubResource availabilitySet() {
        return this.availabilitySet;
    }

    /**
     * Set the availabilitySet value.
     *
     * @param availabilitySet the availabilitySet value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withAvailabilitySet(SubResource availabilitySet) {
        this.availabilitySet = availabilitySet;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView value.
     *
     * @return the instanceView value
     */
    public VirtualMachineInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the licenseType value.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType value.
     *
     * @param licenseType the licenseType value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the vmId value.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<VirtualMachineExtensionInner> resources() {
        return this.resources;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public VirtualMachineIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withIdentity(VirtualMachineIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the zones value.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones value.
     *
     * @param zones the zones value to set
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
