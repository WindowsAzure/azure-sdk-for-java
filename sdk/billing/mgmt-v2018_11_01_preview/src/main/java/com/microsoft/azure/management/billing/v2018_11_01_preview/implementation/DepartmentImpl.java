/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.Department;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.ArrayList;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccount;
import java.util.List;

class DepartmentImpl extends IndexableRefreshableWrapperImpl<Department, DepartmentInner> implements Department {
    private final BillingManager manager;
    private String billingAccountName;
    private String departmentName;

    DepartmentImpl(DepartmentInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.departmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "departments");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DepartmentInner> getInnerAsync() {
        DepartmentsInner client = this.manager().inner().departments();
        return client.getAsync(this.billingAccountName, this.departmentName);
    }



    @Override
    public String costCenter() {
        return this.inner().costCenter();
    }

    @Override
    public String departmentName() {
        return this.inner().departmentName();
    }

    @Override
    public List<EnrollmentAccount> enrollmentAccounts() {
        List<EnrollmentAccount> lst = new ArrayList<EnrollmentAccount>();
        if (this.inner().enrollmentAccounts() != null) {
            for (EnrollmentAccountInner inner : this.inner().enrollmentAccounts()) {
                lst.add( new EnrollmentAccountImpl(inner, manager()));
            }
        }
        return lst;
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
    public String status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
