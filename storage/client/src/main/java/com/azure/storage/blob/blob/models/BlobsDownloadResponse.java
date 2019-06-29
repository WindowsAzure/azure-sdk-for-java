// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.models.BlobDownloadHeaders;
import io.netty.buffer.ByteBuf;
import java.io.Closeable;
import reactor.core.publisher.Flux;

/**
 * Contains all response data for the download operation.
 */
public final class BlobsDownloadResponse extends ResponseBase<com.azure.storage.blob.models.BlobDownloadHeaders, Flux<ByteBuf>> implements Closeable {
    /**
     * Creates an instance of BlobsDownloadResponse.
     *
     * @param request the request which resulted in this BlobsDownloadResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the content stream.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsDownloadResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Flux<ByteBuf> value, BlobDownloadHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the response content stream.
     */
    @Override
    public Flux<ByteBuf> value() {
        return super.value();
    }

    /**
     * Disposes of the connection associated with this stream response.
     */
    @Override
    public void close() {
        value().subscribe(bb -> { }, t -> { }).dispose();
    }
}
