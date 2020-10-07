/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.management.compute.v2020_06_01.SshPublicKeyGenerateKeyPairResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SshPublicKeyGenerateKeyPairResultImpl extends WrapperImpl<SshPublicKeyGenerateKeyPairResultInner> implements SshPublicKeyGenerateKeyPairResult {
    private final ComputeManager manager;
    SshPublicKeyGenerateKeyPairResultImpl(SshPublicKeyGenerateKeyPairResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String privateKey() {
        return this.inner().privateKey();
    }

    @Override
    public String publicKey() {
        return this.inner().publicKey();
    }

}
