// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.feedranges;

import com.azure.cosmos.implementation.DocumentCollection;
import com.azure.cosmos.implementation.IRoutingMapProvider;
import com.azure.cosmos.implementation.JsonSerializable;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.routing.Range;
import com.azure.cosmos.models.FeedRange;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

@JsonDeserialize(using = FeedRangeInternalDeserializer.class)
public abstract class FeedRangeInternal extends JsonSerializable implements FeedRange {
    private final static Logger LOGGER = LoggerFactory.getLogger(FeedRangeInternal.class);

    public static FeedRangeInternal convert(final FeedRange feedRange) {
        checkNotNull(feedRange, "Argument 'feedRange' must not be null");
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
        FeedRangeInternal parsedRange = FeedRangeInternal.tryParse(json);

        if (parsedRange == null) {
            throw new IllegalArgumentException(
                String.format(
                    "The provided string '%s' does not represent any known format.",
                    json));
        }

        return parsedRange;
    }

    public abstract Mono<Range<String>> getEffectiveRange(
        IRoutingMapProvider routingMapProvider,
        RxDocumentServiceRequest request,
        Mono<Utils.ValueHolder<DocumentCollection>> collectionResolutionMono);

    public abstract Mono<List<String>> getPartitionKeyRanges(
        IRoutingMapProvider routingMapProvider,
        RxDocumentServiceRequest request,
        Mono<Utils.ValueHolder<DocumentCollection>> collectionResolutionMono);

    public abstract Mono<RxDocumentServiceRequest> populateFeedRangeFilteringHeaders(
        IRoutingMapProvider routingMapProvider,
        RxDocumentServiceRequest request,
        Mono<Utils.ValueHolder<DocumentCollection>> collectionResolutionMono);

    public void populatePropertyBag() {
        setProperties(this, false);
    }

    @Override
    public abstract String toString();

    public abstract void removeProperties(JsonSerializable serializable);

    public void setProperties(
        JsonSerializable serializable,
        boolean populateProperties) {

        if (populateProperties) {
            super.populatePropertyBag();
        }
    }

    @Override
    public String toJsonString() {
        return this.toJson();
    }

    public static FeedRangeInternal tryParse(final String jsonString) {
        checkNotNull(jsonString, "Argument 'jsonString' must not be null");
        final ObjectMapper mapper = Utils.getSimpleObjectMapper();

        try {
            return mapper.readValue(jsonString, FeedRangeInternal.class);
        } catch (final IOException ioError) {
            LOGGER.debug("Failed to parse feed range JSON {}", jsonString, ioError);
            return null;
        }
    }
}
