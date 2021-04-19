// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.fluent.models.AttestationInner;
import com.azure.resourcemanager.policyinsights.models.Attestation;
import com.azure.resourcemanager.policyinsights.models.AttestationEvidence;
import com.azure.resourcemanager.policyinsights.models.ComplianceState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class AttestationImpl implements Attestation, Attestation.Definition, Attestation.Update {
    private AttestationInner innerObject;

    private final com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String policyAssignmentId() {
        return this.innerModel().policyAssignmentId();
    }

    public String policyDefinitionReferenceId() {
        return this.innerModel().policyDefinitionReferenceId();
    }

    public ComplianceState complianceState() {
        return this.innerModel().complianceState();
    }

    public OffsetDateTime expiresOn() {
        return this.innerModel().expiresOn();
    }

    public String owner() {
        return this.innerModel().owner();
    }

    public String comments() {
        return this.innerModel().comments();
    }

    public List<AttestationEvidence> evidence() {
        List<AttestationEvidence> inner = this.innerModel().evidence();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime lastComplianceStateChangeAt() {
        return this.innerModel().lastComplianceStateChangeAt();
    }

    public AttestationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String attestationName;

    public AttestationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Attestation create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestations()
                .createOrUpdateAtResourceGroup(resourceGroupName, attestationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Attestation create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestations()
                .createOrUpdateAtResourceGroup(resourceGroupName, attestationName, this.innerModel(), context);
        return this;
    }

    AttestationImpl(String name, com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerObject = new AttestationInner();
        this.serviceManager = serviceManager;
        this.attestationName = name;
    }

    public AttestationImpl update() {
        return this;
    }

    public Attestation apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestations()
                .createOrUpdateAtResourceGroup(resourceGroupName, attestationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Attestation apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestations()
                .createOrUpdateAtResourceGroup(resourceGroupName, attestationName, this.innerModel(), context);
        return this;
    }

    AttestationImpl(
        AttestationInner innerObject, com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.attestationName = Utils.getValueFromIdByName(innerObject.id(), "attestations");
    }

    public Attestation refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestations()
                .getByResourceGroupWithResponse(resourceGroupName, attestationName, Context.NONE)
                .getValue();
        return this;
    }

    public Attestation refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestations()
                .getByResourceGroupWithResponse(resourceGroupName, attestationName, context)
                .getValue();
        return this;
    }

    public AttestationImpl withPolicyAssignmentId(String policyAssignmentId) {
        this.innerModel().withPolicyAssignmentId(policyAssignmentId);
        return this;
    }

    public AttestationImpl withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.innerModel().withPolicyDefinitionReferenceId(policyDefinitionReferenceId);
        return this;
    }

    public AttestationImpl withComplianceState(ComplianceState complianceState) {
        this.innerModel().withComplianceState(complianceState);
        return this;
    }

    public AttestationImpl withExpiresOn(OffsetDateTime expiresOn) {
        this.innerModel().withExpiresOn(expiresOn);
        return this;
    }

    public AttestationImpl withOwner(String owner) {
        this.innerModel().withOwner(owner);
        return this;
    }

    public AttestationImpl withComments(String comments) {
        this.innerModel().withComments(comments);
        return this;
    }

    public AttestationImpl withEvidence(List<AttestationEvidence> evidence) {
        this.innerModel().withEvidence(evidence);
        return this;
    }
}
