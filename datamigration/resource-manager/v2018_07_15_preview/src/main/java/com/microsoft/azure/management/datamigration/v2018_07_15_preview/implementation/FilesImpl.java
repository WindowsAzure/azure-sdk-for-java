/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.Files;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.FileStorageInfo;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.ProjectFile;

class FilesImpl extends WrapperImpl<FilesInner> implements Files {
    private final DataMigrationManager manager;

    FilesImpl(DataMigrationManager manager) {
        super(manager.inner().files());
        this.manager = manager;
    }

    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public ProjectFileImpl define(String name) {
        return wrapModel(name);
    }

    private ProjectFileImpl wrapModel(ProjectFileInner inner) {
        return  new ProjectFileImpl(inner, manager());
    }

    private ProjectFileImpl wrapModel(String name) {
        return new ProjectFileImpl(name, this.manager());
    }

    @Override
    public Observable<FileStorageInfo> readAsync(String groupName, String serviceName, String projectName, String fileName) {
        FilesInner client = this.inner();
        return client.readAsync(groupName, serviceName, projectName, fileName)
        .map(new Func1<FileStorageInfoInner, FileStorageInfo>() {
            @Override
            public FileStorageInfo call(FileStorageInfoInner inner) {
                return new FileStorageInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<FileStorageInfo> readWriteAsync(String groupName, String serviceName, String projectName, String fileName) {
        FilesInner client = this.inner();
        return client.readWriteAsync(groupName, serviceName, projectName, fileName)
        .map(new Func1<FileStorageInfoInner, FileStorageInfo>() {
            @Override
            public FileStorageInfo call(FileStorageInfoInner inner) {
                return new FileStorageInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProjectFile> listAsync(final String groupName, final String serviceName, final String projectName) {
        FilesInner client = this.inner();
        return client.listAsync(groupName, serviceName, projectName)
        .flatMapIterable(new Func1<Page<ProjectFileInner>, Iterable<ProjectFileInner>>() {
            @Override
            public Iterable<ProjectFileInner> call(Page<ProjectFileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProjectFileInner, ProjectFile>() {
            @Override
            public ProjectFile call(ProjectFileInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ProjectFile> getAsync(String groupName, String serviceName, String projectName, String fileName) {
        FilesInner client = this.inner();
        return client.getAsync(groupName, serviceName, projectName, fileName)
        .map(new Func1<ProjectFileInner, ProjectFile>() {
            @Override
            public ProjectFile call(ProjectFileInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String groupName, String serviceName, String projectName, String fileName) {
        FilesInner client = this.inner();
        return client.deleteAsync(groupName, serviceName, projectName, fileName).toCompletable();
    }

}
