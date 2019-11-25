/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.ApplicationLogsConfig;
import com.microsoft.azure.management.appservice.v2018_02_01.HttpLogsConfig;
import com.microsoft.azure.management.appservice.v2018_02_01.EnabledConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Configuration of App Service site logs.
 */
@JsonFlatten
public class SiteLogsConfigInner extends ProxyOnlyResource {
    /**
     * Application logs configuration.
     */
    @JsonProperty(value = "properties.applicationLogs")
    private ApplicationLogsConfig applicationLogs;

    /**
     * HTTP logs configuration.
     */
    @JsonProperty(value = "properties.httpLogs")
    private HttpLogsConfig httpLogs;

    /**
     * Failed requests tracing configuration.
     */
    @JsonProperty(value = "properties.failedRequestsTracing")
    private EnabledConfig failedRequestsTracing;

    /**
     * Detailed error messages configuration.
     */
    @JsonProperty(value = "properties.detailedErrorMessages")
    private EnabledConfig detailedErrorMessages;

    /**
     * Get application logs configuration.
     *
     * @return the applicationLogs value
     */
    public ApplicationLogsConfig applicationLogs() {
        return this.applicationLogs;
    }

    /**
     * Set application logs configuration.
     *
     * @param applicationLogs the applicationLogs value to set
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withApplicationLogs(ApplicationLogsConfig applicationLogs) {
        this.applicationLogs = applicationLogs;
        return this;
    }

    /**
     * Get hTTP logs configuration.
     *
     * @return the httpLogs value
     */
    public HttpLogsConfig httpLogs() {
        return this.httpLogs;
    }

    /**
     * Set hTTP logs configuration.
     *
     * @param httpLogs the httpLogs value to set
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withHttpLogs(HttpLogsConfig httpLogs) {
        this.httpLogs = httpLogs;
        return this;
    }

    /**
     * Get failed requests tracing configuration.
     *
     * @return the failedRequestsTracing value
     */
    public EnabledConfig failedRequestsTracing() {
        return this.failedRequestsTracing;
    }

    /**
     * Set failed requests tracing configuration.
     *
     * @param failedRequestsTracing the failedRequestsTracing value to set
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withFailedRequestsTracing(EnabledConfig failedRequestsTracing) {
        this.failedRequestsTracing = failedRequestsTracing;
        return this;
    }

    /**
     * Get detailed error messages configuration.
     *
     * @return the detailedErrorMessages value
     */
    public EnabledConfig detailedErrorMessages() {
        return this.detailedErrorMessages;
    }

    /**
     * Set detailed error messages configuration.
     *
     * @param detailedErrorMessages the detailedErrorMessages value to set
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withDetailedErrorMessages(EnabledConfig detailedErrorMessages) {
        this.detailedErrorMessages = detailedErrorMessages;
        return this;
    }

}
