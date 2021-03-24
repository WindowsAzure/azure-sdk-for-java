// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.servicebus.implementation;

import com.azure.resourcemanager.resources.fluentcore.arm.models.HasResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.models.IndependentChildResource;
import com.azure.resourcemanager.resources.fluentcore.arm.models.Resource;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.IndependentChildResourceImpl;
import com.azure.resourcemanager.servicebus.models.AccessKeys;
import com.azure.resourcemanager.servicebus.fluent.models.SBAuthorizationRuleInner;
import com.azure.resourcemanager.servicebus.models.AccessRights;
import com.azure.resourcemanager.servicebus.models.AuthorizationKeys;
import com.azure.resourcemanager.servicebus.models.RegenerateAccessKeyParameters;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Base type for various entity specific authorization rules.
 *
 * @param <FluentModelT> the rule fluent interface
 * @param <FluentParentModelT> the rule parent fluent interface
 * @param <InnerModelT> the rule inner model
 * @param <FluentModelImplT> the parent fluent implementation
 * @param <ManagerT> the manager
 */
abstract class AuthorizationRuleBaseImpl<
        FluentModelT extends IndependentChildResource<ManagerT, InnerModelT>,
        FluentParentModelT extends Resource & HasResourceGroup,
        InnerModelT extends SBAuthorizationRuleInner,
        FluentModelImplT extends IndependentChildResourceImpl<
            FluentModelT,
            FluentParentModelT,
            InnerModelT,
            FluentModelImplT,
            ManagerT>,
        ManagerT> extends IndependentChildResourceImpl<FluentModelT,
        FluentParentModelT,
        InnerModelT,
        FluentModelImplT,
        ManagerT> {
    protected AuthorizationRuleBaseImpl(String name, InnerModelT innerObject, ManagerT manager) {
        super(name, innerObject, manager);
    }

    /**
     * @return stream that emits primary, secondary keys and connection strings
     */
    public Mono<AuthorizationKeys> getKeysAsync() {
        return this.getKeysInnerAsync()
            .map(inner -> new AuthorizationKeysImpl(inner));
    }

    /**
     * @return primary, secondary keys and connection strings
     */
    public AuthorizationKeys getKeys() {
        return getKeysAsync().block();
    }

    /**
     * Regenerates primary or secondary keys.
     *
     * @param policykey the key to regenerate
     * @return stream that emits primary, secondary keys and connection strings
     */
    public Mono<AuthorizationKeys> regenerateKeyAsync(RegenerateAccessKeyParameters policykey) {
        return this.regenerateKeysInnerAsync(policykey)
            .map(inner -> new AuthorizationKeysImpl(inner));
    }

    /**
     * Regenerates primary or secondary keys.
     *
     * @param policykey the key to regenerate
     * @return primary, secondary keys and connection strings
     */
    public AuthorizationKeys regenerateKey(RegenerateAccessKeyParameters policykey) {
        return regenerateKeyAsync(policykey).block();
    }

    public List<AccessRights> rights() {
        if (this.innerModel().rights() == null) {
            return Collections.unmodifiableList(new ArrayList<AccessRights>());
        }
        return Collections.unmodifiableList(this.innerModel().rights());
    }

    @SuppressWarnings("unchecked")
    public FluentModelImplT withListeningEnabled() {
        if (this.innerModel().rights() == null) {
            this.innerModel().withRights(new ArrayList<AccessRights>());
        }
        if (!this.innerModel().rights().contains(AccessRights.LISTEN)) {
            this.innerModel().rights().add(AccessRights.LISTEN);
        }
        return (FluentModelImplT) this;
    }

    @SuppressWarnings("unchecked")
    public FluentModelImplT withSendingEnabled() {
        if (this.innerModel().rights() == null) {
            this.innerModel().withRights(new ArrayList<AccessRights>());
        }
        if (!this.innerModel().rights().contains(AccessRights.SEND)) {
            this.innerModel().rights().add(AccessRights.SEND);
        }
        return (FluentModelImplT) this;
    }

    @SuppressWarnings("unchecked")
    public FluentModelImplT withManagementEnabled() {
        withListeningEnabled();
        withSendingEnabled();
        if (!this.innerModel().rights().contains(AccessRights.MANAGE)) {
            this.innerModel().rights().add(AccessRights.MANAGE);
        }
        return (FluentModelImplT) this;
    }

    protected abstract Mono<AccessKeys> getKeysInnerAsync();
    protected abstract Mono<AccessKeys> regenerateKeysInnerAsync(RegenerateAccessKeyParameters policykey);
}
