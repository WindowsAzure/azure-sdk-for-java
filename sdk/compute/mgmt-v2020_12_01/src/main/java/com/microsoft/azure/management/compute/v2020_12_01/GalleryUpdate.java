/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Specifies information about the Shared Image Gallery that you want to
 * update.
 */
@JsonFlatten
public class GalleryUpdate extends UpdateResourceDefinition {
    /**
     * The description of this Shared Image Gallery resource. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The identifier property.
     */
    @JsonProperty(value = "properties.identifier")
    private GalleryIdentifier identifier;

    /**
     * The current state of the gallery.
     * The provisioning state, which only appears in the response. Possible
     * values include: 'Creating', 'Updating', 'Failed', 'Succeeded',
     * 'Deleting', 'Migrating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the description of this Shared Image Gallery resource. This property is updatable.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of this Shared Image Gallery resource. This property is updatable.
     *
     * @param description the description value to set
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the identifier value.
     *
     * @return the identifier value
     */
    public GalleryIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier value.
     *
     * @param identifier the identifier value to set
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withIdentifier(GalleryIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response. Possible values include: 'Creating', 'Updating', 'Failed', 'Succeeded', 'Deleting', 'Migrating'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
