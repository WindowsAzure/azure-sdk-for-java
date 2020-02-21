// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.quickquery;

import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;

/**
 * Code snippets for {@link BlobQuickQueryClientBuilder}
 */
@SuppressWarnings({"unused"})
public class BlobQuickQueryClientBuilderJavaDocCodeSnippets {
    private BlobClient blobClient = new BlobClientBuilder().buildClient();
    private BlobAsyncClient blobAsyncClient = new BlobClientBuilder().buildAsyncClient();

    /**
     * Code snippet for {@link BlobQuickQueryClientBuilder#buildClient()}
     */
    public void constructClient() {
        // BEGIN: com.azure.storage.blob.quickquery.BlobQuickQueryClientBuilder#buildClient
        BlobQuickQueryClient batchClient = new BlobQuickQueryClientBuilder(blobClient).buildClient();
        // END: com.azure.storage.blob.quickquery.BlobQuickQueryClientBuilder#buildClient
    }

    /**
     * Code snippet for {@link BlobQuickQueryClientBuilder#buildAsyncClient()}
     */
    public void constructAsyncClient() {
        // BEGIN: com.azure.storage.blob.quickquery.BlobQuickQueryClientBuilder#buildAsyncClient
        BlobQuickQueryAsyncClient batchClient = new BlobQuickQueryClientBuilder(blobAsyncClient).buildAsyncClient();
        // END: com.azure.storage.blob.quickquery.BlobQuickQueryClientBuilder#buildAsyncClient
    }


}
