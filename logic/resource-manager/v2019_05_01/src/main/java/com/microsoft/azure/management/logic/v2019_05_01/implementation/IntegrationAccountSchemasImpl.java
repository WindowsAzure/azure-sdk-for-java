/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountSchemas;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2019_05_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountSchema;

class IntegrationAccountSchemasImpl extends WrapperImpl<IntegrationAccountSchemasInner> implements IntegrationAccountSchemas {
    private final LogicManager manager;

    IntegrationAccountSchemasImpl(LogicManager manager) {
        super(manager.inner().integrationAccountSchemas());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountSchemaImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountSchemaImpl wrapModel(IntegrationAccountSchemaInner inner) {
        return  new IntegrationAccountSchemaImpl(inner, manager());
    }

    private IntegrationAccountSchemaImpl wrapModel(String name) {
        return new IntegrationAccountSchemaImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String schemaName, GetCallbackUrlParameters listContentCallbackUrl) {
        IntegrationAccountSchemasInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, schemaName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationAccountSchema> listAsync(final String resourceGroupName, final String integrationAccountName) {
        IntegrationAccountSchemasInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountSchemaInner>, Iterable<IntegrationAccountSchemaInner>>() {
            @Override
            public Iterable<IntegrationAccountSchemaInner> call(Page<IntegrationAccountSchemaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountSchemaInner, IntegrationAccountSchema>() {
            @Override
            public IntegrationAccountSchema call(IntegrationAccountSchemaInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountSchema> getAsync(String resourceGroupName, String integrationAccountName, String schemaName) {
        IntegrationAccountSchemasInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, schemaName)
        .map(new Func1<IntegrationAccountSchemaInner, IntegrationAccountSchema>() {
            @Override
            public IntegrationAccountSchema call(IntegrationAccountSchemaInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String schemaName) {
        IntegrationAccountSchemasInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, schemaName).toCompletable();
    }

}
