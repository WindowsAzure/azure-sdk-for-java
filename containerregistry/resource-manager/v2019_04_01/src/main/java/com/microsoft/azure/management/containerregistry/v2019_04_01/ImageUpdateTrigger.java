/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The image update trigger that caused a build.
 */
public class ImageUpdateTrigger {
    /**
     * The unique ID of the trigger.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The timestamp when the image update happened.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * The list of image updates that caused the build.
     */
    @JsonProperty(value = "images")
    private List<ImageDescriptor> images;

    /**
     * Get the unique ID of the trigger.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the unique ID of the trigger.
     *
     * @param id the id value to set
     * @return the ImageUpdateTrigger object itself.
     */
    public ImageUpdateTrigger withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the timestamp when the image update happened.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp when the image update happened.
     *
     * @param timestamp the timestamp value to set
     * @return the ImageUpdateTrigger object itself.
     */
    public ImageUpdateTrigger withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the list of image updates that caused the build.
     *
     * @return the images value
     */
    public List<ImageDescriptor> images() {
        return this.images;
    }

    /**
     * Set the list of image updates that caused the build.
     *
     * @param images the images value to set
     * @return the ImageUpdateTrigger object itself.
     */
    public ImageUpdateTrigger withImages(List<ImageDescriptor> images) {
        this.images = images;
        return this;
    }

}
