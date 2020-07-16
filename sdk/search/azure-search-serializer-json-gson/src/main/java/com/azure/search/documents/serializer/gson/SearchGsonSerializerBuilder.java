// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.serializer.gson;

import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.search.documents.serializer.SearchSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SearchGsonSerializerBuilder {

    /**
     * Constructs a new instance of {@link SearchSerializer} with the configurations set in this builder.
     *
     * @return A new instance of {@link SearchSerializer}.
     */
    public SearchSerializer build() {
        return new SearchGsonSerializer(() -> {
            Gson gson = new Gson();
        });
    }
}
