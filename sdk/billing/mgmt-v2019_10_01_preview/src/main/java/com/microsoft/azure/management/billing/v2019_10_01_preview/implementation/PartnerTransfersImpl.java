/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.PartnerTransfers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.CustomerBillingProfileBillingAccountTransferDetails;
import com.microsoft.azure.management.billing.v2019_10_01_preview.InvoiceSectionBillingProfileBillingAccountTransferDetails;
import com.microsoft.azure.management.billing.v2019_10_01_preview.InitiateTransferRequest;

class PartnerTransfersImpl extends WrapperImpl<PartnerTransfersInner> implements PartnerTransfers {
    private final BillingManager manager;

    PartnerTransfersImpl(BillingManager manager) {
        super(manager.inner().partnerTransfers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private CustomerBillingProfileBillingAccountTransferDetailsImpl wrapModel(TransferDetailsInner inner) {
        return  new CustomerBillingProfileBillingAccountTransferDetailsImpl(inner, manager());
    }

    @Override
    public Observable<CustomerBillingProfileBillingAccountTransferDetails> listAsync(final String billingAccountName, final String billingProfileName, final String customerName) {
        PartnerTransfersInner client = this.inner();
        return client.listAsync(billingAccountName, billingProfileName, customerName)
        .flatMapIterable(new Func1<Page<TransferDetailsInner>, Iterable<TransferDetailsInner>>() {
            @Override
            public Iterable<TransferDetailsInner> call(Page<TransferDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransferDetailsInner, CustomerBillingProfileBillingAccountTransferDetails>() {
            @Override
            public CustomerBillingProfileBillingAccountTransferDetails call(TransferDetailsInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<CustomerBillingProfileBillingAccountTransferDetails> getAsync(String billingAccountName, String billingProfileName, String customerName, String transferName) {
        PartnerTransfersInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, customerName, transferName)
        .flatMap(new Func1<TransferDetailsInner, Observable<CustomerBillingProfileBillingAccountTransferDetails>>() {
            @Override
            public Observable<CustomerBillingProfileBillingAccountTransferDetails> call(TransferDetailsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((CustomerBillingProfileBillingAccountTransferDetails)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable cancelAsync(String billingAccountName, String billingProfileName, String customerName, String transferName) {
        PartnerTransfersInner client = this.inner();
        return client.cancelAsync(billingAccountName, billingProfileName, customerName, transferName).toCompletable();
    }

    @Override
    public Observable<InvoiceSectionBillingProfileBillingAccountTransferDetails> initiateAsync(String billingAccountName, String billingProfileName, String customerName, InitiateTransferRequest parameters) {
        PartnerTransfersInner client = this.inner();
        return client.initiateAsync(billingAccountName, billingProfileName, customerName, parameters)
        .map(new Func1<TransferDetailsInner, InvoiceSectionBillingProfileBillingAccountTransferDetails>() {
            @Override
            public InvoiceSectionBillingProfileBillingAccountTransferDetails call(TransferDetailsInner inner) {
                return new InvoiceSectionBillingProfileBillingAccountTransferDetailsImpl(inner, manager());
            }
        });
    }

}
