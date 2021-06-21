// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner;

/** An instance of this class provides access to all the operations defined in ActivityLogsClient. */
public interface ActivityLogsClient {
    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventDataInner> list(String filter);

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventDataInner> list(String filter, String select, Context context);
}
