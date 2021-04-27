// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.ListStorageAccountKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.models.ListStorageAccountKeysResult;

public final class ListStorageAccountKeysResultImpl implements ListStorageAccountKeysResult {
    private ListStorageAccountKeysResultInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    ListStorageAccountKeysResultImpl(
        ListStorageAccountKeysResultInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String userStorageKey() {
        return this.innerModel().userStorageKey();
    }

    public ListStorageAccountKeysResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
