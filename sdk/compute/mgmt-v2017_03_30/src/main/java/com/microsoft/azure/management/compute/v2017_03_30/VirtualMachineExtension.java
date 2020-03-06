/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.VirtualMachineExtensionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.ComputeManager;
import java.util.Map;

/**
 * Type representing VirtualMachineExtension.
 */
public interface VirtualMachineExtension extends HasInner<VirtualMachineExtensionInner>, Indexable, Refreshable<VirtualMachineExtension>, Updatable<VirtualMachineExtension.Update>, HasManager<ComputeManager> {
    /**
     * @return the autoUpgradeMinorVersion value.
     */
    Boolean autoUpgradeMinorVersion();

    /**
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the instanceView value.
     */
    VirtualMachineExtensionInstanceView instanceView();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protectedSettings value.
     */
    Object protectedSettings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publisher value.
     */
    String publisher();

    /**
     * @return the settings value.
     */
    Object settings();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the typeHandlerVersion value.
     */
    String typeHandlerVersion();

    /**
     * @return the virtualMachineExtensionType value.
     */
    String virtualMachineExtensionType();

    /**
     * The entirety of the VirtualMachineExtension definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualMachine, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualMachineExtension definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualMachineExtension definition.
         */
        interface Blank extends WithVirtualMachine {
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify VirtualMachine.
         */
        interface WithVirtualMachine {
           /**
            * Specifies resourceGroupName, vmName.
            * @param resourceGroupName The name of the resource group
            * @param vmName The name of the virtual machine where the extension should be created or updated
            * @return the next definition stage
            */
            WithLocation withExistingVirtualMachine(String resourceGroupName, String vmName);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify AutoUpgradeMinorVersion.
         */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies autoUpgradeMinorVersion.
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true
             * @return the next definition stage
             */
            WithCreate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed
             * @return the next definition stage
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify InstanceView.
         */
        interface WithInstanceView {
            /**
             * Specifies instanceView.
             * @param instanceView The virtual machine extension instance view
             * @return the next definition stage
             */
            WithCreate withInstanceView(VirtualMachineExtensionInstanceView instanceView);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify ProtectedSettings.
         */
        interface WithProtectedSettings {
            /**
             * Specifies protectedSettings.
             * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all
             * @return the next definition stage
             */
            WithCreate withProtectedSettings(Object protectedSettings);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify Publisher.
         */
        interface WithPublisher {
            /**
             * Specifies publisher.
             * @param publisher The name of the extension handler publisher
             * @return the next definition stage
             */
            WithCreate withPublisher(String publisher);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify Settings.
         */
        interface WithSettings {
            /**
             * Specifies settings.
             * @param settings Json formatted public settings for the extension
             * @return the next definition stage
             */
            WithCreate withSettings(Object settings);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify TypeHandlerVersion.
         */
        interface WithTypeHandlerVersion {
            /**
             * Specifies typeHandlerVersion.
             * @param typeHandlerVersion Specifies the version of the script handler
             * @return the next definition stage
             */
            WithCreate withTypeHandlerVersion(String typeHandlerVersion);
        }

        /**
         * The stage of the virtualmachineextension definition allowing to specify VirtualMachineExtensionType.
         */
        interface WithVirtualMachineExtensionType {
            /**
             * Specifies virtualMachineExtensionType.
             * @param virtualMachineExtensionType Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next definition stage
             */
            WithCreate withVirtualMachineExtensionType(String virtualMachineExtensionType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualMachineExtension>, DefinitionStages.WithAutoUpgradeMinorVersion, DefinitionStages.WithForceUpdateTag, DefinitionStages.WithInstanceView, DefinitionStages.WithProtectedSettings, DefinitionStages.WithPublisher, DefinitionStages.WithSettings, DefinitionStages.WithTags, DefinitionStages.WithTypeHandlerVersion, DefinitionStages.WithVirtualMachineExtensionType {
        }
    }
    /**
     * The template for a VirtualMachineExtension update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualMachineExtension>, UpdateStages.WithAutoUpgradeMinorVersion, UpdateStages.WithForceUpdateTag, UpdateStages.WithProtectedSettings, UpdateStages.WithPublisher, UpdateStages.WithSettings, UpdateStages.WithTags, UpdateStages.WithType, UpdateStages.WithTypeHandlerVersion {
    }

    /**
     * Grouping of VirtualMachineExtension update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualmachineextension update allowing to specify AutoUpgradeMinorVersion.
         */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies autoUpgradeMinorVersion.
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true
             * @return the next update stage
             */
            Update withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed
             * @return the next update stage
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify ProtectedSettings.
         */
        interface WithProtectedSettings {
            /**
             * Specifies protectedSettings.
             * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all
             * @return the next update stage
             */
            Update withProtectedSettings(Object protectedSettings);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify Publisher.
         */
        interface WithPublisher {
            /**
             * Specifies publisher.
             * @param publisher The name of the extension handler publisher
             * @return the next update stage
             */
            Update withPublisher(String publisher);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify Settings.
         */
        interface WithSettings {
            /**
             * Specifies settings.
             * @param settings Json formatted public settings for the extension
             * @return the next update stage
             */
            Update withSettings(Object settings);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify Type.
         */
        interface WithType {
            /**
             * Specifies type.
             * @param type Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next update stage
             */
            Update withType(String type);
        }

        /**
         * The stage of the virtualmachineextension update allowing to specify TypeHandlerVersion.
         */
        interface WithTypeHandlerVersion {
            /**
             * Specifies typeHandlerVersion.
             * @param typeHandlerVersion Specifies the version of the script handler
             * @return the next update stage
             */
            Update withTypeHandlerVersion(String typeHandlerVersion);
        }

    }
}
