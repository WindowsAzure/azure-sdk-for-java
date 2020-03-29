/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.RecipientUserContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.NotificationName;

class RecipientUserContractImpl extends CreatableUpdatableImpl<RecipientUserContract, RecipientUserContractInner, RecipientUserContractImpl> implements RecipientUserContract, RecipientUserContract.Definition, RecipientUserContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private NotificationName notificationName;
    private String userId;

    RecipientUserContractImpl(String name, ApiManagementManager manager) {
        super(name, new RecipientUserContractInner());
        this.manager = manager;
        // Set resource name
        this.userId = name;
        //
    }

    RecipientUserContractImpl(RecipientUserContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.userId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.notificationName = NotificationName.fromString(IdParsingUtils.getValueFromIdByName(inner.id(), "notifications"));
        this.userId = IdParsingUtils.getValueFromIdByName(inner.id(), "recipientUsers");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RecipientUserContract> createResourceAsync() {
        NotificationRecipientUsersInner client = this.manager().inner().notificationRecipientUsers();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.notificationName, this.userId)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RecipientUserContract> updateResourceAsync() {
        NotificationRecipientUsersInner client = this.manager().inner().notificationRecipientUsers();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.notificationName, this.userId)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RecipientUserContractInner> getInnerAsync() {
        NotificationRecipientUsersInner client = this.manager().inner().notificationRecipientUsers();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userId() {
        return this.inner().userId();
    }

    @Override
    public RecipientUserContractImpl withExistingNotification(String resourceGroupName, String serviceName, NotificationName notificationName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.notificationName = notificationName;
        return this;
    }

}
