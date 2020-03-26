// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.resources.PolicyDefinitionReference;
import com.azure.management.resources.PolicyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PolicySetDefinition model.
 */
@JsonFlatten
@Fluent
public class PolicySetDefinitionInner extends ProxyResource {
    /*
     * The type of policy definition. Possible values are NotSpecified,
     * BuiltIn, and Custom.
     */
    @JsonProperty(value = "properties.policyType")
    private PolicyType policyType;

    /*
     * The display name of the policy set definition.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The policy set definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The policy set definition metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /*
     * The policy set definition parameters that can be used in policy
     * definition references.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /*
     * An array of policy definition references.
     */
    @JsonProperty(value = "properties.policyDefinitions")
    private List<PolicyDefinitionReference> policyDefinitions;

    /**
     * Get the policyType property: The type of policy definition. Possible
     * values are NotSpecified, BuiltIn, and Custom.
     * 
     * @return the policyType value.
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType property: The type of policy definition. Possible
     * values are NotSpecified, BuiltIn, and Custom.
     * 
     * @param policyType the policyType value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy set
     * definition.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy set
     * definition.
     * 
     * @param displayName the displayName value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The policy set definition description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The policy set definition description.
     * 
     * @param description the description value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadata property: The policy set definition metadata.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The policy set definition metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the parameters property: The policy set definition parameters that
     * can be used in policy definition references.
     * 
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The policy set definition parameters that
     * can be used in policy definition references.
     * 
     * @param parameters the parameters value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the policyDefinitions property: An array of policy definition
     * references.
     * 
     * @return the policyDefinitions value.
     */
    public List<PolicyDefinitionReference> policyDefinitions() {
        return this.policyDefinitions;
    }

    /**
     * Set the policyDefinitions property: An array of policy definition
     * references.
     * 
     * @param policyDefinitions the policyDefinitions value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyDefinitions(List<PolicyDefinitionReference> policyDefinitions) {
        this.policyDefinitions = policyDefinitions;
        return this;
    }
}
