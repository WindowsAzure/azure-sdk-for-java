/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ConfigurationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.PostgreSQLManager;

/**
 * Type representing Configuration.
 */
public interface Configuration extends HasInner<ConfigurationInner>, Indexable, Refreshable<Configuration>, Updatable<Configuration.Update>, HasManager<PostgreSQLManager> {
    /**
     * @return the allowedValues value.
     */
    String allowedValues();

    /**
     * @return the dataType value.
     */
    String dataType();

    /**
     * @return the defaultValue value.
     */
    String defaultValue();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the source value.
     */
    String source();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the value value.
     */
    String value();

    /**
     * The entirety of the Configuration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Configuration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Configuration definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the configuration definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the configuration definition allowing to specify Source.
         */
        interface WithSource {
            /**
             * Specifies source.
             */
            WithCreate withSource(String source);
        }

        /**
         * The stage of the configuration definition allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             */
            WithCreate withValue(String value);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Configuration>, DefinitionStages.WithSource, DefinitionStages.WithValue {
        }
    }
    /**
     * The template for a Configuration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Configuration>, UpdateStages.WithSource, UpdateStages.WithValue {
    }

    /**
     * Grouping of Configuration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the configuration update allowing to specify Source.
         */
        interface WithSource {
            /**
             * Specifies source.
             */
            Update withSource(String source);
        }

        /**
         * The stage of the configuration update allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             */
            Update withValue(String value);
        }

    }
}
