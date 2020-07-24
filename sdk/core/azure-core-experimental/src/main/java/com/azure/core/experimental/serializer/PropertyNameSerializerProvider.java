// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.experimental.serializer;

/**
 * Interface to be implemented by an azure-core plugin that wishes to provide a {@link PropertyNameSerializer}
 * implementation.
 */
public interface PropertyNameSerializerProvider {

    /**
     * Creates a new instance of the {@link JsonSerializer} that this JsonSerializerProvider is configured to create.
     *
     * @return A new {@link JsonSerializer} instance.
     */
    PropertyNameSerializer createInstance();
}
