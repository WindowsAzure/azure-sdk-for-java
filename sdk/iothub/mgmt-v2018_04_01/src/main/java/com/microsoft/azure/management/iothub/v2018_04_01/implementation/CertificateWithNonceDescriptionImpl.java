/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.CertificateWithNonceDescription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2018_04_01.CertificatePropertiesWithNonce;

class CertificateWithNonceDescriptionImpl extends WrapperImpl<CertificateWithNonceDescriptionInner> implements CertificateWithNonceDescription {
    private final IoTHubManager manager;
    CertificateWithNonceDescriptionImpl(CertificateWithNonceDescriptionInner inner, IoTHubManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CertificatePropertiesWithNonce properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
