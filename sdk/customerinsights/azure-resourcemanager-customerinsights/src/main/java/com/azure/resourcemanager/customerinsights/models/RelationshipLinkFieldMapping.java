// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The fields mapping for Relationships. */
@Fluent
public final class RelationshipLinkFieldMapping {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelationshipLinkFieldMapping.class);

    /*
     * The field name on the Interaction Type.
     */
    @JsonProperty(value = "interactionFieldName", required = true)
    private String interactionFieldName;

    /*
     * Link type.
     */
    @JsonProperty(value = "linkType")
    private LinkTypes linkType;

    /*
     * The field name on the Relationship metadata.
     */
    @JsonProperty(value = "relationshipFieldName", required = true)
    private String relationshipFieldName;

    /**
     * Get the interactionFieldName property: The field name on the Interaction Type.
     *
     * @return the interactionFieldName value.
     */
    public String interactionFieldName() {
        return this.interactionFieldName;
    }

    /**
     * Set the interactionFieldName property: The field name on the Interaction Type.
     *
     * @param interactionFieldName the interactionFieldName value to set.
     * @return the RelationshipLinkFieldMapping object itself.
     */
    public RelationshipLinkFieldMapping withInteractionFieldName(String interactionFieldName) {
        this.interactionFieldName = interactionFieldName;
        return this;
    }

    /**
     * Get the linkType property: Link type.
     *
     * @return the linkType value.
     */
    public LinkTypes linkType() {
        return this.linkType;
    }

    /**
     * Set the linkType property: Link type.
     *
     * @param linkType the linkType value to set.
     * @return the RelationshipLinkFieldMapping object itself.
     */
    public RelationshipLinkFieldMapping withLinkType(LinkTypes linkType) {
        this.linkType = linkType;
        return this;
    }

    /**
     * Get the relationshipFieldName property: The field name on the Relationship metadata.
     *
     * @return the relationshipFieldName value.
     */
    public String relationshipFieldName() {
        return this.relationshipFieldName;
    }

    /**
     * Set the relationshipFieldName property: The field name on the Relationship metadata.
     *
     * @param relationshipFieldName the relationshipFieldName value to set.
     * @return the RelationshipLinkFieldMapping object itself.
     */
    public RelationshipLinkFieldMapping withRelationshipFieldName(String relationshipFieldName) {
        this.relationshipFieldName = relationshipFieldName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (interactionFieldName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property interactionFieldName in model RelationshipLinkFieldMapping"));
        }
        if (relationshipFieldName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property relationshipFieldName in model RelationshipLinkFieldMapping"));
        }
    }
}
