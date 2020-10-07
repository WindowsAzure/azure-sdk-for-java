/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.DesktopVirtualizationManager;
import java.util.List;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.WorkspaceInner;

/**
 * Type representing Workspace.
 */
public interface Workspace extends HasInner<WorkspaceInner>, Resource, GroupableResourceCore<DesktopVirtualizationManager, WorkspaceInner>, HasResourceGroup, Refreshable<Workspace>, Updatable<Workspace.Update>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the applicationGroupReferences value.
     */
    List<String> applicationGroupReferences();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * The entirety of the Workspace definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Workspace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Workspace definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Workspace definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the workspace definition allowing to specify ApplicationGroupReferences.
         */
        interface WithApplicationGroupReferences {
            /**
             * Specifies applicationGroupReferences.
             * @param applicationGroupReferences List of applicationGroup resource Ids
             * @return the next definition stage
             */
            WithCreate withApplicationGroupReferences(List<String> applicationGroupReferences);
        }

        /**
         * The stage of the workspace definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of Workspace
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the workspace definition allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of Workspace
             * @return the next definition stage
             */
            WithCreate withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Workspace>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithApplicationGroupReferences, DefinitionStages.WithDescription, DefinitionStages.WithFriendlyName {
        }
    }
    /**
     * The template for a Workspace update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Workspace>, Resource.UpdateWithTags<Update>, UpdateStages.WithApplicationGroupReferences, UpdateStages.WithDescription, UpdateStages.WithFriendlyName {
    }

    /**
     * Grouping of Workspace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the workspace update allowing to specify ApplicationGroupReferences.
         */
        interface WithApplicationGroupReferences {
            /**
             * Specifies applicationGroupReferences.
             * @param applicationGroupReferences List of applicationGroup links
             * @return the next update stage
             */
            Update withApplicationGroupReferences(List<String> applicationGroupReferences);
        }

        /**
         * The stage of the workspace update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of Workspace
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the workspace update allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of Workspace
             * @return the next update stage
             */
            Update withFriendlyName(String friendlyName);
        }

    }
}
