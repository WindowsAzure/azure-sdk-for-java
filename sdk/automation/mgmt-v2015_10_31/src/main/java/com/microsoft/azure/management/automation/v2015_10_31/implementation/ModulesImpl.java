/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.Modules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.automation.v2015_10_31.Module;

class ModulesImpl extends WrapperImpl<ModulesInner> implements Modules {
    private final AutomationManager manager;

    ModulesImpl(AutomationManager manager) {
        super(manager.inner().modules());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public ModuleImpl define(String name) {
        return wrapModel(name);
    }

    private ModuleImpl wrapModel(ModuleInner inner) {
        return  new ModuleImpl(inner, manager());
    }

    private ModuleImpl wrapModel(String name) {
        return new ModuleImpl(name, this.manager());
    }

    @Override
    public Observable<Module> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName) {
        ModulesInner client = this.inner();
        return client.listByAutomationAccountAsync(resourceGroupName, automationAccountName)
        .flatMapIterable(new Func1<Page<ModuleInner>, Iterable<ModuleInner>>() {
            @Override
            public Iterable<ModuleInner> call(Page<ModuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ModuleInner, Module>() {
            @Override
            public Module call(ModuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Module> getAsync(String resourceGroupName, String automationAccountName, String moduleName) {
        ModulesInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, moduleName)
        .map(new Func1<ModuleInner, Module>() {
            @Override
            public Module call(ModuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String automationAccountName, String moduleName) {
        ModulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, automationAccountName, moduleName).toCompletable();
    }

}
