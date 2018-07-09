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
 * The AnalyzeImageOptionalParameter model.
 */
public class AnalyzeImageOptionalParameter {
    /**
     * A string indicating what visual feature types to return. Multiple values
     * should be comma-separated. Valid visual feature types include:Categories
     * - categorizes image content according to a taxonomy defined in
     * documentation. Tags - tags the image with a detailed list of words
     * related to the image content. Description - describes the image content
     * with a complete English sentence. Faces - detects if faces are present.
     * If present, generate coordinates, gender and age. ImageType - detects if
     * image is clipart or a line drawing. Color - determines the accent color,
     * dominant color, and whether an image is black&amp;white.Adult - detects
     * if the image is pornographic in nature (depicts nudity or a sex act).
     * Sexually suggestive content is also detected.
     */
    private List<VisualFeatureTypes> visualFeatures;

    /**
     * A string indicating which domain-specific details to return. Multiple
     * values should be comma-separated. Valid visual feature types
     * include:Celebrities - identifies celebrities if detected in the image.
     */
    private List<Details> details;

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
     * Get the visualFeatures value.
     *
     * @return the visualFeatures value
     */
    public List<VisualFeatureTypes> visualFeatures() {
        return this.visualFeatures;
    }

    /**
     * Set the visualFeatures value.
     *
     * @param visualFeatures the visualFeatures value to set
     * @return the AnalyzeImageOptionalParameter object itself.
     */
    public AnalyzeImageOptionalParameter withVisualFeatures(List<VisualFeatureTypes> visualFeatures) {
        this.visualFeatures = visualFeatures;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<Details> details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the AnalyzeImageOptionalParameter object itself.
     */
    public AnalyzeImageOptionalParameter withDetails(List<Details> details) {
        this.details = details;
        return this;
    }

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
     * @return the AnalyzeImageOptionalParameter object itself.
     */
    public AnalyzeImageOptionalParameter withLanguage(String language) {
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
     * @return the AnalyzeImageOptionalParameter object itself.
     */
    public AnalyzeImageOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
