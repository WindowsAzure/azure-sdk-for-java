// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicTypeInfoInner;

/** An instance of this class provides access to all the operations defined in TopicTypesClient. */
public interface TopicTypesClient {
    /**
     * List all registered topic types.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Topic Types operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopicTypeInfoInner> list();

    /**
     * List all registered topic types.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Topic Types operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopicTypeInfoInner> list(Context context);

    /**
     * Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a topic type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopicTypeInfoInner get(String topicTypeName);

    /**
     * Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a topic type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TopicTypeInfoInner> getWithResponse(String topicTypeName, Context context);

    /**
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Types operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventTypeInner> listEventTypes(String topicTypeName);

    /**
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Types operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventTypeInner> listEventTypes(String topicTypeName, Context context);
}
