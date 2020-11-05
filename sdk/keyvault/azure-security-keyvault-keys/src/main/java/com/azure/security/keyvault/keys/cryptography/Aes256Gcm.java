// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

public class Aes256Gcm extends AesGcm {
    private static final int KEY_SIZE = 256;
    public static final String ALGORITHM_NAME = "A256GCM";

    Aes256Gcm() {
        super(ALGORITHM_NAME, KEY_SIZE);
    }
}
