// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.spring.autoconfigure.cosmos;

import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.core.CosmosTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Auto Configure Cosmos properties and connection policy.
 */
@Configuration
@ConditionalOnClass({ CosmosClient.class, CosmosTemplate.class })
@ConditionalOnResource(resources = "classpath:cosmos.enable.config")
@EnableConfigurationProperties(CosmosProperties.class)
public class CosmosAutoConfiguration extends AbstractCosmosConfiguration {
    private final CosmosProperties properties;

    public CosmosAutoConfiguration(CosmosProperties properties) {
        this.properties = properties;
    }

    @Override
    protected String getDatabaseName() {
        return properties.getDatabase();
    }

    @Bean
    public CosmosClientBuilder cosmosClientBuilder() {
        return new CosmosClientBuilder()
            .consistencyLevel(properties.getConsistencyLevel())
            .key(properties.getKey())
            .endpoint(properties.getUri()).credential(properties.getCredential())
            .contentResponseOnWriteEnabled(true);
    }

    @Bean
    @Override
    public CosmosConfig cosmosConfig() {
        return CosmosConfig.builder()
                           .enableQueryMetrics(properties.isPopulateQueryMetrics())
                           .responseDiagnosticsProcessor(properties.getResponseDiagnosticsProcessor())
                           .build();
    }
}
