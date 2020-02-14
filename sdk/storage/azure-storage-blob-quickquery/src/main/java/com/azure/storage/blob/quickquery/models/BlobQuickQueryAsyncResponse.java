// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.quickquery.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.implementation.models.BlobQuickQueryHeaders;
import reactor.core.publisher.Flux;

import java.nio.ByteBuffer;

/**
 * This class contains the response information returned from the server when running a quick query a blob.
 */
public final class BlobQuickQueryAsyncResponse extends ResponseBase<BlobQuickQueryHeaders, Flux<ByteBuffer>> {
    /**
     * Constructs a {@link BlobQuickQueryAsyncResponse}.
     *
     * @param request Request sent to the service.
     * @param statusCode Response status code returned by the service.
     * @param headers Raw headers returned in the response.
     * @param value Stream of download data being returned by the service.
     * @param deserializedHeaders Headers deserialized into an object.
     */
    public BlobQuickQueryAsyncResponse(HttpRequest request, int statusCode, HttpHeaders headers, Flux<ByteBuffer> value,
        BlobQuickQueryHeaders deserializedHeaders) {
        super(request, statusCode, headers, value, deserializedHeaders);
    }
}
