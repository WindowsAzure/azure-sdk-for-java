/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_03_01.implementation;

import com.microsoft.azure.management.authorization.v2018_03_01.PolicyType;
import com.microsoft.azure.management.authorization.v2018_03_01.PolicyMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The policy definition.
 */
@JsonFlatten
public class PolicyDefinitionInner extends ProxyResource {
    /**
     * The type of policy definition. Possible values are NotSpecified,
     * BuiltIn, and Custom. Possible values include: 'NotSpecified', 'BuiltIn',
     * 'Custom'.
     */
    @JsonProperty(value = "properties.policyType")
    private PolicyType policyType;

    /**
     * The policy definition mode. Possible values are NotSpecified, Indexed,
     * and All. Possible values include: 'NotSpecified', 'Indexed', 'All'.
     */
    @JsonProperty(value = "properties.mode")
    private PolicyMode mode;

    /**
     * The display name of the policy definition.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The policy definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The policy rule.
     */
    @JsonProperty(value = "properties.policyRule")
    private Object policyRule;

    /**
     * The policy definition metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * Get the policyType value.
     *
     * @return the policyType value
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType value.
     *
     * @param policyType the policyType value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the mode value.
     *
     * @return the mode value
     */
    public PolicyMode mode() {
        return this.mode;
    }

    /**
     * Set the mode value.
     *
     * @param mode the mode value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMode(PolicyMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the policyRule value.
     *
     * @return the policyRule value
     */
    public Object policyRule() {
        return this.policyRule;
    }

    /**
     * Set the policyRule value.
     *
     * @param policyRule the policyRule value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

}
