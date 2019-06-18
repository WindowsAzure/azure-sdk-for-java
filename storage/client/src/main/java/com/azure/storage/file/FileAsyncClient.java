// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.util.Context;
import com.azure.storage.file.implementation.AzureFileStorageBuilder;
import com.azure.storage.file.implementation.AzureFileStorageImpl;
import com.azure.storage.file.models.CopyStatusType;
import com.azure.storage.file.models.FileCopyInfo;
import com.azure.storage.file.models.FileDownloadInfo;
import com.azure.storage.file.models.FileHTTPHeaders;
import com.azure.storage.file.models.FileInfo;
import com.azure.storage.file.models.FileMetadataInfo;
import com.azure.storage.file.models.FileProperties;
import com.azure.storage.file.models.FileRangeInfo;
import com.azure.storage.file.models.FileRangeWriteType;
import com.azure.storage.file.models.FileUploadInfo;
import com.azure.storage.file.models.FilesCreateResponse;
import com.azure.storage.file.models.FilesDownloadResponse;
import com.azure.storage.file.models.FilesForceCloseHandlesResponse;
import com.azure.storage.file.models.FilesGetPropertiesResponse;
import com.azure.storage.file.models.FilesGetRangeListResponse;
import com.azure.storage.file.models.FilesListHandlesResponse;
import com.azure.storage.file.models.FilesSetHTTPHeadersResponse;
import com.azure.storage.file.models.FilesSetMetadataResponse;
import com.azure.storage.file.models.FilesStartCopyResponse;
import com.azure.storage.file.models.FilesUploadRangeResponse;
import com.azure.storage.file.models.HandleItem;
import io.netty.buffer.ByteBuf;
import java.net.URL;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Map;

public class FileAsyncClient {
    private final AzureFileStorageImpl client;
    private final String shareName;
    private final String directoryPath;
    private final String fileName;
    private final String shareSnapshot;

    /**
     * Constructor of FileAsyncClient
     * @param client
     * @param shareName
     * @param directoryPath
     * @param fileName
     */
    FileAsyncClient(AzureFileStorageImpl client, String shareName, String directoryPath, String fileName, String shareSnapshot) {
        this.shareName = shareName;
        this.directoryPath = directoryPath;
        this.fileName = fileName;
        this.shareSnapshot = shareSnapshot;
        this.client = new AzureFileStorageBuilder().pipeline(client.httpPipeline())
                            .url(client.url())
                            .version(client.version())
                            .build();
    }

    /**
     * Constructor of FileAsyncClient
     * @param endpoint
     * @param httpPipeline
     * @param shareName
     * @param directoryPath
     * @param fileName
     */
    FileAsyncClient(URL endpoint, HttpPipeline httpPipeline, String shareName, String directoryPath, String fileName, String shareSnapshot) {
        this.shareName = shareName;
        this.directoryPath = directoryPath;
        this.fileName = fileName;
        this.shareSnapshot = shareSnapshot;
        this.client = new AzureFileStorageBuilder().pipeline(httpPipeline)
                          .url(endpoint.toString())
                          .build();
    }

    /**
     * Builder of FileAsyncClient and FileClient.
     * @return
     */
    public static FileClientBuilder builder() {
        return new FileClientBuilder();
    }

    /**
     * Create a new file in storage.
     * @param maxSize
     * @param httpHeaders
     * @param metadata
     * @return
     */
    public Mono<Response<FileInfo>> create(long maxSize, FileHTTPHeaders httpHeaders, Map<String, String> metadata) {
        return client.files().createWithRestResponseAsync(shareName, directoryPath, fileName, maxSize, null, metadata, httpHeaders, Context.NONE)
            .map(this::createResponse);
    }

    /**
     * Copy from another source.
     * @param sourceUrl
     * @param metadata
     * @return
     */
    public Mono<Response<FileCopyInfo>> startCopy(String sourceUrl, Map<String, String> metadata) {
        return client.files().startCopyWithRestResponseAsync(shareName, directoryPath, fileName, sourceUrl, null, metadata, Context.NONE)
                    .map(this::startCopyResponse);
    }

    /**
     * Abort the copy.
     * @param copyId
     * @return
     */
    public Mono<VoidResponse> abortCopy(String copyId) {
        return client.files().abortCopyWithRestResponseAsync(shareName, directoryPath, fileName, copyId, Context.NONE)
                    .map(VoidResponse::new);
    }

    /**
     * Download with properties
     * @param offset
     * @param length
     * @param rangeGetContentMD5
     * @return
     */
    public Mono<Response<FileDownloadInfo>> downloadWithProperties(long offset, long length, boolean rangeGetContentMD5) {
        //TODO: more functionality will provide for large files
        String range = String.format("%s-%s", offset, length);
        return client.files().downloadWithRestResponseAsync(shareName, directoryPath, fileName,null, range, rangeGetContentMD5, Context.NONE)
                    .map(this::downloadWithPropertiesResponse);
    }

    /**
     * Delete files from storage.
     * @return
     */
    public Mono<VoidResponse> delete() {
        return client.files().deleteWithRestResponseAsync(shareName, directoryPath, fileName, Context.NONE)
                    .map(VoidResponse::new);
    }

    /**
     * Get properties from the storage.
     * @return
     */
    public Mono<Response<FileProperties>> getProperties() {
        return client.files().getPropertiesWithRestResponseAsync(shareName, directoryPath, fileName, shareSnapshot, null, Context.NONE)
                    .map(this::getPropertiesResponse);
    }

    /**
     * Set http headers for files.
     * @param newFileSize
     * @param httpHeaders
     * @return
     */
    public Mono<Response<FileInfo>> setHttpHeaders(long newFileSize, FileHTTPHeaders httpHeaders) {
        return client.files().setHTTPHeadersWithRestResponseAsync(shareName, directoryPath, fileName, null, newFileSize, httpHeaders, Context.NONE)
                        .map(this::setHttpHeadersResponse);
    }

    /**
     * Set metadata file. (Change the response type in according with the metadata response.)
     * @param meatadata
     * @return
     */
    public Mono<Response<FileMetadataInfo>> setMeatadata(Map<String, String> meatadata) {
        return client.files().setMetadataWithRestResponseAsync(shareName, directoryPath, fileName, null, meatadata, Context.NONE)
                    .map(this::setMeatadataResponse);
    }

    /**
     * Upload file to storage.
     * @param type
     * @param offset
     * @param length
     * @param data
     * @return
     */
    public Mono<Response<FileUploadInfo>> upload(FileRangeWriteType type, long offset, long length, Flux<ByteBuf> data) {
        //TODO: more functionality will provide for large files
        String range = String.format("%s-%s", offset, length);
        return client.files().uploadRangeWithRestResponseAsync(shareName, directoryPath, fileName, range, null, length, Context.NONE)
            .map(this::uploadResponse);
    }

    /**
     * List ranges of a file.
     * @param offset
     * @param length
     * @return
     */
    public Flux<FileRangeInfo> listRanges(long offset, long length) {
        String range = String.format("%s-%s", offset, length);
        return client.files().getRangeListWithRestResponseAsync(shareName, directoryPath, fileName, shareSnapshot, null, range, Context.NONE)
                    .flatMapMany(this::convertListRangesResponseToFileRangeInfo);
    }

    /**
     * List handles of a file.
     * @param maxResults
     * @return
     */
    public Flux<HandleItem> listHandles(int maxResults) {
        return client.files().listHandlesWithRestResponseAsync(shareName, directoryPath, fileName, null, maxResults, null, shareSnapshot, Context.NONE)
                   .flatMapMany(response -> nextPageForHandles(response, maxResults));
    }

    /**
     * Force close handles for a file.
     * @param handleId
     * @return
     */
    public Flux<Integer> forceCloseHandles(String handleId) {
        return client.files().forceCloseHandlesWithRestResponseAsync(shareName, directoryPath, fileName, handleId, null, null, shareSnapshot, Context.NONE)
                   .flatMapMany(response -> nextPageForForceCloseHandles(response, handleId));
    }

    private Flux<Integer> nextPageForForceCloseHandles(final FilesForceCloseHandlesResponse response, final String handleId) {
        List<Integer> handleCount = Arrays.asList(response.deserializedHeaders().numberOfHandlesClosed());

        if (response.deserializedHeaders().marker() == null) {
            return Flux.fromIterable(handleCount);
        }
        Mono<FilesForceCloseHandlesResponse> listResponse = client.files().forceCloseHandlesWithRestResponseAsync(shareName, directoryPath, fileName, handleId, null, response.deserializedHeaders().marker(), shareSnapshot, Context.NONE);
        Flux<Integer> fileRefPublisher = listResponse.flatMapMany(newResponse -> nextPageForForceCloseHandles(newResponse, handleId));
        return Flux.fromIterable(handleCount).concatWith(fileRefPublisher);
    }

    private Publisher<? extends HandleItem> nextPageForHandles(final FilesListHandlesResponse response, final Integer maxResults) {
        List<HandleItem> handleItems = getNumOfResults(response, maxResults);

        if (response.value().nextMarker() == null || maxResults <= handleItems.size()) {
            return Flux.fromIterable(handleItems);
        }
        final Integer results = maxResults - handleItems.size();
        Mono<FilesListHandlesResponse> listResponse = client.files().listHandlesWithRestResponseAsync(shareName, directoryPath, fileName, response.value().nextMarker(), results, null, shareSnapshot,  Context.NONE);
        Flux<HandleItem> fileRefPublisher = listResponse.flatMapMany(newResponse -> nextPageForHandles(newResponse, results));
        return Flux.fromIterable(handleItems).concatWith(fileRefPublisher);
    }

    private List<HandleItem> getNumOfResults(FilesListHandlesResponse response, Integer maxResult) {
        List<HandleItem> handleItems = new ArrayList<>();
        int i = 0;
        while (i < maxResult && response.value().handleList().iterator().hasNext()) {
            HandleItem handleItem = response.value().handleList().iterator().next();
            handleItems.add(handleItem);
            i++;
        }
        return handleItems;
    }

    private Response<FileInfo> createResponse(final FilesCreateResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        OffsetDateTime lastModified = response.deserializedHeaders().lastModified();
        boolean isServerEncrypted = response.deserializedHeaders().isServerEncrypted();
        FileInfo fileInfo = new FileInfo(eTag, lastModified, isServerEncrypted);
        return mapResponse(response, fileInfo);
    }

    private Response<FileCopyInfo> startCopyResponse(final FilesStartCopyResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        OffsetDateTime lastModified = response.deserializedHeaders().lastModified();
        String copyId = response.deserializedHeaders().copyId();
        CopyStatusType copyStatus = response.deserializedHeaders().copyStatus();
        FileCopyInfo fileCopyInfo = new FileCopyInfo(eTag, lastModified, copyId, copyStatus);
        return mapResponse(response, fileCopyInfo);
    }

    private Response<FileInfo> setHttpHeadersResponse(final FilesSetHTTPHeadersResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        OffsetDateTime lastModified = response.deserializedHeaders().lastModified();
        boolean isServerEncrypted = response.deserializedHeaders().isServerEncrypted();
        FileInfo fileInfo = new FileInfo(eTag, lastModified, isServerEncrypted);
        return mapResponse(response, fileInfo);
    }
    private Response<FileDownloadInfo> downloadWithPropertiesResponse(final FilesDownloadResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        OffsetDateTime lastModified = response.deserializedHeaders().lastModified();
        Map<String, String> metadata = response.deserializedHeaders().metadata();
        Long contentLength = response.deserializedHeaders().contentLength();
        String contentType = response.deserializedHeaders().contentType();
        String contentRange = response.deserializedHeaders().contentRange();
        FileDownloadInfo fileDownloadInfo = new FileDownloadInfo(eTag, lastModified, metadata, contentLength, contentType, contentRange);
        return mapResponse(response, fileDownloadInfo);
    }

    private Response<FileProperties> getPropertiesResponse(final FilesGetPropertiesResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        OffsetDateTime lastModified = response.deserializedHeaders().lastModified();
        Map<String, String> metadata = response.deserializedHeaders().metadata();
        String fileType = response.deserializedHeaders().fileType();
        Long contentLength = response.deserializedHeaders().contentLength();
        String contentType = response.deserializedHeaders().contentType();
        byte[] contentMD5 = response.deserializedHeaders().contentMD5();
        String contentEncoding = response.deserializedHeaders().contentEncoding();
        String cacheControl = response.deserializedHeaders().cacheControl();
        String contentDisposition = response.deserializedHeaders().contentDisposition();
        OffsetDateTime copyCompletionTime = response.deserializedHeaders().copyCompletionTime();
        String copyStatusDescription = response.deserializedHeaders().copyStatusDescription();
        String copyId = response.deserializedHeaders().copyId();
        String copyProgress = response.deserializedHeaders().copyProgress();
        String copySource = response.deserializedHeaders().copySource();
        CopyStatusType copyStatus = response.deserializedHeaders().copyStatus();
        Boolean isServerEncrpted = response.deserializedHeaders().isServerEncrypted();
        FileProperties fileProperties = new FileProperties(eTag, lastModified, metadata, fileType, contentLength, contentType, contentMD5,
            contentEncoding, cacheControl, contentDisposition, copyCompletionTime, copyStatusDescription, copyId, copyProgress,
            copySource, copyStatus, isServerEncrpted);
        return mapResponse(response, fileProperties);
    }

    private Response<FileUploadInfo> uploadResponse(final FilesUploadRangeResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        OffsetDateTime lastModified = response.deserializedHeaders().lastModified();
        byte[] contentMD5 = response.deserializedHeaders().contentMD5();
        Boolean isServerEncrypted = response.deserializedHeaders().isServerEncrypted();
        FileUploadInfo fileUploadInfo = new FileUploadInfo(eTag, lastModified, contentMD5, isServerEncrypted);
        return mapResponse(response, fileUploadInfo);
    }

    private Response<FileMetadataInfo> setMeatadataResponse(final FilesSetMetadataResponse response) {
        String eTag = response.deserializedHeaders().eTag();
        boolean isServerEncrypted = response.deserializedHeaders().isServerEncrypted();
        FileMetadataInfo fileMetadataInfo = new FileMetadataInfo(eTag, isServerEncrypted);
        return mapResponse(response, fileMetadataInfo);
    }

    private Flux<FileRangeInfo> convertListRangesResponseToFileRangeInfo(FilesGetRangeListResponse response) {
        List<FileRangeInfo> fileRanges = new ArrayList<>();
        response.value().forEach(range -> {
            long start = range.start();
            long end = range.end();
            fileRanges.add(new FileRangeInfo(start, end));
        });
        return Flux.fromIterable(fileRanges);
    }

    private <T> SimpleResponse<T> mapResponse(Response response, T value) {
        return new SimpleResponse<>(response.request(), response.statusCode(), response.headers(), value);
    }
}
