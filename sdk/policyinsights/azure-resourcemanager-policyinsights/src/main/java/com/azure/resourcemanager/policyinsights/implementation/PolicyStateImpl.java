// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.resourcemanager.policyinsights.fluent.models.PolicyStateInner;
import com.azure.resourcemanager.policyinsights.models.ComponentStateDetails;
import com.azure.resourcemanager.policyinsights.models.PolicyEvaluationDetails;
import com.azure.resourcemanager.policyinsights.models.PolicyState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PolicyStateImpl implements PolicyState {
    private PolicyStateInner innerObject;

    private final com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager;

    PolicyStateImpl(
        PolicyStateInner innerObject, com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String odataId() {
        return this.innerModel().odataId();
    }

    public String odataContext() {
        return this.innerModel().odataContext();
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String policyAssignmentId() {
        return this.innerModel().policyAssignmentId();
    }

    public String policyDefinitionId() {
        return this.innerModel().policyDefinitionId();
    }

    public String effectiveParameters() {
        return this.innerModel().effectiveParameters();
    }

    public Boolean isCompliant() {
        return this.innerModel().isCompliant();
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String resourceLocation() {
        return this.innerModel().resourceLocation();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public String resourceTags() {
        return this.innerModel().resourceTags();
    }

    public String policyAssignmentName() {
        return this.innerModel().policyAssignmentName();
    }

    public String policyAssignmentOwner() {
        return this.innerModel().policyAssignmentOwner();
    }

    public String policyAssignmentParameters() {
        return this.innerModel().policyAssignmentParameters();
    }

    public String policyAssignmentScope() {
        return this.innerModel().policyAssignmentScope();
    }

    public String policyDefinitionName() {
        return this.innerModel().policyDefinitionName();
    }

    public String policyDefinitionAction() {
        return this.innerModel().policyDefinitionAction();
    }

    public String policyDefinitionCategory() {
        return this.innerModel().policyDefinitionCategory();
    }

    public String policySetDefinitionId() {
        return this.innerModel().policySetDefinitionId();
    }

    public String policySetDefinitionName() {
        return this.innerModel().policySetDefinitionName();
    }

    public String policySetDefinitionOwner() {
        return this.innerModel().policySetDefinitionOwner();
    }

    public String policySetDefinitionCategory() {
        return this.innerModel().policySetDefinitionCategory();
    }

    public String policySetDefinitionParameters() {
        return this.innerModel().policySetDefinitionParameters();
    }

    public String managementGroupIds() {
        return this.innerModel().managementGroupIds();
    }

    public String policyDefinitionReferenceId() {
        return this.innerModel().policyDefinitionReferenceId();
    }

    public String complianceState() {
        return this.innerModel().complianceState();
    }

    public PolicyEvaluationDetails policyEvaluationDetails() {
        return this.innerModel().policyEvaluationDetails();
    }

    public List<String> policyDefinitionGroupNames() {
        List<String> inner = this.innerModel().policyDefinitionGroupNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ComponentStateDetails> components() {
        List<ComponentStateDetails> inner = this.innerModel().components();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String policyDefinitionVersion() {
        return this.innerModel().policyDefinitionVersion();
    }

    public String policySetDefinitionVersion() {
        return this.innerModel().policySetDefinitionVersion();
    }

    public String policyAssignmentVersion() {
        return this.innerModel().policyAssignmentVersion();
    }

    public Map<String, Object> additionalProperties() {
        Map<String, Object> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PolicyStateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager() {
        return this.serviceManager;
    }
}
