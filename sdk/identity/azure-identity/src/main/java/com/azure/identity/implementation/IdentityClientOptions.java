// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.ProxyOptions;
import com.azure.core.util.Configuration;
import com.azure.identity.KnownAuthorityHosts;
import com.microsoft.aad.msal4jextensions.PersistenceSettings;
import com.sun.jna.Platform;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;

/**
 * Options to configure the IdentityClient.
 */
public final class IdentityClientOptions {
    private static final int MAX_RETRY_DEFAULT_LIMIT = 3;
    private static final String DEFAULT_CACHE_FILE_NAME = "msal.cache";
    private static final Path DEFAULT_CACHE_FILE_PATH = Platform.isWindows()
            ? Paths.get(System.getProperty("user.home"), "AppData", "Local", ".IdentityService")
            : Paths.get(System.getProperty("user.home"), ".IdentityService");
    private static final String DEFAULT_KEYCHAIN_SERVICE = "Microsoft.Developer.IdentityService";
    private static final String DEFAULT_KEYCHAIN_ACCOUNT = "MSALCache";
    private static final String DEFAULT_KEYRING_NAME = "default";
    private static final String DEFAULT_KEYRING_SCHEMA = "msal.cache";
    private static final String DEFAULT_KEYRING_ITEM_NAME = DEFAULT_KEYCHAIN_ACCOUNT;
    private static final String DEFAULT_KEYRING_ATTR_NAME = "MsalClientID";
    private static final String DEFAULT_KEYRING_ATTR_VALUE = "Microsoft.Developer.IdentityService";

    private String authorityHost;
    private int maxRetry;
    private Function<Duration, Duration> retryTimeout;
    private ProxyOptions proxyOptions;
    private HttpPipeline httpPipeline;
    private ExecutorService executorService;
    private Duration tokenRefreshOffset = Duration.ofMinutes(2);
    private HttpClient httpClient;
    private Path cacheFileDirectory;
    private String cacheFileName;
    private String keychainService;
    private String keychainAccount;
    private String keyringName;
    private String keyringItemSchema;
    private String keyringItemName;
    private final String[] attributes; // preserve order
    private boolean allowUnencryptedCache;
    private boolean sharedTokenCacheEnabled;

    /**
     * Creates an instance of IdentityClientOptions with default settings.
     */
    public IdentityClientOptions() {
        Configuration configuration = Configuration.getGlobalConfiguration();
        authorityHost = configuration.get(Configuration.PROPERTY_AZURE_AUTHORITY_HOST, KnownAuthorityHosts.AZURE_CLOUD);
        maxRetry = MAX_RETRY_DEFAULT_LIMIT;
        retryTimeout = i -> Duration.ofSeconds((long) Math.pow(2, i.getSeconds() - 1));
        cacheFileDirectory = DEFAULT_CACHE_FILE_PATH;
        cacheFileName = DEFAULT_CACHE_FILE_NAME;
        keychainService = DEFAULT_KEYCHAIN_SERVICE;
        keychainAccount = DEFAULT_KEYCHAIN_ACCOUNT;
        keyringName = DEFAULT_KEYRING_NAME;
        keyringItemSchema = DEFAULT_KEYRING_SCHEMA;
        keyringItemName = DEFAULT_KEYRING_ITEM_NAME;
        attributes = new String[] { DEFAULT_KEYRING_ATTR_NAME, DEFAULT_KEYRING_ATTR_VALUE };
        allowUnencryptedCache = false;
        sharedTokenCacheEnabled = false;
    }

    /**
     * @return the Azure Active Directory endpoint to acquire tokens.
     */
    public String getAuthorityHost() {
        return authorityHost;
    }

    /**
     * Specifies the Azure Active Directory endpoint to acquire tokens.
     * @param authorityHost the Azure Active Directory endpoint
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setAuthorityHost(String authorityHost) {
        this.authorityHost = authorityHost;
        return this;
    }

    /**
     * @return the max number of retries when an authentication request fails.
     */
    public int getMaxRetry() {
        return maxRetry;
    }

    /**
     * Specifies the max number of retries when an authentication request fails.
     * @param maxRetry the number of retries
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setMaxRetry(int maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }

    /**
     * @return a Function to calculate seconds of timeout on every retried request.
     */
    public Function<Duration, Duration> getRetryTimeout() {
        return retryTimeout;
    }

    /**
     * Specifies a Function to calculate seconds of timeout on every retried request.
     * @param retryTimeout the Function that returns a timeout in seconds given the number of retry
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setRetryTimeout(Function<Duration, Duration> retryTimeout) {
        this.retryTimeout = retryTimeout;
        return this;
    }

    /**
     * @return the options for proxy configuration.
     */
    public ProxyOptions getProxyOptions() {
        return proxyOptions;
    }

    /**
     * Specifies the options for proxy configuration.
     * @param proxyOptions the options for proxy configuration
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setProxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * @return the HttpPipeline to send all requests
     */
    public HttpPipeline getHttpPipeline() {
        return httpPipeline;
    }

    /**
     * @return the HttpClient to use for requests
     */
    public HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Specifies the HttpPipeline to send all requests. This setting overrides the others.
     * @param httpPipeline the HttpPipeline to send all requests
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setHttpPipeline(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        return this;
    }

    /**
     * Specifies the ExecutorService to be used to execute the authentication requests.
     * Developer is responsible for maintaining the lifecycle of the ExecutorService.
     *
     * <p>
     * If this is not configured, the {@link ForkJoinPool#commonPool()} will be used which is
     * also shared with other application tasks. If the common pool is heavily used for other tasks, authentication
     * requests might starve and setting up this executor service should be considered.
     * </p>
     *
     * <p> The executor service and can be safely shutdown if the TokenCredential is no longer being used by the
     * Azure SDK clients and should be shutdown before the application exits. </p>
     *
     * @param executorService the executor service to use for executing authentication requests.
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    /**
     * @return the ExecutorService to execute authentication requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * @return how long before the actual token expiry to refresh the token.
     */
    public Duration getTokenRefreshOffset() {
        return tokenRefreshOffset;
    }

    /**
     * Sets how long before the actual token expiry to refresh the token. The
     * token will be considered expired at and after the time of (actual
     * expiry - token refresh offset). The default offset is 2 minutes.
     *
     * This is useful when network is congested and a request containing the
     * token takes longer than normal to get to the server.
     *
     * @param tokenRefreshOffset the duration before the actual expiry of a token to refresh it
     * @return IdentityClientOptions
     * @throws NullPointerException If {@code tokenRefreshOffset} is null.
     */
    public IdentityClientOptions setTokenRefreshOffset(Duration tokenRefreshOffset) {
        Objects.requireNonNull(tokenRefreshOffset, "The token refresh offset cannot be null.");
        this.tokenRefreshOffset = tokenRefreshOffset;
        return this;
    }

    /**
     * Specifies the HttpClient to send use for requests.
     * @param httpClient the http client to use for requests
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    PersistenceSettings getPersistenceSettings() {
        return PersistenceSettings.builder(cacheFileName, cacheFileDirectory)
                .setMacKeychain(keychainService, keychainAccount)
                .setLinuxKeyring(keyringName, keyringItemSchema, keyringItemName,
                        attributes[0], attributes[1], null, null)
                .setLinuxUseUnprotectedFileAsCacheStorage(allowUnencryptedCache)
                .build();
    }

    /**
     * Sets whether to use an unprotected file specified by <code>cacheFileLocation()</code> instead of
     * Gnome keyring on Linux. This is false by default.
     *
     * @param allowUnencryptedCache whether to use an unprotected file for cache storage.
     *
     * @return The updated identity client options.
     */
    public IdentityClientOptions allowUnencryptedCache(boolean allowUnencryptedCache) {
        this.allowUnencryptedCache = allowUnencryptedCache;
        return this;
    }

    /**
     * Gets if the shared token cache is disabled.
     * @return if the shared token cache is disabled.
     */
    public boolean isSharedTokenCacheEnabled() {
        return this.sharedTokenCacheEnabled;
    }

    /**
     * Sets whether to enable using the shared token cache. This is disabled by default.
     *
     * @param enabled whether to enable using the shared token cache.
     *
     * @return The updated identity client options.
     */
    public IdentityClientOptions enablePersistentCache(boolean enabled) {
        this.sharedTokenCacheEnabled = enabled;
        return this;
    }
}
