// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.util.Context;
import com.azure.storage.blob.implementation.AzureBlobStorageBuilder;
import com.azure.storage.blob.models.*;
import io.netty.buffer.ByteBuf;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URL;

/**
 * Represents a URL to a page blob. It may be obtained by direct construction or via the create method on a
 * {@link ContainerAsyncClient} object. This class does not hold any state about a particular blob but is instead a convenient
 * way of sending off appropriate requests to the resource on the service. Please refer to the
 * <a href=https://docs.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs>Azure Docs</a>
 * for more information.
 */
public final class PageBlobAsyncClient extends BlobAsyncRawClient {

    PageBlobAsyncRawClient pageBlobAsyncRawClient;

    /**
     * Indicates the number of bytes in a page.
     */
    public static final int PAGE_BYTES = 512;

    /**
     * Indicates the maximum number of bytes that may be sent in a call to putPage.
     */
    public static final int MAX_PUT_PAGES_BYTES = 4 * Constants.MB;

    /**
     * Creates a {@code PageBlobAsyncRawClient} object pointing to the account specified by the URL and using the provided
     * pipeline to make HTTP requests.
     *
     */
    public PageBlobAsyncClient(AzureBlobStorageBuilder azureBlobStorageBuilder) {
        super(azureBlobStorageBuilder);
    }


    /**
     * Creates a page blob of the specified length. Call PutPage to upload data data to a page blob.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-blob">Azure Docs</a>.
     *
     * @param size
     *         Specifies the maximum size for the page blob, up to 8 TB. The page blob size must be aligned to a
     *         512-byte boundary.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.create")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobCreateHeaders> create(long size) {
        return this.create(size, null, null, null, null, null);
    }

    /**
     * Creates a page blob of the specified length. Call PutPage to upload data data to a page blob.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-blob">Azure Docs</a>.
     *
     * @param size
     *         Specifies the maximum size for the page blob, up to 8 TB. The page blob size must be aligned to a
     *         512-byte boundary.
     * @param sequenceNumber
     *         A user-controlled value that you can use to track requests. The value of the sequence number must be
     *         between 0 and 2^63 - 1.The default value is 0.
     * @param headers
     *         {@link BlobHTTPHeaders}
     * @param metadata
     *         {@link Metadata}
     * @param accessConditions
     *         {@link BlobAccessConditions}
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.create")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobCreateHeaders> create(long size, Long sequenceNumber, BlobHTTPHeaders headers,
            Metadata metadata, BlobAccessConditions accessConditions, Context context) {
        return pageBlobAsyncRawClient
            .create(size, sequenceNumber, headers, metadata, accessConditions, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Writes 1 or more pages to the page blob. The start and end offsets must be a multiple of 512.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-page">Azure Docs</a>.
     * <p>
     * Note that the data passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flowable} must produce the same data each time it is subscribed to.
     *
     * @param pageRange
     *         A {@link PageRange} object. Given that pages must be aligned with 512-byte boundaries, the start offset must
     *         be a modulus of 512 and the end offset must be a modulus of 512 - 1. Examples of valid byte ranges are
     *         0-511, 512-1023, etc.
     * @param body
     *         The data to upload. Note that this {@code Flowable} must be replayable if retries are enabled
     *         (the default). In other words, the Flowable must produce the same data each time it is subscribed to.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.uploadPages")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobUploadPagesHeaders> uploadPages(PageRange pageRange, Flux<ByteBuf> body) {
        return this.uploadPages(pageRange, body, null, null);
    }

    /**
     * Writes 1 or more pages to the page blob. The start and end offsets must be a multiple of 512.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-page">Azure Docs</a>.
     * <p>
     * Note that the data passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flowable} must produce the same data each time it is subscribed to.
     *
     * @param pageRange
     *         A {@link PageRange} object. Given that pages must be aligned with 512-byte boundaries, the start offset
     *         must be a modulus of 512 and the end offset must be a modulus of 512 - 1. Examples of valid byte ranges
     *         are 0-511, 512-1023, etc.
     * @param body
     *         The data to upload. Note that this {@code Flowable} must be replayable if retries are enabled
     *         (the default). In other words, the Flowable must produce the same data each time it is subscribed to.
     * @param pageBlobAccessConditions
     *         {@link PageBlobAccessConditions}
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.uploadPages")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobUploadPagesHeaders> uploadPages(PageRange pageRange, Flux<ByteBuf> body,
            PageBlobAccessConditions pageBlobAccessConditions, Context context) {
        return pageBlobAsyncRawClient
            .uploadPages(pageRange, body, pageBlobAccessConditions, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Writes 1 or more pages from the source page blob to this page blob. The start and end offsets must be a multiple
     * of 512.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-page">Azure Docs</a>.
     * <p>
     *
     * @param range
     *          A {@link PageRange} object. Given that pages must be aligned with 512-byte boundaries, the start offset
     *          must be a modulus of 512 and the end offset must be a modulus of 512 - 1. Examples of valid byte ranges
     *          are 0-511, 512-1023, etc.
     * @param sourceURL
     *          The url to the blob that will be the source of the copy.  A source blob in the same storage account can be
     *          authenticated via Shared Key. However, if the source is a blob in another account, the source blob must
     *          either be public or must be authenticated via a shared access signature. If the source blob is public, no
     *          authentication is required to perform the operation.
     * @param sourceOffset
     *          The source offset to copy from.  Pass null or 0 to copy from the beginning of source page blob.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_from_url "Sample code for PageBlobAsyncRawClient.uploadPagesFromURL")]
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobUploadPagesFromURLHeaders> uploadPagesFromURL(PageRange range, URL sourceURL, Long sourceOffset) {
        return this.uploadPagesFromURL(range, sourceURL, sourceOffset, null, null,
                null, null);
    }

    /**
     * Writes 1 or more pages from the source page blob to this page blob. The start and end offsets must be a multiple
     * of 512.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-page">Azure Docs</a>.
     * <p>
     *
     * @param range
     *          The destination {@link PageRange} range. Given that pages must be aligned with 512-byte boundaries, the start offset
     *          must be a modulus of 512 and the end offset must be a modulus of 512 - 1. Examples of valid byte ranges
     *          are 0-511, 512-1023, etc.
     * @param sourceURL
     *          The url to the blob that will be the source of the copy.  A source blob in the same storage account can be
     *          authenticated via Shared Key. However, if the source is a blob in another account, the source blob must
     *          either be public or must be authenticated via a shared access signature. If the source blob is public, no
     *          authentication is required to perform the operation.
     * @param sourceOffset
     *          The source offset to copy from.  Pass null or 0 to copy from the beginning of source blob.
     * @param sourceContentMD5
     *          An MD5 hash of the block content from the source blob. If specified, the service will calculate the MD5
     *          of the received data and fail the request if it does not match the provided MD5.
     * @param destAccessConditions
     *          {@link PageBlobAccessConditions}
     * @param sourceAccessConditions
     *          {@link SourceModifiedAccessConditions}
     * @param context
     *          {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *          {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *          arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *          immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *          its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_from_url "Sample code for PageBlobAsyncRawClient.uploadPagesFromURL")]
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobUploadPagesFromURLHeaders> uploadPagesFromURL(PageRange range, URL sourceURL, Long sourceOffset,
            byte[] sourceContentMD5, PageBlobAccessConditions destAccessConditions,
            SourceModifiedAccessConditions sourceAccessConditions, Context context) {

        return pageBlobAsyncRawClient
            .uploadPagesFromURL(range, sourceURL, sourceOffset, sourceContentMD5, destAccessConditions, sourceAccessConditions, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Frees the specified pages from the page blob.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-page">Azure Docs</a>.
     *
     * @param pageRange
     *         A {@link PageRange} object. Given that pages must be aligned with 512-byte boundaries, the start offset
     *         must be a modulus of 512 and the end offset must be a modulus of 512 - 1. Examples of valid byte ranges
     *         are 0-511, 512-1023, etc.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.clearPages")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobClearPagesHeaders> clearPages(PageRange pageRange) {
        return this.clearPages(pageRange, null, null);
    }

    /**
     * Frees the specified pages from the page blob.
     * For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-page">Azure Docs</a>.
     *
     * @param pageRange
     *         A {@link PageRange} object. Given that pages must be aligned with 512-byte boundaries, the start offset
     *         must be a modulus of 512 and the end offset must be a modulus of 512 - 1. Examples of valid byte ranges
     *         are 0-511, 512-1023, etc.
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     * @param pageBlobAccessConditions
     *         {@link PageBlobAccessConditions}
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.clearPages")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobClearPagesHeaders> clearPages(PageRange pageRange,
            PageBlobAccessConditions pageBlobAccessConditions, Context context) {
        return pageBlobAsyncRawClient
            .clearPages(pageRange, pageBlobAccessConditions, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Returns the list of valid page ranges for a page blob or snapshot of a page blob.
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/get-page-ranges">Azure Docs</a>.
     *
     * @param blobRange
     *         {@link BlobRange}
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.getPageRanges")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Flux<PageRange> getPageRanges(BlobRange blobRange) {
        return this.getPageRanges(blobRange, null, null);
    }

    /**
     * Returns the list of valid page ranges for a page blob or snapshot of a page blob.
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/get-page-ranges">Azure Docs</a>.
     *
     * @param blobRange
     *         {@link BlobRange}
     * @param accessConditions
     *         {@link BlobAccessConditions}
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.getPageRanges")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Flux<PageRange> getPageRanges(BlobRange blobRange,
                                                            BlobAccessConditions accessConditions, Context context) {
        return pageBlobAsyncRawClient
            .getPageRanges(blobRange, accessConditions, context)
            .flatMapMany(response -> Flux.fromIterable(response.value().pageRange()));
    }

    /**
     * Gets the collection of page ranges that differ between a specified snapshot and this page blob.
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/get-page-ranges">Azure Docs</a>.
     *
     * @param blobRange
     *         {@link BlobRange}
     * @param prevSnapshot
     *         Specifies that the response will contain only pages that were changed between target blob and previous
     *         snapshot. Changed pages include both updated and cleared pages. The target
     *         blob may be a snapshot, as long as the snapshot specified by prevsnapshot is the older of the two.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_diff "Sample code for PageBlobAsyncRawClient.getPageRangesDiff")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Flux<PageRange> getPageRangesDiff(BlobRange blobRange, String prevSnapshot) {
        return this.getPageRangesDiff(blobRange, prevSnapshot, null, null);
    }

    /**
     * Gets the collection of page ranges that differ between a specified snapshot and this page blob.
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/get-page-ranges">Azure Docs</a>.
     *
     * @param blobRange
     *         {@link BlobRange}
     * @param prevSnapshot
     *         Specifies that the response will contain only pages that were changed between target blob and previous
     *         snapshot. Changed pages include both updated and cleared pages. The target
     *         blob may be a snapshot, as long as the snapshot specified by prevsnapshot is the older of the two.
     * @param accessConditions
     *         {@link BlobAccessConditions}
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_diff "Sample code for PageBlobAsyncRawClient.getPageRangesDiff")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Flux<PageRange> getPageRangesDiff(BlobRange blobRange, String prevSnapshot,
            BlobAccessConditions accessConditions, Context context) {
        return pageBlobAsyncRawClient
            .getPageRangesDiff(blobRange, prevSnapshot, accessConditions, context)
            .flatMapMany(response -> Flux.fromIterable(response.value().pageRange()));
    }

    /**
     * Resizes the page blob to the specified size (which must be a multiple of 512).
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/set-blob-properties">Azure Docs</a>.
     *
     * @param size
     *         Resizes a page blob to the specified size. If the specified value is less than the current size of the
     *         blob, then all pages above the specified value are cleared.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.resize")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobResizeHeaders> resize(long size) {
        return this.resize(size, null, null);
    }

    /**
     * Resizes the page blob to the specified size (which must be a multiple of 512).
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/set-blob-properties">Azure Docs</a>.
     *
     * @param size
     *         Resizes a page blob to the specified size. If the specified value is less than the current size of the
     *         blob, then all pages above the specified value are cleared.
     * @param accessConditions
     *         {@link BlobAccessConditions}
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.resize")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobResizeHeaders> resize(long size, BlobAccessConditions accessConditions, Context context) {
        return pageBlobAsyncRawClient
            .resize(size, accessConditions, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Sets the page blob's sequence number.
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/set-blob-properties">Azure Docs</a>.
     *
     * @param action
     *         Indicates how the service should modify the blob's sequence number.
     * @param sequenceNumber
     *         The blob's sequence number. The sequence number is a user-controlled property that you can use to track
     *         requests and manage concurrency issues.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.updateSequenceNumber")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobUpdateSequenceNumberHeaders> updateSequenceNumber(SequenceNumberActionType action,
            Long sequenceNumber) {
        return this.updateSequenceNumber(action, sequenceNumber, null, null);
    }

    /**
     * Sets the page blob's sequence number.
     * For more information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/set-blob-properties">Azure Docs</a>.
     *
     * @param action
     *         Indicates how the service should modify the blob's sequence number.
     * @param sequenceNumber
     *         The blob's sequence number. The sequence number is a user-controlled property that you can use to track
     *         requests and manage concurrency issues.
     * @param accessConditions
     *         {@link BlobAccessConditions}
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return Emits the successful response.
     *
     * @apiNote ## Sample Code \n
     * [!code-java[Sample_Code](../azure-storage-java/src/test/java/com/microsoft/azure/storage/Samples.java?name=page_blob_basic "Sample code for PageBlobAsyncRawClient.updateSequenceNumber")] \n
     * For more samples, please see the [Samples file](%https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java)
     */
    public Mono<PageBlobUpdateSequenceNumberHeaders> updateSequenceNumber(SequenceNumberActionType action,
            Long sequenceNumber, BlobAccessConditions accessConditions, Context context) {
        return pageBlobAsyncRawClient
            .updateSequenceNumber(action, sequenceNumber, accessConditions, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Begins an operation to start an incremental copy from one page blob's snapshot to this page
     * blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are
     * transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read
     * or copied from as usual. For more information, see
     * the Azure Docs <a href="https://docs.microsoft.com/rest/api/storageservices/incremental-copy-blob">here</a> and
     * <a href="https://docs.microsoft.com/en-us/azure/virtual-machines/windows/incremental-snapshots">here</a>.
     *
     * @param source
     *         The source page blob.
     * @param snapshot
     *         The snapshot on the copy source.
     *
     * @return Emits the successful response.
     */
    public Mono<CopyStatusType> copyIncremental(URL source, String snapshot) {
        return this.copyIncremental(source, snapshot, null, null);
    }

    /**
     * Begins an operation to start an incremental copy from one page blob's snapshot to this page
     * blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are
     * transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read
     * or copied from as usual. For more information, see
     * the Azure Docs <a href="https://docs.microsoft.com/rest/api/storageservices/incremental-copy-blob">here</a> and
     * <a href="https://docs.microsoft.com/en-us/azure/virtual-machines/windows/incremental-snapshots">here</a>.
     *
     * @param source
     *         The source page blob.
     * @param snapshot
     *         The snapshot on the copy source.
     * @param modifiedAccessConditions
     *         Standard HTTP Access conditions related to the modification of data. ETag and LastModifiedTime are used
     *         to construct conditions related to when the blob was changed relative to the given request. The request
     *         will fail if the specified condition is not satisfied.
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to its
     *         parent, forming a linked list.
     *
     * @return Emits the successful response.
     */
    public Mono<CopyStatusType> copyIncremental(URL source, String snapshot,
            ModifiedAccessConditions modifiedAccessConditions, Context context) {
        return pageBlobAsyncRawClient
            .copyIncremental(source, snapshot, modifiedAccessConditions, context)
            .map(response -> response.deserializedHeaders().copyStatus());
    }
}
