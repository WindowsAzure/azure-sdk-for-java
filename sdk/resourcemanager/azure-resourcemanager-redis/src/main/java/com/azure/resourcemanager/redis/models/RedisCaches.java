/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.resourcemanager.redis.models;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.azure.resourcemanager.redis.implementation.OperationInner;
import com.azure.resourcemanager.redis.implementation.RedisInner;
import com.azure.resourcemanager.redis.RedisManager;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import rx.Observable;

/**
 * Entry point for Redis Cache management API.
 */
@Fluent
public interface RedisCaches extends
        SupportsCreating<RedisCache.DefinitionStages.Blank>,
        SupportsListing<RedisCache>,
        SupportsListingByResourceGroup<RedisCache>,
        SupportsGettingByResourceGroup<RedisCache>,
        SupportsGettingById<RedisCache>,
        SupportsDeletingById,
        SupportsDeletingByResourceGroup,
        SupportsBatchCreation<RedisCache>,
        SupportsBatchDeletion,
        HasManager<RedisManager>,
        HasInner<RedisInner> {

    /**
     * Lists all of the available Redis REST API operations.
     *
     * @return list of available Redis REST operations.
     */
    PagedList<OperationInner> listOperations();

    /**
     * Lists all of the available Redis REST API operations.
     *
     * @return a representation of the future computation of this call
     */
    Observable<OperationInner> listOperationsAsync();
}
