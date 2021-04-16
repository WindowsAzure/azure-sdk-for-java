// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.fluent.models.KeyVaultKeyInner;
import com.azure.resourcemanager.logic.models.KeyVaultKey;
import com.azure.resourcemanager.logic.models.KeyVaultKeyAttributes;

public final class KeyVaultKeyImpl implements KeyVaultKey {
    private KeyVaultKeyInner innerObject;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    KeyVaultKeyImpl(KeyVaultKeyInner innerObject, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String kid() {
        return this.innerModel().kid();
    }

    public KeyVaultKeyAttributes attributes() {
        return this.innerModel().attributes();
    }

    public KeyVaultKeyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
