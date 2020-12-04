/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDCustomDomains;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_09_01.ValidationToken;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDDomain;

class AFDCustomDomainsImpl extends WrapperImpl<AFDCustomDomainsInner> implements AFDCustomDomains {
    private final CdnManager manager;

    AFDCustomDomainsImpl(CdnManager manager) {
        super(manager.inner().aFDCustomDomains());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public AFDDomainImpl define(String name) {
        return wrapModel(name);
    }

    private AFDDomainImpl wrapModel(AFDDomainInner inner) {
        return  new AFDDomainImpl(inner, manager());
    }

    private AFDDomainImpl wrapModel(String name) {
        return new AFDDomainImpl(name, this.manager());
    }

    @Override
    public Observable<ValidationToken> refreshValidationTokenAsync(String resourceGroupName, String profileName, String customDomainName) {
        AFDCustomDomainsInner client = this.inner();
        return client.refreshValidationTokenAsync(resourceGroupName, profileName, customDomainName)
        .map(new Func1<ValidationTokenInner, ValidationToken>() {
            @Override
            public ValidationToken call(ValidationTokenInner inner) {
                return new ValidationTokenImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AFDDomain> listByProfileAsync(final String resourceGroupName, final String profileName) {
        AFDCustomDomainsInner client = this.inner();
        return client.listByProfileAsync(resourceGroupName, profileName)
        .flatMapIterable(new Func1<Page<AFDDomainInner>, Iterable<AFDDomainInner>>() {
            @Override
            public Iterable<AFDDomainInner> call(Page<AFDDomainInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AFDDomainInner, AFDDomain>() {
            @Override
            public AFDDomain call(AFDDomainInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<AFDDomain> getAsync(String resourceGroupName, String profileName, String customDomainName) {
        AFDCustomDomainsInner client = this.inner();
        return client.getAsync(resourceGroupName, profileName, customDomainName)
        .flatMap(new Func1<AFDDomainInner, Observable<AFDDomain>>() {
            @Override
            public Observable<AFDDomain> call(AFDDomainInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AFDDomain)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String profileName, String customDomainName) {
        AFDCustomDomainsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, profileName, customDomainName).toCompletable();
    }

}
