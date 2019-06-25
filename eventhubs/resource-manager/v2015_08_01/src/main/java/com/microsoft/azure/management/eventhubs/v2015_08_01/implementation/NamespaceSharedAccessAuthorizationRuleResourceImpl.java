/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import com.microsoft.azure.management.eventhubs.v2015_08_01.NamespaceSharedAccessAuthorizationRuleResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2015_08_01.SharedAccessAuthorizationRuleCreateOrUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.eventhubs.v2015_08_01.AccessRights;
import rx.functions.Func1;

class NamespaceSharedAccessAuthorizationRuleResourceImpl extends CreatableUpdatableImpl<NamespaceSharedAccessAuthorizationRuleResource, SharedAccessAuthorizationRuleResourceInner, NamespaceSharedAccessAuthorizationRuleResourceImpl> implements NamespaceSharedAccessAuthorizationRuleResource, NamespaceSharedAccessAuthorizationRuleResource.Definition, NamespaceSharedAccessAuthorizationRuleResource.Update {
    private final EventHubsManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String authorizationRuleName;
    private SharedAccessAuthorizationRuleCreateOrUpdateParameters createOrUpdateParameter;

    NamespaceSharedAccessAuthorizationRuleResourceImpl(String name, EventHubsManager manager) {
        super(name, new SharedAccessAuthorizationRuleResourceInner());
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = name;
        //
        this.createOrUpdateParameter = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    NamespaceSharedAccessAuthorizationRuleResourceImpl(SharedAccessAuthorizationRuleResourceInner inner, EventHubsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.authorizationRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "AuthorizationRules");
        //
        this.createOrUpdateParameter = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    @Override
    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NamespaceSharedAccessAuthorizationRuleResource> createResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.authorizationRuleName, this.createOrUpdateParameter)
            .map(new Func1<SharedAccessAuthorizationRuleResourceInner, SharedAccessAuthorizationRuleResourceInner>() {
               @Override
               public SharedAccessAuthorizationRuleResourceInner call(SharedAccessAuthorizationRuleResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NamespaceSharedAccessAuthorizationRuleResource> updateResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.authorizationRuleName, this.createOrUpdateParameter)
            .map(new Func1<SharedAccessAuthorizationRuleResourceInner, SharedAccessAuthorizationRuleResourceInner>() {
               @Override
               public SharedAccessAuthorizationRuleResourceInner call(SharedAccessAuthorizationRuleResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SharedAccessAuthorizationRuleResourceInner> getInnerAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.getAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.authorizationRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<AccessRights> rights() {
        return this.inner().rights();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public NamespaceSharedAccessAuthorizationRuleResourceImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public NamespaceSharedAccessAuthorizationRuleResourceImpl withRights(List<AccessRights> rights) {
        this.createOrUpdateParameter.withRights(rights);
        return this;
    }

    @Override
    public NamespaceSharedAccessAuthorizationRuleResourceImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public NamespaceSharedAccessAuthorizationRuleResourceImpl withName(String name) {
        this.createOrUpdateParameter.withName(name);
        return this;
    }

}
