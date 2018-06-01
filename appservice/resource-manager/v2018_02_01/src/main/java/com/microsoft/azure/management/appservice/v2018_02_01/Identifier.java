/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.IdentifierInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;

/**
 * Type representing Identifier.
 */
public interface Identifier extends HasInner<IdentifierInner>, Indexable, Refreshable<Identifier>, Updatable<Identifier.Update>, HasManager<AppServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identifierId value.
     */
    String identifierId();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Identifier definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSite, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Identifier definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Identifier definition.
         */
        interface Blank extends WithSite {
        }

        /**
         * The stage of the identifier definition allowing to specify Site.
         */
        interface WithSite {
           /**
            * Specifies resourceGroupName, name.
            */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the identifier definition allowing to specify IdentifierId.
         */
        interface WithIdentifierId {
            /**
             * Specifies identifierId.
             */
            WithCreate withIdentifierId(String identifierId);
        }

        /**
         * The stage of the identifier definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Identifier>, DefinitionStages.WithIdentifierId, DefinitionStages.WithKind {
        }
    }
    /**
     * The template for a Identifier update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Identifier>, UpdateStages.WithIdentifierId, UpdateStages.WithKind {
    }

    /**
     * Grouping of Identifier update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the identifier update allowing to specify IdentifierId.
         */
        interface WithIdentifierId {
            /**
             * Specifies identifierId.
             */
            Update withIdentifierId(String identifierId);
        }

        /**
         * The stage of the identifier update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

    }
}
