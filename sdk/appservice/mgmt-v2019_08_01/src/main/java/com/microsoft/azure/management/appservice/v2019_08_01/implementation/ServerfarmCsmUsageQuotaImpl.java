/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.ServerfarmCsmUsageQuota;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2019_08_01.LocalizableString;
import org.joda.time.DateTime;

class ServerfarmCsmUsageQuotaImpl extends WrapperImpl<CsmUsageQuotaInner> implements ServerfarmCsmUsageQuota {
    private final CertificateRegistrationManager manager;

    ServerfarmCsmUsageQuotaImpl(CsmUsageQuotaInner inner,  CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }



    @Override
    public Long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public Long limit() {
        return this.inner().limit();
    }

    @Override
    public LocalizableString name() {
        return this.inner().name();
    }

    @Override
    public DateTime nextResetTime() {
        return this.inner().nextResetTime();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
