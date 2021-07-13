// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.MetricDefinitionInner;

/** An instance of this class provides access to all the operations defined in MetricDefinitionsClient. */
public interface MetricDefinitionsClient {
    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MetricDefinitionInner> listAsync(String resourceUri, String metricnamespace);

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MetricDefinitionInner> listAsync(String resourceUri);

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricDefinitionInner> list(String resourceUri);

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricDefinitionInner> list(String resourceUri, String metricnamespace, Context context);
}
