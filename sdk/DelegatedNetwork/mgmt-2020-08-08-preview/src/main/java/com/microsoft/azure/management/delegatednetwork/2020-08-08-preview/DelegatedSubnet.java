/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation.DelegatedSubnetInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation.DelegatedNetworkManager;

/**
 * Type representing DelegatedSubnet.
 */
public interface DelegatedSubnet extends HasInner<DelegatedSubnetInner>, Indexable, Updatable<DelegatedSubnet.Update>, HasManager<DelegatedNetworkManager> {
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
     * @return the state value.
     */
    DelegatedSubnetState state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DelegatedSubnet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProvider, DefinitionStages.WithControllerID, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DelegatedSubnet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DelegatedSubnet definition.
         */
        interface Blank extends WithProvider {
        }

        /**
         * The stage of the delegatedsubnet definition allowing to specify Provider.
         */
        interface WithProvider {
           /**
            * Specifies resourceGroupName, vnetName, subnetName.
            * @param resourceGroupName The name of the Azure Resource group of which a given DelegatedNetwork resource is part. This name must be at least 1 character in length, and no more than 90
            * @param vnetName The name of the virtual network. This name must be at least 1 character in length, and no more than 90
            * @param subnetName The name of the delegated subnet. This name must be at least 1 character in length, and no more than 90
            * @return the next definition stage
            */
            WithControllerID withExistingProvider(String resourceGroupName, String vnetName, String subnetName);
        }

        /**
         * The stage of the delegatedsubnet definition allowing to specify ControllerID.
         */
        interface WithControllerID {
           /**
            * Specifies controllerID.
            * @param controllerID Delegated Network Controller ID
            * @return the next definition stage
            */
            WithCreate withControllerID(String controllerID);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DelegatedSubnet> {
        }
    }
    /**
     * The template for a DelegatedSubnet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DelegatedSubnet>, UpdateStages.WithControllerID {
    }

    /**
     * Grouping of DelegatedSubnet update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the delegatedsubnet update allowing to specify ControllerID.
         */
        interface WithControllerID {
            /**
             * Specifies controllerID.
             * @param controllerID Delegated Network Controller ID
             * @return the next update stage
             */
            Update withControllerID(String controllerID);
        }

    }
}
