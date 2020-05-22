// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.compute.BootDiagnosticsInstanceView;
import com.azure.management.compute.DiskInstanceView;
import com.azure.management.compute.InstanceViewStatus;
import com.azure.management.compute.MaintenanceRedeployStatus;
import com.azure.management.compute.VirtualMachineAgentInstanceView;
import com.azure.management.compute.VirtualMachineExtensionInstanceView;
import com.azure.management.compute.VirtualMachineHealthStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetVMInstanceView model. */
@Fluent
public final class VirtualMachineScaleSetVMInstanceViewInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMInstanceViewInner.class);

    /*
     * The Update Domain count.
     */
    @JsonProperty(value = "platformUpdateDomain")
    private Integer platformUpdateDomain;

    /*
     * The Fault Domain count.
     */
    @JsonProperty(value = "platformFaultDomain")
    private Integer platformFaultDomain;

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
     * The disks information.
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
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /*
     * The placement group in which the VM is running. If the VM is deallocated
     * it will not have a placementGroupId.
     */
    @JsonProperty(value = "placementGroupId")
    private String placementGroupId;

    /**
     * Get the platformUpdateDomain property: The Update Domain count.
     *
     * @return the platformUpdateDomain value.
     */
    public Integer platformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Set the platformUpdateDomain property: The Update Domain count.
     *
     * @param platformUpdateDomain the platformUpdateDomain value to set.
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withPlatformUpdateDomain(Integer platformUpdateDomain) {
        this.platformUpdateDomain = platformUpdateDomain;
        return this;
    }

    /**
     * Get the platformFaultDomain property: The Fault Domain count.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain property: The Fault Domain count.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
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
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withRdpThumbPrint(String rdpThumbPrint) {
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
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withVmAgent(VirtualMachineAgentInstanceView vmAgent) {
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
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withMaintenanceRedeployStatus(
        MaintenanceRedeployStatus maintenanceRedeployStatus) {
        this.maintenanceRedeployStatus = maintenanceRedeployStatus;
        return this;
    }

    /**
     * Get the disks property: The disks information.
     *
     * @return the disks value.
     */
    public List<DiskInstanceView> disks() {
        return this.disks;
    }

    /**
     * Set the disks property: The disks information.
     *
     * @param disks the disks value to set.
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withDisks(List<DiskInstanceView> disks) {
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
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withExtensions(
        List<VirtualMachineExtensionInstanceView> extensions) {
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
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withBootDiagnostics(BootDiagnosticsInstanceView bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
        return this;
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
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the placementGroupId property: The placement group in which the VM is running. If the VM is deallocated it
     * will not have a placementGroupId.
     *
     * @return the placementGroupId value.
     */
    public String placementGroupId() {
        return this.placementGroupId;
    }

    /**
     * Set the placementGroupId property: The placement group in which the VM is running. If the VM is deallocated it
     * will not have a placementGroupId.
     *
     * @param placementGroupId the placementGroupId value to set.
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
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
    }
}
