package com.azure.storage.file.datalake;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.specialized.BlockBlobClient;
import com.azure.storage.common.Utility;
import com.azure.storage.common.implementation.StorageImplUtils;
import com.azure.storage.file.datalake.models.PathHttpHeaders;
import com.azure.storage.file.datalake.models.LeaseAccessConditions;
import com.azure.storage.file.datalake.implementation.models.PathResourceType;
import com.azure.storage.file.datalake.models.FileRange;
import com.azure.storage.file.datalake.models.PathAccessConditions;
import com.azure.storage.file.datalake.models.PathInfo;
import com.azure.storage.file.datalake.models.PathItem;
import com.azure.storage.file.datalake.models.ReliableDownloadOptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;

public class FileClient extends PathClient {

    private ClientLogger logger = new ClientLogger(FileClient.class);

    private FileAsyncClient fileAsyncClient;

    FileClient(FileAsyncClient pathAsyncClient, BlockBlobClient blockBlobClient) {
        super(pathAsyncClient, blockBlobClient);
        this.fileAsyncClient = pathAsyncClient;
    }

    FileClient(PathClient pathClient) {
        super(pathClient.pathAsyncClient, pathClient.blockBlobClient);
        this.fileAsyncClient = (FileAsyncClient) pathClient.pathAsyncClient;
    }

    /**
     * Creates a file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.create}
     *
     * <p>For more information see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure
     * Docs</a></p>
     *
     * @return Information about the created file.
     */
    public PathItem create() {
        return createWithResponse(null, null, null, null, null, null, Context.NONE).getValue();
    }

    /**
     * Creates a file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.createWithResponse#PathHttpHeaders-Map-PathAccessConditions-String-String-Duration-Context}
     *
     * <p>For more information see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure
     * Docs</a></p>
     *
     * @param headers {@link PathHttpHeaders}
     * @param metadata Metadata to associate with the resource.
     * @param accessConditions {@link PathAccessConditions}
     * @param permissions POSIX access permissions for the file owner, the file owning group, and others.
     * @param umask Restricts permissions of the file to be created.
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing information about the created file
     */
    public Response<PathItem> createWithResponse(PathHttpHeaders headers, Map<String, String> metadata,
        PathAccessConditions accessConditions, String permissions, String umask, Duration timeout, Context context) {
        Mono<Response<PathItem>> response = pathAsyncClient.createWithResponse(PathResourceType.FILE, headers, metadata,
            accessConditions, permissions, umask, context);

        return StorageImplUtils.blockWithOptionalTimeout(response, timeout);
    }

    /**
     * Deletes a file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.delete}
     *
     * <p>For more information see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/delete">Azure
     * Docs</a></p>
     */
    public void delete() {
        deleteWithResponse(null, null, Context.NONE).getValue();
    }

    /**
     * Deletes a file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.deleteWithResponse#PathAccessConditions-Duration-Context}
     *
     * <p>For more information see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/delete">Azure
     * Docs</a></p>
     *
     * @param accessConditions {@link PathAccessConditions}
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     *
     * @return A response containing status code and HTTP headers.
     */
    public Response<Void> deleteWithResponse(PathAccessConditions accessConditions, Duration timeout, Context context) {
        // TODO (rickle-msft): Update for continuation token if we support HNS off
        Mono<Response<Void>> response = pathAsyncClient.deleteWithResponse(null, accessConditions, context);

        return StorageImplUtils.blockWithOptionalTimeout(response, timeout);
    }

    /**
     * Appends data to the specified resource to later be flushed (written) by a call to flushData
     *
     * <p><strong>Code Samples>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.appendData#InputStream-long-long}
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/update">Azure
     * Docs</a></p>
     *
     * @param data The data to write to the file.
     * @param offset The position where the data is to be appended.
     * @param length The exact length of the data.
     */
    public void appendData(InputStream data, long offset, long length) {
        appendDataWithResponse(data, offset, length, null, null, null, Context.NONE);
    }

    /**
     * Appends data to the specified resource to later be flushed (written) by a call to flushData
     *
     * <p><strong>Code Samples>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.appendDataWithResponse#InputStream-long-long-byte-LeaseAccessConditions}
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/update">Azure
     * Docs</a></p>
     *
     * @param data The data to write to the file.
     * @param offset The position where the data is to be appended.
     * @param length The exact length of the data.
     * @param contentMd5 An MD5 hash of the content of the data. If specified, the service will calculate the MD5 of the
     * received data and fail the request if it does not match the provided MD5.
     * @param leaseAccessConditions By setting lease access conditions, requests will fail if the provided lease does
     * not match the active lease on the file.
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     *
     * @return A response signalling completion.
     */
    public Response<Void> appendDataWithResponse(InputStream data, long offset, long length,
        byte[] contentMd5, LeaseAccessConditions leaseAccessConditions, Duration timeout, Context context) {

        Objects.requireNonNull(data);
        Flux<ByteBuffer> fbb = Utility.convertStreamToByteBuffer(data, length,
            BlobAsyncClient.BLOB_DEFAULT_UPLOAD_BLOCK_SIZE);
        Mono<Response<Void>> response = fileAsyncClient.appendDataWithResponse(fbb.subscribeOn(Schedulers.elastic()),
            offset, length, contentMd5, leaseAccessConditions, context);

        try {
            return StorageImplUtils.blockWithOptionalTimeout(response, timeout);
        } catch (UncheckedIOException e) {
            throw logger.logExceptionAsError(e);
        }
    }

    /**
     * Flushes (writes) data previously appended to the file through a call to appendData.
     * The previously uploaded data must be contiguous.
     *
     * <p><strong>Code Samples>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.flushData#long}
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/update">Azure
     * Docs</a></p>
     *
     * @param position The length of the file after all data has been written.
     *
     * @return Information about the created resource.
     */
    public PathInfo flushData(long position) {
        return flushDataWithResponse(position, false, false, null, null, null, Context.NONE).getValue();
    }

    /**
     * Flushes (writes) data previously appended to the file through a call to appendData.
     * The previously uploaded data must be contiguous.
     *
     * <p><strong>Code Samples>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.flushDataWithResponse#long-boolean-boolean-PathHttpHeaders-PathAccessConditions-Duration-Context}
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/update">Azure
     * Docs</a></p>
     *
     * @param position The length of the file after all data has been written.
     * @param retainUncommittedData Whether or not uncommitted data is to be retained after the operation.
     * @param close Whether or not a file changed event raised indicates completion (true) or modification (false).
     * @param httpHeaders {@link PathHttpHeaders httpHeaders}
     * @param accessConditions {@link PathAccessConditions accessConditions}
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     *
     * @return A response containing the information of the created resource.
     */
    public Response<PathInfo> flushDataWithResponse(long position, boolean retainUncommittedData, boolean close,
        PathHttpHeaders httpHeaders, PathAccessConditions accessConditions, Duration timeout, Context context) {
        Mono<Response<PathInfo>> response =  fileAsyncClient.flushDataWithResponse(position, retainUncommittedData,
            close, httpHeaders, accessConditions, context);

        return StorageImplUtils.blockWithOptionalTimeout(response, timeout);
    }

    /**
     * Downloads the entire file into an output stream.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.read#OutputStream}
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-blob">Azure Docs</a></p>
     *
     * @param stream A non-null {@link OutputStream} instance where the downloaded data will be written.
     * @throws UncheckedIOException If an I/O error occurs.
     * @throws NullPointerException if {@code stream} is null
     */
    public void read(OutputStream stream) {
        readWithResponse(stream, null, null, null, false, null, Context.NONE);
    }

    /**
     * Downloads a range of bytes from a file into an output stream.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.readWithResponse#OutputStream-BlobRange-ReliableDownloadOptions-BlobAccessConditions-boolean-Duration-Context}
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-blob">Azure Docs</a></p>
     *
     * @param stream A non-null {@link OutputStream} instance where the downloaded data will be written.
     * @param range {@link FileRange}
     * @param options {@link ReliableDownloadOptions}
     * @param accessConditions {@link PathAccessConditions}
     * @param rangeGetContentMD5 Whether the contentMD5 for the specified file range should be returned.
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing status code and HTTP headers.
     * @throws UncheckedIOException If an I/O error occurs.
     * @throws NullPointerException if {@code stream} is null
     */
    public Response<Void> readWithResponse(OutputStream stream, FileRange range, ReliableDownloadOptions options,
        PathAccessConditions accessConditions, boolean rangeGetContentMD5, Duration timeout, Context context) {
        return blockBlobClient.downloadWithResponse(stream, Transforms.toBlobRange(range),
            Transforms.toBlobReliableDownloadOptions(options), Transforms.toBlobAccessConditions(accessConditions),
            rangeGetContentMD5, timeout, context);
    }

    /**
     * Moves the file to another location within the file system.
     * For more information see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure
     * Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.DirectoryAsyncClient.move#String}
     *
     * @param destinationPath Relative path from the file system to move the file to.
     * @return A {@link FileClient} used to interact with the new file created.
     */
    public FileClient move(String destinationPath) {
        return moveWithResponse(destinationPath, null, null, null, null, null, null, null, null).getValue();
    }

    /**
     * Moves the file to another location within the file system.
     * For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileClient.moveWithResponse#String-PathHttpHeaders-Map-String-String-PathAccessConditions-PathAccessConditions}
     *
     * @param destinationPath Relative path from the file system to move the file to.
     * @param headers {@link PathHttpHeaders}
     * @param metadata Metadata to associate with the file.
     * @param permissions POSIX access permissions for the file owner, the file owning group, and others.
     * @param umask Restricts permissions of the file to be created.
     * @param sourceAccessConditions {@link PathAccessConditions} against the source.
     * @param destAccessConditions {@link PathAccessConditions} against the destination.
     * @return A {@link Response} whose {@link Response#getValue() value} that contains a {@link FileClient} used
     * to interact with the file created.
     */
    public Response<FileClient> moveWithResponse(String destinationPath, PathHttpHeaders headers,
        Map<String, String> metadata, String permissions, String umask, PathAccessConditions sourceAccessConditions,
        PathAccessConditions destAccessConditions, Duration timeout, Context context) {

        Mono<Response<PathClient>> response = moveWithResponse(destinationPath, headers,
            metadata, permissions, umask, sourceAccessConditions,
            destAccessConditions, context);

        Response<PathClient> resp = StorageImplUtils.blockWithOptionalTimeout(response, timeout);
        return new SimpleResponse<>(resp, new FileClient(resp.getValue()));
    }
}
