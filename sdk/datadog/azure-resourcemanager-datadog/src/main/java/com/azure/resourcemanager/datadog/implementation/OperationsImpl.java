// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.fluent.OperationsClient;
import com.azure.resourcemanager.datadog.fluent.models.OperationResultInner;
import com.azure.resourcemanager.datadog.models.OperationResult;
import com.azure.resourcemanager.datadog.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final MicrosoftDatadogManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, MicrosoftDatadogManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationResult> list() {
        PagedIterable<OperationResultInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new OperationResultImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationResult> list(Context context) {
        PagedIterable<OperationResultInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new OperationResultImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }
}
