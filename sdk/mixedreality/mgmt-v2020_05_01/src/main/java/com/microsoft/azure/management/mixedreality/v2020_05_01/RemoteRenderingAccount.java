/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mixedreality.v2020_05_01.implementation.MixedRealityManager;
import com.microsoft.azure.management.mixedreality.v2020_05_01.implementation.RemoteRenderingAccountInner;

/**
 * Type representing RemoteRenderingAccount.
 */
public interface RemoteRenderingAccount extends HasInner<RemoteRenderingAccountInner>, Resource, GroupableResourceCore<MixedRealityManager, RemoteRenderingAccountInner>, HasResourceGroup, Refreshable<RemoteRenderingAccount>, Updatable<RemoteRenderingAccount.Update>, HasManager<MixedRealityManager> {
    /**
     * @return the accountDomain value.
     */
    String accountDomain();

    /**
     * @return the accountId value.
     */
    String accountId();

    /**
     * @return the identity value.
     */
    RemoteRenderingAccountIdentity identity();

    /**
     * The entirety of the RemoteRenderingAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RemoteRenderingAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RemoteRenderingAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the RemoteRenderingAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity the identity parameter value
             * @return the next definition stage
             */
            WithCreate withIdentity(RemoteRenderingAccountIdentity identity);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RemoteRenderingAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIdentity {
        }
    }
    /**
     * The template for a RemoteRenderingAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RemoteRenderingAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithIdentity {
    }

    /**
     * Grouping of RemoteRenderingAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the remoterenderingaccount update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity the identity parameter value
             * @return the next update stage
             */
            Update withIdentity(RemoteRenderingAccountIdentity identity);
        }

    }
}
