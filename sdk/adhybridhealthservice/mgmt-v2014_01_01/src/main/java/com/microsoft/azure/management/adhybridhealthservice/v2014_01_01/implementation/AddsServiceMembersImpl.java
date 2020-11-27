/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsServiceMembers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceAddsServiceMember;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceServiceMember;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceCredential;

class AddsServiceMembersImpl extends WrapperImpl<AddsServiceMembersInner> implements AddsServiceMembers {
    private final ADHybridHealthServiceManager manager;

    AddsServiceMembersImpl(ADHybridHealthServiceManager manager) {
        super(manager.inner().addsServiceMembers());
        this.manager = manager;
    }

    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    private AddsserviceAddsServiceMemberImpl wrapModel(AddsServiceMemberInner inner) {
        return  new AddsserviceAddsServiceMemberImpl(inner, manager());
    }

    @Override
    public Observable<AddsserviceAddsServiceMember> listAsync(final String serviceName) {
        AddsServiceMembersInner client = this.inner();
        return client.listAsync(serviceName)
        .flatMapIterable(new Func1<Page<AddsServiceMemberInner>, Iterable<AddsServiceMemberInner>>() {
            @Override
            public Iterable<AddsServiceMemberInner> call(Page<AddsServiceMemberInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AddsServiceMemberInner, AddsserviceAddsServiceMember>() {
            @Override
            public AddsserviceAddsServiceMember call(AddsServiceMemberInner inner) {
                return wrapModel(inner);
            }
        });
    }

    private AddsserviceServiceMemberImpl wrapAddsserviceServiceMemberModel(ServiceMemberInner inner) {
        return  new AddsserviceServiceMemberImpl(inner, manager());
    }

    private AddsserviceCredentialImpl wrapAddsserviceCredentialModel(CredentialInner inner) {
        return  new AddsserviceCredentialImpl(inner, manager());
    }

    private Observable<ServiceMemberInner> getServiceMemberInnerUsingAddsServiceMembersInnerAsync(String id) {
        String serviceName = IdParsingUtils.getValueFromIdByName(id, "addsservices");
        String serviceMemberId = UUID.fromString(IdParsingUtils.getValueFromIdByName(id, "servicemembers"));
        AddsServiceMembersInner client = this.inner();
        return client.getAsync(serviceName, serviceMemberId);
    }

    @Override
    public Observable<AddsserviceServiceMember> getAsync(String serviceName, UUID serviceMemberId) {
        AddsServiceMembersInner client = this.inner();
        return client.getAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<ServiceMemberInner, Observable<AddsserviceServiceMember>>() {
            @Override
            public Observable<AddsserviceServiceMember> call(ServiceMemberInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AddsserviceServiceMember)wrapAddsserviceServiceMemberModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String serviceName, UUID serviceMemberId) {
        AddsServiceMembersInner client = this.inner();
        return client.deleteAsync(serviceName, serviceMemberId).toCompletable();
    }

    @Override
    public Observable<AddsserviceCredential> listCredentialsAsync(String serviceName, UUID serviceMemberId) {
        AddsServiceMembersInner client = this.inner();
        return client.listCredentialsAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<List<CredentialInner>, Observable<CredentialInner>>() {
            @Override
            public Observable<CredentialInner> call(List<CredentialInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CredentialInner, AddsserviceCredential>() {
            @Override
            public AddsserviceCredential call(CredentialInner inner) {
                return wrapAddsserviceCredentialModel(inner);
            }
        });
    }

}
