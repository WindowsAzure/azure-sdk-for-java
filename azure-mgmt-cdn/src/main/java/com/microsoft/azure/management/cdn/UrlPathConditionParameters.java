/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for the URL path condition.
 */
public class UrlPathConditionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * A URL path for the condition of the delivery rule.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /**
     * The match type for the condition of the delivery rule. Possible values
     * include: 'Literal', 'Wildcard'.
     */
    @JsonProperty(value = "matchType", required = true)
    private String matchType;

    /**
     * Creates an instance of UrlPathConditionParameters class.
     * @param path a URL path for the condition of the delivery rule.
     * @param matchType the match type for the condition of the delivery rule. Possible values include: 'Literal', 'Wildcard'.
     */
    public UrlPathConditionParameters() {
        odatatype = "Microsoft.Azure.Cdn.Models.DeliveryRuleUrlPathConditionParameters";
    }

    /**
     * Get the odatatype value.
     *
     * @return the odatatype value
     */
    public String odatatype() {
        return this.odatatype;
    }

    /**
     * Set the odatatype value.
     *
     * @param odatatype the odatatype value to set
     * @return the UrlPathConditionParameters object itself.
     */
    public UrlPathConditionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get a URL path for the condition of the delivery rule.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set a URL path for the condition of the delivery rule.
     *
     * @param path the path value to set
     * @return the UrlPathConditionParameters object itself.
     */
    public UrlPathConditionParameters withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the match type for the condition of the delivery rule. Possible values include: 'Literal', 'Wildcard'.
     *
     * @return the matchType value
     */
    public String matchType() {
        return this.matchType;
    }

    /**
     * Set the match type for the condition of the delivery rule. Possible values include: 'Literal', 'Wildcard'.
     *
     * @param matchType the matchType value to set
     * @return the UrlPathConditionParameters object itself.
     */
    public UrlPathConditionParameters withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

}
