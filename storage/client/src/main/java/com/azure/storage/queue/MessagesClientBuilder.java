// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.queue;

import com.azure.core.configuration.Configuration;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpPipelinePolicy;

import java.net.MalformedURLException;

public final class MessagesClientBuilder {
    private final MessagesAsyncClientBuilder builder;

    MessagesClientBuilder() {
        builder = new MessagesAsyncClientBuilder();
    }

    public MessagesClient build() {
        return new MessagesClient(builder.build());
    }

    public MessagesClientBuilder endpoint(String endpoint) throws MalformedURLException {
        builder.endpoint(endpoint);
        return this;
    }

    public MessagesClientBuilder credentials(TokenCredential credentials) {
        builder.credentials(credentials);
        return this;
    }

    public MessagesClientBuilder connectionString(String connectionString) {
        builder.connectionString(connectionString);
        return this;
    }

    public MessagesClientBuilder httpClient(HttpClient httpClient) {
        builder.httpClient(httpClient);
        return this;
    }

    public MessagesClientBuilder addPolicy(HttpPipelinePolicy pipelinePolicy) {
        builder.addPolicy(pipelinePolicy);
        return this;
    }

    public MessagesClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        builder.httpLogDetailLevel(logLevel);
        return this;
    }

    public MessagesClientBuilder configuration(Configuration configuration) {
        builder.configuration(configuration);
        return this;
    }
}
