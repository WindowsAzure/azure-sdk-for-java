// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.OperationsClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.OperationEntityInner;
import com.azure.resourcemanager.cognitiveservices.models.OperationEntity;
import com.azure.resourcemanager.cognitiveservices.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationEntity> list() {
        PagedIterable<OperationEntityInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationEntity> list(Context context) {
        PagedIterable<OperationEntityInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OperationEntityImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
