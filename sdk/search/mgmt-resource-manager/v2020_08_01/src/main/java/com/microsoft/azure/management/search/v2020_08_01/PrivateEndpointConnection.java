/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.search.v2020_08_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.search.v2020_08_01.implementation.SearchManager;
import java.util.UUID;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Refreshable<PrivateEndpointConnection>, Updatable<PrivateEndpointConnection.Update>, HasManager<SearchManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    PrivateEndpointConnectionProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a PrivateEndpointConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpointConnection>, UpdateStages.WithProperties, UpdateStages.WithSearchManagementRequestOptions {
    }

    /**
     * Grouping of PrivateEndpointConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privateendpointconnection update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Describes the properties of an existing Private Endpoint connection to the Azure Cognitive Search service
             * @return the next update stage
             */
            Update withProperties(PrivateEndpointConnectionProperties properties);
        }

        /**
         * The stage of the privateendpointconnection update allowing to specify SearchManagementRequestOptions.
         */
        interface WithSearchManagementRequestOptions {
            /**
             * Specifies searchManagementRequestOptions.
             * @param searchManagementRequestOptions Additional parameters for the operation
             * @return the next update stage
             */
            Update withSearchManagementRequestOptions(SearchManagementRequestOptions searchManagementRequestOptions);
        }

    }
}
