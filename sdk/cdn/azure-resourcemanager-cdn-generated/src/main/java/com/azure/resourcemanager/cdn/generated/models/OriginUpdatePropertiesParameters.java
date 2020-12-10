// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the origin. */
@Fluent
public class OriginUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OriginUpdatePropertiesParameters.class);

    /*
     * The address of the origin. Domain names, IPv4 addresses, and IPv6
     * addresses are supported.This should be unique across all origins in an
     * endpoint.
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * The value of the HTTP port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "httpPort")
    private Integer httpPort;

    /*
     * The value of the HTTPS port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "httpsPort")
    private Integer httpsPort;

    /*
     * The host header value sent to the origin with each request. If you leave
     * this blank, the request hostname determines this value. Azure CDN
     * origins, such as Web Apps, Blob Storage, and Cloud Services require this
     * host header value to match the origin hostname by default. This
     * overrides the host header defined at Endpoint
     */
    @JsonProperty(value = "originHostHeader")
    private String originHostHeader;

    /*
     * Priority of origin in given origin group for load balancing. Higher
     * priorities will not be used for load balancing if any lower priority
     * origin is healthy.Must be between 1 and 5
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Weight of the origin in given origin group for load balancing. Must be
     * between 1 and 1000
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /*
     * Origin is enabled for load balancing or not
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The Alias of the Private Link resource. Populating this optional field
     * indicates that this origin is 'Private'
     */
    @JsonProperty(value = "privateLinkAlias")
    private String privateLinkAlias;

    /*
     * The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'
     */
    @JsonProperty(value = "privateLinkResourceId")
    private String privateLinkResourceId;

    /*
     * The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated
     */
    @JsonProperty(value = "privateLinkLocation")
    private String privateLinkLocation;

    /*
     * A custom message to be included in the approval request to connect to
     * the Private Link.
     */
    @JsonProperty(value = "privateLinkApprovalMessage")
    private String privateLinkApprovalMessage;

    /**
     * Get the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     *
     * @param hostname the hostname value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @return the originHostHeader value.
     */
    public String originHostHeader() {
        return this.originHostHeader;
    }

    /**
     * Set the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @param originHostHeader the originHostHeader value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withOriginHostHeader(String originHostHeader) {
        this.originHostHeader = originHostHeader;
        return this;
    }

    /**
     * Get the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @param priority the priority value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     *
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     *
     * @param weight the weight value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the enabled property: Origin is enabled for load balancing or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Origin is enabled for load balancing or not.
     *
     * @param enabled the enabled value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the privateLinkAlias property: The Alias of the Private Link resource. Populating this optional field
     * indicates that this origin is 'Private'.
     *
     * @return the privateLinkAlias value.
     */
    public String privateLinkAlias() {
        return this.privateLinkAlias;
    }

    /**
     * Set the privateLinkAlias property: The Alias of the Private Link resource. Populating this optional field
     * indicates that this origin is 'Private'.
     *
     * @param privateLinkAlias the privateLinkAlias value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withPrivateLinkAlias(String privateLinkAlias) {
        this.privateLinkAlias = privateLinkAlias;
        return this;
    }

    /**
     * Get the privateLinkResourceId property: The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     *
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the privateLinkLocation property: The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     *
     * @return the privateLinkLocation value.
     */
    public String privateLinkLocation() {
        return this.privateLinkLocation;
    }

    /**
     * Set the privateLinkLocation property: The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     *
     * @param privateLinkLocation the privateLinkLocation value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withPrivateLinkLocation(String privateLinkLocation) {
        this.privateLinkLocation = privateLinkLocation;
        return this;
    }

    /**
     * Get the privateLinkApprovalMessage property: A custom message to be included in the approval request to connect
     * to the Private Link.
     *
     * @return the privateLinkApprovalMessage value.
     */
    public String privateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage;
    }

    /**
     * Set the privateLinkApprovalMessage property: A custom message to be included in the approval request to connect
     * to the Private Link.
     *
     * @param privateLinkApprovalMessage the privateLinkApprovalMessage value to set.
     * @return the OriginUpdatePropertiesParameters object itself.
     */
    public OriginUpdatePropertiesParameters withPrivateLinkApprovalMessage(String privateLinkApprovalMessage) {
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
