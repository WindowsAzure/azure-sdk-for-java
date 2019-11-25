/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the content link.
 */
public class ContentLink {
    /**
     * Gets or sets the uri of the runbook content.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Gets or sets the hash.
     */
    @JsonProperty(value = "contentHash")
    private ContentHash contentHash;

    /**
     * Gets or sets the version of the content.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get gets or sets the uri of the runbook content.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set gets or sets the uri of the runbook content.
     *
     * @param uri the uri value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get gets or sets the hash.
     *
     * @return the contentHash value
     */
    public ContentHash contentHash() {
        return this.contentHash;
    }

    /**
     * Set gets or sets the hash.
     *
     * @param contentHash the contentHash value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withContentHash(ContentHash contentHash) {
        this.contentHash = contentHash;
        return this;
    }

    /**
     * Get gets or sets the version of the content.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set gets or sets the version of the content.
     *
     * @param version the version value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withVersion(String version) {
        this.version = version;
        return this;
    }

}
