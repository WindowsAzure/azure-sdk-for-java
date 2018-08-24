/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Tasks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Task;

class TasksImpl extends WrapperImpl<TasksInner> implements Tasks {
    private final ContainerRegistryManager manager;

    TasksImpl(ContainerRegistryManager manager) {
        super(manager.inner().tasks());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public TaskImpl define(String name) {
        return wrapModel(name);
    }

    private TaskImpl wrapModel(TaskInner inner) {
        return  new TaskImpl(inner, manager());
    }

    private TaskImpl wrapModel(String name) {
        return new TaskImpl(name, this.manager());
    }

    @Override
    public Observable<Task> getDetailsAsync(String resourceGroupName, String registryName, String taskName) {
        TasksInner client = this.inner();
        return client.getDetailsAsync(resourceGroupName, registryName, taskName)
        .map(new Func1<TaskInner, Task>() {
            @Override
            public Task call(TaskInner inner) {
                return new TaskImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Task> listAsync(final String resourceGroupName, final String registryName) {
        TasksInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<TaskInner>, Iterable<TaskInner>>() {
            @Override
            public Iterable<TaskInner> call(Page<TaskInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TaskInner, Task>() {
            @Override
            public Task call(TaskInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Task> getAsync(String resourceGroupName, String registryName, String taskName) {
        TasksInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, taskName)
        .map(new Func1<TaskInner, Task>() {
            @Override
            public Task call(TaskInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String taskName) {
        TasksInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, taskName).toCompletable();
    }

}
