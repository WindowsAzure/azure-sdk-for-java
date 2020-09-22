// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.http.HttpHeaders;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.messaging.servicebus.implementation.models.CreateQueueBody;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Serializes and deserializes data plane responses from Service Bus.
 */
public class ServiceBusManagementSerializer implements SerializerAdapter {
    private static final String MINIMUM_DATETIME_FORMATTED = ">0001-01-01T00:00:00Z</";
    private static final Pattern MINIMUM_DATETIME_PATTERN = Pattern.compile(">0001-01-01T00:00:00</",
        Pattern.MULTILINE);
    private static final Pattern NAMESPACE_PATTERN = Pattern.compile(
        "xmlns:(?<namespace>\\w+)=\"http://schemas\\.microsoft\\.com/netservices/2010/10/servicebus/connect\"",
        Pattern.MULTILINE);

    private final JacksonAdapter jacksonAdapter = new JacksonAdapter();
    private final ClientLogger logger = new ClientLogger(ServiceBusManagementSerializer.class);

    @Override
    public String serialize(Object object, SerializerEncoding encoding) throws IOException {
        final String contents = jacksonAdapter.serialize(object, encoding);

        // This hack exists because the service requires a global namespace for the XML rather than allowing
        // each XML element to be prefaced with an explicit namespace. For example:
        // xmlns="foo" works because "foo" is assigned the global namespace.
        // xmlns:ns0="foo", and then prefixing all elements with ns0:AuthorizationRule will break.
        if (object instanceof CreateQueueBody) {
            final Matcher matcher = NAMESPACE_PATTERN.matcher(contents);
            if (matcher.find()) {
                final String namespace = matcher.group("namespace");
                return contents
                    .replaceAll(namespace + ":", "")
                    .replace("xmlns:" + namespace + "=", "xmlns=");
            }
        }

        return contents;
    }

    @Override
    public String serializeRaw(Object object) {
        return jacksonAdapter.serializeRaw(object);
    }

    @Override
    public String serializeList(List<?> list, CollectionFormat format) {
        return jacksonAdapter.serializeList(list, format);
    }

    public <T> T deserialize(String value, Type type) throws IOException {
        final Matcher matcher = MINIMUM_DATETIME_PATTERN.matcher(value);
        final String serializedString;

        // We have to replace matches because service returns a format that is not parsable from OffsetDateTime when
        // entities are created.
        if (matcher.find(0)) {
            logger.verbose("Found instances of '{}' to replace. Value: {}", MINIMUM_DATETIME_PATTERN.pattern(), value);
            serializedString = matcher.replaceAll(MINIMUM_DATETIME_FORMATTED);
        } else {
            serializedString = value;
        }

        return jacksonAdapter.deserialize(serializedString, type, SerializerEncoding.XML);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String value, Type type, SerializerEncoding encoding) throws IOException {
        if (encoding != SerializerEncoding.XML) {
            return jacksonAdapter.deserialize(value, type, encoding);
        }

        if (Object.class == type) {
            return (T) value;
        } else {
            return (T) deserialize(value, type);
        }
    }

    @Override
    public <T> T deserialize(HttpHeaders headers, Type type) throws IOException {
        return jacksonAdapter.deserialize(headers, type);
    }
}
