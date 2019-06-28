/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiIssueComments;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.IssueCommentContract;

class ApiIssueCommentsImpl extends WrapperImpl<ApiIssueCommentsInner> implements ApiIssueComments {
    private final ApiManagementManager manager;

    ApiIssueCommentsImpl(ApiManagementManager manager) {
        super(manager.inner().apiIssueComments());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public IssueCommentContractImpl define(String name) {
        return wrapModel(name);
    }

    private IssueCommentContractImpl wrapModel(IssueCommentContractInner inner) {
        return  new IssueCommentContractImpl(inner, manager());
    }

    private IssueCommentContractImpl wrapModel(String name) {
        return new IssueCommentContractImpl(name, this.manager());
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String issueId, String commentId) {
        ApiIssueCommentsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId, issueId, commentId).toCompletable();
    }

    @Override
    public Observable<IssueCommentContract> listByServiceAsync(final String resourceGroupName, final String serviceName, final String apiId, final String issueId) {
        ApiIssueCommentsInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName, apiId, issueId)
        .flatMapIterable(new Func1<Page<IssueCommentContractInner>, Iterable<IssueCommentContractInner>>() {
            @Override
            public Iterable<IssueCommentContractInner> call(Page<IssueCommentContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IssueCommentContractInner, IssueCommentContract>() {
            @Override
            public IssueCommentContract call(IssueCommentContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IssueCommentContract> getAsync(String resourceGroupName, String serviceName, String apiId, String issueId, String commentId) {
        ApiIssueCommentsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId, issueId, commentId)
        .map(new Func1<IssueCommentContractInner, IssueCommentContract>() {
            @Override
            public IssueCommentContract call(IssueCommentContractInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String issueId, String commentId, String ifMatch) {
        ApiIssueCommentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, issueId, commentId, ifMatch).toCompletable();
    }

}
