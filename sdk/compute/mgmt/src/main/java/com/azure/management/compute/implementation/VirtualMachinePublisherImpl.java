// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.management.compute.implementation;

import com.azure.management.compute.models.VirtualMachineExtensionImageTypes;
import com.azure.management.compute.models.VirtualMachineOffers;
import com.azure.management.compute.models.VirtualMachinePublisher;
import com.azure.management.compute.fluent.VirtualMachineExtensionImagesClient;
import com.azure.management.compute.fluent.VirtualMachineImagesClient;
import com.azure.management.resources.fluentcore.arm.Region;

/** The implementation for {@link VirtualMachinePublisher}. */
class VirtualMachinePublisherImpl implements VirtualMachinePublisher {
    private final Region location;
    private final String publisher;
    private final VirtualMachineOffers offers;
    private final VirtualMachineExtensionImageTypes types;

    VirtualMachinePublisherImpl(
        Region location,
        String publisher,
        VirtualMachineImagesClient imagesClient,
        VirtualMachineExtensionImagesClient extensionsClient) {
        this.location = location;
        this.publisher = publisher;
        this.offers = new VirtualMachineOffersImpl(imagesClient, this);
        this.types = new VirtualMachineExtensionImageTypesImpl(extensionsClient, this);
    }

    @Override
    public Region region() {
        return location;
    }

    @Override
    public String name() {
        return publisher;
    }

    @Override
    public VirtualMachineOffers offers() {
        return this.offers;
    }

    @Override
    public VirtualMachineExtensionImageTypes extensionTypes() {
        return this.types;
    }
}
