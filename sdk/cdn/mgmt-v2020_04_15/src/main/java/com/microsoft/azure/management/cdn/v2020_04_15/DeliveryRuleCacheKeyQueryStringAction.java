/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the cache-key query string action for the delivery rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name", defaultImpl = DeliveryRuleCacheKeyQueryStringAction.class)
@JsonTypeName("CacheKeyQueryString")
public class DeliveryRuleCacheKeyQueryStringAction extends DeliveryRuleAction {
    /**
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private CacheKeyQueryStringActionParameters parameters;

    /**
     * Get defines the parameters for the action.
     *
     * @return the parameters value
     */
    public CacheKeyQueryStringActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set defines the parameters for the action.
     *
     * @param parameters the parameters value to set
     * @return the DeliveryRuleCacheKeyQueryStringAction object itself.
     */
    public DeliveryRuleCacheKeyQueryStringAction withParameters(CacheKeyQueryStringActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
