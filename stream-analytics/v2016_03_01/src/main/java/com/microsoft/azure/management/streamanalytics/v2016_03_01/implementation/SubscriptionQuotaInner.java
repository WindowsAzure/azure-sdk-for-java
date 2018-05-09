/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Describes the current quota for the subscription.
 */
@JsonFlatten
public class SubscriptionQuotaInner extends SubResource {
    /**
     * The max permitted usage of this resource.
     */
    @JsonProperty(value = "properties.maxCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxCount;

    /**
     * The current usage of this resource.
     */
    @JsonProperty(value = "properties.currentCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentCount;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the maxCount value.
     *
     * @return the maxCount value
     */
    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Get the currentCount value.
     *
     * @return the currentCount value
     */
    public Integer currentCount() {
        return this.currentCount;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SubscriptionQuotaInner object itself.
     */
    public SubscriptionQuotaInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
