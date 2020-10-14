/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.CsmPublishingCredentialsPoliciesCollection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class CsmPublishingCredentialsPoliciesCollectionImpl extends WrapperImpl<CsmPublishingCredentialsPoliciesCollectionInner> implements CsmPublishingCredentialsPoliciesCollection {
    private final CertificateRegistrationManager manager;
    CsmPublishingCredentialsPoliciesCollectionImpl(CsmPublishingCredentialsPoliciesCollectionInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public CsmPublishingCredentialsPoliciesEntityInner ftp() {
        return this.inner().ftp();
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
    public CsmPublishingCredentialsPoliciesEntityInner scm() {
        return this.inner().scm();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
