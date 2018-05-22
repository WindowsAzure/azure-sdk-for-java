/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.Certificates;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountCertificate;

class CertificatesImpl extends WrapperImpl<CertificatesInner> implements Certificates {
    private final LogicManager manager;

    CertificatesImpl(LogicManager manager) {
        super(manager.inner().certificates());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountCertificateImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountCertificateImpl wrapModel(IntegrationAccountCertificateInner inner) {
        return  new IntegrationAccountCertificateImpl(inner, manager());
    }

    private IntegrationAccountCertificateImpl wrapModel(String name) {
        return new IntegrationAccountCertificateImpl(name, this.manager());
    }

    private Observable<Page<IntegrationAccountCertificateInner>> listByIntegrationAccountsNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        CertificatesInner client = this.inner();
        return client.listByIntegrationAccountsNextAsync(nextLink)
        .flatMap(new Func1<Page<IntegrationAccountCertificateInner>, Observable<Page<IntegrationAccountCertificateInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountCertificateInner>> call(Page<IntegrationAccountCertificateInner> page) {
                return Observable.just(page).concatWith(listByIntegrationAccountsNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IntegrationAccountCertificate> listByIntegrationAccountsAsync(final String resourceGroupName, final String integrationAccountName) {
        CertificatesInner client = this.inner();
        return client.listByIntegrationAccountsAsync(resourceGroupName, integrationAccountName)
        .flatMap(new Func1<Page<IntegrationAccountCertificateInner>, Observable<Page<IntegrationAccountCertificateInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountCertificateInner>> call(Page<IntegrationAccountCertificateInner> page) {
                return listByIntegrationAccountsNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IntegrationAccountCertificateInner>, Iterable<IntegrationAccountCertificateInner>>() {
            @Override
            public Iterable<IntegrationAccountCertificateInner> call(Page<IntegrationAccountCertificateInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IntegrationAccountCertificateInner, IntegrationAccountCertificate>() {
            @Override
            public IntegrationAccountCertificate call(IntegrationAccountCertificateInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<IntegrationAccountCertificate> getAsync(String resourceGroupName, String integrationAccountName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, certificateName)
        .map(new Func1<IntegrationAccountCertificateInner, IntegrationAccountCertificate>() {
            @Override
            public IntegrationAccountCertificate call(IntegrationAccountCertificateInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, certificateName).toCompletable();
    }

}
