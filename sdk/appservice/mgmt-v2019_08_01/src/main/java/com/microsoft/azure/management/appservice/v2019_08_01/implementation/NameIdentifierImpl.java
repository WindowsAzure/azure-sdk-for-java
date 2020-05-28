/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.NameIdentifier;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class NameIdentifierImpl extends WrapperImpl<NameIdentifierInner> implements NameIdentifier {
    private final CertificateRegistrationManager manager;
    NameIdentifierImpl(NameIdentifierInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
