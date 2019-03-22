/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileBillingRoleAssignments;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleAssignment;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleAssignmentListResult;

class BillingProfileBillingRoleAssignmentsImpl extends WrapperImpl<BillingProfileBillingRoleAssignmentsInner> implements BillingProfileBillingRoleAssignments {
    private final BillingManager manager;

    BillingProfileBillingRoleAssignmentsImpl(BillingManager manager) {
        super(manager.inner().billingProfileBillingRoleAssignments());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingRoleAssignment> getAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        BillingProfileBillingRoleAssignmentsInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, billingRoleAssignmentName)
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignment> deleteAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        BillingProfileBillingRoleAssignmentsInner client = this.inner();
        return client.deleteAsync(billingAccountName, billingProfileName, billingRoleAssignmentName)
        .map(new Func1<BillingRoleAssignmentInner, BillingRoleAssignment>() {
            @Override
            public BillingRoleAssignment call(BillingRoleAssignmentInner inner) {
                return new BillingRoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignmentListResult> listAsync(String billingAccountName, String billingProfileName) {
        BillingProfileBillingRoleAssignmentsInner client = this.inner();
        return client.listAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingRoleAssignmentListResultInner, BillingRoleAssignmentListResult>() {
            @Override
            public BillingRoleAssignmentListResult call(BillingRoleAssignmentListResultInner inner) {
                return new BillingRoleAssignmentListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleAssignmentListResult> addAsync(String billingAccountName, String billingProfileName) {
        BillingProfileBillingRoleAssignmentsInner client = this.inner();
        return client.addAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingRoleAssignmentListResultInner, BillingRoleAssignmentListResult>() {
            @Override
            public BillingRoleAssignmentListResult call(BillingRoleAssignmentListResultInner inner) {
                return new BillingRoleAssignmentListResultImpl(inner, manager());
            }
        });
    }

}
