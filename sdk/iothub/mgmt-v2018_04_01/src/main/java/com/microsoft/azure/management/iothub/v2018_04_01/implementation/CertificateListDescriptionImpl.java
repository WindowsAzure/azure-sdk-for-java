/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.CertificateListDescription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class CertificateListDescriptionImpl extends WrapperImpl<CertificateListDescriptionInner> implements CertificateListDescription {
    private final IoTHubManager manager;
    CertificateListDescriptionImpl(CertificateListDescriptionInner inner, IoTHubManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public List<CertificateDescriptionInner> value() {
        return this.inner().value();
    }

}
