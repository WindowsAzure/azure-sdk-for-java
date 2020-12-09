// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.implementation;

import com.azure.resourcemanager.databox.DataBoxManager;
import com.azure.resourcemanager.databox.fluent.models.AddressValidationOutputInner;
import com.azure.resourcemanager.databox.models.AddressValidationOutput;
import com.azure.resourcemanager.databox.models.AddressValidationStatus;
import com.azure.resourcemanager.databox.models.CloudError;
import com.azure.resourcemanager.databox.models.ShippingAddress;
import java.util.Collections;
import java.util.List;

public final class AddressValidationOutputImpl implements AddressValidationOutput {
    private AddressValidationOutputInner innerObject;

    private final DataBoxManager serviceManager;

    public AddressValidationOutputImpl(AddressValidationOutputInner innerObject, DataBoxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CloudError error() {
        return this.innerModel().error();
    }

    public AddressValidationStatus validationStatus() {
        return this.innerModel().validationStatus();
    }

    public List<ShippingAddress> alternateAddresses() {
        List<ShippingAddress> inner = this.innerModel().alternateAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AddressValidationOutputInner innerModel() {
        return this.innerObject;
    }

    private DataBoxManager manager() {
        return this.serviceManager;
    }
}
