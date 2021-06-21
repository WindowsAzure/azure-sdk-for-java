// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.BootDiagnosticsInstanceView;
import com.azure.resourcemanager.compute.generated.models.DiskInstanceView;
import com.azure.resourcemanager.compute.generated.models.HyperVGenerationType;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.MaintenanceRedeployStatus;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineAgentInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineHealthStatus;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePatchStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of a virtual machine. */
@Fluent
public final class VirtualMachineInstanceViewInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineInstanceViewInner.class);

    /*
     * Specifies the update domain of the virtual machine.
     */
    @JsonProperty(value = "platformUpdateDomain")
    private Integer platformUpdateDomain;

    /*
     * Specifies the fault domain of the virtual machine.
     */
    @JsonProperty(value = "platformFaultDomain")
    private Integer platformFaultDomain;

    /*
     * The computer name assigned to the virtual machine.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /*
     * The Operating System running on the virtual machine.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /*
     * The version of Operating System running on the virtual machine.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /*
     * Specifies the HyperVGeneration Type associated with a resource
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGenerationType hyperVGeneration;

    /*
     * The Remote desktop certificate thumbprint.
     */
    @JsonProperty(value = "rdpThumbPrint")
    private String rdpThumbPrint;

    /*
     * The VM Agent running on the virtual machine.
     */
    @JsonProperty(value = "vmAgent")
    private VirtualMachineAgentInstanceView vmAgent;

    /*
     * The Maintenance Operation status on the virtual machine.
     */
    @JsonProperty(value = "maintenanceRedeployStatus")
    private MaintenanceRedeployStatus maintenanceRedeployStatus;

    /*
     * The virtual machine disk information.
     */
    @JsonProperty(value = "disks")
    private List<DiskInstanceView> disks;

    /*
     * The extensions information.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineExtensionInstanceView> extensions;

    /*
     * The health status for the VM.
     */
    @JsonProperty(value = "vmHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineHealthStatus vmHealth;

    /*
     * Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. <br><br> You can easily
     * view the output of your console log. <br><br> Azure also enables you to
     * see a screenshot of the VM from the hypervisor.
     */
    @JsonProperty(value = "bootDiagnostics")
    private BootDiagnosticsInstanceView bootDiagnostics;

    /*
     * Resource id of the dedicated host, on which the virtual machine is
     * allocated through automatic placement, when the virtual machine is
     * associated with a dedicated host group that has automatic placement
     * enabled. <br><br>Minimum api-version: 2020-06-01.
     */
    @JsonProperty(value = "assignedHost", access = JsonProperty.Access.WRITE_ONLY)
    private String assignedHost;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /*
     * [Preview Feature] The status of virtual machine patch operations.
     */
    @JsonProperty(value = "patchStatus")
    private VirtualMachinePatchStatus patchStatus;

    /**
     * Get the platformUpdateDomain property: Specifies the update domain of the virtual machine.
     *
     * @return the platformUpdateDomain value.
     */
    public Integer platformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Set the platformUpdateDomain property: Specifies the update domain of the virtual machine.
     *
     * @param platformUpdateDomain the platformUpdateDomain value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withPlatformUpdateDomain(Integer platformUpdateDomain) {
        this.platformUpdateDomain = platformUpdateDomain;
        return this;
    }

    /**
     * Get the platformFaultDomain property: Specifies the fault domain of the virtual machine.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain property: Specifies the fault domain of the virtual machine.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get the computerName property: The computer name assigned to the virtual machine.
     *
     * @return the computerName value.
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set the computerName property: The computer name assigned to the virtual machine.
     *
     * @param computerName the computerName value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get the osName property: The Operating System running on the virtual machine.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName property: The Operating System running on the virtual machine.
     *
     * @param osName the osName value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the osVersion property: The version of Operating System running on the virtual machine.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: The version of Operating System running on the virtual machine.
     *
     * @param osVersion the osVersion value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGeneration Type associated with a resource.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationType hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGeneration Type associated with a resource.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withHyperVGeneration(HyperVGenerationType hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the rdpThumbPrint property: The Remote desktop certificate thumbprint.
     *
     * @return the rdpThumbPrint value.
     */
    public String rdpThumbPrint() {
        return this.rdpThumbPrint;
    }

    /**
     * Set the rdpThumbPrint property: The Remote desktop certificate thumbprint.
     *
     * @param rdpThumbPrint the rdpThumbPrint value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withRdpThumbPrint(String rdpThumbPrint) {
        this.rdpThumbPrint = rdpThumbPrint;
        return this;
    }

    /**
     * Get the vmAgent property: The VM Agent running on the virtual machine.
     *
     * @return the vmAgent value.
     */
    public VirtualMachineAgentInstanceView vmAgent() {
        return this.vmAgent;
    }

    /**
     * Set the vmAgent property: The VM Agent running on the virtual machine.
     *
     * @param vmAgent the vmAgent value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withVmAgent(VirtualMachineAgentInstanceView vmAgent) {
        this.vmAgent = vmAgent;
        return this;
    }

    /**
     * Get the maintenanceRedeployStatus property: The Maintenance Operation status on the virtual machine.
     *
     * @return the maintenanceRedeployStatus value.
     */
    public MaintenanceRedeployStatus maintenanceRedeployStatus() {
        return this.maintenanceRedeployStatus;
    }

    /**
     * Set the maintenanceRedeployStatus property: The Maintenance Operation status on the virtual machine.
     *
     * @param maintenanceRedeployStatus the maintenanceRedeployStatus value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withMaintenanceRedeployStatus(
        MaintenanceRedeployStatus maintenanceRedeployStatus) {
        this.maintenanceRedeployStatus = maintenanceRedeployStatus;
        return this;
    }

    /**
     * Get the disks property: The virtual machine disk information.
     *
     * @return the disks value.
     */
    public List<DiskInstanceView> disks() {
        return this.disks;
    }

    /**
     * Set the disks property: The virtual machine disk information.
     *
     * @param disks the disks value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withDisks(List<DiskInstanceView> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * Get the extensions property: The extensions information.
     *
     * @return the extensions value.
     */
    public List<VirtualMachineExtensionInstanceView> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The extensions information.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withExtensions(List<VirtualMachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the vmHealth property: The health status for the VM.
     *
     * @return the vmHealth value.
     */
    public VirtualMachineHealthStatus vmHealth() {
        return this.vmHealth;
    }

    /**
     * Get the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console Output
     * and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log.
     * &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     *
     * @return the bootDiagnostics value.
     */
    public BootDiagnosticsInstanceView bootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console Output
     * and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log.
     * &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     *
     * @param bootDiagnostics the bootDiagnostics value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withBootDiagnostics(BootDiagnosticsInstanceView bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
        return this;
    }

    /**
     * Get the assignedHost property: Resource id of the dedicated host, on which the virtual machine is allocated
     * through automatic placement, when the virtual machine is associated with a dedicated host group that has
     * automatic placement enabled. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the assignedHost value.
     */
    public String assignedHost() {
        return this.assignedHost;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the patchStatus property: [Preview Feature] The status of virtual machine patch operations.
     *
     * @return the patchStatus value.
     */
    public VirtualMachinePatchStatus patchStatus() {
        return this.patchStatus;
    }

    /**
     * Set the patchStatus property: [Preview Feature] The status of virtual machine patch operations.
     *
     * @param patchStatus the patchStatus value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withPatchStatus(VirtualMachinePatchStatus patchStatus) {
        this.patchStatus = patchStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmAgent() != null) {
            vmAgent().validate();
        }
        if (maintenanceRedeployStatus() != null) {
            maintenanceRedeployStatus().validate();
        }
        if (disks() != null) {
            disks().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
        if (vmHealth() != null) {
            vmHealth().validate();
        }
        if (bootDiagnostics() != null) {
            bootDiagnostics().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
        if (patchStatus() != null) {
            patchStatus().validate();
        }
    }
}
