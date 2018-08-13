/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.ComputeManager;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineScaleSetVMInstanceViewInner;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineInner;

/**
 * Type representing VirtualMachine.
 */
public interface VirtualMachine extends HasInner<VirtualMachineInner>, Resource, GroupableResourceCore<ComputeManager, VirtualMachineInner>, HasResourceGroup, Refreshable<VirtualMachine>, Updatable<VirtualMachine.Update>, HasManager<ComputeManager> {
    /**
     * @return the availabilitySet value.
     */
    SubResource availabilitySet();

    /**
     * @return the diagnosticsProfile value.
     */
    DiagnosticsProfile diagnosticsProfile();

    /**
     * @return the hardwareProfile value.
     */
    HardwareProfile hardwareProfile();

    /**
     * @return the identity value.
     */
    VirtualMachineIdentity identity();

    /**
     * @return the instanceView value.
     */
    VirtualMachineScaleSetVMInstanceView instanceView();

    /**
     * @return the licenseType value.
     */
    String licenseType();

    /**
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * @return the plan value.
     */
    Plan plan();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resources value.
     */
    List<VirtualMachineExtension> resources();

    /**
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * @return the vmId value.
     */
    String vmId();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the VirtualMachine definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualMachine definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualMachine definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualMachine definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualmachine update allowing to specify AvailabilitySet.
         */
        interface WithAvailabilitySet {
            /**
             * Specifies availabilitySet.
             */
            WithCreate withAvailabilitySet(SubResource availabilitySet);
        }

        /**
         * The stage of the virtualmachine update allowing to specify DiagnosticsProfile.
         */
        interface WithDiagnosticsProfile {
            /**
             * Specifies diagnosticsProfile.
             */
            WithCreate withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify HardwareProfile.
         */
        interface WithHardwareProfile {
            /**
             * Specifies hardwareProfile.
             */
            WithCreate withHardwareProfile(HardwareProfile hardwareProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(VirtualMachineIdentity identity);
        }

        /**
         * The stage of the virtualmachine update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            WithCreate withLicenseType(String licenseType);
        }

        /**
         * The stage of the virtualmachine update allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             */
            WithCreate withNetworkProfile(NetworkProfile networkProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify OsProfile.
         */
        interface WithOsProfile {
            /**
             * Specifies osProfile.
             */
            WithCreate withOsProfile(OSProfile osProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             */
            WithCreate withPlan(Plan plan);
        }

        /**
         * The stage of the virtualmachine update allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             */
            WithCreate withStorageProfile(StorageProfile storageProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualMachine>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAvailabilitySet, DefinitionStages.WithDiagnosticsProfile, DefinitionStages.WithHardwareProfile, DefinitionStages.WithIdentity, DefinitionStages.WithLicenseType, DefinitionStages.WithNetworkProfile, DefinitionStages.WithOsProfile, DefinitionStages.WithPlan, DefinitionStages.WithStorageProfile, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a VirtualMachine update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualMachine>, Resource.UpdateWithTags<Update>, UpdateStages.WithAvailabilitySet, UpdateStages.WithDiagnosticsProfile, UpdateStages.WithHardwareProfile, UpdateStages.WithIdentity, UpdateStages.WithLicenseType, UpdateStages.WithNetworkProfile, UpdateStages.WithOsProfile, UpdateStages.WithPlan, UpdateStages.WithStorageProfile, UpdateStages.WithZones {
    }

    /**
     * Grouping of VirtualMachine update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualmachine {0} allowing to specify AvailabilitySet.
         */
        interface WithAvailabilitySet {
            /**
             * Specifies availabilitySet.
             */
            Update withAvailabilitySet(SubResource availabilitySet);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify DiagnosticsProfile.
         */
        interface WithDiagnosticsProfile {
            /**
             * Specifies diagnosticsProfile.
             */
            Update withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify HardwareProfile.
         */
        interface WithHardwareProfile {
            /**
             * Specifies hardwareProfile.
             */
            Update withHardwareProfile(HardwareProfile hardwareProfile);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            Update withIdentity(VirtualMachineIdentity identity);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            Update withLicenseType(String licenseType);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             */
            Update withNetworkProfile(NetworkProfile networkProfile);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify OsProfile.
         */
        interface WithOsProfile {
            /**
             * Specifies osProfile.
             */
            Update withOsProfile(OSProfile osProfile);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             */
            Update withPlan(Plan plan);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             */
            Update withStorageProfile(StorageProfile storageProfile);
        }

        /**
         * The stage of the virtualmachine {0} allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            Update withZones(List<String> zones);
        }

    }
}
