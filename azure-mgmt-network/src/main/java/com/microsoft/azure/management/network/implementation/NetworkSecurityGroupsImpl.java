/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import java.util.Set;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.NetworkInterface;
import com.microsoft.azure.management.network.NetworkSecurityGroup;
import com.microsoft.azure.management.network.NetworkSecurityGroups;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.ListableGroupableResourcesPageImpl;
import rx.Completable;
import rx.Observable;

/**
 *  Implementation for NetworkSecurityGroups.
 */
@LangDefinition
class NetworkSecurityGroupsImpl
        extends ListableGroupableResourcesPageImpl<
            NetworkSecurityGroup,
            NetworkSecurityGroupImpl,
            NetworkSecurityGroupInner,
            NetworkSecurityGroupsInner,
            NetworkManager>
        implements NetworkSecurityGroups {

    NetworkSecurityGroupsImpl(final NetworkManager networkManager) {
        super(networkManager.inner().networkSecurityGroups(), networkManager);
    }

    @Override
    public PagedList<NetworkSecurityGroup> list() {
        return wrapList(this.inner().listAll());
    }

    @Override
    public PagedList<NetworkSecurityGroup> listByGroup(String groupName) {
        return wrapList(this.inner().list(groupName));
    }

    @Override
    public NetworkSecurityGroupImpl getByGroup(String groupName, String name) {
        return wrapModel(this.inner().get(groupName, name));
    }

    @Override
    public Completable deleteByGroupAsync(String groupName, String name) {
        // Clear NIC references if any
        NetworkSecurityGroupImpl nsg = getByGroup(groupName, name);
        if (nsg != null) {
            Set<String> nicIds = nsg.networkInterfaceIds();
            if (nicIds != null) {
                for (String nicRef : nsg.networkInterfaceIds()) {
                    NetworkInterface nic = this.manager().networkInterfaces().getById(nicRef);
                    if (nic == null) {
                        continue;
                    } else if (!nsg.id().equalsIgnoreCase(nic.networkSecurityGroupId())) {
                        continue;
                    } else {
                        nic.update().withoutNetworkSecurityGroup().apply();
                    }
                }
            }
        }

        return this.inner().deleteAsync(groupName, name).toCompletable();
    }

    @Override
    public NetworkSecurityGroupImpl define(String name) {
        return wrapModel(name);
    }

    // Fluent model create helpers

    @Override
    protected NetworkSecurityGroupImpl wrapModel(String name) {
        NetworkSecurityGroupInner inner = new NetworkSecurityGroupInner();
        return new NetworkSecurityGroupImpl(name, inner, this.manager());
    }

    @Override
    protected NetworkSecurityGroupImpl wrapModel(NetworkSecurityGroupInner inner) {
        if (inner == null) {
            return null;
        }
        return new NetworkSecurityGroupImpl(inner.name(), inner, this.manager());
    }

    @Override
    protected Observable<Page<NetworkSecurityGroupInner>> listAsyncPage() {
        return inner().listAllAsync();
    }

    @Override
    protected Observable<Page<NetworkSecurityGroupInner>> listByGroupAsyncPage(String resourceGroupName) {
        return inner().listAsync(resourceGroupName);
    }
}
