// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.implementation;

import com.azure.resourcemanager.databox.fluent.models.ShipmentPickUpResponseInner;
import com.azure.resourcemanager.databox.models.ShipmentPickUpResponse;
import java.time.OffsetDateTime;

public final class ShipmentPickUpResponseImpl implements ShipmentPickUpResponse {
    private ShipmentPickUpResponseInner innerObject;

    private final com.azure.resourcemanager.databox.DataBoxManager serviceManager;

    ShipmentPickUpResponseImpl(
        ShipmentPickUpResponseInner innerObject, com.azure.resourcemanager.databox.DataBoxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String confirmationNumber() {
        return this.innerModel().confirmationNumber();
    }

    public OffsetDateTime readyByTime() {
        return this.innerModel().readyByTime();
    }

    public ShipmentPickUpResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databox.DataBoxManager manager() {
        return this.serviceManager;
    }
}
