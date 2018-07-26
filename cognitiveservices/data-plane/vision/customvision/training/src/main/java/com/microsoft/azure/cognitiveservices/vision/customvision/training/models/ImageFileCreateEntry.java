/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageFileCreateEntry model.
 */
public class ImageFileCreateEntry {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The contents property.
     */
    @JsonProperty(value = "contents")
    private byte[] contents;

    /**
     * The tagIds property.
     */
    @JsonProperty(value = "tagIds")
    private List<UUID> tagIds;

    /**
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<Region> regions;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ImageFileCreateEntry object itself.
     */
    public ImageFileCreateEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the contents value.
     *
     * @return the contents value
     */
    public byte[] contents() {
        return this.contents;
    }

    /**
     * Set the contents value.
     *
     * @param contents the contents value to set
     * @return the ImageFileCreateEntry object itself.
     */
    public ImageFileCreateEntry withContents(byte[] contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Get the tagIds value.
     *
     * @return the tagIds value
     */
    public List<UUID> tagIds() {
        return this.tagIds;
    }

    /**
     * Set the tagIds value.
     *
     * @param tagIds the tagIds value to set
     * @return the ImageFileCreateEntry object itself.
     */
    public ImageFileCreateEntry withTagIds(List<UUID> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    /**
     * Get the regions value.
     *
     * @return the regions value
     */
    public List<Region> regions() {
        return this.regions;
    }

    /**
     * Set the regions value.
     *
     * @param regions the regions value to set
     * @return the ImageFileCreateEntry object itself.
     */
    public ImageFileCreateEntry withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

}
