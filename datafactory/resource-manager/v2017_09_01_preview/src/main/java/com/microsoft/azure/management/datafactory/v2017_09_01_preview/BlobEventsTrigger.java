/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Trigger that runs every time a Blob event occurs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobEventsTrigger")
@JsonFlatten
public class BlobEventsTrigger extends MultiplePipelineTrigger {
    /**
     * The blob path must begin with the pattern provided for trigger to fire.
     * For example, '/records/blobs/december/' will only fire the trigger for
     * blobs in the december folder under the records container. At least one
     * of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     */
    @JsonProperty(value = "typeProperties.blobPathBeginsWith")
    private String blobPathBeginsWith;

    /**
     * The blob path must end with the pattern provided for trigger to fire.
     * For example, 'december/boxes.csv' will only fire the trigger for blobs
     * named boxes in a december folder. At least one of these must be
     * provided: blobPathBeginsWith, blobPathEndsWith.
     */
    @JsonProperty(value = "typeProperties.blobPathEndsWith")
    private String blobPathEndsWith;

    /**
     * The type of events that cause this trigger to fire.
     */
    @JsonProperty(value = "typeProperties.events", required = true)
    private List<BlobEventTypes> events;

    /**
     * The ARM resource ID of the Storage Account.
     */
    @JsonProperty(value = "typeProperties.scope", required = true)
    private String scope;

    /**
     * Get the blob path must begin with the pattern provided for trigger to fire. For example, '/records/blobs/december/' will only fire the trigger for blobs in the december folder under the records container. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     *
     * @return the blobPathBeginsWith value
     */
    public String blobPathBeginsWith() {
        return this.blobPathBeginsWith;
    }

    /**
     * Set the blob path must begin with the pattern provided for trigger to fire. For example, '/records/blobs/december/' will only fire the trigger for blobs in the december folder under the records container. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     *
     * @param blobPathBeginsWith the blobPathBeginsWith value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withBlobPathBeginsWith(String blobPathBeginsWith) {
        this.blobPathBeginsWith = blobPathBeginsWith;
        return this;
    }

    /**
     * Get the blob path must end with the pattern provided for trigger to fire. For example, 'december/boxes.csv' will only fire the trigger for blobs named boxes in a december folder. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     *
     * @return the blobPathEndsWith value
     */
    public String blobPathEndsWith() {
        return this.blobPathEndsWith;
    }

    /**
     * Set the blob path must end with the pattern provided for trigger to fire. For example, 'december/boxes.csv' will only fire the trigger for blobs named boxes in a december folder. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     *
     * @param blobPathEndsWith the blobPathEndsWith value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withBlobPathEndsWith(String blobPathEndsWith) {
        this.blobPathEndsWith = blobPathEndsWith;
        return this;
    }

    /**
     * Get the type of events that cause this trigger to fire.
     *
     * @return the events value
     */
    public List<BlobEventTypes> events() {
        return this.events;
    }

    /**
     * Set the type of events that cause this trigger to fire.
     *
     * @param events the events value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withEvents(List<BlobEventTypes> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the ARM resource ID of the Storage Account.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the ARM resource ID of the Storage Account.
     *
     * @param scope the scope value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withScope(String scope) {
        this.scope = scope;
        return this;
    }

}
