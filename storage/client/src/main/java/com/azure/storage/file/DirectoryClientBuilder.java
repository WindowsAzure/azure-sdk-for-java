// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file;

import com.azure.core.util.configuration.Configuration;
import com.azure.core.util.configuration.ConfigurationManager;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.implementation.http.policy.spi.HttpPolicyProviders;
import com.azure.storage.common.credentials.SASTokenCredential;
import com.azure.storage.common.credentials.SharedKeyCredential;
import com.azure.storage.common.policy.SASTokenCredentialPolicy;
import com.azure.storage.common.policy.SharedKeyCredentialPolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of the {@link DirectoryClient FileClients}
 * and {@link DirectoryAsyncClient FileAsyncClients}, calling {@link DirectoryClientBuilder#build() build}
 * constructs an instance of FileClient and calling {@link DirectoryClientBuilder#buildAsync() buildAsync}
 * constructs an instance of FileAsyncClient.
 *
 * <p>The client needs the endpoint of the Azure Storage File service, name of the share, and authorization credential.
 * {@link DirectoryClientBuilder#endpoint(String) endpoint} gives the builder the endpoint and may give the builder the
 * {@link DirectoryClientBuilder#shareName(String)}, {@link DirectoryClientBuilder#directoryName(String)} and a {@link SASTokenCredential} that authorizes the client.</p>
 *
 * <pre>
 * DirectoryClient client = DirectoryClient.builder()
 *     .endpoint(endpointWithSASTokenQueryParams)
 *     .build();
 * </pre>
 *
 * <pre>
 * DirectoryAsyncClient client = DirectoryAsyncClient.builder()
 *     .endpoint(endpointWithSASTokenQueryParams)
 *     .buildAsync();
 * </pre>
 *
 * <p>If the {@code endpoint} doesn't contain the query parameters to construct a {@code SASTokenCredential} they may
 * be set using {@link DirectoryClientBuilder#credential(SASTokenCredential) credential}.</p>
 *
 * <pre>
 * DirectoryClient client = DirectoryClient.builder()
 *     .endpoint(endpointWithoutSASTokenQueryParams)
 *     .shareName(shareName)
 *     .directoryName(directoryName)
 *     .credential(SASTokenCredential.fromQuery(SASTokenQueryParams))
 *     .build();
 * </pre>
 *
 * <pre>
 * DirectoryAsyncClient client = DirectoryAsyncClient.builder()
 *     .endpoint(endpointWithoutSASTokenQueryParams)
 *     .shareName(shareName)
 *     .directoryName(directoryName)
 *     .credential(SASTokenCredential.fromQuery(SASTokenQueryParams))
 *     .buildAsync();
 * </pre>
 *
 * <p>Another way to authenticate the client is using a {@link SharedKeyCredential}. To create a SharedKeyCredential
 * a connection string from the Storage File service must be used. Set the SharedKeyCredential with
 * {@link DirectoryClientBuilder#connectionString(String) connectionString}. If the builder has both a SASTokenCredential and
 * SharedKeyCredential the SharedKeyCredential will be preferred when authorizing requests sent to the service.</p>
 *
 * <pre>
 * DirectoryClient client = DirectoryClient().builder()
 *     .endpoint(endpoint)
 *     .shareName(shareName)
 *     .directoryName(directoryName)
 *     .connectionString(connectionString)
 *     .build();
 * </pre>
 *
 * <pre>
 * DirectoryAsyncClient client = DirectoryAsyncClient().builder()
 *     .endpoint(endpoint)
 *     .shareName(shareName)
 *     .directoryName(directoryName)
 *     .connectionString(connectionString)
 *     .buildAsync();
 * </pre>
 *
 * @see DirectoryClient
 * @see DirectoryAsyncClient
 * @see SASTokenCredential
 * @see SharedKeyCredential
 */
public class DirectoryClientBuilder {
    private static final String ACCOUNT_NAME = "AccountName".toLowerCase();
    private final List<HttpPipelinePolicy> policies;
    private final RetryPolicy retryPolicy;

    private HttpLogDetailLevel logLevel;
    private Configuration configuration;
    private URL endpoint;
    private String shareName;
    private String directoryName;
    private SASTokenCredential sasTokenCredential;
    private SharedKeyCredential sharedKeyCredential;
    private HttpClient httpClient;
    private HttpPipeline pipeline;
    private String shareSnapshot;


    DirectoryClientBuilder() {
        retryPolicy = new RetryPolicy();
        logLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();

        configuration = ConfigurationManager.getConfiguration();
    }

    /**
     * Creates a {@link DirectoryAsyncClient} based on options set in the builder. Every time {@code buildAsync()} is
     * called a new instance of {@link DirectoryAsyncClient} is created.
     *
     * <p>
     * If {@link DirectoryClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link DirectoryClientBuilder#endpoint(String) endpoint} are used to create the
     * {@link DirectoryAsyncClient client}. All other builder settings are ignored.
     * </p>
     *
     * @return A ShareAsyncClient with the options set from the builder.
     * @throws NullPointerException If {@code endpoint} or {@code shareName} is {@code null}.
     * @throws IllegalStateException If neither a {@link SharedKeyCredential} or {@link SASTokenCredential} has been set.
     */
    public DirectoryAsyncClient buildAsync() {
        Objects.requireNonNull(endpoint);

        if (sasTokenCredential == null && sharedKeyCredential == null) {
            throw new IllegalArgumentException("Credentials are required for authorization");
        }

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(FileConfiguration.NAME, FileConfiguration.VERSION, configuration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddDatePolicy());

        if (sharedKeyCredential != null) {
            policies.add(new SharedKeyCredentialPolicy(sharedKeyCredential));
        } else {
            policies.add(new SASTokenCredentialPolicy(sasTokenCredential));
        }

        HttpPolicyProviders.addBeforeRetryPolicies(policies);

        policies.add(retryPolicy);

        policies.addAll(this.policies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(logLevel));

        HttpPipeline pipeline = HttpPipeline.builder()
                                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                                    .httpClient(httpClient)
                                    .build();

        return new DirectoryAsyncClient(endpoint, pipeline, shareName, directoryName, shareSnapshot);
    }

    /**
     * Creates a {@link DirectoryClient} based on options set in the builder. Every time {@code build()} is
     * called a new instance of {@link DirectoryClient} is created.
     *
     * <p>
     * If {@link DirectoryClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link DirectoryClientBuilder#endpoint(String) endpoint} are used to create the
     * {@link DirectoryClient client}. All other builder settings are ignored.
     * </p>
     *
     * @return A DirectoryClient with the options set from the builder.
     * @throws NullPointerException If {@code endpoint}, {@code shareName} or {@code directoryName} is {@code null}.
     * @throws IllegalStateException If neither a {@link SharedKeyCredential} or {@link SASTokenCredential} has been set.
     */
    public DirectoryClient build() {
        return new DirectoryClient(this.buildAsync());
    }

    /**
     * Sets the endpoint for the Azure Storage File instance that the client will interact with.
     *
     * <p>The first path segment, if the endpoint contains path segments, will be assumed to be the name of the share
     * that the client will interact with. Rest of the path segments should be the path of the directory. </p>
     *
     * <p>Query parameters of the endpoint will be parsed using {@link SASTokenCredential#(String) fromQuery} in an
     * attempt to generate a {@link SASTokenCredential} to authenticate requests sent to the service.</p>
     *
     * @param endpoint The URL of the Azure Storage File instance to send service requests to and receive responses from.
     * @return the updated DirectoryClientBuilder object
     * @throws IllegalArgumentException If {@code endpoint} is {@code null} or is an invalid URL
     */
    public DirectoryClientBuilder endpoint(String endpoint) {
        Objects.requireNonNull(endpoint);
        try {
            URL fullURL = new URL(endpoint);
            this.endpoint = new URL(fullURL.getProtocol() + "://" + fullURL.getHost());
            String[] pathSegments = fullURL.getPath().split("/");
            int length = pathSegments.length;
            this.shareName = length >= 2 ? pathSegments[1] : this.shareName;
            this.directoryName = length >= 3 ? pathSegments[2] : this.directoryName;

            // Attempt to get the SAS token from the URL passed
            SASTokenCredential credential = SASTokenCredential.fromQuery(fullURL.getQuery());
            if (credential != null) {
                this.sasTokenCredential = credential;
            }
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException("The Azure Storage Directory endpoint url is malformed.");
        }

        return this;
    }

    /**
     * Sets the {@link SASTokenCredential} used to authenticate requests sent to the File service.
     *
     * @param credential SAS token credential generated from the Storage account that authorizes requests
     * @return the updated DirectoryClientBuilder object
     * @throws NullPointerException If {@code credential} is {@code null}.
     */
    public DirectoryClientBuilder credential(SASTokenCredential credential) {
        this.sasTokenCredential = credential;
        return this;
    }

    /**
     * Creates a {@link SharedKeyCredential} from the {@code connectionString} used to authenticate requests sent to the
     * File service.
     *
     * @param connectionString Connection string from the Access Keys section in the Storage account
     * @return the updated DirectoryClientBuilder object
     * @throws NullPointerException If {@code connectionString} is {@code null}.
     */
    public DirectoryClientBuilder connectionString(String connectionString) {
        Objects.requireNonNull(connectionString);
        this.sharedKeyCredential = SharedKeyCredential.fromConnectionString(connectionString);
        getEndPointFromConnectionString(connectionString);
        return this;
    }

    private void getEndPointFromConnectionString(String connectionString) {
        Map<String, String> connectionStringPieces = new HashMap<>();
        for (String connectionStringPiece : connectionString.split(";")) {
            String[] kvp = connectionStringPiece.split("=", 2);
            connectionStringPieces.put(kvp[0].toLowerCase(), kvp[1]);
        }
        String accountName = connectionStringPieces.get(ACCOUNT_NAME);
        try {
            this.endpoint = new URL(String.format("https://%s.file.core.windows.net", accountName));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(String.format("There is no valid endpoint for the connection string. " +
                                                                 "Connection String: %s", connectionString));
        }
    }

    /**
     * Sets the share that the constructed clients will interact with
     *
     * @param shareName Name of the share
     * @return the updated DirectoryClientBuilder object
     * @throws NullPointerException If {@code shareName} is {@code null}.
     */
    public DirectoryClientBuilder shareName (String shareName) {
        this.shareName = shareName;
        return this;
    }

    /**
     * Sets the directory that the constructed clients will interact with
     *
     * @param directoryName Path to the directory
     * @return the updated DirectoryClientBuilder object
     * @throws NullPointerException If {@code directoryName} is {@code null}.
     */
    public DirectoryClientBuilder directoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }

    /**
     * Sets the HTTP client to use for sending and receiving requests to and from the service.
     *
     * @param httpClient The HTTP client to use for requests.
     * @return The updated DirectoryClientBuilder object.
     * @throws NullPointerException If {@code httpClient} is {@code null}.
     */
    public DirectoryClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Adds a policy to the set of existing policies that are executed after the {@link RetryPolicy}.
     *
     * @param pipelinePolicy The retry policy for service requests.
     * @return The updated DirectoryClientBuilder object.
     * @throws NullPointerException If {@code pipelinePolicy} is {@code null}.
     */
    public DirectoryClientBuilder addPolicy(HttpPipelinePolicy pipelinePolicy) {
        this.policies.add(pipelinePolicy);
        return this;
    }

    /**
     * Sets the logging level for HTTP requests and responses.
     *
     * @param logLevel The amount of logging output when sending and receiving HTTP requests/responses.
     * @return The updated DirectoryClientBuilder object.
     */
    public DirectoryClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Sets the HTTP pipeline to use for the service client.
     *
     * <p>If {@code pipeline} is set, all other settings are ignored, aside from {@link DirectoryClientBuilder#endpoint(String) endpoint},
     * {@link DirectoryClientBuilder#shareName(String) shareName} @{link DirectoryClientBuilder#directoryName(String) filePath}, and {@link DirectoryClientBuilder#shareSnapshot(String) snaphotShot}
     * when building clients.</p>
     *
     * @param pipeline The HTTP pipeline to use for sending service requests and receiving responses.
     * @return The updated DirectoryClientBuilder object.
     * @throws NullPointerException If {@code pipeline} is {@code null}.
     */
    public DirectoryClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = Objects.requireNonNull(pipeline);
        return this;
    }

    /**
     * Sets the configuration object used to retrieve environment configuration values used to build the client with
     * when they are not set in the builder, defaults to Configuration.NONE
     * @param configuration configuration store
     * @return the updated DirectoryClientBuilder object
     */
    public DirectoryClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets the snapshot that the constructed clients will interact with. This snapshot must be linked to the share
     * that has been specified in the builder.
     *
     * @param shareSnapshot Identifier of the snapshot
     * @return the updated DirectoryClientBuilder object
     * @throws NullPointerException If {@code shareSnapshot} is {@code null}.
     */
    public DirectoryClientBuilder shareSnapshot(String shareSnapshot) {
        this.shareSnapshot = shareSnapshot;
        return this;
    }
}
