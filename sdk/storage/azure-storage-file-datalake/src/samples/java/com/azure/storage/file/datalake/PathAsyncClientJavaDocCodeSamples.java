// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake;

import com.azure.storage.file.datalake.models.DataLakeRequestConditions;
import com.azure.storage.file.datalake.models.PathAccessControl;
import com.azure.storage.file.datalake.models.PathHttpHeaders;

import java.util.Collections;
import java.util.Map;

/**
 * Code snippets for {@link FileSystemClient}
 */
@SuppressWarnings({"unused"})
public class PathAsyncClientJavaDocCodeSamples {
    private String fileName = "fileName";
    private DataLakeFileAsyncClient client = JavaDocCodeSnippetsHelpers.getFileAsyncClient(fileName);
    private String leaseId = "leaseId";

    /**
     * Code snippets for {@link PathAsyncClient#setMetadata(Map)}
     */
    public void setMetadataCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.setMetadata#Map
        client.setMetadata(Collections.singletonMap("metadata", "value"))
            .subscribe(response -> System.out.println("Set metadata completed"));
        // END: com.azure.storage.file.datalake.PathAsyncClient.setMetadata#Map
    }

    /**
     * Code snippets for {@link PathAsyncClient#setMetadataWithResponse(Map, DataLakeRequestConditions)}
     */
    public void setMetadataWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.setMetadata#Map-DataLakeRequestConditions
        DataLakeRequestConditions accessConditions = new DataLakeRequestConditions().setLeaseId(leaseId);

        client.setMetadataWithResponse(Collections.singletonMap("metadata", "value"), accessConditions)
            .subscribe(response -> System.out.printf("Set metadata completed with status %d%n",
                response.getStatusCode()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.setMetadata#Map-DataLakeRequestConditions
    }

    /**
     * Code snippets for {@link PathAsyncClient#setHttpHeaders(PathHttpHeaders)}
     */
    public void setHTTPHeadersCodeSnippet() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.setHttpHeaders#PathHttpHeaders
        client.setHttpHeaders(new PathHttpHeaders()
            .setContentLanguage("en-US")
            .setContentType("binary"));
        // END: com.azure.storage.file.datalake.PathAsyncClient.setHttpHeaders#PathHttpHeaders
    }

    /**
     * Code snippets for {@link PathAsyncClient#setHttpHeadersWithResponse(PathHttpHeaders, DataLakeRequestConditions)}
     */
    public void setHTTPHeadersWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.setHttpHeadersWithResponse#PathHttpHeaders-DataLakeRequestConditions
        DataLakeRequestConditions accessConditions = new DataLakeRequestConditions().setLeaseId(leaseId);

        client.setHttpHeadersWithResponse(new PathHttpHeaders()
            .setContentLanguage("en-US")
            .setContentType("binary"), accessConditions).subscribe(
            response ->
                System.out.printf("Set HTTP headers completed with status %d%n",
                    response.getStatusCode()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.setHttpHeadersWithResponse#PathHttpHeaders-DataLakeRequestConditions
    }

    /**
     * Code snippets for {@link PathAsyncClient#getProperties()}
     */
    public void getPropertiesCodeSnippet() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.getProperties
        client.getProperties().subscribe(response ->
            System.out.printf("Creation Time: %s, Size: %d%n", response.getCreationTime(), response.getFileSize()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.getProperties
    }

    /**
     * Code snippets for {@link PathAsyncClient#getPropertiesWithResponse(DataLakeRequestConditions)}
     */
    public void getPropertiesWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.getPropertiesWithResponse#DataLakeRequestConditions
        DataLakeRequestConditions accessConditions = new DataLakeRequestConditions().setLeaseId(leaseId);

        client.getPropertiesWithResponse(accessConditions).subscribe(
            response -> System.out.printf("Creation Time: %s, Size: %d%n", response.getValue().getCreationTime(),
                response.getValue().getFileSize()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.getPropertiesWithResponse#DataLakeRequestConditions
    }

    /**
     * Code snippets for {@link PathAsyncClient#setAccessControl(PathAccessControl)}
     */
    public void setAccessControlCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.setAccessControl#PathAccessControl
        PathAccessControl control = new PathAccessControl()
            .setPermissions("0766");

        client.setAccessControl(control).subscribe(
            response -> System.out.printf("Last Modified Time: %s", response.getLastModified()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.setAccessControl#PathAccessControl
    }

    /**
     * Code snippets for {@link PathAsyncClient#setAccessControlWithResponse(PathAccessControl, DataLakeRequestConditions)}
     */
    public void setAccessControlWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.setAccessControlWithResponse#PathAccessControl-DataLakeRequestConditions
        DataLakeRequestConditions accessConditions = new DataLakeRequestConditions().setLeaseId(leaseId);
        PathAccessControl control = new PathAccessControl().setPermissions("0766");

        client.setAccessControlWithResponse(control, accessConditions).subscribe(
            response -> System.out.printf("Last Modified Time: %s", response.getValue().getLastModified()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.setAccessControlWithResponse#PathAccessControl-DataLakeRequestConditions
    }

    /**
     * Code snippets for {@link PathAsyncClient#getAccessControl()}
     */
    public void getAccessControlCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.getAccessControl
        client.getAccessControl().subscribe(
            response -> System.out.printf("Access Control List: %s, Group: %s, Owner: %s, Permissions: %s",
                response.getAcl(), response.getGroup(), response.getOwner(), response.getPermissions()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.getAccessControl
    }

    /**
     * Code snippets for {@link PathAsyncClient#getAccessControlWithResponse(boolean, DataLakeRequestConditions)}
     */
    public void getAccessControlWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.PathAsyncClient.getAccessControlWithResponse#boolean-DataLakeRequestConditions
        DataLakeRequestConditions accessConditions = new DataLakeRequestConditions().setLeaseId(leaseId);
        boolean returnUpn = false;

        client.getAccessControlWithResponse(returnUpn, accessConditions).subscribe(
            response -> System.out.printf("Access Control List: %s, Group: %s, Owner: %s, Permissions: %s",
                response.getValue().getAcl(), response.getValue().getGroup(), response.getValue().getOwner(),
                response.getValue().getPermissions()));
        // END: com.azure.storage.file.datalake.PathAsyncClient.getAccessControlWithResponse#boolean-DataLakeRequestConditions
    }

}
