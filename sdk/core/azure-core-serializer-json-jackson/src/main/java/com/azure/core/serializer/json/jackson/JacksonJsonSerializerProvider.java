// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer.json.jackson;

import com.azure.core.util.serializer.JsonSerializerProvider;
import com.azure.core.util.serializer.PropertyNameSerializerProvider;

/**
 * Implementation of {@link JsonSerializerProvider}.
 */
public class JacksonJsonSerializerProvider implements PropertyNameSerializerProvider {
    @Override
    public JacksonJsonSerializer createInstance() {
        return new JacksonJsonSerializerBuilder().build();
    }
}
