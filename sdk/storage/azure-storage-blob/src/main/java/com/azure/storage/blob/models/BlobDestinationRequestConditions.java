// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.azure.core.http.RequestConditions;

import java.time.OffsetDateTime;

/**
 * This class contains values which will restrict the successful operation of a variety of blob requests to the
 * conditions present on the destination blob. These conditions are entirely optional. The entire object or any of its
 * properties may be set to null when passed to a method to indicate that those conditions are not desired. Please
 * refer to the type of each field for more information on those particular access conditions.
 */
public class BlobDestinationRequestConditions extends RequestConditions {
    private String tagsConditions;

    /**
     * Optionally limit requests to resources that match the passed ETag.
     *
     * @param ifMatch ETag that resources must match.
     * @return The updated BlobDestinationRequestConditions object.
     */
    @Override
    public BlobDestinationRequestConditions setIfMatch(String ifMatch) {
        super.setIfMatch(ifMatch);
        return this;
    }

    /**
     * Optionally limit requests to resources that do not match the passed ETag.
     *
     * @param ifNoneMatch ETag that resources must not match.
     * @return The updated BlobDestinationRequestConditions object.
     */
    @Override
    public BlobDestinationRequestConditions setIfNoneMatch(String ifNoneMatch) {
        super.setIfNoneMatch(ifNoneMatch);
        return this;
    }

    /**
     * Optionally limit requests to resources that have only been modified since the passed
     * {@link OffsetDateTime datetime}.
     *
     * @param ifModifiedSince The datetime that resources must have been modified since.
     * @return The updated BlobDestinationRequestConditions object.
     */
    @Override
    public BlobDestinationRequestConditions setIfModifiedSince(OffsetDateTime ifModifiedSince) {
        super.setIfModifiedSince(ifModifiedSince);
        return this;
    }

    /**
     * Optionally limit requests to resources that have remained unmodified since the passed
     * {@link OffsetDateTime datetime}.
     *
     * @param ifUnmodifiedSince The datetime that resources must have remained unmodified since.
     * @return The updated BlobDestinationRequestConditions object.
     */
    @Override
    public BlobDestinationRequestConditions setIfUnmodifiedSince(OffsetDateTime ifUnmodifiedSince) {
        super.setIfUnmodifiedSince(ifUnmodifiedSince);
        return this;
    }

    /**
     * Gets the SQL statement that apply to the tags of the blob.
     *
     * @return The SQL statement that apply to the tags of the blob.
     */
    public String getTagsConditions() {
        return tagsConditions;
    }

    /**
     * Optionally applies the SQL statement to the tags of the blob.
     *
     * @param tagsConditions The SQL statement that apply to the tags of the blob.
     * @return The updated BlobDestinationRequestConditions object.
     */
    public BlobDestinationRequestConditions setTagsConditions(String tagsConditions) {
        this.tagsConditions = tagsConditions;
        return this;
    }
}
