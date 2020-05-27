/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.signalr.v2018_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRs;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.signalr.v2018_10_01.NameAvailability;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRKeys;
import rx.Completable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRResource;

class SignalRsImpl extends WrapperImpl<SignalRsInner> implements SignalRs {
    private final SignalRServiceManager manager;

    SignalRsImpl(SignalRServiceManager manager) {
        super(manager.inner().signalRs());
        this.manager = manager;
    }

    public SignalRServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NameAvailability> checkNameAvailabilityAsync(String location) {
        SignalRsInner client = this.inner();
        return client.checkNameAvailabilityAsync(location)
        .map(new Func1<NameAvailabilityInner, NameAvailability>() {
            @Override
            public NameAvailability call(NameAvailabilityInner inner) {
                return new NameAvailabilityImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SignalRKeys> listKeysAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRKeysInner, SignalRKeys>() {
            @Override
            public SignalRKeys call(SignalRKeysInner inner) {
                return new SignalRKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SignalRKeys> regenerateKeyAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRKeysInner, SignalRKeys>() {
            @Override
            public SignalRKeys call(SignalRKeysInner inner) {
                return new SignalRKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SignalRResource> getByResourceGroupAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return new SignalRResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SignalRResource> createOrUpdateAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return new SignalRResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName).toCompletable();
    }

    @Override
    public Observable<SignalRResource> updateAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.updateAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return new SignalRResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable restartAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.restartAsync(resourceGroupName, resourceName).toCompletable();
    }

    @Override
    public Observable<SignalRResource> listAsync() {
        SignalRsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SignalRResourceInner>, Iterable<SignalRResourceInner>>() {
            @Override
            public Iterable<SignalRResourceInner> call(Page<SignalRResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return new SignalRResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SignalRResource> listByResourceGroupAsync(final String resourceGroupName) {
        SignalRsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<SignalRResourceInner>, Iterable<SignalRResourceInner>>() {
            @Override
            public Iterable<SignalRResourceInner> call(Page<SignalRResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return new SignalRResourceImpl(inner, manager());
            }
        });
    }

}
