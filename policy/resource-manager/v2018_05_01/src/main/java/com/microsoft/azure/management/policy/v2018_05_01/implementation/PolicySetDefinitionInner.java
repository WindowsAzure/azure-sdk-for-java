/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2018_05_01.implementation;

import com.microsoft.azure.management.policy.v2018_05_01.PolicyType;
import java.util.List;
import com.microsoft.azure.management.policy.v2018_05_01.PolicyDefinitionReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The policy set definition.
 */
@JsonFlatten
public class PolicySetDefinitionInner extends ProxyResource {
    /**
     * The type of policy definition. Possible values are NotSpecified,
     * BuiltIn, and Custom. Possible values include: 'NotSpecified', 'BuiltIn',
     * 'Custom'.
     */
    @JsonProperty(value = "properties.policyType")
    private PolicyType policyType;

    /**
     * The display name of the policy set definition.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The policy set definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The policy set definition metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * The policy set definition parameters that can be used in policy
     * definition references.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * An array of policy definition references.
     */
    @JsonProperty(value = "properties.policyDefinitions", required = true)
    private List<PolicyDefinitionReference> policyDefinitions;

    /**
     * Get the type of policy definition. Possible values are NotSpecified, BuiltIn, and Custom. Possible values include: 'NotSpecified', 'BuiltIn', 'Custom'.
     *
     * @return the policyType value
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the type of policy definition. Possible values are NotSpecified, BuiltIn, and Custom. Possible values include: 'NotSpecified', 'BuiltIn', 'Custom'.
     *
     * @param policyType the policyType value to set
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the display name of the policy set definition.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the policy set definition.
     *
     * @param displayName the displayName value to set
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the policy set definition description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the policy set definition description.
     *
     * @param description the description value to set
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the policy set definition metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the policy set definition metadata.
     *
     * @param metadata the metadata value to set
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the policy set definition parameters that can be used in policy definition references.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the policy set definition parameters that can be used in policy definition references.
     *
     * @param parameters the parameters value to set
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get an array of policy definition references.
     *
     * @return the policyDefinitions value
     */
    public List<PolicyDefinitionReference> policyDefinitions() {
        return this.policyDefinitions;
    }

    /**
     * Set an array of policy definition references.
     *
     * @param policyDefinitions the policyDefinitions value to set
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyDefinitions(List<PolicyDefinitionReference> policyDefinitions) {
        this.policyDefinitions = policyDefinitions;
        return this;
    }

}
