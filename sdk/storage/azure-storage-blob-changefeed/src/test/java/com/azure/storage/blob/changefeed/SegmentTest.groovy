package com.azure.storage.blob.changefeed

import com.azure.storage.blob.BlobAsyncClient
import com.azure.storage.blob.BlobContainerAsyncClient
import com.azure.storage.blob.changefeed.implementation.models.BlobChangefeedEventWrapper
import com.azure.storage.blob.changefeed.implementation.models.BlobChangefeedCursor
import com.azure.storage.blob.changefeed.implementation.models.SegmentCursor
import com.azure.storage.blob.changefeed.implementation.models.ShardCursor
import reactor.core.publisher.Flux
import reactor.test.StepVerifier
import spock.lang.Specification
import spock.lang.Unroll

import java.nio.ByteBuffer
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.time.OffsetDateTime

import static org.mockito.ArgumentMatchers.*
import static org.mockito.Mockito.*

class SegmentTest extends Specification {

    BlobContainerAsyncClient mockContainer
    BlobAsyncClient mockBlob
    ShardFactory mockShardFactory
    Shard mockShard0
    Shard mockShard1
    Shard mockShard2

    static String shardPath0 = 'log/00/2020/03/25/0200/'
    static String shardPath1 = 'log/01/2020/03/25/0200/'
    static String shardPath2 = 'log/02/2020/03/25/0200/'

    byte[] urlHash = MessageDigest.getInstance("MD5").digest('https://testaccount.blob.core.windows.net/$blobchangefeed'.getBytes(StandardCharsets.UTF_8))
    OffsetDateTime endTime = OffsetDateTime.MAX
    static String segmentPath = "idx/segments/2020/03/25/0200/meta.json"
    BlobChangefeedCursor cfCursor

    def setup() {
        mockContainer = mock(BlobContainerAsyncClient.class)
        mockBlob = mock(BlobAsyncClient.class)
        mockShardFactory = mock(ShardFactory.class)
        mockShard0 = mock(Shard.class)
        mockShard1 = mock(Shard.class)
        mockShard2 = mock(Shard.class)

        cfCursor = new BlobChangefeedCursor(urlHash, endTime).toSegmentCursor(segmentPath)

        when(mockContainer.getBlobAsyncClient(anyString()))
            .thenReturn(mockBlob)

        when(mockBlob.download())
            .thenReturn(MockedChangefeedResources.readFile("segment_manifest.json", getClass()))

        when(mockShardFactory.getShard(eq(shardPath0), any(BlobChangefeedCursor.class), nullable(ShardCursor.class)))
            .thenReturn(mockShard0)
        when(mockShardFactory.getShard(eq(shardPath1), any(BlobChangefeedCursor.class), nullable(ShardCursor.class)))
            .thenReturn(mockShard1)
        when(mockShardFactory.getShard(eq(shardPath2), any(BlobChangefeedCursor.class), nullable(ShardCursor.class)))
            .thenReturn(mockShard2)

        when(mockShard0.getEvents())
            .thenReturn(Flux.fromIterable(getMockEventWrappers(shardPath0)))
        when(mockShard1.getEvents())
            .thenReturn(Flux.fromIterable(getMockEventWrappers(shardPath1)))
        when(mockShard2.getEvents())
            .thenReturn(Flux.fromIterable(getMockEventWrappers(shardPath2)))
    }

    List<BlobChangefeedEventWrapper> getMockEventWrappers(String shardPath) {
        List<BlobChangefeedEventWrapper> mockEventWrappers = new LinkedList<>()
        mockEventWrappers.add(new BlobChangefeedEventWrapper(MockedChangefeedResources.getMockBlobChangefeedEvent(0), cfCursor.toShardCursor(shardPath)))
        mockEventWrappers.add(new BlobChangefeedEventWrapper(MockedChangefeedResources.getMockBlobChangefeedEvent(1), cfCursor.toShardCursor(shardPath)))
        mockEventWrappers.add(new BlobChangefeedEventWrapper(MockedChangefeedResources.getMockBlobChangefeedEvent(2), cfCursor.toShardCursor(shardPath)))
        return mockEventWrappers
    }

    def "getEvents min"() {
        when:
        SegmentFactory segmentFactory = new SegmentFactory(mockShardFactory, mockContainer)
        Segment segment = segmentFactory.getSegment(segmentPath, cfCursor, null)

        def sv = StepVerifier.create(segment.getEvents().index())

        then:
        sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
            .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
            .verifyComplete()

        verify(mockContainer).getBlobAsyncClient(segmentPath) || true
        verify(mockBlob).download() || true
        verify(mockShardFactory).getShard(shardPath0, cfCursor.toShardCursor(shardPath0), null) || true
        verify(mockShardFactory).getShard(shardPath1, cfCursor.toShardCursor(shardPath1), null) || true
        verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), null) || true
        verify(mockShard0).getEvents() || true
        verify(mockShard1).getEvents() || true
        verify(mockShard2).getEvents() || true
    }

    /* All we want to test here is that we only call chunk.getEvents if it is equal to or after the shard of interest. */
//    @Unroll
//    def "getEvents cursors"() {
//        when:
//        SegmentCursor userCursor = new SegmentCursor(segmentPath).toShardCursor(shardPath)
//        SegmentFactory segmentFactory = new SegmentFactory(mockShardFactory, mockContainer)
//        Segment segment = segmentFactory.getSegment(segmentPath, cfCursor, userCursor)
//
//        def sv = StepVerifier.create(segment.getEvents().index())
//
//        then:
//        if (shardPath == shardPath0) {
//            sv = sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0) })
//                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0) })
//                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0) })
//        }
//        if (shardPath == shardPath0 || shardPath == shardPath1) {
//            sv = sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
//                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
//                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
//
//        }
//        if (shardPath == shardPath0 || shardPath == shardPath1 || shardPath == shardPath2) {
//            sv = sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
//                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
//                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
//        }
//        sv.verifyComplete()
//
//
//        verify(mockContainer).getBlobAsyncClient(segmentPath) || true
//        verify(mockBlob).download() || true
//
//        if (shardPath == shardPath0) {
//            verify(mockShardFactory).getShard(shardPath0, cfCursor.toShardCursor(shardPath0), userCursor.getShardCursors().get(0)) || true
//            verify(mockShard0).getEvents() || true
//            verify(mockShardFactory).getShard(shardPath1, cfCursor.toShardCursor(shardPath1), null) || true
//            verify(mockShard1).getEvents() || true
//            verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), null) || true
//            verify(mockShard2).getEvents() || true
//        }
//        if (shardPath == shardPath1) {
//            verify(mockShardFactory).getShard(shardPath1, cfCursor.toShardCursor(shardPath1), userCursor.getShardCursors().get(0)) || true
//            verify(mockShard1).getEvents() || true
//            verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), null) || true
//            verify(mockShard2).getEvents() || true
//        }
//        if (shardPath == shardPath2) {
//            verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), userCursor.getShardCursors().get(0)) || true
//            verify(mockShard2).getEvents() || true
//        }
//
//        where:
//        shardPath                   || _
//        shardPath0   || _
//        shardPath1   || _
//        shardPath2   || _
//    }

    @Unroll
    def "getEvents cursor"() {
        when:
        SegmentFactory segmentFactory = new SegmentFactory(mockShardFactory, mockContainer)
        Segment segment = segmentFactory.getSegment(segmentPath, cfCursor, userCursor)

        def sv = StepVerifier.create(segment.getEvents().index())

        then:
        if (caseNumber == 1) {
            sv = sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0) })
                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0) })
                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath0) })
        }
        if (caseNumber == 1) {
            sv = sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})
                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath1)})

        }
        if (caseNumber == 1) {
            sv = sv.expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
                .expectNextMatches({ tuple2 -> verifyWrapper(tuple2.getT2(), tuple2.getT1(), shardPath2)})
        }
        sv.verifyComplete()


        verify(mockContainer).getBlobAsyncClient(segmentPath) || true
        verify(mockBlob).download() || true

        if (caseNumber == 1) {
            verify(mockShardFactory).getShard(shardPath0, cfCursor.toShardCursor(shardPath0), new ShardCursor(shardPath0 + "00000.avro", 1257, 84)) || true
            verify(mockShard0).getEvents() || true
            verify(mockShardFactory).getShard(shardPath1, cfCursor.toShardCursor(shardPath1), null) || true
            verify(mockShard1).getEvents() || true
            verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), null) || true
            verify(mockShard2).getEvents() || true
        }
//        if (caseNumber == 1) {
//            verify(mockShardFactory).getShard(shardPath1, cfCursor.toShardCursor(shardPath1), userCursor.getShardCursors().get(0)) || true
//            verify(mockShard1).getEvents() || true
//            verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), null) || true
//            verify(mockShard2).getEvents() || true
//        }
//        if (caseNumber == 1) {
//            verify(mockShardFactory).getShard(shardPath2, cfCursor.toShardCursor(shardPath2), userCursor.getShardCursors().get(0)) || true
//            verify(mockShard2).getEvents() || true
//        }

        where:
        caseNumber | userCursor                                                                                                  || _
        1          | new SegmentCursor(segmentPath).toShardCursor(shardPath0).toEventCursor(shardPath0 + "00000.avro", 1257, 84) || _  /* shard 0 should */
//        2
//        3
//        4
    }

    def "segment metadata error"() {
        setup:
        when(mockBlob.download())
            .thenReturn(Flux.just(ByteBuffer.wrap("not json metadata".getBytes())))

        when:
        SegmentFactory segmentFactory = new SegmentFactory(mockShardFactory, mockContainer)
        Segment segment = segmentFactory.getSegment(segmentPath, cfCursor, null)

        def sv = StepVerifier.create(segment.getEvents())

        then:
        sv.verifyError(UncheckedIOException.class)

        verify(mockContainer).getBlobAsyncClient(segmentPath) || true
        verify(mockBlob).download() || true
    }

    boolean verifyWrapper(BlobChangefeedEventWrapper wrapper, long index, String shardPath) {
        boolean verify = true
        verify &= wrapper.getEvent().equals(MockedChangefeedResources.getMockBlobChangefeedEvent(index%3 as int))
        verify &= wrapper.getCursor().getCurrentSegmentCursor().getCurrentShardPath() == shardPath
        return verify
    }
}
