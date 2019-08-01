/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountAgreements;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2019_05_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountAgreement;

class IntegrationAccountAgreementsImpl extends WrapperImpl<IntegrationAccountAgreementsInner> implements IntegrationAccountAgreements {
    private final LogicManager manager;

    IntegrationAccountAgreementsImpl(LogicManager manager) {
        super(manager.inner().integrationAccountAgreements());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountAgreementImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountAgreementImpl wrapModel(IntegrationAccountAgreementInner inner) {
        return  new IntegrationAccountAgreementImpl(inner, manager());
    }

    private IntegrationAccountAgreementImpl wrapModel(String name) {
        return new IntegrationAccountAgreementImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String agreementName, GetCallbackUrlParameters listContentCallbackUrl) {
        IntegrationAccountAgreementsInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, agreementName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationAccountAgreement> listAsync(final String resourceGroupName, final String integrationAccountName) {
        IntegrationAccountAgreementsInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
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
    public Observable<IntegrationAccountAgreement> getAsync(String resourceGroupName, String integrationAccountName, String agreementName) {
        IntegrationAccountAgreementsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, agreementName)
        .map(new Func1<IntegrationAccountAgreementInner, IntegrationAccountAgreement>() {
            @Override
            public IntegrationAccountAgreement call(IntegrationAccountAgreementInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String agreementName) {
        IntegrationAccountAgreementsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, agreementName).toCompletable();
    }

}
