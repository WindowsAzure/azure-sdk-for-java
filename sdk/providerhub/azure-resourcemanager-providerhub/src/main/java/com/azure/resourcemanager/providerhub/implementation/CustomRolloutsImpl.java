// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.CustomRolloutsClient;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutInner;
import com.azure.resourcemanager.providerhub.models.CustomRollout;
import com.azure.resourcemanager.providerhub.models.CustomRollouts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CustomRolloutsImpl implements CustomRollouts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRolloutsImpl.class);

    private final CustomRolloutsClient innerClient;

    private final ProviderhubManager serviceManager;

    public CustomRolloutsImpl(CustomRolloutsClient innerClient, ProviderhubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CustomRollout get(String providerNamespace, String rolloutName) {
        CustomRolloutInner inner = this.serviceClient().get(providerNamespace, rolloutName);
        if (inner != null) {
            return new CustomRolloutImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CustomRollout> getWithResponse(String providerNamespace, String rolloutName, Context context) {
        Response<CustomRolloutInner> inner =
            this.serviceClient().getWithResponse(providerNamespace, rolloutName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomRolloutImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CustomRollout> listByProviderRegistration(String providerNamespace) {
        PagedIterable<CustomRolloutInner> inner = this.serviceClient().listByProviderRegistration(providerNamespace);
        return Utils.mapPage(inner, inner1 -> new CustomRolloutImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomRollout> listByProviderRegistration(String providerNamespace, Context context) {
        PagedIterable<CustomRolloutInner> inner =
            this.serviceClient().listByProviderRegistration(providerNamespace, context);
        return Utils.mapPage(inner, inner1 -> new CustomRolloutImpl(inner1, this.manager()));
    }

    public CustomRollout getById(String id) {
        String providerNamespace = Utils.getValueFromIdByName(id, "providerRegistrations");
        if (providerNamespace == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'providerRegistrations'.",
                                id)));
        }
        String rolloutName = Utils.getValueFromIdByName(id, "customRollouts");
        if (rolloutName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'customRollouts'.", id)));
        }
        return this.getWithResponse(providerNamespace, rolloutName, Context.NONE).getValue();
    }

    public Response<CustomRollout> getByIdWithResponse(String id, Context context) {
        String providerNamespace = Utils.getValueFromIdByName(id, "providerRegistrations");
        if (providerNamespace == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'providerRegistrations'.",
                                id)));
        }
        String rolloutName = Utils.getValueFromIdByName(id, "customRollouts");
        if (rolloutName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'customRollouts'.", id)));
        }
        return this.getWithResponse(providerNamespace, rolloutName, context);
    }

    private CustomRolloutsClient serviceClient() {
        return this.innerClient;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }

    public CustomRolloutImpl define(String name) {
        return new CustomRolloutImpl(name, this.manager());
    }
}
