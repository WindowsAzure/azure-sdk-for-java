// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.serializer;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * This class is a proxy for using a {@link SearchSerializerProvider} loaded from the classpath.
 */
public final class SearchSerializerProviders {
    private static final String CANNOT_FIND_JSON_SERIALIZER_PROVIDER =
        "Cannot find any JSON serializer provider on the classpath.";

    private static SearchSerializerProvider defaultProvider;
    private static boolean attemptedLoad;

    /**
     * Creates an instance of {@link SearchSerializer} using the first {@link SearchSerializerProvider} found in the
     * classpath.
     *
     * @return A new instance of {@link SearchSerializer}.
     */
    public static SearchSerializer createInstance() {
        if (defaultProvider == null) {
            loadFromClasspath();
        }

        return defaultProvider.createInstance();
    }

    private static synchronized void loadFromClasspath() {
        if (attemptedLoad && defaultProvider != null) {
            return;
        } else if (attemptedLoad) {
            throw new IllegalStateException(CANNOT_FIND_JSON_SERIALIZER_PROVIDER);
        }

        attemptedLoad = true;
        Iterator<SearchSerializerProvider> iterator = ServiceLoader.load(SearchSerializerProvider.class).iterator();
        if (iterator.hasNext()) {
            defaultProvider = iterator.next();
        } else {
            throw new IllegalStateException(CANNOT_FIND_JSON_SERIALIZER_PROVIDER);
        }
    }

    private SearchSerializerProviders() {
        // no-op
    }
}
