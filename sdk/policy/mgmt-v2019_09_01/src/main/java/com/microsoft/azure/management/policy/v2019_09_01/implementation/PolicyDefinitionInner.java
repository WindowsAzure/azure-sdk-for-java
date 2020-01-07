/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2019_09_01.implementation;

import com.microsoft.azure.management.policy.v2019_09_01.PolicyType;
import java.util.Map;
import com.microsoft.azure.management.policy.v2019_09_01.ParameterDefinitionsValue;
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
     * BuiltIn, Custom, and Static. Possible values include: 'NotSpecified',
     * 'BuiltIn', 'Custom', 'Static'.
     */
    @JsonProperty(value = "properties.policyType")
    private PolicyType policyType;

    /**
     * The policy definition mode. Some examples are All, Indexed,
     * Microsoft.KeyVault.Data.
     */
    @JsonProperty(value = "properties.mode")
    private String mode;

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
     * The policy definition metadata.  Metadata is an open ended object and is
     * typically a collection of key value pairs.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * The parameter definitions for parameters used in the policy rule. The
     * keys are the parameter names.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, ParameterDefinitionsValue> parameters;

    /**
     * Get the type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static. Possible values include: 'NotSpecified', 'BuiltIn', 'Custom', 'Static'.
     *
     * @return the policyType value
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static. Possible values include: 'NotSpecified', 'BuiltIn', 'Custom', 'Static'.
     *
     * @param policyType the policyType value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     *
     * @return the mode value
     */
    public String mode() {
        return this.mode;
    }

    /**
     * Set the policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     *
     * @param mode the mode value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the display name of the policy definition.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the policy definition.
     *
     * @param displayName the displayName value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the policy definition description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the policy definition description.
     *
     * @param description the description value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the policy rule.
     *
     * @return the policyRule value
     */
    public Object policyRule() {
        return this.policyRule;
    }

    /**
     * Set the policy rule.
     *
     * @param policyRule the policyRule value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
        return this;
    }

    /**
     * Get the policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     *
     * @param metadata the metadata value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     *
     * @return the parameters value
     */
    public Map<String, ParameterDefinitionsValue> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     *
     * @param parameters the parameters value to set
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withParameters(Map<String, ParameterDefinitionsValue> parameters) {
        this.parameters = parameters;
        return this;
    }

}
