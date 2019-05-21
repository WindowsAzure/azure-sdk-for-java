/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.DevTestLabManager;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.LabInner;

/**
 * Type representing Lab.
 */
public interface Lab extends HasInner<LabInner>, Resource, GroupableResourceCore<DevTestLabManager, LabInner>, HasResourceGroup, Refreshable<Lab>, Updatable<Lab.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the announcement value.
     */
    LabAnnouncementProperties announcement();

    /**
     * @return the artifactsStorageAccount value.
     */
    String artifactsStorageAccount();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the defaultPremiumStorageAccount value.
     */
    String defaultPremiumStorageAccount();

    /**
     * @return the defaultStorageAccount value.
     */
    String defaultStorageAccount();

    /**
     * @return the environmentPermission value.
     */
    EnvironmentPermission environmentPermission();

    /**
     * @return the extendedProperties value.
     */
    Map<String, String> extendedProperties();

    /**
     * @return the labStorageType value.
     */
    StorageType labStorageType();

    /**
     * @return the loadBalancerId value.
     */
    String loadBalancerId();

    /**
     * @return the mandatoryArtifactsResourceIdsLinux value.
     */
    List<String> mandatoryArtifactsResourceIdsLinux();

    /**
     * @return the mandatoryArtifactsResourceIdsWindows value.
     */
    List<String> mandatoryArtifactsResourceIdsWindows();

    /**
     * @return the networkSecurityGroupId value.
     */
    String networkSecurityGroupId();

    /**
     * @return the premiumDataDisks value.
     */
    PremiumDataDisk premiumDataDisks();

    /**
     * @return the premiumDataDiskStorageAccount value.
     */
    String premiumDataDiskStorageAccount();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicIpId value.
     */
    String publicIpId();

    /**
     * @return the support value.
     */
    LabSupportProperties support();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the vaultName value.
     */
    String vaultName();

    /**
     * @return the vmCreationResourceGroup value.
     */
    String vmCreationResourceGroup();

    /**
     * The entirety of the Lab definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Lab definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Lab definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Lab definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the lab definition allowing to specify Announcement.
         */
        interface WithAnnouncement {
            /**
             * Specifies announcement.
             * @param announcement The properties of any lab announcement associated with this lab
             * @return the next definition stage
             */
            WithCreate withAnnouncement(LabAnnouncementProperties announcement);
        }

        /**
         * The stage of the lab definition allowing to specify EnvironmentPermission.
         */
        interface WithEnvironmentPermission {
            /**
             * Specifies environmentPermission.
             * @param environmentPermission The access rights to be granted to the user when provisioning an environment. Possible values include: 'Reader', 'Contributor'
             * @return the next definition stage
             */
            WithCreate withEnvironmentPermission(EnvironmentPermission environmentPermission);
        }

        /**
         * The stage of the lab definition allowing to specify ExtendedProperties.
         */
        interface WithExtendedProperties {
            /**
             * Specifies extendedProperties.
             * @param extendedProperties Extended properties of the lab used for experimental features
             * @return the next definition stage
             */
            WithCreate withExtendedProperties(Map<String, String> extendedProperties);
        }

        /**
         * The stage of the lab definition allowing to specify LabStorageType.
         */
        interface WithLabStorageType {
            /**
             * Specifies labStorageType.
             * @param labStorageType Type of storage used by the lab. It can be either Premium or Standard. Default is Premium. Possible values include: 'Standard', 'Premium'
             * @return the next definition stage
             */
            WithCreate withLabStorageType(StorageType labStorageType);
        }

        /**
         * The stage of the lab definition allowing to specify MandatoryArtifactsResourceIdsLinux.
         */
        interface WithMandatoryArtifactsResourceIdsLinux {
            /**
             * Specifies mandatoryArtifactsResourceIdsLinux.
             * @param mandatoryArtifactsResourceIdsLinux The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user
             * @return the next definition stage
             */
            WithCreate withMandatoryArtifactsResourceIdsLinux(List<String> mandatoryArtifactsResourceIdsLinux);
        }

        /**
         * The stage of the lab definition allowing to specify MandatoryArtifactsResourceIdsWindows.
         */
        interface WithMandatoryArtifactsResourceIdsWindows {
            /**
             * Specifies mandatoryArtifactsResourceIdsWindows.
             * @param mandatoryArtifactsResourceIdsWindows The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user
             * @return the next definition stage
             */
            WithCreate withMandatoryArtifactsResourceIdsWindows(List<String> mandatoryArtifactsResourceIdsWindows);
        }

        /**
         * The stage of the lab definition allowing to specify PremiumDataDisks.
         */
        interface WithPremiumDataDisks {
            /**
             * Specifies premiumDataDisks.
             * @param premiumDataDisks The setting to enable usage of premium data disks.
 When its value is 'Enabled', creation of standard or premium data disks is allowed.
 When its value is 'Disabled', only creation of standard data disks is allowed. Possible values include: 'Disabled', 'Enabled'
             * @return the next definition stage
             */
            WithCreate withPremiumDataDisks(PremiumDataDisk premiumDataDisks);
        }

        /**
         * The stage of the lab definition allowing to specify Support.
         */
        interface WithSupport {
            /**
             * Specifies support.
             * @param support The properties of any lab support message associated with this lab
             * @return the next definition stage
             */
            WithCreate withSupport(LabSupportProperties support);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Lab>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAnnouncement, DefinitionStages.WithEnvironmentPermission, DefinitionStages.WithExtendedProperties, DefinitionStages.WithLabStorageType, DefinitionStages.WithMandatoryArtifactsResourceIdsLinux, DefinitionStages.WithMandatoryArtifactsResourceIdsWindows, DefinitionStages.WithPremiumDataDisks, DefinitionStages.WithSupport {
        }
    }
    /**
     * The template for a Lab update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Lab>, Resource.UpdateWithTags<Update>, UpdateStages.WithAnnouncement, UpdateStages.WithEnvironmentPermission, UpdateStages.WithExtendedProperties, UpdateStages.WithLabStorageType, UpdateStages.WithMandatoryArtifactsResourceIdsLinux, UpdateStages.WithMandatoryArtifactsResourceIdsWindows, UpdateStages.WithPremiumDataDisks, UpdateStages.WithSupport {
    }

    /**
     * Grouping of Lab update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the lab update allowing to specify Announcement.
         */
        interface WithAnnouncement {
            /**
             * Specifies announcement.
             * @param announcement The properties of any lab announcement associated with this lab
             * @return the next update stage
             */
            Update withAnnouncement(LabAnnouncementPropertiesFragment announcement);
        }

        /**
         * The stage of the lab update allowing to specify EnvironmentPermission.
         */
        interface WithEnvironmentPermission {
            /**
             * Specifies environmentPermission.
             * @param environmentPermission The access rights to be granted to the user when provisioning an environment. Possible values include: 'Reader', 'Contributor'
             * @return the next update stage
             */
            Update withEnvironmentPermission(EnvironmentPermission environmentPermission);
        }

        /**
         * The stage of the lab update allowing to specify ExtendedProperties.
         */
        interface WithExtendedProperties {
            /**
             * Specifies extendedProperties.
             * @param extendedProperties Extended properties of the lab used for experimental features
             * @return the next update stage
             */
            Update withExtendedProperties(Map<String, String> extendedProperties);
        }

        /**
         * The stage of the lab update allowing to specify LabStorageType.
         */
        interface WithLabStorageType {
            /**
             * Specifies labStorageType.
             * @param labStorageType Type of storage used by the lab. It can be either Premium or Standard. Default is Premium. Possible values include: 'Standard', 'Premium'
             * @return the next update stage
             */
            Update withLabStorageType(StorageType labStorageType);
        }

        /**
         * The stage of the lab update allowing to specify MandatoryArtifactsResourceIdsLinux.
         */
        interface WithMandatoryArtifactsResourceIdsLinux {
            /**
             * Specifies mandatoryArtifactsResourceIdsLinux.
             * @param mandatoryArtifactsResourceIdsLinux The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user
             * @return the next update stage
             */
            Update withMandatoryArtifactsResourceIdsLinux(List<String> mandatoryArtifactsResourceIdsLinux);
        }

        /**
         * The stage of the lab update allowing to specify MandatoryArtifactsResourceIdsWindows.
         */
        interface WithMandatoryArtifactsResourceIdsWindows {
            /**
             * Specifies mandatoryArtifactsResourceIdsWindows.
             * @param mandatoryArtifactsResourceIdsWindows The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user
             * @return the next update stage
             */
            Update withMandatoryArtifactsResourceIdsWindows(List<String> mandatoryArtifactsResourceIdsWindows);
        }

        /**
         * The stage of the lab update allowing to specify PremiumDataDisks.
         */
        interface WithPremiumDataDisks {
            /**
             * Specifies premiumDataDisks.
             * @param premiumDataDisks The setting to enable usage of premium data disks.
 When its value is 'Enabled', creation of standard or premium data disks is allowed.
 When its value is 'Disabled', only creation of standard data disks is allowed. Possible values include: 'Disabled', 'Enabled'
             * @return the next update stage
             */
            Update withPremiumDataDisks(PremiumDataDisk premiumDataDisks);
        }

        /**
         * The stage of the lab update allowing to specify Support.
         */
        interface WithSupport {
            /**
             * Specifies support.
             * @param support The properties of any lab support message associated with this lab
             * @return the next update stage
             */
            Update withSupport(LabSupportPropertiesFragment support);
        }

    }
}
