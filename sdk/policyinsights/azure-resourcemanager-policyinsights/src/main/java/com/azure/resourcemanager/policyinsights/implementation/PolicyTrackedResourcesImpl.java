// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.fluent.PolicyTrackedResourcesClient;
import com.azure.resourcemanager.policyinsights.fluent.models.PolicyTrackedResourceInner;
import com.azure.resourcemanager.policyinsights.models.PolicyTrackedResource;
import com.azure.resourcemanager.policyinsights.models.PolicyTrackedResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PolicyTrackedResourcesImpl implements PolicyTrackedResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyTrackedResourcesImpl.class);

    private final PolicyTrackedResourcesClient innerClient;

    private final com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager;

    public PolicyTrackedResourcesImpl(
        PolicyTrackedResourcesClient innerClient,
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForManagementGroup(String managementGroupName) {
        PagedIterable<PolicyTrackedResourceInner> inner =
            this.serviceClient().listQueryResultsForManagementGroup(managementGroupName);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForManagementGroup(
        String managementGroupName, Integer top, String filter, Context context) {
        PagedIterable<PolicyTrackedResourceInner> inner =
            this.serviceClient().listQueryResultsForManagementGroup(managementGroupName, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForSubscription() {
        PagedIterable<PolicyTrackedResourceInner> inner = this.serviceClient().listQueryResultsForSubscription();
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForSubscription(
        Integer top, String filter, Context context) {
        PagedIterable<PolicyTrackedResourceInner> inner =
            this.serviceClient().listQueryResultsForSubscription(top, filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForResourceGroup(String resourceGroupName) {
        PagedIterable<PolicyTrackedResourceInner> inner =
            this.serviceClient().listQueryResultsForResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForResourceGroup(
        String resourceGroupName, Integer top, String filter, Context context) {
        PagedIterable<PolicyTrackedResourceInner> inner =
            this.serviceClient().listQueryResultsForResourceGroup(resourceGroupName, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForResource(String resourceId) {
        PagedIterable<PolicyTrackedResourceInner> inner = this.serviceClient().listQueryResultsForResource(resourceId);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyTrackedResource> listQueryResultsForResource(
        String resourceId, Integer top, String filter, Context context) {
        PagedIterable<PolicyTrackedResourceInner> inner =
            this.serviceClient().listQueryResultsForResource(resourceId, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyTrackedResourceImpl(inner1, this.manager()));
    }

    private PolicyTrackedResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager() {
        return this.serviceManager;
    }
}
