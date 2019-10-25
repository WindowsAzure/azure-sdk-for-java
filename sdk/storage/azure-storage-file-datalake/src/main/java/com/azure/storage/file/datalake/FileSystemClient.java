// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.implementation.util.ImplUtils;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerProperties;
import com.azure.storage.file.datalake.models.PathHttpHeaders;
import com.azure.storage.file.datalake.models.LeaseAccessConditions;
import com.azure.storage.file.datalake.models.FileSystemAccessConditions;
import com.azure.storage.file.datalake.models.GetPathsOptions;
import com.azure.storage.file.datalake.models.PathAccessConditions;
import com.azure.storage.file.datalake.models.PathItem;
import com.azure.storage.file.datalake.models.PublicAccessType;

import java.time.Duration;
import java.util.Map;

/**
 * Client to a file system. It may only be instantiated through a {@link FileSystemClientBuilder} or via the method
 * {@link DataLakeServiceClient#getFileSystemClient(String)}. This class does not hold any state about a particular
 * file system but is instead a convenient way of sending off appropriate requests to the resource on the service. It
 * may also be used to construct URLs to files/directories.
 *
 * <p>
 * This client contains operations on a file system. Operations on a path are available on {@link FileClient} and
 * {@link DirectoryClient} through {@link #getFileClient(String)} and {@link #getDirectoryClient(String)} respectively,
 * and operations on the service are available on {@link DataLakeServiceClient}.
 *
 * <p>
 * Please refer to the <a href=https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-introduction?toc=%2fazure%2fstorage%2fblobs%2ftoc.json>
 *     Azure Docs</a> for more information on file systems.
 */
@ServiceClient(builder = FileSystemClientBuilder.class)
public class FileSystemClient {
    private final ClientLogger logger = new ClientLogger(FileSystemClient.class);

    private final FileSystemAsyncClient fileSystemAsyncClient;
    private final BlobContainerClient blobContainerClient;

    public static final String ROOT_FILESYSTEM_NAME = FileSystemAsyncClient.ROOT_FILESYSTEM_NAME;

//    public static final String STATIC_WEBSITE_FILESYSTEM_NAME = FileSystemAsyncClient.STATIC_WEBSITE_FILESYSTEM_NAME;

//    public static final String LOG_FILESYSTEM_NAME = FileSystemAsyncClient.LOG_FILESYSTEM_NAME;

    /**
     * Package-private constructor for use by {@link FileSystemClientBuilder}.
     *
     * @param fileSystemAsyncClient the async file system client.
     * @param blobContainerClient the sync blob container client.
     */
    FileSystemClient(FileSystemAsyncClient fileSystemAsyncClient, BlobContainerClient blobContainerClient) {
        this.fileSystemAsyncClient = fileSystemAsyncClient;
        this.blobContainerClient = blobContainerClient;
    }

    /**
     * Initializes a new FileClient object by concatenating fileName to the end of FileSystemClient's URL. The new
     * FileClient uses the same request policy pipeline as the FileSystemClient.
     *
     * @param fileName A {@code String} representing the name of the file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getFileClient#String}
     *
     * @return A new {@link FileClient} object which references the file with the specified name in this file system.
     */
    public FileClient getFileClient(String fileName) {
        if (ImplUtils.isNullOrEmpty(fileName)) {
            throw logger.logExceptionAsError(new IllegalArgumentException("'fileName' can not be set to null"));
        }
        return new FileClient(fileSystemAsyncClient.getFileAsyncClient(fileName),
            blobContainerClient.getBlobClient(fileName).getBlockBlobClient());
    }

    /**
     * Initializes a new DirectoryClient object by concatenating directoryName to the end of FileSystemClient's URL.
     * The new DirectoryClient uses the same request policy pipeline as the FileSystemClient.
     *
     * @param directoryName A {@code String} representing the name of the directory.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getDirectoryClient#String}
     *
     * @return A new {@link DirectoryClient} object which references the directory with the specified name in this
     * file system.
     */
    public DirectoryClient getDirectoryClient(String directoryName) {
        return new DirectoryClient(fileSystemAsyncClient.getDirectoryAsyncClient(directoryName),
            blobContainerClient.getBlobClient(directoryName).getBlockBlobClient());
    }

    /**
     * Get the file system name.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getFileSystemName}
     *
     * @return The name of file system.
     */
    public String getFileSystemName() {
        return fileSystemAsyncClient.getFileSystemName();
    }

    /**
     * Gets the URL of the file system represented by this client.
     *
     * @return the URL.
     */
    public String getFileSystemUrl() {
        return fileSystemAsyncClient.getFileSystemUrl();
    }

    /**
     * Get associated account name.
     *
     * @return account name associated with this storage resource.
     */
    public String getAccountName() {
        return fileSystemAsyncClient.getAccountName();
    }

    /**
     * Gets the service version the client is using.
     *
     * @return the service version the client is using.
     */
    public DataLakeServiceVersion getServiceVersion() {
        return fileSystemAsyncClient.getServiceVersion();
    }


    /**
     * Gets the {@link HttpPipeline} powering this client.
     *
     * @return The pipeline.
     */
    public HttpPipeline getHttpPipeline() {
        return fileSystemAsyncClient.getHttpPipeline();
    }


    /**
     * Creates a new file system within a storage account. If a file system with the same name already exists, the
     * operation fails. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/create-container">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.create}
     */
    public void create() {
        createWithResponse(null, null, null, Context.NONE);
    }

    /**
     * Creates a new file system within a storage account. If a file system with the same name already exists, the
     * operation fails. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/create-container">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.createWithResponse#Map-PublicAccessType-Duration-Context}
     *
     * @param metadata Metadata to associate with the file system.
     * @param accessType Specifies how the data in this file system is available to the public. See the
     * x-ms-blob-public-access header in the Azure Docs for more information. Pass null for no public access.
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing status code and HTTP headers
     */
    public Response<Void> createWithResponse(Map<String, String> metadata, PublicAccessType accessType,
        Duration timeout, Context context) {
        return blobContainerClient.createWithResponse(metadata, Transforms.toBlobPublicAccessType(accessType), timeout,
            context);
    }

    /**
     * Marks the specified file system for deletion. The file system and any files/directories contained within it are
     * later deleted during garbage collection. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/delete-container">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.delete}
     */
    public void delete() {
        deleteWithResponse(null, null, Context.NONE);
    }

    /**
     * Marks the specified file system for deletion. The file system and any files/directories contained within it are
     * later deleted during garbage collection. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/delete-container">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.deleteWithResponse#FileSystemAccessConditions-Duration-Context}
     *
     * @param accessConditions {@link FileSystemAccessConditions}
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing status code and HTTP headers
     */
    public Response<Void> deleteWithResponse(FileSystemAccessConditions accessConditions, Duration timeout,
        Context context) {
        return blobContainerClient.deleteWithResponse(Transforms.toBlobContainerAccessConditions(accessConditions),
             timeout, context);
    }

    /**
     * Returns the file system's metadata and system properties. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-container-metadata">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getProperties}
     *
     * @return The file system properties.
     */
    public FileSystemProperties getProperties() {
        return getPropertiesWithResponse(null, null, Context.NONE).getValue();
    }

    /**
     * Returns the file system's metadata and system properties. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-container-metadata">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getPropertiesWithResponse#LeaseAccessConditions-Duration-Context}
     *
     * @param leaseAccessConditions By setting lease access conditions, requests will fail if the provided lease does
     * not match the active lease on the file/directory.
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing the file system properties.
     */
    public Response<FileSystemProperties> getPropertiesWithResponse(LeaseAccessConditions leaseAccessConditions,
        Duration timeout, Context context) {
        Response<BlobContainerProperties> response = blobContainerClient.getPropertiesWithResponse(
            Transforms.toBlobLeaseAccessConditions(leaseAccessConditions), timeout, context);
        return new SimpleResponse<>(response, Transforms.toFileSystemProperties(response.getValue()));
    }

    /**
     * Sets the file system's metadata. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/set-container-metadata">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.setMetadata#Map}
     *
     * @param metadata Metadata to associate with the file system.
     */
    public void setMetadata(Map<String, String> metadata) {
        setMetadataWithResponse(metadata, null, null, Context.NONE);
    }

    /**
     * Sets the file system's metadata. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/set-container-metadata">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.setMetadataWithResponse#Map-FileSystemAccessConditions-Duration-Context}
     * @param metadata Metadata to associate with the file system.
     * @param accessConditions {@link FileSystemAccessConditions}
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing status code and HTTP headers
     */
    public Response<Void> setMetadataWithResponse(Map<String, String> metadata,
        FileSystemAccessConditions accessConditions, Duration timeout, Context context) {
        return blobContainerClient.setMetadataWithResponse(metadata,
            Transforms.toBlobContainerAccessConditions(accessConditions), timeout, context);
    }

    /**
     * Returns a lazy loaded list of files/directories in this account. The returned {@link PagedIterable} can be
     * consumed while new items are automatically retrieved as needed. For more information, see the <a
     * href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/filesystem/list#filesystem">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getPaths}
     *
     * @return The list of files/directories.
     */
    public PagedIterable<PathItem> getPaths() {
        return this.getPaths(new GetPathsOptions(), null);
    }

    /**
     * Returns a lazy loaded list of files/directories in this account. The returned {@link PagedIterable} can be
     * consumed while new items are automatically retrieved as needed. For more information, see the <a
     * href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/filesystem/list#filesystem">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.getPaths#GetPathsOptions-Duration}
     *
     * @param options A {@link GetPathsOptions} which specifies what data should be returned by the service.
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @return The list of files/directories.
     */
    public PagedIterable<PathItem> getPaths(GetPathsOptions options, Duration timeout) {
        return new PagedIterable<>(fileSystemAsyncClient.getPathsWithOptionalTimeout(options, timeout));
    }

    /**
     * Creates a new file within a file system. If a file with the same name already exists, the file will be
     * overwritten. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.createFile#String}
     *
     * @param fileName Name of the file to create.
     * @return A {@link FileClient} used to interact with the file created.
     */
    public FileClient createFile(String fileName) {
        return createFileWithResponse(fileName, null, null, null, null, null, null, Context.NONE).getValue();
    }

    /**
     * Creates a new file within a file system. If a file with the same name already exists, the file will be
     * overwritten. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.createFileWithResponse#String-PathHttpHeaders-Map-PathAccessConditions-String-String}
     *
     * @param fileName Name of the file to create.
     * @param headers {@link PathHttpHeaders}
     * @param metadata Metadata to associate with the file.
     * @param accessConditions {@link PathAccessConditions}
     * @param permissions POSIX access permissions for the file owner, the file owning group, and others.
     * @param umask Restricts permissions of the file to be created.
     * @return A {@link Response} whose {@link Response#getValue() value} contains the {@link FileClient} used
     * to interact with the file created.
     */
    public Response<FileClient> createFileWithResponse(String fileName,
        PathHttpHeaders headers, Map<String, String> metadata, PathAccessConditions accessConditions,
        String permissions, String umask, Duration timeout, Context context) {
        FileClient fileClient = getFileClient(fileName);

        return new SimpleResponse<>(fileClient.createWithResponse(headers, metadata, accessConditions, permissions,
            umask, timeout, context), fileClient);
    }

    /**
     * Deletes the specified file in the file system. If the file doesn't exist the operation fails.
     * For more information see the <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/delete">Azure
     * Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.deleteFile#String}
     *
     * @param fileName Name of the file to delete.
     */
    public void deleteFile(String fileName) {
        deleteFileWithResponse(fileName, null, null, Context.NONE).getValue();
    }

    /**
     * Deletes the specified file in the file system. If the file doesn't exist the operation fails.
     * For more information see the <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/delete">Azure
     * Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.deleteFileWithResponse#String-PathAccessConditions-Duration-Context}
     *
     * @param fileName Name of the file to delete.
     * @param accessConditions {@link PathAccessConditions}
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing status code and HTTP headers
     */
    public Response<Void> deleteFileWithResponse(String fileName, PathAccessConditions accessConditions,
        Duration timeout, Context context) {
        return getFileClient(fileName).deleteWithResponse(accessConditions, timeout, context);
    }

    /**
     * Creates a new directory within a file system. If a directory with the same name already exists, the directory
     * will be overwritten. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.createDirectory#String}
     *
     * @param directoryName Name of the directory to create.
     * @return A {@link DirectoryClient} used to interact with the directory created.
     */
    public DirectoryClient createDirectory(String directoryName) {
        return createDirectoryWithResponse(directoryName, null, null, null, null, null, null, null).getValue();
    }

    /**
     * Creates a new directory within a file system. If a directory with the same name already exists, the directory
     * will be overwritten. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/create">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.createDirectoryWithResponse#String-PathHttpHeaders-Map-PathAccessConditions-String-String}
     *
     * @param directoryName Name of the directory to create.
     * @param headers {@link PathHttpHeaders}
     * @param metadata Metadata to associate with the directory.
     * @param accessConditions {@link PathAccessConditions}
     * @param permissions POSIX access permissions for the directory owner, the directory owning group, and others.
     * @param umask Restricts permissions of the directory to be created.
     * @return A {@link Response} whose {@link Response#getValue() value} contains a {@link DirectoryClient} used to
     * interact with the directory created.
     */
    public Response<DirectoryClient> createDirectoryWithResponse(String directoryName,
        PathHttpHeaders headers, Map<String, String> metadata, PathAccessConditions accessConditions,
        String permissions, String umask, Duration timeout, Context context) {
        DirectoryClient directoryClient = getDirectoryClient(directoryName);

        return new SimpleResponse<>(directoryClient.createWithResponse(headers, metadata, accessConditions, permissions, umask,
            timeout, context), directoryClient);
    }

    /**
     * Deletes the specified directory in the file system. If the directory doesn't exist the operation fails.
     * For more information see the <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/delete">Azure
     * Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.deleteDirectory#String}
     *
     * @param directoryName Name of the directory to delete.
     */
    public void deleteDirectory(String directoryName) {
        deleteDirectoryWithResponse(directoryName, false, null, null, Context.NONE).getValue();
    }

    /**
     * Deletes the specified directory in the file system. If the directory doesn't exist the operation fails.
     * For more information see the <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/datalakestoragegen2/path/delete">Azure
     * Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.file.datalake.FileSystemClient.deleteDirectoryWithResponse#String-boolean-PathAccessConditions-Duration-Context}
     *
     * @param directoryName Name of the directory to delete.
     * @param recursive Whether or not to delete all paths beneath the directory.
     * @param accessConditions {@link PathAccessConditions}
     * @param timeout An optional timeout value beyond which a {@link RuntimeException} will be raised.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing status code and HTTP headers
     */
    public Response<Void> deleteDirectoryWithResponse(String directoryName, boolean recursive,
        PathAccessConditions accessConditions, Duration timeout, Context context) {
        return getDirectoryClient(directoryName).deleteWithResponse(recursive, accessConditions, timeout, context);
    }

    BlobContainerClient getBlobContainerClient() {
        return blobContainerClient;
    }

}
