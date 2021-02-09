/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Inputs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ResourceTestStatus;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Input;

class InputsImpl extends WrapperImpl<InputsInner> implements Inputs {
    private final StreamAnalyticsManager manager;

    InputsImpl(StreamAnalyticsManager manager) {
        super(manager.inner().inputs());
        this.manager = manager;
    }

    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public InputImpl define(String name) {
        return wrapModel(name);
    }

    private InputImpl wrapModel(InputInner inner) {
        return  new InputImpl(inner, manager());
    }

    private InputImpl wrapModel(String name) {
        return new InputImpl(name, this.manager());
    }

    @Override
    public Observable<ResourceTestStatus> testAsync(String resourceGroupName, String jobName, String inputName) {
        InputsInner client = this.inner();
        return client.testAsync(resourceGroupName, jobName, inputName)
        .map(new Func1<ResourceTestStatusInner, ResourceTestStatus>() {
            @Override
            public ResourceTestStatus call(ResourceTestStatusInner inner) {
                return new ResourceTestStatusImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Input> listByStreamingJobAsync(final String resourceGroupName, final String jobName) {
        InputsInner client = this.inner();
        return client.listByStreamingJobAsync(resourceGroupName, jobName)
        .flatMapIterable(new Func1<Page<InputInner>, Iterable<InputInner>>() {
            @Override
            public Iterable<InputInner> call(Page<InputInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InputInner, Input>() {
            @Override
            public Input call(InputInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Input> getAsync(String resourceGroupName, String jobName, String inputName) {
        InputsInner client = this.inner();
        return client.getAsync(resourceGroupName, jobName, inputName)
        .flatMap(new Func1<InputInner, Observable<Input>>() {
            @Override
            public Observable<Input> call(InputInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Input)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String jobName, String inputName) {
        InputsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, jobName, inputName).toCompletable();
    }

}
