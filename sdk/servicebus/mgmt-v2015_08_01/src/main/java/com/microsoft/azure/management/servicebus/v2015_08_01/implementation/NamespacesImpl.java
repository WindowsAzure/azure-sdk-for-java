/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.servicebus.v2015_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.servicebus.v2015_08_01.Namespaces;
import com.microsoft.azure.management.servicebus.v2015_08_01.NamespaceResource;
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
import com.microsoft.azure.management.servicebus.v2015_08_01.CheckNameAvailabilityResult;
import com.microsoft.azure.management.servicebus.v2015_08_01.NamespaceSharedAccessAuthorizationRuleResource;
import com.microsoft.azure.management.servicebus.v2015_08_01.ResourceListKeys;

class NamespacesImpl extends GroupableResourcesCoreImpl<NamespaceResource, NamespaceResourceImpl, NamespaceResourceInner, NamespacesInner, ServiceBusManager>  implements Namespaces {
    protected NamespacesImpl(ServiceBusManager manager) {
        super(manager.inner().namespaces(), manager);
    }

    @Override
    protected Observable<NamespaceResourceInner> getInnerAsync(String resourceGroupName, String name) {
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
    public PagedList<NamespaceResource> listByResourceGroup(String resourceGroupName) {
        NamespacesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<NamespaceResource> listByResourceGroupAsync(String resourceGroupName) {
        NamespacesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<NamespaceResourceInner>, Iterable<NamespaceResourceInner>>() {
            @Override
            public Iterable<NamespaceResourceInner> call(Page<NamespaceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NamespaceResourceInner, NamespaceResource>() {
            @Override
            public NamespaceResource call(NamespaceResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<NamespaceResource> list() {
        NamespacesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<NamespaceResource> listAsync() {
        NamespacesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NamespaceResourceInner>, Iterable<NamespaceResourceInner>>() {
            @Override
            public Iterable<NamespaceResourceInner> call(Page<NamespaceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NamespaceResourceInner, NamespaceResource>() {
            @Override
            public NamespaceResource call(NamespaceResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public NamespaceResourceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityMethodAsync(String name) {
        NamespacesInner client = this.inner();
        return client.checkNameAvailabilityMethodAsync(name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected NamespaceResourceImpl wrapModel(NamespaceResourceInner inner) {
        return  new NamespaceResourceImpl(inner.name(), inner, manager());
    }

    @Override
    protected NamespaceResourceImpl wrapModel(String name) {
        return new NamespaceResourceImpl(name, new NamespaceResourceInner(), this.manager());
    }

    @Override
    public NamespaceSharedAccessAuthorizationRuleResourceImpl defineAuthorizationRule(String name) {
        return wrapAuthorizationRuleModel(name);
    }

    private NamespaceSharedAccessAuthorizationRuleResourceImpl wrapAuthorizationRuleModel(String name) {
        return new NamespaceSharedAccessAuthorizationRuleResourceImpl(name, this.manager());
    }

    private NamespaceSharedAccessAuthorizationRuleResourceImpl wrapNamespaceSharedAccessAuthorizationRuleResourceModel(SharedAccessAuthorizationRuleResourceInner inner) {
        return  new NamespaceSharedAccessAuthorizationRuleResourceImpl(inner, manager());
    }

    private Observable<SharedAccessAuthorizationRuleResourceInner> getSharedAccessAuthorizationRuleResourceInnerUsingNamespacesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String authorizationRuleName = IdParsingUtils.getValueFromIdByName(id, "AuthorizationRules");
        NamespacesInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, authorizationRuleName);
    }

    @Override
    public Observable<NamespaceSharedAccessAuthorizationRuleResource> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, authorizationRuleName)
        .flatMap(new Func1<SharedAccessAuthorizationRuleResourceInner, Observable<NamespaceSharedAccessAuthorizationRuleResource>>() {
            @Override
            public Observable<NamespaceSharedAccessAuthorizationRuleResource> call(SharedAccessAuthorizationRuleResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((NamespaceSharedAccessAuthorizationRuleResource)wrapNamespaceSharedAccessAuthorizationRuleResourceModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<NamespaceSharedAccessAuthorizationRuleResource> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName) {
        NamespacesInner client = this.inner();
        return client.listAuthorizationRulesAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<SharedAccessAuthorizationRuleResourceInner>, Iterable<SharedAccessAuthorizationRuleResourceInner>>() {
            @Override
            public Iterable<SharedAccessAuthorizationRuleResourceInner> call(Page<SharedAccessAuthorizationRuleResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SharedAccessAuthorizationRuleResourceInner, NamespaceSharedAccessAuthorizationRuleResource>() {
            @Override
            public NamespaceSharedAccessAuthorizationRuleResource call(SharedAccessAuthorizationRuleResourceInner inner) {
                return wrapNamespaceSharedAccessAuthorizationRuleResourceModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.deleteAuthorizationRuleAsync(resourceGroupName, namespaceName, authorizationRuleName).toCompletable();
    }

    @Override
    public Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, namespaceName, authorizationRuleName)
        .map(new Func1<ResourceListKeysInner, ResourceListKeys>() {
            @Override
            public ResourceListKeys call(ResourceListKeysInner inner) {
                return new ResourceListKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.regenerateKeysAsync(resourceGroupName, namespaceName, authorizationRuleName)
        .map(new Func1<ResourceListKeysInner, ResourceListKeys>() {
            @Override
            public ResourceListKeys call(ResourceListKeysInner inner) {
                return new ResourceListKeysImpl(inner, manager());
            }
        });
    }

}
