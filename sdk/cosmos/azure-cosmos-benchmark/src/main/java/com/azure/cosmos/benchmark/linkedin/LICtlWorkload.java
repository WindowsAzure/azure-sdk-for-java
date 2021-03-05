// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.benchmark.linkedin;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.benchmark.Configuration;
import com.azure.cosmos.benchmark.ScheduledReporterFactory;
import com.azure.cosmos.benchmark.linkedin.data.EntityConfiguration;
import com.azure.cosmos.benchmark.linkedin.data.InvitationsEntityConfiguration;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LICtlWorkload {
    private static final Logger LOGGER = LoggerFactory.getLogger(LICtlWorkload.class);

    private final Configuration _configuration;
    private final EntityConfiguration _entityConfiguration;
    private final CosmosAsyncClient _client;
    private final CosmosAsyncClient _bulkLoadClient;
    private final MetricRegistry _metricsRegistry;
    private final ScheduledReporter _reporter;
    private final ResourceManager _resourceManager;
    private final DataLoader _dataLoader;
    private final GetTestRunner _getTestRunner;

    public LICtlWorkload(final Configuration configuration) {
        Preconditions.checkNotNull(configuration, "The Workload configuration defining the parameters can not be null");

        _configuration = configuration;
        _entityConfiguration = new InvitationsEntityConfiguration(configuration);
        _client = AsyncClientFactory.buildAsyncClient(configuration);
        _bulkLoadClient = AsyncClientFactory.buildBulkLoadAsyncClient(configuration);
        _metricsRegistry =  new MetricRegistry();
        _reporter = ScheduledReporterFactory.create(_configuration, _metricsRegistry);
        _resourceManager = _configuration.shouldManageResources()
            ? new ResourceManagerImpl(_configuration, _entityConfiguration, _client)
            : new NoopResourceManagerImpl();
        _dataLoader = new DataLoader(_configuration, _entityConfiguration, _bulkLoadClient);
        _getTestRunner = new GetTestRunner(_configuration, _client, _metricsRegistry, _entityConfiguration);
    }

    public void setup() throws CosmosException {
        _resourceManager.createDatabase();

        _resourceManager.createContainer();

        LOGGER.info("Loading data");
        _dataLoader.loadData();

        LOGGER.info("Data loading completed");
        _bulkLoadClient.close();
    }

    public void run() {
        LOGGER.info("Executing the Get test");
        _reporter.start(_configuration.getPrintingInterval(), TimeUnit.SECONDS);

        _getTestRunner.run();

        _reporter.report();
    }

    /**
     * Close all existing resources, from CosmosDB collections to open connections
     */
    public void shutdown() {
        _getTestRunner.cleanup();
        _resourceManager.deleteResources();
        _client.close();
        _reporter.close();
    }
}
