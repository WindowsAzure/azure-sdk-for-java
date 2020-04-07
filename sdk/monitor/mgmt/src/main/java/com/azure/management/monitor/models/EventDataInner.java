// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.monitor.EventLevel;
import com.azure.management.monitor.HttpRequestInfo;
import com.azure.management.monitor.SenderAuthorization;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The EventData model.
 */
@Immutable
public final class EventDataInner {
    /*
     * The sender authorization information.
     */
    @JsonProperty(value = "authorization", access = JsonProperty.Access.WRITE_ONLY)
    private SenderAuthorization authorization;

    /*
     * key value pairs to identify ARM permissions.
     */
    @JsonProperty(value = "claims", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> claims;

    /*
     * the email address of the user who has performed the operation, the UPN
     * claim or SPN claim based on availability.
     */
    @JsonProperty(value = "caller", access = JsonProperty.Access.WRITE_ONLY)
    private String caller;

    /*
     * the description of the event.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * the Id of this event as required by ARM for RBAC. It contains the
     * EventDataID and a timestamp information.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * the event data Id. This is a unique identifier for an event.
     */
    @JsonProperty(value = "eventDataId", access = JsonProperty.Access.WRITE_ONLY)
    private String eventDataId;

    /*
     * the correlation Id, usually a GUID in the string format. The correlation
     * Id is shared among the events that belong to the same uber operation.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /*
     * the event name. This value should not be confused with OperationName.
     * For practical purposes, OperationName might be more appealing to end
     * users.
     */
    @JsonProperty(value = "eventName", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner eventName;

    /*
     * the event category.
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner category;

    /*
     * the HTTP request info. Usually includes the 'clientRequestId',
     * 'clientIpAddress' (IP address of the user who initiated the event) and
     * 'method' (HTTP method e.g. PUT).
     */
    @JsonProperty(value = "httpRequest", access = JsonProperty.Access.WRITE_ONLY)
    private HttpRequestInfo httpRequest;

    /*
     * the event level
     */
    @JsonProperty(value = "level", access = JsonProperty.Access.WRITE_ONLY)
    private EventLevel level;

    /*
     * the resource group name of the impacted resource.
     */
    @JsonProperty(value = "resourceGroupName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroupName;

    /*
     * the resource provider name of the impacted resource.
     */
    @JsonProperty(value = "resourceProviderName", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner resourceProviderName;

    /*
     * the resource uri that uniquely identifies the resource that caused this
     * event.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * the resource type
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner resourceType;

    /*
     * It is usually a GUID shared among the events corresponding to single
     * operation. This value should not be confused with EventName.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * the operation name.
     */
    @JsonProperty(value = "operationName", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner operationName;

    /*
     * the set of <Key, Value> pairs (usually a Dictionary<String, String>)
     * that includes details about the event.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> properties;

    /*
     * a string describing the status of the operation. Some typical values
     * are: Started, In progress, Succeeded, Failed, Resolved.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner status;

    /*
     * the event sub status. Most of the time, when included, this captures the
     * HTTP status code of the REST call. Common values are: OK (HTTP Status
     * Code: 200), Created (HTTP Status Code: 201), Accepted (HTTP Status Code:
     * 202), No Content (HTTP Status Code: 204), Bad Request(HTTP Status Code:
     * 400), Not Found (HTTP Status Code: 404), Conflict (HTTP Status Code:
     * 409), Internal Server Error (HTTP Status Code: 500), Service Unavailable
     * (HTTP Status Code:503), Gateway Timeout (HTTP Status Code: 504)
     */
    @JsonProperty(value = "subStatus", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner subStatus;

    /*
     * the timestamp of when the event was generated by the Azure service
     * processing the request corresponding the event. It in ISO 8601 format.
     */
    @JsonProperty(value = "eventTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime eventTimestamp;

    /*
     * the timestamp of when the event became available for querying via this
     * API. It is in ISO 8601 format. This value should not be confused
     * eventTimestamp. As there might be a delay between the occurrence time of
     * the event, and the time that the event is submitted to the Azure logging
     * infrastructure.
     */
    @JsonProperty(value = "submissionTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime submissionTimestamp;

    /*
     * the Azure subscription Id usually a GUID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * the Azure tenant Id
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the authorization property: The sender authorization information.
     * 
     * @return the authorization value.
     */
    public SenderAuthorization authorization() {
        return this.authorization;
    }

    /**
     * Get the claims property: key value pairs to identify ARM permissions.
     * 
     * @return the claims value.
     */
    public Map<String, String> claims() {
        return this.claims;
    }

    /**
     * Get the caller property: the email address of the user who has performed
     * the operation, the UPN claim or SPN claim based on availability.
     * 
     * @return the caller value.
     */
    public String caller() {
        return this.caller;
    }

    /**
     * Get the description property: the description of the event.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the id property: the Id of this event as required by ARM for RBAC.
     * It contains the EventDataID and a timestamp information.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the eventDataId property: the event data Id. This is a unique
     * identifier for an event.
     * 
     * @return the eventDataId value.
     */
    public String eventDataId() {
        return this.eventDataId;
    }

    /**
     * Get the correlationId property: the correlation Id, usually a GUID in
     * the string format. The correlation Id is shared among the events that
     * belong to the same uber operation.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the eventName property: the event name. This value should not be
     * confused with OperationName. For practical purposes, OperationName might
     * be more appealing to end users.
     * 
     * @return the eventName value.
     */
    public LocalizableStringInner eventName() {
        return this.eventName;
    }

    /**
     * Get the category property: the event category.
     * 
     * @return the category value.
     */
    public LocalizableStringInner category() {
        return this.category;
    }

    /**
     * Get the httpRequest property: the HTTP request info. Usually includes
     * the 'clientRequestId', 'clientIpAddress' (IP address of the user who
     * initiated the event) and 'method' (HTTP method e.g. PUT).
     * 
     * @return the httpRequest value.
     */
    public HttpRequestInfo httpRequest() {
        return this.httpRequest;
    }

    /**
     * Get the level property: the event level.
     * 
     * @return the level value.
     */
    public EventLevel level() {
        return this.level;
    }

    /**
     * Get the resourceGroupName property: the resource group name of the
     * impacted resource.
     * 
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Get the resourceProviderName property: the resource provider name of the
     * impacted resource.
     * 
     * @return the resourceProviderName value.
     */
    public LocalizableStringInner resourceProviderName() {
        return this.resourceProviderName;
    }

    /**
     * Get the resourceId property: the resource uri that uniquely identifies
     * the resource that caused this event.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the resourceType property: the resource type.
     * 
     * @return the resourceType value.
     */
    public LocalizableStringInner resourceType() {
        return this.resourceType;
    }

    /**
     * Get the operationId property: It is usually a GUID shared among the
     * events corresponding to single operation. This value should not be
     * confused with EventName.
     * 
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the operationName property: the operation name.
     * 
     * @return the operationName value.
     */
    public LocalizableStringInner operationName() {
        return this.operationName;
    }

    /**
     * Get the properties property: the set of &lt;Key, Value&gt; pairs
     * (usually a Dictionary&lt;String, String&gt;) that includes details about
     * the event.
     * 
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Get the status property: a string describing the status of the
     * operation. Some typical values are: Started, In progress, Succeeded,
     * Failed, Resolved.
     * 
     * @return the status value.
     */
    public LocalizableStringInner status() {
        return this.status;
    }

    /**
     * Get the subStatus property: the event sub status. Most of the time, when
     * included, this captures the HTTP status code of the REST call. Common
     * values are: OK (HTTP Status Code: 200), Created (HTTP Status Code: 201),
     * Accepted (HTTP Status Code: 202), No Content (HTTP Status Code: 204),
     * Bad Request(HTTP Status Code: 400), Not Found (HTTP Status Code: 404),
     * Conflict (HTTP Status Code: 409), Internal Server Error (HTTP Status
     * Code: 500), Service Unavailable (HTTP Status Code:503), Gateway Timeout
     * (HTTP Status Code: 504).
     * 
     * @return the subStatus value.
     */
    public LocalizableStringInner subStatus() {
        return this.subStatus;
    }

    /**
     * Get the eventTimestamp property: the timestamp of when the event was
     * generated by the Azure service processing the request corresponding the
     * event. It in ISO 8601 format.
     * 
     * @return the eventTimestamp value.
     */
    public OffsetDateTime eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Get the submissionTimestamp property: the timestamp of when the event
     * became available for querying via this API. It is in ISO 8601 format.
     * This value should not be confused eventTimestamp. As there might be a
     * delay between the occurrence time of the event, and the time that the
     * event is submitted to the Azure logging infrastructure.
     * 
     * @return the submissionTimestamp value.
     */
    public OffsetDateTime submissionTimestamp() {
        return this.submissionTimestamp;
    }

    /**
     * Get the subscriptionId property: the Azure subscription Id usually a
     * GUID.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the tenantId property: the Azure tenant Id.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }
}
