// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.fluentcore.utils;

import com.azure.core.http.HttpHeaders;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * The class to collect all throttling info from response header
 */
public class ResourceManagerThrottlingInfo {
    // refer https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/request-limits-and-throttling
    private static final List<String> COMMON_RATE_LIMIT_HEADERS = Arrays.asList(
        "x-ms-ratelimit-remaining-subscription-reads",
        "x-ms-ratelimit-remaining-subscription-writes",
        "x-ms-ratelimit-remaining-tenant-reads",
        "x-ms-ratelimit-remaining-tenant-writes",
        "x-ms-ratelimit-remaining-subscription-resource-requests",
        "x-ms-ratelimit-remaining-subscription-resource-entities-read",
        "x-ms-ratelimit-remaining-tenant-resource-requests",
        "x-ms-ratelimit-remaining-tenant-resource-entities-read"
    );

    // refer https://docs.microsoft.com/en-us/azure/virtual-machines/troubleshooting/troubleshooting-throttling-errors
    private static final String RESOURCE_RATE_LIMIT_HEADERS = "x-ms-ratelimit-remaining-resource";

    private Map<String, String> commonRateLimits;
    private String resourceRateLimit;

    /**
     * Creates the throttling info class from response headers
     * @param headers the response headers
     */
    public ResourceManagerThrottlingInfo(HttpHeaders headers) {
        commonRateLimits = new HashMap<>();
        for (String header : COMMON_RATE_LIMIT_HEADERS) {
            String value = headers.getValue(header);
            if (value != null && !value.isEmpty()) {
                commonRateLimits.put(header, value);
            }
        }
        resourceRateLimit = headers.getValue(RESOURCE_RATE_LIMIT_HEADERS);
    }

    /**
     * Creates the throttling info class from response headers
     * @param headers the response headers
     */
    public static ResourceManagerThrottlingInfo fromHeaders(HttpHeaders headers) {
        return new ResourceManagerThrottlingInfo(headers);
    }

    /**
     * @return the smallest rate limit or empty if none of the headers are valid
     */
    public Optional<Integer> getRateLimit() {
        Optional<Integer> result = Optional.empty();
        for (Map.Entry<String, String> limits : commonRateLimits.entrySet()) {
            try {
                int limit = Integer.parseInt(limits.getValue());
                if (result.isEmpty() || result.get() > limit) {
                    result = Optional.of(limit);
                }
            } catch (NumberFormatException e) { }
        }
        return result;
    }

    /**
     * refer https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/request-limits-and-throttling
     * @return all headers associated with rate limit
     */
    public Map<String, String> getRateLimits() {
        return Collections.unmodifiableMap(commonRateLimits);
    }

    /**
     * refer https://docs.microsoft.com/en-us/azure/virtual-machines/troubleshooting/troubleshooting-throttling-errors
     * @return a specific rate limit from compute
     */
    public String getResourceRateLimit() {
        return resourceRateLimit;
    }
}
