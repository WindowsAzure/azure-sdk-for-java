/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_02_01.NetworkInterfaceIPConfigurations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_02_01.NetworkInterfaceNetworkInterfaceIPConfiguration;

class NetworkInterfaceIPConfigurationsImpl extends WrapperImpl<NetworkInterfaceIPConfigurationsInner> implements NetworkInterfaceIPConfigurations {
    private final NetworkManager manager;

    NetworkInterfaceIPConfigurationsImpl(NetworkManager manager) {
        super(manager.inner().networkInterfaceIPConfigurations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private NetworkInterfaceNetworkInterfaceIPConfigurationImpl wrapModel(NetworkInterfaceIPConfigurationInner inner) {
        return  new NetworkInterfaceNetworkInterfaceIPConfigurationImpl(inner, manager());
    }

    @Override
    public Observable<NetworkInterfaceNetworkInterfaceIPConfiguration> listAsync(final String resourceGroupName, final String networkInterfaceName) {
        NetworkInterfaceIPConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, networkInterfaceName)
        .flatMapIterable(new Func1<Page<NetworkInterfaceIPConfigurationInner>, Iterable<NetworkInterfaceIPConfigurationInner>>() {
            @Override
            public Iterable<NetworkInterfaceIPConfigurationInner> call(Page<NetworkInterfaceIPConfigurationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceIPConfigurationInner, NetworkInterfaceNetworkInterfaceIPConfiguration>() {
            @Override
            public NetworkInterfaceNetworkInterfaceIPConfiguration call(NetworkInterfaceIPConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<NetworkInterfaceNetworkInterfaceIPConfiguration> getAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        NetworkInterfaceIPConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, networkInterfaceName, ipConfigurationName)
        .map(new Func1<NetworkInterfaceIPConfigurationInner, NetworkInterfaceNetworkInterfaceIPConfiguration>() {
            @Override
            public NetworkInterfaceNetworkInterfaceIPConfiguration call(NetworkInterfaceIPConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
