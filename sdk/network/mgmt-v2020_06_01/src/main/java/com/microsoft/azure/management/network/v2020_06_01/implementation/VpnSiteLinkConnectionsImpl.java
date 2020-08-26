/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_06_01.VpnSiteLinkConnections;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.network.v2020_06_01.VpnConnectionVpnGatewayVpnSiteLinkConnection;

class VpnSiteLinkConnectionsImpl extends WrapperImpl<VpnSiteLinkConnectionsInner> implements VpnSiteLinkConnections {
    private final NetworkManager manager;

    VpnSiteLinkConnectionsImpl(NetworkManager manager) {
        super(manager.inner().vpnSiteLinkConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private VpnConnectionVpnGatewayVpnSiteLinkConnectionImpl wrapModel(VpnSiteLinkConnectionInner inner) {
        return  new VpnConnectionVpnGatewayVpnSiteLinkConnectionImpl(inner, manager());
    }

    @Override
    public Observable<VpnConnectionVpnGatewayVpnSiteLinkConnection> getAsync(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName) {
        VpnSiteLinkConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, gatewayName, connectionName, linkConnectionName)
        .flatMap(new Func1<VpnSiteLinkConnectionInner, Observable<VpnConnectionVpnGatewayVpnSiteLinkConnection>>() {
            @Override
            public Observable<VpnConnectionVpnGatewayVpnSiteLinkConnection> call(VpnSiteLinkConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VpnConnectionVpnGatewayVpnSiteLinkConnection)wrapModel(inner));
                }
            }
       });
    }

}
