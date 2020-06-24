/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.IntelligencePacks;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.IntelligencePack;

class IntelligencePacksImpl extends WrapperImpl<IntelligencePacksInner> implements IntelligencePacks {
    private final LogAnalyticsManager manager;

    IntelligencePacksImpl(LogAnalyticsManager manager) {
        super(manager.inner().intelligencePacks());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    private IntelligencePackImpl wrapModel(IntelligencePackInner inner) {
        return  new IntelligencePackImpl(inner, manager());
    }

    @Override
    public Completable disableAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        IntelligencePacksInner client = this.inner();
        return client.disableAsync(resourceGroupName, workspaceName, intelligencePackName).toCompletable();
    }

    @Override
    public Completable enableAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        IntelligencePacksInner client = this.inner();
        return client.enableAsync(resourceGroupName, workspaceName, intelligencePackName).toCompletable();
    }

    @Override
    public Observable<IntelligencePack> listAsync(String resourceGroupName, String workspaceName) {
        IntelligencePacksInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<List<IntelligencePackInner>, Observable<IntelligencePackInner>>() {
            @Override
            public Observable<IntelligencePackInner> call(List<IntelligencePackInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<IntelligencePackInner, IntelligencePack>() {
            @Override
            public IntelligencePack call(IntelligencePackInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
