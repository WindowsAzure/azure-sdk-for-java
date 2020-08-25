/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2020_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ID of the subscriptions that is being renamed.
 */
public class RenamedSubscriptionIdInner {
    /**
     * The ID of the subscriptions that is being renamed.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the ID of the subscriptions that is being renamed.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
