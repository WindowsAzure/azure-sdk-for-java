/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation;

import com.microsoft.azure.management.notificationhubs.v2017_04_01.NotificationHubNamespaceSharedAccessAuthorizationRuleResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.notificationhubs.v2017_04_01.SharedAccessAuthorizationRuleProperties;
import java.util.List;
import com.microsoft.azure.management.notificationhubs.v2017_04_01.AccessRights;
import com.microsoft.azure.management.notificationhubs.v2017_04_01.Sku;
import java.util.Map;
import rx.functions.Func1;

class NotificationHubNamespaceSharedAccessAuthorizationRuleResourceImpl extends CreatableUpdatableImpl<NotificationHubNamespaceSharedAccessAuthorizationRuleResource, SharedAccessAuthorizationRuleResourceInner, NotificationHubNamespaceSharedAccessAuthorizationRuleResourceImpl> implements NotificationHubNamespaceSharedAccessAuthorizationRuleResource, NotificationHubNamespaceSharedAccessAuthorizationRuleResource.Definition, NotificationHubNamespaceSharedAccessAuthorizationRuleResource.Update {
    private final NotificationHubsManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String notificationHubName;
    private String authorizationRuleName;
    private SharedAccessAuthorizationRuleProperties cproperties;
    private SharedAccessAuthorizationRuleProperties uproperties;

    NotificationHubNamespaceSharedAccessAuthorizationRuleResourceImpl(String name, NotificationHubsManager manager) {
        super(name, new SharedAccessAuthorizationRuleResourceInner());
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = name;
        //
        this.cproperties = new SharedAccessAuthorizationRuleProperties();
        this.uproperties = new SharedAccessAuthorizationRuleProperties();
    }

    NotificationHubNamespaceSharedAccessAuthorizationRuleResourceImpl(SharedAccessAuthorizationRuleResourceInner inner, NotificationHubsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.notificationHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "notificationHubs");
        this.authorizationRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "AuthorizationRules");
        //
        this.cproperties = new SharedAccessAuthorizationRuleProperties();
        this.uproperties = new SharedAccessAuthorizationRuleProperties();
    }

    @Override
    public NotificationHubsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource> createResourceAsync() {
        NotificationHubsInner client = this.manager().inner().notificationHubs();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.notificationHubName, this.authorizationRuleName, this.cproperties)
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
    public Observable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource> updateResourceAsync() {
        NotificationHubsInner client = this.manager().inner().notificationHubs();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.notificationHubName, this.authorizationRuleName, this.uproperties)
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
        NotificationHubsInner client = this.manager().inner().notificationHubs();
        return client.getAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.notificationHubName, this.authorizationRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new SharedAccessAuthorizationRuleProperties();
        this.uproperties = new SharedAccessAuthorizationRuleProperties();
    }

    @Override
    public String claimType() {
        return this.inner().claimType();
    }

    @Override
    public String claimValue() {
        return this.inner().claimValue();
    }

    @Override
    public String createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String keyName() {
        return this.inner().keyName();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String modifiedTime() {
        return this.inner().modifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public Integer revision() {
        return this.inner().revision();
    }

    @Override
    public List<AccessRights> rights() {
        return this.inner().rights();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public NotificationHubNamespaceSharedAccessAuthorizationRuleResourceImpl withExistingNotificationHub(String resourceGroupName, String namespaceName, String notificationHubName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.notificationHubName = notificationHubName;
        return this;
    }

    @Override
    public NotificationHubNamespaceSharedAccessAuthorizationRuleResourceImpl withProperties(SharedAccessAuthorizationRuleProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
