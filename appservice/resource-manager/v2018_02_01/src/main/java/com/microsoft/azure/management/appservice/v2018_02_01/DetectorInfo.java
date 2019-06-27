/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of Detector.
 */
public class DetectorInfo {
    /**
     * Short description of the detector and its purpose.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Support Category.
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /**
     * Support Sub Category.
     */
    @JsonProperty(value = "subCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String subCategory;

    /**
     * Support Topic Id.
     */
    @JsonProperty(value = "supportTopicId", access = JsonProperty.Access.WRITE_ONLY)
    private String supportTopicId;

    /**
     * Get short description of the detector and its purpose.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get support Category.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Get support Sub Category.
     *
     * @return the subCategory value
     */
    public String subCategory() {
        return this.subCategory;
    }

    /**
     * Get support Topic Id.
     *
     * @return the supportTopicId value
     */
    public String supportTopicId() {
        return this.supportTopicId;
    }

}
