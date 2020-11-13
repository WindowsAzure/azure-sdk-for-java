// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.feedranges;

import com.azure.cosmos.implementation.Constants;
import com.azure.cosmos.implementation.IRoutingMapProvider;
import com.azure.cosmos.implementation.JsonSerializable;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.apachecommons.collections.list.UnmodifiableList;
import com.azure.cosmos.implementation.routing.PartitionKeyInternal;
import com.azure.cosmos.implementation.routing.Range;
import com.azure.cosmos.models.FeedRange;
import com.azure.cosmos.models.PartitionKeyDefinition;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import reactor.core.publisher.Mono;

import java.io.IOException;

public abstract class FeedRangeInternal extends JsonSerializable implements FeedRange {

    public abstract void accept(FeedRangeVisitor visitor);

    public abstract <TInput> void accept(GenericFeedRangeVisitor<TInput> visitor, TInput input);

    public abstract <T> Mono<T> acceptAsync(FeedRangeAsyncVisitor<T> visitor);

    public static FeedRangeInternal convert(final FeedRange feedRange) {
        if (feedRange == null) {
            throw new NullPointerException("feedRange");
        }

        if (feedRange instanceof FeedRangeInternal) {
            return (FeedRangeInternal)feedRange;
        }

        String json = feedRange.toJsonString();
        return fromJsonString(json);
    }

    /**
     * Creates a range from a previously obtained string representation.
     *
     * @param json A string representation of a feed range
     * @return A feed range
     */
    public static FeedRangeInternal fromJsonString(String json) {
        FeedRangeInternal parsedRange;

        try {
            parsedRange = FeedRangeInternal.tryParse(json);
        } catch (IOException e) {
            throw new IllegalArgumentException(
                String.format("Unable to parse JSON %s", json), e);
        }

        if (parsedRange == null) {
            throw new IllegalArgumentException(
                String.format(
                    "The provided string '%s' does not represent any known format.",
                    json));
        }

        return parsedRange;
    }

    public abstract Mono<UnmodifiableList<Range<String>>> getEffectiveRangesAsync(
        IRoutingMapProvider routingMapProvider,
        String containerRid,
        PartitionKeyDefinition partitionKeyDefinition);

    public abstract Mono<UnmodifiableList<String>> getPartitionKeyRangesAsync(
        IRoutingMapProvider routingMapProvider,
        String containerRid,
        PartitionKeyDefinition partitionKeyDefinition);

    public void populatePropertyBag() {
        super.populatePropertyBag();
    }

    @Override
    public abstract String toString();

    @Override
    public String toJsonString() {
        return this.toJson();
    }

    public static FeedRangeInternal tryParse(final String jsonString) throws IOException {
        if (jsonString == null) {
            throw new NullPointerException("jsonString");
        }

        final ObjectMapper mapper = Utils.getSimpleObjectMapper();
        JsonNode rootNode = mapper.readTree(jsonString);

        JsonNode rangeNode = rootNode.get(Constants.Properties.RANGE);
        if (rangeNode != null && rangeNode.isObject()) {
            Range<String> range = new Range<>((ObjectNode)rangeNode);
            return new FeedRangeEpkImpl(range);
        }

        JsonNode pkNode = rootNode.get(Constants.Properties.FEED_RANGE_PARTITION_KEY);
        if (pkNode != null && pkNode.isArray()) {
            PartitionKeyInternal pk = mapper.convertValue(pkNode, PartitionKeyInternal.class);
            return new FeedRangePartitionKeyImpl(pk);
        }

        JsonNode pkRangeIdNode =
            rootNode.get(Constants.Properties.FEED_RANGE_PARTITION_KEY_RANGE_ID);
        if (pkRangeIdNode != null && pkRangeIdNode.isTextual()) {
            return new FeedRangePartitionKeyRangeImpl(pkRangeIdNode.asText());
        }

        return null;
    }
}