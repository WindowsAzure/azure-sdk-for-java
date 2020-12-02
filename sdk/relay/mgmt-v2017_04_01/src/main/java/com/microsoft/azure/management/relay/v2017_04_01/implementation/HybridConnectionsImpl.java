/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.relay.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.relay.v2017_04_01.HybridConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.relay.v2017_04_01.HybridConnection;
import com.microsoft.azure.management.relay.v2017_04_01.HybridConnectionNamespaceAuthorizationRule;
import com.microsoft.azure.management.relay.v2017_04_01.AccessKeys;
import com.microsoft.azure.management.relay.v2017_04_01.RegenerateAccessKeyParameters;

class HybridConnectionsImpl extends WrapperImpl<HybridConnectionsInner> implements HybridConnections {
    private final RelayManager manager;

    HybridConnectionsImpl(RelayManager manager) {
        super(manager.inner().hybridConnections());
        this.manager = manager;
    }

    public RelayManager manager() {
        return this.manager;
    }

    @Override
    public HybridConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private HybridConnectionImpl wrapModel(HybridConnectionInner inner) {
        return  new HybridConnectionImpl(inner, manager());
    }

    private HybridConnectionImpl wrapModel(String name) {
        return new HybridConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<HybridConnection> listByNamespaceAsync(final String resourceGroupName, final String namespaceName) {
        HybridConnectionsInner client = this.inner();
        return client.listByNamespaceAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<HybridConnectionInner>, Iterable<HybridConnectionInner>>() {
            @Override
            public Iterable<HybridConnectionInner> call(Page<HybridConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<HybridConnectionInner, HybridConnection>() {
            @Override
            public HybridConnection call(HybridConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<HybridConnection> getAsync(String resourceGroupName, String namespaceName, String hybridConnectionName) {
        HybridConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, hybridConnectionName)
        .flatMap(new Func1<HybridConnectionInner, Observable<HybridConnection>>() {
            @Override
            public Observable<HybridConnection> call(HybridConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((HybridConnection)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String hybridConnectionName) {
        HybridConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, hybridConnectionName).toCompletable();
    }

    @Override
    public HybridConnectionNamespaceAuthorizationRuleImpl defineAuthorizationRule(String name) {
        return wrapAuthorizationRuleModel(name);
    }

    private HybridConnectionNamespaceAuthorizationRuleImpl wrapAuthorizationRuleModel(String name) {
        return new HybridConnectionNamespaceAuthorizationRuleImpl(name, this.manager());
    }

    private HybridConnectionNamespaceAuthorizationRuleImpl wrapHybridConnectionNamespaceAuthorizationRuleModel(AuthorizationRuleInner inner) {
        return  new HybridConnectionNamespaceAuthorizationRuleImpl(inner, manager());
    }

    private Observable<AuthorizationRuleInner> getAuthorizationRuleInnerUsingHybridConnectionsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String hybridConnectionName = IdParsingUtils.getValueFromIdByName(id, "hybridConnections");
        String authorizationRuleName = IdParsingUtils.getValueFromIdByName(id, "authorizationRules");
        HybridConnectionsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName);
    }

    @Override
    public Observable<HybridConnectionNamespaceAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName) {
        HybridConnectionsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName)
        .flatMap(new Func1<AuthorizationRuleInner, Observable<HybridConnectionNamespaceAuthorizationRule>>() {
            @Override
            public Observable<HybridConnectionNamespaceAuthorizationRule> call(AuthorizationRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((HybridConnectionNamespaceAuthorizationRule)wrapHybridConnectionNamespaceAuthorizationRuleModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<HybridConnectionNamespaceAuthorizationRule> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String hybridConnectionName) {
        HybridConnectionsInner client = this.inner();
        return client.listAuthorizationRulesAsync(resourceGroupName, namespaceName, hybridConnectionName)
        .flatMapIterable(new Func1<Page<AuthorizationRuleInner>, Iterable<AuthorizationRuleInner>>() {
            @Override
            public Iterable<AuthorizationRuleInner> call(Page<AuthorizationRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AuthorizationRuleInner, HybridConnectionNamespaceAuthorizationRule>() {
            @Override
            public HybridConnectionNamespaceAuthorizationRule call(AuthorizationRuleInner inner) {
                return wrapHybridConnectionNamespaceAuthorizationRuleModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName) {
        HybridConnectionsInner client = this.inner();
        return client.deleteAuthorizationRuleAsync(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName).toCompletable();
    }

    @Override
    public Observable<AccessKeys> listKeysAsync(String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName) {
        HybridConnectionsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AccessKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName, RegenerateAccessKeyParameters parameters) {
        HybridConnectionsInner client = this.inner();
        return client.regenerateKeysAsync(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, parameters)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

}
