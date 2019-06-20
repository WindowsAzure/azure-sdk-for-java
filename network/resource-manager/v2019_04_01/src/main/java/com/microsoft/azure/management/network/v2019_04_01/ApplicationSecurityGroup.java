/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.ApplicationSecurityGroupInner;

/**
 * Type representing ApplicationSecurityGroup.
 */
public interface ApplicationSecurityGroup extends HasInner<ApplicationSecurityGroupInner>, Resource, GroupableResourceCore<NetworkManager, ApplicationSecurityGroupInner>, HasResourceGroup, Refreshable<ApplicationSecurityGroup>, Updatable<ApplicationSecurityGroup.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * The entirety of the ApplicationSecurityGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ApplicationSecurityGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ApplicationSecurityGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ApplicationSecurityGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ApplicationSecurityGroup>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a ApplicationSecurityGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ApplicationSecurityGroup>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of ApplicationSecurityGroup update stages.
     */
    interface UpdateStages {
    }
}
