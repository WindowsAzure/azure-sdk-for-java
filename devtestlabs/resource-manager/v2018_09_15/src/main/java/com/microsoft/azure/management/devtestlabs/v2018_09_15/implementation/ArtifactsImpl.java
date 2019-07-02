/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Artifacts;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArmTemplateInfo;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GenerateArmTemplateRequest;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Artifact;

class ArtifactsImpl extends WrapperImpl<ArtifactsInner> implements Artifacts {
    private final DevTestLabsManager manager;

    ArtifactsImpl(DevTestLabsManager manager) {
        super(manager.inner().artifacts());
        this.manager = manager;
    }

    public DevTestLabsManager manager() {
        return this.manager;
    }

    private ArtifactImpl wrapModel(ArtifactInner inner) {
        return  new ArtifactImpl(inner, manager());
    }

    @Override
    public Observable<ArmTemplateInfo> generateArmTemplateAsync(String resourceGroupName, String labName, String artifactSourceName, String name, GenerateArmTemplateRequest generateArmTemplateRequest) {
        ArtifactsInner client = this.inner();
        return client.generateArmTemplateAsync(resourceGroupName, labName, artifactSourceName, name, generateArmTemplateRequest)
        .map(new Func1<ArmTemplateInfoInner, ArmTemplateInfo>() {
            @Override
            public ArmTemplateInfo call(ArmTemplateInfoInner inner) {
                return new ArmTemplateInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Artifact> listAsync(final String resourceGroupName, final String labName, final String artifactSourceName) {
        ArtifactsInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, artifactSourceName)
        .flatMapIterable(new Func1<Page<ArtifactInner>, Iterable<ArtifactInner>>() {
            @Override
            public Iterable<ArtifactInner> call(Page<ArtifactInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ArtifactInner, Artifact>() {
            @Override
            public Artifact call(ArtifactInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Artifact> getAsync(String resourceGroupName, String labName, String artifactSourceName, String name) {
        ArtifactsInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, artifactSourceName, name)
        .map(new Func1<ArtifactInner, Artifact>() {
            @Override
            public Artifact call(ArtifactInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
