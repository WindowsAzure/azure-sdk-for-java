/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Used for getting ResourceHealthCheck settings.
 */
@JsonFlatten
public class ResourceHealthMetadataInner extends Resource {
    /**
     * ARM Resource Id.
     */
    @JsonProperty(value = "properties.id")
    private String resourceHealthMetadataId;

    /**
     * The category that the resource matches in the RHC Policy File.
     */
    @JsonProperty(value = "properties.category")
    private String category;

    /**
     * Is there a health signal for the resource.
     */
    @JsonProperty(value = "properties.signalAvailability")
    private Boolean signalAvailability;

    /**
     * Get the resourceHealthMetadataId value.
     *
     * @return the resourceHealthMetadataId value
     */
    public String resourceHealthMetadataId() {
        return this.resourceHealthMetadataId;
    }

    /**
     * Set the resourceHealthMetadataId value.
     *
     * @param resourceHealthMetadataId the resourceHealthMetadataId value to set
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withResourceHealthMetadataId(String resourceHealthMetadataId) {
        this.resourceHealthMetadataId = resourceHealthMetadataId;
        return this;
    }

    /**
     * Get the category value.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category value.
     *
     * @param category the category value to set
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the signalAvailability value.
     *
     * @return the signalAvailability value
     */
    public Boolean signalAvailability() {
        return this.signalAvailability;
    }

    /**
     * Set the signalAvailability value.
     *
     * @param signalAvailability the signalAvailability value to set
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withSignalAvailability(Boolean signalAvailability) {
        this.signalAvailability = signalAvailability;
        return this;
    }

}
