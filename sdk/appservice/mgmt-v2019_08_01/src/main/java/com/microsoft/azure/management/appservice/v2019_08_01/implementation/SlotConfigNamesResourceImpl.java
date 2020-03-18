/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SlotConfigNamesResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class SlotConfigNamesResourceImpl extends WrapperImpl<SlotConfigNamesResourceInner> implements SlotConfigNamesResource {
    private final CertificateRegistrationManager manager;
    SlotConfigNamesResourceImpl(SlotConfigNamesResourceInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public List<String> appSettingNames() {
        return this.inner().appSettingNames();
    }

    @Override
    public List<String> azureStorageConfigNames() {
        return this.inner().azureStorageConfigNames();
    }

    @Override
    public List<String> connectionStringNames() {
        return this.inner().connectionStringNames();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
