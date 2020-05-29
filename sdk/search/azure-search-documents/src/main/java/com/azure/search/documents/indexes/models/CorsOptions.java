// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;

/**
 * Defines options to control Cross-Origin Resource Sharing (CORS) for an
 * index.
 */
@Fluent
public final class CorsOptions {
    /*
     * The list of origins from which JavaScript code will be granted access to
     * your index. Can contain a list of hosts of the form
     * {protocol}://{fully-qualified-domain-name}[:{port#}], or a single '*' to
     * allow all origins (not recommended).
     */
    @JsonProperty(value = "allowedOrigins", required = true)
    private List<String> allowedOrigins;

    /*
     * The duration for which browsers should cache CORS preflight responses.
     * Defaults to 5 minutes.
     */
    @JsonProperty(value = "maxAgeInSeconds")
    private Long maxAgeInSeconds;

    /**
     * Get the allowedOrigins property: The list of origins from which
     * JavaScript code will be granted access to your index. Can contain a list
     * of hosts of the form
     * {protocol}://{fully-qualified-domain-name}[:{port#}], or a single '*' to
     * allow all origins (not recommended).
     *
     * @return the allowedOrigins value.
     */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: The list of origins from which
     * JavaScript code will be granted access to your index. Can contain a list
     * of hosts of the form
     * {protocol}://{fully-qualified-domain-name}[:{port#}], or a single '*' to
     * allow all origins (not recommended).
     *
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsOptions object itself.
     */
    public CorsOptions setAllowedOrigins(String... allowedOrigins) {
        this.allowedOrigins = Arrays.asList(allowedOrigins);
        return this;
    }

    /**
     * Get the maxAgeInSeconds property: The duration for which browsers should
     * cache CORS preflight responses. Defaults to 5 minutes.
     *
     * @return the maxAgeInSeconds value.
     */
    public Long getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maxAgeInSeconds property: The duration for which browsers should
     * cache CORS preflight responses. Defaults to 5 minutes.
     *
     * @param maxAgeInSeconds the maxAgeInSeconds value to set.
     * @return the CorsOptions object itself.
     */
    public CorsOptions setMaxAgeInSeconds(Long maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }
}
