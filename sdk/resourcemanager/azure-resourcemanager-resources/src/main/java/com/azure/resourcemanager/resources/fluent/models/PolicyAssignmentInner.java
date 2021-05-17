// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.EnforcementMode;
import com.azure.resourcemanager.resources.models.Identity;
import com.azure.resourcemanager.resources.models.NonComplianceMessage;
import com.azure.resourcemanager.resources.models.ParameterValuesValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The policy assignment. */
@JsonFlatten
@Fluent
public class PolicyAssignmentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyAssignmentInner.class);

    /*
     * The location of the policy assignment. Only required when utilizing
     * managed identity.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The managed identity associated with the policy assignment.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The ID of the policy definition or policy set definition being assigned.
     */
    @JsonProperty(value = "properties.policyDefinitionId")
    private String policyDefinitionId;

    /*
     * The scope for the policy assignment.
     */
    @JsonProperty(value = "properties.scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /*
     * The policy's excluded scopes.
     */
    @JsonProperty(value = "properties.notScopes")
    private List<String> notScopes;

    /*
     * The parameter values for the assigned policy rule. The keys are the
     * parameter names.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, ParameterValuesValue> parameters;

    /*
     * This message will be part of response in case of policy violation.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The policy assignment metadata. Metadata is an open ended object and is
     * typically a collection of key value pairs.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /*
     * The policy assignment enforcement mode. Possible values are Default and
     * DoNotEnforce.
     */
    @JsonProperty(value = "properties.enforcementMode")
    private EnforcementMode enforcementMode;

    /*
     * The messages that describe why a resource is non-compliant with the
     * policy.
     */
    @JsonProperty(value = "properties.nonComplianceMessages")
    private List<NonComplianceMessage> nonComplianceMessages;

    /**
     * Get the location property: The location of the policy assignment. Only required when utilizing managed identity.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the policy assignment. Only required when utilizing managed identity.
     *
     * @param location the location value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the identity property: The managed identity associated with the policy assignment.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity associated with the policy assignment.
     *
     * @param identity the identity value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy assignment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy assignment.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the policyDefinitionId property: The ID of the policy definition or policy set definition being assigned.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: The ID of the policy definition or policy set definition being assigned.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the scope property: The scope for the policy assignment.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the notScopes property: The policy's excluded scopes.
     *
     * @return the notScopes value.
     */
    public List<String> notScopes() {
        return this.notScopes;
    }

    /**
     * Set the notScopes property: The policy's excluded scopes.
     *
     * @param notScopes the notScopes value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withNotScopes(List<String> notScopes) {
        this.notScopes = notScopes;
        return this;
    }

    /**
     * Get the parameters property: The parameter values for the assigned policy rule. The keys are the parameter names.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterValuesValue> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameter values for the assigned policy rule. The keys are the parameter names.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withParameters(Map<String, ParameterValuesValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the description property: This message will be part of response in case of policy violation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: This message will be part of response in case of policy violation.
     *
     * @param description the description value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadata property: The policy assignment metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The policy assignment metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @param metadata the metadata value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the enforcementMode property: The policy assignment enforcement mode. Possible values are Default and
     * DoNotEnforce.
     *
     * @return the enforcementMode value.
     */
    public EnforcementMode enforcementMode() {
        return this.enforcementMode;
    }

    /**
     * Set the enforcementMode property: The policy assignment enforcement mode. Possible values are Default and
     * DoNotEnforce.
     *
     * @param enforcementMode the enforcementMode value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withEnforcementMode(EnforcementMode enforcementMode) {
        this.enforcementMode = enforcementMode;
        return this;
    }

    /**
     * Get the nonComplianceMessages property: The messages that describe why a resource is non-compliant with the
     * policy.
     *
     * @return the nonComplianceMessages value.
     */
    public List<NonComplianceMessage> nonComplianceMessages() {
        return this.nonComplianceMessages;
    }

    /**
     * Set the nonComplianceMessages property: The messages that describe why a resource is non-compliant with the
     * policy.
     *
     * @param nonComplianceMessages the nonComplianceMessages value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withNonComplianceMessages(List<NonComplianceMessage> nonComplianceMessages) {
        this.nonComplianceMessages = nonComplianceMessages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (parameters() != null) {
            parameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (nonComplianceMessages() != null) {
            nonComplianceMessages().forEach(e -> e.validate());
        }
    }
}
