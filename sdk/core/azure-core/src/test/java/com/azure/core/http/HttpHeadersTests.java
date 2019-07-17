// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HttpHeadersTests {
    @Test
    public void testSet() {
        final HttpHeaders headers = new HttpHeaders();

        headers.put("a", "b");
        assertEquals("b", headers.value("a"));

        headers.put("a", "c");
        assertEquals("c", headers.value("a"));

        headers.put("a", null);
        assertNull(headers.value("a"));

        headers.put("A", "");
        assertEquals("", headers.value("a"));

        headers.put("A", "b");
        assertEquals("b", headers.value("A"));

        headers.put("a", null);
        assertNull(headers.value("a"));
    }
}
