// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.implementation.util.PrivateFieldAccessHelper;
import com.azure.search.documents.models.IndexingResult;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexingResult} and
 * {@link IndexingResult}.
 */
public final class IndexingResultConverter {
    /**
     * Maps from {@link com.azure.search.documents.implementation.models.IndexingResult} to {@link IndexingResult}.
     */
    public static IndexingResult map(com.azure.search.documents.implementation.models.IndexingResult obj) {
        if (obj == null) {
            return null;
        }
        IndexingResult indexingResult = new IndexingResult();

        String errorMessage = obj.getErrorMessage();
        PrivateFieldAccessHelper.set(indexingResult, "errorMessage", errorMessage);

        String key = obj.getKey();
        PrivateFieldAccessHelper.set(indexingResult, "key", key);

        boolean succeeded = obj.isSucceeded();
        PrivateFieldAccessHelper.set(indexingResult, "succeeded", succeeded);

        int statusCode = obj.getStatusCode();
        PrivateFieldAccessHelper.set(indexingResult, "statusCode", statusCode);
        return indexingResult;
    }

    /**
     * Maps from {@link IndexingResult} to {@link com.azure.search.documents.implementation.models.IndexingResult}.
     */
    public static com.azure.search.documents.implementation.models.IndexingResult map(IndexingResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.IndexingResult indexingResult =
            new com.azure.search.documents.implementation.models.IndexingResult();

        String errorMessage = obj.getErrorMessage();
        PrivateFieldAccessHelper.set(indexingResult, "errorMessage", errorMessage);

        String key = obj.getKey();
        PrivateFieldAccessHelper.set(indexingResult, "key", key);

        boolean succeeded = obj.isSucceeded();
        PrivateFieldAccessHelper.set(indexingResult, "succeeded", succeeded);

        int statusCode = obj.getStatusCode();
        PrivateFieldAccessHelper.set(indexingResult, "statusCode", statusCode);
        return indexingResult;
    }

    private IndexingResultConverter() {
    }
}
