// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridkubernetes.HybridKubernetesManager;
import com.azure.resourcemanager.hybridkubernetes.fluent.OperationsClient;
import com.azure.resourcemanager.hybridkubernetes.fluent.models.OperationInner;
import com.azure.resourcemanager.hybridkubernetes.models.Operation;
import com.azure.resourcemanager.hybridkubernetes.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final HybridKubernetesManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, HybridKubernetesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> get() {
        PagedIterable<OperationInner> inner = this.serviceClient().get();
        return Utils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> get(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().get(context);
        return Utils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private HybridKubernetesManager manager() {
        return this.serviceManager;
    }
}
