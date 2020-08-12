/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.implementation.MachineExtensionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.implementation.HybridComputeManager;
import java.util.Map;

/**
 * Type representing MachineExtension.
 */
public interface MachineExtension extends HasInner<MachineExtensionInner>, Indexable, Refreshable<MachineExtension>, Updatable<MachineExtension.Update>, HasManager<HybridComputeManager> {
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
    MachineExtensionPropertiesInstanceView instanceView();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the machineExtensionType value.
     */
    String machineExtensionType();

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
     * The entirety of the MachineExtension definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMachine, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of MachineExtension definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a MachineExtension definition.
         */
        interface Blank extends WithMachine {
        }

        /**
         * The stage of the machineextension definition allowing to specify Machine.
         */
        interface WithMachine {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName The name of the resource group
            * @param name The name of the machine where the extension should be created or updated
            * @return the next definition stage
            */
            WithLocation withExistingMachine(String resourceGroupName, String name);
        }

        /**
         * The stage of the machineextension definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The geo-location where the resource lives
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the machineextension definition allowing to specify AutoUpgradeMinorVersion.
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
         * The stage of the machineextension definition allowing to specify ForceUpdateTag.
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
         * The stage of the machineextension definition allowing to specify InstanceView.
         */
        interface WithInstanceView {
            /**
             * Specifies instanceView.
             * @param instanceView The machine extension instance view
             * @return the next definition stage
             */
            WithCreate withInstanceView(MachineExtensionPropertiesInstanceView instanceView);
        }

        /**
         * The stage of the machineextension definition allowing to specify MachineExtensionType.
         */
        interface WithMachineExtensionType {
            /**
             * Specifies machineExtensionType.
             * @param machineExtensionType Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next definition stage
             */
            WithCreate withMachineExtensionType(String machineExtensionType);
        }

        /**
         * The stage of the machineextension definition allowing to specify ProtectedSettings.
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
         * The stage of the machineextension definition allowing to specify Publisher.
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
         * The stage of the machineextension definition allowing to specify Settings.
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
         * The stage of the machineextension definition allowing to specify Tags.
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
         * The stage of the machineextension definition allowing to specify TypeHandlerVersion.
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
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<MachineExtension>, DefinitionStages.WithAutoUpgradeMinorVersion, DefinitionStages.WithForceUpdateTag, DefinitionStages.WithInstanceView, DefinitionStages.WithMachineExtensionType, DefinitionStages.WithProtectedSettings, DefinitionStages.WithPublisher, DefinitionStages.WithSettings, DefinitionStages.WithTags, DefinitionStages.WithTypeHandlerVersion {
        }
    }
    /**
     * The template for a MachineExtension update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<MachineExtension>, UpdateStages.WithAutoUpgradeMinorVersion, UpdateStages.WithForceUpdateTag, UpdateStages.WithProtectedSettings, UpdateStages.WithPublisher, UpdateStages.WithSettings, UpdateStages.WithTags, UpdateStages.WithType, UpdateStages.WithTypeHandlerVersion {
    }

    /**
     * Grouping of MachineExtension update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the machineextension update allowing to specify AutoUpgradeMinorVersion.
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
         * The stage of the machineextension update allowing to specify ForceUpdateTag.
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
         * The stage of the machineextension update allowing to specify ProtectedSettings.
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
         * The stage of the machineextension update allowing to specify Publisher.
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
         * The stage of the machineextension update allowing to specify Settings.
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
         * The stage of the machineextension update allowing to specify Tags.
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
         * The stage of the machineextension update allowing to specify Type.
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
         * The stage of the machineextension update allowing to specify TypeHandlerVersion.
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
