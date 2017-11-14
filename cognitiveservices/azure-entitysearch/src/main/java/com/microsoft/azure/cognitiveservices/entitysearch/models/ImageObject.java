/**
 * MICROSOFT_MIT_NO_CODE
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines an image.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("ImageObject")
public class ImageObject extends MediaObject {
    /**
     * The URL to a thumbnail of the image.
     */
    @JsonProperty(value = "thumbnail", access = JsonProperty.Access.WRITE_ONLY)
    private ImageObject thumbnail;

    /**
     * Get the thumbnail value.
     *
     * @return the thumbnail value
     */
    public ImageObject thumbnail() {
        return this.thumbnail;
    }

}
