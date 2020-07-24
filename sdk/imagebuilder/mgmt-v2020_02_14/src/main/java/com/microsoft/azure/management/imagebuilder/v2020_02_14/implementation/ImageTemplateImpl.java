/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2020_02_14.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplate;
import rx.Observable;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateUpdateParameters;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateSource;
import java.util.List;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateCustomizer;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateDistributor;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ProvisioningState;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ProvisioningError;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateLastRunStatus;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateVmProfile;
import com.microsoft.azure.management.imagebuilder.v2020_02_14.ImageTemplateIdentity;
import rx.functions.Func1;

class ImageTemplateImpl extends GroupableResourceCoreImpl<ImageTemplate, ImageTemplateInner, ImageTemplateImpl, VirtualMachineImagesManager> implements ImageTemplate, ImageTemplate.Definition, ImageTemplate.Update {
    private ImageTemplateUpdateParameters updateParameter;
    ImageTemplateImpl(String name, ImageTemplateInner inner, VirtualMachineImagesManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ImageTemplateUpdateParameters();
    }

    @Override
    public Observable<ImageTemplate> createResourceAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ImageTemplateInner, ImageTemplateInner>() {
               @Override
               public ImageTemplateInner call(ImageTemplateInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ImageTemplate> updateResourceAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ImageTemplateInner, ImageTemplateInner>() {
               @Override
               public ImageTemplateInner call(ImageTemplateInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ImageTemplateInner> getInnerAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ImageTemplateUpdateParameters();
    }

    @Override
    public Integer buildTimeoutInMinutes() {
        return this.inner().buildTimeoutInMinutes();
    }

    @Override
    public List<ImageTemplateCustomizer> customize() {
        return this.inner().customize();
    }

    @Override
    public List<ImageTemplateDistributor> distribute() {
        return this.inner().distribute();
    }

    @Override
    public ImageTemplateIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public ImageTemplateLastRunStatus lastRunStatus() {
        return this.inner().lastRunStatus();
    }

    @Override
    public ProvisioningError provisioningError() {
        return this.inner().provisioningError();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ImageTemplateSource source() {
        return this.inner().source();
    }

    @Override
    public ImageTemplateVmProfile vmProfile() {
        return this.inner().vmProfile();
    }

    @Override
    public ImageTemplateImpl withDistribute(List<ImageTemplateDistributor> distribute) {
        this.inner().withDistribute(distribute);
        return this;
    }

    @Override
    public ImageTemplateImpl withSource(ImageTemplateSource source) {
        this.inner().withSource(source);
        return this;
    }

    @Override
    public ImageTemplateImpl withBuildTimeoutInMinutes(Integer buildTimeoutInMinutes) {
        this.inner().withBuildTimeoutInMinutes(buildTimeoutInMinutes);
        return this;
    }

    @Override
    public ImageTemplateImpl withCustomize(List<ImageTemplateCustomizer> customize) {
        this.inner().withCustomize(customize);
        return this;
    }

    @Override
    public ImageTemplateImpl withVmProfile(ImageTemplateVmProfile vmProfile) {
        this.inner().withVmProfile(vmProfile);
        return this;
    }

    @Override
    public ImageTemplateImpl withIdentity(ImageTemplateIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

}
