/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.Certificates;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.CertificateListDescription;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.CertificateWithNonceDescription;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.CertificateDescription;

class CertificatesImpl extends WrapperImpl<CertificatesInner> implements Certificates {
    private final IoTHubManager manager;

    CertificatesImpl(IoTHubManager manager) {
        super(manager.inner().certificates());
        this.manager = manager;
    }

    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public CertificateDescriptionImpl define(String name) {
        return wrapModel(name);
    }

    private CertificateDescriptionImpl wrapModel(CertificateDescriptionInner inner) {
        return  new CertificateDescriptionImpl(inner, manager());
    }

    private CertificateDescriptionImpl wrapModel(String name) {
        return new CertificateDescriptionImpl(name, this.manager());
    }

    @Override
    public Observable<CertificateListDescription> listByIotHubAsync(String resourceGroupName, String resourceName) {
        CertificatesInner client = this.inner();
        return client.listByIotHubAsync(resourceGroupName, resourceName)
        .map(new Func1<CertificateListDescriptionInner, CertificateListDescription>() {
            @Override
            public CertificateListDescription call(CertificateListDescriptionInner inner) {
                return new CertificateListDescriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CertificateWithNonceDescription> generateVerificationCodeAsync(String resourceGroupName, String resourceName, String certificateName, String ifMatch) {
        CertificatesInner client = this.inner();
        return client.generateVerificationCodeAsync(resourceGroupName, resourceName, certificateName, ifMatch)
        .map(new Func1<CertificateWithNonceDescriptionInner, CertificateWithNonceDescription>() {
            @Override
            public CertificateWithNonceDescription call(CertificateWithNonceDescriptionInner inner) {
                return new CertificateWithNonceDescriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CertificateDescription> verifyAsync(String resourceGroupName, String resourceName, String certificateName, String ifMatch) {
        CertificatesInner client = this.inner();
        return client.verifyAsync(resourceGroupName, resourceName, certificateName, ifMatch)
        .map(new Func1<CertificateDescriptionInner, CertificateDescription>() {
            @Override
            public CertificateDescription call(CertificateDescriptionInner inner) {
                return new CertificateDescriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CertificateDescription> getAsync(String resourceGroupName, String resourceName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, certificateName)
        .map(new Func1<CertificateDescriptionInner, CertificateDescription>() {
            @Override
            public CertificateDescription call(CertificateDescriptionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName, String certificateName, String ifMatch) {
        CertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, certificateName, ifMatch).toCompletable();
    }

}
