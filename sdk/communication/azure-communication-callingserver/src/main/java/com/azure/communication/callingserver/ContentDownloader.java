// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.callingserver;

import com.azure.communication.callingserver.implementation.Constants;
import com.azure.communication.callingserver.models.CallingServerResponseException;
import com.azure.communication.callingserver.models.ParallelDownloadOptions;
import com.azure.communication.callingserver.models.ProgressReporter;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpRange;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SignalType;
import reactor.core.scheduler.Schedulers;
import reactor.util.function.Tuple2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

import static java.lang.StrictMath.toIntExact;

class ContentDownloader {
    private final String resourceEndpoint;
    private final HttpPipeline httpPipeline;
    private final ClientLogger logger;

    ContentDownloader(String resourceEndpoint, HttpPipeline httpPipeline,
                             ClientLogger logger) {
        this.resourceEndpoint = resourceEndpoint;
        this.httpPipeline = httpPipeline;
        this.logger = logger;
    }

    Mono<Response<Void>> downloadToStream(String sourceEndpoint, OutputStream destinationStream,
                                          ParallelDownloadOptions parallelDownloadOptions, Context context) {
        return downloadTo(sourceEndpoint, parallelDownloadOptions, context,
            chunkNum -> totalProgress -> response ->
                writeBodyToStream(response, destinationStream, chunkNum, parallelDownloadOptions, totalProgress).flux());
    }

    Mono<Response<Void>> downloadToFile(String sourceEndpoint, AsynchronousFileChannel destinationFile,
                                        ParallelDownloadOptions parallelDownloadOptions, Context context) {
        return downloadTo(sourceEndpoint, parallelDownloadOptions, context,
            chunkNum -> totalProgress -> response ->
                writeBodyToFile(response, destinationFile, chunkNum, parallelDownloadOptions, totalProgress).flux());
    }

    private Mono<Response<Void>> downloadTo(
        String endpoint,
        ParallelDownloadOptions parallelDownloadOptions, Context context,
        Function<Integer, Function<AtomicLong, Function<Response<Flux<ByteBuffer>>, Flux<Void>>>> writer) {

        AtomicLong totalProgress = new AtomicLong(0);

        Function<HttpRange, Mono<Response<Flux<ByteBuffer>>>> downloadFunc =
            range -> downloadStreamWithResponse(endpoint, range, context);

        return downloadFirstChunk(parallelDownloadOptions, downloadFunc)
            .flatMap(setupTuple2 -> {
                long newCount = setupTuple2.getT1();
                int numChunks = calculateNumBlocks(newCount, parallelDownloadOptions.getBlockSizeLong());

                // In case it is an empty blob, this ensures we still actually perform a download operation.
                numChunks = numChunks == 0 ? 1 : numChunks;

                Response<Flux<ByteBuffer>> initialResponse = setupTuple2.getT2();
                return Flux.range(0, numChunks)
                    .flatMap(chunkNum -> downloadChunk(chunkNum, initialResponse,
                        parallelDownloadOptions, newCount, downloadFunc,
                        writer.apply(chunkNum).apply(totalProgress)))
                    .then(Mono.just(new SimpleResponse<>(initialResponse, null)));
            });
    }

    Flux<ByteBuffer> downloadStream(String sourceEndpoint, HttpRange httpRange) {
        Mono<HttpResponse> httpResponse = makeDownloadRequest(sourceEndpoint, httpRange, null);
        return httpResponse
            .map(response -> getFluxStream(response, sourceEndpoint, httpRange, null))
            .flux()
            .flatMap(flux -> flux);
    }

    Mono<Response<Flux<ByteBuffer>>> downloadStreamWithResponse(String endpoint, HttpRange httpRange) {
        return downloadStreamWithResponse(endpoint, httpRange, null);
    }

    Mono<Response<Flux<ByteBuffer>>> downloadStreamWithResponse(String sourceEndpoint, HttpRange httpRange,
                                                                Context context) {
        Mono<HttpResponse> httpResponse = makeDownloadRequest(sourceEndpoint, httpRange, context);
        return httpResponse.map(response -> {
            Flux<ByteBuffer> result = getFluxStream(response, sourceEndpoint, httpRange, context);
            return new SimpleResponse<>(response.getRequest(), response.getStatusCode(),
                response.getHeaders(), result);
        });
    }

    private Flux<ByteBuffer> getFluxStream(HttpResponse httpResponse, String sourceEndpoint, HttpRange httpRange,
                                           Context context) {
        return FluxUtil.createRetriableDownloadFlux(
            () -> getResponseBody(httpResponse),
            (Throwable throwable, Long aLong) -> {
                HttpRange range;
                if (httpRange != null) {
                    range = new HttpRange(aLong + 1, httpRange.getLength() - aLong - 1);
                } else {
                    range = new HttpRange(aLong + 1);
                }
                Mono<HttpResponse> resumeResponse = makeDownloadRequest(sourceEndpoint, range, context);
                return resumeResponse.map(this::getResponseBody).block();
            },
            Constants.ContentDownloader.MAX_RETRIES
        );
    }

    private Flux<ByteBuffer> getResponseBody(HttpResponse response) {
        switch (response.getStatusCode()) {
            case 200:
            case 206:
                return response.getBody();
            default:
                throw logger.logExceptionAsError(
                    new CallingServerResponseException(formatExceptionMessage(response), response)
                );
        }
    }

    private String formatExceptionMessage(HttpResponse httpResponse) {
        return String.format("Service Request failed!%nStatus: %s", httpResponse.getStatusCode());
    }

    private Mono<HttpResponse> makeDownloadRequest(String sourceEndpoint,
                                                   HttpRange httpRange,
                                                   Context context) {
        HttpRequest request = getHttpRequest(sourceEndpoint, httpRange);
        URL urlToSignWith = getUrlToSignRequestWith(sourceEndpoint);

        Context finalContext;
        if (context == null) {
            finalContext = new Context("hmacSignatureURL", urlToSignWith);
        } else {
            finalContext = context.addData("hmacSignatureURL", urlToSignWith);
        }

        return httpPipeline.send(request, finalContext);
    }

    private URL getUrlToSignRequestWith(String endpoint) {
        try {
            String path = new URL(endpoint).getPath();

            if (path.startsWith("/")) {
                path = path.substring(1);
            }

            return new URL(resourceEndpoint + path);
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsError(new IllegalArgumentException(ex));
        }
    }

    private HttpRequest getHttpRequest(String sourceEndpoint, HttpRange httpRange) {
        HttpRequest request = new HttpRequest(HttpMethod.GET, sourceEndpoint);

        if (null != httpRange) {
            request.setHeader(Constants.HeaderNames.RANGE, httpRange.toString());
        }

        return request;
    }

    private Mono<Tuple2<Long, Response<Flux<ByteBuffer>>>> downloadFirstChunk(
        ParallelDownloadOptions parallelDownloadOptions,
        Function<HttpRange, Mono<Response<Flux<ByteBuffer>>>> downloader) {

        return downloader.apply(new HttpRange(0, parallelDownloadOptions.getBlockSizeLong()))
            .subscribeOn(Schedulers.boundedElastic())
            .flatMap(response -> {
                // Extract the total length of the blob from the contentRange header. e.g. "bytes 1-6/7"
                long totalLength = extractTotalBlobLength(
                    response.getHeaders().getValue(Constants.HeaderNames.CONTENT_RANGE)
                );

                return Mono.zip(Mono.just(totalLength), Mono.just(response));
            })
            .onErrorResume(CallingServerResponseException.class, exception -> {
                if (exception.getResponse().getStatusCode() == 416
                    && extractTotalBlobLength(
                        exception.getResponse().getHeaderValue(Constants.HeaderNames.CONTENT_RANGE)) == 0) {
                    return downloader.apply(new HttpRange(0, 0L)).subscribeOn(Schedulers.boundedElastic())
                        .flatMap(response -> {
                            /*
                            Ensure the blob is still 0 length by checking our download was the full length.
                            (200 is for full blob; 206 is partial).
                             */
                            if (response.getStatusCode() != 200) {
                                Mono.error(new IllegalStateException("Blob was modified mid download. It was "
                                    + "originally 0 bytes and is now larger."));
                            }
                            return Mono.zip(Mono.just(0L), Mono.just(response));
                        });
                }
                return Mono.error(exception);
            });
    }

    private long extractTotalBlobLength(String contentRange) {
        return contentRange == null ? 0 : Long.parseLong(contentRange.split("/")[1]);
    }

    private int calculateNumBlocks(long dataSize, long blockLength) {
        // Can successfully cast to an int because MaxBlockSize is an int, which this expression must be less than.
        int numBlocks = toIntExact(dataSize / blockLength);
        // Include an extra block for trailing data.
        if (dataSize % blockLength != 0) {
            numBlocks++;
        }
        return numBlocks;
    }

    private <T> Flux<T> downloadChunk(Integer chunkNum, Response<Flux<ByteBuffer>> initialResponse,
                                      ParallelDownloadOptions parallelDownloadOptions, long newCount,
                                      Function<HttpRange, Mono<Response<Flux<ByteBuffer>>>> downloader,
                                      Function<Response<Flux<ByteBuffer>>, Flux<T>> returnTransformer) {
        if (chunkNum == 0) {
            return returnTransformer.apply(initialResponse);
        }

        // Calculate whether we need a full chunk or something smaller because we are at the end.
        long modifier = chunkNum.longValue() * parallelDownloadOptions.getBlockSizeLong();
        long chunkSizeActual = Math.min(parallelDownloadOptions.getBlockSizeLong(),
            newCount - modifier);
        HttpRange chunkRange = new HttpRange(modifier, chunkSizeActual);

        // Make the download call.
        return downloader.apply(chunkRange)
            .subscribeOn(Schedulers.boundedElastic())
            .flatMapMany(returnTransformer);
    }

    private static Mono<Void> writeBodyToFile(Response<Flux<ByteBuffer>> response, AsynchronousFileChannel file,
                                              long chunkNum, ParallelDownloadOptions parallelDownloadOptions,
                                              AtomicLong totalProgress) {
        // Extract the body.
        Flux<ByteBuffer> data = response.getValue();

        // Report progress as necessary.
        data = ProgressReporter.addParallelProgressReporting(data,
            parallelDownloadOptions.getProgressReceiver(), totalProgress);

        // Write to the file.
        return FluxUtil.writeFile(data, file, chunkNum * parallelDownloadOptions.getBlockSizeLong());
    }

    private static Mono<Void> writeBodyToStream(Response<Flux<ByteBuffer>> response, OutputStream stream,
                                                long chunkNum, ParallelDownloadOptions parallelDownloadOptions,
                                                AtomicLong totalProgress) {
        Flux<ByteBuffer> data = response.getValue();

        Flux<ByteBuffer> finalData = ProgressReporter.addParallelProgressReporting(data,
            parallelDownloadOptions.getProgressReceiver(), totalProgress);

        return Mono.create(emitter -> finalData.doOnError(emitter::error).subscribe(byteBuffer -> {
            try {
                byte[] bytes = byteBuffer.array();
                stream.write(bytes, (int) ((int) chunkNum * parallelDownloadOptions.getBlockSizeLong()), bytes.length);
                emitter.success();
            } catch (IOException ex) {
                emitter.error(ex);
            }
        })
        );
    }

    void downloadToFileCleanup(AsynchronousFileChannel channel, Path filePath, SignalType signalType) {
        try {
            channel.close();
            if (!signalType.equals(SignalType.ON_COMPLETE)) {
                Files.deleteIfExists(filePath);
                logger.verbose("Downloading to file failed. Cleaning up resources.");
            }
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }
}
