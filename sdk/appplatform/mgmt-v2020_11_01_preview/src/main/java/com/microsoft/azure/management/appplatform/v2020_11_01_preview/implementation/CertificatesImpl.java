/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.Certificates;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.CertificateResource;

class CertificatesImpl extends WrapperImpl<CertificatesInner> implements Certificates {
    private final AppPlatformManager manager;

    CertificatesImpl(AppPlatformManager manager) {
        super(manager.inner().certificates());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public CertificateResourceImpl define(String name) {
        return wrapModel(name);
    }

    private CertificateResourceImpl wrapModel(CertificateResourceInner inner) {
        return  new CertificateResourceImpl(inner, manager());
    }

    private CertificateResourceImpl wrapModel(String name) {
        return new CertificateResourceImpl(name, this.manager());
    }

    @Override
    public Observable<CertificateResource> getAsync(String resourceGroupName, String serviceName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, certificateName)
        .map(new Func1<CertificateResourceInner, CertificateResource>() {
            @Override
            public CertificateResource call(CertificateResourceInner inner) {
                return new CertificateResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, certificateName).toCompletable();
    }

    @Override
    public Observable<CertificateResource> listAsync(final String resourceGroupName, final String serviceName) {
        CertificatesInner client = this.inner();
        return client.listAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<CertificateResourceInner>, Iterable<CertificateResourceInner>>() {
            @Override
            public Iterable<CertificateResourceInner> call(Page<CertificateResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CertificateResourceInner, CertificateResource>() {
            @Override
            public CertificateResource call(CertificateResourceInner inner) {
                return new CertificateResourceImpl(inner, manager());
            }
        });
    }

}
