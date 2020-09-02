// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistryEventRequest model. */
@Fluent
public final class ContainerRegistryEventRequest {
    /*
     * The ID of the request that initiated the event.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The IP or hostname and possibly port of the client connection that
     * initiated the event. This is the RemoteAddr from the standard http
     * request.
     */
    @JsonProperty(value = "addr")
    private String addr;

    /*
     * The externally accessible hostname of the registry instance, as
     * specified by the http host header on incoming requests.
     */
    @JsonProperty(value = "host")
    private String host;

    /*
     * The request method that generated the event.
     */
    @JsonProperty(value = "method")
    private String method;

    /*
     * The user agent header of the request.
     */
    @JsonProperty(value = "useragent")
    private String useragent;

    /**
     * Get the id property: The ID of the request that initiated the event.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the request that initiated the event.
     *
     * @param id the id value to set.
     * @return the ContainerRegistryEventRequest object itself.
     */
    public ContainerRegistryEventRequest setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the addr property: The IP or hostname and possibly port of the client connection that initiated the event.
     * This is the RemoteAddr from the standard http request.
     *
     * @return the addr value.
     */
    public String getAddr() {
        return this.addr;
    }

    /**
     * Set the addr property: The IP or hostname and possibly port of the client connection that initiated the event.
     * This is the RemoteAddr from the standard http request.
     *
     * @param addr the addr value to set.
     * @return the ContainerRegistryEventRequest object itself.
     */
    public ContainerRegistryEventRequest setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * Get the host property: The externally accessible hostname of the registry instance, as specified by the http host
     * header on incoming requests.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Set the host property: The externally accessible hostname of the registry instance, as specified by the http host
     * header on incoming requests.
     *
     * @param host the host value to set.
     * @return the ContainerRegistryEventRequest object itself.
     */
    public ContainerRegistryEventRequest setHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the method property: The request method that generated the event.
     *
     * @return the method value.
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * Set the method property: The request method that generated the event.
     *
     * @param method the method value to set.
     * @return the ContainerRegistryEventRequest object itself.
     */
    public ContainerRegistryEventRequest setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the useragent property: The user agent header of the request.
     *
     * @return the useragent value.
     */
    public String getUseragent() {
        return this.useragent;
    }

    /**
     * Set the useragent property: The user agent header of the request.
     *
     * @param useragent the useragent value to set.
     * @return the ContainerRegistryEventRequest object itself.
     */
    public ContainerRegistryEventRequest setUseragent(String useragent) {
        this.useragent = useragent;
        return this;
    }
}
