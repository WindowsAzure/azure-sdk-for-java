/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04.implementation;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Policy state record.
 */
public class PolicyStateInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * OData entity ID; always set to null since policy state records do not
     * have an entity ID.
     */
    @JsonProperty(value = "@odata\\.id")
    private String odataid;

    /**
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata\\.context")
    private String odatacontext;

    /**
     * Timestamp for the policy state record.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Policy assignment ID.
     */
    @JsonProperty(value = "policyAssignmentId")
    private String policyAssignmentId;

    /**
     * Policy definition ID.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /**
     * Effective parameters for the policy assignment.
     */
    @JsonProperty(value = "effectiveParameters")
    private String effectiveParameters;

    /**
     * Flag which states whether the resource is compliant against the policy
     * assignment it was evaluated against.
     */
    @JsonProperty(value = "isCompliant")
    private Boolean isCompliant;

    /**
     * Subscription ID.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * Resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * Resource location.
     */
    @JsonProperty(value = "resourceLocation")
    private String resourceLocation;

    /**
     * Resource group name.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * List of resource tags.
     */
    @JsonProperty(value = "resourceTags")
    private String resourceTags;

    /**
     * Policy assignment name.
     */
    @JsonProperty(value = "policyAssignmentName")
    private String policyAssignmentName;

    /**
     * Policy assignment owner.
     */
    @JsonProperty(value = "policyAssignmentOwner")
    private String policyAssignmentOwner;

    /**
     * Policy assignment parameters.
     */
    @JsonProperty(value = "policyAssignmentParameters")
    private String policyAssignmentParameters;

    /**
     * Policy assignment scope.
     */
    @JsonProperty(value = "policyAssignmentScope")
    private String policyAssignmentScope;

    /**
     * Policy definition name.
     */
    @JsonProperty(value = "policyDefinitionName")
    private String policyDefinitionName;

    /**
     * Policy definition action, i.e. effect.
     */
    @JsonProperty(value = "policyDefinitionAction")
    private String policyDefinitionAction;

    /**
     * Policy definition category.
     */
    @JsonProperty(value = "policyDefinitionCategory")
    private String policyDefinitionCategory;

    /**
     * Policy set definition ID, if the policy assignment is for a policy set.
     */
    @JsonProperty(value = "policySetDefinitionId")
    private String policySetDefinitionId;

    /**
     * Policy set definition name, if the policy assignment is for a policy
     * set.
     */
    @JsonProperty(value = "policySetDefinitionName")
    private String policySetDefinitionName;

    /**
     * Policy set definition owner, if the policy assignment is for a policy
     * set.
     */
    @JsonProperty(value = "policySetDefinitionOwner")
    private String policySetDefinitionOwner;

    /**
     * Policy set definition category, if the policy assignment is for a policy
     * set.
     */
    @JsonProperty(value = "policySetDefinitionCategory")
    private String policySetDefinitionCategory;

    /**
     * Policy set definition parameters, if the policy assignment is for a
     * policy set.
     */
    @JsonProperty(value = "policySetDefinitionParameters")
    private String policySetDefinitionParameters;

    /**
     * Comma separated list of management group IDs, which represent the
     * hierarchy of the management groups the resource is under.
     */
    @JsonProperty(value = "managementGroupIds")
    private String managementGroupIds;

    /**
     * Reference ID for the policy definition inside the policy set, if the
     * policy assignment is for a policy set.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get oData entity ID; always set to null since policy state records do not have an entity ID.
     *
     * @return the odataid value
     */
    public String odataid() {
        return this.odataid;
    }

    /**
     * Set oData entity ID; always set to null since policy state records do not have an entity ID.
     *
     * @param odataid the odataid value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withOdataid(String odataid) {
        this.odataid = odataid;
        return this;
    }

    /**
     * Get oData context string; used by OData clients to resolve type information based on metadata.
     *
     * @return the odatacontext value
     */
    public String odatacontext() {
        return this.odatacontext;
    }

    /**
     * Set oData context string; used by OData clients to resolve type information based on metadata.
     *
     * @param odatacontext the odatacontext value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withOdatacontext(String odatacontext) {
        this.odatacontext = odatacontext;
        return this;
    }

    /**
     * Get timestamp for the policy state record.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set timestamp for the policy state record.
     *
     * @param timestamp the timestamp value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set resource ID.
     *
     * @param resourceId the resourceId value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get policy assignment ID.
     *
     * @return the policyAssignmentId value
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set policy assignment ID.
     *
     * @param policyAssignmentId the policyAssignmentId value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get policy definition ID.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set policy definition ID.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get effective parameters for the policy assignment.
     *
     * @return the effectiveParameters value
     */
    public String effectiveParameters() {
        return this.effectiveParameters;
    }

    /**
     * Set effective parameters for the policy assignment.
     *
     * @param effectiveParameters the effectiveParameters value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withEffectiveParameters(String effectiveParameters) {
        this.effectiveParameters = effectiveParameters;
        return this;
    }

    /**
     * Get flag which states whether the resource is compliant against the policy assignment it was evaluated against.
     *
     * @return the isCompliant value
     */
    public Boolean isCompliant() {
        return this.isCompliant;
    }

    /**
     * Set flag which states whether the resource is compliant against the policy assignment it was evaluated against.
     *
     * @param isCompliant the isCompliant value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withIsCompliant(Boolean isCompliant) {
        this.isCompliant = isCompliant;
        return this;
    }

    /**
     * Get subscription ID.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set subscription ID.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set resource type.
     *
     * @param resourceType the resourceType value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resource location.
     *
     * @return the resourceLocation value
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set resource location.
     *
     * @param resourceLocation the resourceLocation value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get resource group name.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set resource group name.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get list of resource tags.
     *
     * @return the resourceTags value
     */
    public String resourceTags() {
        return this.resourceTags;
    }

    /**
     * Set list of resource tags.
     *
     * @param resourceTags the resourceTags value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withResourceTags(String resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    /**
     * Get policy assignment name.
     *
     * @return the policyAssignmentName value
     */
    public String policyAssignmentName() {
        return this.policyAssignmentName;
    }

    /**
     * Set policy assignment name.
     *
     * @param policyAssignmentName the policyAssignmentName value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /**
     * Get policy assignment owner.
     *
     * @return the policyAssignmentOwner value
     */
    public String policyAssignmentOwner() {
        return this.policyAssignmentOwner;
    }

    /**
     * Set policy assignment owner.
     *
     * @param policyAssignmentOwner the policyAssignmentOwner value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyAssignmentOwner(String policyAssignmentOwner) {
        this.policyAssignmentOwner = policyAssignmentOwner;
        return this;
    }

    /**
     * Get policy assignment parameters.
     *
     * @return the policyAssignmentParameters value
     */
    public String policyAssignmentParameters() {
        return this.policyAssignmentParameters;
    }

    /**
     * Set policy assignment parameters.
     *
     * @param policyAssignmentParameters the policyAssignmentParameters value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyAssignmentParameters(String policyAssignmentParameters) {
        this.policyAssignmentParameters = policyAssignmentParameters;
        return this;
    }

    /**
     * Get policy assignment scope.
     *
     * @return the policyAssignmentScope value
     */
    public String policyAssignmentScope() {
        return this.policyAssignmentScope;
    }

    /**
     * Set policy assignment scope.
     *
     * @param policyAssignmentScope the policyAssignmentScope value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyAssignmentScope(String policyAssignmentScope) {
        this.policyAssignmentScope = policyAssignmentScope;
        return this;
    }

    /**
     * Get policy definition name.
     *
     * @return the policyDefinitionName value
     */
    public String policyDefinitionName() {
        return this.policyDefinitionName;
    }

    /**
     * Set policy definition name.
     *
     * @param policyDefinitionName the policyDefinitionName value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyDefinitionName(String policyDefinitionName) {
        this.policyDefinitionName = policyDefinitionName;
        return this;
    }

    /**
     * Get policy definition action, i.e. effect.
     *
     * @return the policyDefinitionAction value
     */
    public String policyDefinitionAction() {
        return this.policyDefinitionAction;
    }

    /**
     * Set policy definition action, i.e. effect.
     *
     * @param policyDefinitionAction the policyDefinitionAction value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyDefinitionAction(String policyDefinitionAction) {
        this.policyDefinitionAction = policyDefinitionAction;
        return this;
    }

    /**
     * Get policy definition category.
     *
     * @return the policyDefinitionCategory value
     */
    public String policyDefinitionCategory() {
        return this.policyDefinitionCategory;
    }

    /**
     * Set policy definition category.
     *
     * @param policyDefinitionCategory the policyDefinitionCategory value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyDefinitionCategory(String policyDefinitionCategory) {
        this.policyDefinitionCategory = policyDefinitionCategory;
        return this;
    }

    /**
     * Get policy set definition ID, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionId value
     */
    public String policySetDefinitionId() {
        return this.policySetDefinitionId;
    }

    /**
     * Set policy set definition ID, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionId the policySetDefinitionId value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicySetDefinitionId(String policySetDefinitionId) {
        this.policySetDefinitionId = policySetDefinitionId;
        return this;
    }

    /**
     * Get policy set definition name, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionName value
     */
    public String policySetDefinitionName() {
        return this.policySetDefinitionName;
    }

    /**
     * Set policy set definition name, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionName the policySetDefinitionName value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicySetDefinitionName(String policySetDefinitionName) {
        this.policySetDefinitionName = policySetDefinitionName;
        return this;
    }

    /**
     * Get policy set definition owner, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionOwner value
     */
    public String policySetDefinitionOwner() {
        return this.policySetDefinitionOwner;
    }

    /**
     * Set policy set definition owner, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionOwner the policySetDefinitionOwner value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicySetDefinitionOwner(String policySetDefinitionOwner) {
        this.policySetDefinitionOwner = policySetDefinitionOwner;
        return this;
    }

    /**
     * Get policy set definition category, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionCategory value
     */
    public String policySetDefinitionCategory() {
        return this.policySetDefinitionCategory;
    }

    /**
     * Set policy set definition category, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionCategory the policySetDefinitionCategory value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicySetDefinitionCategory(String policySetDefinitionCategory) {
        this.policySetDefinitionCategory = policySetDefinitionCategory;
        return this;
    }

    /**
     * Get policy set definition parameters, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionParameters value
     */
    public String policySetDefinitionParameters() {
        return this.policySetDefinitionParameters;
    }

    /**
     * Set policy set definition parameters, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionParameters the policySetDefinitionParameters value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicySetDefinitionParameters(String policySetDefinitionParameters) {
        this.policySetDefinitionParameters = policySetDefinitionParameters;
        return this;
    }

    /**
     * Get comma separated list of management group IDs, which represent the hierarchy of the management groups the resource is under.
     *
     * @return the managementGroupIds value
     */
    public String managementGroupIds() {
        return this.managementGroupIds;
    }

    /**
     * Set comma separated list of management group IDs, which represent the hierarchy of the management groups the resource is under.
     *
     * @param managementGroupIds the managementGroupIds value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withManagementGroupIds(String managementGroupIds) {
        this.managementGroupIds = managementGroupIds;
        return this;
    }

    /**
     * Get reference ID for the policy definition inside the policy set, if the policy assignment is for a policy set.
     *
     * @return the policyDefinitionReferenceId value
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set reference ID for the policy definition inside the policy set, if the policy assignment is for a policy set.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set
     * @return the PolicyStateInner object itself.
     */
    public PolicyStateInner withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

}
