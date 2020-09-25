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
import com.microsoft.azure.management.billing.v2019_10_01_preview.RoleAssignments;

class RoleAssignmentsImpl extends WrapperImpl<RoleAssignmentsInner> implements RoleAssignments {
    private final BillingManager manager;

    RoleAssignmentsImpl(BillingManager manager) {
        super(manager.inner().roleAssignments());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl define(String name) {
        return wrapModel(name);
    }

    private BillingAccountBillingRoleAssignmentModelImpl wrapModel(BillingRoleAssignmentInner inner) {
        return  new BillingAccountBillingRoleAssignmentModelImpl(inner, manager());
    }

    private BillingAccountBillingRoleAssignmentModelImpl wrapModel(String name) {
        return new BillingAccountBillingRoleAssignmentModelImpl(name, this.manager());
    }

}
