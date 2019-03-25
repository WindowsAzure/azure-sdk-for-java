/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batch.v2015_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batch.v2015_12_01.ApplicationPackages;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.batch.v2015_12_01.ApplicationPackage;

class ApplicationPackagesImpl extends WrapperImpl<ApplicationPackagesInner> implements ApplicationPackages {
    private final BatchManager manager;

    ApplicationPackagesImpl(BatchManager manager) {
        super(manager.inner().applicationPackages());
        this.manager = manager;
    }

    public BatchManager manager() {
        return this.manager;
    }

    private ApplicationPackageImpl wrapModel(ApplicationPackageInner inner) {
        return  new ApplicationPackageImpl(inner, manager());
    }

    @Override
    public Completable activateAsync(String resourceGroupName, String accountName, String applicationId, String version, String format) {
        ApplicationPackagesInner client = this.inner();
        return client.activateAsync(resourceGroupName, accountName, applicationId, version, format).toCompletable();
    }

    @Override
    public Observable<ApplicationPackage> createAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        ApplicationPackagesInner client = this.inner();
        return client.createAsync(resourceGroupName, accountName, applicationId, version)
        .map(new Func1<ApplicationPackageInner, ApplicationPackage>() {
            @Override
            public ApplicationPackage call(ApplicationPackageInner inner) {
                return new ApplicationPackageImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationPackage> getAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        ApplicationPackagesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, applicationId, version)
        .map(new Func1<ApplicationPackageInner, ApplicationPackage>() {
            @Override
            public ApplicationPackage call(ApplicationPackageInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        ApplicationPackagesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, applicationId, version).toCompletable();
    }

}
