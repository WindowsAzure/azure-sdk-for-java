/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_03_01.ProxyOnlyResource;

/**
 * Used for getting ResourceHealthCheck settings.
 */
@JsonFlatten
public class ResourceHealthMetadataInner extends ProxyOnlyResource {
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
     * Get the category that the resource matches in the RHC Policy File.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category that the resource matches in the RHC Policy File.
     *
     * @param category the category value to set
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get is there a health signal for the resource.
     *
     * @return the signalAvailability value
     */
    public Boolean signalAvailability() {
        return this.signalAvailability;
    }

    /**
     * Set is there a health signal for the resource.
     *
     * @param signalAvailability the signalAvailability value to set
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withSignalAvailability(Boolean signalAvailability) {
        this.signalAvailability = signalAvailability;
        return this;
    }

}
