/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.support.v2020_04_01.Communications;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.support.v2020_04_01.CommunicationDetails;
import com.microsoft.azure.management.support.v2020_04_01.CheckNameAvailabilityOutput;
import com.microsoft.azure.management.support.v2020_04_01.CheckNameAvailabilityInput;

class CommunicationsImpl extends WrapperImpl<CommunicationsInner> implements Communications {
    private final SupportManager manager;

    CommunicationsImpl(SupportManager manager) {
        super(manager.inner().communications());
        this.manager = manager;
    }

    public SupportManager manager() {
        return this.manager;
    }

    @Override
    public CommunicationDetailsImpl define(String name) {
        return wrapModel(name);
    }

    private CommunicationDetailsImpl wrapModel(CommunicationDetailsInner inner) {
        return  new CommunicationDetailsImpl(inner, manager());
    }

    private CommunicationDetailsImpl wrapModel(String name) {
        return new CommunicationDetailsImpl(name, this.manager());
    }

    @Override
    public Observable<CommunicationDetails> listAsync(final String supportTicketName) {
        CommunicationsInner client = this.inner();
        return client.listAsync(supportTicketName)
        .flatMapIterable(new Func1<Page<CommunicationDetailsInner>, Iterable<CommunicationDetailsInner>>() {
            @Override
            public Iterable<CommunicationDetailsInner> call(Page<CommunicationDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CommunicationDetailsInner, CommunicationDetails>() {
            @Override
            public CommunicationDetails call(CommunicationDetailsInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<CommunicationDetails> getAsync(String supportTicketName, String communicationName) {
        CommunicationsInner client = this.inner();
        return client.getAsync(supportTicketName, communicationName)
        .flatMap(new Func1<CommunicationDetailsInner, Observable<CommunicationDetails>>() {
            @Override
            public Observable<CommunicationDetails> call(CommunicationDetailsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((CommunicationDetails)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<CheckNameAvailabilityOutput> checkNameAvailabilityAsync(String supportTicketName, CheckNameAvailabilityInput checkNameAvailabilityInput) {
        CommunicationsInner client = this.inner();
        return client.checkNameAvailabilityAsync(supportTicketName, checkNameAvailabilityInput)
        .map(new Func1<CheckNameAvailabilityOutputInner, CheckNameAvailabilityOutput>() {
            @Override
            public CheckNameAvailabilityOutput call(CheckNameAvailabilityOutputInner inner) {
                return new CheckNameAvailabilityOutputImpl(inner, manager());
            }
        });
    }

}
