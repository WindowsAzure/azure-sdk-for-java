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

/** Initializes a new instance of the SeasonalFieldsBaseClient type. */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class SeasonalFieldsBaseClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    private final ObjectSerializer serializer;

    /**
     * Initializes an instance of SeasonalFieldsBaseClient client.
     *
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example:
     *     https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializer The serializer to serialize an object into a string.
     */
    SeasonalFieldsBaseClient(
            String endpoint, String apiVersion, HttpPipeline httpPipeline, ObjectSerializer serializer) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
    }

    /**
     * Returns a paginated list of seasonal field resources under a particular farmer.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>farmIds</td><td>List&lt;String&gt;</td><td>Farm Ids of the resource.</td></tr>
     *     <tr><td>fieldIds</td><td>List&lt;String&gt;</td><td>Field Ids of the resource.</td></tr>
     *     <tr><td>seasonIds</td><td>List&lt;String&gt;</td><td>Season Ids of the resource.</td></tr>
     *     <tr><td>cropVarietyIds</td><td>List&lt;String&gt;</td><td>CropVarietyIds of the resource.</td></tr>
     *     <tr><td>cropIds</td><td>List&lt;String&gt;</td><td>Ids of the crop it belongs to.</td></tr>
     *     <tr><td>minAvgYieldValue</td><td>Double</td><td>Minimum average yield value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>maxAvgYieldValue</td><td>Double</td><td>Maximum average yield value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>avgYieldUnit</td><td>String</td><td>Unit of the average yield value attribute.</td></tr>
     *     <tr><td>minAvgSeedPopulationValue</td><td>Double</td><td>Minimum average seed population value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>maxAvgSeedPopulationValue</td><td>Double</td><td>Maximum average seed population value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>avgSeedPopulationUnit</td><td>String</td><td>Unit of average seed population value attribute.</td></tr>
     *     <tr><td>minPlantingDateTime</td><td>OffsetDateTime</td><td>Minimum planting datetime, sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>maxPlantingDateTime</td><td>OffsetDateTime</td><td>Maximum planting datetime, sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
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
     *             primaryBoundaryId: String
     *             boundaryIds: [
     *                 String
     *             ]
     *             farmId: String
     *             fieldId: String
     *             seasonId: String
     *             cropVarietyIds: [
     *                 String
     *             ]
     *             cropId: String
     *             avgYieldValue: Double
     *             avgYieldUnit: String
     *             avgSeedPopulationValue: Double
     *             avgSeedPopulationUnit: String
     *             plantingDateTime: OffsetDateTime
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
     * @param farmerId Id of the associated farmer.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listByFarmerId(String farmerId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/seasonal-fields")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Returns a paginated list of seasonal field resources across all farmers.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>farmIds</td><td>List&lt;String&gt;</td><td>Farm Ids of the resource.</td></tr>
     *     <tr><td>fieldIds</td><td>List&lt;String&gt;</td><td>Field Ids of the resource.</td></tr>
     *     <tr><td>seasonIds</td><td>List&lt;String&gt;</td><td>Season Ids of the resource.</td></tr>
     *     <tr><td>cropVarietyIds</td><td>List&lt;String&gt;</td><td>CropVarietyIds of the resource.</td></tr>
     *     <tr><td>cropIds</td><td>List&lt;String&gt;</td><td>Ids of the crop it belongs to.</td></tr>
     *     <tr><td>minAvgYieldValue</td><td>Double</td><td>Minimum average yield value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>maxAvgYieldValue</td><td>Double</td><td>Maximum average yield value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>avgYieldUnit</td><td>String</td><td>Unit of the average yield value attribute.</td></tr>
     *     <tr><td>minAvgSeedPopulationValue</td><td>Double</td><td>Minimum average seed population value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>maxAvgSeedPopulationValue</td><td>Double</td><td>Maximum average seed population value of the seasonal field(inclusive).</td></tr>
     *     <tr><td>avgSeedPopulationUnit</td><td>String</td><td>Unit of average seed population value attribute.</td></tr>
     *     <tr><td>minPlantingDateTime</td><td>OffsetDateTime</td><td>Minimum planting datetime, sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>maxPlantingDateTime</td><td>OffsetDateTime</td><td>Maximum planting datetime, sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
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
     *             primaryBoundaryId: String
     *             boundaryIds: [
     *                 String
     *             ]
     *             farmId: String
     *             fieldId: String
     *             seasonId: String
     *             cropVarietyIds: [
     *                 String
     *             ]
     *             cropId: String
     *             avgYieldValue: Double
     *             avgYieldUnit: String
     *             avgSeedPopulationValue: Double
     *             avgSeedPopulationUnit: String
     *             plantingDateTime: OffsetDateTime
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
                .setUrl("{Endpoint}/seasonal-fields")
                .setPathParam("Endpoint", endpoint)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Gets a specified seasonal field resource under a particular farmer.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     primaryBoundaryId: String
     *     boundaryIds: [
     *         String
     *     ]
     *     farmId: String
     *     fieldId: String
     *     seasonId: String
     *     cropVarietyIds: [
     *         String
     *     ]
     *     cropId: String
     *     avgYieldValue: Double
     *     avgYieldUnit: String
     *     avgSeedPopulationValue: Double
     *     avgSeedPopulationUnit: String
     *     plantingDateTime: OffsetDateTime
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
     * @param farmerId Id of the associated farmer.
     * @param seasonalFieldId Id of the seasonal field.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest get(String farmerId, String seasonalFieldId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/seasonal-fields/{seasonalFieldId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("seasonalFieldId", seasonalFieldId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Creates or Updates a seasonal field resource under a particular farmer.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     primaryBoundaryId: String
     *     boundaryIds: [
     *         String
     *     ]
     *     farmId: String
     *     fieldId: String
     *     seasonId: String
     *     cropVarietyIds: [
     *         String
     *     ]
     *     cropId: String
     *     avgYieldValue: Double
     *     avgYieldUnit: String
     *     avgSeedPopulationValue: Double
     *     avgSeedPopulationUnit: String
     *     plantingDateTime: OffsetDateTime
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
     * @param farmerId Id of the associated farmer resource.
     * @param seasonalFieldId Id of the seasonal field resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createOrUpdate(String farmerId, String seasonalFieldId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/seasonal-fields/{seasonalFieldId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("seasonalFieldId", seasonalFieldId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/merge-patch+json")
                .setHttpMethod(HttpMethod.PATCH);
    }

    /**
     * Deletes a specified seasonal-field resource under a particular farmer.
     *
     * @param farmerId Id of the farmer.
     * @param seasonalFieldId Id of the seasonal field.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest delete(String farmerId, String seasonalFieldId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/seasonal-fields/{seasonalFieldId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("seasonalFieldId", seasonalFieldId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.DELETE);
    }

    /**
     * Get cascade delete job for specified seasonal field.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     id: String
     *     status: String
     *     durationInSeconds: String
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest getCascadeDeleteJobDetails(String jobId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/seasonal-fields/cascade-delete/{jobId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("jobId", jobId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Create a cascade delete job for specified seasonal field.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     id: String
     *     status: String
     *     durationInSeconds: String
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * @param jobId Job ID supplied by end user.
     * @param farmerId ID of the associated farmer.
     * @param seasonalFieldId ID of the seasonalField to be deleted.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createCascadeDeleteJob(String jobId, String farmerId, String seasonalFieldId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/seasonal-fields/cascade-delete/{jobId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("jobId", jobId)
                .addQueryParam("farmerId", farmerId)
                .addQueryParam("seasonalFieldId", seasonalFieldId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.PUT);
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
     *             primaryBoundaryId: String
     *             boundaryIds: [
     *                 String
     *             ]
     *             farmId: String
     *             fieldId: String
     *             seasonId: String
     *             cropVarietyIds: [
     *                 String
     *             ]
     *             cropId: String
     *             avgYieldValue: Double
     *             avgYieldUnit: String
     *             avgSeedPopulationValue: Double
     *             avgSeedPopulationUnit: String
     *             plantingDateTime: OffsetDateTime
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
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             farmerId: String
     *             primaryBoundaryId: String
     *             boundaryIds: [
     *                 String
     *             ]
     *             farmId: String
     *             fieldId: String
     *             seasonId: String
     *             cropVarietyIds: [
     *                 String
     *             ]
     *             cropId: String
     *             avgYieldValue: Double
     *             avgYieldUnit: String
     *             avgSeedPopulationValue: Double
     *             avgSeedPopulationUnit: String
     *             plantingDateTime: OffsetDateTime
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
