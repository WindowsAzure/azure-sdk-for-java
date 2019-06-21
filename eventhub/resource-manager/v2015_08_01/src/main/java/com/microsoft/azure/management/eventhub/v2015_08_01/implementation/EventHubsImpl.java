/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventhub.v2015_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhub.v2015_08_01.EventHubs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventhub.v2015_08_01.EventHubResource;
import com.microsoft.azure.management.eventhub.v2015_08_01.EventhubNamespaceSharedAccessAuthorizationRuleResource;
import com.microsoft.azure.management.eventhub.v2015_08_01.NamespaceSharedAccessAuthorizationRuleResource;
import com.microsoft.azure.management.eventhub.v2015_08_01.ResourceListKeys;

class EventHubsImpl extends WrapperImpl<EventHubsInner> implements EventHubs {
    private final EventHubManager manager;

    EventHubsImpl(EventHubManager manager) {
        super(manager.inner().eventHubs());
        this.manager = manager;
    }

    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public EventHubResourceImpl define(String name) {
        return wrapModel(name);
    }

    private EventHubResourceImpl wrapModel(EventHubResourceInner inner) {
        return  new EventHubResourceImpl(inner, manager());
    }

    private EventHubResourceImpl wrapModel(String name) {
        return new EventHubResourceImpl(name, this.manager());
    }

    @Override
    public Observable<EventHubResource> listAllAsync(final String resourceGroupName, final String namespaceName) {
        EventHubsInner client = this.inner();
        return client.listAllAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<EventHubResourceInner>, Iterable<EventHubResourceInner>>() {
            @Override
            public Iterable<EventHubResourceInner> call(Page<EventHubResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventHubResourceInner, EventHubResource>() {
            @Override
            public EventHubResource call(EventHubResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<EventHubResource> getAsync(String resourceGroupName, String namespaceName, String eventHubName) {
        EventHubsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, eventHubName)
        .map(new Func1<EventHubResourceInner, EventHubResource>() {
            @Override
            public EventHubResource call(EventHubResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String eventHubName) {
        EventHubsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, eventHubName).toCompletable();
    }

    @Override
    public EventhubNamespaceSharedAccessAuthorizationRuleResourceImpl defineAuthorizationRule(String name) {
        return wrapAuthorizationRuleModel(name);
    }

    private EventhubNamespaceSharedAccessAuthorizationRuleResourceImpl wrapAuthorizationRuleModel(String name) {
        return new EventhubNamespaceSharedAccessAuthorizationRuleResourceImpl(name, this.manager());
    }

    private EventhubNamespaceSharedAccessAuthorizationRuleResourceImpl wrapEventhubNamespaceSharedAccessAuthorizationRuleResourceModel(SharedAccessAuthorizationRuleResourceInner inner) {
        return  new EventhubNamespaceSharedAccessAuthorizationRuleResourceImpl(inner, manager());
    }

    private Observable<SharedAccessAuthorizationRuleResourceInner> getSharedAccessAuthorizationRuleResourceInnerUsingEventHubsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String eventHubName = IdParsingUtils.getValueFromIdByName(id, "eventhubs");
        String authorizationRuleName = IdParsingUtils.getValueFromIdByName(id, "authorizationRules");
        EventHubsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName);
    }

    @Override
    public Observable<EventhubNamespaceSharedAccessAuthorizationRuleResource> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName)
        .map(new Func1<SharedAccessAuthorizationRuleResourceInner, EventhubNamespaceSharedAccessAuthorizationRuleResource>() {
            @Override
            public EventhubNamespaceSharedAccessAuthorizationRuleResource call(SharedAccessAuthorizationRuleResourceInner inner) {
                return wrapEventhubNamespaceSharedAccessAuthorizationRuleResourceModel(inner);
            }
       });
    }

    @Override
    public Observable<EventhubNamespaceSharedAccessAuthorizationRuleResource> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        EventHubsInner client = this.inner();
        return client.listAuthorizationRulesAsync(resourceGroupName, namespaceName, eventHubName)
        .flatMapIterable(new Func1<Page<SharedAccessAuthorizationRuleResourceInner>, Iterable<SharedAccessAuthorizationRuleResourceInner>>() {
            @Override
            public Iterable<SharedAccessAuthorizationRuleResourceInner> call(Page<SharedAccessAuthorizationRuleResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SharedAccessAuthorizationRuleResourceInner, EventhubNamespaceSharedAccessAuthorizationRuleResource>() {
            @Override
            public EventhubNamespaceSharedAccessAuthorizationRuleResource call(SharedAccessAuthorizationRuleResourceInner inner) {
                return wrapEventhubNamespaceSharedAccessAuthorizationRuleResourceModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.deleteAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName).toCompletable();
    }

    @Override
    public Observable<NamespaceSharedAccessAuthorizationRuleResource> postAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.postAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName)
        .map(new Func1<SharedAccessAuthorizationRuleResourceInner, NamespaceSharedAccessAuthorizationRuleResource>() {
            @Override
            public NamespaceSharedAccessAuthorizationRuleResource call(SharedAccessAuthorizationRuleResourceInner inner) {
                return new NamespaceSharedAccessAuthorizationRuleResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName)
        .map(new Func1<ResourceListKeysInner, ResourceListKeys>() {
            @Override
            public ResourceListKeys call(ResourceListKeysInner inner) {
                return new ResourceListKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.regenerateKeysAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName)
        .map(new Func1<ResourceListKeysInner, ResourceListKeys>() {
            @Override
            public ResourceListKeys call(ResourceListKeysInner inner) {
                return new ResourceListKeysImpl(inner, manager());
            }
        });
    }

}
