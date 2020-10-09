// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos;

import com.azure.cosmos.implementation.JsonSerializable;
import com.azure.cosmos.models.ItemBatchOperation;
import com.azure.cosmos.util.Beta;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.time.Duration;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

/**
 * Represents a result for a specific operation that was part of a {@link TransactionalBatch} request.
 */
@Beta(Beta.SinceVersion.V4_7_0)
public final class TransactionalBatchOperationResult {

    private final String eTag;
    private final double requestCharge;
    private final ObjectNode resourceObject;
    private final int statusCode;
    private final Duration retryAfter;
    private final int subStatusCode;
    private final ItemBatchOperation<?> itemBatchOperation;

    /**
     * Initializes a new instance of the {@link TransactionalBatchOperationResult} class.
     */
    TransactionalBatchOperationResult(String eTag,
                                      double requestCharge,
                                      ObjectNode resourceObject,
                                      int statusCode,
                                      Duration retryAfter,
                                      int subStatusCode,
                                      ItemBatchOperation<?> itemBatchOperation) {
        checkNotNull(statusCode, "expected non-null statusCode");
        checkNotNull(itemBatchOperation, "expected non-null itemBatchOperation");

        this.eTag = eTag;
        this.requestCharge = requestCharge;
        this.resourceObject = resourceObject;
        this.statusCode = statusCode;
        this.retryAfter = retryAfter;
        this.subStatusCode = subStatusCode;
        this.itemBatchOperation = itemBatchOperation;
    }

    /**
     * Gets the entity tag associated with the current item.
     *
     * ETags are used for concurrency checking when updating resources.
     *
     * @return Entity tag associated with the current item.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Gets the request charge as request units (RU) consumed by the current operation.
     * <p>
     * For more information about the RU and factors that can impact the effective charges please visit
     * <a href="https://docs.microsoft.com/en-us/azure/cosmos-db/request-units">Request Units in Azure Cosmos DB</a>
     *
     * @return the request charge.
     */
    public double getRequestCharge() {
        return this.requestCharge;
    }

    /**
     * Gets the item associated with the current result.
     *
     * @param <T> the type parameter
     *
     * @param type class type for which deserialization is needed.
     *
     * @return item associated with the current result.
     */
    public <T> T getItem(final Class<T> type) {
        T item = null;

        if (this.getResourceObject() != null) {
            item = new JsonSerializable(this.getResourceObject()).toObject(type);
        }

        return item;
    }

    /**
     * Gets retry after.
     *
     * @return the retry after
     */
    public Duration getRetryAfterDuration() {
        return this.retryAfter;
    }

    /**
     * Gets sub status code associated with the current result.
     *
     * @return the sub status code
     */
    public int getSubStatusCode() {
        return this.subStatusCode;
    }

    /**
     * Gets a value indicating whether the current operation completed successfully.
     *
     * @return {@code true} if the current operation completed successfully; {@code false} otherwise.
     */
    public boolean isSuccessStatusCode() {
        return 200 <= this.statusCode && this.statusCode <= 299;
    }

    /**
     * Gets the HTTP status code associated with the current result.
     *
     * @return the status code.
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    ObjectNode getResourceObject() {
        return resourceObject;
    }

    /**
     * Gets the original ItemBatchOperation for this result.
     *
     * @return the ItemBatchOperation.
     */
    public ItemBatchOperation<?> getItemBatchOperation() {
        return itemBatchOperation;
    }
}
