// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Cross-Origin Resource Sharing (CORS) settings for the app. */
@Fluent
public final class CorsSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CorsSettings.class);

    /*
     * Gets or sets the list of origins that should be allowed to make
     * cross-origin
     * calls (for example: http://example.com:12345). Use "*" to allow all.
     */
    @JsonProperty(value = "allowedOrigins")
    private List<String> allowedOrigins;

    /*
     * Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials
     * for more details.
     */
    @JsonProperty(value = "supportCredentials")
    private Boolean supportCredentials;

    /**
     * Get the allowedOrigins property: Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use "*" to allow all.
     *
     * @return the allowedOrigins value.
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use "*" to allow all.
     *
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsSettings object itself.
     */
    public CorsSettings withAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the supportCredentials property: Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials for more details.
     *
     * @return the supportCredentials value.
     */
    public Boolean supportCredentials() {
        return this.supportCredentials;
    }

    /**
     * Set the supportCredentials property: Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials for more details.
     *
     * @param supportCredentials the supportCredentials value to set.
     * @return the CorsSettings object itself.
     */
    public CorsSettings withSupportCredentials(Boolean supportCredentials) {
        this.supportCredentials = supportCredentials;
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
