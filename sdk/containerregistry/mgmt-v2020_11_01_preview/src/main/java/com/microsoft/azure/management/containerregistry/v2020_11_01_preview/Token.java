/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation.TokenInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation.ContainerRegistryManager;
import org.joda.time.DateTime;

/**
 * Type representing Token.
 */
public interface Token extends HasInner<TokenInner>, Indexable, Refreshable<Token>, Updatable<Token.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the credentials value.
     */
    TokenCredentialsProperties credentials();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the scopeMapId value.
     */
    String scopeMapId();

    /**
     * @return the status value.
     */
    TokenStatus status();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Token definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Token definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Token definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the token definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithCreate withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the token definition allowing to specify Credentials.
         */
        interface WithCredentials {
            /**
             * Specifies credentials.
             * @param credentials The credentials that can be used for authenticating the token
             * @return the next definition stage
             */
            WithCreate withCredentials(TokenCredentialsProperties credentials);
        }

        /**
         * The stage of the token definition allowing to specify ScopeMapId.
         */
        interface WithScopeMapId {
            /**
             * Specifies scopeMapId.
             * @param scopeMapId The resource ID of the scope map to which the token will be associated with
             * @return the next definition stage
             */
            WithCreate withScopeMapId(String scopeMapId);
        }

        /**
         * The stage of the token definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The status of the token example enabled or disabled. Possible values include: 'enabled', 'disabled'
             * @return the next definition stage
             */
            WithCreate withStatus(TokenStatus status);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Token>, DefinitionStages.WithCredentials, DefinitionStages.WithScopeMapId, DefinitionStages.WithStatus {
        }
    }
    /**
     * The template for a Token update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Token>, UpdateStages.WithCredentials, UpdateStages.WithScopeMapId, UpdateStages.WithStatus {
    }

    /**
     * Grouping of Token update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the token update allowing to specify Credentials.
         */
        interface WithCredentials {
            /**
             * Specifies credentials.
             * @param credentials The credentials that can be used for authenticating the token
             * @return the next update stage
             */
            Update withCredentials(TokenCredentialsProperties credentials);
        }

        /**
         * The stage of the token update allowing to specify ScopeMapId.
         */
        interface WithScopeMapId {
            /**
             * Specifies scopeMapId.
             * @param scopeMapId The resource ID of the scope map to which the token will be associated with
             * @return the next update stage
             */
            Update withScopeMapId(String scopeMapId);
        }

        /**
         * The stage of the token update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The status of the token example enabled or disabled. Possible values include: 'enabled', 'disabled'
             * @return the next update stage
             */
            Update withStatus(TokenStatus status);
        }

    }
}
