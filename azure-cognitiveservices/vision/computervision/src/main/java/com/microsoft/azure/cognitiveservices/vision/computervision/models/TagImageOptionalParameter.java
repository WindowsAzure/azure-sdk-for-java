/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The TagImageOptionalParameter model.
 */
public class TagImageOptionalParameter {
    /**
     * The desired language for output generation. If this parameter is not
     * specified, the default value is &amp;quot;en&amp;quot;.Supported
     * languages:en - English, Default.ja - Japanese pt - Portuguese zh -
     * Simplified Chinese. Possible values include: 'en', 'ja', 'pt', 'zh'.
     */
    private String language;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the TagImageOptionalParameter object itself.
     */
    public TagImageOptionalParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the TagImageOptionalParameter object itself.
     */
    public TagImageOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
