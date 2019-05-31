// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.queue;

import com.azure.core.configuration.Configuration;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.TokenCredentialPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.implementation.http.policy.spi.HttpPolicyProviders;
import com.azure.core.implementation.util.ImplUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

final class QueueClientBuilderBase {
    private static final String DEFAULT_ENDPOINTS_PROTOCOL = "DefaultEndpointsProtocol".toLowerCase();
    private static final String ACCOUNT_NAME = "AccountName".toLowerCase();
    private static final String ACCOUNT_KEY = "AccountKey".toLowerCase();
    private static final String ENDPOINT_SUFFIX = "EndpointSuffix".toLowerCase();
    private static final String ENDPOINT_FORMAT = "%s://%s.queue.%s";

    private final List<HttpPipelinePolicy> policies;

    private URL endpoint;
    private TokenCredential credentials; // Revert this to SharedKeyCredentials once it is implemented.
    private HttpClient httpClient;
    private HttpLogDetailLevel logLevel;
    private RetryPolicy retryPolicy;
    private Configuration configuration;

    QueueClientBuilderBase() {
        retryPolicy = new RetryPolicy();
        logLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();
    }

    QueueAsyncRawClient build() {
        Objects.requireNonNull(endpoint);

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(QueueConfiguration.NAME, QueueConfiguration.VERSION));
        policies.add(new RequestIdPolicy());
        policies.add(new AddDatePolicy());
        policies.add(new TokenCredentialPolicy(credentials)); // This needs to be a different credential type.
        HttpPolicyProviders.addBeforeRetryPolicies(policies);

        policies.add(retryPolicy);

        policies.addAll(this.policies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(logLevel));

        HttpPipeline pipeline = HttpPipeline.builder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        return new QueueAsyncRawClient(endpoint, pipeline);
    }

    public QueueClientBuilderBase endpoint(String endpoint) throws MalformedURLException {
        this.endpoint = new URL(endpoint);
        return this;
    }

    public QueueClientBuilderBase credentials(TokenCredential credentials) {
        this.credentials = credentials;
        return this;
    }

    public QueueClientBuilderBase connectionString(String connectionString) throws MalformedURLException {
        Objects.requireNonNull(connectionString);

        Map<String, String> connectionKVPs = new HashMap<>();
        for (String s : connectionString.split(";")) {
            String[] kvp = s.split("=", 1);
            connectionKVPs.put(kvp[0].toLowerCase(), kvp[1]);
        }

        String protocol = connectionKVPs.get(DEFAULT_ENDPOINTS_PROTOCOL);
        String accountName = connectionKVPs.get(ACCOUNT_NAME);
        String accountKey = connectionKVPs.get(ACCOUNT_KEY);
        String endpointSuffix = connectionKVPs.get(ENDPOINT_SUFFIX);

        if (ImplUtils.isNullOrEmpty(protocol) ||
            ImplUtils.isNullOrEmpty(accountName) ||
            ImplUtils.isNullOrEmpty(accountKey) ||
            ImplUtils.isNullOrEmpty(endpointSuffix)) {
            throw new IllegalArgumentException("Improperly formatted connection string");
        }

        this.endpoint = new URL(String.format(endpointSuffix, protocol, accountName, endpointSuffix));
        // Use accountName and accountKey to get the SAS token using the credential class.

        return this;
    }

    public QueueClientBuilderBase httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public QueueClientBuilderBase addPolicy(HttpPipelinePolicy pipelinePolicy) {
        this.policies.add(pipelinePolicy);
        return this;
    }

    public QueueClientBuilderBase httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    public QueueClientBuilderBase configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }
}
