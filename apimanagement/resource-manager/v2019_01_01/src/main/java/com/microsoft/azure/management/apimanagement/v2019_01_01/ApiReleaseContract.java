/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiReleaseContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;
import org.joda.time.DateTime;

/**
 * Type representing ApiReleaseContract.
 */
public interface ApiReleaseContract extends HasInner<ApiReleaseContractInner>, Indexable, Refreshable<ApiReleaseContract>, Updatable<ApiReleaseContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the apiId value.
     */
    String apiId();

    /**
     * @return the createdDateTime value.
     */
    DateTime createdDateTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the notes value.
     */
    String notes();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updatedDateTime value.
     */
    DateTime updatedDateTime();

    /**
     * The entirety of the ApiReleaseContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithIfMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ApiReleaseContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ApiReleaseContract definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the apireleasecontract definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, serviceName, apiId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API identifier. Must be unique in the current API Management service instance
            * @return the next definition stage
            */
            WithIfMatch withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the apireleasecontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the apireleasecontract definition allowing to specify ApiId.
         */
        interface WithApiId {
            /**
             * Specifies apiId.
             * @param apiId Identifier of the API the release belongs to
             * @return the next definition stage
             */
            WithCreate withApiId(String apiId);
        }

        /**
         * The stage of the apireleasecontract definition allowing to specify Notes.
         */
        interface WithNotes {
            /**
             * Specifies notes.
             * @param notes Release Notes
             * @return the next definition stage
             */
            WithCreate withNotes(String notes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ApiReleaseContract>, DefinitionStages.WithApiId, DefinitionStages.WithNotes {
        }
    }
    /**
     * The template for a ApiReleaseContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ApiReleaseContract>, UpdateStages.WithIfMatch, UpdateStages.WithApiId, UpdateStages.WithNotes {
    }

    /**
     * Grouping of ApiReleaseContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the apireleasecontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the apireleasecontract update allowing to specify ApiId.
         */
        interface WithApiId {
            /**
             * Specifies apiId.
             * @param apiId Identifier of the API the release belongs to
             * @return the next update stage
             */
            Update withApiId(String apiId);
        }

        /**
         * The stage of the apireleasecontract update allowing to specify Notes.
         */
        interface WithNotes {
            /**
             * Specifies notes.
             * @param notes Release Notes
             * @return the next update stage
             */
            Update withNotes(String notes);
        }

    }
}
