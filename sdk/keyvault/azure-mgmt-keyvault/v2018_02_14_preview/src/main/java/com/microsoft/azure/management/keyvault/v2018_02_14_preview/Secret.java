/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.keyvault.v2018_02_14_preview.implementation.SecretInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.keyvault.v2018_02_14_preview.implementation.KeyVaultManager;
import java.util.Map;

/**
 * Type representing Secret.
 */
public interface Secret extends HasInner<SecretInner>, Indexable, Refreshable<Secret>, Updatable<Secret.Update>, HasManager<KeyVaultManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    SecretProperties properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Secret definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVault, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Secret definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Secret definition.
         */
        interface Blank extends WithVault {
        }

        /**
         * The stage of the secret definition allowing to specify Vault.
         */
        interface WithVault {
           /**
            * Specifies resourceGroupName, vaultName.
            * @param resourceGroupName The name of the Resource Group to which the vault belongs
            * @param vaultName Name of the vault
            * @return the next definition stage
            */
            WithProperties withExistingVault(String resourceGroupName, String vaultName);
        }

        /**
         * The stage of the secret definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the secret
            * @return the next definition stage
            */
            WithCreate withProperties(SecretProperties properties);
        }

        /**
         * The stage of the secret definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags that will be assigned to the secret
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Secret>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Secret update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Secret>, UpdateStages.WithProperties, UpdateStages.WithTags {
    }

    /**
     * Grouping of Secret update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the secret update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the secret
             * @return the next update stage
             */
            Update withProperties(SecretPatchProperties properties);
        }

        /**
         * The stage of the secret update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags that will be assigned to the secret
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
