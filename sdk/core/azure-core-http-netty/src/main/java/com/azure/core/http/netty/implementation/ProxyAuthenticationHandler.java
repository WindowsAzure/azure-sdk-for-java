// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty.implementation;

import com.azure.core.http.AuthorizationChallengeHandler;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpUtil;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.proxy.ProxyConnectException;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.util.AttributeKey;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import static com.azure.core.http.AuthorizationChallengeHandler.PROXY_AUTHENTICATE;
import static com.azure.core.http.AuthorizationChallengeHandler.PROXY_AUTHENTICATION_INFO;
import static com.azure.core.http.AuthorizationChallengeHandler.PROXY_AUTHORIZATION;

/**
 * This class handles authorizing requests being sent through a proxy which require authentication.
 */
public final class ProxyAuthenticationHandler extends ProxyHandler {
    private static final AttributeKey<String> PROXY_AUTHORIZATION_KEY = AttributeKey.newInstance("ProxyAuthorization");

    private static final String CNONCE = "cnonce";
    private static final String NC = "nc";

    private static final String AUTH_BASIC = "basic";
    private static final String AUTH_DIGEST = "digest";

    /*
     * Proxies use 'CONNECT' as the HTTP method.
     */
    private static final String PROXY_METHOD = HttpMethod.CONNECT.name();

    /*
     * Proxies are always the root path.
     */
    private static final String PROXY_URI_PATH = "/";

    /*
     * Digest authentication to a proxy uses the 'CONNECT' method, these can't have a request body.
     */
    private static final Supplier<byte[]> PROXY_ENTITY_BODY = () -> new byte[0];

    private final ClientLogger logger = new ClientLogger(ProxyAuthenticationHandler.class);

    private final AuthorizationChallengeHandler challengeHandler;
    private final AtomicReference<ChallengeHolder> proxyChallengeHolderReference;
    private final HttpClientCodec codec;
    private final AtomicReference<String> authScheme;

    private HttpResponseStatus status;

    public ProxyAuthenticationHandler(InetSocketAddress proxyAddress, AuthorizationChallengeHandler challengeHandler,
        AtomicReference<ChallengeHolder> proxyChallengeHolderReference) {
        super(proxyAddress);

        this.challengeHandler = challengeHandler;
        this.proxyChallengeHolderReference = proxyChallengeHolderReference;

        this.codec = new HttpClientCodec();
        this.authScheme = new AtomicReference<>();
    }

    @Override
    public String protocol() {
        return "http";
    }

    @Override
    public String authScheme() {
        String scheme = authScheme.get();

        return (scheme == null) ? "none" : scheme;
    }

    @Override
    protected void addCodec(ChannelHandlerContext ctx) {
        ctx.pipeline().addBefore(ctx.name(), null, this.codec);
    }

    @Override
    protected void removeEncoder(ChannelHandlerContext ctx) {
        this.codec.removeOutboundHandler();
    }

    @Override
    protected void removeDecoder(ChannelHandlerContext ctx) {
        this.codec.removeInboundHandler();
    }

    @Override
    protected Object newInitialMessage(ChannelHandlerContext ctx) {
        // This needs to handle no authorization proxying.
        InetSocketAddress raddr = this.destinationAddress();
        String hostString = HttpUtil.formatHostnameForHttp(raddr);
        int port = raddr.getPort();
        String url = hostString + ":" + port;
        String hostHeader = (port != 80 && port != 443) ? url : hostString;
        FullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.CONNECT, url,
            Unpooled.EMPTY_BUFFER, false);

        request.headers().set(HttpHeaderNames.HOST, hostHeader);

        // Proxy is expected to have authentication requirements, attempt to authenticate.
        if (challengeHandler != null) {
            String authorizationHeader = createAuthorizationHeader();

            if (!CoreUtils.isNullOrEmpty(authorizationHeader)) {
                request.headers().set(PROXY_AUTHORIZATION, authorizationHeader);
                ctx.channel().attr(PROXY_AUTHORIZATION_KEY).set(authorizationHeader);
            }
        }

        return request;
    }

    /*
     * Attempts to create a Proxy-Authorization header based on the AuthorizationChallengeHandler and ChallengeHolder
     * configurations.
     */
    private String createAuthorizationHeader() {
        /*
         * Attempt to pipeline the request.
         *
         * Pipelining is only possible if another request has been authenticated using the
         * AuthenticationChallengeHandler, it attempts to leverage state from the previous authentication request.
         * This may fail and result in the server requesting authentication by returning a proxy authentication
         * challenge.
         */
        String authorizationHeader = challengeHandler.attemptToPipelineAuthorization(PROXY_METHOD, PROXY_URI_PATH,
            PROXY_ENTITY_BODY);

        if (!CoreUtils.isNullOrEmpty(authorizationHeader)) {
            return authorizationHeader;
        }

        ChallengeHolder proxyChallengeHolder = proxyChallengeHolderReference.get();

        /*
         * Check if a proxy authentication challenge has been passed to the channel. This occurs when a proxy
         * authentication challenge response is seen by the connection observer and passed back to a future channel
         * created from the same client.
         */
        if (proxyChallengeHolder != null) {
            // Attempt to apply digest challenges, these are preferred over basic authorization.
            List<Map<String, String>> digestChallenges = proxyChallengeHolder.getDigestChallenges();
            if (!CoreUtils.isNullOrEmpty(digestChallenges)) {
                authorizationHeader = challengeHandler.handleDigest(PROXY_METHOD, PROXY_URI_PATH, digestChallenges,
                    PROXY_ENTITY_BODY);
            }

            // If digest challenges exist or all failed attempt to use basic authorization.
            if (CoreUtils.isNullOrEmpty(authorizationHeader) && proxyChallengeHolder.hasBasicChallenge()) {
                authorizationHeader = challengeHandler.handleBasic();
            }
        }

        return authorizationHeader;
    }

    @Override
    protected boolean handleResponse(ChannelHandlerContext ctx, Object o) throws ProxyConnectException {
        if (o instanceof HttpResponse) {
            if (status != null) {
                throw logger.logExceptionAsWarning(new RuntimeException("Received too many responses for a request"));
            }

            HttpResponse response = (HttpResponse) o;
            status = response.status();

            if (response.status().code() == 407) {
                /*
                 * Attempt to CONNECT to the proxy resulted in a request for authentication, parse the
                 * Proxy-Authenticate headers returned for challenges and update the ChallengeHolder reference. This
                 * will allow subsequent requests to CONNECT to this proxy to use the challenges returned to create a
                 * Proxy-Authorization header.
                 */
                proxyChallengeHolderReference.set(extractChallengesFromHeaders(response.headers()));
            } else if (response.status().code() == 200) {
                /*
                 * Attempt to CONNECT to the proxy succeeded, retrieve the Proxy-Authorization header passed in the
                 * Channel's attributes to compare it against a potential Proxy-Authentication-Info response header.
                 * This header is used by the server to validate to the client that it received the correct request.
                 */
                validateProxyAuthenticationInfo(response.headers().get(PROXY_AUTHENTICATION_INFO),
                    ctx.channel().attr(PROXY_AUTHORIZATION_KEY).get());
            }
        }

        boolean responseComplete = o instanceof LastHttpContent;
        if (responseComplete && status.code() != 200) {
            throw new ProxyConnectException("Failed to connect to proxy.");
        }

        return responseComplete;
    }

    /*
     * Search the response HttpHeaders for Proxy-Authenticate headers.
     */
    private static ChallengeHolder extractChallengesFromHeaders(HttpHeaders headers) {
        boolean hasBasicChallenge = false;
        List<Map<String, String>> digestChallenges = new ArrayList<>();

        for (String proxyAuthenticationHeader : headers.getAll(PROXY_AUTHENTICATE)) {
            String[] typeValuePair = proxyAuthenticationHeader.split(" ", 2);

            String challengeType = typeValuePair[0].trim();
            if (challengeType.equalsIgnoreCase(AUTH_BASIC)) {
                /*
                 * Proxy-Authenticate is requesting Basic authorization, this only needs a flag as Basic authentication
                 * is always the same.
                 */
                hasBasicChallenge = true;
            } else if (challengeType.equalsIgnoreCase(AUTH_DIGEST)) {
                /*
                 * Proxy-Authenticate is requesting Digest authorization, this needs to be parsed for the challenge
                 * information as Digest authentication always changes.
                 */
                Map<String, String> digestChallenge = new HashMap<>();
                for (String challengePiece : typeValuePair[1].split(",")) {
                    String[] kvp = challengePiece.split("=", 2);

                    // Skip challenge information that has no value.
                    if (kvp.length != 2) {
                        continue;
                    }

                    digestChallenge.put(kvp[0].trim(), kvp[1].trim().replace("\"", ""));
                }

                digestChallenges.add(digestChallenge);
            }
        }

        return new ChallengeHolder(hasBasicChallenge, digestChallenges);
    }

    /*
     * Validate the Proxy-Authorization header used in authentication against the server's Proxy-Authentication-Info
     * header. This header is an optional return by the server so this validation is guaranteed to happen.
     */
    private void validateProxyAuthenticationInfo(String infoHeader, String authorizationHeader) {
        // Server didn't return a 'Proxy-Authentication-Info' header, nothing to consume.
        if (CoreUtils.isNullOrEmpty(infoHeader)) {
            return;
        }

        Map<String, String> authenticationInfoPieces = AuthorizationChallengeHandler
            .parseChallengeHeader(infoHeader);
        Map<String, String> authorizationPieces = AuthorizationChallengeHandler
            .parseChallengeHeader(authorizationHeader);

        /*
         * If the authentication info response contains a cnonce or nc value it MUST match the value sent in the
         * authorization header. This is the server performing validation to the client that it received the
         * information.
         */
        assert !authenticationInfoPieces.containsKey(CNONCE) ||
            authenticationInfoPieces.get(CNONCE).equals(authorizationPieces.get(CNONCE));
        assert !authenticationInfoPieces.containsKey(NC)
            || authenticationInfoPieces.get(NC).equals(authorizationPieces.get(NC));

        challengeHandler.consumeAuthenticationInfoHeader(authenticationInfoPieces);
    }
}
