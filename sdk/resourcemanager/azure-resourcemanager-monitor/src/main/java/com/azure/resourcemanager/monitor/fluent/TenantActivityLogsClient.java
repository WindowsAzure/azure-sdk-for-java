// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.EventDataInner;

/** An instance of this class provides access to all the operations defined in TenantActivityLogsClient. */
public interface TenantActivityLogsClient {
    /**
     * Gets the Activity Logs for the Tenant.&lt;br&gt;Everything that is applicable to the API to get the Activity Logs
     * for the subscription is applicable to this API (the parameters, $filter, etc.).&lt;br&gt;One thing to point out
     * here is that this API does *not* retrieve the logs at the individual subscription of the tenant but only surfaces
     * the logs that were generated at the tenant level.
     *
     * @param filter Reduces the set of data collected. &lt;br&gt;The **$filter** is very restricted and allows only the
     *     following patterns.&lt;br&gt;- List events for a resource group: $filter=eventTimestamp ge '&lt;Start
     *     Time&gt;' and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin, Operation' and
     *     resourceGroupName eq '&lt;ResourceGroupName&gt;'.&lt;br&gt;- List events for resource: $filter=eventTimestamp
     *     ge '&lt;Start Time&gt;' and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin, Operation' and
     *     resourceUri eq '&lt;ResourceURI&gt;'.&lt;br&gt;- List events for a subscription: $filter=eventTimestamp ge
     *     '&lt;Start Time&gt;' and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin,
     *     Operation'.&lt;br&gt;- List events for a resource provider: $filter=eventTimestamp ge '&lt;Start Time&gt;'
     *     and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin, Operation' and resourceProvider eq
     *     '&lt;ResourceProviderName&gt;'.&lt;br&gt;- List events for a correlation Id:
     *     api-version=2014-04-01&amp;$filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and eventChannels eq 'Admin, Operation' and correlationId eq
     *     '&lt;CorrelationID&gt;'.&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Activity Logs for the Tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<EventDataInner> listAsync(String filter, String select);

    /**
     * Gets the Activity Logs for the Tenant.&lt;br&gt;Everything that is applicable to the API to get the Activity Logs
     * for the subscription is applicable to this API (the parameters, $filter, etc.).&lt;br&gt;One thing to point out
     * here is that this API does *not* retrieve the logs at the individual subscription of the tenant but only surfaces
     * the logs that were generated at the tenant level.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Activity Logs for the Tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<EventDataInner> listAsync();

    /**
     * Gets the Activity Logs for the Tenant.&lt;br&gt;Everything that is applicable to the API to get the Activity Logs
     * for the subscription is applicable to this API (the parameters, $filter, etc.).&lt;br&gt;One thing to point out
     * here is that this API does *not* retrieve the logs at the individual subscription of the tenant but only surfaces
     * the logs that were generated at the tenant level.
     *
     * @param filter Reduces the set of data collected. &lt;br&gt;The **$filter** is very restricted and allows only the
     *     following patterns.&lt;br&gt;- List events for a resource group: $filter=eventTimestamp ge '&lt;Start
     *     Time&gt;' and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin, Operation' and
     *     resourceGroupName eq '&lt;ResourceGroupName&gt;'.&lt;br&gt;- List events for resource: $filter=eventTimestamp
     *     ge '&lt;Start Time&gt;' and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin, Operation' and
     *     resourceUri eq '&lt;ResourceURI&gt;'.&lt;br&gt;- List events for a subscription: $filter=eventTimestamp ge
     *     '&lt;Start Time&gt;' and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin,
     *     Operation'.&lt;br&gt;- List events for a resource provider: $filter=eventTimestamp ge '&lt;Start Time&gt;'
     *     and eventTimestamp le '&lt;End Time&gt;' and eventChannels eq 'Admin, Operation' and resourceProvider eq
     *     '&lt;ResourceProviderName&gt;'.&lt;br&gt;- List events for a correlation Id:
     *     api-version=2014-04-01&amp;$filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and eventChannels eq 'Admin, Operation' and correlationId eq
     *     '&lt;CorrelationID&gt;'.&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Activity Logs for the Tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventDataInner> list(String filter, String select, Context context);

    /**
     * Gets the Activity Logs for the Tenant.&lt;br&gt;Everything that is applicable to the API to get the Activity Logs
     * for the subscription is applicable to this API (the parameters, $filter, etc.).&lt;br&gt;One thing to point out
     * here is that this API does *not* retrieve the logs at the individual subscription of the tenant but only surfaces
     * the logs that were generated at the tenant level.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Activity Logs for the Tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventDataInner> list();
}
