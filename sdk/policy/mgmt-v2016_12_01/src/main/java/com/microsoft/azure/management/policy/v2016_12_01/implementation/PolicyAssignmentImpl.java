/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.policy.v2016_12_01.implementation;

import com.microsoft.azure.management.policy.v2016_12_01.PolicyAssignment;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class PolicyAssignmentImpl extends CreatableUpdatableImpl<PolicyAssignment, PolicyAssignmentInner, PolicyAssignmentImpl> implements PolicyAssignment, PolicyAssignment.Definition, PolicyAssignment.Update {
    private String scope;
    private String policyAssignmentName;
    private final PolicyManager manager;

    PolicyAssignmentImpl(String name, PolicyManager manager) {
        super(name, new PolicyAssignmentInner());
        this.manager = manager;
        // Set resource name
        this.policyAssignmentName = name;
        //
    }

    PolicyAssignmentImpl(PolicyAssignmentInner inner, PolicyManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.policyAssignmentName = inner.name();
        // resource ancestor names
        this.policyAssignmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "policyAssignments");
        this.scope = IdParsingUtils.getValueFromIdByPosition(inner.id(), 0);
        //
    }

    @Override
    public PolicyManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyAssignment> createResourceAsync() {
        PolicyAssignmentsInner client = this.manager().inner().policyAssignments();
        return client.createAsync(this.scope, this.policyAssignmentName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PolicyAssignment> updateResourceAsync() {
        PolicyAssignmentsInner client = this.manager().inner().policyAssignments();
        return client.createAsync(this.scope, this.policyAssignmentName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicyAssignmentInner> getInnerAsync() {
        PolicyAssignmentsInner client = this.manager().inner().policyAssignments();
        return client.getAsync(this.scope, this.policyAssignmentName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Object parameters() {
        return this.inner().parameters();
    }

    @Override
    public String policyDefinitionId() {
        return this.inner().policyDefinitionId();
    }

    @Override
    public String scopeProperty() {
        return this.inner().scopeProperty();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PolicyAssignmentImpl withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public PolicyAssignmentImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public PolicyAssignmentImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public PolicyAssignmentImpl withParameters(Object parameters) {
        this.inner().withParameters(parameters);
        return this;
    }

    @Override
    public PolicyAssignmentImpl withPolicyDefinitionId(String policyDefinitionId) {
        this.inner().withPolicyDefinitionId(policyDefinitionId);
        return this;
    }

    @Override
    public PolicyAssignmentImpl withScopeProperty(String scopeProperty) {
        this.inner().withScopeProperty(scopeProperty);
        return this;
    }

}
