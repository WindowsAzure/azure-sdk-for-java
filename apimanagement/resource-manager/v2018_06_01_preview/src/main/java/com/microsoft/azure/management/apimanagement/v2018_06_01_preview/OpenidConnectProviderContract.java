/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.OpenidConnectProviderContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;

/**
 * Type representing OpenidConnectProviderContract.
 */
public interface OpenidConnectProviderContract extends HasInner<OpenidConnectProviderContractInner>, Indexable, Updatable<OpenidConnectProviderContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the clientId value.
     */
    String clientId();

    /**
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metadataEndpoint value.
     */
    String metadataEndpoint();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the OpenidConnectProviderContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithClientId, DefinitionStages.WithDisplayName, DefinitionStages.WithMetadataEndpoint, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of OpenidConnectProviderContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a OpenidConnectProviderContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithClientId withIfMatch(String ifMatch);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify ClientId.
         */
        interface WithClientId {
           /**
            * Specifies clientId.
            * @param clientId Client ID of developer console which is the client application
            * @return the next definition stage
            */
            WithDisplayName withClientId(String clientId);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName User-friendly OpenID Connect Provider name
            * @return the next definition stage
            */
            WithMetadataEndpoint withDisplayName(String displayName);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify MetadataEndpoint.
         */
        interface WithMetadataEndpoint {
           /**
            * Specifies metadataEndpoint.
            * @param metadataEndpoint Metadata endpoint URI
            * @return the next definition stage
            */
            WithCreate withMetadataEndpoint(String metadataEndpoint);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify ClientSecret.
         */
        interface WithClientSecret {
            /**
             * Specifies clientSecret.
             * @param clientSecret Client Secret of developer console which is the client application
             * @return the next definition stage
             */
            WithCreate withClientSecret(String clientSecret);
        }

        /**
         * The stage of the openidconnectprovidercontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description User-friendly description of OpenID Connect Provider
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<OpenidConnectProviderContract>, DefinitionStages.WithClientSecret, DefinitionStages.WithDescription {
        }
    }
    /**
     * The template for a OpenidConnectProviderContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<OpenidConnectProviderContract>, UpdateStages.WithIfMatch, UpdateStages.WithClientSecret, UpdateStages.WithDescription {
    }

    /**
     * Grouping of OpenidConnectProviderContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the openidconnectprovidercontract update allowing to specify IfMatch.
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
         * The stage of the openidconnectprovidercontract update allowing to specify ClientSecret.
         */
        interface WithClientSecret {
            /**
             * Specifies clientSecret.
             * @param clientSecret Client Secret of developer console which is the client application
             * @return the next update stage
             */
            Update withClientSecret(String clientSecret);
        }

        /**
         * The stage of the openidconnectprovidercontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description User-friendly description of OpenID Connect Provider
             * @return the next update stage
             */
            Update withDescription(String description);
        }

    }
}
