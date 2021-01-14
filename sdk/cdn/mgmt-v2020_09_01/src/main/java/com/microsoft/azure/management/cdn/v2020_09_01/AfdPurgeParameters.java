/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters required for content purge.
 */
public class AfdPurgeParameters {
    /**
     * The path to the content to be purged. Can describe a file path or a wild
     * card directory.
     */
    @JsonProperty(value = "contentPaths", required = true)
    private List<String> contentPaths;

    /**
     * List of domains.
     */
    @JsonProperty(value = "domains")
    private List<String> domains;

    /**
     * Get the path to the content to be purged. Can describe a file path or a wild card directory.
     *
     * @return the contentPaths value
     */
    public List<String> contentPaths() {
        return this.contentPaths;
    }

    /**
     * Set the path to the content to be purged. Can describe a file path or a wild card directory.
     *
     * @param contentPaths the contentPaths value to set
     * @return the AfdPurgeParameters object itself.
     */
    public AfdPurgeParameters withContentPaths(List<String> contentPaths) {
        this.contentPaths = contentPaths;
        return this;
    }

    /**
     * Get list of domains.
     *
     * @return the domains value
     */
    public List<String> domains() {
        return this.domains;
    }

    /**
     * Set list of domains.
     *
     * @param domains the domains value to set
     * @return the AfdPurgeParameters object itself.
     */
    public AfdPurgeParameters withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

}
