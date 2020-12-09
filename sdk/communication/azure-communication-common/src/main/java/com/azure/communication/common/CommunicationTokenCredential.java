// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.common;

import java.util.concurrent.ExecutionException;

import com.azure.core.util.logging.ClientLogger;

import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

import com.azure.core.credential.AccessToken;

import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

import com.azure.communication.common.implementation.TokenParser;

/**
 * Provide user credential for Communication service user
 */
public final class CommunicationTokenCredential implements AutoCloseable {
    private static final int DEFAULT_EXPIRING_OFFSET_MINUTES = 10;

    private final ClientLogger logger = new ClientLogger(CommunicationTokenCredential.class);

    private AccessToken accessToken;
    private TokenNext tokenNext;
    private final TokenParser tokenParser = new TokenParser();
    private TokenRefresher refresher;
    private FetchingTask fetchingTask;
    private boolean isClosed = false;

    /**
     * Create with serialized JWT token
     * 
     * @param initialToken serialized JWT token
     */
    public CommunicationTokenCredential(String initialToken) {
        Objects.requireNonNull(initialToken, "'initialToken' cannot be null.");
        setToken(initialToken);
    }

    /**
     * Create with a tokenRefresher
     * 
     * @param tokenRefresher implementation to supply fresh token when reqested
     */
    public CommunicationTokenCredential(TokenRefresher tokenRefresher) {
        Objects.requireNonNull(tokenRefresher, "'tokenRefresher' cannot be null.");
        refresher = tokenRefresher;
    }

    /**
     * Create with serialized JWT token and a token supplier to auto-refresh the
     * token before it expires. Callback function tokenRefresher will be called
     * ahead of the token expiry by the number of minutes specified by
     * CallbackOffsetMinutes defaulted to two minutes. To modify this default, call
     * setCallbackOffsetMinutes after construction
     * 
     * @param tokenRefresher implementation to supply fresh token when reqested
     * @param initialToken serialized JWT token
     * @param refreshProactively when set to true, turn on proactive fetching to call
     *                           tokenRefresher before token expiry by minutes set
     *                           with setCallbackOffsetMinutes or default value of
     *                           two minutes
     */
    public CommunicationTokenCredential(TokenRefresher tokenRefresher, String initialToken,
            boolean refreshProactively) {
        this(tokenRefresher);
        Objects.requireNonNull(initialToken, "'initialToken' cannot be null.");
        setToken(initialToken);
        if (refreshProactively) {
            OffsetDateTime nextFetchTime = accessToken.getExpiresAt().minusMinutes(DEFAULT_EXPIRING_OFFSET_MINUTES);
            fetchingTask = new FetchingTask(this, nextFetchTime);
        }
    }

    private class TokenNext extends Mono<AccessToken> {
        private final Mono<String> clientTokenNext;
        private boolean hasRetrievedToken;

        TokenNext(Mono<String> tokenStringNext) {
            this.clientTokenNext = tokenStringNext;
        }

        @Override
        public AccessToken block() {
            String freshToken = clientTokenNext.block();
            setToken(freshToken);
            hasRetrievedToken = true;
            return accessToken;
        }

        @Override
        public AccessToken block(Duration timeout) {
            String freshToken = clientTokenNext.block(timeout);
            setToken(freshToken);
            hasRetrievedToken = true;
            return accessToken;
        }

        @Override
        public void subscribe(CoreSubscriber<? super AccessToken> actual) {
            super.subscribe();
        }

        public boolean hasRetrievedToken() {
            return hasRetrievedToken;
        }
    }

    /**
     * Get Azure core access token from credential
     * 
     * @return Asynchronous call to fetch actual token
     * @throws ExecutionException when supplier throws this exception
     * @throws InterruptedException when supplier throws this exception
     */
    public Mono<AccessToken> getToken() throws InterruptedException, ExecutionException {
        if (isClosed) {
            throw logger.logExceptionAsError(
                new RuntimeException("getToken called on closed CommunicationTokenCredential object"));
        }
        // no valid token to return and can refresh
        if ((accessToken == null || accessToken.isExpired()) && refresher != null) {
            // if tokenNext is null or has already retrieved token
            if (tokenNext == null || tokenNext.hasRetrievedToken()) {
                tokenNext = new TokenNext(fetchFreshToken());
            }
            return tokenNext;
        }

        return Mono.just(accessToken);
    }

    @Override
    public void close() throws IOException {
        isClosed = true;
        if (fetchingTask != null) {
            fetchingTask.stopTimer();
            fetchingTask = null;
        }
        refresher = null;
    }

    // For test verification usage only
    boolean hasProactiveFetcher() {
        return fetchingTask != null;
    }

    private void setToken(String freshToken) {
        accessToken = tokenParser.parseJWTToken(freshToken);

        if (fetchingTask != null) {
            OffsetDateTime nextFetchTime = accessToken.getExpiresAt().minusMinutes(DEFAULT_EXPIRING_OFFSET_MINUTES);
            fetchingTask.setNextFetchTime(nextFetchTime);
        }
    }

    private Mono<String> fetchFreshToken() {
        Mono<String> fetchNext = refresher.getFetchTokenNext();
        if (fetchNext == null) {
            throw logger.logExceptionAsError(
                    new RuntimeException("TokenRefresher returned null when getFetchTokenNext is called"));
        }
        tokenNext = new TokenNext(fetchNext);
        return fetchNext;
    }

    private static class FetchingTask {
        private final CommunicationTokenCredential host;
        private Timer expiringTimer;
        private OffsetDateTime nextFetchTime;

        FetchingTask(CommunicationTokenCredential tokenHost,
            OffsetDateTime nextFetchAt) {
            host = tokenHost;
            nextFetchTime = nextFetchAt;
            startTimer();
        }

        private synchronized void setNextFetchTime(OffsetDateTime newFetchTime) {
            nextFetchTime = newFetchTime;
            stopTimer();
            startTimer();
        }

        private synchronized void startTimer() {
            expiringTimer = new Timer();
            Date expiring = Date.from(nextFetchTime.toInstant());
            expiringTimer.schedule(new TokenExpiringTask(this), expiring);
        }
    
        private synchronized void stopTimer() {
            if (expiringTimer == null) {
                return;
            }

            expiringTimer.cancel();
            expiringTimer.purge();
            expiringTimer = null;
        }

        private Mono<String> fetchFreshToken() {
            return host.fetchFreshToken();
        }

        private void setToken(String freshTokenString) {
            host.setToken(freshTokenString);
        }

        private class TokenExpiringTask extends TimerTask {
            private final ClientLogger logger = new ClientLogger(TokenExpiringTask.class);
            private final FetchingTask tokenCache;
    
            TokenExpiringTask(FetchingTask host) {
                tokenCache = host;
            }
    
            @Override
            public void run() {
                try {
                    Mono<String> tokenStringNext = tokenCache.fetchFreshToken();
                    tokenCache.setToken(tokenStringNext.block());
                } catch (Exception exception) {
                    logger.logExceptionAsError(new RuntimeException(exception));
                }
                
            }
        }    
    }
}
