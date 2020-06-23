/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SharedKeysOperations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SharedKeys;

class SharedKeysOperationsImpl extends WrapperImpl<SharedKeysOperationsInner> implements SharedKeysOperations {
    private final LogAnalyticsManager manager;

    SharedKeysOperationsImpl(LogAnalyticsManager manager) {
        super(manager.inner().sharedKeysOperations());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SharedKeys> getSharedKeysAsync(String resourceGroupName, String workspaceName) {
        SharedKeysOperationsInner client = this.inner();
        return client.getSharedKeysAsync(resourceGroupName, workspaceName)
        .map(new Func1<SharedKeysInner, SharedKeys>() {
            @Override
            public SharedKeys call(SharedKeysInner inner) {
                return new SharedKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SharedKeys> regenerateAsync(String resourceGroupName, String workspaceName) {
        SharedKeysOperationsInner client = this.inner();
        return client.regenerateAsync(resourceGroupName, workspaceName)
        .map(new Func1<SharedKeysInner, SharedKeys>() {
            @Override
            public SharedKeys call(SharedKeysInner inner) {
                return new SharedKeysImpl(inner, manager());
            }
        });
    }

}
