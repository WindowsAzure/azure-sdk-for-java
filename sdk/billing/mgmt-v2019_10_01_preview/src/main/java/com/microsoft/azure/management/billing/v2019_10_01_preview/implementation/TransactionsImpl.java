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
import com.microsoft.azure.management.billing.v2019_10_01_preview.Transactions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Transaction;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransactionListResult;

class TransactionsImpl extends WrapperImpl<TransactionsInner> implements Transactions {
    private final BillingManager manager;

    TransactionsImpl(BillingManager manager) {
        super(manager.inner().transactions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private TransactionImpl wrapModel(TransactionInner inner) {
        return  new TransactionImpl(inner, manager());
    }

    @Override
    public Observable<Transaction> listByBillingAccountAsync(final String billingAccountName, final String periodStartDate, final String periodEndDate) {
        TransactionsInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName, periodStartDate, periodEndDate)
        .flatMapIterable(new Func1<Page<TransactionInner>, Iterable<TransactionInner>>() {
            @Override
            public Iterable<TransactionInner> call(Page<TransactionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransactionInner, Transaction>() {
            @Override
            public Transaction call(TransactionInner inner) {
                return new TransactionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransactionListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName, String periodStartDate, String periodEndDate) {
        TransactionsInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName, periodStartDate, periodEndDate)
        .map(new Func1<TransactionListResultInner, TransactionListResult>() {
            @Override
            public TransactionListResult call(TransactionListResultInner inner) {
                return new TransactionListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransactionListResult> listByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String periodStartDate, String periodEndDate) {
        TransactionsInner client = this.inner();
        return client.listByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName, periodStartDate, periodEndDate)
        .map(new Func1<TransactionListResultInner, TransactionListResult>() {
            @Override
            public TransactionListResult call(TransactionListResultInner inner) {
                return new TransactionListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Transaction> getAsync(String billingAccountName, String billingProfileName, String transactionName, String periodStartDate, String periodEndDate) {
        TransactionsInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, transactionName, periodStartDate, periodEndDate)
        .map(new Func1<TransactionInner, Transaction>() {
            @Override
            public Transaction call(TransactionInner inner) {
                return new TransactionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Transaction> listByCustomerAsync(final String billingAccountName, final String customerName, final String periodStartDate, final String periodEndDate) {
        TransactionsInner client = this.inner();
        return client.listByCustomerAsync(billingAccountName, customerName, periodStartDate, periodEndDate)
        .flatMapIterable(new Func1<Page<TransactionInner>, Iterable<TransactionInner>>() {
            @Override
            public Iterable<TransactionInner> call(Page<TransactionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransactionInner, Transaction>() {
            @Override
            public Transaction call(TransactionInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
