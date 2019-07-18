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

package com.azure.data.cosmos.internal.directconnectivity;


import com.azure.data.cosmos.internal.DocumentCollection;
import com.azure.data.cosmos.PartitionKeyRangeGoneException;
import com.azure.data.cosmos.PartitionKey;
import com.azure.data.cosmos.PartitionKeyDefinition;
import com.azure.data.cosmos.internal.PartitionKeyRange;
import com.azure.data.cosmos.internal.HttpConstants;
import com.azure.data.cosmos.internal.ICollectionRoutingMapCache;
import com.azure.data.cosmos.InvalidPartitionException;
import com.azure.data.cosmos.NotFoundException;
import com.azure.data.cosmos.internal.OperationType;
import com.azure.data.cosmos.internal.ResourceType;
import com.azure.data.cosmos.internal.RxDocumentServiceRequest;
import com.azure.data.cosmos.internal.caches.RxCollectionCache;
import com.azure.data.cosmos.internal.routing.CollectionRoutingMap;
import com.azure.data.cosmos.internal.routing.IServerIdentity;
import com.azure.data.cosmos.internal.routing.InMemoryCollectionRoutingMap;
import com.azure.data.cosmos.internal.routing.PartitionKeyInternalHelper;
import com.azure.data.cosmos.internal.routing.PartitionKeyRangeIdentity;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.fail;

/**
 * Tests that partition manager correctly resolves addresses for requests and does appropriate number of cache refreshes.
 */
public class AddressResolverTest {

    private static final Logger logger = LoggerFactory.getLogger(AddressResolverTest.class);
    private static final String DOCUMENT_TEST_URL = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/docs/IXYFAOHEBPMBAAAAAAAAAA==/";
    private AddressResolver addressResolver;
    private RxCollectionCache collectionCache;
    private ICollectionRoutingMapCache collectionRoutingMapCache;
    private IAddressCache fabricAddressCache;

    private int collectionCacheRefreshedCount;
    private Map<String, Integer> routingMapRefreshCount;
    private Map<ServiceIdentity, Integer> addressesRefreshCount;

    @BeforeClass(groups = "unit")
    public void setup() throws Exception {
        this.addressResolver = new AddressResolver();
        this.collectionCache = Mockito.mock(RxCollectionCache.class);
        this.collectionRoutingMapCache = Mockito.mock(ICollectionRoutingMapCache.class);
        this.fabricAddressCache = Mockito.mock(IAddressCache.class);
        this.addressResolver.initializeCaches(this.collectionCache, this.collectionRoutingMapCache, this.fabricAddressCache);

        this.collection1 = new DocumentCollection();
        this.collection1.id("coll");
        this.collection1.resourceId("rid1");
        PartitionKeyDefinition partitionKeyDef = new PartitionKeyDefinition();
        partitionKeyDef.paths(ImmutableList.of("/field1"));
        this.collection1.setPartitionKey(partitionKeyDef);

        this.collection2 = new DocumentCollection();
        this.collection2.id("coll");
        this.collection2.resourceId("rid2");
        new PartitionKeyDefinition();
        partitionKeyDef.paths(ImmutableList.of("/field1"));
        this.collection2.setPartitionKey(partitionKeyDef);

        Function<List<ImmutablePair<PartitionKeyRange, IServerIdentity>>, Void> addPartitionKeyRangeFunc = listArg -> {
            listArg.forEach(tuple -> ((ServiceIdentity) tuple.right).partitionKeyRangeIds.add(new PartitionKeyRangeIdentity(collection1.resourceId(), tuple.left.id())));
            return null;
        };

        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> rangesBeforeSplit1 =
            new ArrayList<>();
        ServiceIdentity serverServiceIdentity = new ServiceIdentity("federation1", new URI("fabric://serverservice1"), false);

        rangesBeforeSplit1.add(
            ImmutablePair.of(new PartitionKeyRange("0", PartitionKeyInternalHelper.MinimumInclusiveEffectivePartitionKey,
                PartitionKeyInternalHelper.MaximumExclusiveEffectivePartitionKey), serverServiceIdentity));

        addPartitionKeyRangeFunc.apply(rangesBeforeSplit1);


        this.routingMapCollection1BeforeSplit =
            InMemoryCollectionRoutingMap.tryCreateCompleteRoutingMap(
                rangesBeforeSplit1,
                collection1.resourceId());

        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> rangesAfterSplit1 =
            new ArrayList<>();
        ServiceIdentity serverServiceIdentity2 = new ServiceIdentity("federation1", new URI("fabric://serverservice2"), false);
        ServiceIdentity serverServiceIdentity3 = new ServiceIdentity("federation1", new URI("fabric://serverservice3"), false);

        rangesAfterSplit1.add(
            ImmutablePair.of(
                new PartitionKeyRange("1", PartitionKeyInternalHelper.MinimumInclusiveEffectivePartitionKey, "5E", ImmutableList.of("0")),
                serverServiceIdentity2));

        rangesAfterSplit1.add(
            ImmutablePair.of(
                new PartitionKeyRange("2", "5E", PartitionKeyInternalHelper.MaximumExclusiveEffectivePartitionKey, ImmutableList.of("0")),
                serverServiceIdentity3));

        addPartitionKeyRangeFunc.apply(rangesAfterSplit1);

        this.routingMapCollection1AfterSplit = InMemoryCollectionRoutingMap.tryCreateCompleteRoutingMap(rangesAfterSplit1, collection1.resourceId());

        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> rangesBeforeSplit2 =
            new ArrayList<>();
        ServiceIdentity serverServiceIdentity4 = new ServiceIdentity("federation1", new URI("fabric://serverservice4"), false);

        rangesBeforeSplit2.add(
            ImmutablePair.of(
                new PartitionKeyRange("0", PartitionKeyInternalHelper.MinimumInclusiveEffectivePartitionKey, PartitionKeyInternalHelper.MaximumExclusiveEffectivePartitionKey),
                serverServiceIdentity4));

        addPartitionKeyRangeFunc.apply(rangesBeforeSplit2);


        this.routingMapCollection2BeforeSplit = InMemoryCollectionRoutingMap.tryCreateCompleteRoutingMap(rangesBeforeSplit2, collection2.resourceId());

        List<ImmutablePair<PartitionKeyRange, IServerIdentity>> rangesAfterSplit2 =
            new ArrayList<>();

        ServiceIdentity serverServiceIdentity5 = new ServiceIdentity("federation1", new URI("fabric://serverservice5"), false);
        ServiceIdentity serverServiceIdentity6 = new ServiceIdentity("federation1", new URI("fabric://serverservice6"), false);
        rangesAfterSplit2.add(
            ImmutablePair.of(
                new PartitionKeyRange("1", PartitionKeyInternalHelper.MinimumInclusiveEffectivePartitionKey, "5E", ImmutableList.of("0")),
                serverServiceIdentity5));

        rangesAfterSplit2.add(
            ImmutablePair.of(
                new PartitionKeyRange("2", "5E", PartitionKeyInternalHelper.MaximumExclusiveEffectivePartitionKey, ImmutableList.of("0")),
                serverServiceIdentity6));


        addPartitionKeyRangeFunc.apply(rangesAfterSplit2);


        this.routingMapCollection2AfterSplit = InMemoryCollectionRoutingMap.tryCreateCompleteRoutingMap(rangesAfterSplit2, collection2.resourceId());
    }

    private void TestCacheRefreshWhileRouteByPartitionKey(
        DocumentCollection collectionBeforeRefresh,
        DocumentCollection collectionAfterRefresh,
        Map<String, CollectionRoutingMap> routingMapBeforeRefresh,
        Map<String, CollectionRoutingMap> routingMapAfterRefresh,
        Map<ServiceIdentity, AddressInformation[]> addressesBeforeRefresh,
        Map<ServiceIdentity, AddressInformation[]> addressesAfterRefresh,
        AddressInformation[] targetAddresses,
        ServiceIdentity targetServiceIdentity,
        PartitionKeyRange targetPartitionKeyRange,
        boolean forceNameCacheRefresh,
        boolean forceRoutingMapRefresh,
        boolean forceAddressRefresh,
        int collectionCacheRefreshed,
        int routingMapCacheRefreshed,
        int addressCacheRefreshed,
        boolean nameBased) throws Exception {

        if (targetServiceIdentity != null && targetPartitionKeyRange != null) {
            targetServiceIdentity.partitionKeyRangeIds.add(new PartitionKeyRangeIdentity(collectionAfterRefresh != null ? collectionAfterRefresh.resourceId() : collectionBeforeRefresh.resourceId(), targetPartitionKeyRange.id()));
        }

        this.initializeMocks(
            collectionBeforeRefresh,
            collectionAfterRefresh,
            routingMapBeforeRefresh,
            routingMapAfterRefresh,
            addressesBeforeRefresh,
            addressesAfterRefresh);

        RxDocumentServiceRequest request;
        if (nameBased) {
            request = RxDocumentServiceRequest.create(
                OperationType.Read,
                ResourceType.Document,
                "dbs/db/colls/coll/docs/doc1",
                new HashMap<>());
        } else {
            request = RxDocumentServiceRequest.create(
                OperationType.Read,
                ResourceType.Document,
                DOCUMENT_TEST_URL,
                new HashMap<>());
        }

        request.forceNameCacheRefresh = forceNameCacheRefresh;
        request.forcePartitionKeyRangeRefresh = forceRoutingMapRefresh;
        request.getHeaders().put(HttpConstants.HttpHeaders.PARTITION_KEY, new PartitionKey("foo").toString());
        AddressInformation[] resolvedAddresses;
        try {
            resolvedAddresses = this.addressResolver.resolveAsync(request, forceAddressRefresh).block();
        } catch (RuntimeException e) {
            throw (Exception) e.getCause();
        } finally {
            assertThat(collectionCacheRefreshed).isEqualTo(collectionCacheRefreshedCount).describedAs("collection cache refresh count mismath");

            assertThat(routingMapCacheRefreshed).isEqualTo(routingMapRefreshCount.values().stream().mapToInt(v -> v).sum()).describedAs("routing map cache refresh count mismath");
            assertThat(addressCacheRefreshed).isEqualTo(addressesRefreshCount.values().stream().mapToInt(v -> v).sum()).describedAs("address cache refresh count mismatch");
            assertThat(routingMapRefreshCount.entrySet().stream().filter(pair -> pair.getValue() > 1).count()).isEqualTo(0);
            assertThat(addressesRefreshCount.entrySet().stream().filter(pair -> pair.getValue() > 1).count()).isEqualTo(0);
        }

        assertThat(targetAddresses[0].getPhysicalUri()).isEqualTo(resolvedAddresses[0].getPhysicalUri());
        //       Assert.AreEqual(targetServiceIdentity, request.requestContext.TargetIdentity);
        assertThat(targetPartitionKeyRange.id()).isEqualTo(request.requestContext.resolvedPartitionKeyRange.id());
    }

    private void TestCacheRefreshWhileRouteByPartitionKeyRangeId(
        DocumentCollection collectionBeforeRefresh,
        DocumentCollection collectionAfterRefresh,
        Map<String, CollectionRoutingMap> routingMapBeforeRefresh,
        Map<String, CollectionRoutingMap> routingMapAfterRefresh,
        Map<ServiceIdentity, AddressInformation[]> addressesBeforeRefresh,
        Map<ServiceIdentity, AddressInformation[]> addressesAfterRefresh,
        PartitionKeyRangeIdentity rangeIdentity,
        AddressInformation[] targetAddresses,
        ServiceIdentity targetServiceIdentity,
        PartitionKeyRange targetPartitionKeyRange,
        boolean forceNameCacheRefresh,
        boolean forceRoutingMapRefresh,
        boolean forceAddressRefresh,
        int collectionCacheRefreshed,
        int routingMapCacheRefreshed,
        int addressCacheRefreshed,
        boolean nameBased) throws Exception {

        if (targetServiceIdentity != null && targetPartitionKeyRange != null) {
            targetServiceIdentity.partitionKeyRangeIds.add(new PartitionKeyRangeIdentity(collectionAfterRefresh != null ? collectionAfterRefresh.resourceId() : collectionBeforeRefresh.resourceId(), targetPartitionKeyRange.id()));
        }

        this.initializeMocks(
            collectionBeforeRefresh,
            collectionAfterRefresh,
            routingMapBeforeRefresh,
            routingMapAfterRefresh,
            addressesBeforeRefresh,
            addressesAfterRefresh);

        RxDocumentServiceRequest request;
        if (nameBased) {
            request = RxDocumentServiceRequest.createFromName(
                OperationType.Read,
                "dbs/db/colls/coll/docs/doc1",
                ResourceType.Document);
        } else {
            request = RxDocumentServiceRequest.create(
                OperationType.Read,
                ResourceType.Document,
                DOCUMENT_TEST_URL,
                new HashMap<>());
        }

        request.forceNameCacheRefresh = forceNameCacheRefresh;
        request.forcePartitionKeyRangeRefresh = forceRoutingMapRefresh;
        request.routeTo(rangeIdentity);
        AddressInformation[] resolvedAddresses;
        try {
            resolvedAddresses = this.addressResolver.resolveAsync(request, forceAddressRefresh).block();
        } catch (RuntimeException e) {
            throw (Exception) e.getCause();
        } finally {
            assertThat(collectionCacheRefreshed).isEqualTo(collectionCacheRefreshedCount).describedAs("collection cache refresh count mismath");

            assertThat(routingMapCacheRefreshed).isEqualTo(routingMapRefreshCount.values().stream().mapToInt(v -> v).sum()).describedAs("routing map cache refresh count mismath");
            assertThat(addressCacheRefreshed).isEqualTo(addressesRefreshCount.values().stream().mapToInt(v -> v).sum()).describedAs("address cache refresh count mismatch");


            assertThat(routingMapRefreshCount.entrySet().stream().filter(pair -> pair.getValue() > 1).count()).isEqualTo(0);
            assertThat(addressesRefreshCount.entrySet().stream().filter(pair -> pair.getValue() > 1).count()).isEqualTo(0);
        }

        assertThat(targetAddresses[0].getPhysicalUri()).isEqualTo(resolvedAddresses[0].getPhysicalUri());
        //       Assert.AreEqual(targetServiceIdentity, request.requestContext.TargetIdentity);
        assertThat(targetPartitionKeyRange.id()).isEqualTo(request.requestContext.resolvedPartitionKeyRange.id());
    }

    private void initializeMocks(
        DocumentCollection collectionBeforeRefresh,
        DocumentCollection collectionAfterRefresh,
        Map<String, CollectionRoutingMap> routingMapBeforeRefresh,
        Map<String, CollectionRoutingMap> routingMapAfterRefreshInitial,
        Map<ServiceIdentity, AddressInformation[]> addressesBeforeRefresh,
        Map<ServiceIdentity, AddressInformation[]> addressesAfterRefreshInitial) {
        final Map<String, CollectionRoutingMap> routingMapAfterRefresh = ObjectUtils.defaultIfNull(routingMapAfterRefreshInitial, routingMapBeforeRefresh);
        final Map<ServiceIdentity, AddressInformation[]> addressesAfterRefresh = ObjectUtils.defaultIfNull(addressesAfterRefreshInitial, addressesBeforeRefresh);

        // Collection cache
        MutableObject<DocumentCollection> currentCollection = new MutableObject(collectionBeforeRefresh);
        this.collectionCacheRefreshedCount = 0;

        Mockito.doAnswer(invocationOnMock -> {
            RxDocumentServiceRequest request = invocationOnMock.getArgumentAt(0, RxDocumentServiceRequest.class);
            if (request.forceNameCacheRefresh && collectionAfterRefresh != null) {
                currentCollection.setValue(collectionAfterRefresh);
                AddressResolverTest.this.collectionCacheRefreshedCount++;
                request.forceNameCacheRefresh = false;
                return Mono.just(currentCollection.getValue());
            }

            if (request.forceNameCacheRefresh && collectionAfterRefresh == null) {
                currentCollection.setValue(null);
                AddressResolverTest.this.collectionCacheRefreshedCount++;
                request.forceNameCacheRefresh = false;
                return Mono.error(new NotFoundException());
            }

            if (!request.forceNameCacheRefresh && currentCollection.getValue() == null) {
                return Mono.error(new NotFoundException());

            }

            if (!request.forceNameCacheRefresh && currentCollection.getValue() != null) {
                return Mono.just(currentCollection.getValue());
            }

            return Mono.empty();
        }).when(this.collectionCache).resolveCollectionAsync(Mockito.any(RxDocumentServiceRequest.class));

        // Routing map cache
        Map<String, CollectionRoutingMap> currentRoutingMap =
            new HashMap<>(routingMapBeforeRefresh);
        this.routingMapRefreshCount = new HashMap<>();

        Mockito.doAnswer(invocationOnMock -> {
            String collectionRid = invocationOnMock.getArgumentAt(0, String.class);
            CollectionRoutingMap previousValue = invocationOnMock.getArgumentAt(1, CollectionRoutingMap.class);

            return collectionRoutingMapCache.tryLookupAsync(collectionRid, previousValue, false, null);
        }).when(this.collectionRoutingMapCache).tryLookupAsync(Mockito.anyString(), Mockito.any(CollectionRoutingMap.class), Mockito.anyMap());

        // Refresh case
        Mockito.doAnswer(invocationOnMock -> {
            String collectionRid = invocationOnMock.getArgumentAt(0, String.class);
            CollectionRoutingMap previousValue = invocationOnMock.getArgumentAt(1, CollectionRoutingMap.class);

            if (previousValue == null) {
                return Mono.justOrEmpty(currentRoutingMap.get(collectionRid));
            }

            if (previousValue != null && currentRoutingMap.containsKey(previousValue.getCollectionUniqueId()) &&
                currentRoutingMap.get(previousValue.getCollectionUniqueId()) == previousValue) {


                if (previousValue != null && previousValue.getCollectionUniqueId() != collectionRid) {
                    throw new RuntimeException("InvalidOperation");
                }

                if (routingMapAfterRefresh.containsKey(collectionRid)) {
                    currentRoutingMap.put(collectionRid, routingMapAfterRefresh.get(collectionRid));
                } else {
                    currentRoutingMap.remove(collectionRid);
                }

                if (!routingMapRefreshCount.containsKey(collectionRid)) {
                    routingMapRefreshCount.put(collectionRid, 1);
                } else {
                    routingMapRefreshCount.put(collectionRid, routingMapRefreshCount.get(collectionRid) + 1);
                }


                return Mono.justOrEmpty(currentRoutingMap.get(collectionRid));
            }

            return Mono.error(new NotImplementedException("not mocked"));
        }).when(this.collectionRoutingMapCache).tryLookupAsync(Mockito.anyString(), Mockito.any(CollectionRoutingMap.class), Mockito.anyBoolean(), Mockito.anyMap());


        // Fabric Address Cache
        Map<ServiceIdentity, AddressInformation[]> currentAddresses =
            new HashMap<>(addressesBeforeRefresh);
        this.addressesRefreshCount = new HashMap<>();

        // No refresh case
        //
        Mockito.doAnswer(invocationOnMock -> {
            RxDocumentServiceRequest request = invocationOnMock.getArgumentAt(0, RxDocumentServiceRequest.class);
            PartitionKeyRangeIdentity pkri = invocationOnMock.getArgumentAt(1, PartitionKeyRangeIdentity.class);
            Boolean forceRefresh = invocationOnMock.getArgumentAt(2, Boolean.class);

            if (!forceRefresh) {
                return Mono.justOrEmpty(currentAddresses.get(findMatchingServiceIdentity(currentAddresses, pkri)));
            } else {

                ServiceIdentity si;

                if ((si = findMatchingServiceIdentity(addressesAfterRefresh, pkri)) != null) {
                    currentAddresses.put(si, addressesAfterRefresh.get(si));
                } else {

                    si = findMatchingServiceIdentity(currentAddresses, pkri);
                    currentAddresses.remove(si);
                }

                if (si == null) {
                    si = ServiceIdentity.dummyInstance;
                }

                if (!addressesRefreshCount.containsKey(si)) {
                    addressesRefreshCount.put(si, 1);
                } else {
                    addressesRefreshCount.put(si, addressesRefreshCount.get(si) + 1);
                }

                // TODO: what to return in this case if it is null!!
                return Mono.justOrEmpty(currentAddresses.get(si));
            }
        }).when(fabricAddressCache).tryGetAddresses(Mockito.any(RxDocumentServiceRequest.class), Mockito.any(PartitionKeyRangeIdentity.class), Mockito.anyBoolean());
    }

    private static <T> ServiceIdentity findMatchingServiceIdentity(Map<ServiceIdentity, T> map, PartitionKeyRangeIdentity pkri) {
        for (ServiceIdentity si : map.keySet()) {
            if (si.partitionKeyRangeIds.contains(pkri)) {
                return si;
            }

        }
        return null;
    }

    private final AddressInformation[] addresses1 = {new AddressInformation(true, true, "tcp://host/partition1", Protocol.HTTPS)};
    private final AddressInformation[] addresses2 = {new AddressInformation(true, true, "tcp://host/partition2", Protocol.HTTPS)};
    private final AddressInformation[] addresses3 = {new AddressInformation(true, true, "tcp://host/partition3", Protocol.HTTPS)};

    private DocumentCollection collection1;
    private DocumentCollection collection2;
    private CollectionRoutingMap routingMapCollection1BeforeSplit;
    private CollectionRoutingMap routingMapCollection1AfterSplit;
    private CollectionRoutingMap routingMapCollection2BeforeSplit;
    private CollectionRoutingMap routingMapCollection2AfterSplit;

    @Test(groups = "unit")
    public void testCacheRefreshesWhileRoutingByPartitionKey() throws Exception {
        logger.info("ALL caches are up to date. Name Based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            null,
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
            null,
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
            getRangeAt(this.routingMapCollection1BeforeSplit, 0),
            false,
            false,
            false,
            0,
            0,
            0,
            true);

        logger.info("ALL caches are up to date. Rid Based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            null,
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
            null,
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
            getRangeAt(this.routingMapCollection1BeforeSplit, 0),
            false,
            false,
            false,
            0,
            0,
            0,
            true);

        logger.info("Address cache is stale. Force Refresh. Name Based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            null,
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses2),
            this.addresses2,
            getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
            this.routingMapCollection1BeforeSplit.getOrderedPartitionKeyRanges().get(0),
            false,
            false,
            true,
            0,
            0,
            1,
            true);

        logger.info("Address cache is stale. Force Refresh. Rid Based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            null,
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses2),
            this.addresses2,
            getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
            getRangeAt(this.routingMapCollection1BeforeSplit, 0),
            false,
            false,
            true,
            0,
            0,
            1,
            false);

        logger.info("Routing map cache is stale. Force Refresh. Name based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1AfterSplit),
            ImmutableMap.of(
                getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses2,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 1), this.addresses3),
            null,
            this.addresses2,
            getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
            getRangeAt(this.routingMapCollection1AfterSplit, 0),
            false,
            true,
            false,
            0,
            1,
            0,
            true);

        logger.info("Routing map cache is stale. Force Refresh. Rid based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1AfterSplit),
            ImmutableMap.of(
                getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses2,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 1), this.addresses3),
            null,
            this.addresses2,
            getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
            getRangeAt(this.routingMapCollection1AfterSplit, 0),
            false,
            true,
            false,
            0,
            1,
            0,
            false);

        logger.info("Name cache is stale. Force Refresh. Name based");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection2,
            ImmutableMap.of(this.collection2.resourceId(), this.routingMapCollection2BeforeSplit),
            null,
            ImmutableMap.of(
                getServiceIdentityAt(this.routingMapCollection2BeforeSplit, 0), this.addresses1),
            null,
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection2BeforeSplit, 0),
            getRangeAt(this.routingMapCollection2BeforeSplit, 0),
            true,
            false,
            false,
            1,
            0,
            0,
            true);

        logger.info("Name cache is stale (collection deleted new one created same name). Routing Map Cache returns null");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection2,
            ImmutableMap.of(this.collection2.resourceId(), this.routingMapCollection2BeforeSplit),
            null,
            ImmutableMap.of(
                getServiceIdentityAt(this.routingMapCollection2BeforeSplit, 0), this.addresses1),
            null,
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection2BeforeSplit, 0),
            getRangeAt(this.routingMapCollection2BeforeSplit, 0),
            false,
            false,
            false,
            1,
            0,
            0,
            true);

        logger.info("Routing map cache is stale (split happened). Address Cache returns null");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1AfterSplit),
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
            null,
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
            getRangeAt(this.routingMapCollection1AfterSplit, 0),
            false,
            false,
            false,
            1,
            1,
            0,
            true);


        logger.info("Collection cache is stale (deleted created same name). Routing map cache is stale for new collection (split happened). Address Cache returns null");
        this.TestCacheRefreshWhileRouteByPartitionKey(
            this.collection1,
            this.collection2,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit,
                this.collection2.resourceId(), this.routingMapCollection2BeforeSplit),
            ImmutableMap.of(this.collection2.resourceId(), this.routingMapCollection2AfterSplit),
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection2AfterSplit, 0), this.addresses1),
            null,
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection2AfterSplit, 0),
            getRangeAt(this.routingMapCollection2AfterSplit, 0),
            false,
            false,
            false,
            1,
            1,
            0,
            true);

        logger.info("Collection cache is stale (collection deleted). Routing map cache is stale (collection deleted). Address Cache returns null");
        try {
            this.TestCacheRefreshWhileRouteByPartitionKey(
                this.collection1,
                null,
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
                ImmutableMap.of(),
                ImmutableMap.of(),
                null,
                null,
                null,
                null,
                false,
                false,
                false,
                1,
                0,
                0,
                true);

            fail("Expected NotFoundException");
        } catch (NotFoundException e) {
        }

        logger.info("Collection cache is stale (collection deleted). Routing map cache returns null.");
        try {
            this.TestCacheRefreshWhileRouteByPartitionKey(
                this.collection1,
                null,
                ImmutableMap.of(),
                null,
                ImmutableMap.of(),
                null,
                null,
                null,
                null,
                false,
                false,
                false,
                1,
                0,
                0,
                true);

            fail("Expected NotFoundException");
        } catch (NotFoundException e) {
        }
    }

    private static PartitionKeyRange getRangeAt(CollectionRoutingMap routingMap, int index) {
        return routingMap.getOrderedPartitionKeyRanges().get(index);
    }

    private static ServiceIdentity getServiceIdentityAt(CollectionRoutingMap routingMap, int index) {
        return (ServiceIdentity) routingMap.tryGetInfoByPartitionKeyRangeId(routingMap.getOrderedPartitionKeyRanges().get(index).id());
    }

    @Test(groups = "unit")
    public void testCacheRefreshesWhileRoutingByPartitionKeyRangeId() throws Exception {
        logger.info("ALL caches are up to date. Name Based");
        this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            null,
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
            null,
            new PartitionKeyRangeIdentity(this.collection1.resourceId(), "0"),
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
            getRangeAt(this.routingMapCollection1BeforeSplit, 0),
            false,
            false,
            false,
            0,
            0,
            0,
            true);

        logger.info("ALL caches are up to date. Name Based. Non existent range with collection rid");
        try {
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                this.collection1,
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
                null,
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity(this.collection1.resourceId(), "1"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
                getRangeAt(this.routingMapCollection1BeforeSplit, 0),
                false,
                false,
                false,
                0,
                1,
                0,
                true);

            fail("Should have gotten PartitionKeyRangeGoneException");
        } catch (PartitionKeyRangeGoneException e) {
        }

        logger.info("ALL caches are up to date. Name Based. Non existent range withOUT collection rid");
        try {
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                this.collection1,
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
                null,
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity("1"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
                getRangeAt(this.routingMapCollection1BeforeSplit, 0),
                false,
                false,
                false,
                1,
                1,
                0,
                true);

            fail("Should have gotten PartitionKeyRangeGoneException");
        } catch (PartitionKeyRangeGoneException e) {
        }

        logger.info("ALL caches are up to date. Name Based.RANGE doesn't exist in routing map because split happened.");
        try {
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                this.collection1,
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1AfterSplit),
                null,
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity(collection1.resourceId(), "0"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1BeforeSplit, 0),
                getRangeAt(this.routingMapCollection1BeforeSplit, 0),
                false,
                false,
                false,
                0,
                0,
                0,
                true);

            fail("Should have gotten PartitionKeyRangeGoneException");
        } catch (PartitionKeyRangeGoneException e) {
        }

        try {
            logger.info("Name Based.Routing map cache is outdated because split happened. Address cache returns null.");
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                this.collection1,
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1AfterSplit),
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity(collection1.resourceId(), "0"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
                getRangeAt(this.routingMapCollection1AfterSplit, 0),
                false,
                false,
                false,
                0,
                1,
                0,
                true);

            fail("Should have gotten PartitionKeyRangeGoneException");
        } catch (PartitionKeyRangeGoneException e) {
        }

        logger.info("Name Based.Routing map cache is outdated because split happened.");
        this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
            this.collection1,
            this.collection1,
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
            ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1AfterSplit),
            ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
            null,
            new PartitionKeyRangeIdentity(collection1.resourceId(), "1"),
            this.addresses1,
            getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
            getRangeAt(this.routingMapCollection1AfterSplit, 0),
            false,
            false,
            false,
            0,
            1,
            0,
            true);

        try {
            logger.info("Collection cache is outdated. Routing map cache returns null. Collection is deleted. RANGE with collection rid.");
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                null,
                ImmutableMap.of(),
                ImmutableMap.of(),
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity(collection1.resourceId(), "0"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
                getRangeAt(this.routingMapCollection1AfterSplit, 0),
                false,
                false,
                false,
                0,
                0,
                0,
                true);

            fail("Should have gotten InvalidPartitionException");
        } catch (InvalidPartitionException e) {
        }

        try {
            logger.info("Collection cache is outdated. Routing map cache returns null. Collection is deleted. RANGE without collection rid");
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                null,
                ImmutableMap.of(),
                ImmutableMap.of(),
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity("0"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
                getRangeAt(this.routingMapCollection1AfterSplit, 0),
                false,
                false,
                false,
                1,
                0,
                0,
                true);

            fail("Should have gotten NotFoundException");
        } catch (NotFoundException e) {
        }

        try {
            logger.info("Collection cache is outdated. Routing map cache returns null. Collection is deleted. RANGE with collection rid. Rid based.");
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                null,
                ImmutableMap.of(),
                ImmutableMap.of(),
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
                null,
                new PartitionKeyRangeIdentity(collection1.resourceId(), "0"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
                getRangeAt(this.routingMapCollection1AfterSplit, 0),
                false,
                false,
                false,
                0,
                0,
                0,
                false);

            fail("Should have gotten NotFoundException");
        } catch (NotFoundException e) {
        }

        try {
            logger.info("Collection cache is outdated. Routing map cache is outdated. Address cache is outdated. ForceAddressRefresh. RANGE with collection rid. Name based.");
            this.TestCacheRefreshWhileRouteByPartitionKeyRangeId(
                this.collection1,
                this.collection2,
                ImmutableMap.of(this.collection1.resourceId(), this.routingMapCollection1BeforeSplit),
                ImmutableMap.of(this.collection2.resourceId(), this.routingMapCollection2BeforeSplit),
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0), this.addresses1),
                ImmutableMap.of(getServiceIdentityAt(this.routingMapCollection2AfterSplit, 0), this.addresses2),
                new PartitionKeyRangeIdentity(collection1.resourceId(), "0"),
                this.addresses1,
                getServiceIdentityAt(this.routingMapCollection1AfterSplit, 0),
                getRangeAt(this.routingMapCollection1AfterSplit, 0),
                false,
                false,
                true,
                0,
                1,
                1,
                true);

            fail("Should have gotten InvalidPartitionException");
        } catch (InvalidPartitionException e) {
        }
    }

    static class ServiceIdentity implements IServerIdentity {
        final boolean IsMasterService;
        final URI ServiceName;
        final String FederationId;
        final Set<PartitionKeyRangeIdentity> partitionKeyRangeIds;
        final static ServiceIdentity dummyInstance = new ServiceIdentity(null, null, true);

        public ServiceIdentity(String federationId, URI serviceName, boolean isMasterService, PartitionKeyRangeIdentity... partitionKeyRangeIdentities) {
            this.FederationId = federationId;
            this.ServiceName = serviceName;
            this.IsMasterService = isMasterService;
            this.partitionKeyRangeIds = new HashSet<>(Arrays.stream(partitionKeyRangeIdentities).collect(Collectors.toList()));
        }
    }
}

