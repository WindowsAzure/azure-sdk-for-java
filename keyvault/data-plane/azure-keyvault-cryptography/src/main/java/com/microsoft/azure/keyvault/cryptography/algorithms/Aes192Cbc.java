// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.keyvault.cryptography.algorithms;

public class Aes192Cbc extends AesCbc {

    private static final int KEY_SIZE = 192;
    public static final String ALGORITHM_NAME = "A192CBC";

    public Aes192Cbc() {
        super(ALGORITHM_NAME, KEY_SIZE);
    }
}
