/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the activity parameter validation set.
 */
public class ActivityParameterValidationSet {
    /**
     * Gets or sets the name of the activity parameter validation set member.
     */
    @JsonProperty(value = "memberValue")
    private String memberValue;

    /**
     * Get gets or sets the name of the activity parameter validation set member.
     *
     * @return the memberValue value
     */
    public String memberValue() {
        return this.memberValue;
    }

    /**
     * Set gets or sets the name of the activity parameter validation set member.
     *
     * @param memberValue the memberValue value to set
     * @return the ActivityParameterValidationSet object itself.
     */
    public ActivityParameterValidationSet withMemberValue(String memberValue) {
        this.memberValue = memberValue;
        return this;
    }

}
