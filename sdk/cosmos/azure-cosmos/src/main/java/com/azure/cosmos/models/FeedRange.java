// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.implementation.feedranges.FeedRangeEpkImpl;
import com.azure.cosmos.implementation.feedranges.FeedRangeInternal;
import com.azure.cosmos.implementation.feedranges.FeedRangePartitionKeyImpl;
import com.azure.cosmos.implementation.routing.PartitionKeyInternal;
import com.azure.cosmos.util.Beta;

import java.io.IOException;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

@Beta(value = Beta.SinceVersion.V4_9_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
public interface FeedRange {
    /**
     * Creates a range from a previously obtained string representation.
     *
     * @param json A string representation of a feed range
     * @return A feed range
     */
    @Beta(value = Beta.SinceVersion.V4_9_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    public static FeedRange fromJsonString(String json) {
        return FeedRangeInternal.fromJsonString(json);
    }

    /**
     * Gets a json representation of the feed range - the returned json string can be used
     * to create a new feed range instance from it - <see>{@Link fromJsonString}</see>
     * @return a JSON string representing the feed range
     */
    @Beta(value = Beta.SinceVersion.V4_9_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    public String toJsonString();

    /**
     * Creates a range for a certain logical partition
     * @param partitionKey
     * @return A feed range for a certain logical partition
     */
    @Beta(value = Beta.SinceVersion.WHATEVER_NEW_VERSION, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    public static FeedRange forLogicalPartition(PartitionKey partitionKey) {
        checkNotNull(partitionKey, "Argument 'partitionKey' must not be null.");

        return new FeedRangePartitionKeyImpl(
            ModelBridgeInternal.getPartitionKeyInternal(partitionKey));
    }

    /**
     * Creates a range for an entire container
     * @return A feed range for an entire container
     */
    @Beta(value = Beta.SinceVersion.WHATEVER_NEW_VERSION, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    public static FeedRange forFullRange() {
        return FeedRangeEpkImpl.forFullRange();
    }
}