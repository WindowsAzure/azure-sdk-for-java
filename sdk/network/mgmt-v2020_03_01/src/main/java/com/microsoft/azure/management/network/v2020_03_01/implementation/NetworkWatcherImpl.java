/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.NetworkWatcher;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;

class NetworkWatcherImpl extends GroupableResourceCoreImpl<NetworkWatcher, NetworkWatcherInner, NetworkWatcherImpl, NetworkManager> implements NetworkWatcher, NetworkWatcher.Definition, NetworkWatcher.Update {
    NetworkWatcherImpl(String name, NetworkWatcherInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NetworkWatcher> createResourceAsync() {
        NetworkWatchersInner client = this.manager().inner().networkWatchers();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkWatcher> updateResourceAsync() {
        NetworkWatchersInner client = this.manager().inner().networkWatchers();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkWatcherInner> getInnerAsync() {
        NetworkWatchersInner client = this.manager().inner().networkWatchers();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

}
