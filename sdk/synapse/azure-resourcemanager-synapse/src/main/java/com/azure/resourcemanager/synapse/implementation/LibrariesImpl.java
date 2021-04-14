// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.LibrariesClient;
import com.azure.resourcemanager.synapse.fluent.models.LibraryResourceInner;
import com.azure.resourcemanager.synapse.models.Libraries;
import com.azure.resourcemanager.synapse.models.LibraryResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LibrariesImpl implements Libraries {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LibrariesImpl.class);

    private final LibrariesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public LibrariesImpl(LibrariesClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LibraryResource get(String resourceGroupName, String libraryName, String workspaceName) {
        LibraryResourceInner inner = this.serviceClient().get(resourceGroupName, libraryName, workspaceName);
        if (inner != null) {
            return new LibraryResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LibraryResource> getWithResponse(
        String resourceGroupName, String libraryName, String workspaceName, Context context) {
        Response<LibraryResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, libraryName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LibraryResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LibrariesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
