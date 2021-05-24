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

/** Initializes a new instance of the CropsBaseClient type. */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class CropsBaseClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    private final ObjectSerializer serializer;

    /**
     * Initializes an instance of CropsBaseClient client.
     *
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example:
     *     https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializer The serializer to serialize an object into a string.
     */
    CropsBaseClient(String endpoint, String apiVersion, HttpPipeline httpPipeline, ObjectSerializer serializer) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
    }

    /**
     * Returns a paginated list of crop resources.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>phenotypes</td><td>List&lt;String&gt;</td><td>Crop phenotypes of the resource.</td></tr>
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
     *             phenotype: String
     *             id: String
     *             eTag: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             properties: {
     *                 String: Object
     *             }
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest list() {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/crops")
                .setPathParam("Endpoint", endpoint)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Gets a specified crop resource.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     phenotype: String
     *     id: String
     *     eTag: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * @param cropId Id of the crop.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest get(String cropId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/crops/{cropId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("cropId", cropId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Creates or updates a crop resource.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     phenotype: String
     *     id: String
     *     eTag: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param cropId Id of the crop resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createOrUpdate(String cropId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/crops/{cropId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("cropId", cropId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/merge-patch+json")
                .setHttpMethod(HttpMethod.PATCH);
    }

    /**
     * Deletes Crop for given crop id.
     *
     * @param cropId Id of crop to be deleted.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest delete(String cropId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/crops/{cropId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("cropId", cropId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.DELETE);
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
     *             phenotype: String
     *             id: String
     *             eTag: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             properties: {
     *                 String: Object
     *             }
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
    public DynamicRequest listNext(String nextLink) {
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
