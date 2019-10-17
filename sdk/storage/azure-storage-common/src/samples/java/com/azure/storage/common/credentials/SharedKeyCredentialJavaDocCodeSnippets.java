// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.credentials;

import com.azure.storage.common.StorageSharedKeyCredential;

/**
 * Code snippets for {@link StorageSharedKeyCredential}.
 */
public final class SharedKeyCredentialJavaDocCodeSnippets {

    /**
     * Code snippets for {@link StorageSharedKeyCredential#fromConnectionString(String)}.
     */
    public void fromConnectionString() {
        String connectionString = "AccountName=accountname;AccountKey=accountkey;additionalproperties";
        // BEGIN: com.azure.storage.common.StorageSharedKeyCredential.fromConnectionString#String
        StorageSharedKeyCredential credential = StorageSharedKeyCredential.fromConnectionString(connectionString);
        // END: com.azure.storage.common.StorageSharedKeyCredential.fromConnectionString#String
    }
}
