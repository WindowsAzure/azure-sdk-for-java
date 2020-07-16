// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

import com.azure.core.serializer.json.jackson.JacksonSearchJsonSerializerProvider;

module com.azure.core.serializer.json.jackson {
    requires transitive com.azure.core;
    requires transitive com.azure.core.experimental;

    exports com.azure.core.serializer.json.jackson;

    provides com.azure.core.experimental.serializer.JsonSerializerProvider
        with JacksonSearchJsonSerializerProvider;
}
