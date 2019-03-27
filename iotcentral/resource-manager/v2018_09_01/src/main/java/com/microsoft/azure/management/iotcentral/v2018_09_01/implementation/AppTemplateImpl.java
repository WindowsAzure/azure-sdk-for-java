/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01.implementation;

import com.microsoft.azure.management.iotcentral.v2018_09_01.AppTemplate;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class AppTemplateImpl extends WrapperImpl<AppTemplateInner> implements AppTemplate {
    private final IoTCentralManager manager;
    AppTemplateImpl(AppTemplateInner inner, IoTCentralManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTCentralManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String manifestId() {
        return this.inner().manifestId();
    }

    @Override
    public String manifestVersion() {
        return this.inner().manifestVersion();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Double order() {
        return this.inner().order();
    }

    @Override
    public String title() {
        return this.inner().title();
    }

}
