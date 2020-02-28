/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingRoleAssignment;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class BillingRoleAssignmentImpl extends IndexableRefreshableWrapperImpl<BillingRoleAssignment, BillingRoleAssignmentInner> implements BillingRoleAssignment {
    private final BillingManager manager;
    private String billingAccountName;
    private String billingRoleAssignmentName;

    BillingRoleAssignmentImpl(BillingRoleAssignmentInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.billingRoleAssignmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingRoleAssignments");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BillingRoleAssignmentInner> getInnerAsync() {
        BillingRoleAssignmentsInner client = this.manager().inner().billingRoleAssignments();
        return client.getByBillingAccountAsync(this.billingAccountName, this.billingRoleAssignmentName);
    }



    @Override
    public String billingRoleAssignmentName() {
        return this.inner().billingRoleAssignmentName();
    }

    @Override
    public String createdByPrincipalId() {
        return this.inner().createdByPrincipalId();
    }

    @Override
    public String createdByPrincipalTenantId() {
        return this.inner().createdByPrincipalTenantId();
    }

    @Override
    public String createdOn() {
        return this.inner().createdOn();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String principalId() {
        return this.inner().principalId();
    }

    @Override
    public String roleDefinitionName() {
        return this.inner().roleDefinitionName();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
