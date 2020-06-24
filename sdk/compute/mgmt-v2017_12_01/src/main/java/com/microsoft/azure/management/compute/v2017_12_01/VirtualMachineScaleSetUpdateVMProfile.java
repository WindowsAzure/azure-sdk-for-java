/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set virtual machine profile.
 */
public class VirtualMachineScaleSetUpdateVMProfile {
    /**
     * The virtual machine scale set OS profile.
     */
    @JsonProperty(value = "osProfile")
    private VirtualMachineScaleSetUpdateOSProfile osProfile;

    /**
     * The virtual machine scale set storage profile.
     */
    @JsonProperty(value = "storageProfile")
    private VirtualMachineScaleSetUpdateStorageProfile storageProfile;

    /**
     * The virtual machine scale set network profile.
     */
    @JsonProperty(value = "networkProfile")
    private VirtualMachineScaleSetUpdateNetworkProfile networkProfile;

    /**
     * The virtual machine scale set diagnostics profile.
     */
    @JsonProperty(value = "diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /**
     * The virtual machine scale set extension profile.
     */
    @JsonProperty(value = "extensionProfile")
    private VirtualMachineScaleSetExtensionProfile extensionProfile;

    /**
     * The license type, which is for bring your own license scenario.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * Get the osProfile value.
     *
     * @return the osProfile value
     */
    public VirtualMachineScaleSetUpdateOSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile value.
     *
     * @param osProfile the osProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withOsProfile(VirtualMachineScaleSetUpdateOSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public VirtualMachineScaleSetUpdateStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withStorageProfile(VirtualMachineScaleSetUpdateStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the networkProfile value.
     *
     * @return the networkProfile value
     */
    public VirtualMachineScaleSetUpdateNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile value.
     *
     * @param networkProfile the networkProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withNetworkProfile(VirtualMachineScaleSetUpdateNetworkProfile networkProfile) {
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
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the extensionProfile value.
     *
     * @return the extensionProfile value
     */
    public VirtualMachineScaleSetExtensionProfile extensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the extensionProfile value.
     *
     * @param extensionProfile the extensionProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withExtensionProfile(VirtualMachineScaleSetExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
        return this;
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
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

}
