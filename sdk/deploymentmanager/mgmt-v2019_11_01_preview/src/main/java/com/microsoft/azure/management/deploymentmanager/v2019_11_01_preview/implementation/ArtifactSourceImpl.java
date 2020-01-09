/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.ArtifactSource;
import rx.Observable;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Authentication;

class ArtifactSourceImpl extends GroupableResourceCoreImpl<ArtifactSource, ArtifactSourceInner, ArtifactSourceImpl, DeploymentManagerManager> implements ArtifactSource, ArtifactSource.Definition, ArtifactSource.Update {
    ArtifactSourceImpl(String name, ArtifactSourceInner inner, DeploymentManagerManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ArtifactSource> createResourceAsync() {
        ArtifactSourcesInner client = this.manager().inner().artifactSources();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ArtifactSource> updateResourceAsync() {
        ArtifactSourcesInner client = this.manager().inner().artifactSources();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ArtifactSourceInner> getInnerAsync() {
        ArtifactSourcesInner client = this.manager().inner().artifactSources();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String artifactRoot() {
        return this.inner().artifactRoot();
    }

    @Override
    public Authentication authentication() {
        return this.inner().authentication();
    }

    @Override
    public String sourceType() {
        return this.inner().sourceType();
    }

    @Override
    public ArtifactSourceImpl withAuthentication(Authentication authentication) {
        this.inner().withAuthentication(authentication);
        return this;
    }

    @Override
    public ArtifactSourceImpl withSourceType(String sourceType) {
        this.inner().withSourceType(sourceType);
        return this;
    }

    @Override
    public ArtifactSourceImpl withArtifactRoot(String artifactRoot) {
        this.inner().withArtifactRoot(artifactRoot);
        return this;
    }

}
