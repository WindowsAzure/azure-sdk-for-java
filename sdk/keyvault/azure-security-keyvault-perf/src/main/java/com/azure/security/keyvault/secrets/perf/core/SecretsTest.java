// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.security.keyvault.secrets.perf.core;

import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.perf.test.core.PerfStressOptions;
import com.azure.perf.test.core.PerfStressTest;
import com.azure.security.keyvault.secrets.SecretAsyncClient;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;

public abstract class SecretsTest<TOptions extends PerfStressOptions> extends PerfStressTest<TOptions> {
    protected final SecretClient secretClient;
    protected final SecretAsyncClient secretAsyncClient;
    private final Configuration configuration;

    /**
     * Creates an instance of performance test.
     *
     * @param options the options configured for the test.
     */
    public SecretsTest(TOptions options) {
        super(options);

        configuration = Configuration.getGlobalConfiguration().clone();
        String vaultUrl = configuration.get("AZURE_KEYVAULT_CLIENT_ID");

        if (CoreUtils.isNullOrEmpty(vaultUrl)) {
            throw new IllegalStateException("Environment variable AZURE_KEYVAULT_CLIENT_ID must be set");
        }

        // Setup the service client
        SecretClientBuilder builder = new SecretClientBuilder()
            .vaultUrl(vaultUrl)
            .credential(new DefaultAzureCredentialBuilder().build());

        secretClient = builder.buildClient();
        secretAsyncClient = builder.buildAsyncClient();
    }
}
