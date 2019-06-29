// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Additional parameters for a set of operations.
 */
@JacksonXmlRootElement(localName = "source-modified-access-conditions")
public final class SourceModifiedAccessConditions {
    /*
     * Specify this header value to operate only on a blob if it has been
     * modified since the specified date/time.
     */
    @JsonProperty(value = "sourceIfModifiedSince")
    private DateTimeRfc1123 sourceIfModifiedSince;

    /*
     * Specify this header value to operate only on a blob if it has not been
     * modified since the specified date/time.
     */
    @JsonProperty(value = "sourceIfUnmodifiedSince")
    private DateTimeRfc1123 sourceIfUnmodifiedSince;

    /*
     * Specify an ETag value to operate only on blobs with a matching value.
     */
    @JsonProperty(value = "sourceIfMatch")
    private String sourceIfMatch;

    /*
     * Specify an ETag value to operate only on blobs without a matching value.
     */
    @JsonProperty(value = "sourceIfNoneMatch")
    private String sourceIfNoneMatch;

    /**
     * Get the sourceIfModifiedSince property: Specify this header value to
     * operate only on a blob if it has been modified since the specified
     * date/time.
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
     * Set the sourceIfModifiedSince property: Specify this header value to
     * operate only on a blob if it has been modified since the specified
     * date/time.
     *
     * @param sourceIfModifiedSince the sourceIfModifiedSince value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions sourceIfModifiedSince(OffsetDateTime sourceIfModifiedSince) {
        if (sourceIfModifiedSince == null) {
            this.sourceIfModifiedSince = null;
        } else {
            this.sourceIfModifiedSince = new DateTimeRfc1123(sourceIfModifiedSince);
        }
        return this;
    }

    /**
     * Get the sourceIfUnmodifiedSince property: Specify this header value to
     * operate only on a blob if it has not been modified since the specified
     * date/time.
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
     * Set the sourceIfUnmodifiedSince property: Specify this header value to
     * operate only on a blob if it has not been modified since the specified
     * date/time.
     *
     * @param sourceIfUnmodifiedSince the sourceIfUnmodifiedSince value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions sourceIfUnmodifiedSince(OffsetDateTime sourceIfUnmodifiedSince) {
        if (sourceIfUnmodifiedSince == null) {
            this.sourceIfUnmodifiedSince = null;
        } else {
            this.sourceIfUnmodifiedSince = new DateTimeRfc1123(sourceIfUnmodifiedSince);
        }
        return this;
    }

    /**
     * Get the sourceIfMatch property: Specify an ETag value to operate only on
     * blobs with a matching value.
     *
     * @return the sourceIfMatch value.
     */
    public String sourceIfMatch() {
        return this.sourceIfMatch;
    }

    /**
     * Set the sourceIfMatch property: Specify an ETag value to operate only on
     * blobs with a matching value.
     *
     * @param sourceIfMatch the sourceIfMatch value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions sourceIfMatch(String sourceIfMatch) {
        this.sourceIfMatch = sourceIfMatch;
        return this;
    }

    /**
     * Get the sourceIfNoneMatch property: Specify an ETag value to operate
     * only on blobs without a matching value.
     *
     * @return the sourceIfNoneMatch value.
     */
    public String sourceIfNoneMatch() {
        return this.sourceIfNoneMatch;
    }

    /**
     * Set the sourceIfNoneMatch property: Specify an ETag value to operate
     * only on blobs without a matching value.
     *
     * @param sourceIfNoneMatch the sourceIfNoneMatch value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions sourceIfNoneMatch(String sourceIfNoneMatch) {
        this.sourceIfNoneMatch = sourceIfNoneMatch;
        return this;
    }
}
