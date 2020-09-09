// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.fluentcore.arm.collection.implementation;

import com.azure.resourcemanager.resources.fluentcore.arm.ResourceUtils;
import com.azure.resourcemanager.resources.fluentcore.utils.ReactorMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.function.BiFunction;

/**
 * Utility class for batch deletion.
 */
public class BatchDeletionImpl {

    public static Flux<String> deleteByIdsAsync(Collection<String> ids,
                                                BiFunction<String, String, Mono<Void>> deleteByGroupAndNameAsync) {
        if (ids == null || ids.isEmpty()) {
            return Flux.empty();
        } else {
            return Flux.fromIterable(ids)
                .flatMapDelayError(id -> {
                    final String resourceGroupName = ResourceUtils.groupFromResourceId(id);
                    final String name = ResourceUtils.nameFromResourceId(id);
                    return ReactorMapper.map(deleteByGroupAndNameAsync.apply(resourceGroupName, name), id);
                }, 32, 32);
        }
    }
}
