/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.DatabaseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.DBforPostgreSQLManager;

/**
 * Type representing Database.
 */
public interface Database extends HasInner<DatabaseInner>, Indexable, Refreshable<Database>, Updatable<Database.Update>, HasManager<DBforPostgreSQLManager> {
    /**
     * @return the charset value.
     */
    String charset();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Database definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Database definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Database definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the database definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param serverName The name of the server
            * @return the next definition stage
            */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the database definition allowing to specify Charset.
         */
        interface WithCharset {
            /**
             * Specifies charset.
             * @param charset The charset of the database
             * @return the next definition stage
             */
            WithCreate withCharset(String charset);
        }

        /**
         * The stage of the database definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation The collation of the database
             * @return the next definition stage
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Database>, DefinitionStages.WithCharset, DefinitionStages.WithCollation {
        }
    }
    /**
     * The template for a Database update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Database>, UpdateStages.WithCharset, UpdateStages.WithCollation {
    }

    /**
     * Grouping of Database update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the database update allowing to specify Charset.
         */
        interface WithCharset {
            /**
             * Specifies charset.
             * @param charset The charset of the database
             * @return the next update stage
             */
            Update withCharset(String charset);
        }

        /**
         * The stage of the database update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation The collation of the database
             * @return the next update stage
             */
            Update withCollation(String collation);
        }

    }
}
