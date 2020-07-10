// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.GalleryArtifactPublishingProfileBase;
import com.azure.resourcemanager.compute.models.GalleryImageVersionPropertiesProvisioningState;
import com.azure.resourcemanager.compute.models.GalleryImageVersionPublishingProfile;
import com.azure.resourcemanager.compute.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.compute.models.ReplicationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryImageVersion model. */
@JsonFlatten
@Fluent
public class GalleryImageVersionInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageVersionInner.class);

    /*
     * Describes the basic gallery artifact publishing profile.
     */
    @JsonProperty(value = "properties.publishingProfile")
    private GalleryImageVersionPublishingProfile publishingProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryImageVersionPropertiesProvisioningState provisioningState;

    /*
     * This is the storage profile of a Gallery Image Version.
     */
    @JsonProperty(value = "properties.storageProfile")
    private GalleryImageVersionStorageProfile storageProfile;

    /*
     * This is the replication status of the gallery Image Version.
     */
    @JsonProperty(value = "properties.replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Get the publishingProfile property: Describes the basic gallery artifact publishing profile.
     *
     * @return the publishingProfile value.
     */
    public GalleryImageVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile property: Describes the basic gallery artifact publishing profile.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryImageVersionInner object itself.
     */
    public GalleryImageVersionInner withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryImageVersionPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @return the storageProfile value.
     */
    public GalleryImageVersionStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the GalleryImageVersionInner object itself.
     */
    public GalleryImageVersionInner withStorageProfile(GalleryImageVersionStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the replicationStatus property: This is the replication status of the gallery Image Version.
     *
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publishingProfile() != null) {
            publishingProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (replicationStatus() != null) {
            replicationStatus().validate();
        }
    }
}
