// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customproviders.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A route definition that defines an action or resource that can be interacted with through the custom resource
 * provider.
 */
@Fluent
public class CustomRPRouteDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRPRouteDefinition.class);

    /*
     * The name of the route definition. This becomes the name for the ARM
     * extension (e.g.
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}')
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The route definition endpoint URI that the custom resource provider will
     * proxy requests to. This can be in the form of a flat URI (e.g.
     * 'https://testendpoint/') or can specify to route via a path (e.g.
     * 'https://testendpoint/{requestPath}')
     */
    @JsonProperty(value = "endpoint", required = true)
    private String endpoint;

    /**
     * Get the name property: The name of the route definition. This becomes the name for the ARM extension (e.g.
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}').
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the route definition. This becomes the name for the ARM extension (e.g.
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}').
     *
     * @param name the name value to set.
     * @return the CustomRPRouteDefinition object itself.
     */
    public CustomRPRouteDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpoint property: The route definition endpoint URI that the custom resource provider will proxy
     * requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a
     * path (e.g. 'https://testendpoint/{requestPath}').
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The route definition endpoint URI that the custom resource provider will proxy
     * requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a
     * path (e.g. 'https://testendpoint/{requestPath}').
     *
     * @param endpoint the endpoint value to set.
     * @return the CustomRPRouteDefinition object itself.
     */
    public CustomRPRouteDefinition withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model CustomRPRouteDefinition"));
        }
        if (endpoint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endpoint in model CustomRPRouteDefinition"));
        }
    }
}
