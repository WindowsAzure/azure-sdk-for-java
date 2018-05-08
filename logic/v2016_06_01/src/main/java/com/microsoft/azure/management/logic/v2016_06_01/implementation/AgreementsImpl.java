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
import com.microsoft.azure.management.logic.v2016_06_01.Agreements;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2016_06_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountAgreement;

class AgreementsImpl extends WrapperImpl<AgreementsInner> implements Agreements {
    private final LogicManager manager;

    AgreementsImpl(LogicManager manager) {
        super(manager.inner().agreements());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountAgreementImpl define(String name) {
        return new IntegrationAccountAgreementImpl(name, this.manager());
    }

    private IntegrationAccountAgreementImpl wrapModel(IntegrationAccountAgreementInner inner) {
        return  new IntegrationAccountAgreementImpl(inner, manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String agreementName, GetCallbackUrlParameters listContentCallbackUrl) {
        AgreementsInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, agreementName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    private Observable<Page<IntegrationAccountAgreementInner>> listByIntegrationAccountNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        AgreementsInner client = this.inner();
        return client.listByIntegrationAccountsNextAsync(nextLink)
        .flatMap(new Func1<Page<IntegrationAccountAgreementInner>, Observable<Page<IntegrationAccountAgreementInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountAgreementInner>> call(Page<IntegrationAccountAgreementInner> page) {
                return Observable.just(page).concatWith(listByIntegrationAccountNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IntegrationAccountAgreement> listByIntegrationAccountAsync(final String resourceGroupName, final String integrationAccountName) {
        AgreementsInner client = this.inner();
        return client.listByIntegrationAccountsAsync(resourceGroupName, integrationAccountName)
        .flatMap(new Func1<Page<IntegrationAccountAgreementInner>, Observable<Page<IntegrationAccountAgreementInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountAgreementInner>> call(Page<IntegrationAccountAgreementInner> page) {
                return listByIntegrationAccountNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IntegrationAccountAgreementInner>, Iterable<IntegrationAccountAgreementInner>>() {
            @Override
            public Iterable<IntegrationAccountAgreementInner> call(Page<IntegrationAccountAgreementInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IntegrationAccountAgreementInner, IntegrationAccountAgreement>() {
            @Override
            public IntegrationAccountAgreement call(IntegrationAccountAgreementInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<IntegrationAccountAgreement> getByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String agreementName) {
        AgreementsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, agreementName)
        .map(new Func1<IntegrationAccountAgreementInner, IntegrationAccountAgreement>() {
            @Override
            public IntegrationAccountAgreement call(IntegrationAccountAgreementInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String agreementName) {
        AgreementsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, agreementName).toCompletable();
    }

}
