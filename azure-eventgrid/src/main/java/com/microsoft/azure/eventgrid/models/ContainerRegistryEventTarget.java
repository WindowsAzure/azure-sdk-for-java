/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The target of the event.
 */
public class ContainerRegistryEventTarget {
    /**
     * The MIME type of the referenced object.
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /**
     * The number of bytes of the content. Same as Length field.
     */
    @JsonProperty(value = "size")
    private Long size;

    /**
     * The digest of the content, as defined by the Registry V2 HTTP API
     * Specification.
     */
    @JsonProperty(value = "digest")
    private String digest;

    /**
     * The number of bytes of the content. Same as Size field.
     */
    @JsonProperty(value = "length")
    private Long length;

    /**
     * The repository name.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /**
     * The direct URL to the content.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The tag name.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the mediaType value.
     *
     * @return the mediaType value
     */
    public String mediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType value.
     *
     * @param mediaType the mediaType value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the digest value.
     *
     * @return the digest value
     */
    public String digest() {
        return this.digest;
    }

    /**
     * Set the digest value.
     *
     * @param digest the digest value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the length value.
     *
     * @return the length value
     */
    public Long length() {
        return this.length;
    }

    /**
     * Set the length value.
     *
     * @param length the length value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withLength(Long length) {
        this.length = length;
        return this;
    }

    /**
     * Get the repository value.
     *
     * @return the repository value
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository value.
     *
     * @param repository the repository value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the tag value.
     *
     * @return the tag value
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag value.
     *
     * @param tag the tag value to set
     * @return the ContainerRegistryEventTarget object itself.
     */
    public ContainerRegistryEventTarget withTag(String tag) {
        this.tag = tag;
        return this;
    }

}
