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
 * Defines the Cookies condition for the delivery rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name", defaultImpl = DeliveryRuleCookiesCondition.class)
@JsonTypeName("Cookies")
public class DeliveryRuleCookiesCondition extends DeliveryRuleCondition {
    /**
     * Defines the parameters for the condition.
     */
    @JsonProperty(value = "parameters", required = true)
    private CookiesMatchConditionParameters parameters;

    /**
     * Get defines the parameters for the condition.
     *
     * @return the parameters value
     */
    public CookiesMatchConditionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set defines the parameters for the condition.
     *
     * @param parameters the parameters value to set
     * @return the DeliveryRuleCookiesCondition object itself.
     */
    public DeliveryRuleCookiesCondition withParameters(CookiesMatchConditionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
