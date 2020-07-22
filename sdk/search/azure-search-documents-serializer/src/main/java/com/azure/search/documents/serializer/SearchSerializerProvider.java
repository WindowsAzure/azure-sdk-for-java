// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.serializer;

import com.azure.core.experimental.serializer.JsonOptions;
import com.azure.core.experimental.serializer.JsonSerializer;

/**
 * Interface to be implemented by an azure-core plugin that wishes to provide a {@link JsonSerializer} implementation.
 */
public interface SearchSerializerProvider {

    /**
     * Creates a new instance of the {@link JsonSerializer} that this JsonSerializerProvider is configured to create.
     *
     * @return A new {@link JsonSerializer} instance.
     */
    JsonSerializer createInstance();


    /**
     * Creates a new instance of the {@link JsonSerializer} that this JsonSerializerProvider is configured to create.
     *
     * @param jsonOptions The json options for the serializer.
     * @return A new {@link JsonSerializer} instance.
     */
    JsonSerializer createInstance(JsonOptions jsonOptions);
}
