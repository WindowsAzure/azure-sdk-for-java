// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ImportExportExtensionsOperationResultInner;
import java.util.UUID;

/** An immutable client-side representation of ImportExportExtensionsOperationResult. */
public interface ImportExportExtensionsOperationResult {
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
     * Gets the requestId property: Request Id.
     *
     * @return the requestId value.
     */
    UUID requestId();

    /**
     * Gets the requestType property: Request type.
     *
     * @return the requestType value.
     */
    String requestType();

    /**
     * Gets the lastModifiedTime property: Last modified time.
     *
     * @return the lastModifiedTime value.
     */
    String lastModifiedTime();

    /**
     * Gets the serverName property: Server name.
     *
     * @return the serverName value.
     */
    String serverName();

    /**
     * Gets the databaseName property: Database name.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the status property: Operation status.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the errorMessage property: Error message.
     *
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ImportExportExtensionsOperationResultInner
     * object.
     *
     * @return the inner object.
     */
    ImportExportExtensionsOperationResultInner innerModel();

    /** The entirety of the ImportExportExtensionsOperationResult definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ImportExportExtensionsOperationResult definition stages. */
    interface DefinitionStages {
        /** The first stage of the ImportExportExtensionsOperationResult definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ImportExportExtensionsOperationResult definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName, databaseName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @param databaseName The name of the database.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabase(String resourceGroupName, String serverName, String databaseName);
        }
        /**
         * The stage of the ImportExportExtensionsOperationResult definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithOperationMode,
                DefinitionStages.WithStorageKeyType,
                DefinitionStages.WithStorageKey,
                DefinitionStages.WithStorageUri {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ImportExportExtensionsOperationResult create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ImportExportExtensionsOperationResult create(Context context);
        }
        /** The stage of the ImportExportExtensionsOperationResult definition allowing to specify operationMode. */
        interface WithOperationMode {
            /**
             * Specifies the operationMode property: Operation Mode..
             *
             * @param operationMode Operation Mode.
             * @return the next definition stage.
             */
            WithCreate withOperationMode(OperationMode operationMode);
        }
        /** The stage of the ImportExportExtensionsOperationResult definition allowing to specify storageKeyType. */
        interface WithStorageKeyType {
            /**
             * Specifies the storageKeyType property: Storage key type..
             *
             * @param storageKeyType Storage key type.
             * @return the next definition stage.
             */
            WithCreate withStorageKeyType(StorageKeyType storageKeyType);
        }
        /** The stage of the ImportExportExtensionsOperationResult definition allowing to specify storageKey. */
        interface WithStorageKey {
            /**
             * Specifies the storageKey property: Storage key..
             *
             * @param storageKey Storage key.
             * @return the next definition stage.
             */
            WithCreate withStorageKey(String storageKey);
        }
        /** The stage of the ImportExportExtensionsOperationResult definition allowing to specify storageUri. */
        interface WithStorageUri {
            /**
             * Specifies the storageUri property: Storage Uri..
             *
             * @param storageUri Storage Uri.
             * @return the next definition stage.
             */
            WithCreate withStorageUri(String storageUri);
        }
    }
    /**
     * Begins update for the ImportExportExtensionsOperationResult resource.
     *
     * @return the stage of resource update.
     */
    ImportExportExtensionsOperationResult.Update update();

    /** The template for ImportExportExtensionsOperationResult update. */
    interface Update
        extends UpdateStages.WithOperationMode,
            UpdateStages.WithStorageKeyType,
            UpdateStages.WithStorageKey,
            UpdateStages.WithStorageUri {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ImportExportExtensionsOperationResult apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ImportExportExtensionsOperationResult apply(Context context);
    }
    /** The ImportExportExtensionsOperationResult update stages. */
    interface UpdateStages {
        /** The stage of the ImportExportExtensionsOperationResult update allowing to specify operationMode. */
        interface WithOperationMode {
            /**
             * Specifies the operationMode property: Operation Mode..
             *
             * @param operationMode Operation Mode.
             * @return the next definition stage.
             */
            Update withOperationMode(OperationMode operationMode);
        }
        /** The stage of the ImportExportExtensionsOperationResult update allowing to specify storageKeyType. */
        interface WithStorageKeyType {
            /**
             * Specifies the storageKeyType property: Storage key type..
             *
             * @param storageKeyType Storage key type.
             * @return the next definition stage.
             */
            Update withStorageKeyType(StorageKeyType storageKeyType);
        }
        /** The stage of the ImportExportExtensionsOperationResult update allowing to specify storageKey. */
        interface WithStorageKey {
            /**
             * Specifies the storageKey property: Storage key..
             *
             * @param storageKey Storage key.
             * @return the next definition stage.
             */
            Update withStorageKey(String storageKey);
        }
        /** The stage of the ImportExportExtensionsOperationResult update allowing to specify storageUri. */
        interface WithStorageUri {
            /**
             * Specifies the storageUri property: Storage Uri..
             *
             * @param storageUri Storage Uri.
             * @return the next definition stage.
             */
            Update withStorageUri(String storageUri);
        }
    }
}
