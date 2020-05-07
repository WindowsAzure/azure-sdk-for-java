package com.azure.storage.blob.changefeed;

import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.implementation.util.ChunkedDownloadUtils;
import com.azure.storage.blob.models.BlobDownloadAsyncResponse;
import com.azure.storage.blob.models.BlobRange;
import com.azure.storage.blob.models.BlobRequestConditions;
import com.azure.storage.blob.models.ParallelTransferOptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.nio.ByteBuffer;
import java.util.function.Function;

class BlobLazyDownloader {

    private final BlobAsyncClient client; /* Client to download from. */
    private final long blockSize;
    private BlobRange range;

    BlobLazyDownloader(BlobAsyncClient client, long blockSize, long offset) {
        this.client = client;
        this.blockSize = blockSize;
        this.range = new BlobRange(offset);
    }

    BlobLazyDownloader(BlobAsyncClient client, long blockSize) {
        this.client = client;
        this.blockSize = blockSize;
        this.range = new BlobRange(0, blockSize);
    }

    /* TODO (gapra) : Tests Lazy downloader to only download part of blob. */
    /*TODO (gapra) : It may be possible to unduplicate the code below as well to share between downloadToFile but wasnt immediately obvious to me */
    public Flux<ByteBuffer> download() {
        ParallelTransferOptions options = new ParallelTransferOptions()
            .setBlockSizeLong(blockSize);
        BlobRequestConditions requestConditions = new BlobRequestConditions();

        Function<BlobRange, Mono<BlobDownloadAsyncResponse>> downloadFunc = range ->
            client.downloadWithResponse(range, null, new BlobRequestConditions(), false);

        return ChunkedDownloadUtils.getSetupMono(range, options, requestConditions,
            downloadFunc, Schedulers.immediate())
            .flatMapMany(setupTuple3 -> {
                long newCount = setupTuple3.getT1();
                BlobRequestConditions finalConditions = setupTuple3.getT2();

                int numChunks = ChunkedDownloadUtils.calculateNumBlocks(newCount, options.getBlockSizeLong());

                // In case it is an empty blob, this ensures we still actually perform a download operation.
                numChunks = numChunks == 0 ? 1 : numChunks;

                BlobDownloadAsyncResponse initialResponse = setupTuple3.getT3();
                return Flux.range(0, numChunks)
                    .concatMap(chunkNum -> { /* TODO (gapra) : This was the biggest difference - downloadToFile does
                                                                it in parallel, but we want this to be sequential. */
                        // The first chunk was retrieved during setup.
                        if (chunkNum == 0) {
                            return initialResponse.getValue();
                        }

                        // Calculate whether we need a full chunk or something smaller because we are at the end.
                        long modifier = chunkNum.longValue() * options.getBlockSizeLong();
                        long chunkSizeActual = Math.min(options.getBlockSizeLong(),
                            newCount - modifier);
                        BlobRange chunkRange = new BlobRange(range.getOffset() + modifier, chunkSizeActual);

                        // Make the download call.
                        return client.downloadWithResponse(chunkRange, null, finalConditions, false)
                            .flatMapMany(ResponseBase::getValue);
                    });
            });
    }

}
