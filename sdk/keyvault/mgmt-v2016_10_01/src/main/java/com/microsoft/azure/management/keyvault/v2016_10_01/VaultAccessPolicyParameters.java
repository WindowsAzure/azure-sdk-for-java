/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.VaultAccessPolicyParametersInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.KeyVaultManager;
import java.util.List;

/**
 * Type representing VaultAccessPolicyParameters.
 */
public interface VaultAccessPolicyParameters extends HasInner<VaultAccessPolicyParametersInner>, Indexable, Updatable<VaultAccessPolicyParameters.Update>, HasManager<KeyVaultManager> {
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
    VaultAccessPolicyProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a VaultAccessPolicyParameters update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VaultAccessPolicyParameters>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of VaultAccessPolicyParameters update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vaultaccesspolicyparameters update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the access policy
             * @return the next update stage
             */
            Update withProperties(VaultAccessPolicyProperties properties);
        }

    }
}
