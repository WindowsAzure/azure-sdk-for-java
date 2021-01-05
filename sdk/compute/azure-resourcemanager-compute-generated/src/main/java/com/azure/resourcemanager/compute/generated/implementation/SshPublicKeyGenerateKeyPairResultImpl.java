// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.SshPublicKeyGenerateKeyPairResultInner;
import com.azure.resourcemanager.compute.generated.models.SshPublicKeyGenerateKeyPairResult;

public final class SshPublicKeyGenerateKeyPairResultImpl implements SshPublicKeyGenerateKeyPairResult {
    private SshPublicKeyGenerateKeyPairResultInner innerObject;

    private final ComputeManager serviceManager;

    SshPublicKeyGenerateKeyPairResultImpl(
        SshPublicKeyGenerateKeyPairResultInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String privateKey() {
        return this.innerModel().privateKey();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public String id() {
        return this.innerModel().id();
    }

    public SshPublicKeyGenerateKeyPairResultInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
