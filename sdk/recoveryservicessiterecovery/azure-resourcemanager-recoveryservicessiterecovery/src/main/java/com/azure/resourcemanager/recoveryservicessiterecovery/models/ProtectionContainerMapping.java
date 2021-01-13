// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerMappingInner;

/** An immutable client-side representation of ProtectionContainerMapping. */
public interface ProtectionContainerMapping {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The custom data.
     *
     * @return the properties value.
     */
    ProtectionContainerMappingProperties properties();

    /**
     * Gets the location property: Resource Location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner
     * com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerMappingInner object.
     *
     * @return the inner object.
     */
    ProtectionContainerMappingInner innerModel();

    /** The entirety of the ProtectionContainerMapping definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ProtectionContainerMapping definition stages. */
    interface DefinitionStages {
        /** The first stage of the ProtectionContainerMapping definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ProtectionContainerMapping definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceName, resourceGroupName, fabricName, protectionContainerName.
             *
             * @param resourceName The name of the recovery services vault.
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param fabricName Fabric name.
             * @param protectionContainerName Protection container name.
             * @return the next definition stage.
             */
            WithCreate withExistingReplicationProtectionContainer(
                String resourceName, String resourceGroupName, String fabricName, String protectionContainerName);
        }
        /**
         * The stage of the ProtectionContainerMapping definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ProtectionContainerMapping create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProtectionContainerMapping create(Context context);
        }
        /** The stage of the ProtectionContainerMapping definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Configure protection input properties..
             *
             * @param properties Configure protection input properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(CreateProtectionContainerMappingInputProperties properties);
        }
    }
    /**
     * Begins update for the ProtectionContainerMapping resource.
     *
     * @return the stage of resource update.
     */
    ProtectionContainerMapping.Update update();

    /** The template for ProtectionContainerMapping update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ProtectionContainerMapping apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProtectionContainerMapping apply(Context context);
    }
    /** The ProtectionContainerMapping update stages. */
    interface UpdateStages {
        /** The stage of the ProtectionContainerMapping update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Update protection container mapping input properties..
             *
             * @param properties Update protection container mapping input properties.
             * @return the next definition stage.
             */
            Update withProperties(UpdateProtectionContainerMappingInputProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ProtectionContainerMapping refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProtectionContainerMapping refresh(Context context);
}
