/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2020_05_01.Invoices;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2020_05_01.Invoice;
import com.microsoft.azure.management.billing.v2020_05_01.DownloadUrl;

class InvoicesImpl extends WrapperImpl<InvoicesInner> implements Invoices {
    private final BillingManager manager;

    InvoicesImpl(BillingManager manager) {
        super(manager.inner().invoices());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private InvoiceImpl wrapModel(InvoiceInner inner) {
        return  new InvoiceImpl(inner, manager());
    }

    @Override
    public Observable<Invoice> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName, final String periodStartDate, final String periodEndDate) {
        InvoicesInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName, periodStartDate, periodEndDate)
        .flatMapIterable(new Func1<Page<InvoiceInner>, Iterable<InvoiceInner>>() {
            @Override
            public Iterable<InvoiceInner> call(Page<InvoiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> getByIdAsync(String invoiceName) {
        InvoicesInner client = this.inner();
        return client.getByIdAsync(invoiceName)
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DownloadUrl> downloadInvoiceAsync(String billingAccountName, String invoiceName, String downloadToken) {
        InvoicesInner client = this.inner();
        return client.downloadInvoiceAsync(billingAccountName, invoiceName, downloadToken)
        .map(new Func1<DownloadUrlInner, DownloadUrl>() {
            @Override
            public DownloadUrl call(DownloadUrlInner inner) {
                return new DownloadUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> listByBillingSubscriptionAsync(final String periodStartDate, final String periodEndDate) {
        InvoicesInner client = this.inner();
        return client.listByBillingSubscriptionAsync(periodStartDate, periodEndDate)
        .flatMapIterable(new Func1<Page<InvoiceInner>, Iterable<InvoiceInner>>() {
            @Override
            public Iterable<InvoiceInner> call(Page<InvoiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> getBySubscriptionAndInvoiceIdAsync(String invoiceName) {
        InvoicesInner client = this.inner();
        return client.getBySubscriptionAndInvoiceIdAsync(invoiceName)
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DownloadUrl> downloadBillingSubscriptionInvoiceAsync(String invoiceName, String downloadToken) {
        InvoicesInner client = this.inner();
        return client.downloadBillingSubscriptionInvoiceAsync(invoiceName, downloadToken)
        .map(new Func1<DownloadUrlInner, DownloadUrl>() {
            @Override
            public DownloadUrl call(DownloadUrlInner inner) {
                return new DownloadUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> listByBillingAccountAsync(final String billingAccountName, final String periodStartDate, final String periodEndDate) {
        InvoicesInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName, periodStartDate, periodEndDate)
        .flatMapIterable(new Func1<Page<InvoiceInner>, Iterable<InvoiceInner>>() {
            @Override
            public Iterable<InvoiceInner> call(Page<InvoiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Invoice> getAsync(String billingAccountName, String invoiceName) {
        InvoicesInner client = this.inner();
        return client.getAsync(billingAccountName, invoiceName)
        .flatMap(new Func1<InvoiceInner, Observable<Invoice>>() {
            @Override
            public Observable<Invoice> call(InvoiceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Invoice)wrapModel(inner));
                }
            }
       });
    }

}
