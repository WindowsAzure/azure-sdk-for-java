// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.query;

import com.azure.cosmos.implementation.caches.IPartitionKeyRangeCache;
import com.azure.cosmos.implementation.caches.RxCollectionCache;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.implementation.IRetryPolicyFactory;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.RxDocumentServiceResponse;
import reactor.core.publisher.Mono;

/**
 * While this class is public, but it is not part of our published public APIs.
 * This is meant to be internally used only by our sdk.
 */
public interface IDocumentQueryClient {

    /**
     * TODO: this should be async returning observable
     * @return
     */
    RxCollectionCache getCollectionCache();

    /**
     * TODO: this should be async returning observable
     * @return
     */
    IPartitionKeyRangeCache getPartitionKeyRangeCache();

    /**
     * @return
     */
    IRetryPolicyFactory getResetSessionTokenRetryPolicy();

    /**
     * TODO: this should be async returning observable
     * @return
     */
    Mono<ConsistencyLevel> getDefaultConsistencyLevelAsync();

    /**
     * TODO: this should be async returning observable
     * @return
     */
    ConsistencyLevel getDesiredConsistencyLevelAsync();

    Mono<RxDocumentServiceResponse> executeQueryAsync(RxDocumentServiceRequest request);

    QueryCompatibilityMode getQueryCompatibilityMode();

    /// <summary>
    /// A client query compatibility mode when making query request.
    /// Can be used to force a specific query request format.
    /// </summary>
    enum QueryCompatibilityMode {
        /// <summary>
        /// DEFAULT (latest) query format.
        /// </summary>
        Default,

        /// <summary>
        /// Query (application/query+json).
        /// DEFAULT.
        /// </summary>
        Query,

        /// <summary>
        /// SqlQuery (application/sql).
        /// </summary>
        SqlQuery
    }

    Mono<RxDocumentServiceResponse> readFeedAsync(RxDocumentServiceRequest request);
}
