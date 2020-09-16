/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation;

import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.DelegatedController;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.ControllerState;

class DelegatedControllerImpl extends WrapperImpl<DelegatedControllerInner> implements DelegatedController {
    private final DelegatedNetworkManager manager;
    DelegatedControllerImpl(DelegatedControllerInner inner, DelegatedNetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DelegatedNetworkManager manager() {
        return this.manager;
    }

    @Override
    public String dncAppId() {
        return this.inner().dncAppId();
    }

    @Override
    public String dncEndpoint() {
        return this.inner().dncEndpoint();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ControllerState state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
