// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedTransparentDataEncryptionInner;

/** An immutable client-side representation of ManagedTransparentDataEncryption. */
public interface ManagedTransparentDataEncryption {
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
     * Gets the state property: Specifies the state of the transparent data encryption.
     *
     * @return the state value.
     */
    TransparentDataEncryptionState state();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ManagedTransparentDataEncryptionInner
     * object.
     *
     * @return the inner object.
     */
    ManagedTransparentDataEncryptionInner innerModel();

    /** The entirety of the ManagedTransparentDataEncryption definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ManagedTransparentDataEncryption definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedTransparentDataEncryption definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ManagedTransparentDataEncryption definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, managedInstanceName, databaseName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param managedInstanceName The name of the managed instance.
             * @param databaseName The name of the managed database for which the security alert policy is defined.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabase(String resourceGroupName, String managedInstanceName, String databaseName);
        }
        /**
         * The stage of the ManagedTransparentDataEncryption definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedTransparentDataEncryption create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedTransparentDataEncryption create(Context context);
        }
        /** The stage of the ManagedTransparentDataEncryption definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the transparent data encryption..
             *
             * @param state Specifies the state of the transparent data encryption.
             * @return the next definition stage.
             */
            WithCreate withState(TransparentDataEncryptionState state);
        }
    }
    /**
     * Begins update for the ManagedTransparentDataEncryption resource.
     *
     * @return the stage of resource update.
     */
    ManagedTransparentDataEncryption.Update update();

    /** The template for ManagedTransparentDataEncryption update. */
    interface Update extends UpdateStages.WithState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedTransparentDataEncryption apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedTransparentDataEncryption apply(Context context);
    }
    /** The ManagedTransparentDataEncryption update stages. */
    interface UpdateStages {
        /** The stage of the ManagedTransparentDataEncryption update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the transparent data encryption..
             *
             * @param state Specifies the state of the transparent data encryption.
             * @return the next definition stage.
             */
            Update withState(TransparentDataEncryptionState state);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedTransparentDataEncryption refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedTransparentDataEncryption refresh(Context context);
}
