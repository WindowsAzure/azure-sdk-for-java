// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.resourcemanager.datalakestore.DataLakeStoreManager;
import com.azure.resourcemanager.datalakestore.fluent.models.CapabilityInformationInner;
import com.azure.resourcemanager.datalakestore.models.CapabilityInformation;
import com.azure.resourcemanager.datalakestore.models.SubscriptionState;
import java.util.UUID;

public final class CapabilityInformationImpl implements CapabilityInformation {
    private CapabilityInformationInner innerObject;

    private final DataLakeStoreManager serviceManager;

    CapabilityInformationImpl(CapabilityInformationInner innerObject, DataLakeStoreManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UUID subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public SubscriptionState state() {
        return this.innerModel().state();
    }

    public Integer maxAccountCount() {
        return this.innerModel().maxAccountCount();
    }

    public Integer accountCount() {
        return this.innerModel().accountCount();
    }

    public Boolean migrationState() {
        return this.innerModel().migrationState();
    }

    public CapabilityInformationInner innerModel() {
        return this.innerObject;
    }

    private DataLakeStoreManager manager() {
        return this.serviceManager;
    }
}
