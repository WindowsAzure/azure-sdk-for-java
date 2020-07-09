/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response for the operation to get regional usages for a subscription.
 */
public class UsagesListResultInner {
    /**
     * The list of usages.
     */
    @JsonProperty(value = "value")
    private List<Usage> value;

    /**
     * Get the list of usages.
     *
     * @return the value value
     */
    public List<Usage> value() {
        return this.value;
    }

    /**
     * Set the list of usages.
     *
     * @param value the value value to set
     * @return the UsagesListResultInner object itself.
     */
    public UsagesListResultInner withValue(List<Usage> value) {
        this.value = value;
        return this;
    }

}
