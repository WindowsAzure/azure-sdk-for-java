// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.ClaimsBasedSecurityNode;
import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.exception.AmqpResponseCode;
import com.azure.core.exception.AzureException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class ActiveClientTokenManagerTest {
    private static final String AUDIENCE = "an-audience-test";
    private static final String SCOPES = "scopes-test";
    private static final Duration TIMEOUT = Duration.ofSeconds(4);

    @Mock
    private ClaimsBasedSecurityNode cbsNode;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void teardown() {
        Mockito.framework().clearInlineMocks();
        cbsNode = null;
    }

    /**
     * Verify that we can get successes and errors from CBS node.
     */
    @Test
    void getAuthorizationResults() {
        // Arrange
        final Mono<ClaimsBasedSecurityNode> cbsNodeMono = Mono.fromCallable(() -> cbsNode);
        when(cbsNode.authorize(any(), any())).thenReturn(getNextExpiration(3));

        final ActiveClientTokenManager tokenManager = new ActiveClientTokenManager(cbsNodeMono, AUDIENCE, SCOPES);

        // Act & Assert
        StepVerifier.create(tokenManager.getAuthorizationResults())
            .then(() -> tokenManager.authorize().block(TIMEOUT))
            .expectNext(AmqpResponseCode.ACCEPTED)
            .expectNext(AmqpResponseCode.ACCEPTED)
            .then(() -> tokenManager.close())
            .expectComplete()
            .verify();
    }

    /**
     * Verify that we can get successes and errors from CBS node. This un-retriable error will not allow it to be
     * rescheduled.
     */
    @SuppressWarnings("unchecked")
    @Test
    void getAuthorizationResultsSuccessFailure() {
        // Arrange
        final Mono<ClaimsBasedSecurityNode> cbsNodeMono = Mono.fromCallable(() -> cbsNode);
        final IllegalArgumentException error = new IllegalArgumentException("Some error");

        when(cbsNode.authorize(any(), any())).thenReturn(getNextExpiration(2),
            getNextExpiration(2), Mono.error(error));

        // Act & Assert
        try (ActiveClientTokenManager tokenManager = new ActiveClientTokenManager(cbsNodeMono, AUDIENCE, SCOPES)) {
            StepVerifier.create(tokenManager.getAuthorizationResults())
                .then(() -> tokenManager.authorize().block(TIMEOUT))
                .expectNext(AmqpResponseCode.ACCEPTED)
                .expectNext(AmqpResponseCode.ACCEPTED)
                .expectError(IllegalArgumentException.class)
                .verifyThenAssertThat()
                .hasNotDroppedElements()
                .hasNotDroppedElements()
                .hasNotDroppedErrors();
        }
    }

    /**
     * Verify that we cannot authorize with CBS node when it has already been disposed of.
     */
    @Test
    void cannotAuthorizeDisposedInstance() {
        // Arrange
        final Mono<ClaimsBasedSecurityNode> cbsNodeMono = Mono.fromCallable(() -> cbsNode);
        when(cbsNode.authorize(any(), any())).thenReturn(getNextExpiration(2));

        final ActiveClientTokenManager tokenManager = new ActiveClientTokenManager(cbsNodeMono, AUDIENCE, SCOPES);
        tokenManager.authorize().then(Mono.fromRunnable(tokenManager::close)).block();

        // Act & Assert
        StepVerifier.create(tokenManager.authorize())
            .expectError(AzureException.class)
            .verify();
    }

    /**
     * Verify that the ActiveClientTokenManager reschedules the authorization task.
     */
    @SuppressWarnings("unchecked")
    @Test
    void getAuthorizationResultsRetriableError() {
        // Arrange
        final Mono<ClaimsBasedSecurityNode> cbsNodeMono = Mono.fromCallable(() -> cbsNode);
        final AmqpException error = new AmqpException(false, AmqpErrorCondition.ARGUMENT_ERROR,
            "Non-retryable argument error",
            new AmqpErrorContext("Test-context-namespace"));

        when(cbsNode.authorize(any(), any())).thenReturn(getNextExpiration(5), Mono.error(error),
            getNextExpiration(5));

        // Act & Assert
        try (ActiveClientTokenManager tokenManager = new ActiveClientTokenManager(cbsNodeMono, AUDIENCE, SCOPES)) {
            StepVerifier.create(tokenManager.getAuthorizationResults())
                .then(() -> tokenManager.authorize().block(TIMEOUT))
                .expectNext(AmqpResponseCode.ACCEPTED)
                .expectErrorSatisfies(exception -> {
                    Assertions.assertTrue(exception instanceof AmqpException);

                    AmqpException amqpException = (AmqpException) exception;
                    Assertions.assertFalse(amqpException.isTransient());
                    Assertions.assertEquals(error.getErrorCondition(), amqpException.getErrorCondition());
                })
                .verify(Duration.ofSeconds(30));
        }
    }


    /**
     * Verify that the ActiveClientTokenManager does not get more authorization tasks.
     */
    @SuppressWarnings("unchecked")
    @Test
    void getAuthorizationResultsNonRetriableError() {
        // Arrange
        final Mono<ClaimsBasedSecurityNode> cbsNodeMono = Mono.fromCallable(() -> cbsNode);
        final AmqpException error = new AmqpException(true, AmqpErrorCondition.TIMEOUT_ERROR, "Test CBS node error.",
            new AmqpErrorContext("Test-context-namespace"));

        when(cbsNode.authorize(any(), any())).thenReturn(getNextExpiration(5), Mono.error(error),
            getNextExpiration(5), getNextExpiration(10),
            getNextExpiration(45));

        // Act & Assert
        final ActiveClientTokenManager tokenManager = new ActiveClientTokenManager(cbsNodeMono, AUDIENCE, SCOPES);

        StepVerifier.create(tokenManager.getAuthorizationResults())
            .then(() -> tokenManager.authorize().block(TIMEOUT))
            .expectNext(AmqpResponseCode.ACCEPTED)
            .expectNext(AmqpResponseCode.ACCEPTED)
            .then(() -> {
                System.out.println("Closing");
                tokenManager.close();
            })
            .expectComplete()
            .verify(Duration.ofSeconds(30));
    }


    private Mono<OffsetDateTime> getNextExpiration(long secondsToWait) {
        return Mono.fromCallable(() -> OffsetDateTime.now(ZoneOffset.UTC).plusSeconds(secondsToWait));
    }
}
