/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for UrlFileExtension match conditions.
 */
public class UrlFileExtensionMatchConditionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * Describes operator to be matched. Possible values include: 'Any',
     * 'Equal', 'Contains', 'BeginsWith', 'EndsWith', 'LessThan',
     * 'LessThanOrEqual', 'GreaterThan', 'GreaterThanOrEqual'.
     */
    @JsonProperty(value = "operator", required = true)
    private UrlFileExtensionOperator operator;

    /**
     * Describes if this is negate condition or not.
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /**
     * The match value for the condition of the delivery rule.
     */
    @JsonProperty(value = "matchValues", required = true)
    private List<String> matchValues;

    /**
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /**
     * Creates an instance of UrlFileExtensionMatchConditionParameters class.
     * @param operator describes operator to be matched. Possible values include: 'Any', 'Equal', 'Contains', 'BeginsWith', 'EndsWith', 'LessThan', 'LessThanOrEqual', 'GreaterThan', 'GreaterThanOrEqual'.
     * @param matchValues the match value for the condition of the delivery rule.
     */
    public UrlFileExtensionMatchConditionParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.DeliveryRuleUrlFileExtensionMatchConditionParameters";
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
     * @return the UrlFileExtensionMatchConditionParameters object itself.
     */
    public UrlFileExtensionMatchConditionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get describes operator to be matched. Possible values include: 'Any', 'Equal', 'Contains', 'BeginsWith', 'EndsWith', 'LessThan', 'LessThanOrEqual', 'GreaterThan', 'GreaterThanOrEqual'.
     *
     * @return the operator value
     */
    public UrlFileExtensionOperator operator() {
        return this.operator;
    }

    /**
     * Set describes operator to be matched. Possible values include: 'Any', 'Equal', 'Contains', 'BeginsWith', 'EndsWith', 'LessThan', 'LessThanOrEqual', 'GreaterThan', 'GreaterThanOrEqual'.
     *
     * @param operator the operator value to set
     * @return the UrlFileExtensionMatchConditionParameters object itself.
     */
    public UrlFileExtensionMatchConditionParameters withOperator(UrlFileExtensionOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get describes if this is negate condition or not.
     *
     * @return the negateCondition value
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set describes if this is negate condition or not.
     *
     * @param negateCondition the negateCondition value to set
     * @return the UrlFileExtensionMatchConditionParameters object itself.
     */
    public UrlFileExtensionMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the match value for the condition of the delivery rule.
     *
     * @return the matchValues value
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the match value for the condition of the delivery rule.
     *
     * @param matchValues the matchValues value to set
     * @return the UrlFileExtensionMatchConditionParameters object itself.
     */
    public UrlFileExtensionMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get list of transforms.
     *
     * @return the transforms value
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set list of transforms.
     *
     * @param transforms the transforms value to set
     * @return the UrlFileExtensionMatchConditionParameters object itself.
     */
    public UrlFileExtensionMatchConditionParameters withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

}
