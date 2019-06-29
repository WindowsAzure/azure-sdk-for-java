// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import io.netty.buffer.ByteBuf;
import java.io.Closeable;
import reactor.core.publisher.Flux;

/**
 * Contains all response data for the download operation.
 */
public final class FilesDownloadResponse extends ResponseBase<FileDownloadHeaders, Flux<ByteBuf>> implements Closeable {
    /**
     * Creates an instance of FilesDownloadResponse.
     *
     * @param request the request which resulted in this FilesDownloadResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the content stream.
     * @param headers the deserialized headers of the HTTP response.
     */
    public FilesDownloadResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Flux<ByteBuf> value, FileDownloadHeaders headers) {
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
