// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountPartnerInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of IntegrationAccountPartner. */
public interface IntegrationAccountPartner {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the partnerType property: The partner type.
     *
     * @return the partnerType value.
     */
    PartnerType partnerType();

    /**
     * Gets the createdTime property: The created time.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the changedTime property: The changed time.
     *
     * @return the changedTime value.
     */
    OffsetDateTime changedTime();

    /**
     * Gets the metadata property: The metadata.
     *
     * @return the metadata value.
     */
    Object metadata();

    /**
     * Gets the content property: The partner content.
     *
     * @return the content value.
     */
    PartnerContent content();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.IntegrationAccountPartnerInner object.
     *
     * @return the inner object.
     */
    IntegrationAccountPartnerInner innerModel();

    /** The entirety of the IntegrationAccountPartner definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithPartnerType,
            DefinitionStages.WithContent,
            DefinitionStages.WithCreate {
    }
    /** The IntegrationAccountPartner definition stages. */
    interface DefinitionStages {
        /** The first stage of the IntegrationAccountPartner definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the IntegrationAccountPartner definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the IntegrationAccountPartner definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, integrationAccountName.
             *
             * @param resourceGroupName The resource group name.
             * @param integrationAccountName The integration account name.
             * @return the next definition stage.
             */
            WithPartnerType withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName);
        }
        /** The stage of the IntegrationAccountPartner definition allowing to specify partnerType. */
        interface WithPartnerType {
            /**
             * Specifies the partnerType property: The partner type..
             *
             * @param partnerType The partner type.
             * @return the next definition stage.
             */
            WithContent withPartnerType(PartnerType partnerType);
        }
        /** The stage of the IntegrationAccountPartner definition allowing to specify content. */
        interface WithContent {
            /**
             * Specifies the content property: The partner content..
             *
             * @param content The partner content.
             * @return the next definition stage.
             */
            WithCreate withContent(PartnerContent content);
        }
        /**
         * The stage of the IntegrationAccountPartner definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithMetadata {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IntegrationAccountPartner create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IntegrationAccountPartner create(Context context);
        }
        /** The stage of the IntegrationAccountPartner definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the IntegrationAccountPartner definition allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The metadata..
             *
             * @param metadata The metadata.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Object metadata);
        }
    }
    /**
     * Begins update for the IntegrationAccountPartner resource.
     *
     * @return the stage of resource update.
     */
    IntegrationAccountPartner.Update update();

    /** The template for IntegrationAccountPartner update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithPartnerType,
            UpdateStages.WithMetadata,
            UpdateStages.WithContent {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IntegrationAccountPartner apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IntegrationAccountPartner apply(Context context);
    }
    /** The IntegrationAccountPartner update stages. */
    interface UpdateStages {
        /** The stage of the IntegrationAccountPartner update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the IntegrationAccountPartner update allowing to specify partnerType. */
        interface WithPartnerType {
            /**
             * Specifies the partnerType property: The partner type..
             *
             * @param partnerType The partner type.
             * @return the next definition stage.
             */
            Update withPartnerType(PartnerType partnerType);
        }
        /** The stage of the IntegrationAccountPartner update allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The metadata..
             *
             * @param metadata The metadata.
             * @return the next definition stage.
             */
            Update withMetadata(Object metadata);
        }
        /** The stage of the IntegrationAccountPartner update allowing to specify content. */
        interface WithContent {
            /**
             * Specifies the content property: The partner content..
             *
             * @param content The partner content.
             * @return the next definition stage.
             */
            Update withContent(PartnerContent content);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IntegrationAccountPartner refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IntegrationAccountPartner refresh(Context context);

    /**
     * Get the content callback url.
     *
     * @param listContentCallbackUrl The callback url parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    WorkflowTriggerCallbackUrl listContentCallbackUrl(GetCallbackUrlParameters listContentCallbackUrl);

    /**
     * Get the content callback url.
     *
     * @param listContentCallbackUrl The callback url parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(
        GetCallbackUrlParameters listContentCallbackUrl, Context context);
}
