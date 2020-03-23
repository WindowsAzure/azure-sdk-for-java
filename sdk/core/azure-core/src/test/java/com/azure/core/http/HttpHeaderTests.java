// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http;

import com.azure.core.TestNamePrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpHeaderTests extends TestNamePrinter {
    @Test
    public void addValue() {
        final HttpHeader header = new HttpHeader("a", "b");
        header.addValue("c");
        assertEquals("a:b,c", header.toString());
    }
}
