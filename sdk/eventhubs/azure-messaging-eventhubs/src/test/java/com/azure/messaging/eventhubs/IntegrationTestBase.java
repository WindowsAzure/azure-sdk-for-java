// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.ProxyAuthenticationType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.amqp.implementation.ConnectionStringProperties;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.messaging.eventhubs.models.SendOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mockito;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static com.azure.core.amqp.ProxyOptions.PROXY_PASSWORD;
import static com.azure.core.amqp.ProxyOptions.PROXY_USERNAME;

/**
 * Test base for running integration tests.
 */
public abstract class IntegrationTestBase extends TestBase {
    protected static final Duration TIMEOUT = Duration.ofSeconds(45);
    protected static final AmqpRetryOptions RETRY_OPTIONS = new AmqpRetryOptions().setTryTimeout(TIMEOUT);
    protected final ClientLogger logger;

    private static final String PROXY_AUTHENTICATION_TYPE = "PROXY_AUTHENTICATION_TYPE";
    private static final String EVENT_HUB_CONNECTION_STRING_ENV_NAME = "AZURE_EVENTHUBS_CONNECTION_STRING";

    private static final String AZURE_EVENTHUBS_FULLY_QUALIFIED_DOMAIN_NAME = "AZURE_EVENTHUBS_FULLY_QUALIFIED_DOMAIN_NAME";
    private static final String AZURE_EVENTHUBS_EVENT_HUB_NAME = "AZURE_EVENTHUBS_EVENT_HUB_NAME";

    private ConnectionStringProperties properties;
    private String testName;
    private final Scheduler scheduler = Schedulers.newParallel("eh-integration");

    protected IntegrationTestBase(ClientLogger logger) {
        this.logger = logger;
    }

    @BeforeAll
    public static void beforeAll() {
        StepVerifier.setDefaultTimeout(TIMEOUT);
    }

    @AfterAll
    public static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    @BeforeEach
    public void setupTest(TestInfo testInfo) {
        System.out.printf("[%s]: Performing integration test set-up.%n", testInfo.getDisplayName());

        testName = testInfo.getDisplayName();
        skipIfNotRecordMode();

        properties = new ConnectionStringProperties(getConnectionString());
        beforeTest();
    }

    // These are overridden because we don't use the Interceptor Manager.
    @Override
    @AfterEach
    public void teardownTest(TestInfo testInfo) {
        System.out.printf("[%s]: Performing test clean-up.%n", testInfo.getDisplayName());
        afterTest();

        scheduler.dispose();

        // Tear down any inline mocks to avoid memory leaks.
        // https://github.com/mockito/mockito/wiki/What's-new-in-Mockito-2#mockito-2250
        Mockito.framework().clearInlineMocks();
    }

    /**
     * Gets the test mode for this API test. If AZURE_TEST_MODE equals {@link TestMode#RECORD} and Event Hubs connection
     * string is set, then we return {@link TestMode#RECORD}. Otherwise, {@link TestMode#PLAYBACK} is returned.
     */
    @Override
    public TestMode getTestMode() {
        if (super.getTestMode() == TestMode.PLAYBACK) {
            return TestMode.PLAYBACK;
        }

        return CoreUtils.isNullOrEmpty(getConnectionString()) ? TestMode.PLAYBACK : TestMode.RECORD;
    }

    protected String getConnectionString() {
        return System.getenv(EVENT_HUB_CONNECTION_STRING_ENV_NAME);
    }

    /**
     * Gets the configured ProxyConfiguration from environment variables.
     */
    protected ProxyOptions getProxyConfiguration() {
        final String address = System.getenv(Configuration.PROPERTY_HTTP_PROXY);

        if (address == null) {
            return null;
        }

        final String[] host = address.split(":");
        if (host.length < 2) {
            logger.warning("Environment variable '{}' cannot be parsed into a proxy. Value: {}",
                Configuration.PROPERTY_HTTP_PROXY, address);
            return null;
        }

        final String hostname = host[0];
        final int port = Integer.parseInt(host[1]);
        final Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(hostname, port));

        final String username = System.getenv(PROXY_USERNAME);

        if (username == null) {
            logger.info("Environment variable '{}' is not set. No authentication used.");
            return new ProxyOptions(ProxyAuthenticationType.NONE, proxy, null, null);
        }

        final String password = System.getenv(PROXY_PASSWORD);
        final String authentication = System.getenv(PROXY_AUTHENTICATION_TYPE);

        final ProxyAuthenticationType authenticationType = CoreUtils.isNullOrEmpty(authentication)
            ? ProxyAuthenticationType.NONE
            : ProxyAuthenticationType.valueOf(authentication);

        return new ProxyOptions(authenticationType, proxy, username, password);
    }

    protected String getFullyQualifiedDomainName() {
        return System.getenv(AZURE_EVENTHUBS_FULLY_QUALIFIED_DOMAIN_NAME);
    }

    protected String getEventHubName() {
        return System.getenv(AZURE_EVENTHUBS_EVENT_HUB_NAME);
    }

    /**
     * Creates a new instance of {@link EventHubClientBuilder} with the default integration test settings and uses a
     * connection string to authenticate.
     */
    protected EventHubClientBuilder createBuilder() {
        return createBuilder(false);
    }

    /**
     * Creates a new instance of {@link EventHubClientBuilder} with the default integration test settings and uses a
     * connection string to authenticate if {@code useCredentials} is false. Otherwise, uses a service principal through
     * {@link com.azure.identity.ClientSecretCredential}.
     */
    protected EventHubClientBuilder createBuilder(boolean useCredentials) {
        final EventHubClientBuilder builder = new EventHubClientBuilder()
            .proxyOptions(ProxyOptions.SYSTEM_DEFAULTS)
            .retry(RETRY_OPTIONS)
            .transportType(AmqpTransportType.AMQP)
            .scheduler(scheduler);

        if (useCredentials) {
            final String fqdn = getFullyQualifiedDomainName();
            final String eventHubName = getEventHubName();

            Assumptions.assumeTrue(fqdn != null && !fqdn.isEmpty(), AZURE_EVENTHUBS_FULLY_QUALIFIED_DOMAIN_NAME + " variable needs to be set when using credentials.");
            Assumptions.assumeTrue(eventHubName != null && !eventHubName.isEmpty(), AZURE_EVENTHUBS_EVENT_HUB_NAME + " variable needs to be set when using credentials.");

            final ClientSecretCredential clientSecretCredential = new ClientSecretCredentialBuilder()
                .clientId(System.getenv("AZURE_CLIENT_ID"))
                .clientSecret(System.getenv("AZURE_CLIENT_SECRET"))
                .tenantId(System.getenv("AZURE_TENANT_ID"))
                .build();

            return builder.credential(fqdn, eventHubName, clientSecretCredential);
        } else {
            return builder.connectionString(getConnectionString());
        }
    }

    protected ConnectionStringProperties getConnectionStringProperties() {
        return properties;
    }

    /**
     * Pushes a set of {@link EventData} to Event Hubs.
     */
    protected IntegrationTestEventData setupEventTestData(EventHubProducerAsyncClient producer, int numberOfEvents,
            SendOptions options) {
        final String messageId = UUID.randomUUID().toString();

        logger.info("Pushing events to partition. Message tracking value: {}", messageId);

        final List<EventData> events = TestUtils.getEvents(numberOfEvents, messageId);
        final Instant datePushed = Instant.now();

        try {
            producer.send(events, options).block(TIMEOUT);
        } finally {
            dispose(producer);
        }

        return new IntegrationTestEventData(options.getPartitionId(), messageId, datePushed, events);
    }

    /**
     * Pushes a set of {@link EventData} to Event Hubs.
     */
    protected IntegrationTestEventData setupEventTestData(EventHubProducerClient producer, int numberOfEvents,
            SendOptions options) {
        final String messageId = UUID.randomUUID().toString();

        logger.info("Pushing events to partition. Message tracking value: {}", messageId);

        final List<EventData> events = TestUtils.getEvents(numberOfEvents, messageId);
        final Instant datePushed = Instant.now();

        try {
            producer.send(events, options);
        } finally {
            dispose(producer);
        }

        return new IntegrationTestEventData(options.getPartitionId(), messageId, datePushed, events);
    }

    /**
     * Disposes of any {@link Closeable} resources.
     *
     * @param closeables The closeables to dispose of. If a closeable is {@code null}, it is skipped.
     */
    protected void dispose(Closeable... closeables) {
        if (closeables == null || closeables.length == 0) {
            return;
        }

        for (final Closeable closeable : closeables) {
            if (closeable == null) {
                continue;
            }

            try {
                closeable.close();
            } catch (IOException error) {
                logger.error(String.format("[%s]: %s didn't close properly.", testName,
                    closeable.getClass().getSimpleName()), error);
            }
        }
    }

    private void skipIfNotRecordMode() {
        Assumptions.assumeTrue(getTestMode() == TestMode.RECORD);
    }
}
