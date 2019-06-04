/*
 * The MIT License (MIT)
 * Copyright (c) 2018 Microsoft Corporation
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.microsoft.azure.cosmosdb.internal.routing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;

import com.microsoft.azure.cosmosdb.PartitionKeyRange;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Used internally to cache partition key ranges of a collection in the Azure Cosmos DB database service.
 */
public class InMemoryCollectionRoutingMap implements CollectionRoutingMap {
    private final Map<String, ImmutablePair<PartitionKeyRange, IServerIdentity>> rangeById;
    private final List<PartitionKeyRange> orderedPartitionKeyRanges;
    private final List<Range<String>> orderedRanges;

    private final Set<String> goneRanges;

    private String collectionUniqueId;

    private InMemoryCollectionRoutingMap(Map<String, ImmutablePair<PartitionKeyRange, IServerIdentity>> rangeById,
                                         List<PartitionKeyRange> orderedPartitionKeyRanges,
                                         String collectionUniqueId) {
        this.rangeById = rangeById;
        this.orderedPartitionKeyRanges = orderedPartitionKeyRanges;
        this.orderedRanges = orderedPartitionKeyRanges.stream().map(
            range ->
            new Range<>(
                range.getMinInclusive(),
                range.getMaxExclusive(),
                true,
                false)).collect(Collectors.toList());

        this.collectionUniqueId = collectionUniqueId;
        this.goneRanges = new HashSet<>(orderedPartitionKeyRanges.stream().flatMap(r -> CollectionUtils.emptyIfNull(r.getParents()).stream()).collect(Collectors.toSet()));

    }

    public static InMemoryCollectionRoutingMap tryCreateCompleteRoutingMap(
            Iterable<ImmutablePair<PartitionKeyRange, IServerIdentity>> ranges, String collectionUniqueId) {

        Map<String, ImmutablePair<PartitionKeyRange, IServerIdentity>> rangeById =
            new HashMap<>();

        for (ImmutablePair<PartitionKeyRange, IServerIdentity> range: ranges) {
            rangeById.put(range.left.getId(), range);
        }

        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> sortedRanges = new ArrayList<>(rangeById.values());
        Collections.sort(sortedRanges, new MinPartitionKeyPairComparator());
        List<PartitionKeyRange> orderedRanges = sortedRanges.stream().map(range -> range.left).collect(Collectors.toList());

        if (!isCompleteSetOfRanges(orderedRanges)) {
            return null;
        }

        return new InMemoryCollectionRoutingMap(rangeById, orderedRanges, collectionUniqueId);
    }

    private static boolean isCompleteSetOfRanges(List<PartitionKeyRange> orderedRanges) {
        boolean isComplete = false;
        if (orderedRanges.size() > 0) {
            PartitionKeyRange firstRange = orderedRanges.get(0);
            PartitionKeyRange lastRange = orderedRanges.get(orderedRanges.size() - 1);
            isComplete = firstRange.getMinInclusive()
                    .compareTo(PartitionKeyRange.MINIMUM_INCLUSIVE_EFFECTIVE_PARTITION_KEY) == 0;
            isComplete &= lastRange.getMaxExclusive()
                    .compareTo(PartitionKeyRange.MAXIMUM_EXCLUSIVE_EFFECTIVE_PARTITION_KEY) == 0;

            for (int i = 1; i < orderedRanges.size(); i++) {
                PartitionKeyRange previousRange = orderedRanges.get(i - 1);
                PartitionKeyRange currentRange = orderedRanges.get(i);
                isComplete &= previousRange.getMaxExclusive().compareTo(currentRange.getMinInclusive()) == 0;

                if (!isComplete) {
                    if (previousRange.getMaxExclusive().compareTo(currentRange.getMinInclusive()) > 0) {
                        throw new IllegalStateException("Ranges overlap");
                    }

                    break;
                }
            }
        }

        return isComplete;
    }

    public String getCollectionUniqueId() {
        return collectionUniqueId;
    }

    @Override
    public List<PartitionKeyRange> getOrderedPartitionKeyRanges() {
        return this.orderedPartitionKeyRanges;
    }

    @Override
    public PartitionKeyRange getRangeByEffectivePartitionKey(String effectivePartitionKeyValue) {
        if (PartitionKeyRange.MINIMUM_INCLUSIVE_EFFECTIVE_PARTITION_KEY.compareTo(effectivePartitionKeyValue) == 0) {
            return this.orderedPartitionKeyRanges.get(0);
        }

        if (PartitionKeyRange.MAXIMUM_EXCLUSIVE_EFFECTIVE_PARTITION_KEY.compareTo(effectivePartitionKeyValue) == 0) {
            return null;
        }

        int index = Collections.binarySearch(this.orderedRanges, Range.getPointRange(effectivePartitionKeyValue),
                new Range.MinComparator<String>());

        if (index < 0) {
            index = Math.max(0, -index - 2);
        }

        return this.orderedPartitionKeyRanges.get(index);
    }

    @Override
    public PartitionKeyRange getRangeByPartitionKeyRangeId(String partitionKeyRangeId) {
        ImmutablePair<PartitionKeyRange, IServerIdentity> pair = this.rangeById.get(partitionKeyRangeId);
        return pair == null ? null : pair.left;
    }


    @Override
    public Collection<PartitionKeyRange> getOverlappingRanges(Range<String> range) {
        return this.getOverlappingRanges(Collections.singletonList(range));
    }

    @Override
    public Collection<PartitionKeyRange> getOverlappingRanges(Collection<Range<String>> providedPartitionKeyRanges) {
        if (providedPartitionKeyRanges == null) {
            throw new IllegalArgumentException("providedPartitionKeyRanges");
        }

        Map<String, PartitionKeyRange> partitionRanges = new TreeMap<String, PartitionKeyRange>();

        for (Range<String> range : providedPartitionKeyRanges) {
            int minIndex = Collections.binarySearch(this.orderedRanges, range, new Range.MinComparator<String>());
            if (minIndex < 0) {
                minIndex = Math.max(minIndex, -minIndex - 2);
            }

            int maxIndex = Collections.binarySearch(this.orderedRanges, range, new Range.MaxComparator<String>());
            if (maxIndex < 0) {
                maxIndex = Math.min(this.orderedRanges.size() - 1, -maxIndex - 1);
            }

            for (int i = minIndex; i <= maxIndex; ++i) {
                if (Range.checkOverlapping(this.orderedRanges.get(i), range)) {
                    PartitionKeyRange partitionKeyRange = this.orderedPartitionKeyRanges.get(i);
                    partitionRanges.put(partitionKeyRange.getMinInclusive(), partitionKeyRange);
                }
            }
        }

        return partitionRanges.values();
    }


    @Override
    public PartitionKeyRange tryGetRangeByPartitionKeyRangeId(String partitionKeyRangeId)
    {
        Pair<PartitionKeyRange, IServerIdentity> addresses;
        addresses = this.rangeById.get(partitionKeyRangeId);
        if (addresses != null) {
            return addresses.getLeft();
        }

        return null;
    }

    @Override
    public IServerIdentity tryGetInfoByPartitionKeyRangeId(String partitionKeyRangeId)
    {
        Pair<PartitionKeyRange, IServerIdentity> addresses;
        addresses = this.rangeById.get(partitionKeyRangeId);
        if (addresses != null) {
            return addresses.getRight();
        }

        return null;
    }

    @Override
    public boolean IsGone(String partitionKeyRangeId) {
        return this.goneRanges.contains(partitionKeyRangeId);
    }

    private static class MinPartitionKeyPairComparator
            implements Comparator<ImmutablePair<PartitionKeyRange, IServerIdentity>> {
        public int compare(ImmutablePair<PartitionKeyRange, IServerIdentity> pair1,
                           ImmutablePair<PartitionKeyRange, IServerIdentity> pair2) {
            return pair1.left.getMinInclusive().compareTo(pair2.left.getMinInclusive());
        }
    }


    public CollectionRoutingMap tryCombine(
        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> ranges) {
        Set<String> newGoneRanges = new HashSet<>(ranges.stream().flatMap(tuple -> CollectionUtils.emptyIfNull(tuple.getLeft().getParents()).stream()).collect(Collectors.toSet()));
        newGoneRanges.addAll(this.goneRanges);

        Map<String, ImmutablePair<PartitionKeyRange, IServerIdentity>> newRangeById =
            this.rangeById.values().stream().filter(tuple -> !newGoneRanges.contains(tuple.left.getId())).collect(Collectors.
                toMap(tuple -> tuple.left.getId(), tuple -> tuple));

        for (ImmutablePair<PartitionKeyRange, IServerIdentity> tuple : ranges.stream().filter(tuple -> !newGoneRanges.contains(tuple.getLeft().getId())).collect(Collectors.toList())) {
            newRangeById.put(tuple.getLeft().getId(), tuple);
        }

        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> sortedRanges = newRangeById.values().stream().collect(Collectors.toList());

        Collections.sort(sortedRanges, new MinPartitionKeyPairComparator());

        List<PartitionKeyRange> newOrderedRanges = sortedRanges.stream().map(range -> range.left).collect(Collectors.toList());

        if (!isCompleteSetOfRanges(newOrderedRanges)) {
            return null;
        }

        return new InMemoryCollectionRoutingMap(newRangeById, newOrderedRanges, this.getCollectionUniqueId());
    }
}
