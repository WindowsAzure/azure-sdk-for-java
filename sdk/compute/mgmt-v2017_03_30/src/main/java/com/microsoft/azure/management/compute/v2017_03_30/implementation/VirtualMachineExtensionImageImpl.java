/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtensionImage;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.Map;

class VirtualMachineExtensionImageImpl extends IndexableRefreshableWrapperImpl<VirtualMachineExtensionImage, VirtualMachineExtensionImageInner> implements VirtualMachineExtensionImage {
    private final ComputeManager manager;
    private String location;
    private String publisherName;
    private String type;
    private String version;

    VirtualMachineExtensionImageImpl(VirtualMachineExtensionImageInner inner,  ComputeManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.publisherName = IdParsingUtils.getValueFromIdByName(inner.id(), "publishers");
        this.type = IdParsingUtils.getValueFromIdByName(inner.id(), "types");
        this.version = IdParsingUtils.getValueFromIdByName(inner.id(), "versions");
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VirtualMachineExtensionImageInner> getInnerAsync() {
        VirtualMachineExtensionImagesInner client = this.manager().inner().virtualMachineExtensionImages();
        return client.getAsync(this.location, this.publisherName, this.type, this.version);
    }



    @Override
    public String computeRole() {
        return this.inner().computeRole();
    }

    @Override
    public String handlerSchema() {
        return this.inner().handlerSchema();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String operatingSystem() {
        return this.inner().operatingSystem();
    }

    @Override
    public Boolean supportsMultipleExtensions() {
        return this.inner().supportsMultipleExtensions();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Boolean vmScaleSetEnabled() {
        return this.inner().vmScaleSetEnabled();
    }

}
