/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.ApplicationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.DesktopVirtualizationManager;
import java.util.Map;

/**
 * Type representing Application.
 */
public interface Application extends HasInner<ApplicationInner>, Indexable, Refreshable<Application>, Updatable<Application.Update>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the applicationType value.
     */
    RemoteApplicationType applicationType();

    /**
     * @return the commandLineArguments value.
     */
    String commandLineArguments();

    /**
     * @return the commandLineSetting value.
     */
    CommandLineSetting commandLineSetting();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the filePath value.
     */
    String filePath();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the iconContent value.
     */
    byte[] iconContent();

    /**
     * @return the iconHash value.
     */
    String iconHash();

    /**
     * @return the iconIndex value.
     */
    Integer iconIndex();

    /**
     * @return the iconPath value.
     */
    String iconPath();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the msixPackageApplicationId value.
     */
    String msixPackageApplicationId();

    /**
     * @return the msixPackageFamilyName value.
     */
    String msixPackageFamilyName();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the showInPortal value.
     */
    Boolean showInPortal();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Application definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApplicationGroup, DefinitionStages.WithCommandLineSetting, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Application definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Application definition.
         */
        interface Blank extends WithApplicationGroup {
        }

        /**
         * The stage of the application definition allowing to specify ApplicationGroup.
         */
        interface WithApplicationGroup {
           /**
            * Specifies resourceGroupName, applicationGroupName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param applicationGroupName The name of the application group
            * @return the next definition stage
            */
            WithCommandLineSetting withExistingApplicationGroup(String resourceGroupName, String applicationGroupName);
        }

        /**
         * The stage of the application definition allowing to specify CommandLineSetting.
         */
        interface WithCommandLineSetting {
           /**
            * Specifies commandLineSetting.
            * @param commandLineSetting Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: 'DoNotAllow', 'Allow', 'Require'
            * @return the next definition stage
            */
            WithCreate withCommandLineSetting(CommandLineSetting commandLineSetting);
        }

        /**
         * The stage of the application definition allowing to specify ApplicationType.
         */
        interface WithApplicationType {
            /**
             * Specifies applicationType.
             * @param applicationType Resource Type of Application. Possible values include: 'InBuilt', 'MsixApplication'
             * @return the next definition stage
             */
            WithCreate withApplicationType(RemoteApplicationType applicationType);
        }

        /**
         * The stage of the application definition allowing to specify CommandLineArguments.
         */
        interface WithCommandLineArguments {
            /**
             * Specifies commandLineArguments.
             * @param commandLineArguments Command Line Arguments for Application
             * @return the next definition stage
             */
            WithCreate withCommandLineArguments(String commandLineArguments);
        }

        /**
         * The stage of the application definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of Application
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the application definition allowing to specify FilePath.
         */
        interface WithFilePath {
            /**
             * Specifies filePath.
             * @param filePath Specifies a path for the executable file for the application
             * @return the next definition stage
             */
            WithCreate withFilePath(String filePath);
        }

        /**
         * The stage of the application definition allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of Application
             * @return the next definition stage
             */
            WithCreate withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the application definition allowing to specify IconIndex.
         */
        interface WithIconIndex {
            /**
             * Specifies iconIndex.
             * @param iconIndex Index of the icon
             * @return the next definition stage
             */
            WithCreate withIconIndex(Integer iconIndex);
        }

        /**
         * The stage of the application definition allowing to specify IconPath.
         */
        interface WithIconPath {
            /**
             * Specifies iconPath.
             * @param iconPath Path to icon
             * @return the next definition stage
             */
            WithCreate withIconPath(String iconPath);
        }

        /**
         * The stage of the application definition allowing to specify MsixPackageApplicationId.
         */
        interface WithMsixPackageApplicationId {
            /**
             * Specifies msixPackageApplicationId.
             * @param msixPackageApplicationId Specifies the package application Id for MSIX applications
             * @return the next definition stage
             */
            WithCreate withMsixPackageApplicationId(String msixPackageApplicationId);
        }

        /**
         * The stage of the application definition allowing to specify MsixPackageFamilyName.
         */
        interface WithMsixPackageFamilyName {
            /**
             * Specifies msixPackageFamilyName.
             * @param msixPackageFamilyName Specifies the package family name for MSIX applications
             * @return the next definition stage
             */
            WithCreate withMsixPackageFamilyName(String msixPackageFamilyName);
        }

        /**
         * The stage of the application definition allowing to specify ShowInPortal.
         */
        interface WithShowInPortal {
            /**
             * Specifies showInPortal.
             * @param showInPortal Specifies whether to show the RemoteApp program in the RD Web Access server
             * @return the next definition stage
             */
            WithCreate withShowInPortal(Boolean showInPortal);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Application>, DefinitionStages.WithApplicationType, DefinitionStages.WithCommandLineArguments, DefinitionStages.WithDescription, DefinitionStages.WithFilePath, DefinitionStages.WithFriendlyName, DefinitionStages.WithIconIndex, DefinitionStages.WithIconPath, DefinitionStages.WithMsixPackageApplicationId, DefinitionStages.WithMsixPackageFamilyName, DefinitionStages.WithShowInPortal {
        }
    }
    /**
     * The template for a Application update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Application>, UpdateStages.WithApplicationType, UpdateStages.WithCommandLineArguments, UpdateStages.WithCommandLineSetting, UpdateStages.WithDescription, UpdateStages.WithFilePath, UpdateStages.WithFriendlyName, UpdateStages.WithIconIndex, UpdateStages.WithIconPath, UpdateStages.WithMsixPackageApplicationId, UpdateStages.WithMsixPackageFamilyName, UpdateStages.WithShowInPortal, UpdateStages.WithTags {
    }

    /**
     * Grouping of Application update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the application update allowing to specify ApplicationType.
         */
        interface WithApplicationType {
            /**
             * Specifies applicationType.
             * @param applicationType Resource Type of Application. Possible values include: 'InBuilt', 'MsixApplication'
             * @return the next update stage
             */
            Update withApplicationType(RemoteApplicationType applicationType);
        }

        /**
         * The stage of the application update allowing to specify CommandLineArguments.
         */
        interface WithCommandLineArguments {
            /**
             * Specifies commandLineArguments.
             * @param commandLineArguments Command Line Arguments for Application
             * @return the next update stage
             */
            Update withCommandLineArguments(String commandLineArguments);
        }

        /**
         * The stage of the application update allowing to specify CommandLineSetting.
         */
        interface WithCommandLineSetting {
            /**
             * Specifies commandLineSetting.
             * @param commandLineSetting Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: 'DoNotAllow', 'Allow', 'Require'
             * @return the next update stage
             */
            Update withCommandLineSetting(CommandLineSetting commandLineSetting);
        }

        /**
         * The stage of the application update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of Application
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the application update allowing to specify FilePath.
         */
        interface WithFilePath {
            /**
             * Specifies filePath.
             * @param filePath Specifies a path for the executable file for the application
             * @return the next update stage
             */
            Update withFilePath(String filePath);
        }

        /**
         * The stage of the application update allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of Application
             * @return the next update stage
             */
            Update withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the application update allowing to specify IconIndex.
         */
        interface WithIconIndex {
            /**
             * Specifies iconIndex.
             * @param iconIndex Index of the icon
             * @return the next update stage
             */
            Update withIconIndex(Integer iconIndex);
        }

        /**
         * The stage of the application update allowing to specify IconPath.
         */
        interface WithIconPath {
            /**
             * Specifies iconPath.
             * @param iconPath Path to icon
             * @return the next update stage
             */
            Update withIconPath(String iconPath);
        }

        /**
         * The stage of the application update allowing to specify MsixPackageApplicationId.
         */
        interface WithMsixPackageApplicationId {
            /**
             * Specifies msixPackageApplicationId.
             * @param msixPackageApplicationId Specifies the package application Id for MSIX applications
             * @return the next update stage
             */
            Update withMsixPackageApplicationId(String msixPackageApplicationId);
        }

        /**
         * The stage of the application update allowing to specify MsixPackageFamilyName.
         */
        interface WithMsixPackageFamilyName {
            /**
             * Specifies msixPackageFamilyName.
             * @param msixPackageFamilyName Specifies the package family name for MSIX applications
             * @return the next update stage
             */
            Update withMsixPackageFamilyName(String msixPackageFamilyName);
        }

        /**
         * The stage of the application update allowing to specify ShowInPortal.
         */
        interface WithShowInPortal {
            /**
             * Specifies showInPortal.
             * @param showInPortal Specifies whether to show the RemoteApp program in the RD Web Access server
             * @return the next update stage
             */
            Update withShowInPortal(Boolean showInPortal);
        }

        /**
         * The stage of the application update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags tags to be updated
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
