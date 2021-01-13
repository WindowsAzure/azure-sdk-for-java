// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;

/** An immutable client-side representation of StorageClassificationMapping. */
public interface StorageClassificationMapping {
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
     * Gets the properties property: Properties of the storage mapping object.
     *
     * @return the properties value.
     */
    StorageClassificationMappingProperties properties();

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
     * com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner object.
     *
     * @return the inner object.
     */
    StorageClassificationMappingInner innerModel();

    /** The entirety of the StorageClassificationMapping definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The StorageClassificationMapping definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageClassificationMapping definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the StorageClassificationMapping definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceName, resourceGroupName, fabricName, storageClassificationName.
             *
             * @param resourceName The name of the recovery services vault.
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param fabricName Fabric name.
             * @param storageClassificationName Storage classification name.
             * @return the next definition stage.
             */
            WithCreate withExistingReplicationStorageClassification(
                String resourceName, String resourceGroupName, String fabricName, String storageClassificationName);
        }
        /**
         * The stage of the StorageClassificationMapping definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StorageClassificationMapping create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageClassificationMapping create(Context context);
        }
        /** The stage of the StorageClassificationMapping definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Storage mapping input properties..
             *
             * @param properties Storage mapping input properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(StorageMappingInputProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StorageClassificationMapping refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageClassificationMapping refresh(Context context);
}
