// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * TODO: Add class description
 */
public class SearchApiKeyPipelinePolicy implements HttpPipelinePolicy {

    private final ApiKeyCredentials apiKey;

    /**
     * Constructor
     *
     * @param apiKey Azure Cognitive Search service api admin or query key
     * @throws IllegalArgumentException when the api key is an empty string
     */
    public SearchApiKeyPipelinePolicy(ApiKeyCredentials apiKey) {
        Objects.requireNonNull(apiKey);
        this.apiKey = apiKey;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        context.getHttpRequest()
            .setHeader("api-key", this.apiKey.getApiKey());
        return next.process();
    }
}
