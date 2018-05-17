/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The OCRMethodOptionalParameter model.
 */
public class OCRMethodOptionalParameter {
    /**
     * Whether to retain the submitted image for future use; defaults to false
     * if omitted.
     */
    private Boolean cacheImage;

    /**
     * When set to True, the image goes through additional processing to come
     * with additional candidates.
     *
     * image/tiff is not supported when enhanced is set to true
     *
     * Note: This impacts the response time.
     */
    private Boolean enhanced;

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
     * @return the OCRMethodOptionalParameter object itself.
     */
    public OCRMethodOptionalParameter withCacheImage(Boolean cacheImage) {
        this.cacheImage = cacheImage;
        return this;
    }

    /**
     * Get the enhanced value.
     *
     * @return the enhanced value
     */
    public Boolean enhanced() {
        return this.enhanced;
    }

    /**
     * Set the enhanced value.
     *
     * @param enhanced the enhanced value to set
     * @return the OCRMethodOptionalParameter object itself.
     */
    public OCRMethodOptionalParameter withEnhanced(Boolean enhanced) {
        this.enhanced = enhanced;
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
     * @return the OCRMethodOptionalParameter object itself.
     */
    public OCRMethodOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
