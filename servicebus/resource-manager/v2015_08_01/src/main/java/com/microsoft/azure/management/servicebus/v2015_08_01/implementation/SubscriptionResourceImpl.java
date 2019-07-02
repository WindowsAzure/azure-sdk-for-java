/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01.implementation;

import com.microsoft.azure.management.servicebus.v2015_08_01.SubscriptionResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.servicebus.v2015_08_01.SubscriptionCreateOrUpdateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2015_08_01.MessageCountDetails;
import com.microsoft.azure.management.servicebus.v2015_08_01.EntityAvailabilityStatus;
import com.microsoft.azure.management.servicebus.v2015_08_01.EntityStatus;
import rx.functions.Func1;

class SubscriptionResourceImpl extends CreatableUpdatableImpl<SubscriptionResource, SubscriptionResourceInner, SubscriptionResourceImpl> implements SubscriptionResource, SubscriptionResource.Definition, SubscriptionResource.Update {
    private final ServiceBusManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String topicName;
    private String subscriptionName;
    private SubscriptionCreateOrUpdateParameters createOrUpdateParameter;

    SubscriptionResourceImpl(String name, ServiceBusManager manager) {
        super(name, new SubscriptionResourceInner());
        this.manager = manager;
        // Set resource name
        this.subscriptionName = name;
        //
        this.createOrUpdateParameter = new SubscriptionCreateOrUpdateParameters();
    }

    SubscriptionResourceImpl(SubscriptionResourceInner inner, ServiceBusManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.subscriptionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.topicName = IdParsingUtils.getValueFromIdByName(inner.id(), "topics");
        this.subscriptionName = IdParsingUtils.getValueFromIdByName(inner.id(), "subscriptions");
        //
        this.createOrUpdateParameter = new SubscriptionCreateOrUpdateParameters();
    }

    @Override
    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SubscriptionResource> createResourceAsync() {
        SubscriptionsInner client = this.manager().inner().subscriptions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.subscriptionName, this.createOrUpdateParameter)
            .map(new Func1<SubscriptionResourceInner, SubscriptionResourceInner>() {
               @Override
               public SubscriptionResourceInner call(SubscriptionResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SubscriptionResource> updateResourceAsync() {
        SubscriptionsInner client = this.manager().inner().subscriptions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.subscriptionName, this.createOrUpdateParameter)
            .map(new Func1<SubscriptionResourceInner, SubscriptionResourceInner>() {
               @Override
               public SubscriptionResourceInner call(SubscriptionResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SubscriptionResourceInner> getInnerAsync() {
        SubscriptionsInner client = this.manager().inner().subscriptions();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.subscriptionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SubscriptionCreateOrUpdateParameters();
    }

    @Override
    public DateTime accessedAt() {
        return this.inner().accessedAt();
    }

    @Override
    public String autoDeleteOnIdle() {
        return this.inner().autoDeleteOnIdle();
    }

    @Override
    public MessageCountDetails countDetails() {
        return this.inner().countDetails();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public Boolean deadLetteringOnFilterEvaluationExceptions() {
        return this.inner().deadLetteringOnFilterEvaluationExceptions();
    }

    @Override
    public Boolean deadLetteringOnMessageExpiration() {
        return this.inner().deadLetteringOnMessageExpiration();
    }

    @Override
    public String defaultMessageTimeToLive() {
        return this.inner().defaultMessageTimeToLive();
    }

    @Override
    public Boolean enableBatchedOperations() {
        return this.inner().enableBatchedOperations();
    }

    @Override
    public EntityAvailabilityStatus entityAvailabilityStatus() {
        return this.inner().entityAvailabilityStatus();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isReadOnly() {
        return this.inner().isReadOnly();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String lockDuration() {
        return this.inner().lockDuration();
    }

    @Override
    public Integer maxDeliveryCount() {
        return this.inner().maxDeliveryCount();
    }

    @Override
    public Long messageCount() {
        return this.inner().messageCount();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean requiresSession() {
        return this.inner().requiresSession();
    }

    @Override
    public EntityStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public SubscriptionResourceImpl withExistingTopic(String resourceGroupName, String namespaceName, String topicName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.topicName = topicName;
        return this;
    }

    @Override
    public SubscriptionResourceImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.createOrUpdateParameter.withAutoDeleteOnIdle(autoDeleteOnIdle);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withDeadLetteringOnFilterEvaluationExceptions(Boolean deadLetteringOnFilterEvaluationExceptions) {
        this.createOrUpdateParameter.withDeadLetteringOnFilterEvaluationExceptions(deadLetteringOnFilterEvaluationExceptions);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.createOrUpdateParameter.withDeadLetteringOnMessageExpiration(deadLetteringOnMessageExpiration);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.createOrUpdateParameter.withDefaultMessageTimeToLive(defaultMessageTimeToLive);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.createOrUpdateParameter.withEnableBatchedOperations(enableBatchedOperations);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.createOrUpdateParameter.withEntityAvailabilityStatus(entityAvailabilityStatus);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withIsReadOnly(Boolean isReadOnly) {
        this.createOrUpdateParameter.withIsReadOnly(isReadOnly);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withLockDuration(String lockDuration) {
        this.createOrUpdateParameter.withLockDuration(lockDuration);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.createOrUpdateParameter.withMaxDeliveryCount(maxDeliveryCount);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withRequiresSession(Boolean requiresSession) {
        this.createOrUpdateParameter.withRequiresSession(requiresSession);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withStatus(EntityStatus status) {
        this.createOrUpdateParameter.withStatus(status);
        return this;
    }

    @Override
    public SubscriptionResourceImpl withType(String type) {
        this.createOrUpdateParameter.withType(type);
        return this;
    }

}
