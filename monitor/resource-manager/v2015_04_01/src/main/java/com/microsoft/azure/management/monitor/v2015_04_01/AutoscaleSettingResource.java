/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2015_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2015_04_01.implementation.MonitorManager;
import java.util.List;
import com.microsoft.azure.management.monitor.v2015_04_01.implementation.AutoscaleSettingResourceInner;

/**
 * Type representing AutoscaleSettingResource.
 */
public interface AutoscaleSettingResource extends HasInner<AutoscaleSettingResourceInner>, Resource, GroupableResourceCore<MonitorManager, AutoscaleSettingResourceInner>, HasResourceGroup, Refreshable<AutoscaleSettingResource>, Updatable<AutoscaleSettingResource.Update>, HasManager<MonitorManager> {
    /**
     * @return the autoscaleSettingResourceName value.
     */
    String autoscaleSettingResourceName();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the notifications value.
     */
    List<AutoscaleNotification> notifications();

    /**
     * @return the profiles value.
     */
    List<AutoscaleProfile> profiles();

    /**
     * @return the targetResourceUri value.
     */
    String targetResourceUri();

    /**
     * The entirety of the AutoscaleSettingResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithProfiles, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AutoscaleSettingResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AutoscaleSettingResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AutoscaleSettingResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithProfiles> {
        }

        /**
         * The stage of the autoscalesettingresource definition allowing to specify Profiles.
         */
        interface WithProfiles {
           /**
            * Specifies profiles.
            * @param profiles the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified
            * @return the next definition stage
*/
            WithCreate withProfiles(List<AutoscaleProfile> profiles);
        }

        /**
         * The stage of the autoscalesettingresource definition allowing to specify AutoscaleSettingResourceName.
         */
        interface WithAutoscaleSettingResourceName {
            /**
             * Specifies autoscaleSettingResourceName.
             * @param autoscaleSettingResourceName the name of the autoscale setting
             * @return the next definition stage
             */
            WithCreate withAutoscaleSettingResourceName(String autoscaleSettingResourceName);
        }

        /**
         * The stage of the autoscalesettingresource definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is 'true'
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the autoscalesettingresource definition allowing to specify Notifications.
         */
        interface WithNotifications {
            /**
             * Specifies notifications.
             * @param notifications the collection of notifications
             * @return the next definition stage
             */
            WithCreate withNotifications(List<AutoscaleNotification> notifications);
        }

        /**
         * The stage of the autoscalesettingresource definition allowing to specify TargetResourceUri.
         */
        interface WithTargetResourceUri {
            /**
             * Specifies targetResourceUri.
             * @param targetResourceUri the resource identifier of the resource that the autoscale setting should be added to
             * @return the next definition stage
             */
            WithCreate withTargetResourceUri(String targetResourceUri);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AutoscaleSettingResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAutoscaleSettingResourceName, DefinitionStages.WithEnabled, DefinitionStages.WithNotifications, DefinitionStages.WithTargetResourceUri {
        }
    }
    /**
     * The template for a AutoscaleSettingResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AutoscaleSettingResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithEnabled, UpdateStages.WithNotifications, UpdateStages.WithTargetResourceUri {
    }

    /**
     * Grouping of AutoscaleSettingResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the autoscalesettingresource update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is 'true'
             * @return the next update stage
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the autoscalesettingresource update allowing to specify Notifications.
         */
        interface WithNotifications {
            /**
             * Specifies notifications.
             * @param notifications the collection of notifications
             * @return the next update stage
             */
            Update withNotifications(List<AutoscaleNotification> notifications);
        }

        /**
         * The stage of the autoscalesettingresource update allowing to specify TargetResourceUri.
         */
        interface WithTargetResourceUri {
            /**
             * Specifies targetResourceUri.
             * @param targetResourceUri the resource identifier of the resource that the autoscale setting should be added to
             * @return the next update stage
             */
            Update withTargetResourceUri(String targetResourceUri);
        }

    }
}
