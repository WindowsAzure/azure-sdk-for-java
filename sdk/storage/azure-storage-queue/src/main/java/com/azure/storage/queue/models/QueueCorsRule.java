// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * CORS is an HTTP feature that enables a web application running under one domain to access resources in another
 * domain. Web browsers implement a security restriction known as same-origin policy that prevents a web page from
 * calling APIs in a different domain; CORS provides a secure way to allow one domain (the origin domain) to call APIs
 * in another domain.
 */
@JacksonXmlRootElement(localName = "CorsRule")
@Fluent
public final class QueueCorsRule {
    /*
     * The origin domains that are permitted to make a request against the
     * storage service via CORS. The origin domain is the domain from which the
     * request originates. Note that the origin must be an exact case-sensitive
     * match with the origin that the user age sends to the service. You can
     * also use the wildcard character '*' to allow all origin domains to make
     * requests via CORS.
     */
    @JsonProperty(value = "AllowedOrigins", required = true)
    private String allowedOrigins;

    /*
     * The methods (HTTP request verbs) that the origin domain may use for a
     * CORS request. (comma separated)
     */
    @JsonProperty(value = "AllowedMethods", required = true)
    private String allowedMethods;

    /*
     * the request headers that the origin domain may specify on the CORS
     * request.
     */
    @JsonProperty(value = "AllowedHeaders", required = true)
    private String allowedHeaders;

    /*
     * The response headers that may be sent in the response to the CORS
     * request and exposed by the browser to the request issuer
     */
    @JsonProperty(value = "ExposedHeaders", required = true)
    private String exposedHeaders;

    /*
     * The maximum amount time that a browser should cache the preflight
     * OPTIONS request.
     */
    @JsonProperty(value = "MaxAgeInSeconds", required = true)
    private int maxAgeInSeconds;

    /**
     * Get the allowedOrigins property: The origin domains that are permitted to make a request against the storage
     * service via CORS. The origin domain is the domain from which the request originates. Note that the origin must be
     * an exact case-sensitive match with the origin that the user age sends to the service. You can also use the
     * wildcard character '*' to allow all origin domains to make requests via CORS.
     *
     * @return the allowedOrigins value.
     */
    public String getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: The origin domains that are permitted to make a request against the storage
     * service via CORS. The origin domain is the domain from which the request originates. Note that the origin must be
     * an exact case-sensitive match with the origin that the user age sends to the service. You can also use the
     * wildcard character '*' to allow all origin domains to make requests via CORS.
     *
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the QueueCorsRule object itself.
     */
    public QueueCorsRule setAllowedOrigins(String allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: The methods (HTTP request verbs) that the origin domain may use for a CORS
     * request. (comma separated).
     *
     * @return the allowedMethods value.
     */
    public String getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: The methods (HTTP request verbs) that the origin domain may use for a CORS
     * request. (comma separated).
     *
     * @param allowedMethods the allowedMethods value to set.
     * @return the QueueCorsRule object itself.
     */
    public QueueCorsRule setAllowedMethods(String allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the allowedHeaders property: the request headers that the origin domain may specify on the CORS request.
     *
     * @return the allowedHeaders value.
     */
    public String getAllowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: the request headers that the origin domain may specify on the CORS request.
     *
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the QueueCorsRule object itself.
     */
    public QueueCorsRule setAllowedHeaders(String allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Get the exposedHeaders property: The response headers that may be sent in the response to the CORS request and
     * exposed by the browser to the request issuer.
     *
     * @return the exposedHeaders value.
     */
    public String getExposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Set the exposedHeaders property: The response headers that may be sent in the response to the CORS request and
     * exposed by the browser to the request issuer.
     *
     * @param exposedHeaders the exposedHeaders value to set.
     * @return the QueueCorsRule object itself.
     */
    public QueueCorsRule setExposedHeaders(String exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * Get the maxAgeInSeconds property: The maximum amount time that a browser should cache the preflight OPTIONS
     * request.
     *
     * @return the maxAgeInSeconds value.
     */
    public int getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maxAgeInSeconds property: The maximum amount time that a browser should cache the preflight OPTIONS
     * request.
     *
     * @param maxAgeInSeconds the maxAgeInSeconds value to set.
     * @return the QueueCorsRule object itself.
     */
    public QueueCorsRule setMaxAgeInSeconds(int maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }
}
