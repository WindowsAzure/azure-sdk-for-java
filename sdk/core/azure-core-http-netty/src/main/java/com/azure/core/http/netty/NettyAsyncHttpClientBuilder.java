// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty;

import com.azure.core.http.ProxyOptions;
import com.azure.core.util.logging.ClientLogger;
import io.netty.channel.nio.NioEventLoopGroup;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.ProxyProvider;

import java.util.function.Supplier;

/**
 *
 */
public class NettyAsyncHttpClientBuilder {
    private final ClientLogger logger = new ClientLogger(NettyAsyncHttpClientBuilder.class);

    private Supplier<ProxyOptions> proxyOptions;
    private boolean enableWiretap;
    private int port;
    private NioEventLoopGroup nioEventLoopGroup;

    /**
     *
     */
    public NettyAsyncHttpClientBuilder() {    }

    /**
     *
     * @return A new NettyAsyncHttpClient instance
     * @throws IllegalStateException If proxy type is unknown.
     */
    public NettyAsyncHttpClient build() {
        HttpClient nettyHttpClient = HttpClient.create()
            .port(port)
            .wiretap(enableWiretap)
            .tcpConfiguration(tcpConfig -> {
                if (nioEventLoopGroup != null) {
                    tcpConfig = tcpConfig.runOn(nioEventLoopGroup);
                }

                if (proxyOptions == null) {
                    return tcpConfig;
                }
                ProxyOptions options = proxyOptions.get();
                if (options == null) {
                    return tcpConfig;
                }
                ProxyProvider.Proxy nettyProxy;
                switch (options.type()) {
                    case HTTP: nettyProxy = ProxyProvider.Proxy.HTTP; break;
                    case SOCKS4: nettyProxy = ProxyProvider.Proxy.SOCKS4; break;
                    case SOCKS5: nettyProxy = ProxyProvider.Proxy.SOCKS5; break;
                    default:
                        throw logger.logExceptionAsWarning(new IllegalStateException("Unknown Proxy type '" + options.type() + "' in use. Not configuring Netty proxy."));
                }

                return tcpConfig.proxy(ts -> ts.type(nettyProxy).address(options.address()));
            });
        return new NettyAsyncHttpClient(nettyHttpClient);
    }

    /**
     * Apply the provided proxy configuration to the HttpClient.
     *
     * @param proxyOptions the proxy configuration supplier
     * @return a HttpClient with proxy applied
     */
    public NettyAsyncHttpClientBuilder proxy(Supplier<ProxyOptions> proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * Apply or remove a wire logger configuration.
     *
     * @param enableWiretap wiretap config
     * @return a HttpClient with wire logging enabled or disabled
     */
    public NettyAsyncHttpClientBuilder wiretap(boolean enableWiretap) {
        this.enableWiretap = enableWiretap;
        return this;
    }

    /**
     * Set the port that client should connect to.
     *
     * @param port the port
     * @return a HttpClient with port applied
     */
    public NettyAsyncHttpClientBuilder port(int port) {
        this.port = port;
        return this;
    }

    /**
     * Sets the NIO event loop group that will be used to handle IO.
     *
     * @param nioEventLoopGroup the thread factory
     * @return a HttpClient with the NIO event loop group applied
     */
    public NettyAsyncHttpClientBuilder nioEventLoopGroup(NioEventLoopGroup nioEventLoopGroup) {
        this.nioEventLoopGroup = nioEventLoopGroup;
        return this;
    }
}
