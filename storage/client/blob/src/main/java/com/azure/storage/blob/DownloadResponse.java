/*
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.storage.blob.models.BlobDownloadHeaders;
import com.azure.storage.blob.models.ReliableDownloadOptions;
import io.netty.buffer.ByteBuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public class DownloadResponse {
    private final DownloadAsyncResponse asyncResponse;

    DownloadResponse(DownloadAsyncResponse asyncResponse) {
        this.asyncResponse = asyncResponse;
    }

    */
/**
     * Gets the body of the download response.
     *
     * @param outputStream Stream that has the response body read into it
     * @param options Options for the download
     * @throws IOException If an I/O error occurs
     *//*

    public void body(OutputStream outputStream, ReliableDownloadOptions options) throws IOException {
        for (ByteBuf buffer : this.asyncResponse.body(options).toIterable()) {
            buffer.readBytes(outputStream, buffer.readableBytes());
            buffer.release();
        }
    }

    //TODO (unknown): determine signature(s) to use
    */
/*public InputStream body(ReliableDownloadOptions options) {
        return new InputStream() {

            DownloadAsyncResponse response = asyncResponse;
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }*//*

}

*/

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.models.BlobAccessConditions;
import com.azure.storage.blob.models.BlobDownloadHeaders;
import com.azure.storage.blob.models.BlobRange;
import com.azure.storage.blob.models.ReliableDownloadOptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.Map;
import java.util.function.Function;

/**
 * {@code DownloadResponse} wraps the protocol-layer response from {@link BlobClient#download(OutputStream,
 * ReliableDownloadOptions, BlobRange, BlobAccessConditions, boolean, Duration)} to automatically retry failed reads
 * from the body as appropriate. If the download is interrupted, the {@code DownloadResponse} will make a request to
 * resume the download from where it left off, allowing the user to consume the data as one continuous stream, for any
 * interruptions are hidden. The retry behavior is defined by the options passed to the {@link #body(ReliableDownloadOptions)}.
 * The download will also lock on the blob's etag to ensure consistency.
 * <p>
 * Note that the retries performed as a part of this reader are composed with those of any retries in an {@link
 * HttpPipeline} used in conjunction with this reader. That is, if this object issues a request to resume a download,
 * an underlying pipeline may issue several retries as a part of that request. Furthermore, this reader only retries on
 * network errors; timeouts and unexpected status codes are not retried. Therefore, the behavior of this reader is
 * entirely independent of and in no way coupled to an {@link HttpPipeline}'s retry mechanism.
 */
public final class DownloadResponse {
    private final HTTPGetterInfo info;

    private final ResponseBase<BlobDownloadHeaders, Flux<ByteBuffer>> rawResponse;

    private final Function<HTTPGetterInfo, Mono<DownloadResponse>> getter;


    // The constructor is package-private because customers should not be creating their own responses.
    public DownloadResponse(ResponseBase<BlobDownloadHeaders, Flux<ByteBuffer>> response, HTTPGetterInfo info,
                            Function<HTTPGetterInfo, Mono<DownloadResponse>> getter) {
        Utility.assertNotNull("getter", getter);
        Utility.assertNotNull("info", info);
        Utility.assertNotNull("info.eTag", info.eTag());
        this.rawResponse = response;
        this.info = info;
        this.getter = getter;
    }

    /**
     * Returns the response body which has been modified to enable reliably reading data if desired (if
     * {@code options.maxRetryRequests > 0}. If retries are enabled, if a connection fails while reading, the stream
     * will make additional requests to reestablish a connection and continue reading.
     *
     * @param options
     *         {@link ReliableDownloadOptions}
     *
     * @return A {@code Flowable} which emits the data as {@code ByteBuffer}s.
     */
    public Flux<ByteBuffer> body(ReliableDownloadOptions options) {
        ReliableDownloadOptions optionsReal = options == null ? new ReliableDownloadOptions() : options;
        if (optionsReal.maxRetryRequests() == 0) {
            return this.rawResponse.value();
        }

        /*
        We pass -1 for currentRetryCount because we want tryContinueFlux to receive a value of 0 for number of
        retries as we have not actually retried yet, only made the initial try. Because applyReliableDownload() will
        add 1 before calling into tryContinueFlux, we set the initial value to -1.
         */
        return this.applyReliableDownload(this.rawResponse.value(), -1, optionsReal);
    }

    private Flux<ByteBuffer> tryContinueFlux(Throwable t, int retryCount, ReliableDownloadOptions options) {
        // If all the errors are exhausted, return this error to the user.
        if (retryCount > options.maxRetryRequests() || !(t instanceof IOException)) {
            return Flux.error(t);
        } else {
            /*
            We wrap this in a try catch because we don't know the behavior of the getter. Most errors would probably
            come from an unsuccessful request, which would be propagated through the onError methods. However, it is
            possible the method call that returns a Single is what throws (like how our apis throw some exceptions at
            call time rather than at subscription time.
             */
            try {
                // Get a new response and try reading from it.
                return getter.apply(this.info)
                    .flatMapMany(response ->
                            /*
                            Do not compound the number of retries by passing in another set of downloadOptions; just get
                            the raw body.
                             */
                        this.applyReliableDownload(this.rawResponse.value(), retryCount, options));
            } catch (Exception e) {
                // If the getter fails, return the getter failure to the user.
                return Flux.error(e);
            }
        }
    }

    private Flux<ByteBuffer> applyReliableDownload(Flux<ByteBuffer> data, int currentRetryCount, ReliableDownloadOptions options) {
        return data.doOnNext(buffer -> {
            /*
            Update how much data we have received in case we need to retry and propagate to the user the data we
            have received.
             */
            this.info.offset(this.info.offset() + buffer.remaining());
            if (this.info.count() != null) {
                this.info.count(this.info.count() - buffer.remaining());
            }
        }).onErrorResume(t2 -> {
            // Increment the retry count and try again with the new exception.
            return tryContinueFlux(t2, currentRetryCount + 1, options);
        });
    }

    public int statusCode() {
        return this.rawResponse.statusCode();
    }

    public BlobDownloadHeaders headers() {
        return this.rawResponse.deserializedHeaders();
    }

    public Map<String, String> rawHeaders() {
        return this.rawResponse.headers().toMap();
    }

    public ResponseBase<BlobDownloadHeaders, Flux<ByteBuffer>> rawResponse() {
        return this.rawResponse;
    }
}
