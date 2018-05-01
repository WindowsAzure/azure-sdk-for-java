/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ImageTag model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("ImageTag")
public class ImageTag extends Thing {
    /**
     * Display name for this tag, for default tag, there is no display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The bounding box for this tag, for default tag, there is no bounding
     * box.
     */
    @JsonProperty(value = "boundingBox", access = JsonProperty.Access.WRITE_ONLY)
    private ImageTagRegion boundingBox;

    /**
     * Actions within this tag. The order of the items denotes the default
     * ranking order of these actions.
     */
    @JsonProperty(value = "actions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ImageAction> actions;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the boundingBox value.
     *
     * @return the boundingBox value
     */
    public ImageTagRegion boundingBox() {
        return this.boundingBox;
    }

    /**
     * Get the actions value.
     *
     * @return the actions value
     */
    public List<ImageAction> actions() {
        return this.actions;
    }

}
