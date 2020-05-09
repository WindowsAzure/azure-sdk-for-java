// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos;

import com.azure.cosmos.implementation.AsyncDocumentClient;
import com.azure.cosmos.implementation.ConnectionPolicy;
import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.rx.TestSuiteBase;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class ConnectionConfigTest extends TestSuiteBase {

    private static final Duration REQUEST_TIME_OUT = Duration.ofSeconds(15);
    private static final Duration IDLE_CONNECTION_TIME_OUT = Duration.ofSeconds(30);
    private static final Duration CONNECTION_TIMEOUT = Duration.ofSeconds(100);
    private static final Duration IDLE_CHANNEL_TIMEOUT = Duration.ofSeconds(10);
    private static final Duration IDLE_ENDPOINT_TIMEOUT = Duration.ofSeconds(20);

    @Test(groups = { "emulator" })
    public void buildClient_withDefaultGatewayConnectionConfig() {
        GatewayConnectionConfig gatewayConnectionConfig = GatewayConnectionConfig.getDefaultConfig();
        CosmosClientBuilder cosmosClientBuilder = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .gatewayMode(gatewayConnectionConfig);
        CosmosClient cosmosClient = cosmosClientBuilder.buildClient();

        AsyncDocumentClient asyncDocumentClient =
            CosmosBridgeInternal.getAsyncDocumentClient(cosmosClient);
        ConnectionPolicy connectionPolicy = asyncDocumentClient.getConnectionPolicy();
        assertThat(connectionPolicy.getConnectionMode().equals(ConnectionMode.GATEWAY));
        validateGatewayConnectionConfig(connectionPolicy, cosmosClientBuilder, gatewayConnectionConfig);
        safeCloseSyncClient(cosmosClient);
    }

    @Test(groups = { "emulator" })
    public void buildClient_withCustomGatewayConnectionConfig() {
        GatewayConnectionConfig gatewayConnectionConfig = new GatewayConnectionConfig();
        gatewayConnectionConfig.setMaxConnectionPoolSize(100);
        final List<String> preferredRegions = new ArrayList<>();
        preferredRegions.add("West US");
        gatewayConnectionConfig.setIdleConnectionTimeout(IDLE_CONNECTION_TIME_OUT);
        gatewayConnectionConfig.setRequestTimeout(REQUEST_TIME_OUT);
        CosmosClientBuilder cosmosClientBuilder = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .preferredRegions(preferredRegions)
            .userAgentSuffix("custom-gateway-client")
            .multipleWriteRegionsEnabled(false)
            .endpointDiscoveryEnabled(false)
            .readRequestsFallbackEnabled(true)
            .gatewayMode(gatewayConnectionConfig);

        CosmosClient cosmosClient = cosmosClientBuilder.buildClient();

        AsyncDocumentClient asyncDocumentClient =
            CosmosBridgeInternal.getAsyncDocumentClient(cosmosClient);
        ConnectionPolicy connectionPolicy = asyncDocumentClient.getConnectionPolicy();
        assertThat(connectionPolicy.getConnectionMode().equals(ConnectionMode.GATEWAY));
        validateGatewayConnectionConfig(connectionPolicy, cosmosClientBuilder, gatewayConnectionConfig);
        safeCloseSyncClient(cosmosClient);
    }

    @Test(groups = { "emulator" })
    public void buildClient_withDefaultDirectConnectionConfig() {
        DirectConnectionConfig directConnectionConfig = DirectConnectionConfig.getDefaultConfig();
        CosmosClientBuilder cosmosClientBuilder = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .directMode(directConnectionConfig);

        CosmosClient cosmosClient = cosmosClientBuilder.buildClient();

        AsyncDocumentClient asyncDocumentClient =
            CosmosBridgeInternal.getAsyncDocumentClient(cosmosClient);
        ConnectionPolicy connectionPolicy = asyncDocumentClient.getConnectionPolicy();
        assertThat(connectionPolicy.getConnectionMode().equals(ConnectionMode.DIRECT));
        validateDirectConnectionConfig(connectionPolicy, cosmosClientBuilder, directConnectionConfig);
        safeCloseSyncClient(cosmosClient);
    }

    @Test(groups = { "emulator" })
    public void buildClient_withCustomDirectConnectionConfig() {
        DirectConnectionConfig directConnectionConfig = DirectConnectionConfig.getDefaultConfig();
        directConnectionConfig.setConnectionTimeout(CONNECTION_TIMEOUT);
        directConnectionConfig.setIdleChannelTimeout(IDLE_CHANNEL_TIMEOUT);
        directConnectionConfig.setIdleEndpointTimeout(IDLE_ENDPOINT_TIMEOUT);
        directConnectionConfig.setMaxChannelsPerEndpoint(100);
        directConnectionConfig.setMaxRequestsPerChannel(100);
        final List<String> preferredRegions = new ArrayList<>();
        preferredRegions.add("West US");
        CosmosClientBuilder cosmosClientBuilder = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .directMode(directConnectionConfig)
            .preferredRegions(preferredRegions)
            .userAgentSuffix("custom-direct-client")
            .multipleWriteRegionsEnabled(false)
            .endpointDiscoveryEnabled(false)
            .readRequestsFallbackEnabled(true);

        CosmosClient cosmosClient = cosmosClientBuilder.buildClient();
        AsyncDocumentClient asyncDocumentClient =
            CosmosBridgeInternal.getAsyncDocumentClient(cosmosClient);
        ConnectionPolicy connectionPolicy = asyncDocumentClient.getConnectionPolicy();
        assertThat(connectionPolicy.getConnectionMode().equals(ConnectionMode.DIRECT));
        validateDirectConnectionConfig(connectionPolicy, cosmosClientBuilder, directConnectionConfig);
        safeCloseSyncClient(cosmosClient);
    }

    @Test(groups = { "emulator" })
    public void buildClient_withDirectAndGatewayConnectionConfig() {
        DirectConnectionConfig directConnectionConfig = DirectConnectionConfig.getDefaultConfig();
        GatewayConnectionConfig gatewayConnectionConfig = GatewayConnectionConfig.getDefaultConfig();
        CosmosClient cosmosClient = null;
        try {
            cosmosClient = new CosmosClientBuilder()
                .endpoint(TestConfigurations.HOST)
                .key(TestConfigurations.MASTER_KEY)
                .directMode(directConnectionConfig)
                .gatewayMode(gatewayConnectionConfig)
                .buildClient();
            Assertions.failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (Exception e) {
            assertThat(e instanceof IllegalArgumentException);
        } finally {
            safeCloseSyncClient(cosmosClient);
        }
    }

    @Test(groups = { "emulator" })
    public void buildClient_withNoConnectionConfig() {
        CosmosClient cosmosClient = null;
        try {
            cosmosClient = new CosmosClientBuilder()
                .endpoint(TestConfigurations.HOST)
                .key(TestConfigurations.MASTER_KEY)
                .buildClient();
            Assertions.failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (Exception e) {
            assertThat(e instanceof IllegalArgumentException);
        } finally {
            safeCloseSyncClient(cosmosClient);
        }
    }

    private void validateGatewayConnectionConfig(ConnectionPolicy connectionPolicy, CosmosClientBuilder cosmosClientBuilder, GatewayConnectionConfig gatewayConnectionConfig) {
        validateCommonConnectionConfig(connectionPolicy, cosmosClientBuilder);
        assertThat(Objects.equals(connectionPolicy.getConnectionMode(), ConnectionMode.GATEWAY));
        assertThat(Objects.equals(connectionPolicy.getIdleChannelTimeout(), gatewayConnectionConfig.getIdleConnectionTimeout()));
        assertThat(Objects.equals(connectionPolicy.getMaxConnectionPoolSize(), gatewayConnectionConfig.getMaxConnectionPoolSize()));
        assertThat(Objects.equals(connectionPolicy.getRequestTimeout(), gatewayConnectionConfig.getRequestTimeout()));
        assertThat(Objects.equals(connectionPolicy.getProxy(), gatewayConnectionConfig.getProxy()));
    }

    private void validateDirectConnectionConfig(ConnectionPolicy connectionPolicy, CosmosClientBuilder cosmosClientBuilder, DirectConnectionConfig directConnectionConfig) {
        validateCommonConnectionConfig(connectionPolicy, cosmosClientBuilder);
        assertThat(Objects.equals(connectionPolicy.getConnectionMode(), ConnectionMode.DIRECT));
        assertThat(Objects.equals(connectionPolicy.getConnectionTimeout(), directConnectionConfig.getConnectionTimeout()));
        assertThat(Objects.equals(connectionPolicy.getIdleChannelTimeout(), directConnectionConfig.getIdleChannelTimeout()));
        assertThat(Objects.equals(connectionPolicy.getIdleConnectionTimeout(), directConnectionConfig.getIdleChannelTimeout()));
        assertThat(Objects.equals(connectionPolicy.getIdleEndpointTimeout(), directConnectionConfig.getIdleEndpointTimeout()));
        assertThat(Objects.equals(connectionPolicy.getMaxChannelsPerEndpoint(), directConnectionConfig.getMaxChannelsPerEndpoint()));
        assertThat(Objects.equals(connectionPolicy.getMaxRequestsPerChannel(), directConnectionConfig.getMaxRequestsPerChannel()));
    }

    private void validateCommonConnectionConfig(ConnectionPolicy connectionPolicy, CosmosClientBuilder cosmosClientBuilder) {
        assertThat(Objects.equals(connectionPolicy.isMultipleWriteRegionsEnabled(), cosmosClientBuilder.isMultipleWriteRegionsEnabled()));
        assertThat(Objects.equals(connectionPolicy.isEndpointDiscoveryEnabled(), cosmosClientBuilder.isEndpointDiscoveryEnabled()));
        assertThat(Objects.equals(connectionPolicy.isReadRequestsFallbackEnabled(), cosmosClientBuilder.isReadRequestsFallbackEnabled()));
        assertThat(Objects.equals(connectionPolicy.getPreferredRegions(), cosmosClientBuilder.getPreferredRegions()));
        assertThat(Objects.equals(connectionPolicy.getThrottlingRetryOptions(), cosmosClientBuilder.getThrottlingRetryOptions()));
        assertThat(Objects.equals(connectionPolicy.getUserAgentSuffix(), cosmosClientBuilder.getUserAgentSuffix()));
    }
}
