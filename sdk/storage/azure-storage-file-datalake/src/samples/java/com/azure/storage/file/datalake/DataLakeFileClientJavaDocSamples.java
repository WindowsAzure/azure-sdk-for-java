// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.storage.common.implementation.Constants;
import com.azure.storage.file.datalake.models.DataLakeRequestConditions;
import com.azure.storage.file.datalake.models.DownloadRetryOptions;
import com.azure.storage.file.datalake.models.FileRange;
import com.azure.storage.file.datalake.models.ParallelTransferOptions;
import com.azure.storage.file.datalake.models.PathHttpHeaders;
import com.azure.storage.file.datalake.models.PathInfo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Code snippets for {@link DataLakeFileClient}
 */
@SuppressWarnings({"unused"})
public class DataLakeFileClientJavaDocSamples {
    private String fileName = "fileName";
    private DataLakeFileClient client = JavaDocCodeSnippetsHelpers.getFileClient(fileName);
    private String leaseId = "leaseId";
    private Duration timeout = Duration.ofSeconds(30);
    private String key1 = "key1";
    private String key2 = "key2";
    private String value1 = "val1";
    private String value2 = "val2";
    private String destinationPath = "destinationPath";
    private String fileSystemName = "fileSystemName";
    private InputStream data = new ByteArrayInputStream("data".getBytes(StandardCharsets.UTF_8));
    private long offset = 0L;
    private long length = 4L;
    private long position = 4L;
    private String file = "file";

    /**
     * Code snippets for {@link DataLakeFileClient#delete()} and
     * {@link DataLakeFileClient#deleteWithResponse(DataLakeRequestConditions, Duration, Context)}
     */
    public void deleteCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.delete
        client.delete();
        System.out.println("Delete request completed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.delete

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.deleteWithResponse#DataLakeRequestConditions-Duration-Context
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);

        client.deleteWithResponse(requestConditions, timeout, new Context(key1, value1));
        System.out.println("Delete request completed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.deleteWithResponse#DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileClient#rename(String, String)} and
     * {@link DataLakeFileClient#renameWithResponse(String, String, DataLakeRequestConditions, DataLakeRequestConditions, Duration, Context)}
     */
    public void renameCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.rename#String-String
        DataLakeFileClient renamedClient = client.rename(fileSystemName, destinationPath);
        System.out.println("Directory Client has been renamed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.rename#String-String

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.renameWithResponse#String-String-DataLakeRequestConditions-DataLakeRequestConditions-Duration-Context
        DataLakeRequestConditions sourceRequestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);
        DataLakeRequestConditions destinationRequestConditions = new DataLakeRequestConditions();

        DataLakeFileClient newRenamedClient = client.renameWithResponse(fileSystemName, destinationPath,
            sourceRequestConditions, destinationRequestConditions, timeout, new Context(key1, value1)).getValue();
        System.out.println("Directory Client has been renamed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.renameWithResponse#String-String-DataLakeRequestConditions-DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileClient#read(OutputStream)} and
     * {@link DataLakeFileClient#readWithResponse(OutputStream, FileRange, DownloadRetryOptions, DataLakeRequestConditions, boolean, Duration, Context)}
     */
    public void readCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.read#OutputStream
        client.read(new ByteArrayOutputStream());
        System.out.println("Download completed.");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.read#OutputStream

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.readWithResponse#OutputStream-FileRange-DownloadRetryOptions-DataLakeRequestConditions-boolean-Duration-Context
        FileRange range = new FileRange(1024, 2048L);
        DownloadRetryOptions options = new DownloadRetryOptions().setMaxRetryRequests(5);

        System.out.printf("Download completed with status %d%n",
            client.readWithResponse(new ByteArrayOutputStream(), range, options, null, false,
                timeout, new Context(key2, value2)).getStatusCode());
        // END: com.azure.storage.file.datalake.DataLakeFileClient.readWithResponse#OutputStream-FileRange-DownloadRetryOptions-DataLakeRequestConditions-boolean-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileClient#downloadToFile(String)} and
     * {@link DataLakeFileClient#downloadToFileWithResponse(String, FileRange, ParallelTransferOptions, DownloadRetryOptions, DataLakeRequestConditions,
     * boolean, Duration, Context)}
     */
    public void downloadToFile() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFile#String
        client.downloadToFile(file);
        System.out.println("Completed download to file");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFile#String

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFile#String-boolean
        boolean overwrite = false; // Default value
        client.downloadToFile(file, overwrite);
        System.out.println("Completed download to file");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFile#String-boolean

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFileWithResponse#String-FileRange-ParallelTransferOptions-DownloadRetryOptions-DataLakeRequestConditions-boolean-Duration-Context
        FileRange range = new FileRange(1024, 2048L);
        DownloadRetryOptions options = new DownloadRetryOptions().setMaxRetryRequests(5);

        client.downloadToFileWithResponse(file, range, new ParallelTransferOptions(4 * Constants.MB, null, null),
            options, null, false, timeout, new Context(key2, value2));
        System.out.println("Completed download to file");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFileWithResponse#String-FileRange-ParallelTransferOptions-DownloadRetryOptions-DataLakeRequestConditions-boolean-Duration-Context

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFileWithResponse#String-FileRange-ParallelTransferOptions-DownloadRetryOptions-DataLakeRequestConditions-boolean-Set-Duration-Context
        FileRange FileRange = new FileRange(1024, 2048L);
        DownloadRetryOptions downloadRetryOptions = new DownloadRetryOptions().setMaxRetryRequests(5);
        Set<OpenOption> openOptions = new HashSet<>(Arrays.asList(StandardOpenOption.CREATE_NEW,
            StandardOpenOption.WRITE, StandardOpenOption.READ)); // Default options

        client.downloadToFileWithResponse(file, FileRange, new ParallelTransferOptions(4 * Constants.MB, null, null),
            downloadRetryOptions, null, false, openOptions, timeout, new Context(key2, value2));
        System.out.println("Completed download to file");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.downloadToFileWithResponse#String-FileRange-ParallelTransferOptions-DownloadRetryOptions-DataLakeRequestConditions-boolean-Set-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileClient#append(InputStream, long, long)} and
     * {@link DataLakeFileClient#appendWithResponse(InputStream, long, long, byte[], String, Duration, Context)}
     */
    public void appendCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.append#InputStream-long-long
        client.append(data, offset, length);
        System.out.println("Append data completed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.append#InputStream-long-long

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.appendWithResponse#InputStream-long-long-byte-String-Duration-Context
        FileRange range = new FileRange(1024, 2048L);
        DownloadRetryOptions options = new DownloadRetryOptions().setMaxRetryRequests(5);
        byte[] contentMd5 = new byte[0]; // Replace with valid md5

        Response<Void> response = client.appendWithResponse(data, offset, length, contentMd5, leaseId, timeout,
            new Context(key1, value1));
        System.out.printf("Append data completed with status %d%n", response.getStatusCode());
        // END: com.azure.storage.file.datalake.DataLakeFileClient.appendWithResponse#InputStream-long-long-byte-String-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileClient#flush(long)}  and
     * {@link DataLakeFileClient#flushWithResponse(long, boolean, boolean, PathHttpHeaders, DataLakeRequestConditions, Duration, Context)}
     */
    public void flushCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.flush#long
        client.flush(position);
        System.out.println("Flush data completed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.flush#long

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.flush#long-boolean
        boolean overwrite = true;
        client.flush(position, overwrite);
        System.out.println("Flush data completed");
        // END: com.azure.storage.file.datalake.DataLakeFileClient.flush#long-boolean

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileClient.flushWithResponse#long-boolean-boolean-PathHttpHeaders-DataLakeRequestConditions-Duration-Context
        FileRange range = new FileRange(1024, 2048L);
        DownloadRetryOptions options = new DownloadRetryOptions().setMaxRetryRequests(5);
        byte[] contentMd5 = new byte[0]; // Replace with valid md5
        boolean retainUncommittedData = false;
        boolean close = false;
        PathHttpHeaders httpHeaders = new PathHttpHeaders()
            .setContentLanguage("en-US")
            .setContentType("binary");
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);

        Response<PathInfo> response = client.flushWithResponse(position, retainUncommittedData, close, httpHeaders,
            requestConditions, timeout, new Context(key1, value1));
        System.out.printf("Flush data completed with status %d%n", response.getStatusCode());
        // END: com.azure.storage.file.datalake.DataLakeFileClient.flushWithResponse#long-boolean-boolean-PathHttpHeaders-DataLakeRequestConditions-Duration-Context
    }

}
