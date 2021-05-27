// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.PolicyInsights.PolicyStateDeleted event. */
@Fluent
public final class PolicyInsightsPolicyStateDeletedEventData {
    /*
     * The time that the resource was scanned by Azure Policy in the Universal
     * ISO 8601 DateTime format yyyy-MM-ddTHH:mm:ss.fffffffZ.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * The resource ID of the policy assignment.
     */
    @JsonProperty(value = "policyAssignmentId")
    private String policyAssignmentId;

    /*
     * The resource ID of the policy definition.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /*
     * The reference ID for the policy definition inside the initiative
     * definition, if the policy assignment is for an initiative. May be empty.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /*
     * The compliance state of the resource with respect to the policy
     * assignment.
     */
    @JsonProperty(value = "complianceState")
    private String complianceState;

    /*
     * The subscription ID of the resource.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The compliance reason code. May be empty.
     */
    @JsonProperty(value = "complianceReasonCode")
    private String complianceReasonCode;

    /**
     * Get the timestamp property: The time that the resource was scanned by Azure Policy in the Universal ISO 8601
     * DateTime format yyyy-MM-ddTHH:mm:ss.fffffffZ.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The time that the resource was scanned by Azure Policy in the Universal ISO 8601
     * DateTime format yyyy-MM-ddTHH:mm:ss.fffffffZ.
     *
     * @param timestamp the timestamp value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the policyAssignmentId property: The resource ID of the policy assignment.
     *
     * @return the policyAssignmentId value.
     */
    public String getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: The resource ID of the policy assignment.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policyDefinitionId property: The resource ID of the policy definition.
     *
     * @return the policyDefinitionId value.
     */
    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: The resource ID of the policy definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: The reference ID for the policy definition inside the initiative
     * definition, if the policy assignment is for an initiative. May be empty.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: The reference ID for the policy definition inside the initiative
     * definition, if the policy assignment is for an initiative. May be empty.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setPolicyDefinitionReferenceId(
            String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get the complianceState property: The compliance state of the resource with respect to the policy assignment.
     *
     * @return the complianceState value.
     */
    public String getComplianceState() {
        return this.complianceState;
    }

    /**
     * Set the complianceState property: The compliance state of the resource with respect to the policy assignment.
     *
     * @param complianceState the complianceState value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription ID of the resource.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription ID of the resource.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the complianceReasonCode property: The compliance reason code. May be empty.
     *
     * @return the complianceReasonCode value.
     */
    public String getComplianceReasonCode() {
        return this.complianceReasonCode;
    }

    /**
     * Set the complianceReasonCode property: The compliance reason code. May be empty.
     *
     * @param complianceReasonCode the complianceReasonCode value to set.
     * @return the PolicyInsightsPolicyStateDeletedEventData object itself.
     */
    public PolicyInsightsPolicyStateDeletedEventData setComplianceReasonCode(String complianceReasonCode) {
        this.complianceReasonCode = complianceReasonCode;
        return this;
    }
}
