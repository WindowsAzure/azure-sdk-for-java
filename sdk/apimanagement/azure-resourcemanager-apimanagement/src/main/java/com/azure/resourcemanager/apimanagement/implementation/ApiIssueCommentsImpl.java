// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ApiIssueCommentsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueCommentContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiIssueComments;
import com.azure.resourcemanager.apimanagement.models.IssueCommentContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApiIssueCommentsImpl implements ApiIssueComments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiIssueCommentsImpl.class);

    private final ApiIssueCommentsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ApiIssueCommentsImpl(
        ApiIssueCommentsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IssueCommentContract> listByService(
        String resourceGroupName, String serviceName, String apiId, String issueId) {
        PagedIterable<IssueCommentContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, apiId, issueId);
        return Utils.mapPage(inner, inner1 -> new IssueCommentContractImpl(inner1, this.manager()));
    }

    public PagedIterable<IssueCommentContract> listByService(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<IssueCommentContractInner> inner =
            this
                .serviceClient()
                .listByService(resourceGroupName, serviceName, apiId, issueId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new IssueCommentContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(
        String resourceGroupName, String serviceName, String apiId, String issueId, String commentId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, apiId, issueId, commentId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, String issueId, String commentId, Context context) {
        return this
            .serviceClient()
            .getEntityTagWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, context);
    }

    public IssueCommentContract get(
        String resourceGroupName, String serviceName, String apiId, String issueId, String commentId) {
        IssueCommentContractInner inner =
            this.serviceClient().get(resourceGroupName, serviceName, apiId, issueId, commentId);
        if (inner != null) {
            return new IssueCommentContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IssueCommentContract> getWithResponse(
        String resourceGroupName, String serviceName, String apiId, String issueId, String commentId, Context context) {
        Response<IssueCommentContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IssueCommentContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String serviceName, String apiId, String issueId, String commentId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, apiId, issueId, commentId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String commentId,
        String ifMatch,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, ifMatch, context);
    }

    public IssueCommentContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        String commentId = Utils.getValueFromIdByName(id, "comments");
        if (commentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'comments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, Context.NONE).getValue();
    }

    public Response<IssueCommentContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        String commentId = Utils.getValueFromIdByName(id, "comments");
        if (commentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'comments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        String commentId = Utils.getValueFromIdByName(id, "comments");
        if (commentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'comments'.", id)));
        }
        String localIfMatch = null;
        this
            .deleteWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, localIfMatch, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        String commentId = Utils.getValueFromIdByName(id, "comments");
        if (commentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'comments'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, apiId, issueId, commentId, ifMatch, context);
    }

    private ApiIssueCommentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public IssueCommentContractImpl define(String name) {
        return new IssueCommentContractImpl(name, this.manager());
    }
}
