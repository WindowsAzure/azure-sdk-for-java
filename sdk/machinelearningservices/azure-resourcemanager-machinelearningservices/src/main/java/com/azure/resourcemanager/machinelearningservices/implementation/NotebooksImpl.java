// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.NotebooksClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ListNotebookKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.NotebookResourceInfoInner;
import com.azure.resourcemanager.machinelearningservices.models.ListNotebookKeysResult;
import com.azure.resourcemanager.machinelearningservices.models.NotebookResourceInfo;
import com.azure.resourcemanager.machinelearningservices.models.Notebooks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NotebooksImpl implements Notebooks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotebooksImpl.class);

    private final NotebooksClient innerClient;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    public NotebooksImpl(
        NotebooksClient innerClient,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NotebookResourceInfo prepare(String resourceGroupName, String workspaceName) {
        NotebookResourceInfoInner inner = this.serviceClient().prepare(resourceGroupName, workspaceName);
        if (inner != null) {
            return new NotebookResourceInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NotebookResourceInfo prepare(String resourceGroupName, String workspaceName, Context context) {
        NotebookResourceInfoInner inner = this.serviceClient().prepare(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new NotebookResourceInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ListNotebookKeysResult listKeys(String resourceGroupName, String workspaceName) {
        ListNotebookKeysResultInner inner = this.serviceClient().listKeys(resourceGroupName, workspaceName);
        if (inner != null) {
            return new ListNotebookKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListNotebookKeysResult> listKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<ListNotebookKeysResultInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListNotebookKeysResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NotebooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
