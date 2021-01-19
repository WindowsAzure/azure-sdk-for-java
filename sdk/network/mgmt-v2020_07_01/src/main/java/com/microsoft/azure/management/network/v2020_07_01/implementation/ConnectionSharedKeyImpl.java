/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.ConnectionSharedKey;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ConnectionSharedKeyImpl extends WrapperImpl<ConnectionSharedKeyInner> implements ConnectionSharedKey {
    private final NetworkManager manager;
    ConnectionSharedKeyImpl(ConnectionSharedKeyInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String value() {
        return this.inner().value();
    }

}
