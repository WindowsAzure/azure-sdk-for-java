// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.serializer.jackson;

import com.azure.core.experimental.serializer.JsonOptions;
import com.azure.core.experimental.serializer.JsonSerializer;
import com.azure.core.experimental.serializer.JsonSerializerProvider;

public class SearchJacksonSerializerProvider implements JsonSerializerProvider {
    @Override
    public JsonSerializer createInstance() {
        return new SearchJacksonSerializerBuilder().build();
    }

    @Override
    public JsonSerializer createInstance(JsonOptions options) {
        return new SearchJacksonSerializerBuilder().options(options).build();
    }
}
