/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.DenyAssignments;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.DenyAssignment;

class DenyAssignmentsImpl extends WrapperImpl<DenyAssignmentsInner> implements DenyAssignments {
    private final AuthorizationManager manager;

    DenyAssignmentsImpl(AuthorizationManager manager) {
        super(manager.inner().denyAssignments());
        this.manager = manager;
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DenyAssignment> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName) {
        DenyAssignmentsInner client = this.inner();
        return client.listForResourceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName)
        .flatMapIterable(new Func1<Page<DenyAssignmentInner>, Iterable<DenyAssignmentInner>>() {
            @Override
            public Iterable<DenyAssignmentInner> call(Page<DenyAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DenyAssignmentInner, DenyAssignment>() {
            @Override
            public DenyAssignment call(DenyAssignmentInner inner) {
                return new DenyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DenyAssignment> getAsync(String scope, String denyAssignmentId) {
        DenyAssignmentsInner client = this.inner();
        return client.getAsync(scope, denyAssignmentId)
        .map(new Func1<DenyAssignmentInner, DenyAssignment>() {
            @Override
            public DenyAssignment call(DenyAssignmentInner inner) {
                return new DenyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DenyAssignment> getByIdAsync(String denyAssignmentId) {
        DenyAssignmentsInner client = this.inner();
        return client.getByIdAsync(denyAssignmentId)
        .map(new Func1<DenyAssignmentInner, DenyAssignment>() {
            @Override
            public DenyAssignment call(DenyAssignmentInner inner) {
                return new DenyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DenyAssignment> listByResourceGroupAsync(final String resourceGroupName) {
        DenyAssignmentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DenyAssignmentInner>, Iterable<DenyAssignmentInner>>() {
            @Override
            public Iterable<DenyAssignmentInner> call(Page<DenyAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DenyAssignmentInner, DenyAssignment>() {
            @Override
            public DenyAssignment call(DenyAssignmentInner inner) {
                return new DenyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DenyAssignment> listAsync() {
        DenyAssignmentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DenyAssignmentInner>, Iterable<DenyAssignmentInner>>() {
            @Override
            public Iterable<DenyAssignmentInner> call(Page<DenyAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DenyAssignmentInner, DenyAssignment>() {
            @Override
            public DenyAssignment call(DenyAssignmentInner inner) {
                return new DenyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DenyAssignment> listForScopeAsync(final String scope) {
        DenyAssignmentsInner client = this.inner();
        return client.listForScopeAsync(scope)
        .flatMapIterable(new Func1<Page<DenyAssignmentInner>, Iterable<DenyAssignmentInner>>() {
            @Override
            public Iterable<DenyAssignmentInner> call(Page<DenyAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DenyAssignmentInner, DenyAssignment>() {
            @Override
            public DenyAssignment call(DenyAssignmentInner inner) {
                return new DenyAssignmentImpl(inner, manager());
            }
        });
    }

}
