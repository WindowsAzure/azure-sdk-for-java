/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The AnalyzeImageByDomainInStreamOptionalParameter model.
 */
public class AnalyzeImageByDomainInStreamOptionalParameter {
    /**
     * The desired language for output generation. If this parameter is not
     * specified, the default value is &amp;quot;en&amp;quot;.Supported
     * languages:en - English, Default. es - Spanish, ja - Japanese, pt -
     * Portuguese, zh - Simplified Chinese. Possible values include: 'en',
     * 'es', 'ja', 'pt', 'zh'.
     */
    private String language;

    /**
     * Optional parameter to specify the version of the AI model. Accepted
     * values are: "latest", "2021-04-01". Defaults to "latest".
     */
    private String modelVersion;

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
     * @return the AnalyzeImageByDomainInStreamOptionalParameter object itself.
     */
    public AnalyzeImageByDomainInStreamOptionalParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the modelVersion value.
     *
     * @return the modelVersion value
     */
    public String modelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion value.
     *
     * @param modelVersion the modelVersion value to set
     * @return the AnalyzeImageByDomainInStreamOptionalParameter object itself.
     */
    public AnalyzeImageByDomainInStreamOptionalParameter withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
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
     * @return the AnalyzeImageByDomainInStreamOptionalParameter object itself.
     */
    public AnalyzeImageByDomainInStreamOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
