package com.azure.security.keyvault.secrets;

public enum ServiceVersion {
    V1_0("1.0");

    ServiceVersion(String version) { }

    public static ServiceVersion getLatest() {
        return V1_0;
    }
}
