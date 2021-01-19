/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.RuleSetInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.CdnManager;

/**
 * Type representing RuleSet.
 */
public interface RuleSet extends HasInner<RuleSetInner>, Indexable, Refreshable<RuleSet>, Updatable<RuleSet.Update>, HasManager<CdnManager> {
    /**
     * @return the deploymentStatus value.
     */
    DeploymentStatus deploymentStatus();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    AfdProvisioningState provisioningState();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the RuleSet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProfile, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RuleSet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RuleSet definition.
         */
        interface Blank extends WithProfile {
        }

        /**
         * The stage of the ruleset definition allowing to specify Profile.
         */
        interface WithProfile {
           /**
            * Specifies resourceGroupName, profileName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param profileName Name of the CDN profile which is unique within the resource group
            * @return the next definition stage
            */
            WithCreate withExistingProfile(String resourceGroupName, String profileName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RuleSet> {
        }
    }
    /**
     * The template for a RuleSet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RuleSet> {
    }

    /**
     * Grouping of RuleSet update stages.
     */
    interface UpdateStages {
    }
}
