/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.implementation;

import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.RunOutput;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class RunOutputImpl extends IndexableRefreshableWrapperImpl<RunOutput, RunOutputInner> implements RunOutput {
    private final VirtualMachineImagesManager manager;
    private String resourceGroupName;
    private String imageTemplateName;
    private String runOutputName;

    RunOutputImpl(RunOutputInner inner,  VirtualMachineImagesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.imageTemplateName = IdParsingUtils.getValueFromIdByName(inner.id(), "imageTemplates");
        this.runOutputName = IdParsingUtils.getValueFromIdByName(inner.id(), "runOutputs");
    }

    @Override
    public VirtualMachineImagesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RunOutputInner> getInnerAsync() {
        VirtualMachineImageTemplatesInner client = this.manager().inner().virtualMachineImageTemplates();
        return client.getRunOutputAsync(this.resourceGroupName, this.imageTemplateName, this.runOutputName);
    }



    @Override
    public String artifactId() {
        return this.inner().artifactId();
    }

    @Override
    public String artifactUri() {
        return this.inner().artifactUri();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
