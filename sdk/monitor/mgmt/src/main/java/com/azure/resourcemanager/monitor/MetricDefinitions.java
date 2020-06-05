// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.monitor;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.resourcemanager.monitor.implementation.MonitorManager;
import com.azure.resourcemanager.monitor.models.MetricDefinitionsInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasManager;
import com.azure.resourcemanager.resources.fluentcore.model.HasInner;

/** Entry point for Monitor Metric Definitions API. */
public interface MetricDefinitions extends HasManager<MonitorManager>, HasInner<MetricDefinitionsInner> {

    /**
     * Lists Metric Definitions for a given resource.
     *
     * @param resourceId The resource Id.
     * @return list of metric definitions.
     */
    PagedIterable<MetricDefinition> listByResource(String resourceId);

    /**
     * Lists Metric Definitions for a given resource.
     *
     * @param resourceId The resource Id.
     * @return a representation of the deferred computation of Metric Definitions list call.
     */
    PagedFlux<MetricDefinition> listByResourceAsync(String resourceId);
}
