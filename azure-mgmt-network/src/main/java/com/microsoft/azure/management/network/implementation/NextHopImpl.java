/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.NextHop;
import com.microsoft.azure.management.network.NextHopType;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import rx.Observable;
import rx.functions.Func1;

/**
 * Implementation of NextHop
 */
@LangDefinition
public class NextHopImpl implements NextHop, NextHop.Definition {
    private final NetworkWatcherImpl parent;
    private NextHopParametersInner parameters = new NextHopParametersInner();
    private NextHopResultInner result;

    NextHopImpl(NetworkWatcherImpl parent) {
        this.parent = parent;
    }

    public NextHopImpl withTargetResourceId(String targetResourceId) {
        this.parameters.withTargetResourceId(targetResourceId);
        return this;
    }

    public NextHopImpl withSourceIPAddress(String sourceIPAddress) {
        this.parameters.withSourceIPAddress(sourceIPAddress);
        return this;
    }

    public NextHopImpl withDestinationIPAddress(String destinationIPAddress) {
        this.parameters.withDestinationIPAddress(destinationIPAddress);
        return this;
    }

    public NextHopImpl withTargetNicResourceId(String targetNicResourceId) {
        this.parameters.withTargetNicResourceId(targetNicResourceId);
        return this;
    }

    public NetworkWatcherImpl parent() {
        return parent;
    }

    public NextHopType nextHopType() {
        return result.nextHopType();
    }

    public String nextHopIpAddress() {
        return result.nextHopIpAddress();
    }

    public String routeTableId() {
        return result.routeTableId();
    }

    @Override
    public NextHop execute() {
        return executeAsync().toBlocking().last();
    }

    @Override
    public Observable<NextHop> executeAsync() {
        return this.parent().manager().inner().networkWatchers()
                .getNextHopAsync(parent.resourceGroupName(), parent.name(), parameters)
                .map(new Func1<NextHopResultInner, NextHop>() {
                    @Override
                    public NextHop call(NextHopResultInner nextHopResultInner) {
                        NextHopImpl.this.result = nextHopResultInner;
                        return NextHopImpl.this;
                    }
                });
    }

    @Override
    public ServiceFuture<NextHop> executeAsync(ServiceCallback<NextHop> callback) {
        return ServiceFuture.fromBody(executeAsync(), callback);
    }
}
