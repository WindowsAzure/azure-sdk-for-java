/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A policy that specifies the delivery rules to be used for an endpoint.
 */
public class EndpointPropertiesUpdateParametersDeliveryPolicy {
    /**
     * User-friendly description of the policy.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * A list of the delivery rules.
     */
    @JsonProperty(value = "rules", required = true)
    private List<DeliveryRule> rules;

    /**
     * Get user-friendly description of the policy.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set user-friendly description of the policy.
     *
     * @param description the description value to set
     * @return the EndpointPropertiesUpdateParametersDeliveryPolicy object itself.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get a list of the delivery rules.
     *
     * @return the rules value
     */
    public List<DeliveryRule> rules() {
        return this.rules;
    }

    /**
     * Set a list of the delivery rules.
     *
     * @param rules the rules value to set
     * @return the EndpointPropertiesUpdateParametersDeliveryPolicy object itself.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy withRules(List<DeliveryRule> rules) {
        this.rules = rules;
        return this;
    }

}
