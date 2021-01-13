package com.azure.cosmos.benchmark.linkedin.impl;

import com.azure.cosmos.benchmark.linkedin.impl.exceptions.CosmosDBDataAccessorException;
import com.azure.cosmos.benchmark.linkedin.impl.keyextractor.KeyExtractor;
import com.azure.cosmos.benchmark.linkedin.impl.metrics.MetricsFactory;
import com.azure.cosmos.benchmark.linkedin.impl.models.GetRequestOptions;
import com.azure.cosmos.benchmark.linkedin.impl.models.Result;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Preconditions;
import java.time.Clock;


/**
 * An accessor for CosmosDB (Using Azure Async SDK)
 *
 * @param <K> The key for the entity stored in the data store
 * @param <V> The entity stored in the data store
 */
public class CosmosDBDataAccessor<K, V> implements Accessor<K, V> {

  private final DataLocator _dataLocator;
  private final KeyExtractor<K> _keyExtractor;
  private final ResponseHandler<K, V> _responseHandler;
  private final GetExecutor<K, V> _getExecutor;
  private final Clock _clock;

  public CosmosDBDataAccessor(final DataLocator dataLocator,
      final KeyExtractor<K> keyExtractor,
      final ResponseHandler<K, V> responseHandler,
      final MetricsFactory metricsFactory,
      final Clock clock,
      final OperationsLogger logger) {
    _dataLocator = Preconditions.checkNotNull(dataLocator, "DataLocator for this entity can not be null");
    _keyExtractor = Preconditions.checkNotNull(keyExtractor, "The CosmosDBKeyExtractorV3 can not be null");
    _responseHandler = Preconditions.checkNotNull(responseHandler, "The CosmosDBResponseHandler can not be null");
    _clock = Preconditions.checkNotNull(clock, "clock cannot be null");
    _getExecutor = new GetExecutor<>(_dataLocator,
        _keyExtractor,
        _responseHandler,
        metricsFactory,
        _clock,
        logger);
  }

  @Override
  public Result<K, V> get(final K key, final GetRequestOptions requestOptions) throws CosmosDBDataAccessorException {
    Preconditions.checkNotNull(key, "The key to fetch the Entity is null!");
    Preconditions.checkNotNull(requestOptions, "The RequestOptions for fetching the Entity is null!");
    Preconditions.checkArgument(_keyExtractor.isKeyValid(key), "The key parameter %s is invalid!", key);

    return _getExecutor.get(key, requestOptions);
  }
}
