/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batch.v2017_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batch.v2017_09_01.Certificates;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batch.v2017_09_01.Certificate;

class CertificatesImpl extends WrapperImpl<CertificatesInner> implements Certificates {
    private final BatchManager manager;

    CertificatesImpl(BatchManager manager) {
        super(manager.inner().certificates());
        this.manager = manager;
    }

    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public CertificateImpl define(String name) {
        return wrapModel(name);
    }

    private CertificateImpl wrapModel(CertificateInner inner) {
        return  new CertificateImpl(inner, manager());
    }

    private CertificateImpl wrapModel(String name) {
        return new CertificateImpl(name, this.manager());
    }

    @Override
    public Observable<Certificate> cancelDeletionAsync(String resourceGroupName, String accountName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.cancelDeletionAsync(resourceGroupName, accountName, certificateName)
        .map(new Func1<CertificateInner, Certificate>() {
            @Override
            public Certificate call(CertificateInner inner) {
                return new CertificateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Certificate> listByBatchAccountAsync(final String resourceGroupName, final String accountName) {
        CertificatesInner client = this.inner();
        return client.listByBatchAccountAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<CertificateInner>, Iterable<CertificateInner>>() {
            @Override
            public Iterable<CertificateInner> call(Page<CertificateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CertificateInner, Certificate>() {
            @Override
            public Certificate call(CertificateInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Certificate> getAsync(String resourceGroupName, String accountName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, certificateName)
        .flatMap(new Func1<CertificateInner, Observable<Certificate>>() {
            @Override
            public Observable<Certificate> call(CertificateInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Certificate)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, certificateName).toCompletable();
    }

}
