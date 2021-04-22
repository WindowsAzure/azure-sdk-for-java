// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.resourcemanager.customerinsights.fluent.models.SuggestRelationshipLinksResponseInner;
import java.util.List;

/** An immutable client-side representation of SuggestRelationshipLinksResponse. */
public interface SuggestRelationshipLinksResponse {
    /**
     * Gets the interactionName property: The interaction name.
     *
     * @return the interactionName value.
     */
    String interactionName();

    /**
     * Gets the suggestedRelationships property: Suggested relationships for the type.
     *
     * @return the suggestedRelationships value.
     */
    List<RelationshipsLookup> suggestedRelationships();

    /**
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.SuggestRelationshipLinksResponseInner
     * object.
     *
     * @return the inner object.
     */
    SuggestRelationshipLinksResponseInner innerModel();
}