/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.NotebookWorkspaceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.CosmosDBManager;

/**
 * Type representing NotebookWorkspace.
 */
public interface NotebookWorkspace extends HasInner<NotebookWorkspaceInner>, Indexable, Refreshable<NotebookWorkspace>, Updatable<NotebookWorkspace.Update>, HasManager<CosmosDBManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the notebookServerEndpoint value.
     */
    String notebookServerEndpoint();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NotebookWorkspace definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabaseAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NotebookWorkspace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NotebookWorkspace definition.
         */
        interface Blank extends WithDatabaseAccount {
        }

        /**
         * The stage of the notebookworkspace definition allowing to specify DatabaseAccount.
         */
        interface WithDatabaseAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param accountName Cosmos DB database account name
            * @return the next definition stage
            */
            WithCreate withExistingDatabaseAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NotebookWorkspace> {
        }
    }
    /**
     * The template for a NotebookWorkspace update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NotebookWorkspace> {
    }

    /**
     * Grouping of NotebookWorkspace update stages.
     */
    interface UpdateStages {
    }
}
