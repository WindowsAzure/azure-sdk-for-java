// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.batch;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosItemOperation;
import com.azure.cosmos.CosmosItemOperationType;
import com.azure.cosmos.implementation.JsonSerializable;
import com.azure.cosmos.implementation.RequestOptions;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.models.PartitionKey;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

/**
 * Represents an operation on an item which will be executed as part of a batch request on a container. This will be
 * serialized and sent in the request.
 *
 * @param <TInternal> The type of item.
 */
public final class ItemBatchOperation<TInternal> implements CosmosItemOperation {

    private TInternal item;

    private final String id;
    private final PartitionKey partitionKey;
    private final CosmosItemOperationType operationType;
    private final RequestOptions requestOptions;

    public ItemBatchOperation(
        final CosmosItemOperationType operationType,
        final String id,
        final PartitionKey partitionKey,
        final RequestOptions requestOptions,
        final TInternal item) {

        checkNotNull(operationType, "expected non-null operationType");

        this.operationType = operationType;
        this.partitionKey = partitionKey;
        this.id = id;
        this.item = item;
        this.requestOptions = requestOptions;
    }

    /**
     * Writes a single operation to JsonSerializable.
     * TODO(rakkuma): Similarly for hybrid row, operation needs to be written in Hybrid row.
     * Issue: https://github.com/Azure/azure-sdk-for-java/issues/15856
     *
     * @return instance of JsonSerializable containing values for a operation.
     */
    JsonSerializable serializeOperation() {
        final JsonSerializable jsonSerializable = new JsonSerializable();

        jsonSerializable.set(
            BatchRequestResponseConstant.FIELD_OPERATION_TYPE,
            BridgeInternal.getOperationValueForCosmosItemOperationType(this.getOperationType()));

        if (StringUtils.isNotEmpty(this.getId())) {
            jsonSerializable.set(BatchRequestResponseConstant.FIELD_ID, this.getId());
        }

        if (this.getItemInternal() != null) {
            jsonSerializable.set(BatchRequestResponseConstant.FIELD_RESOURCE_BODY, this.getItemInternal());
        }

        if (this.getRequestOptions() != null) {
            RequestOptions requestOptions = this.getRequestOptions();

            if (StringUtils.isNotEmpty(requestOptions.getIfMatchETag())) {
                jsonSerializable.set(BatchRequestResponseConstant.FIELD_IF_MATCH, requestOptions.getIfMatchETag());
            }

            if (StringUtils.isNotEmpty(requestOptions.getIfNoneMatchETag())) {
                jsonSerializable.set(BatchRequestResponseConstant.FIELD_IF_NONE_MATCH, requestOptions.getIfNoneMatchETag());
            }
        }

        return jsonSerializable;
    }

    TInternal getItemInternal() {
        return this.item;
    }

    @SuppressWarnings("unchecked")
    public <T> T getItem() {
        return (T)this.item;
    }

    public String getId() {
        return this.id;
    }

    public PartitionKey getPartitionKeyValue() {
        return partitionKey;
    }

    public CosmosItemOperationType getOperationType() {
        return this.operationType;
    }

    public RequestOptions getRequestOptions() {
        return this.requestOptions;
    }
}
