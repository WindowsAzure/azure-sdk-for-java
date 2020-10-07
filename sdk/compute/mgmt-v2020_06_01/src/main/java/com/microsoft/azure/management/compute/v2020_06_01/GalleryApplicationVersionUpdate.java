/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Specifies information about the gallery Application Version that you want to
 * update.
 */
@JsonFlatten
public class GalleryApplicationVersionUpdate extends UpdateResourceDefinition {
    /**
     * The publishingProfile property.
     */
    @JsonProperty(value = "properties.publishingProfile", required = true)
    private GalleryApplicationVersionPublishingProfile publishingProfile;

    /**
     * The current state of the gallery Application Version.
     * The provisioning state, which only appears in the response. Possible
     * values include: 'Creating', 'Updating', 'Failed', 'Succeeded',
     * 'Deleting', 'Migrating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The replicationStatus property.
     */
    @JsonProperty(value = "properties.replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Get the publishingProfile value.
     *
     * @return the publishingProfile value
     */
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile value.
     *
     * @param publishingProfile the publishingProfile value to set
     * @return the GalleryApplicationVersionUpdate object itself.
     */
    public GalleryApplicationVersionUpdate withPublishingProfile(GalleryApplicationVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
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

    /**
     * Get the replicationStatus value.
     *
     * @return the replicationStatus value
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

}
