// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.fluent.ProviderRegistrationsClient;
import com.azure.resourcemanager.providerhub.fluent.models.OperationsDefinitionInner;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import com.azure.resourcemanager.providerhub.models.OperationsDefinition;
import com.azure.resourcemanager.providerhub.models.ProviderRegistration;
import com.azure.resourcemanager.providerhub.models.ProviderRegistrations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ProviderRegistrationsImpl implements ProviderRegistrations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderRegistrationsImpl.class);

    private final ProviderRegistrationsClient innerClient;

    private final com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager;

    public ProviderRegistrationsImpl(
        ProviderRegistrationsClient innerClient,
        com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProviderRegistration get(String providerNamespace) {
        ProviderRegistrationInner inner = this.serviceClient().get(providerNamespace);
        if (inner != null) {
            return new ProviderRegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProviderRegistration> getWithResponse(String providerNamespace, Context context) {
        Response<ProviderRegistrationInner> inner = this.serviceClient().getWithResponse(providerNamespace, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderRegistrationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProviderRegistration createOrUpdate(String providerNamespace, ProviderRegistrationInner properties) {
        ProviderRegistrationInner inner = this.serviceClient().createOrUpdate(providerNamespace, properties);
        if (inner != null) {
            return new ProviderRegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProviderRegistration createOrUpdate(
        String providerNamespace, ProviderRegistrationInner properties, Context context) {
        ProviderRegistrationInner inner = this.serviceClient().createOrUpdate(providerNamespace, properties, context);
        if (inner != null) {
            return new ProviderRegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String providerNamespace) {
        this.serviceClient().delete(providerNamespace);
    }

    public Response<Void> deleteWithResponse(String providerNamespace, Context context) {
        return this.serviceClient().deleteWithResponse(providerNamespace, context);
    }

    public PagedIterable<ProviderRegistration> list() {
        PagedIterable<ProviderRegistrationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ProviderRegistrationImpl(inner1, this.manager()));
    }

    public PagedIterable<ProviderRegistration> list(Context context) {
        PagedIterable<ProviderRegistrationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ProviderRegistrationImpl(inner1, this.manager()));
    }

    public List<OperationsDefinition> generateOperations(String providerNamespace) {
        List<OperationsDefinitionInner> inner = this.serviceClient().generateOperations(providerNamespace);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new OperationsDefinitionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<OperationsDefinition>> generateOperationsWithResponse(
        String providerNamespace, Context context) {
        Response<List<OperationsDefinitionInner>> inner =
            this.serviceClient().generateOperationsWithResponse(providerNamespace, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new OperationsDefinitionImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    private ProviderRegistrationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.providerhub.ProviderHubManager manager() {
        return this.serviceManager;
    }
}
