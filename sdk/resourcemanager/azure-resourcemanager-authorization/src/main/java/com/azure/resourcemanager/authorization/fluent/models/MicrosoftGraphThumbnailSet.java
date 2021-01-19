// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** thumbnailSet. */
@Fluent
public final class MicrosoftGraphThumbnailSet extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphThumbnailSet.class);

    /*
     * thumbnail
     */
    @JsonProperty(value = "large")
    private MicrosoftGraphThumbnail large;

    /*
     * thumbnail
     */
    @JsonProperty(value = "medium")
    private MicrosoftGraphThumbnail medium;

    /*
     * thumbnail
     */
    @JsonProperty(value = "small")
    private MicrosoftGraphThumbnail small;

    /*
     * thumbnail
     */
    @JsonProperty(value = "source")
    private MicrosoftGraphThumbnail source;

    /*
     * thumbnailSet
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the large property: thumbnail.
     *
     * @return the large value.
     */
    public MicrosoftGraphThumbnail large() {
        return this.large;
    }

    /**
     * Set the large property: thumbnail.
     *
     * @param large the large value to set.
     * @return the MicrosoftGraphThumbnailSet object itself.
     */
    public MicrosoftGraphThumbnailSet withLarge(MicrosoftGraphThumbnail large) {
        this.large = large;
        return this;
    }

    /**
     * Get the medium property: thumbnail.
     *
     * @return the medium value.
     */
    public MicrosoftGraphThumbnail medium() {
        return this.medium;
    }

    /**
     * Set the medium property: thumbnail.
     *
     * @param medium the medium value to set.
     * @return the MicrosoftGraphThumbnailSet object itself.
     */
    public MicrosoftGraphThumbnailSet withMedium(MicrosoftGraphThumbnail medium) {
        this.medium = medium;
        return this;
    }

    /**
     * Get the small property: thumbnail.
     *
     * @return the small value.
     */
    public MicrosoftGraphThumbnail small() {
        return this.small;
    }

    /**
     * Set the small property: thumbnail.
     *
     * @param small the small value to set.
     * @return the MicrosoftGraphThumbnailSet object itself.
     */
    public MicrosoftGraphThumbnailSet withSmall(MicrosoftGraphThumbnail small) {
        this.small = small;
        return this;
    }

    /**
     * Get the source property: thumbnail.
     *
     * @return the source value.
     */
    public MicrosoftGraphThumbnail source() {
        return this.source;
    }

    /**
     * Set the source property: thumbnail.
     *
     * @param source the source value to set.
     * @return the MicrosoftGraphThumbnailSet object itself.
     */
    public MicrosoftGraphThumbnailSet withSource(MicrosoftGraphThumbnail source) {
        this.source = source;
        return this;
    }

    /**
     * Get the additionalProperties property: thumbnailSet.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: thumbnailSet.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphThumbnailSet object itself.
     */
    public MicrosoftGraphThumbnailSet withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphThumbnailSet withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (large() != null) {
            large().validate();
        }
        if (medium() != null) {
            medium().validate();
        }
        if (small() != null) {
            small().validate();
        }
        if (source() != null) {
            source().validate();
        }
    }
}
