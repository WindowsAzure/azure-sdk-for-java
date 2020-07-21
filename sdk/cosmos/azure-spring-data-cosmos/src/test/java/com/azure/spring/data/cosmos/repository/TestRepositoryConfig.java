// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.repository;

import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.data.cosmos.common.DynamicContainer;
import com.azure.spring.data.cosmos.common.ResponseDiagnosticsTestUtils;
import com.azure.spring.data.cosmos.common.TestConstants;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.config.CosmosClientConfig;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import com.azure.spring.data.cosmos.repository.config.EnableReactiveCosmosRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
@EnableCosmosRepositories
@EnableReactiveCosmosRepositories
public class TestRepositoryConfig extends AbstractCosmosConfiguration {
    @Value("${cosmos.uri:}")
    private String cosmosDbUri;

    @Value("${cosmos.key:}")
    private String cosmosDbKey;

    @Value("${cosmos.database:}")
    private String database;

    @Value("${cosmos.queryMetricsEnabled}")
    private boolean queryMetricsEnabled;

    @Bean
    public ResponseDiagnosticsTestUtils responseDiagnosticsTestUtils() {
        return new ResponseDiagnosticsTestUtils();
    }

    @Bean
    public CosmosClientConfig cosmosClientConfig() {
        return CosmosClientConfig.builder()
            .cosmosClientBuilder(new CosmosClientBuilder()
                .key(cosmosDbKey)
                .endpoint(cosmosDbUri)
                .contentResponseOnWriteEnabled(true))
            .database(getDatabaseName())
            .build();
    }

    @Bean
    @Override
    public CosmosConfig cosmosConfig() {
        return CosmosConfig.builder()
            .enableQueryMetrics(queryMetricsEnabled)
            .responseDiagnosticsProcessor(responseDiagnosticsTestUtils().getResponseDiagnosticsProcessor())
            .build();
    }

    @Bean
    public DynamicContainer dynamicContainer() {
        return new DynamicContainer(TestConstants.DYNAMIC_BEAN_COLLECTION_NAME);
    }

    @Override
    protected String getDatabaseName() {
        return StringUtils.hasText(this.database) ? this.database : TestConstants.DB_NAME;
    }
}
