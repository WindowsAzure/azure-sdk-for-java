/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.CertificateRegistrationProviders;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2019_08_01.CsmOperationDescription;

class CertificateRegistrationProvidersImpl extends WrapperImpl<CertificateRegistrationProvidersInner> implements CertificateRegistrationProviders {
    private final CertificateRegistrationManager manager;

    CertificateRegistrationProvidersImpl(CertificateRegistrationManager manager) {
        super(manager.inner().certificateRegistrationProviders());
        this.manager = manager;
    }

    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CsmOperationDescription> listOperationsAsync() {
        CertificateRegistrationProvidersInner client = this.inner();
        return client.listOperationsAsync()
        .flatMapIterable(new Func1<Page<CsmOperationDescriptionInner>, Iterable<CsmOperationDescriptionInner>>() {
            @Override
            public Iterable<CsmOperationDescriptionInner> call(Page<CsmOperationDescriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CsmOperationDescriptionInner, CsmOperationDescription>() {
            @Override
            public CsmOperationDescription call(CsmOperationDescriptionInner inner) {
                return new CsmOperationDescriptionImpl(inner, manager());
            }
        });
    }

}
