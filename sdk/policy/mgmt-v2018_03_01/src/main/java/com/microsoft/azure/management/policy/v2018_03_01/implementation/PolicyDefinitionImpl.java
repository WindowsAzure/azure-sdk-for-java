/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.policy.v2018_03_01.implementation;

import com.microsoft.azure.management.policy.v2018_03_01.PolicyDefinition;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.policy.v2018_03_01.PolicyType;
import com.microsoft.azure.management.policy.v2018_03_01.PolicyMode;

class PolicyDefinitionImpl extends CreatableUpdatableImpl<PolicyDefinition, PolicyDefinitionInner, PolicyDefinitionImpl> implements PolicyDefinition, PolicyDefinition.Definition, PolicyDefinition.Update {
    private String policyDefinitionName;
    private final PolicyManager manager;

    PolicyDefinitionImpl(String name, PolicyManager manager) {
        super(name, new PolicyDefinitionInner());
        this.manager = manager;
        // Set resource name
        this.policyDefinitionName = name;
        //
    }

    PolicyDefinitionImpl(PolicyDefinitionInner inner, PolicyManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.policyDefinitionName = inner.name();
        // resource ancestor names
        this.policyDefinitionName = IdParsingUtils.getValueFromIdByName(inner.id(), "policyDefinitions");
        //
    }

    @Override
    public PolicyManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyDefinition> createResourceAsync() {
        PolicyDefinitionsInner client = this.manager().inner().policyDefinitions();
        return client.createOrUpdateAsync(this.policyDefinitionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PolicyDefinition> updateResourceAsync() {
        PolicyDefinitionsInner client = this.manager().inner().policyDefinitions();
        return client.createOrUpdateAsync(this.policyDefinitionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicyDefinitionInner> getInnerAsync() {
        PolicyDefinitionsInner client = this.manager().inner().policyDefinitions();
        return client.getAsync(this.policyDefinitionName);
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
    public Object metadata() {
        return this.inner().metadata();
    }

    @Override
    public PolicyMode mode() {
        return this.inner().mode();
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
    public Object policyRule() {
        return this.inner().policyRule();
    }

    @Override
    public PolicyType policyType() {
        return this.inner().policyType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PolicyDefinitionImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public PolicyDefinitionImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public PolicyDefinitionImpl withMetadata(Object metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public PolicyDefinitionImpl withMode(PolicyMode mode) {
        this.inner().withMode(mode);
        return this;
    }

    @Override
    public PolicyDefinitionImpl withParameters(Object parameters) {
        this.inner().withParameters(parameters);
        return this;
    }

    @Override
    public PolicyDefinitionImpl withPolicyRule(Object policyRule) {
        this.inner().withPolicyRule(policyRule);
        return this;
    }

    @Override
    public PolicyDefinitionImpl withPolicyType(PolicyType policyType) {
        this.inner().withPolicyType(policyType);
        return this;
    }

}
