// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.changefeed.implementation;

import com.azure.cosmos.implementation.Constants;
import com.azure.cosmos.implementation.Strings;
import com.azure.cosmos.implementation.feedranges.FeedRangeInternal;
import com.azure.cosmos.implementation.feedranges.FeedRangeInternalDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;

public class ChangeFeedStartFromInternalDeserializer extends StdDeserializer<ChangeFeedStartFromInternal>  {

    private static final long serialVersionUID = 1L;

    public ChangeFeedStartFromInternalDeserializer() {
        this(null);
    }

    public ChangeFeedStartFromInternalDeserializer(final Class<?> vc) {
        super(vc);
    }

    @Override
    public ChangeFeedStartFromInternal deserialize(
        final JsonParser parser,
        final DeserializationContext context)
        throws IOException {

        final JsonNode rootNode = parser.getCodec().readTree(parser);
        final ObjectMapper mapper = (ObjectMapper)parser.getCodec();

        return deserializeStartFromInternal(rootNode, mapper, parser);
    }

    public static ChangeFeedStartFromInternal deserializeStartFromInternal(
        JsonNode rootNode,
        ObjectMapper mapper,
        JsonParser parser)  throws IOException {

        JsonNode typeNode = rootNode.get(Constants.Properties.CHANGE_FEED_START_FROM_TYPE);
        if (typeNode == null || !typeNode.isTextual() || Strings.isNullOrWhiteSpace(typeNode.textValue())) {
            throw JsonMappingException.from(
                parser,
                String.format(
                    "Required property '%s' missing or does not have a valid value.",
                    Constants.Properties.CHANGE_FEED_START_FROM_TYPE));
        }

        ChangeFeedStartFromTypes type;
        try {
            type = ChangeFeedStartFromTypes.valueOf(typeNode.textValue().toUpperCase());
        }
        catch (IllegalArgumentException argException) {
            throw JsonMappingException.from(
                parser,
                String.format(
                    "Value '%s' for required property '%s' does not have a valid value.",
                    typeNode.textValue(),
                    Constants.Properties.CHANGE_FEED_START_FROM_TYPE),
                argException);
        }

        switch (type) {
            case BEGINNING:
                return new ChangeFeedStartFromBeginningImpl();

            case NOW:
                return new ChangeFeedStartFromNowImpl();

            case POINT_IN_TIME:
                JsonNode pitNode = rootNode.get(Constants.Properties.CHANGE_FEED_START_FROM_POINT_IN_TIME_MS);
                if (pitNode == null || !pitNode.isLong()) {
                    throw JsonMappingException.from(
                        parser,
                        String.format(
                            "Required property '%s' missing or does not have a valid value.",
                            Constants.Properties.CHANGE_FEED_START_FROM_POINT_IN_TIME_MS));
                }
                return new ChangeFeedStartFromPointInTimeImpl(Instant.ofEpochMilli(pitNode.longValue()));

            case CONTINUATION:
                JsonNode continuationNode = rootNode.get(Constants.Properties.CHANGE_FEED_START_FROM_CONTINUATION);
                if (continuationNode == null || !continuationNode.isTextual() || Strings.isNullOrWhiteSpace(continuationNode.textValue())) {
                    throw JsonMappingException.from(
                        parser,
                        String.format(
                            "Required property '%s' missing or does not have a valid value.",
                            Constants.Properties.CHANGE_FEED_START_FROM_CONTINUATION));
                }
                return new ChangeFeedStartFromContinuationImpl(continuationNode.textValue());

            case LEASE:
                JsonNode etagNode = rootNode.get(Constants.Properties.CHANGE_FEED_START_FROM_ETAG);
                if (etagNode == null || !etagNode.isTextual() || Strings.isNullOrWhiteSpace(etagNode.textValue())) {
                    throw JsonMappingException.from(
                        parser,
                        String.format(
                            "Required property '%s' missing or does not have a valid value.",
                            Constants.Properties.CHANGE_FEED_START_FROM_ETAG));
                }
                FeedRangeInternal feedRange = FeedRangeInternalDeserializer
                    .deserializeFeedRange(rootNode, mapper, parser);
                return new ChangeFeedStartFromEtagAndFeedRangeImpl(
                    etagNode.textValue(),
                    feedRange);

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}