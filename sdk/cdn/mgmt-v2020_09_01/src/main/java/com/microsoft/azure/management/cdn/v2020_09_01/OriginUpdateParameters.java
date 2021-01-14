/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Origin properties needed for origin update.
 */
@JsonFlatten
public class OriginUpdateParameters {
    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6
     * addresses are supported.This should be unique across all origins in an
     * endpoint.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpPort")
    private Integer httpPort;

    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpsPort")
    private Integer httpsPort;

    /**
     * The host header value sent to the origin with each request. If you leave
     * this blank, the request hostname determines this value. Azure CDN
     * origins, such as Web Apps, Blob Storage, and Cloud Services require this
     * host header value to match the origin hostname by default. This
     * overrides the host header defined at Endpoint.
     */
    @JsonProperty(value = "properties.originHostHeader")
    private String originHostHeader;

    /**
     * Priority of origin in given origin group for load balancing. Higher
     * priorities will not be used for load balancing if any lower priority
     * origin is healthy.Must be between 1 and 5.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * Weight of the origin in given origin group for load balancing. Must be
     * between 1 and 1000.
     */
    @JsonProperty(value = "properties.weight")
    private Integer weight;

    /**
     * Origin is enabled for load balancing or not.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The Alias of the Private Link resource. Populating this optional field
     * indicates that this origin is 'Private'.
     */
    @JsonProperty(value = "properties.privateLinkAlias")
    private String privateLinkAlias;

    /**
     * The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     */
    @JsonProperty(value = "properties.privateLinkResourceId")
    private String privateLinkResourceId;

    /**
     * The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     */
    @JsonProperty(value = "properties.privateLinkLocation")
    private String privateLinkLocation;

    /**
     * A custom message to be included in the approval request to connect to
     * the Private Link.
     */
    @JsonProperty(value = "properties.privateLinkApprovalMessage")
    private String privateLinkApprovalMessage;

    /**
     * Get the address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     *
     * @param hostName the hostName value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the value of the HTTPS port. Must be between 1 and 65535.
     *
     * @return the httpsPort value
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the value of the HTTPS port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get the host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint.
     *
     * @return the originHostHeader value
     */
    public String originHostHeader() {
        return this.originHostHeader;
    }

    /**
     * Set the host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint.
     *
     * @param originHostHeader the originHostHeader value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withOriginHostHeader(String originHostHeader) {
        this.originHostHeader = originHostHeader;
        return this;
    }

    /**
     * Get priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @param priority the priority value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get weight of the origin in given origin group for load balancing. Must be between 1 and 1000.
     *
     * @return the weight value
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set weight of the origin in given origin group for load balancing. Must be between 1 and 1000.
     *
     * @param weight the weight value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get origin is enabled for load balancing or not.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set origin is enabled for load balancing or not.
     *
     * @param enabled the enabled value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'.
     *
     * @return the privateLinkAlias value
     */
    public String privateLinkAlias() {
        return this.privateLinkAlias;
    }

    /**
     * Set the Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'.
     *
     * @param privateLinkAlias the privateLinkAlias value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkAlias(String privateLinkAlias) {
        this.privateLinkAlias = privateLinkAlias;
        return this;
    }

    /**
     * Get the Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'.
     *
     * @return the privateLinkResourceId value
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the location of the Private Link resource. Required only if 'privateLinkResourceId' is populated.
     *
     * @return the privateLinkLocation value
     */
    public String privateLinkLocation() {
        return this.privateLinkLocation;
    }

    /**
     * Set the location of the Private Link resource. Required only if 'privateLinkResourceId' is populated.
     *
     * @param privateLinkLocation the privateLinkLocation value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkLocation(String privateLinkLocation) {
        this.privateLinkLocation = privateLinkLocation;
        return this;
    }

    /**
     * Get a custom message to be included in the approval request to connect to the Private Link.
     *
     * @return the privateLinkApprovalMessage value
     */
    public String privateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage;
    }

    /**
     * Set a custom message to be included in the approval request to connect to the Private Link.
     *
     * @param privateLinkApprovalMessage the privateLinkApprovalMessage value to set
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkApprovalMessage(String privateLinkApprovalMessage) {
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        return this;
    }

}
