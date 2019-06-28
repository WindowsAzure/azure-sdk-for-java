/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.Certificates;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.CertificateContract;

class CertificatesImpl extends WrapperImpl<CertificatesInner> implements Certificates {
    private final ApiManagementManager manager;

    CertificatesImpl(ApiManagementManager manager) {
        super(manager.inner().certificates());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public CertificateContractImpl define(String name) {
        return wrapModel(name);
    }

    private CertificateContractImpl wrapModel(CertificateContractInner inner) {
        return  new CertificateContractImpl(inner, manager());
    }

    private CertificateContractImpl wrapModel(String name) {
        return new CertificateContractImpl(name, this.manager());
    }

    @Override
    public Observable<CertificateContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        CertificatesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<CertificateContractInner>, Iterable<CertificateContractInner>>() {
            @Override
            public Iterable<CertificateContractInner> call(Page<CertificateContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CertificateContractInner, CertificateContract>() {
            @Override
            public CertificateContract call(CertificateContractInner inner) {
                return new CertificateContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String certificateId) {
        CertificatesInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, certificateId).toCompletable();
    }

    @Override
    public Observable<CertificateContract> getAsync(String resourceGroupName, String serviceName, String certificateId) {
        CertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, certificateId)
        .map(new Func1<CertificateContractInner, CertificateContract>() {
            @Override
            public CertificateContract call(CertificateContractInner inner) {
                return new CertificateContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String certificateId, String ifMatch) {
        CertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, certificateId, ifMatch).toCompletable();
    }

}
