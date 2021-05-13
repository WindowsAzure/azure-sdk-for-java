// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.ComponentCurrentBillingFeaturesClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentBillingFeaturesInner;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentBillingFeatures;
import com.azure.resourcemanager.applicationinsights.models.ComponentCurrentBillingFeatures;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ComponentCurrentBillingFeaturesImpl implements ComponentCurrentBillingFeatures {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComponentCurrentBillingFeaturesImpl.class);

    private final ComponentCurrentBillingFeaturesClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public ComponentCurrentBillingFeaturesImpl(
        ComponentCurrentBillingFeaturesClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ApplicationInsightsComponentBillingFeatures get(String resourceGroupName, String resourceName) {
        ApplicationInsightsComponentBillingFeaturesInner inner =
            this.serviceClient().get(resourceGroupName, resourceName);
        if (inner != null) {
            return new ApplicationInsightsComponentBillingFeaturesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentBillingFeatures> getWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<ApplicationInsightsComponentBillingFeaturesInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentBillingFeaturesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentBillingFeatures update(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        ApplicationInsightsComponentBillingFeaturesInner inner =
            this.serviceClient().update(resourceGroupName, resourceName, billingFeaturesProperties);
        if (inner != null) {
            return new ApplicationInsightsComponentBillingFeaturesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentBillingFeatures> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties,
        Context context) {
        Response<ApplicationInsightsComponentBillingFeaturesInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, resourceName, billingFeaturesProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentBillingFeaturesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ComponentCurrentBillingFeaturesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
