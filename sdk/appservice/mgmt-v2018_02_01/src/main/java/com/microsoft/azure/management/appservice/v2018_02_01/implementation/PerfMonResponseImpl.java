/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.PerfMonResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.PerfMonSet;

class PerfMonResponseImpl extends WrapperImpl<PerfMonResponseInner> implements PerfMonResponse {
    private final CertificateRegistrationManager manager;

    PerfMonResponseImpl(PerfMonResponseInner inner,  CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }



    @Override
    public String code() {
        return this.inner().code();
    }

    @Override
    public PerfMonSet data() {
        return this.inner().data();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

}
