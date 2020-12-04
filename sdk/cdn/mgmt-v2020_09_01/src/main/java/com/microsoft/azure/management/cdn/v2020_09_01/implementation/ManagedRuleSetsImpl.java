/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleSets;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleSetDefinition;

class ManagedRuleSetsImpl extends WrapperImpl<ManagedRuleSetsInner> implements ManagedRuleSets {
    private final CdnManager manager;

    ManagedRuleSetsImpl(CdnManager manager) {
        super(manager.inner().managedRuleSets());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagedRuleSetDefinition> listAsync() {
        ManagedRuleSetsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ManagedRuleSetDefinitionInner>, Iterable<ManagedRuleSetDefinitionInner>>() {
            @Override
            public Iterable<ManagedRuleSetDefinitionInner> call(Page<ManagedRuleSetDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedRuleSetDefinitionInner, ManagedRuleSetDefinition>() {
            @Override
            public ManagedRuleSetDefinition call(ManagedRuleSetDefinitionInner inner) {
                return new ManagedRuleSetDefinitionImpl(inner, manager());
            }
        });
    }

}
