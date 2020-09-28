// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies a CORS rule for the Blob service. */
@Fluent
public final class CorsRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CorsRule.class);

    /*
     * Required if CorsRule element is present. A list of origin domains that
     * will be allowed via CORS, or "*" to allow all domains
     */
    @JsonProperty(value = "allowedOrigins", required = true)
    private List<String> allowedOrigins;

    /*
     * Required if CorsRule element is present. A list of HTTP methods that are
     * allowed to be executed by the origin.
     */
    @JsonProperty(value = "allowedMethods", required = true)
    private List<CorsRuleAllowedMethodsItem> allowedMethods;

    /*
     * Required if CorsRule element is present. The number of seconds that the
     * client/browser should cache a preflight response.
     */
    @JsonProperty(value = "maxAgeInSeconds", required = true)
    private int maxAgeInSeconds;

    /*
     * Required if CorsRule element is present. A list of response headers to
     * expose to CORS clients.
     */
    @JsonProperty(value = "exposedHeaders", required = true)
    private List<String> exposedHeaders;

    /*
     * Required if CorsRule element is present. A list of headers allowed to be
     * part of the cross-origin request.
     */
    @JsonProperty(value = "allowedHeaders", required = true)
    private List<String> allowedHeaders;

    /**
     * Get the allowedOrigins property: Required if CorsRule element is present. A list of origin domains that will be
     * allowed via CORS, or "*" to allow all domains.
     *
     * @return the allowedOrigins value.
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: Required if CorsRule element is present. A list of origin domains that will be
     * allowed via CORS, or "*" to allow all domains.
     *
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: Required if CorsRule element is present. A list of HTTP methods that are allowed
     * to be executed by the origin.
     *
     * @return the allowedMethods value.
     */
    public List<CorsRuleAllowedMethodsItem> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: Required if CorsRule element is present. A list of HTTP methods that are allowed
     * to be executed by the origin.
     *
     * @param allowedMethods the allowedMethods value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withAllowedMethods(List<CorsRuleAllowedMethodsItem> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the maxAgeInSeconds property: Required if CorsRule element is present. The number of seconds that the
     * client/browser should cache a preflight response.
     *
     * @return the maxAgeInSeconds value.
     */
    public int maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maxAgeInSeconds property: Required if CorsRule element is present. The number of seconds that the
     * client/browser should cache a preflight response.
     *
     * @param maxAgeInSeconds the maxAgeInSeconds value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withMaxAgeInSeconds(int maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }

    /**
     * Get the exposedHeaders property: Required if CorsRule element is present. A list of response headers to expose to
     * CORS clients.
     *
     * @return the exposedHeaders value.
     */
    public List<String> exposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Set the exposedHeaders property: Required if CorsRule element is present. A list of response headers to expose to
     * CORS clients.
     *
     * @param exposedHeaders the exposedHeaders value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withExposedHeaders(List<String> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * Get the allowedHeaders property: Required if CorsRule element is present. A list of headers allowed to be part of
     * the cross-origin request.
     *
     * @return the allowedHeaders value.
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: Required if CorsRule element is present. A list of headers allowed to be part of
     * the cross-origin request.
     *
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withAllowedHeaders(List<String> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allowedOrigins() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property allowedOrigins in model CorsRule"));
        }
        if (allowedMethods() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property allowedMethods in model CorsRule"));
        }
        if (exposedHeaders() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property exposedHeaders in model CorsRule"));
        }
        if (allowedHeaders() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property allowedHeaders in model CorsRule"));
        }
    }
}
