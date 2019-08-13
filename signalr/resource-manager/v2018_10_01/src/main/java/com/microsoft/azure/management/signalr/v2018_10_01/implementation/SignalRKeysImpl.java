/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_10_01.implementation;

import com.microsoft.azure.management.signalr.v2018_10_01.SignalRKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SignalRKeysImpl extends WrapperImpl<SignalRKeysInner> implements SignalRKeys {
    private final SignalRManager manager;
    SignalRKeysImpl(SignalRKeysInner inner, SignalRManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SignalRManager manager() {
        return this.manager;
    }

    @Override
    public String primaryConnectionString() {
        return this.inner().primaryConnectionString();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String secondaryConnectionString() {
        return this.inner().secondaryConnectionString();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}
