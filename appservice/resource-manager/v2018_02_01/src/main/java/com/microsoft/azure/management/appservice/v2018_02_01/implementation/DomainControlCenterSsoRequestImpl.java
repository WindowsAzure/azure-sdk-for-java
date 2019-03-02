/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.DomainControlCenterSsoRequest;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DomainControlCenterSsoRequestImpl extends WrapperImpl<DomainControlCenterSsoRequestInner> implements DomainControlCenterSsoRequest {
    private final CertificateRegistrationManager manager;
    DomainControlCenterSsoRequestImpl(DomainControlCenterSsoRequestInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String postParameterKey() {
        return this.inner().postParameterKey();
    }

    @Override
    public String postParameterValue() {
        return this.inner().postParameterValue();
    }

    @Override
    public String url() {
        return this.inner().url();
    }

}
