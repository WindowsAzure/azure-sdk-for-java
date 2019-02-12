package com.microsoft.azure.keyvault.cryptography.algorithms;

public class Es384 extends Ecdsa {
    public static final String ALGORITHM_NAME = "ES384";

    @Override
    public int getDigestLength() {
        return 48;
    }
    
    @Override
    public int getCoordLength() {
        return 48;
    }
}
