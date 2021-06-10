// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.experimental.http.DynamicRequest;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.ObjectSerializer;

/** Initializes a new instance of the AttachmentsBaseClient type. */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class AttachmentsBaseClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    private final ObjectSerializer serializer;

    /**
     * Initializes an instance of AttachmentsBaseClient client.
     *
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example:
     *     https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializer The serializer to serialize an object into a string.
     */
    AttachmentsBaseClient(String endpoint, String apiVersion, HttpPipeline httpPipeline, ObjectSerializer serializer) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
    }

    /**
     * Returns a paginated list of attachment resources under a particular farmer.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>resourceIds</td><td>List&lt;String&gt;</td><td>Resource Ids of the resource.</td></tr>
     *     <tr><td>resourceTypes</td><td>List&lt;String&gt;</td><td>Resource Types of the resource.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>Ids of the resource.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>Names of the resource.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}".</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>Statuses of the resource.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             farmerId: String
     *             resourceId: String
     *             resourceType: String
     *             originalFileName: String
     *             id: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             eTag: String
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param farmerId ID of the associated farmer.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listByFarmerId(String farmerId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/attachments")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Gets a specified attachment resource under a particular farmer.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     originalFileName: String
     *     id: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     eTag: String
     * }
     * }</pre>
     *
     * @param farmerId ID of the associated farmer.
     * @param attachmentId ID of the attachment.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest get(String farmerId, String attachmentId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/attachments/{attachmentId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("attachmentId", attachmentId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Creates or updates an attachment resource under a particular farmer.
     *
     * <p><strong>Optional Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>contentLength</td><td>Long</td><td>The contentLength parameter</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Flux<ByteBuffer>
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     originalFileName: String
     *     id: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     eTag: String
     * }
     * }</pre>
     *
     * @param farmerId ID of the associated farmer resource.
     * @param attachmentId ID of the attachment resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createOrUpdate(String farmerId, String attachmentId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/attachments/{attachmentId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("attachmentId", attachmentId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "multipart/form-data")
                .setHttpMethod(HttpMethod.PATCH);
    }

    /**
     * Deletes a specified attachment resource under a particular farmer.
     *
     * @param farmerId ID of the farmer.
     * @param attachmentId ID of the attachment.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest delete(String farmerId, String attachmentId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/attachments/{attachmentId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("attachmentId", attachmentId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.DELETE);
    }

    /**
     * Downloads and returns attachment as response for the given input filePath.
     *
     * @param farmerId ID of the associated farmer.
     * @param attachmentId ID of attachment to be downloaded.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest download(String farmerId, String attachmentId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/attachments/{attachmentId}/file")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("attachmentId", attachmentId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/octet-stream, application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             farmerId: String
     *             resourceId: String
     *             resourceType: String
     *             originalFileName: String
     *             id: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             eTag: String
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listByFarmerIdNext(String nextLink) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/{nextLink}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("nextLink", nextLink)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Create an empty DynamicRequest with the serializer and pipeline initialized for this client.
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest invoke() {
        return new DynamicRequest(serializer, httpPipeline);
    }
}
