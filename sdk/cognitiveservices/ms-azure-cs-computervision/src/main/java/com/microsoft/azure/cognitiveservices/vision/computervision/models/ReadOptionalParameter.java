/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;

/**
 * The ReadOptionalParameter model.
 */
public class ReadOptionalParameter {
    /**
     * The BCP-47 language code of the text in the document. Read supports auto
     * language identification and multi-language documents, so only provide a
     * language code if you would like to force the document to be processed in
     * that specific language. See https://aka.ms/ocr-languages for list of
     * supported languages. Possible values include: 'af', 'ast', 'bi', 'br',
     * 'ca', 'ceb', 'ch', 'co', 'crh', 'cs', 'csb', 'da', 'de', 'en', 'es',
     * 'et', 'eu', 'fi', 'fil', 'fj', 'fr', 'fur', 'fy', 'ga', 'gd', 'gil',
     * 'gl', 'gv', 'hni', 'hsb', 'ht', 'hu', 'ia', 'id', 'it', 'iu', 'ja',
     * 'jv', 'kaa', 'kac', 'kea', 'kha', 'kl', 'ko', 'ku', 'kw', 'lb', 'ms',
     * 'mww', 'nap', 'nl', 'no', 'oc', 'pl', 'pt', 'quc', 'rm', 'sco', 'sl',
     * 'sq', 'sv', 'sw', 'tet', 'tr', 'tt', 'uz', 'vo', 'wae', 'yua', 'za',
     * 'zh-Hans', 'zh-Hant', 'zu'.
     */
    private OcrDetectionLanguage language;

    /**
     * Custom page numbers for multi-page documents(PDF/TIFF), input the number
     * of the pages you want to get OCR result. For a range of pages, use a
     * hyphen. Separate each page or range with a comma.
     */
    private List<String> pages;

    /**
     * Optional parameter to specify the version of the OCR model used for text
     * extraction. Accepted values are: "latest", "latest-preview",
     * "2021-04-12". Defaults to "latest".
     */
    private String modelVersion;

    /**
     * Optional parameter to specify which reading order algorithm should be
     * applied when ordering the extract text elements. Can be either 'basic'
     * or 'natural'. Will default to 'basic' if not specified.
     */
    private String readingOrder;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public OcrDetectionLanguage language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the ReadOptionalParameter object itself.
     */
    public ReadOptionalParameter withLanguage(OcrDetectionLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Get the pages value.
     *
     * @return the pages value
     */
    public List<String> pages() {
        return this.pages;
    }

    /**
     * Set the pages value.
     *
     * @param pages the pages value to set
     * @return the ReadOptionalParameter object itself.
     */
    public ReadOptionalParameter withPages(List<String> pages) {
        this.pages = pages;
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
     * @return the ReadOptionalParameter object itself.
     */
    public ReadOptionalParameter withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Get the readingOrder value.
     *
     * @return the readingOrder value
     */
    public String readingOrder() {
        return this.readingOrder;
    }

    /**
     * Set the readingOrder value.
     *
     * @param readingOrder the readingOrder value to set
     * @return the ReadOptionalParameter object itself.
     */
    public ReadOptionalParameter withReadingOrder(String readingOrder) {
        this.readingOrder = readingOrder;
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
     * @return the ReadOptionalParameter object itself.
     */
    public ReadOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
