// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.resourcemanager.azurestackhci.AzureStackHciManager;
import com.azure.resourcemanager.azurestackhci.fluent.models.AvailableOperationsInner;
import com.azure.resourcemanager.azurestackhci.models.AvailableOperations;
import com.azure.resourcemanager.azurestackhci.models.OperationDetail;
import java.util.Collections;
import java.util.List;

public final class AvailableOperationsImpl implements AvailableOperations {
    private AvailableOperationsInner innerObject;

    private final AzureStackHciManager serviceManager;

    AvailableOperationsImpl(AvailableOperationsInner innerObject, AzureStackHciManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<OperationDetail> value() {
        List<OperationDetail> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public AvailableOperationsInner innerModel() {
        return this.innerObject;
    }

    private AzureStackHciManager manager() {
        return this.serviceManager;
    }
}
