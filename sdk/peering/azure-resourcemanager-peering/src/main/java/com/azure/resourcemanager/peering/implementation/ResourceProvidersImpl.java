// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.peering.models.CheckServiceProviderAvailabilityInput;
import com.azure.resourcemanager.peering.models.Enum0;
import com.azure.resourcemanager.peering.models.ResourceProviders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Enum0 checkServiceProviderAvailability(
        CheckServiceProviderAvailabilityInput checkServiceProviderAvailabilityInput) {
        return this.serviceClient().checkServiceProviderAvailability(checkServiceProviderAvailabilityInput);
    }

    public Response<Enum0> checkServiceProviderAvailabilityWithResponse(
        CheckServiceProviderAvailabilityInput checkServiceProviderAvailabilityInput, Context context) {
        return this
            .serviceClient()
            .checkServiceProviderAvailabilityWithResponse(checkServiceProviderAvailabilityInput, context);
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }
}
