/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.StorageQueue;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;

class StorageQueueImpl extends CreatableUpdatableImpl<StorageQueue, StorageQueueInner, StorageQueueImpl> implements StorageQueue, StorageQueue.Definition, StorageQueue.Update {
    private final StorageManager manager;
    private String resourceGroupName;
    private String accountName;
    private String queueName;
    private Map<String, String> cmetadata;
    private Map<String, String> umetadata;

    StorageQueueImpl(String name, StorageManager manager) {
        super(name, new StorageQueueInner());
        this.manager = manager;
        // Set resource name
        this.queueName = name;
        //
    }

    StorageQueueImpl(StorageQueueInner inner, StorageManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.queueName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        this.queueName = IdParsingUtils.getValueFromIdByName(inner.id(), "queues");
        //
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<StorageQueue> createResourceAsync() {
        QueuesInner client = this.manager().inner().queues();
        return client.createAsync(this.resourceGroupName, this.accountName, this.queueName, this.cmetadata)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StorageQueue> updateResourceAsync() {
        QueuesInner client = this.manager().inner().queues();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.queueName, this.umetadata)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StorageQueueInner> getInnerAsync() {
        QueuesInner client = this.manager().inner().queues();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Integer approximateMessageCount() {
        return this.inner().approximateMessageCount();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Map<String, String> metadata() {
        return this.inner().metadata();
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
    public StorageQueueImpl withExistingQueueService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public StorageQueueImpl withMetadata(Map<String, String> metadata) {
        if (isInCreateMode()) {
            this.cmetadata = metadata;
        } else {
            this.umetadata = metadata;
        }
        return this;
    }

}
