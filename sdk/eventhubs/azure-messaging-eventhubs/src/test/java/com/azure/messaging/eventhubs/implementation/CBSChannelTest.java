// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.implementation;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.CBSNode;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.amqp.RetryOptions;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.exception.ErrorCondition;
import com.azure.core.amqp.implementation.*;
import com.azure.core.credential.TokenCredential;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.IntegrationTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.time.OffsetDateTime;

import static com.azure.core.amqp.implementation.CBSAuthorizationType.SHARED_ACCESS_SIGNATURE;

public class CBSChannelTest extends IntegrationTestBase {
    private static final String CONNECTION_ID = "CbsChannelTest-Connection";

    private TestReactorConnection connection;
    private CBSChannel cbsChannel;
    private ConnectionStringProperties connectionString;
    private AzureTokenManagerProvider azureTokenManagerProvider;
    @Mock
    private MessageSerializer messageSerializer;

    public CBSChannelTest() {
        super(new ClientLogger(CBSChannelTest.class));
    }

    @Override
    protected void beforeTest() {
        MockitoAnnotations.initMocks(this);

        connectionString = getConnectionStringProperties();
        azureTokenManagerProvider = new AzureTokenManagerProvider(SHARED_ACCESS_SIGNATURE,
            connectionString.getEndpoint().getHost(), ClientConstants.AZURE_ACTIVE_DIRECTORY_SCOPE);

        TokenCredential tokenCredential = new EventHubSharedKeyCredential(connectionString.getSharedAccessKeyName(),
                connectionString.getSharedAccessKey());

        final ConnectionOptions connectionOptions = new ConnectionOptions(connectionString.getEndpoint().getHost(),
            connectionString.getEntityPath(), tokenCredential, SHARED_ACCESS_SIGNATURE, AmqpTransportType.AMQP,
            RETRY_OPTIONS, ProxyOptions.SYSTEM_DEFAULTS, Schedulers.elastic());
        final RetryOptions retryOptions = new RetryOptions().setTryTimeout(Duration.ofMinutes(5));

        ReactorProvider reactorProvider = new ReactorProvider();
        ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(reactorProvider);
        connection = new TestReactorConnection(CONNECTION_ID, connectionOptions, reactorProvider, handlerProvider,
            azureTokenManagerProvider, messageSerializer);

        final Mono<RequestResponseChannel> requestResponseChannel = connection.getCBSChannel();

        cbsChannel = new CBSChannel(requestResponseChannel, tokenCredential, connectionOptions.getAuthorizationType(),
            retryOptions);
    }

    @Override
    protected void afterTest() {
        if (cbsChannel != null) {
            cbsChannel.close();
        }

        if (connection != null) {
            connection.close();
        }
    }

    @Test
    public void successfullyAuthorizes() {
        // Arrange
        final String tokenAudience = azureTokenManagerProvider.getResourceString(connectionString.getEntityPath());

        // Act & Assert
        StepVerifier.create(cbsChannel.authorize(tokenAudience, tokenAudience))
            .assertNext(expiration -> OffsetDateTime.now().isBefore(expiration))
            .verifyComplete();
    }

    @Test
    public void unsuccessfulAuthorize() {
        // Arrange
        final String tokenAudience = azureTokenManagerProvider.getResourceString(connectionString.getEntityPath());

        TokenCredential tokenProvider = new EventHubSharedKeyCredential(connectionString.getSharedAccessKeyName(),
            "Invalid shared access key.");

        final Mono<RequestResponseChannel> requestResponseChannel = connection.getCBSChannel();

        final CBSNode node = new CBSChannel(requestResponseChannel, tokenProvider, SHARED_ACCESS_SIGNATURE,
            new RetryOptions().setTryTimeout(Duration.ofMinutes(5)));

        // Act & Assert
        StepVerifier.create(node.authorize(tokenAudience, tokenAudience))
            .expectErrorSatisfies(error -> {
                Assertions.assertTrue(error instanceof AmqpException);

                AmqpException exception = (AmqpException) error;
                Assertions.assertEquals(ErrorCondition.UNAUTHORIZED_ACCESS, exception.getErrorCondition());
                Assertions.assertFalse(exception.isTransient());
                Assertions.assertFalse(CoreUtils.isNullOrEmpty(exception.getMessage()));
            })
            .verify();
    }

    private static final class TestReactorConnection extends ReactorConnection {
        private TestReactorConnection(String connectionId, ConnectionOptions connectionOptions,
                                      ReactorProvider reactorProvider, ReactorHandlerProvider handlerProvider,
                                      TokenManagerProvider tokenManagerProvider, MessageSerializer messageSerializer) {
            super(connectionId, connectionOptions, reactorProvider, handlerProvider, tokenManagerProvider,
                messageSerializer);
        }

        private Mono<RequestResponseChannel> getCBSChannel() {
            return createRequestResponseChannel("cbs-session", "cbs", "$cbs");
        }
    }
}
