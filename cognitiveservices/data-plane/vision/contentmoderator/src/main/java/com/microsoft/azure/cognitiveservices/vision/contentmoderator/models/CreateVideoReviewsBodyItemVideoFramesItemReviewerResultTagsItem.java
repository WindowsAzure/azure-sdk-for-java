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
 * The CreateVideoReviewsBodyItemVideoFramesItemReviewerResultTagsItem model.
 */
public class CreateVideoReviewsBodyItemVideoFramesItemReviewerResultTagsItem {
    /**
     * Your key parameter.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /**
     * Your value parameter.
     */
    @JsonProperty(value = "Value", required = true)
    private String value;

    /**
     * Get your key parameter.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set your key parameter.
     *
     * @param key the key value to set
     * @return the CreateVideoReviewsBodyItemVideoFramesItemReviewerResultTagsItem object itself.
     */
    public CreateVideoReviewsBodyItemVideoFramesItemReviewerResultTagsItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get your value parameter.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set your value parameter.
     *
     * @param value the value value to set
     * @return the CreateVideoReviewsBodyItemVideoFramesItemReviewerResultTagsItem object itself.
     */
    public CreateVideoReviewsBodyItemVideoFramesItemReviewerResultTagsItem withValue(String value) {
        this.value = value;
        return this;
    }

}
