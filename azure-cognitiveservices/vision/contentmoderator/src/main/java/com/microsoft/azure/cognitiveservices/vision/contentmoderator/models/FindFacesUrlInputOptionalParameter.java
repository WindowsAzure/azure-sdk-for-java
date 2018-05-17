/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The FindFacesUrlInputOptionalParameter model.
 */
public class FindFacesUrlInputOptionalParameter {
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
     * @return the FindFacesUrlInputOptionalParameter object itself.
     */
    public FindFacesUrlInputOptionalParameter withCacheImage(Boolean cacheImage) {
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
     * @return the FindFacesUrlInputOptionalParameter object itself.
     */
    public FindFacesUrlInputOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
