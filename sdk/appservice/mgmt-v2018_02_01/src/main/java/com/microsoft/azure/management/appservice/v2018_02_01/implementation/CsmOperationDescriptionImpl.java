/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.CsmOperationDescription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.CsmOperationDisplay;
import com.microsoft.azure.management.appservice.v2018_02_01.CsmOperationDescriptionProperties;

class CsmOperationDescriptionImpl extends WrapperImpl<CsmOperationDescriptionInner> implements CsmOperationDescription {
    private final CertificateRegistrationManager manager;
    CsmOperationDescriptionImpl(CsmOperationDescriptionInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public CsmOperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public CsmOperationDescriptionProperties properties() {
        return this.inner().properties();
    }

}
