// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.implementation.util;

import com.azure.storage.blob.BlobServiceVersion;
import com.azure.storage.blob.implementation.AzureBlobStorageImpl;
import com.azure.storage.blob.models.CpkInfo;
import com.azure.storage.blob.specialized.BlobAsyncClientBase;

/**
 * The blob helper takes in the blob related client and has helper methods on getting the properties of the client.
 */
public final class BlobHelper {

    private BlobHelper() {
    }

    private static AsyncPropertyAccessor asyncPropertyAccessor;

    /**
     * Sets the async property accessor
     *
     * @param newAccessor
     */
    public static void setAsyncPropertyAccessor(final AsyncPropertyAccessor newAccessor) {
        if (newAccessor == null) {
            throw new IllegalStateException();
        }
        asyncPropertyAccessor = newAccessor;
    }

    /**
     * Gets azureBlobStorage field from the async client.
     *
     * @param client the client with private field to retrieve.
     * @return the azureBlobStorage property.
     */
    public static AzureBlobStorageImpl getAzureBlobStorageImpl(BlobAsyncClientBase client) {
        return asyncPropertyAccessor.getAzureBlobStorageImpl(client);
    }

    /**
     * Gets serviceVersion field from the async client.
     *
     * @param client the client with private field to retrieve.
     * @return the serviceVersion property.
     */
    public static BlobServiceVersion getServiceVersion(BlobAsyncClientBase client) {
        return asyncPropertyAccessor.getServiceVersion(client);
    }

    /**
     * Gets customerProvidedKey field from the async client.
     *
     * @param client the client with private field to retrieve.
     * @return the customerProvidedKey property.
     */
    public static CpkInfo getCustomerProvidedKey(BlobAsyncClientBase client) {
        return asyncPropertyAccessor.getCustomerProvidedKey(client);
    }

    /**
     * The interface to get property value from async property accessor.
     */
    public interface AsyncPropertyAccessor {
        AzureBlobStorageImpl getAzureBlobStorageImpl(BlobAsyncClientBase client);
        CpkInfo getCustomerProvidedKey(BlobAsyncClientBase client);
        BlobServiceVersion getServiceVersion(BlobAsyncClientBase client);
    }

    private static SyncPropertyAccessor syncPropertyAccessor;

    /**
     * Sets the sync property accessor
     *
     * @param newAccessor
     */
    public static void setSyncPropertyAccessor(final SyncPropertyAccessor newAccessor) {
        if (newAccessor == null) {
            throw new IllegalStateException();
        }
        syncPropertyAccessor = newAccessor;
    }

    /**
     * Gets azureBlobStorage field from the sync client.
     *
     * @return the azureBlobStorage property.
     */
    public static AzureBlobStorageImpl getAzureBlobStorageImpl() {
        return syncPropertyAccessor.getAzureBlobStorageImpl();
    }

    /**
     * Gets serviceVersion field from the sync client.
     *
     * @return the serviceVersion property.
     */
    public static BlobServiceVersion getServiceVersion() {
        return syncPropertyAccessor.getServiceVersion();
    }

    /**
     * Gets customerProvidedKey field from the sync client.
     *
     * @return the customerProvidedKey property.
     */
    public static CpkInfo getCustomerProvidedKey() {
        return syncPropertyAccessor.getCustomerProvidedKey();
    }

    /**
     * The interface to get property value from sync property accessor.
     */
    public interface SyncPropertyAccessor {
        AzureBlobStorageImpl getAzureBlobStorageImpl();
        CpkInfo getCustomerProvidedKey();
        BlobServiceVersion getServiceVersion();
    }
}
