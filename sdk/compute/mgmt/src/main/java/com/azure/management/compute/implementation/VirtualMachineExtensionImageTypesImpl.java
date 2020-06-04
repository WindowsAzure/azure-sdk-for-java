// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.management.compute.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.management.compute.models.VirtualMachineExtensionImageType;
import com.azure.management.compute.models.VirtualMachineExtensionImageTypes;
import com.azure.management.compute.models.VirtualMachinePublisher;
import com.azure.management.compute.fluent.inner.VirtualMachineExtensionImageInner;
import com.azure.management.compute.fluent.VirtualMachineExtensionImagesClient;
import com.azure.management.resources.fluentcore.arm.collection.implementation.ReadableWrappersImpl;
import com.azure.management.resources.fluentcore.utils.PagedConverter;

/** The implementation for VirtualMachineExtensionImageTypes. */
class VirtualMachineExtensionImageTypesImpl
    extends ReadableWrappersImpl<
        VirtualMachineExtensionImageType, VirtualMachineExtensionImageTypeImpl, VirtualMachineExtensionImageInner>
    implements VirtualMachineExtensionImageTypes {
    private final VirtualMachineExtensionImagesClient client;
    private final VirtualMachinePublisher publisher;

    VirtualMachineExtensionImageTypesImpl(
        VirtualMachineExtensionImagesClient client, VirtualMachinePublisher publisher) {
        this.client = client;
        this.publisher = publisher;
    }

    @Override
    public PagedIterable<VirtualMachineExtensionImageType> list() {
        return new PagedIterable<>(listAsync());
    }

    @Override
    protected VirtualMachineExtensionImageTypeImpl wrapModel(VirtualMachineExtensionImageInner inner) {
        if (inner == null) {
            return null;
        }
        return new VirtualMachineExtensionImageTypeImpl(this.client, this.publisher, inner);
    }

    @Override
    public PagedFlux<VirtualMachineExtensionImageType> listAsync() {
        return PagedConverter
            .convertListToPagedFlux(client.listTypesAsync(this.publisher.region().toString(), this.publisher.name()))
            .mapPage(this::wrapModel);
    }
}
