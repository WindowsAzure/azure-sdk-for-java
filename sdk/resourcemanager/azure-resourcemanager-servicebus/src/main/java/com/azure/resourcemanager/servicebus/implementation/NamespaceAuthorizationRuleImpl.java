// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.servicebus.implementation;

import com.azure.core.management.Region;
import com.azure.resourcemanager.servicebus.ServiceBusManager;
import com.azure.resourcemanager.servicebus.models.AccessKeys;
import com.azure.resourcemanager.servicebus.fluent.models.SBAuthorizationRuleInner;
import com.azure.resourcemanager.servicebus.models.NamespaceAuthorizationRule;
import com.azure.resourcemanager.servicebus.models.RegenerateAccessKeyParameters;
import reactor.core.publisher.Mono;

/**
 * Implementation for NamespaceAuthorizationRule.
 */
class NamespaceAuthorizationRuleImpl extends AuthorizationRuleBaseImpl<NamespaceAuthorizationRule,
    ServiceBusNamespaceImpl,
    SBAuthorizationRuleInner,
    NamespaceAuthorizationRuleImpl,
    ServiceBusManager>
    implements
        NamespaceAuthorizationRule,
        NamespaceAuthorizationRule.Definition,
        NamespaceAuthorizationRule.Update {
    private final Region region;

    NamespaceAuthorizationRuleImpl(String resourceGroupName,
                                   String namespaceName,
                                   String name,
                                   Region region,
                                   SBAuthorizationRuleInner inner,
                                   ServiceBusManager manager) {
        super(name, inner, manager);
        this.region = region;
        this.withExistingParentResource(resourceGroupName, namespaceName);
    }

    @Override
    public String namespaceName() {
        return this.parentName;
    }

    @Override
    protected Mono<SBAuthorizationRuleInner> getInnerAsync() {
        return this.manager().serviceClient().getNamespaces()
                .getAuthorizationRuleAsync(this.resourceGroupName(),
                        this.namespaceName(),
                        this.name());
    }

    @Override
    protected Mono<NamespaceAuthorizationRule> createChildResourceAsync() {
        final NamespaceAuthorizationRule self = this;
        return this.manager().serviceClient().getNamespaces()
            .createOrUpdateAuthorizationRuleAsync(
                this.resourceGroupName(),
                this.namespaceName(),
                this.name(),
                this.innerModel().rights())
            .map(inner -> {
                setInner(inner);
                return self;
            });
    }

    @Override
    protected Mono<AccessKeys> getKeysInnerAsync() {
        return this.manager().serviceClient().getNamespaces()
                .listKeysAsync(this.resourceGroupName(),
                        this.namespaceName(),
                        this.name());
    }

    @Override
    protected Mono<AccessKeys> regenerateKeysInnerAsync(RegenerateAccessKeyParameters policykey) {
        return this.manager().serviceClient().getNamespaces()
                .regenerateKeysAsync(this.resourceGroupName(),
                        this.namespaceName(),
                        this.name(),
                        policykey);
    }
}
