// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty;

import com.azure.core.util.AuthorizationChallengeHandler;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.implementation.ChallengeHolder;
import com.azure.core.http.netty.implementation.ProxyAuthenticationHandler;
import com.azure.core.util.logging.ClientLogger;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Builder class responsible for creating instances of {@link NettyAsyncHttpClient}.
 *
 * <p><strong>Building a new HttpClient instance</strong></p>
 *
 * {@codesnippet com.azure.core.http.netty.instantiation-simple}
 *
 * @see NettyAsyncHttpClient
 * @see HttpClient
 */
public class NettyAsyncHttpClientBuilder {
    private static final String INVALID_PROXY_MESSAGE = "Unknown Proxy type '%s' in use. Not configuring Netty proxy.";

    private final ClientLogger logger = new ClientLogger(NettyAsyncHttpClientBuilder.class);

    private final HttpClient baseHttpClient;
    private ProxyOptions proxyOptions;
    private ConnectionProvider connectionProvider;
    private boolean enableWiretap;
    private int port = 80;
    private NioEventLoopGroup nioEventLoopGroup;

    /**
     * Creates a new builder instance, where a builder is capable of generating multiple instances of
     * {@link NettyAsyncHttpClient}.
     */
    public NettyAsyncHttpClientBuilder() {
        this.baseHttpClient = null;
    }

    /**
     * Creates a new builder instance, where a builder is capable of generating multiple instances of
     * {@link NettyAsyncHttpClient} based on the provided reactor netty HttpClient.
     *
     * {@codesnippet com.azure.core.http.netty.from-existing-http-client}
     *
     * @param nettyHttpClient base reactor netty HttpClient
     */
    public NettyAsyncHttpClientBuilder(HttpClient nettyHttpClient) {
        this.baseHttpClient = Objects.requireNonNull(nettyHttpClient, "'nettyHttpClient' cannot be null.");
    }

    /**
     * Creates a new Netty-backed {@link com.azure.core.http.HttpClient} instance on every call, using the
     * configuration set in the builder at the time of the build method call.
     *
     * @return A new Netty-backed {@link com.azure.core.http.HttpClient} instance.
     * @throws IllegalStateException If the builder is configured to use an unknown proxy type.
     */
    public com.azure.core.http.HttpClient build() {
        HttpClient nettyHttpClient;
        if (this.baseHttpClient != null) {
            nettyHttpClient = baseHttpClient;
        } else if (this.connectionProvider != null) {
            nettyHttpClient = HttpClient.create(this.connectionProvider);
        } else {
            nettyHttpClient = HttpClient.create();
        }

        nettyHttpClient = nettyHttpClient
            .port(port)
            .wiretap(enableWiretap);

        AuthorizationChallengeHandler challengeHandler = (proxyOptions == null)
            ? null
            : new AuthorizationChallengeHandler(proxyOptions.getUsername(), proxyOptions.getPassword());
        AtomicReference<ChallengeHolder> proxyChallengeHolder = new AtomicReference<>();

        return new NettyAsyncHttpClient(nettyHttpClient, nioEventLoopGroup,
            () -> getProxyHandler(challengeHandler, proxyChallengeHolder));
    }

    /**
     * Sets the connection provider.
     *
     * @param connectionProvider the connection provider
     * @return the updated {@link NettyAsyncHttpClientBuilder} object
     */
    public NettyAsyncHttpClientBuilder connectionProvider(ConnectionProvider connectionProvider) {
        // Enables overriding the default reactor-netty connection/channel pool.
        this.connectionProvider = connectionProvider;
        return this;
    }

    /**
     * Sets the {@link ProxyOptions proxy options} that the client will use.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.core.http.netty.NettyAsyncHttpClientBuilder#proxy}
     *
     * @param proxyOptions The proxy configuration to use.
     * @return the updated NettyAsyncHttpClientBuilder object
     */
    public NettyAsyncHttpClientBuilder proxy(ProxyOptions proxyOptions) {
        // proxyOptions can be null
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * Enables the Netty wiretap feature.
     *
     * @param enableWiretap Flag indicating wiretap status
     * @return the updated NettyAsyncHttpClientBuilder object
     */
    public NettyAsyncHttpClientBuilder wiretap(boolean enableWiretap) {
        this.enableWiretap = enableWiretap;
        return this;
    }

    /**
     * Sets the port which this client should connect, which by default will be set to port 80.
     *
     * @param port The port to connect to.
     * @return the updated NettyAsyncHttpClientBuilder object
     */
    public NettyAsyncHttpClientBuilder port(int port) {
        this.port = port;
        return this;
    }

    /**
     * Sets the NIO event loop group that will be used to run IO loops.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.core.http.netty.NettyAsyncHttpClientBuilder#nioEventLoopGroup}
     *
     * @param nioEventLoopGroup The {@link NioEventLoopGroup} that will run IO loops.
     * @return the updated NettyAsyncHttpClientBuilder object
     */
    public NettyAsyncHttpClientBuilder nioEventLoopGroup(NioEventLoopGroup nioEventLoopGroup) {
        this.nioEventLoopGroup = nioEventLoopGroup;
        return this;
    }

    /*
     * Creates a proxy handler based on the passed ProxyOptions.
     */
    private ProxyHandler getProxyHandler(AuthorizationChallengeHandler challengeHandler,
        AtomicReference<ChallengeHolder> proxyChallengeHolder) {
        if (proxyOptions == null) {
            return null;
        }

        switch (proxyOptions.getType()) {
            case HTTP:
                return new ProxyAuthenticationHandler(proxyOptions.getAddress(), challengeHandler,
                    proxyChallengeHolder);
            case SOCKS4:
                return new Socks4ProxyHandler(proxyOptions.getAddress(), proxyOptions.getUsername());
            case SOCKS5:
                return new Socks5ProxyHandler(proxyOptions.getAddress(), proxyOptions.getUsername(),
                    proxyOptions.getPassword());
            default:
                throw logger.logExceptionAsError(new IllegalStateException(
                    String.format(INVALID_PROXY_MESSAGE, proxyOptions.getType())));
        }
    }
}
