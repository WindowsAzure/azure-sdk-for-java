// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Target model.
 */
@Fluent
public final class Target {
    /*
     * The MIME type of the referenced object.
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /*
     * The number of bytes of the content. Same as Length field.
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * The digest of the content, as defined by the Registry V2 HTTP API
     * Specification.
     */
    @JsonProperty(value = "digest")
    private String digest;

    /*
     * The number of bytes of the content. Same as Size field.
     */
    @JsonProperty(value = "length")
    private Long length;

    /*
     * The repository name.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /*
     * The direct URL to the content.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * The tag name.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * The name of the artifact.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The version of the artifact.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the mediaType property: The MIME type of the referenced object.
     * 
     * @return the mediaType value.
     */
    public String mediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType property: The MIME type of the referenced object.
     * 
     * @param mediaType the mediaType value to set.
     * @return the Target object itself.
     */
    public Target withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the size property: The number of bytes of the content. Same as
     * Length field.
     * 
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: The number of bytes of the content. Same as
     * Length field.
     * 
     * @param size the size value to set.
     * @return the Target object itself.
     */
    public Target withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the digest property: The digest of the content, as defined by the
     * Registry V2 HTTP API Specification.
     * 
     * @return the digest value.
     */
    public String digest() {
        return this.digest;
    }

    /**
     * Set the digest property: The digest of the content, as defined by the
     * Registry V2 HTTP API Specification.
     * 
     * @param digest the digest value to set.
     * @return the Target object itself.
     */
    public Target withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the length property: The number of bytes of the content. Same as
     * Size field.
     * 
     * @return the length value.
     */
    public Long length() {
        return this.length;
    }

    /**
     * Set the length property: The number of bytes of the content. Same as
     * Size field.
     * 
     * @param length the length value to set.
     * @return the Target object itself.
     */
    public Target withLength(Long length) {
        this.length = length;
        return this;
    }

    /**
     * Get the repository property: The repository name.
     * 
     * @return the repository value.
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository property: The repository name.
     * 
     * @param repository the repository value to set.
     * @return the Target object itself.
     */
    public Target withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the url property: The direct URL to the content.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The direct URL to the content.
     * 
     * @param url the url value to set.
     * @return the Target object itself.
     */
    public Target withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the tag property: The tag name.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag name.
     * 
     * @param tag the tag value to set.
     * @return the Target object itself.
     */
    public Target withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the name property: The name of the artifact.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the artifact.
     * 
     * @param name the name value to set.
     * @return the Target object itself.
     */
    public Target withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The version of the artifact.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the artifact.
     * 
     * @param version the version value to set.
     * @return the Target object itself.
     */
    public Target withVersion(String version) {
        this.version = version;
        return this;
    }
}
