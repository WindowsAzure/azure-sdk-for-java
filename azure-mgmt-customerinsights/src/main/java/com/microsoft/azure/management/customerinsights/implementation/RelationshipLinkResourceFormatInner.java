/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.customerinsights.RelationshipLinkFieldMapping;
import com.microsoft.azure.management.customerinsights.ParticipantProfilePropertyReference;
import com.microsoft.azure.management.customerinsights.ProvisioningStates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.customerinsights.ProxyResource;

/**
 * The relationship link resource format.
 */
@JsonFlatten
public class RelationshipLinkResourceFormatInner extends ProxyResource {
    /**
     * Localized display name for the Relationship Link.
     */
    @JsonProperty(value = "properties.displayName")
    private Map<String, String> displayName;

    /**
     * Localized descriptions for the Relationship Link.
     */
    @JsonProperty(value = "properties.description")
    private Map<String, String> description;

    /**
     * The InteractionType associated with the Relationship Link.
     */
    @JsonProperty(value = "properties.interactionType", required = true)
    private String interactionType;

    /**
     * The name of the Relationship Link.
     */
    @JsonProperty(value = "properties.linkName", access = JsonProperty.Access.WRITE_ONLY)
    private String linkName;

    /**
     * The mappings between Interaction and Relationship fields.
     */
    @JsonProperty(value = "properties.mappings")
    private List<RelationshipLinkFieldMapping> mappings;

    /**
     * The property references for the Profile of the Relationship.
     */
    @JsonProperty(value = "properties.profilePropertyReferences", required = true)
    private List<ParticipantProfilePropertyReference> profilePropertyReferences;

    /**
     * Provisioning state. Possible values include: 'Provisioning',
     * 'Succeeded', 'Expiring', 'Deleting', 'HumanIntervention', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStates provisioningState;

    /**
     * The property references for the Related Profile of the Relationship.
     */
    @JsonProperty(value = "properties.relatedProfilePropertyReferences", required = true)
    private List<ParticipantProfilePropertyReference> relatedProfilePropertyReferences;

    /**
     * The Relationship associated with the Link.
     */
    @JsonProperty(value = "properties.relationshipName", required = true)
    private String relationshipName;

    /**
     * The relationship guid id.
     */
    @JsonProperty(value = "properties.relationshipGuidId", access = JsonProperty.Access.WRITE_ONLY)
    private String relationshipGuidId;

    /**
     * The hub name.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public Map<String, String> displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withDisplayName(Map<String, String> displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public Map<String, String> description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    /**
     * Get the interactionType value.
     *
     * @return the interactionType value
     */
    public String interactionType() {
        return this.interactionType;
    }

    /**
     * Set the interactionType value.
     *
     * @param interactionType the interactionType value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withInteractionType(String interactionType) {
        this.interactionType = interactionType;
        return this;
    }

    /**
     * Get the linkName value.
     *
     * @return the linkName value
     */
    public String linkName() {
        return this.linkName;
    }

    /**
     * Get the mappings value.
     *
     * @return the mappings value
     */
    public List<RelationshipLinkFieldMapping> mappings() {
        return this.mappings;
    }

    /**
     * Set the mappings value.
     *
     * @param mappings the mappings value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withMappings(List<RelationshipLinkFieldMapping> mappings) {
        this.mappings = mappings;
        return this;
    }

    /**
     * Get the profilePropertyReferences value.
     *
     * @return the profilePropertyReferences value
     */
    public List<ParticipantProfilePropertyReference> profilePropertyReferences() {
        return this.profilePropertyReferences;
    }

    /**
     * Set the profilePropertyReferences value.
     *
     * @param profilePropertyReferences the profilePropertyReferences value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withProfilePropertyReferences(List<ParticipantProfilePropertyReference> profilePropertyReferences) {
        this.profilePropertyReferences = profilePropertyReferences;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningStates provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the relatedProfilePropertyReferences value.
     *
     * @return the relatedProfilePropertyReferences value
     */
    public List<ParticipantProfilePropertyReference> relatedProfilePropertyReferences() {
        return this.relatedProfilePropertyReferences;
    }

    /**
     * Set the relatedProfilePropertyReferences value.
     *
     * @param relatedProfilePropertyReferences the relatedProfilePropertyReferences value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withRelatedProfilePropertyReferences(List<ParticipantProfilePropertyReference> relatedProfilePropertyReferences) {
        this.relatedProfilePropertyReferences = relatedProfilePropertyReferences;
        return this;
    }

    /**
     * Get the relationshipName value.
     *
     * @return the relationshipName value
     */
    public String relationshipName() {
        return this.relationshipName;
    }

    /**
     * Set the relationshipName value.
     *
     * @param relationshipName the relationshipName value to set
     * @return the RelationshipLinkResourceFormatInner object itself.
     */
    public RelationshipLinkResourceFormatInner withRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
        return this;
    }

    /**
     * Get the relationshipGuidId value.
     *
     * @return the relationshipGuidId value
     */
    public String relationshipGuidId() {
        return this.relationshipGuidId;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

}
