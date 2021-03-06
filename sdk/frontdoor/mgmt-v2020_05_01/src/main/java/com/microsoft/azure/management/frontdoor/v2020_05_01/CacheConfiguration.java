/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Caching settings for a caching-type route. To disable caching, do not
 * provide a cacheConfiguration object.
 */
public class CacheConfiguration {
    /**
     * Treatment of URL query terms when forming the cache key. Possible values
     * include: 'StripNone', 'StripAll', 'StripOnly', 'StripAllExcept'.
     */
    @JsonProperty(value = "queryParameterStripDirective")
    private FrontDoorQuery queryParameterStripDirective;

    /**
     * query parameters to include or exclude (comma separated).
     */
    @JsonProperty(value = "queryParameters")
    private String queryParameters;

    /**
     * Whether to use dynamic compression for cached content. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "dynamicCompression")
    private DynamicCompressionEnabled dynamicCompression;

    /**
     * The duration for which the content needs to be cached. Allowed format is
     * in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).
     * HTTP requires the value to be no more than a year.
     */
    @JsonProperty(value = "cacheDuration")
    private Period cacheDuration;

    /**
     * Get treatment of URL query terms when forming the cache key. Possible values include: 'StripNone', 'StripAll', 'StripOnly', 'StripAllExcept'.
     *
     * @return the queryParameterStripDirective value
     */
    public FrontDoorQuery queryParameterStripDirective() {
        return this.queryParameterStripDirective;
    }

    /**
     * Set treatment of URL query terms when forming the cache key. Possible values include: 'StripNone', 'StripAll', 'StripOnly', 'StripAllExcept'.
     *
     * @param queryParameterStripDirective the queryParameterStripDirective value to set
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withQueryParameterStripDirective(FrontDoorQuery queryParameterStripDirective) {
        this.queryParameterStripDirective = queryParameterStripDirective;
        return this;
    }

    /**
     * Get query parameters to include or exclude (comma separated).
     *
     * @return the queryParameters value
     */
    public String queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set query parameters to include or exclude (comma separated).
     *
     * @param queryParameters the queryParameters value to set
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get whether to use dynamic compression for cached content. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the dynamicCompression value
     */
    public DynamicCompressionEnabled dynamicCompression() {
        return this.dynamicCompression;
    }

    /**
     * Set whether to use dynamic compression for cached content. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param dynamicCompression the dynamicCompression value to set
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withDynamicCompression(DynamicCompressionEnabled dynamicCompression) {
        this.dynamicCompression = dynamicCompression;
        return this;
    }

    /**
     * Get the duration for which the content needs to be cached. Allowed format is in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year.
     *
     * @return the cacheDuration value
     */
    public Period cacheDuration() {
        return this.cacheDuration;
    }

    /**
     * Set the duration for which the content needs to be cached. Allowed format is in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year.
     *
     * @param cacheDuration the cacheDuration value to set
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withCacheDuration(Period cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }

}
