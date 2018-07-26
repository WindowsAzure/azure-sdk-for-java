/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.List;

/**
 * The GetImagePerformanceCountOptionalParameter model.
 */
public class GetImagePerformanceCountOptionalParameter {
    /**
     * A list of tags ids to filter the images to count. Defaults to all tags
     * when null.
     */
    private List<String> tagIds;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the tagIds value.
     *
     * @return the tagIds value
     */
    public List<String> tagIds() {
        return this.tagIds;
    }

    /**
     * Set the tagIds value.
     *
     * @param tagIds the tagIds value to set
     * @return the GetImagePerformanceCountOptionalParameter object itself.
     */
    public GetImagePerformanceCountOptionalParameter withTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
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
     * @return the GetImagePerformanceCountOptionalParameter object itself.
     */
    public GetImagePerformanceCountOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
