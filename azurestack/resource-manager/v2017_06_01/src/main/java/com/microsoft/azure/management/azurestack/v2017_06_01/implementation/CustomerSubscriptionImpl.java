/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.management.azurestack.v2017_06_01.CustomerSubscription;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class CustomerSubscriptionImpl extends CreatableUpdatableImpl<CustomerSubscription, CustomerSubscriptionInner, CustomerSubscriptionImpl> implements CustomerSubscription, CustomerSubscription.Definition, CustomerSubscription.Update {
    private final AzureStackManager manager;
    private String resourceGroup;
    private String registrationName;
    private String customerSubscriptionName;

    CustomerSubscriptionImpl(String name, AzureStackManager manager) {
        super(name, new CustomerSubscriptionInner());
        this.manager = manager;
        // Set resource name
        this.customerSubscriptionName = name;
        //
    }

    CustomerSubscriptionImpl(CustomerSubscriptionInner inner, AzureStackManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.customerSubscriptionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroup = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registrationName = IdParsingUtils.getValueFromIdByName(inner.id(), "registrations");
        this.customerSubscriptionName = IdParsingUtils.getValueFromIdByName(inner.id(), "customerSubscriptions");
        //
    }

    @Override
    public AzureStackManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CustomerSubscription> createResourceAsync() {
        CustomerSubscriptionsInner client = this.manager().inner().customerSubscriptions();
        return client.createAsync(this.resourceGroup, this.registrationName, this.customerSubscriptionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CustomerSubscription> updateResourceAsync() {
        CustomerSubscriptionsInner client = this.manager().inner().customerSubscriptions();
        return client.createAsync(this.resourceGroup, this.registrationName, this.customerSubscriptionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CustomerSubscriptionInner> getInnerAsync() {
        CustomerSubscriptionsInner client = this.manager().inner().customerSubscriptions();
        return client.getAsync(this.resourceGroup, this.registrationName, this.customerSubscriptionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
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
    public String tenantId() {
        return this.inner().tenantId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CustomerSubscriptionImpl withExistingRegistration(String resourceGroup, String registrationName) {
        this.resourceGroup = resourceGroup;
        this.registrationName = registrationName;
        return this;
    }

    @Override
    public CustomerSubscriptionImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public CustomerSubscriptionImpl withTenantId(String tenantId) {
        this.inner().withTenantId(tenantId);
        return this;
    }

}
