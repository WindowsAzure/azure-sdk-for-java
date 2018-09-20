/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The policy details.
 */
public class PolicyDetails {
    /**
     * The ID of the policy definition.
     */
    @JsonProperty(value = "policyDefinitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyDefinitionId;

    /**
     * The ID of the policy assignment.
     */
    @JsonProperty(value = "policyAssignmentId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyAssignmentId;

    /**
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "policyAssignmentDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String policyAssignmentDisplayName;

    /**
     * The scope of the policy assignment.
     */
    @JsonProperty(value = "policyAssignmentScope", access = JsonProperty.Access.WRITE_ONLY)
    private String policyAssignmentScope;

    /**
     * The ID of the policy set definition.
     */
    @JsonProperty(value = "policySetDefinitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String policySetDefinitionId;

    /**
     * The policy definition reference ID within the policy set definition.
     */
    @JsonProperty(value = "policyDefinitionReferenceId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyDefinitionReferenceId;

    /**
     * Get the ID of the policy definition.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Get the ID of the policy assignment.
     *
     * @return the policyAssignmentId value
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Get the display name of the policy assignment.
     *
     * @return the policyAssignmentDisplayName value
     */
    public String policyAssignmentDisplayName() {
        return this.policyAssignmentDisplayName;
    }

    /**
     * Get the scope of the policy assignment.
     *
     * @return the policyAssignmentScope value
     */
    public String policyAssignmentScope() {
        return this.policyAssignmentScope;
    }

    /**
     * Get the ID of the policy set definition.
     *
     * @return the policySetDefinitionId value
     */
    public String policySetDefinitionId() {
        return this.policySetDefinitionId;
    }

    /**
     * Get the policy definition reference ID within the policy set definition.
     *
     * @return the policyDefinitionReferenceId value
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

}
