// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;

import java.time.OffsetDateTime;

/**
 * Additional parameters for a set of operations.
 */
@JacksonXmlRootElement(localName = "source-modified-access-conditions")
public final class SourceModifiedAccessConditions {
    /**
     * Specify this header value to operate only on a blob if it has been
     * modified since the specified date/time.
     */
    @JsonProperty(value = "SourceIfModifiedSince")
    private DateTimeRfc1123 sourceIfModifiedSince;

    /**
     * Specify this header value to operate only on a blob if it has not been
     * modified since the specified date/time.
     */
    @JsonProperty(value = "SourceIfUnmodifiedSince")
    private DateTimeRfc1123 sourceIfUnmodifiedSince;

    /**
     * Specify an ETag value to operate only on blobs with a matching value.
     */
    @JsonProperty(value = "SourceIfMatch")
    private String sourceIfMatch;

    /**
     * Specify an ETag value to operate only on blobs without a matching value.
     */
    @JsonProperty(value = "SourceIfNoneMatch")
    private String sourceIfNoneMatch;

    /**
     * Get the sourceIfModifiedSince value.
     *
     * @return the sourceIfModifiedSince value.
     */
    public OffsetDateTime sourceIfModifiedSince() {
        if (this.sourceIfModifiedSince == null) {
            return null;
        }
        return this.sourceIfModifiedSince.dateTime();
    }

    /**
     * Set the sourceIfModifiedSince value.
     *
     * @param sourceIfModifiedSince the sourceIfModifiedSince value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions withSourceIfModifiedSince(OffsetDateTime sourceIfModifiedSince) {
        if (sourceIfModifiedSince == null) {
            this.sourceIfModifiedSince = null;
        } else {
            this.sourceIfModifiedSince = new DateTimeRfc1123(sourceIfModifiedSince);
        }
        return this;
    }

    /**
     * Get the sourceIfUnmodifiedSince value.
     *
     * @return the sourceIfUnmodifiedSince value.
     */
    public OffsetDateTime sourceIfUnmodifiedSince() {
        if (this.sourceIfUnmodifiedSince == null) {
            return null;
        }
        return this.sourceIfUnmodifiedSince.dateTime();
    }

    /**
     * Set the sourceIfUnmodifiedSince value.
     *
     * @param sourceIfUnmodifiedSince the sourceIfUnmodifiedSince value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions withSourceIfUnmodifiedSince(OffsetDateTime sourceIfUnmodifiedSince) {
        if (sourceIfUnmodifiedSince == null) {
            this.sourceIfUnmodifiedSince = null;
        } else {
            this.sourceIfUnmodifiedSince = new DateTimeRfc1123(sourceIfUnmodifiedSince);
        }
        return this;
    }

    /**
     * Get the sourceIfMatch value.
     *
     * @return the sourceIfMatch value.
     */
    public String sourceIfMatch() {
        return this.sourceIfMatch;
    }

    /**
     * Set the sourceIfMatch value.
     *
     * @param sourceIfMatch the sourceIfMatch value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions withSourceIfMatch(String sourceIfMatch) {
        this.sourceIfMatch = sourceIfMatch;
        return this;
    }

    /**
     * Get the sourceIfNoneMatch value.
     *
     * @return the sourceIfNoneMatch value.
     */
    public String sourceIfNoneMatch() {
        return this.sourceIfNoneMatch;
    }

    /**
     * Set the sourceIfNoneMatch value.
     *
     * @param sourceIfNoneMatch the sourceIfNoneMatch value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions withSourceIfNoneMatch(String sourceIfNoneMatch) {
        this.sourceIfNoneMatch = sourceIfNoneMatch;
        return this;
    }
}
