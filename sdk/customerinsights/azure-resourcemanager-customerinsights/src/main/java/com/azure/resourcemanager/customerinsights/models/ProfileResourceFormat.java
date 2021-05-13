// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.ProfileResourceFormatInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ProfileResourceFormat. */
public interface ProfileResourceFormat {
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
     * Gets the attributes property: The attributes for the Type.
     *
     * @return the attributes value.
     */
    Map<String, List<String>> attributes();

    /**
     * Gets the description property: Localized descriptions for the property.
     *
     * @return the description value.
     */
    Map<String, String> description();

    /**
     * Gets the displayName property: Localized display names for the property.
     *
     * @return the displayName value.
     */
    Map<String, String> displayName();

    /**
     * Gets the localizedAttributes property: Any custom localized attributes for the Type.
     *
     * @return the localizedAttributes value.
     */
    Map<String, Map<String, String>> localizedAttributes();

    /**
     * Gets the smallImage property: Small Image associated with the Property or EntityType.
     *
     * @return the smallImage value.
     */
    String smallImage();

    /**
     * Gets the mediumImage property: Medium Image associated with the Property or EntityType.
     *
     * @return the mediumImage value.
     */
    String mediumImage();

    /**
     * Gets the largeImage property: Large Image associated with the Property or EntityType.
     *
     * @return the largeImage value.
     */
    String largeImage();

    /**
     * Gets the apiEntitySetName property: The api entity set name. This becomes the odata entity set name for the
     * entity Type being referred in this object.
     *
     * @return the apiEntitySetName value.
     */
    String apiEntitySetName();

    /**
     * Gets the entityType property: Type of entity.
     *
     * @return the entityType value.
     */
    EntityTypes entityType();

    /**
     * Gets the fields property: The properties of the Profile.
     *
     * @return the fields value.
     */
    List<PropertyDefinition> fields();

    /**
     * Gets the instancesCount property: The instance count.
     *
     * @return the instancesCount value.
     */
    Integer instancesCount();

    /**
     * Gets the lastChangedUtc property: The last changed time for the type definition.
     *
     * @return the lastChangedUtc value.
     */
    OffsetDateTime lastChangedUtc();

    /**
     * Gets the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the schemaItemTypeLink property: The schema org link. This helps ACI identify and suggest semantic models.
     *
     * @return the schemaItemTypeLink value.
     */
    String schemaItemTypeLink();

    /**
     * Gets the tenantId property: The hub name.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the timestampFieldName property: The timestamp property name. Represents the time when the interaction or
     * profile update happened.
     *
     * @return the timestampFieldName value.
     */
    String timestampFieldName();

    /**
     * Gets the typeName property: The name of the entity.
     *
     * @return the typeName value.
     */
    String typeName();

    /**
     * Gets the strongIds property: The strong IDs.
     *
     * @return the strongIds value.
     */
    List<StrongId> strongIds();

    /**
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.ProfileResourceFormatInner object.
     *
     * @return the inner object.
     */
    ProfileResourceFormatInner innerModel();

    /** The entirety of the ProfileResourceFormat definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ProfileResourceFormat definition stages. */
    interface DefinitionStages {
        /** The first stage of the ProfileResourceFormat definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, hubName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param hubName The name of the hub.
             * @return the next definition stage.
             */
            WithCreate withExistingHub(String resourceGroupName, String hubName);
        }
        /**
         * The stage of the ProfileResourceFormat definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAttributes,
                DefinitionStages.WithDescription,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithLocalizedAttributes,
                DefinitionStages.WithSmallImage,
                DefinitionStages.WithMediumImage,
                DefinitionStages.WithLargeImage,
                DefinitionStages.WithApiEntitySetName,
                DefinitionStages.WithEntityType,
                DefinitionStages.WithFields,
                DefinitionStages.WithInstancesCount,
                DefinitionStages.WithSchemaItemTypeLink,
                DefinitionStages.WithTimestampFieldName,
                DefinitionStages.WithTypeName,
                DefinitionStages.WithStrongIds {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ProfileResourceFormat create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProfileResourceFormat create(Context context);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify attributes. */
        interface WithAttributes {
            /**
             * Specifies the attributes property: The attributes for the Type..
             *
             * @param attributes The attributes for the Type.
             * @return the next definition stage.
             */
            WithCreate withAttributes(Map<String, List<String>> attributes);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Localized descriptions for the property..
             *
             * @param description Localized descriptions for the property.
             * @return the next definition stage.
             */
            WithCreate withDescription(Map<String, String> description);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Localized display names for the property..
             *
             * @param displayName Localized display names for the property.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(Map<String, String> displayName);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify localizedAttributes. */
        interface WithLocalizedAttributes {
            /**
             * Specifies the localizedAttributes property: Any custom localized attributes for the Type..
             *
             * @param localizedAttributes Any custom localized attributes for the Type.
             * @return the next definition stage.
             */
            WithCreate withLocalizedAttributes(Map<String, Map<String, String>> localizedAttributes);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify smallImage. */
        interface WithSmallImage {
            /**
             * Specifies the smallImage property: Small Image associated with the Property or EntityType..
             *
             * @param smallImage Small Image associated with the Property or EntityType.
             * @return the next definition stage.
             */
            WithCreate withSmallImage(String smallImage);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify mediumImage. */
        interface WithMediumImage {
            /**
             * Specifies the mediumImage property: Medium Image associated with the Property or EntityType..
             *
             * @param mediumImage Medium Image associated with the Property or EntityType.
             * @return the next definition stage.
             */
            WithCreate withMediumImage(String mediumImage);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify largeImage. */
        interface WithLargeImage {
            /**
             * Specifies the largeImage property: Large Image associated with the Property or EntityType..
             *
             * @param largeImage Large Image associated with the Property or EntityType.
             * @return the next definition stage.
             */
            WithCreate withLargeImage(String largeImage);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify apiEntitySetName. */
        interface WithApiEntitySetName {
            /**
             * Specifies the apiEntitySetName property: The api entity set name. This becomes the odata entity set name
             * for the entity Type being referred in this object..
             *
             * @param apiEntitySetName The api entity set name. This becomes the odata entity set name for the entity
             *     Type being referred in this object.
             * @return the next definition stage.
             */
            WithCreate withApiEntitySetName(String apiEntitySetName);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify entityType. */
        interface WithEntityType {
            /**
             * Specifies the entityType property: Type of entity..
             *
             * @param entityType Type of entity.
             * @return the next definition stage.
             */
            WithCreate withEntityType(EntityTypes entityType);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify fields. */
        interface WithFields {
            /**
             * Specifies the fields property: The properties of the Profile..
             *
             * @param fields The properties of the Profile.
             * @return the next definition stage.
             */
            WithCreate withFields(List<PropertyDefinition> fields);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify instancesCount. */
        interface WithInstancesCount {
            /**
             * Specifies the instancesCount property: The instance count..
             *
             * @param instancesCount The instance count.
             * @return the next definition stage.
             */
            WithCreate withInstancesCount(Integer instancesCount);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify schemaItemTypeLink. */
        interface WithSchemaItemTypeLink {
            /**
             * Specifies the schemaItemTypeLink property: The schema org link. This helps ACI identify and suggest
             * semantic models..
             *
             * @param schemaItemTypeLink The schema org link. This helps ACI identify and suggest semantic models.
             * @return the next definition stage.
             */
            WithCreate withSchemaItemTypeLink(String schemaItemTypeLink);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify timestampFieldName. */
        interface WithTimestampFieldName {
            /**
             * Specifies the timestampFieldName property: The timestamp property name. Represents the time when the
             * interaction or profile update happened..
             *
             * @param timestampFieldName The timestamp property name. Represents the time when the interaction or
             *     profile update happened.
             * @return the next definition stage.
             */
            WithCreate withTimestampFieldName(String timestampFieldName);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify typeName. */
        interface WithTypeName {
            /**
             * Specifies the typeName property: The name of the entity..
             *
             * @param typeName The name of the entity.
             * @return the next definition stage.
             */
            WithCreate withTypeName(String typeName);
        }
        /** The stage of the ProfileResourceFormat definition allowing to specify strongIds. */
        interface WithStrongIds {
            /**
             * Specifies the strongIds property: The strong IDs..
             *
             * @param strongIds The strong IDs.
             * @return the next definition stage.
             */
            WithCreate withStrongIds(List<StrongId> strongIds);
        }
    }
    /**
     * Begins update for the ProfileResourceFormat resource.
     *
     * @return the stage of resource update.
     */
    ProfileResourceFormat.Update update();

    /** The template for ProfileResourceFormat update. */
    interface Update
        extends UpdateStages.WithAttributes,
            UpdateStages.WithDescription,
            UpdateStages.WithDisplayName,
            UpdateStages.WithLocalizedAttributes,
            UpdateStages.WithSmallImage,
            UpdateStages.WithMediumImage,
            UpdateStages.WithLargeImage,
            UpdateStages.WithApiEntitySetName,
            UpdateStages.WithEntityType,
            UpdateStages.WithFields,
            UpdateStages.WithInstancesCount,
            UpdateStages.WithSchemaItemTypeLink,
            UpdateStages.WithTimestampFieldName,
            UpdateStages.WithTypeName,
            UpdateStages.WithStrongIds {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ProfileResourceFormat apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProfileResourceFormat apply(Context context);
    }
    /** The ProfileResourceFormat update stages. */
    interface UpdateStages {
        /** The stage of the ProfileResourceFormat update allowing to specify attributes. */
        interface WithAttributes {
            /**
             * Specifies the attributes property: The attributes for the Type..
             *
             * @param attributes The attributes for the Type.
             * @return the next definition stage.
             */
            Update withAttributes(Map<String, List<String>> attributes);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Localized descriptions for the property..
             *
             * @param description Localized descriptions for the property.
             * @return the next definition stage.
             */
            Update withDescription(Map<String, String> description);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Localized display names for the property..
             *
             * @param displayName Localized display names for the property.
             * @return the next definition stage.
             */
            Update withDisplayName(Map<String, String> displayName);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify localizedAttributes. */
        interface WithLocalizedAttributes {
            /**
             * Specifies the localizedAttributes property: Any custom localized attributes for the Type..
             *
             * @param localizedAttributes Any custom localized attributes for the Type.
             * @return the next definition stage.
             */
            Update withLocalizedAttributes(Map<String, Map<String, String>> localizedAttributes);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify smallImage. */
        interface WithSmallImage {
            /**
             * Specifies the smallImage property: Small Image associated with the Property or EntityType..
             *
             * @param smallImage Small Image associated with the Property or EntityType.
             * @return the next definition stage.
             */
            Update withSmallImage(String smallImage);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify mediumImage. */
        interface WithMediumImage {
            /**
             * Specifies the mediumImage property: Medium Image associated with the Property or EntityType..
             *
             * @param mediumImage Medium Image associated with the Property or EntityType.
             * @return the next definition stage.
             */
            Update withMediumImage(String mediumImage);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify largeImage. */
        interface WithLargeImage {
            /**
             * Specifies the largeImage property: Large Image associated with the Property or EntityType..
             *
             * @param largeImage Large Image associated with the Property or EntityType.
             * @return the next definition stage.
             */
            Update withLargeImage(String largeImage);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify apiEntitySetName. */
        interface WithApiEntitySetName {
            /**
             * Specifies the apiEntitySetName property: The api entity set name. This becomes the odata entity set name
             * for the entity Type being referred in this object..
             *
             * @param apiEntitySetName The api entity set name. This becomes the odata entity set name for the entity
             *     Type being referred in this object.
             * @return the next definition stage.
             */
            Update withApiEntitySetName(String apiEntitySetName);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify entityType. */
        interface WithEntityType {
            /**
             * Specifies the entityType property: Type of entity..
             *
             * @param entityType Type of entity.
             * @return the next definition stage.
             */
            Update withEntityType(EntityTypes entityType);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify fields. */
        interface WithFields {
            /**
             * Specifies the fields property: The properties of the Profile..
             *
             * @param fields The properties of the Profile.
             * @return the next definition stage.
             */
            Update withFields(List<PropertyDefinition> fields);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify instancesCount. */
        interface WithInstancesCount {
            /**
             * Specifies the instancesCount property: The instance count..
             *
             * @param instancesCount The instance count.
             * @return the next definition stage.
             */
            Update withInstancesCount(Integer instancesCount);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify schemaItemTypeLink. */
        interface WithSchemaItemTypeLink {
            /**
             * Specifies the schemaItemTypeLink property: The schema org link. This helps ACI identify and suggest
             * semantic models..
             *
             * @param schemaItemTypeLink The schema org link. This helps ACI identify and suggest semantic models.
             * @return the next definition stage.
             */
            Update withSchemaItemTypeLink(String schemaItemTypeLink);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify timestampFieldName. */
        interface WithTimestampFieldName {
            /**
             * Specifies the timestampFieldName property: The timestamp property name. Represents the time when the
             * interaction or profile update happened..
             *
             * @param timestampFieldName The timestamp property name. Represents the time when the interaction or
             *     profile update happened.
             * @return the next definition stage.
             */
            Update withTimestampFieldName(String timestampFieldName);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify typeName. */
        interface WithTypeName {
            /**
             * Specifies the typeName property: The name of the entity..
             *
             * @param typeName The name of the entity.
             * @return the next definition stage.
             */
            Update withTypeName(String typeName);
        }
        /** The stage of the ProfileResourceFormat update allowing to specify strongIds. */
        interface WithStrongIds {
            /**
             * Specifies the strongIds property: The strong IDs..
             *
             * @param strongIds The strong IDs.
             * @return the next definition stage.
             */
            Update withStrongIds(List<StrongId> strongIds);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ProfileResourceFormat refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProfileResourceFormat refresh(Context context);

    /**
     * Gets the KPIs that enrich the profile Type identified by the supplied name. Enrichment happens through
     * participants of the Interaction on an Interaction KPI and through Relationships for Profile KPIs.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the KPIs that enrich the profile Type identified by the supplied name.
     */
    List<KpiDefinition> getEnrichingKpis();

    /**
     * Gets the KPIs that enrich the profile Type identified by the supplied name. Enrichment happens through
     * participants of the Interaction on an Interaction KPI and through Relationships for Profile KPIs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the KPIs that enrich the profile Type identified by the supplied name.
     */
    Response<List<KpiDefinition>> getEnrichingKpisWithResponse(Context context);
}
