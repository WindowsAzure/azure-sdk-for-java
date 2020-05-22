// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.serializer;

import com.azure.core.http.HttpHeaders;
import com.azure.core.util.logging.ClientLogger;

import java.util.Map;
import java.util.TreeMap;

/**
 * Supported serialization encoding formats.
 */
public enum SerializerEncoding {
    /**
     * JavaScript Object Notation.
     */
    JSON,

    /**
     * Extensible Markup Language.
     */
    XML,

    /**
     * Plaintext.
     */
    TEXT;

    private static final ClientLogger LOGGER = new ClientLogger(SerializerEncoding.class);
    private static final String CONTENT_TYPE = "Content-Type";
    private static final Map<String, SerializerEncoding> SUPPORTED_MIME_TYPES;
    private static final TreeMap<String, SerializerEncoding> SUPPORTED_SUFFIXES;
    private static final SerializerEncoding DEFAULT_ENCODING = JSON;


    static {
        // Encodings and suffixes from: https://tools.ietf.org/html/rfc6838
        SUPPORTED_MIME_TYPES = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        SUPPORTED_MIME_TYPES.put("text/xml", XML);
        SUPPORTED_MIME_TYPES.put("application/xml", XML);
        SUPPORTED_MIME_TYPES.put("application/json", JSON);
        SUPPORTED_MIME_TYPES.put("text/plain", TEXT);

        SUPPORTED_SUFFIXES = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        SUPPORTED_SUFFIXES.put("xml", XML);
        SUPPORTED_SUFFIXES.put("json", JSON);
        SUPPORTED_SUFFIXES.put("plain", TEXT);
    }

    /**
     * Determines the serializer encoding to use based on the {@code Content-Type} header.
     * <p>
     * If the {@code Content-Type} is unknown {@link #JSON} will be returned.
     *
     * @param headers The {@link HttpHeaders} that will be used to retrieve the {@code Content-Type} header.
     * @return The serializer encoding to use when handling the body.
     */
    public static SerializerEncoding fromHeaders(HttpHeaders headers) {
        final String mimeContentType = headers.getValue(CONTENT_TYPE);
        if (mimeContentType == null || mimeContentType.isEmpty()) {
            LOGGER.warning("'{}' not found. Returning default encoding: {}", CONTENT_TYPE, DEFAULT_ENCODING);
            return DEFAULT_ENCODING;
        }

        final SerializerEncoding encoding = SUPPORTED_MIME_TYPES.get(mimeContentType);
        if (encoding != null) {
            return encoding;
        }

        final String[] parts = mimeContentType.split(";");
        final String[] mimeTypeParts = parts[0].split("/");
        if (mimeTypeParts.length != 2) {
            LOGGER.warning("Content-Type '{}' does not match mime-type formatting 'type'/'subtype'. "
                + "Returning default: {}", parts[0], DEFAULT_ENCODING);
            return DEFAULT_ENCODING;
        }

        // Check the suffix if it does not match the full types.
        final String subtype = mimeTypeParts[1];
        final int lastIndex = subtype.lastIndexOf("+");
        if (lastIndex == -1) {
            return DEFAULT_ENCODING;
        }

        final String mimeTypeSuffix = subtype.substring(lastIndex + 1);
        final SerializerEncoding serializerEncoding = SUPPORTED_SUFFIXES.get(mimeTypeSuffix);
        if (serializerEncoding != null) {
            return serializerEncoding;
        }

        LOGGER.warning("Content-Type '{}' does not match any supported one. Returning default: {}",
            mimeContentType, DEFAULT_ENCODING);

        return DEFAULT_ENCODING;
    }
}
