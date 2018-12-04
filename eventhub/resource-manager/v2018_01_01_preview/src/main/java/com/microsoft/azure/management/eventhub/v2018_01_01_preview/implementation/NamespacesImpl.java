/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.Namespaces;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.EHNamespace;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.NetworkRuleSet;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.IpFilterRule;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.VirtualNetworkRule;

class NamespacesImpl extends GroupableResourcesCoreImpl<EHNamespace, EHNamespaceImpl, EHNamespaceInner, NamespacesInner, EventHubManager>  implements Namespaces {
    protected NamespacesImpl(EventHubManager manager) {
        super(manager.inner().namespaces(), manager);
    }

    @Override
    protected Observable<EHNamespaceInner> getInnerAsync(String resourceGroupName, String name) {
        NamespacesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        NamespacesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<EHNamespace> listByResourceGroup(String resourceGroupName) {
        NamespacesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<EHNamespace> listByResourceGroupAsync(String resourceGroupName) {
        NamespacesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<EHNamespaceInner>, Iterable<EHNamespaceInner>>() {
            @Override
            public Iterable<EHNamespaceInner> call(Page<EHNamespaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EHNamespaceInner, EHNamespace>() {
            @Override
            public EHNamespace call(EHNamespaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<EHNamespace> list() {
        NamespacesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<EHNamespace> listAsync() {
        NamespacesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EHNamespaceInner>, Iterable<EHNamespaceInner>>() {
            @Override
            public Iterable<EHNamespaceInner> call(Page<EHNamespaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EHNamespaceInner, EHNamespace>() {
            @Override
            public EHNamespace call(EHNamespaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public EHNamespaceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<NetworkRuleSet> createNetworkRuleSetAsync(String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters) {
        NamespacesInner client = this.inner();
        return client.createNetworkRuleSetAsync(resourceGroupName, namespaceName, parameters)
        .map(new Func1<NetworkRuleSetInner, NetworkRuleSet>() {
            @Override
            public NetworkRuleSet call(NetworkRuleSetInner inner) {
                return new NetworkRuleSetImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NetworkRuleSet> getNetworkRuleSetAsync(String resourceGroupName, String namespaceName) {
        NamespacesInner client = this.inner();
        return client.getNetworkRuleSetAsync(resourceGroupName, namespaceName)
        .map(new Func1<NetworkRuleSetInner, NetworkRuleSet>() {
            @Override
            public NetworkRuleSet call(NetworkRuleSetInner inner) {
                return new NetworkRuleSetImpl(inner, manager());
            }
        });
    }

    @Override
    protected EHNamespaceImpl wrapModel(EHNamespaceInner inner) {
        return  new EHNamespaceImpl(inner.name(), inner, manager());
    }

    @Override
    protected EHNamespaceImpl wrapModel(String name) {
        return new EHNamespaceImpl(name, new EHNamespaceInner(), this.manager());
    }

    @Override
    public IpFilterRuleImpl defineIpfilterrule(String name) {
        return wrapIpfilterruleModel(name);
    }

    @Override
    public VirtualNetworkRuleImpl defineVirtualnetworkrule(String name) {
        return wrapVirtualnetworkruleModel(name);
    }

    private IpFilterRuleImpl wrapIpfilterruleModel(String name) {
        return new IpFilterRuleImpl(name, this.manager());
    }

    private VirtualNetworkRuleImpl wrapVirtualnetworkruleModel(String name) {
        return new VirtualNetworkRuleImpl(name, this.manager());
    }

    private IpFilterRuleImpl wrapIpFilterRuleModel(IpFilterRuleInner inner) {
        return  new IpFilterRuleImpl(inner, manager());
    }

    private VirtualNetworkRuleImpl wrapVirtualNetworkRuleModel(VirtualNetworkRuleInner inner) {
        return  new VirtualNetworkRuleImpl(inner, manager());
    }

    private Observable<IpFilterRuleInner> getIpFilterRuleInnerUsingNamespacesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String ipFilterRuleName = IdParsingUtils.getValueFromIdByName(id, "ipfilterrules");
        NamespacesInner client = this.inner();
        return client.getIpFilterRuleAsync(resourceGroupName, namespaceName, ipFilterRuleName);
    }

    private Observable<VirtualNetworkRuleInner> getVirtualNetworkRuleInnerUsingNamespacesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String virtualNetworkRuleName = IdParsingUtils.getValueFromIdByName(id, "virtualnetworkrules");
        NamespacesInner client = this.inner();
        return client.getVirtualNetworkRuleAsync(resourceGroupName, namespaceName, virtualNetworkRuleName);
    }

    @Override
    public Observable<IpFilterRule> getIpFilterRuleAsync(String resourceGroupName, String namespaceName, String ipFilterRuleName) {
        NamespacesInner client = this.inner();
        return client.getIpFilterRuleAsync(resourceGroupName, namespaceName, ipFilterRuleName)
        .map(new Func1<IpFilterRuleInner, IpFilterRule>() {
            @Override
            public IpFilterRule call(IpFilterRuleInner inner) {
                return wrapIpFilterRuleModel(inner);
            }
       });
    }

    @Override
    public Observable<IpFilterRule> listIPFilterRulesAsync(final String resourceGroupName, final String namespaceName) {
        NamespacesInner client = this.inner();
        return client.listIPFilterRulesAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<IpFilterRuleInner>, Iterable<IpFilterRuleInner>>() {
            @Override
            public Iterable<IpFilterRuleInner> call(Page<IpFilterRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IpFilterRuleInner, IpFilterRule>() {
            @Override
            public IpFilterRule call(IpFilterRuleInner inner) {
                return wrapIpFilterRuleModel(inner);
            }
        });
    }

    @Override
    public Completable deleteIpFilterRuleAsync(String resourceGroupName, String namespaceName, String ipFilterRuleName) {
        NamespacesInner client = this.inner();
        return client.deleteIpFilterRuleAsync(resourceGroupName, namespaceName, ipFilterRuleName).toCompletable();
    }

    @Override
    public Observable<VirtualNetworkRule> getVirtualNetworkRuleAsync(String resourceGroupName, String namespaceName, String virtualNetworkRuleName) {
        NamespacesInner client = this.inner();
        return client.getVirtualNetworkRuleAsync(resourceGroupName, namespaceName, virtualNetworkRuleName)
        .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRule>() {
            @Override
            public VirtualNetworkRule call(VirtualNetworkRuleInner inner) {
                return wrapVirtualNetworkRuleModel(inner);
            }
       });
    }

    @Override
    public Observable<VirtualNetworkRule> listVirtualNetworkRulesAsync(final String resourceGroupName, final String namespaceName) {
        NamespacesInner client = this.inner();
        return client.listVirtualNetworkRulesAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<VirtualNetworkRuleInner>, Iterable<VirtualNetworkRuleInner>>() {
            @Override
            public Iterable<VirtualNetworkRuleInner> call(Page<VirtualNetworkRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRule>() {
            @Override
            public VirtualNetworkRule call(VirtualNetworkRuleInner inner) {
                return wrapVirtualNetworkRuleModel(inner);
            }
        });
    }

    @Override
    public Completable deleteVirtualNetworkRuleAsync(String resourceGroupName, String namespaceName, String virtualNetworkRuleName) {
        NamespacesInner client = this.inner();
        return client.deleteVirtualNetworkRuleAsync(resourceGroupName, namespaceName, virtualNetworkRuleName).toCompletable();
    }

}
