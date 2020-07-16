// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.config;

import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.data.cosmos.core.ResponseDiagnosticsProcessor;

import java.beans.ConstructorProperties;

/**
 * Config properties of CosmosDB
 */
public class CosmosDBConfig {

    private final CosmosClientBuilder cosmosClientBuilder;

    private final String database;

    private final boolean allowTelemetry;

    private final ResponseDiagnosticsProcessor responseDiagnosticsProcessor;

    private final boolean queryMetricsEnabled;

    /**
     * Initialization
     * @param cosmosClientBuilder must not be {@literal null}
     * @param database must not be {@literal null}
     * @param allowTelemetry must not be {@literal null}
     * @param responseDiagnosticsProcessor must not be {@literal null}
     * @param queryMetricsEnabled must not be {@literal null}
     */
    @ConstructorProperties({"cosmosClientBuilder", "database", "allowTelemetry",
        "responseDiagnosticsProcessor", "queryMetricsEnabled"})
    public CosmosDBConfig(CosmosClientBuilder cosmosClientBuilder, String database, boolean allowTelemetry,
                          ResponseDiagnosticsProcessor responseDiagnosticsProcessor, boolean queryMetricsEnabled) {
        this.cosmosClientBuilder = cosmosClientBuilder;
        this.database = database;
        this.allowTelemetry = allowTelemetry;
        this.responseDiagnosticsProcessor = responseDiagnosticsProcessor;
        this.queryMetricsEnabled = queryMetricsEnabled;
    }

    /**
     * Gets the cosmos client builder used to build cosmos client
     * @return cosmosClientBuilder
     */
    public CosmosClientBuilder getCosmosClientBuilder() {
        return cosmosClientBuilder;
    }

    /**
     * Checks if telemetry is allowed
     * @return boolean
     */
    public boolean isAllowTelemetry() {
        return allowTelemetry;
    }

    /**
     * Gets response diagnostics processor
     * @return ResponseDiagnosticsProcessor
     */
    public ResponseDiagnosticsProcessor getResponseDiagnosticsProcessor() {
        return responseDiagnosticsProcessor;
    }

    /**
     * Gets the option to enable query metrics
     * @return boolean, whether to enable query metrics
     */
    public boolean isQueryMetricsEnabled() {
        return queryMetricsEnabled;
    }

    /**
     * Gets the database name
     * @return database name
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Create a CosmosDBConfigBuilder instance
     * @return CosmosDBConfigBuilder
     */
    public static CosmosDBConfigBuilder builder() {
        return new CosmosDBConfigBuilder();
    }

    /**
     * Builder class for cosmos db config
     */
    public static class CosmosDBConfigBuilder {
        private String database;
        private CosmosClientBuilder cosmosClientBuilder;
        private boolean allowTelemetry;
        private ResponseDiagnosticsProcessor responseDiagnosticsProcessor;
        private boolean queryMetricsEnabled;

        CosmosDBConfigBuilder() {
        }

        /**
         * Set cosmosClientBuilder to use to build cosmos client
         * @param cosmosClientBuilder cosmos client builder
         * @return CosmosDBConfigBuilder
         */
        public CosmosDBConfigBuilder cosmosClientBuilder(CosmosClientBuilder cosmosClientBuilder) {
            this.cosmosClientBuilder = cosmosClientBuilder;
            return this;
        }

        /**
         * Set allowTelemetry
         *
         * @param allowTelemetry value to initialize
         * @return CosmosDBConfigBuilder
         */
        public CosmosDBConfigBuilder allowTelemetry(boolean allowTelemetry) {
            this.allowTelemetry = allowTelemetry;
            return this;
        }

        /**
         * Set responseDiagnosticsProcessor
         *
         * @param responseDiagnosticsProcessor value to initialize
         * @return CosmosDBConfigBuilder
         */
        public CosmosDBConfigBuilder responseDiagnosticsProcessor(ResponseDiagnosticsProcessor
                                                                      responseDiagnosticsProcessor) {
            this.responseDiagnosticsProcessor = responseDiagnosticsProcessor;
            return this;
        }

        /**
         * Set queryMetricsEnabled
         *
         * @param queryMetricsEnabled value to initialize
         * @return CosmosDBConfigBuilder
         */
        public CosmosDBConfigBuilder enableQueryMetrics(boolean queryMetricsEnabled) {
            this.queryMetricsEnabled = queryMetricsEnabled;
            return this;
        }

        /**
         * Sets the database
         *
         * @param database database name
         * @return CosmosDBConfigBuilder
         */
        public CosmosDBConfigBuilder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * Build a CosmosDBConfig instance
         *
         * @return CosmosDBConfig
         */
        public CosmosDBConfig build() {
            return new CosmosDBConfig(this.cosmosClientBuilder, this.database, this.allowTelemetry,
                this.responseDiagnosticsProcessor, this.queryMetricsEnabled);
        }

        @Override
        public String toString() {
            return "CosmosDBConfigBuilder{" +
                "database='" + database + '\'' +
                ", cosmosClientBuilder=" + cosmosClientBuilder +
                ", allowTelemetry=" + allowTelemetry +
                ", responseDiagnosticsProcessor=" + responseDiagnosticsProcessor +
                ", queryMetricsEnabled=" + queryMetricsEnabled +
                '}';
        }
    }
}
