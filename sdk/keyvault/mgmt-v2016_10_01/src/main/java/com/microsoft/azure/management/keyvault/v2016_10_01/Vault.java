/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.KeyVaultManager;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.VaultInner;

/**
 * Type representing Vault.
 */
public interface Vault extends HasInner<VaultInner>, Resource, GroupableResourceCore<KeyVaultManager, VaultInner>, HasResourceGroup, Refreshable<Vault>, Updatable<Vault.Update>, HasManager<KeyVaultManager> {
    /**
     * @return the properties value.
     */
    VaultProperties properties();

    /**
     * The entirety of the Vault definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Vault definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Vault definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Vault definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithProperties> {
        }

        /**
         * The stage of the vault definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the vault
            * @return the next definition stage
*/
            WithCreate withProperties(VaultProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Vault>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a Vault update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Vault>, Resource.UpdateWithTags<Update>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of Vault update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vault update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the vault
             * @return the next update stage
             */
            Update withProperties(VaultPatchProperties properties);
        }

    }
}
