/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CORS policy for the Cosmos DB database account.
 */
public class CorsPolicy {
    /**
     * The origin domains that are permitted to make a request against the
     * service via CORS.
     */
    @JsonProperty(value = "allowedOrigins", required = true)
    private String allowedOrigins;

    /**
     * The methods (HTTP request verbs) that the origin domain may use for a
     * CORS request.
     */
    @JsonProperty(value = "allowedMethods")
    private String allowedMethods;

    /**
     * The request headers that the origin domain may specify on the CORS
     * request.
     */
    @JsonProperty(value = "allowedHeaders")
    private String allowedHeaders;

    /**
     * The response headers that may be sent in the response to the CORS
     * request and exposed by the browser to the request issuer.
     */
    @JsonProperty(value = "exposedHeaders")
    private String exposedHeaders;

    /**
     * The maximum amount time that a browser should cache the preflight
     * OPTIONS request.
     */
    @JsonProperty(value = "maxAgeInSeconds")
    private Long maxAgeInSeconds;

    /**
     * Get the origin domains that are permitted to make a request against the service via CORS.
     *
     * @return the allowedOrigins value
     */
    public String allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the origin domains that are permitted to make a request against the service via CORS.
     *
     * @param allowedOrigins the allowedOrigins value to set
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedOrigins(String allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the methods (HTTP request verbs) that the origin domain may use for a CORS request.
     *
     * @return the allowedMethods value
     */
    public String allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the methods (HTTP request verbs) that the origin domain may use for a CORS request.
     *
     * @param allowedMethods the allowedMethods value to set
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedMethods(String allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the request headers that the origin domain may specify on the CORS request.
     *
     * @return the allowedHeaders value
     */
    public String allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the request headers that the origin domain may specify on the CORS request.
     *
     * @param allowedHeaders the allowedHeaders value to set
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedHeaders(String allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Get the response headers that may be sent in the response to the CORS request and exposed by the browser to the request issuer.
     *
     * @return the exposedHeaders value
     */
    public String exposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Set the response headers that may be sent in the response to the CORS request and exposed by the browser to the request issuer.
     *
     * @param exposedHeaders the exposedHeaders value to set
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withExposedHeaders(String exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * Get the maximum amount time that a browser should cache the preflight OPTIONS request.
     *
     * @return the maxAgeInSeconds value
     */
    public Long maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maximum amount time that a browser should cache the preflight OPTIONS request.
     *
     * @param maxAgeInSeconds the maxAgeInSeconds value to set
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withMaxAgeInSeconds(Long maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }

}
