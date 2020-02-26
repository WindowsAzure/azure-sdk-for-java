// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.quickquery.models;

import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.implementation.models.BlobQuickQueryHeaders;

/**
 * This class contains the response information return from the server when quick querying a blob.
 */
public final class BlobQuickQueryResponse extends ResponseBase<BlobQuickQueryHeaders, Void> {
    /**
     * Constructs a {@link BlobQuickQueryResponse}.
     *
     * @param response Response returned from the service.
     */
    public BlobQuickQueryResponse(BlobQuickQueryAsyncResponse response) {
        super(response.getRequest(), response.getStatusCode(), response.getHeaders(), null,
            response.getDeserializedHeaders());
    }
}
