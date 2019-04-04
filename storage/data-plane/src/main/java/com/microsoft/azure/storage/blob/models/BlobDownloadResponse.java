/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.Functions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Map;

/**
 * Contains all response data for the download operation.
 */
public final class BlobDownloadResponse extends RestResponse<BlobDownloadHeaders, Flowable<ByteBuffer>> implements Closeable {
    /**
     * Creates an instance of BlobDownloadResponse.
     *
     * @param request the request which resulted in this {response.Name}.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the body content stream.
     */
    public BlobDownloadResponse(HttpRequest request, int statusCode, BlobDownloadHeaders headers, Map<String, String> rawHeaders, Flowable<ByteBuffer> body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public BlobDownloadHeaders headers() {
        return super.headers();
    }

    /**
     * @return the response content stream.
     */
    @Override
    public Flowable<ByteBuffer> body() {
        return super.body();
    }

    /**
     * Disposes of the connection associated with this stream response.
     */
    @Override
    public void close() {
        body().subscribe(Functions.emptyConsumer(), Functions.<Throwable>emptyConsumer()).dispose();
    }
}
