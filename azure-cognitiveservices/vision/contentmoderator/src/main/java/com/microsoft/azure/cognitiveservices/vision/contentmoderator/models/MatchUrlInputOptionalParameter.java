/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MatchUrlInputOptionalParameter model.
 */
public class MatchUrlInputOptionalParameter {
    /**
     * The list Id.
     */
    @JsonProperty(value = "listId")
    private String listId;

    /**
     * Whether to retain the submitted image for future use; defaults to false
     * if omitted.
     */
    @JsonProperty(value = "cacheImage")
    private Boolean cacheImage;

    /**
     * Gets or sets the preferred language for the response.
     */
    @JsonProperty(value = "this\\.client\\.acceptLanguage()")
    private String acceptLanguage;

    /**
     * Get the listId value.
     *
     * @return the listId value
     */
    public String listId() {
        return this.listId;
    }

    /**
     * Set the listId value.
     *
     * @param listId the listId value to set
     * @return the MatchUrlInputOptionalParameter object itself.
     */
    public MatchUrlInputOptionalParameter withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * Get the cacheImage value.
     *
     * @return the cacheImage value
     */
    public Boolean cacheImage() {
        return this.cacheImage;
    }

    /**
     * Set the cacheImage value.
     *
     * @param cacheImage the cacheImage value to set
     * @return the MatchUrlInputOptionalParameter object itself.
     */
    public MatchUrlInputOptionalParameter withCacheImage(Boolean cacheImage) {
        this.cacheImage = cacheImage;
        return this;
    }

    /**
     * Get the acceptLanguage value.
     *
     * @return the acceptLanguage value
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage value.
     *
     * @param acceptLanguage the acceptLanguage value to set
     * @return the MatchUrlInputOptionalParameter object itself.
     */
    public MatchUrlInputOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
