/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.JobAgentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;
import java.util.Map;

/**
 * Type representing JobAgent.
 */
public interface JobAgent extends HasInner<JobAgentInner>, Indexable, Refreshable<JobAgent>, Updatable<JobAgent.Update>, HasManager<SqlManager> {
    /**
     * @return the databaseId value.
     */
    String databaseId();

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
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the state value.
     */
    JobAgentState state();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the JobAgent definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithDatabaseId, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of JobAgent definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a JobAgent definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the jobagent definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithDatabaseId withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the jobagent definition allowing to specify DatabaseId.
         */
        interface WithDatabaseId {
           /**
            * Specifies databaseId.
            */
            WithLocation withDatabaseId(String databaseId);
        }

        /**
         * The stage of the jobagent definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the jobagent definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the jobagent definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<JobAgent>, DefinitionStages.WithSku, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a JobAgent update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<JobAgent>, UpdateStages.WithSku, UpdateStages.WithTags {
    }

    /**
     * Grouping of JobAgent update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the jobagent update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the jobagent update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
