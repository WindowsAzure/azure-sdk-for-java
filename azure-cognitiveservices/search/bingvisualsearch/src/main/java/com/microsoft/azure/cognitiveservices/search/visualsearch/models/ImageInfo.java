/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A JSON object containing information about the image. The image and
 * imageInsightsToken fields are mutually exclusive – the body of the request
 * must include only one of them.
 */
public class ImageInfo {
    /**
     * An image insights token. To get the insights token, call one of the
     * Image Search APIs (for example, /images/search). In the search results,
     * the
     * [Image](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#image)
     * object's
     * [imageInsightsToken](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#image-imageinsightstoken)
     * field contains the token. The image and imageInsightsToken fields are
     * mutually exclusive – do not specify both.
     */
    @JsonProperty(value = "imageInsightsToken", access = JsonProperty.Access.WRITE_ONLY)
    private String imageInsightsToken;

    /**
     * The URL of the input image. The URL should match the image specified by
     * the imageInsightsToken fields if both are present. The image and URL
     * fields are mutually exclusive – do not specify both.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /**
     * A JSON object consisting of coordinates specifying the four corners of a
     * cropped rectangle within the input image.
     */
    @JsonProperty(value = "cropArea", access = JsonProperty.Access.WRITE_ONLY)
    private CropArea cropArea;

    /**
     * Get the imageInsightsToken value.
     *
     * @return the imageInsightsToken value
     */
    public String imageInsightsToken() {
        return this.imageInsightsToken;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the cropArea value.
     *
     * @return the cropArea value
     */
    public CropArea cropArea() {
        return this.cropArea;
    }

}
