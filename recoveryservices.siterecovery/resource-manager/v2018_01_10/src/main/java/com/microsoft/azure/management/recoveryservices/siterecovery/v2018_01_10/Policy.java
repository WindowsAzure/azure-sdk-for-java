/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.PolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.RecoveryServicesManager;

/**
 * Type representing Policy.
 */
public interface Policy extends HasInner<PolicyInner>, Indexable, Refreshable<Policy>, Updatable<Policy.Update>, HasManager<RecoveryServicesManager> {
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
    PolicyProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Policy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVault, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Policy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Policy definition.
         */
        interface Blank extends WithVault {
        }

        /**
         * The stage of the policy definition allowing to specify Vault.
         */
        interface WithVault {
           /**
            * Specifies .
            * @return the next definition stage
            */
            WithProperties withExistingVault();
        }

        /**
         * The stage of the policy definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Policy creation properties
            * @return the next definition stage
            */
            WithCreate withProperties(CreatePolicyInputProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Policy> {
        }
    }
    /**
     * The template for a Policy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Policy>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of Policy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the policy update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The ReplicationProviderSettings
             * @return the next update stage
             */
            Update withProperties(UpdatePolicyInputProperties properties);
        }

    }
}
