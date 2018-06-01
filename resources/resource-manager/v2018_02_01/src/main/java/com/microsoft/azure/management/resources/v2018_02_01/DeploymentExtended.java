/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.DeploymentExtendedInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager;

/**
 * Type representing DeploymentExtended.
 */
public interface DeploymentExtended extends HasInner<DeploymentExtendedInner>, Indexable, Updatable<DeploymentExtended.Update>, Refreshable<DeploymentExtended>, HasManager<ResourcesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    DeploymentPropertiesExtended properties();

    /**
     * The entirety of the DeploymentExtended definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DeploymentExtended definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DeploymentExtended definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the deploymentextended definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            */
            WithProperties withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the deploymentextended definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            */
            WithCreate withProperties(DeploymentProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DeploymentExtended> {
        }
    }
    /**
     * The template for a DeploymentExtended update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DeploymentExtended>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of DeploymentExtended update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the deploymentextended update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             */
            Update withProperties(DeploymentProperties properties);
        }

    }
}
