/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest.v3;

import com.microsoft.rest.v3.util.Base64Util;

import java.util.Arrays;

/**
 * Wrapper over Base64Url encoded byte array used during serialization and deserialization.
 */
public final class Base64Url {
    /**
     * The Base64Url encoded bytes.
     */
    private final byte[] bytes;

    /**
     * Creates a new Base64Url object with the specified encoded string.
     *
     * @param string The encoded string.
     */
    public Base64Url(String string) {
        if (string == null) {
            this.bytes = null;
        } else {
            string = unquote(string);
            this.bytes = string.getBytes();
        }
    }

    /**
     * Creates a new Base64Url object with the specified encoded bytes.
     *
     * @param bytes The encoded bytes.
     */
    public Base64Url(byte[] bytes) {
        this.bytes = unquote(bytes);
    }

    private static byte[] unquote(byte[] bytes) {
        if (bytes != null && bytes.length > 1) {
            bytes = unquote(new String(bytes)).getBytes();
        }
        return bytes;
    }

    private static String unquote(String string) {
        if (string != null && !string.isEmpty()) {
            final char firstCharacter = string.charAt(0);
            if (firstCharacter == '\"' || firstCharacter == '\'') {
                final int base64UrlStringLength = string.length();
                final char lastCharacter = string.charAt(base64UrlStringLength - 1);
                if (lastCharacter == firstCharacter) {
                    string = string.substring(1, base64UrlStringLength - 1);
                }
            }
        }
        return string;
    }

    /**
     * Encode a byte array into Base64Url encoded bytes.
     *
     * @param bytes The byte array to encode.
     * @return a Base64Url instance
     */
    public static Base64Url encode(byte[] bytes) {
        if (bytes == null) {
            return new Base64Url((String) null);
        } else {
            return new Base64Url(Base64Util.encodeURLWithoutPadding(bytes));
        }
    }

    /**
     * Returns the underlying encoded byte array.
     *
     * @return The underlying encoded byte array.
     */
    public byte[] encodedBytes() {
        return bytes;
    }

    /**
     * Decode the bytes and return.
     *
     * @return The decoded byte array.
     */
    public byte[] decodedBytes() {
        if (this.bytes == null) {
            return null;
        }

        final byte[] decodedBytes = Base64Util.decodeURL(bytes);
        return decodedBytes;
    }

    @Override
    public String toString() {
        return bytes == null ? null : new String(bytes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Base64Url)) {
            return false;
        }

        Base64Url rhs = (Base64Url) obj;
        return Arrays.equals(this.bytes, rhs.encodedBytes());
    }
}