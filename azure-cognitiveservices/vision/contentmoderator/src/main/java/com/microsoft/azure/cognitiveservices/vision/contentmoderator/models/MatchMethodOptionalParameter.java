/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The MatchMethodOptionalParameter model.
 */
public class MatchMethodOptionalParameter {
    /**
     * The list Id.
     */
    private String listId;

    /**
     * Whether to retain the submitted image for future use; defaults to false
     * if omitted.
     */
    private Boolean cacheImage;

    /**
     * Gets or sets the preferred language for the response.
     */
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
     * @return the MatchMethodOptionalParameter object itself.
     */
    public MatchMethodOptionalParameter withListId(String listId) {
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
     * @return the MatchMethodOptionalParameter object itself.
     */
    public MatchMethodOptionalParameter withCacheImage(Boolean cacheImage) {
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
     * @return the MatchMethodOptionalParameter object itself.
     */
    public MatchMethodOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
