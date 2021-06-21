// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of the Virtual Machine for which the restore point was created. The properties provided are
 * a subset and the snapshot of the overall Virtual Machine properties captured at the time of the restore point
 * creation.
 */
@Fluent
public final class RestorePointSourceMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointSourceMetadata.class);

    /*
     * Gets the hardware profile.
     */
    @JsonProperty(value = "hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Gets the storage profile.
     */
    @JsonProperty(value = "storageProfile")
    private RestorePointSourceVMStorageProfile storageProfile;

    /*
     * Gets the OS profile.
     */
    @JsonProperty(value = "osProfile")
    private OSProfile osProfile;

    /*
     * Gets the diagnostics profile.
     */
    @JsonProperty(value = "diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Gets the license type, which is for bring your own license scenario.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /*
     * Gets the virtual machine unique id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /*
     * Gets the security profile.
     */
    @JsonProperty(value = "securityProfile")
    private SecurityProfile securityProfile;

    /**
     * Get the hardwareProfile property: Gets the hardware profile.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Gets the hardware profile.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Gets the storage profile.
     *
     * @return the storageProfile value.
     */
    public RestorePointSourceVMStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Gets the storage profile.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withStorageProfile(RestorePointSourceVMStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile property: Gets the OS profile.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Gets the OS profile.
     *
     * @param osProfile the osProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Gets the diagnostics profile.
     *
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Gets the diagnostics profile.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the licenseType property: Gets the license type, which is for bring your own license scenario.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Gets the license type, which is for bring your own license scenario.
     *
     * @param licenseType the licenseType value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the vmId property: Gets the virtual machine unique id.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the vmId property: Gets the virtual machine unique id.
     *
     * @param vmId the vmId value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the securityProfile property: Gets the security profile.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Gets the security profile.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }
}
