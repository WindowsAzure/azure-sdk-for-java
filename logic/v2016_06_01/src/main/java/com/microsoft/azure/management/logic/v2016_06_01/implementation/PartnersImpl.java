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
import com.microsoft.azure.management.logic.v2016_06_01.Partners;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2016_06_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountPartner;

class PartnersImpl extends WrapperImpl<PartnersInner> implements Partners {
    private final LogicManager manager;

    PartnersImpl(LogicManager manager) {
        super(manager.inner().partners());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountPartnerImpl define(String name) {
        return new IntegrationAccountPartnerImpl(name, this.manager());
    }

    private IntegrationAccountPartnerImpl wrapModel(IntegrationAccountPartnerInner inner) {
        return  new IntegrationAccountPartnerImpl(inner, manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String partnerName, GetCallbackUrlParameters listContentCallbackUrl) {
        PartnersInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, partnerName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    private Observable<Page<IntegrationAccountPartnerInner>> listByIntegrationAccountNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PartnersInner client = this.inner();
        return client.listByIntegrationAccountsNextAsync(nextLink)
        .flatMap(new Func1<Page<IntegrationAccountPartnerInner>, Observable<Page<IntegrationAccountPartnerInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountPartnerInner>> call(Page<IntegrationAccountPartnerInner> page) {
                return Observable.just(page).concatWith(listByIntegrationAccountNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IntegrationAccountPartner> listByIntegrationAccountAsync(final String resourceGroupName, final String integrationAccountName) {
        PartnersInner client = this.inner();
        return client.listByIntegrationAccountsAsync(resourceGroupName, integrationAccountName)
        .flatMap(new Func1<Page<IntegrationAccountPartnerInner>, Observable<Page<IntegrationAccountPartnerInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountPartnerInner>> call(Page<IntegrationAccountPartnerInner> page) {
                return listByIntegrationAccountNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IntegrationAccountPartnerInner>, Iterable<IntegrationAccountPartnerInner>>() {
            @Override
            public Iterable<IntegrationAccountPartnerInner> call(Page<IntegrationAccountPartnerInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IntegrationAccountPartnerInner, IntegrationAccountPartner>() {
            @Override
            public IntegrationAccountPartner call(IntegrationAccountPartnerInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<IntegrationAccountPartner> getByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String partnerName) {
        PartnersInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, partnerName)
        .map(new Func1<IntegrationAccountPartnerInner, IntegrationAccountPartner>() {
            @Override
            public IntegrationAccountPartner call(IntegrationAccountPartnerInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String partnerName) {
        PartnersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, partnerName).toCompletable();
    }

}
