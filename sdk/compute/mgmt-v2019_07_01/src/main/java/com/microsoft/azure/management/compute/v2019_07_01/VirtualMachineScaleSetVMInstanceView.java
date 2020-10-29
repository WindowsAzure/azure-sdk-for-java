/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.VirtualMachineScaleSetVMInstanceViewInner;
import java.util.List;

/**
 * Type representing VirtualMachineScaleSetVMInstanceView.
 */
public interface VirtualMachineScaleSetVMInstanceView extends HasInner<VirtualMachineScaleSetVMInstanceViewInner>, HasManager<ComputeManager> {
    /**
     * @return the bootDiagnostics value.
     */
    BootDiagnosticsInstanceView bootDiagnostics();

    /**
     * @return the disks value.
     */
    List<DiskInstanceView> disks();

    /**
     * @return the extensions value.
     */
    List<VirtualMachineExtensionInstanceView> extensions();

    /**
     * @return the maintenanceRedeployStatus value.
     */
    MaintenanceRedeployStatus maintenanceRedeployStatus();

    /**
     * @return the placementGroupId value.
     */
    String placementGroupId();

    /**
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * @return the platformUpdateDomain value.
     */
    Integer platformUpdateDomain();

    /**
     * @return the rdpThumbPrint value.
     */
    String rdpThumbPrint();

    /**
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * @return the vmAgent value.
     */
    VirtualMachineAgentInstanceView vmAgent();

    /**
     * @return the vmHealth value.
     */
    VirtualMachineHealthStatus vmHealth();

}
