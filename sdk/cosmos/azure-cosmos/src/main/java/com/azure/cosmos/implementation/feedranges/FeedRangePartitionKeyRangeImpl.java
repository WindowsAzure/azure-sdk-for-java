// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.feedranges;

import com.azure.cosmos.implementation.Constants;
import com.azure.cosmos.implementation.IRoutingMapProvider;
import com.azure.cosmos.implementation.PartitionKeyRange;
import com.azure.cosmos.implementation.PartitionKeyRangeGoneException;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.Utils.ValueHolder;
import com.azure.cosmos.implementation.apachecommons.collections.list.UnmodifiableList;
import com.azure.cosmos.implementation.routing.PartitionKeyRangeIdentity;
import com.azure.cosmos.implementation.routing.Range;
import com.azure.cosmos.models.PartitionKeyDefinition;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.ArrayList;

import static com.azure.cosmos.BridgeInternal.setProperty;

public final class FeedRangePartitionKeyRangeImpl extends FeedRangeInternal {
    private final String partitionKeyRangeId;
    private final PartitionKeyRangeIdentity partitionKeyRangeIdentity;

    public FeedRangePartitionKeyRangeImpl(final String partitionKeyRangeId) {
        if (partitionKeyRangeId == null) {
            throw new NullPointerException("partitionKeyRangeId");
        }

        this.partitionKeyRangeId = partitionKeyRangeId;
        this.partitionKeyRangeIdentity = new PartitionKeyRangeIdentity(partitionKeyRangeId);
    }

    public String getPartitionKeyRangeId() {
        return this.partitionKeyRangeId;
    }

    public PartitionKeyRangeIdentity getPartitionKeyRangeIdentity() {
        return this.partitionKeyRangeIdentity;
    }

    @Override
    public void accept(final FeedRangeVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException("visitor");
        }

        visitor.visit(this);
    }

    @Override
    public <TInput> void accept(GenericFeedRangeVisitor<TInput> visitor, TInput input) {
        if (visitor == null) {
            throw new NullPointerException("visitor");
        }

        visitor.visit(this, input);
    }

    @Override
    public <T> Mono<T> acceptAsync(final FeedRangeAsyncVisitor<T> visitor) {
        if (visitor == null) {
            throw new NullPointerException("visitor");
        }

        return visitor.visitAsync(this);
    }

    @Override
    public Mono<UnmodifiableList<Range<String>>> getEffectiveRangesAsync(
        final IRoutingMapProvider routingMapProvider,
        final String containerRid,
        final PartitionKeyDefinition partitionKeyDefinition) {

        final Mono<ValueHolder<PartitionKeyRange>> getPkRangeTask = routingMapProvider
            .tryGetPartitionKeyRangeByIdAsync(
                null,
                containerRid,
                partitionKeyRangeId,
                false,
                null)
            .flatMap((pkRangeHolder) -> {
                if (pkRangeHolder.v == null) {
                    return routingMapProvider.tryGetPartitionKeyRangeByIdAsync(
                        null,
                        containerRid,
                        partitionKeyRangeId,
                        true,
                        null);
                } else {
                    return Mono.just(pkRangeHolder);
                }
            })
            .flatMap((pkRangeHolder) -> {
                if (pkRangeHolder.v == null) {
                    return Mono.error(
                        new PartitionKeyRangeGoneException(
                            String.format(
                                "The PartitionKeyRangeId: \"%s\" is not valid for the current " +
                                    "container %s .",
                                partitionKeyRangeId,
                                containerRid)
                        ));
                } else {
                    return Mono.just(pkRangeHolder);
                }
            });

        return getPkRangeTask.flatMap((pkRangeHolder) -> {
            final ArrayList<Range<String>> temp = new ArrayList<>();
            if (pkRangeHolder != null) {
                temp.add(pkRangeHolder.v.toRange());
            }

            return Mono.just((UnmodifiableList<Range<String>>)UnmodifiableList.unmodifiableList(temp));
        });
    }

    @Override
    public Mono<UnmodifiableList<String>> getPartitionKeyRangesAsync(
        final IRoutingMapProvider routingMapProvider,
        final String containerRid,
        final PartitionKeyDefinition partitionKeyDefinition) {

        final ArrayList<String> temp = new ArrayList<>();
        temp.add(this.partitionKeyRangeId);

        return Mono.just(
            (UnmodifiableList<String>)UnmodifiableList.unmodifiableList(temp));
    }

    public void populatePropertyBag() {
        super.populatePropertyBag();

        if (this.partitionKeyRangeId != null) {
            setProperty(
                this,
                Constants.Properties.FEED_RANGE_PARTITION_KEY_RANGE_ID,
                this.partitionKeyRangeId);
        }
    }

    @Override
    public String toString() {
        return this.partitionKeyRangeId;
    }
}