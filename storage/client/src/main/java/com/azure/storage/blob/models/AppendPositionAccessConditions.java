// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for a set of operations, such as:
 * AppendBlobs_appendBlock, AppendBlobs_appendBlockFromUrl.
 */
@JacksonXmlRootElement(localName = "append-position-access-conditions")
public final class AppendPositionAccessConditions {
    /*
     * Optional conditional header. The max length in bytes permitted for the
     * append blob. If the Append Block operation would cause the blob to
     * exceed that limit or if the blob size is already greater than the value
     * specified in this header, the request will fail with
     * MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition
     * Failed).
     */
    @JsonProperty(value = "maxSize")
    private Long maxSize;

    /*
     * Optional conditional header, used only for the Append Block operation. A
     * number indicating the byte offset to compare. Append Block will succeed
     * only if the append position is equal to this number. If it is not, the
     * request will fail with the AppendPositionConditionNotMet error (HTTP
     * status code 412 - Precondition Failed).
     */
    @JsonProperty(value = "appendPosition")
    private Long appendPosition;

    /**
     * Get the maxSize property: Optional conditional header. The max length in
     * bytes permitted for the append blob. If the Append Block operation would
     * cause the blob to exceed that limit or if the blob size is already
     * greater than the value specified in this header, the request will fail
     * with MaxBlobSizeConditionNotMet error (HTTP status code 412 -
     * Precondition Failed).
     *
     * @return the maxSize value.
     */
    public Long maxSize() {
        return this.maxSize;
    }

    /**
     * Set the maxSize property: Optional conditional header. The max length in
     * bytes permitted for the append blob. If the Append Block operation would
     * cause the blob to exceed that limit or if the blob size is already
     * greater than the value specified in this header, the request will fail
     * with MaxBlobSizeConditionNotMet error (HTTP status code 412 -
     * Precondition Failed).
     *
     * @param maxSize the maxSize value to set.
     * @return the AppendPositionAccessConditions object itself.
     */
    public AppendPositionAccessConditions maxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * Get the appendPosition property: Optional conditional header, used only
     * for the Append Block operation. A number indicating the byte offset to
     * compare. Append Block will succeed only if the append position is equal
     * to this number. If it is not, the request will fail with the
     * AppendPositionConditionNotMet error (HTTP status code 412 - Precondition
     * Failed).
     *
     * @return the appendPosition value.
     */
    public Long appendPosition() {
        return this.appendPosition;
    }

    /**
     * Set the appendPosition property: Optional conditional header, used only
     * for the Append Block operation. A number indicating the byte offset to
     * compare. Append Block will succeed only if the append position is equal
     * to this number. If it is not, the request will fail with the
     * AppendPositionConditionNotMet error (HTTP status code 412 - Precondition
     * Failed).
     *
     * @param appendPosition the appendPosition value to set.
     * @return the AppendPositionAccessConditions object itself.
     */
    public AppendPositionAccessConditions appendPosition(Long appendPosition) {
        this.appendPosition = appendPosition;
        return this;
    }
}
