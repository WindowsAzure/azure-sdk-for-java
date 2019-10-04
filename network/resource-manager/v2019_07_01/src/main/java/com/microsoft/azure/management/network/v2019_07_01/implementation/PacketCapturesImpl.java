/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_07_01.PacketCaptures;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.PacketCaptureQueryStatusResult;
import com.microsoft.azure.management.network.v2019_07_01.PacketCaptureResult;

class PacketCapturesImpl extends WrapperImpl<PacketCapturesInner> implements PacketCaptures {
    private final NetworkManager manager;

    PacketCapturesImpl(NetworkManager manager) {
        super(manager.inner().packetCaptures());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public PacketCaptureResultImpl define(String name) {
        return wrapModel(name);
    }

    private PacketCaptureResultImpl wrapModel(PacketCaptureResultInner inner) {
        return  new PacketCaptureResultImpl(inner, manager());
    }

    private PacketCaptureResultImpl wrapModel(String name) {
        return new PacketCaptureResultImpl(name, this.manager());
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        PacketCapturesInner client = this.inner();
        return client.stopAsync(resourceGroupName, networkWatcherName, packetCaptureName).toCompletable();
    }

    @Override
    public Observable<PacketCaptureQueryStatusResult> getStatusAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        PacketCapturesInner client = this.inner();
        return client.getStatusAsync(resourceGroupName, networkWatcherName, packetCaptureName)
        .map(new Func1<PacketCaptureQueryStatusResultInner, PacketCaptureQueryStatusResult>() {
            @Override
            public PacketCaptureQueryStatusResult call(PacketCaptureQueryStatusResultInner inner) {
                return new PacketCaptureQueryStatusResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PacketCaptureResult> listAsync(String resourceGroupName, String networkWatcherName) {
        PacketCapturesInner client = this.inner();
        return client.listAsync(resourceGroupName, networkWatcherName)
        .flatMap(new Func1<List<PacketCaptureResultInner>, Observable<PacketCaptureResultInner>>() {
            @Override
            public Observable<PacketCaptureResultInner> call(List<PacketCaptureResultInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PacketCaptureResultInner, PacketCaptureResult>() {
            @Override
            public PacketCaptureResult call(PacketCaptureResultInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PacketCaptureResult> getAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        PacketCapturesInner client = this.inner();
        return client.getAsync(resourceGroupName, networkWatcherName, packetCaptureName)
        .flatMap(new Func1<PacketCaptureResultInner, Observable<PacketCaptureResult>>() {
            @Override
            public Observable<PacketCaptureResult> call(PacketCaptureResultInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PacketCaptureResult)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        PacketCapturesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, networkWatcherName, packetCaptureName).toCompletable();
    }

}
