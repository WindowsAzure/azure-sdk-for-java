// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncodedParameterTests {
    @Test
    public void constructor() {
        final EncodedParameter ep = new EncodedParameter("ABC", "123");
        assertEquals("ABC", ep.name());
        assertEquals("123", ep.encodedValue());
    }
}
