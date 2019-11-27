// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.specialized.cryptography;


import com.azure.core.util.CoreUtils;
import com.azure.core.util.UserAgentProperties;

final class CryptographyConstants {
    static final String ENCRYPTION_PROTOCOL_V1 = "1.0";

    static final String AGENT_METADATA_KEY = "EncryptionLibrary";

    static final String AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";

    static final String AES_CBC_NO_PADDING = "AES/CBC/NoPadding";

    static final String AES = "AES";

    static final String AZURE_STORAGE_PROPERTIES = "azure-storage-blob.properties";

    static final String BLOB_CRYPTOGRAPHY_NAME = getName();

    static final String BLOB_CRYPTOGRAPHY_VERSION = getVersion();

    static final String AGENT_METADATA_VALUE = "JavaTrack2" + BLOB_CRYPTOGRAPHY_VERSION;

    static final String ENCRYPTION_DATA_KEY = "encryptiondata";

    static final String ENCRYPTION_MODE = "FullBlob";

    static final int ENCRYPTION_BLOCK_SIZE = 16;

    static final String RANGE_HEADER = "x-ms-range";

    static final String CONTENT_RANGE = "Content-Range";

    static final String CONTENT_LENGTH = "Content-Length";

    static final String METADATA_HEADER = "x-ms-meta-";

    static final String DECRYPT_UNENCRYPTED_BLOB = "Encryption client is being used but the blob metadata indicates "
        + "that it is not encrypted.";

    private CryptographyConstants() {
    }

    private static String getName() {
        UserAgentProperties properties = CoreUtils.getUserAgentProperties(AZURE_STORAGE_PROPERTIES);
        return properties.getName();
    }

    private static String getVersion() {
        UserAgentProperties properties = CoreUtils.getUserAgentProperties(AZURE_STORAGE_PROPERTIES);
        return properties.getVersion();
    }
}
