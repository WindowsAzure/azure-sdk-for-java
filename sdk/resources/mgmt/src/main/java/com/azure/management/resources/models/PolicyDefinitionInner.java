// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.resources.ParameterDefinitionsValue;
import com.azure.management.resources.PolicyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The PolicyDefinition model. */
@JsonFlatten
@Fluent
public class PolicyDefinitionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyDefinitionInner.class);

    /*
     * The type of policy definition. Possible values are NotSpecified,
     * BuiltIn, Custom, and Static.
     */
    @JsonProperty(value = "properties.policyType")
    private PolicyType policyType;

    /*
     * The policy definition mode. Some examples are All, Indexed,
     * Microsoft.KeyVault.Data.
     */
    @JsonProperty(value = "properties.mode")
    private String mode;

    /*
     * The display name of the policy definition.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The policy definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The policy rule.
     */
    @JsonProperty(value = "properties.policyRule")
    private Object policyRule;

    /*
     * The policy definition metadata.  Metadata is an open ended object and is
     * typically a collection of key value pairs.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /*
     * The parameter definitions for parameters used in the policy rule. The
     * keys are the parameter names.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, ParameterDefinitionsValue> parameters;

    /**
     * Get the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     *
     * @return the policyType value.
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     *
     * @param policyType the policyType value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the mode property: The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     *
     * @return the mode value.
     */
    public String mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     *
     * @param mode the mode value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy definition.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The policy definition description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The policy definition description.
     *
     * @param description the description value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the policyRule property: The policy rule.
     *
     * @return the policyRule value.
     */
    public Object policyRule() {
        return this.policyRule;
    }

    /**
     * Set the policyRule property: The policy rule.
     *
     * @param policyRule the policyRule value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
        return this;
    }

    /**
     * Get the metadata property: The policy definition metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The policy definition metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @param metadata the metadata value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the parameters property: The parameter definitions for parameters used in the policy rule. The keys are the
     * parameter names.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterDefinitionsValue> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameter definitions for parameters used in the policy rule. The keys are the
     * parameter names.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withParameters(Map<String, ParameterDefinitionsValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().values().forEach(e -> e.validate());
        }
    }
}
