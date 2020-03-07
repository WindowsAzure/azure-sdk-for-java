// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.jdk11.httpclient;

import com.azure.core.http.HttpClient;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.jdk11.httpclient.implementation.Jdk11HttpClientProxySelector;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.time.Duration;
import java.util.Objects;

/**
 * Builder to configure and build an implementation of {@link HttpClient} for JDK 11 HttpClient.
 */
public class Jdk11AsyncHttpClientBuilder {
    private final ClientLogger logger = new ClientLogger(Jdk11AsyncHttpClientBuilder.class);

    private static final Duration DEFAULT_CONNECT_TIMEOUT = Duration.ofSeconds(60);

    private Duration connectionTimeout;
    private ProxyOptions proxyOptions;
    private Configuration configuration;

    /**
     * Creates OkHttpAsyncHttpClientBuilder.
     */
    public Jdk11AsyncHttpClientBuilder() {
    }

    /**
     * Sets the connection timeout.
     *
     * The default connection timeout is 60 seconds.
     *
     * @param connectionTimeout the connection timeout
     * @return the updated OkHttpAsyncHttpClientBuilder object
     */
    public Jdk11AsyncHttpClientBuilder connectionTimeout(Duration connectionTimeout) {
        // setConnectionTimeout can be null
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    /**
     * Sets the proxy.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.core.http.okhttp.OkHttpAsyncHttpClientBuilder.proxy#ProxyOptions}
     *
     * @param proxyOptions The proxy configuration to use.
     * @return the updated {@link Jdk11AsyncHttpClientBuilder} object
     */
    public Jdk11AsyncHttpClientBuilder proxy(ProxyOptions proxyOptions) {
        // proxyOptions can be null
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the HTTP client.
     * <p>
     * The default configuration store is a clone of the {@link Configuration#getGlobalConfiguration() global
     * configuration store}, use {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to
     * @return The updated OkHttpAsyncHttpClientBuilder object.
     */
    public Jdk11AsyncHttpClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Build a HttpClient with current configurations.
     *
     * @return a {@link HttpClient}.
     */
    public HttpClient build() {
        java.net.http.HttpClient.Builder httpClientBuilder = java.net.http.HttpClient.newBuilder();
        httpClientBuilder = (this.connectionTimeout != null)
            ? httpClientBuilder.connectTimeout(this.connectionTimeout)
            : httpClientBuilder.connectTimeout(DEFAULT_CONNECT_TIMEOUT);

        Configuration buildConfiguration = (configuration == null)
            ? Configuration.getGlobalConfiguration()
            : configuration;

        ProxyOptions buildProxyOptions = (proxyOptions == null && buildConfiguration != Configuration.NONE)
            ? ProxyOptions.fromConfiguration(buildConfiguration)
            : proxyOptions;

        if (buildProxyOptions != null) {
            httpClientBuilder = httpClientBuilder.proxy(new Jdk11HttpClientProxySelector(
                mapProxyType(buildProxyOptions.getType(), logger), buildProxyOptions.getAddress(),
                buildProxyOptions.getNonProxyHosts()));

            if (buildProxyOptions.getUsername() != null) {
                httpClientBuilder.authenticator(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(proxyOptions.getUsername(), proxyOptions.getPassword().toCharArray());
                    }
                });
            }
        }
        return new Jdk11AsyncHttpClient(httpClientBuilder.build());
    }

    private static Proxy.Type mapProxyType(ProxyOptions.Type type, ClientLogger logger) {
        Objects.requireNonNull(type, "'ProxyOptions.getType()' cannot be null.");

        switch (type) {
            case HTTP:
                return Proxy.Type.HTTP;
            case SOCKS4:
            case SOCKS5:
                return Proxy.Type.SOCKS;
            default:
                throw logger.logExceptionAsError(new IllegalStateException(
                    String.format("Unknown proxy type '%s' in use. Use a proxy type from 'ProxyOptions.Type'.", type)));
        }
    }
}
