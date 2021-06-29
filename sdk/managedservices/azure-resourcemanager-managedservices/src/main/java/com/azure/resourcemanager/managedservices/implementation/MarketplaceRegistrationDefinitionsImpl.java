// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedservices.fluent.MarketplaceRegistrationDefinitionsClient;
import com.azure.resourcemanager.managedservices.fluent.models.MarketplaceRegistrationDefinitionInner;
import com.azure.resourcemanager.managedservices.models.MarketplaceRegistrationDefinition;
import com.azure.resourcemanager.managedservices.models.MarketplaceRegistrationDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MarketplaceRegistrationDefinitionsImpl implements MarketplaceRegistrationDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MarketplaceRegistrationDefinitionsImpl.class);

    private final MarketplaceRegistrationDefinitionsClient innerClient;

    private final com.azure.resourcemanager.managedservices.ManagedServicesManager serviceManager;

    public MarketplaceRegistrationDefinitionsImpl(
        MarketplaceRegistrationDefinitionsClient innerClient,
        com.azure.resourcemanager.managedservices.ManagedServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MarketplaceRegistrationDefinition> list(String scope) {
        PagedIterable<MarketplaceRegistrationDefinitionInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new MarketplaceRegistrationDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<MarketplaceRegistrationDefinition> list(String scope, String filter, Context context) {
        PagedIterable<MarketplaceRegistrationDefinitionInner> inner = this.serviceClient().list(scope, filter, context);
        return Utils.mapPage(inner, inner1 -> new MarketplaceRegistrationDefinitionImpl(inner1, this.manager()));
    }

    public MarketplaceRegistrationDefinition get(String scope, String marketplaceIdentifier) {
        MarketplaceRegistrationDefinitionInner inner = this.serviceClient().get(scope, marketplaceIdentifier);
        if (inner != null) {
            return new MarketplaceRegistrationDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MarketplaceRegistrationDefinition> getWithResponse(
        String scope, String marketplaceIdentifier, Context context) {
        Response<MarketplaceRegistrationDefinitionInner> inner =
            this.serviceClient().getWithResponse(scope, marketplaceIdentifier, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MarketplaceRegistrationDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private MarketplaceRegistrationDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managedservices.ManagedServicesManager manager() {
        return this.serviceManager;
    }
}
