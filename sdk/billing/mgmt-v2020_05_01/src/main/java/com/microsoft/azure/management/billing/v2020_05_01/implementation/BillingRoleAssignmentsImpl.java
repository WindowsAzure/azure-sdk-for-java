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
import com.microsoft.azure.management.billing.v2020_05_01.BillingRoleAssignments;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2020_05_01.BillingRoleAssignment;

class BillingRoleAssignmentsImpl extends WrapperImpl<BillingRoleAssignmentsInner> implements BillingRoleAssignments {
    private final BillingManager manager;

    BillingRoleAssignmentsImpl(BillingManager manager) {
        super(manager.inner().billingRoleAssignments());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private BillingRoleAssignmentImpl wrapModel(BillingRoleAssignmentInner inner) {
        return  new BillingRoleAssignmentImpl(inner, manager());
    }

    @Override
    public Observable<BillingRoleAssignment> getByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleAssignmentName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.getByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName, billingRoleAssignmentName)
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> deleteByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleAssignmentName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.deleteByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName, billingRoleAssignmentName)
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> getByBillingProfileAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.getByBillingProfileAsync(billingAccountName, billingProfileName, billingRoleAssignmentName)
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> deleteByBillingProfileAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.deleteByBillingProfileAsync(billingAccountName, billingProfileName, billingRoleAssignmentName)
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> listByInvoiceSectionAsync(final String billingAccountName, final String billingProfileName, final String invoiceSectionName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.listByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName)
        .flatMapIterable(new Func1<Page<BillingRoleAssignmentInner>, Iterable<BillingRoleAssignmentInner>>() {
            @Override
            public Iterable<BillingRoleAssignmentInner> call(Page<BillingRoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName)
        .flatMapIterable(new Func1<Page<BillingRoleAssignmentInner>, Iterable<BillingRoleAssignmentInner>>() {
            @Override
            public Iterable<BillingRoleAssignmentInner> call(Page<BillingRoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> listByBillingAccountAsync(final String billingAccountName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<BillingRoleAssignmentInner>, Iterable<BillingRoleAssignmentInner>>() {
            @Override
            public Iterable<BillingRoleAssignmentInner> call(Page<BillingRoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> getByBillingAccountAsync(String billingAccountName, String billingRoleAssignmentName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.getByBillingAccountAsync(billingAccountName, billingRoleAssignmentName)
        .flatMap(new Func1<BillingRoleAssignmentInner, Observable<BillingRoleAssignment>>() {
            @Override
            public Observable<BillingRoleAssignment> call(BillingRoleAssignmentInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BillingRoleAssignment)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteByBillingAccountAsync(String billingAccountName, String billingRoleAssignmentName) {
        BillingRoleAssignmentsInner client = this.inner();
        return client.deleteByBillingAccountAsync(billingAccountName, billingRoleAssignmentName).toCompletable();
    }

}
